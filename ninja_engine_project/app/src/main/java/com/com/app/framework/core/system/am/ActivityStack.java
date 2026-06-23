package com.app.framework.core.system.am;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.BProcessManagerService;
import com.app.framework.core.system.ProcessRecord;
import com.app.framework.proxy.ProxyActivity;
import com.app.framework.proxy.record.ProxyActivityRecord;
import com.app.framework.utils.ComponentUtils;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1878ooOoOO0O;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public class ActivityStack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int LAUNCH_TIME_OUT = 0;
    public static final String TAG = "ActivityStack";
    private final Map<Integer, TaskRecord> mTasks = new LinkedHashMap();
    private final Set<ActivityRecord> mLaunchingActivities = new HashSet();
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.app.framework.core.system.am.ActivityStack.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ActivityRecord activityRecord;
            if (message.what == 0 && (activityRecord = (ActivityRecord) message.obj) != null) {
                ActivityStack.this.mLaunchingActivities.remove(activityRecord);
            }
        }
    };
    private final ActivityManager mAms = (ActivityManager) BlackBoxCore.getContext().getSystemService("activity");

    private void deliverNewIntentLocked(ActivityRecord activityRecord, Intent intent) {
        try {
            activityRecord.processRecord.bActivityThread.handleNewIntent(activityRecord.token, intent);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private ActivityRecord findActivityRecordByComponentName(int i, ComponentName componentName) {
        ActivityRecord activityRecord = null;
        for (TaskRecord taskRecord : this.mTasks.values()) {
            if (i == taskRecord.userId) {
                Iterator<ActivityRecord> it = taskRecord.activities.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ActivityRecord next = it.next();
                        if (next.component.equals(componentName)) {
                            activityRecord = next;
                            break;
                        }
                    }
                }
            }
        }
        return activityRecord;
    }

    private ActivityRecord findActivityRecordByToken(int i, IBinder iBinder) {
        ActivityRecord activityRecord = null;
        if (iBinder != null) {
            for (TaskRecord taskRecord : this.mTasks.values()) {
                if (i == taskRecord.userId) {
                    Iterator<ActivityRecord> it = taskRecord.activities.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ActivityRecord next = it.next();
                            if (next.token == iBinder) {
                                activityRecord = next;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return activityRecord;
    }

    private TaskRecord findTaskRecordByTaskAffinityLocked(int i, String str) {
        synchronized (this.mTasks) {
            try {
                for (TaskRecord taskRecord : this.mTasks.values()) {
                    if (i == taskRecord.userId && taskRecord.taskAffinity.equals(str)) {
                        return taskRecord;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private TaskRecord findTaskRecordByTokenLocked(int i, IBinder iBinder) {
        synchronized (this.mTasks) {
            try {
                for (TaskRecord taskRecord : this.mTasks.values()) {
                    if (i == taskRecord.userId) {
                        for (ActivityRecord activityRecord : taskRecord.activities) {
                            if (activityRecord.token == iBinder) {
                                return taskRecord;
                            }
                        }
                        continue;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void finishAllActivity(int i) {
        for (TaskRecord taskRecord : this.mTasks.values()) {
            for (ActivityRecord activityRecord : taskRecord.activities) {
                if (activityRecord.userId == i && activityRecord.finished) {
                    try {
                        activityRecord.processRecord.bActivityThread.finishActivity(activityRecord.token);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent getStartStubActivityIntentInner(android.content.Intent r5, int r6, int r7, com.app.framework.proxy.record.ProxyActivityRecord r8, android.content.pm.ActivityInfo r9) {
        /*
            r4 = this;
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r0 = 0
            android.content.Context r1 = com.app.framework.BlackBoxCore.getContext()     // Catch: java.lang.Throwable -> L4a
            android.content.pm.ApplicationInfo r2 = r9.applicationInfo     // Catch: java.lang.Throwable -> L4a
            android.content.res.Resources r1 = com.app.framework.core.system.pm.PackageManagerCompat.getResources(r1, r2)     // Catch: java.lang.Throwable -> L4a
            int r2 = r9.theme     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L15
            goto L19
        L15:
            android.content.pm.ApplicationInfo r2 = r9.applicationInfo     // Catch: java.lang.Throwable -> L4a
            int r2 = r2.theme     // Catch: java.lang.Throwable -> L4a
        L19:
            android.content.res.Resources$Theme r1 = r1.newTheme()     // Catch: java.lang.Throwable -> L4a
            com.ninja.engine.ooOOooO r3 = com.ninja.engine.AbstractC0694o0ooooo0.OooO0O0()     // Catch: java.lang.Throwable -> L4a
            int[] r3 = r3.Window()     // Catch: java.lang.Throwable -> L4a
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3)     // Catch: java.lang.Throwable -> L4a
            com.ninja.engine.ooOOooO r1 = com.ninja.engine.AbstractC0694o0ooooo0.OooO0O0()     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r1 = r1.Window_windowIsTranslucent()     // Catch: java.lang.Throwable -> L4a
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L4c
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = com.app.framework.BlackBoxCore.getHostPkg()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = com.app.framework.proxy.ProxyManifest.TransparentProxyActivity(r6)     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4a
            goto L59
        L4a:
            r9 = move-exception
            goto L63
        L4c:
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = com.app.framework.BlackBoxCore.getHostPkg()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = com.app.framework.proxy.ProxyManifest.getProxyActivity(r6)     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4a
        L59:
            r7.setComponent(r1)     // Catch: java.lang.Throwable -> L4a
            r9.toString()     // Catch: java.lang.Throwable -> L4a
        L5f:
            r0.recycle()
            goto L79
        L63:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L83
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = com.app.framework.BlackBoxCore.getHostPkg()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = com.app.framework.proxy.ProxyManifest.getProxyActivity(r6)     // Catch: java.lang.Throwable -> L83
            r9.<init>(r1, r6)     // Catch: java.lang.Throwable -> L83
            r7.setComponent(r9)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L79
            goto L5f
        L79:
            android.content.pm.ActivityInfo r6 = r8.mActivityInfo
            android.os.IBinder r9 = r8.mActivityRecord
            int r8 = r8.mUserId
            com.app.framework.proxy.record.ProxyActivityRecord.saveStub(r7, r5, r6, r9, r8)
            return r7
        L83:
            r5 = move-exception
            if (r0 == 0) goto L89
            r0.recycle()
        L89:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.core.system.am.ActivityStack.getStartStubActivityIntentInner(android.content.Intent, int, int, com.app.framework.proxy.record.ProxyActivityRecord, android.content.pm.ActivityInfo):android.content.Intent");
    }

    private ActivityRecord getTopActivityRecord() {
        synchronized (this.mTasks) {
            synchronizeTasks();
        }
        LinkedList linkedList = new LinkedList(this.mTasks.values());
        if (linkedList.isEmpty()) {
            return null;
        }
        return ((TaskRecord) linkedList.get(linkedList.size() - 1)).getTopActivityRecord();
    }

    private int realStartActivityLocked(IInterface iInterface, Intent intent, String str, IBinder iBinder, String str2, int i, int i2, Bundle bundle) {
        try {
            ((InterfaceC1878ooOoOO0O) C0217o00o0oO0.create(InterfaceC1878ooOoOO0O.class, AbstractC0809oO0OooOO.OooO00o().getDefault(), false)).startActivity(iInterface, BlackBoxCore.getHostPkg(), intent, str, iBinder, str2, i, i2 & (-15), null, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    private int startActivityInNewTaskLocked(int i, Intent intent, ActivityInfo activityInfo, IBinder iBinder, int i2) {
        Intent startActivityProcess = startActivityProcess(i, intent, activityInfo, newActivityRecord(intent, activityInfo, iBinder, i));
        startActivityProcess.addFlags(134217728);
        startActivityProcess.addFlags(524288);
        startActivityProcess.addFlags(268435456);
        startActivityProcess.addFlags(i2);
        BlackBoxCore.getContext().startActivity(startActivityProcess);
        return 0;
    }

    private int startActivityInSourceTask(Intent intent, String str, IBinder iBinder, String str2, int i, int i2, Bundle bundle, int i3, ActivityRecord activityRecord, ActivityInfo activityInfo, int i4) {
        Intent startActivityProcess = startActivityProcess(i3, intent, activityInfo, newActivityRecord(intent, activityInfo, iBinder, i3));
        startActivityProcess.setAction(UUID.randomUUID().toString());
        startActivityProcess.addFlags(i4);
        if (iBinder == null) {
            startActivityProcess.addFlags(268435456);
        }
        return realStartActivityLocked(activityRecord.processRecord.appThread, startActivityProcess, str, iBinder, str2, i, i2, bundle);
    }

    private Intent startActivityProcess(int i, Intent intent, ActivityInfo activityInfo, ActivityRecord activityRecord) {
        ProxyActivityRecord proxyActivityRecord = new ProxyActivityRecord(i, activityInfo, intent, activityRecord);
        ProcessRecord startProcessLocked = BProcessManagerService.get().startProcessLocked(activityInfo.packageName, activityInfo.processName, i, -1, Binder.getCallingPid());
        if (startProcessLocked != null) {
            return getStartStubActivityIntentInner(intent, startProcessLocked.bpid, i, proxyActivityRecord, activityInfo);
        }
        throw new RuntimeException("Unable to create process, name:" + activityInfo.name);
    }

    private void synchronizeTasks() {
        List<ActivityManager.RecentTaskInfo> recentTasks = this.mAms.getRecentTasks(100, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int size = recentTasks.size() - 1; size >= 0; size--) {
            ActivityManager.RecentTaskInfo recentTaskInfo = recentTasks.get(size);
            TaskRecord taskRecord = this.mTasks.get(Integer.valueOf(recentTaskInfo.id));
            if (taskRecord != null) {
                linkedHashMap.put(Integer.valueOf(recentTaskInfo.id), taskRecord);
            }
        }
        this.mTasks.clear();
        this.mTasks.putAll(linkedHashMap);
    }

    public boolean containsFlag(Intent intent, int i) {
        return (intent.getFlags() & i) != 0;
    }

    public ComponentName getCallingActivity(IBinder iBinder, int i) {
        ActivityRecord findActivityRecordByToken;
        synchronized (this.mTasks) {
            try {
                synchronizeTasks();
                ActivityRecord findActivityRecordByToken2 = findActivityRecordByToken(i, iBinder);
                return (findActivityRecordByToken2 == null || (findActivityRecordByToken = findActivityRecordByToken(i, findActivityRecordByToken2.resultTo)) == null) ? new ComponentName(BlackBoxCore.getHostPkg(), ProxyActivity.P0.class.getName()) : findActivityRecordByToken.component;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getCallingPackage(IBinder iBinder, int i) {
        ActivityRecord findActivityRecordByToken;
        synchronized (this.mTasks) {
            try {
                synchronizeTasks();
                ActivityRecord findActivityRecordByToken2 = findActivityRecordByToken(i, iBinder);
                return (findActivityRecordByToken2 == null || (findActivityRecordByToken = findActivityRecordByToken(i, findActivityRecordByToken2.resultTo)) == null) ? BlackBoxCore.getHostPkg() : findActivityRecordByToken.info.packageName;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ActivityRecord newActivityRecord(Intent intent, ActivityInfo activityInfo, IBinder iBinder, int i) {
        ActivityRecord create = ActivityRecord.create(intent, activityInfo, iBinder, i);
        synchronized (this.mLaunchingActivities) {
            this.mLaunchingActivities.add(create);
            this.mHandler.sendMessageDelayed(Message.obtain(this.mHandler, 0, create), 2000L);
        }
        return create;
    }

    public void onActivityCreated(ProcessRecord processRecord, int i, IBinder iBinder, ActivityRecord activityRecord) {
        synchronized (this.mLaunchingActivities) {
            this.mLaunchingActivities.remove(activityRecord);
            this.mHandler.removeMessages(0, activityRecord);
        }
        synchronized (this.mTasks) {
            try {
                synchronizeTasks();
                TaskRecord taskRecord = this.mTasks.get(Integer.valueOf(i));
                if (taskRecord == null) {
                    taskRecord = new TaskRecord(i, activityRecord.userId, ComponentUtils.getTaskAffinity(activityRecord.info));
                    taskRecord.rootIntent = activityRecord.intent;
                    this.mTasks.put(Integer.valueOf(i), taskRecord);
                }
                activityRecord.token = iBinder;
                activityRecord.processRecord = processRecord;
                activityRecord.task = taskRecord;
                taskRecord.addTopActivity(activityRecord);
                activityRecord.component.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onActivityDestroyed(int i, IBinder iBinder) {
        synchronized (this.mTasks) {
            try {
                synchronizeTasks();
                ActivityRecord findActivityRecordByToken = findActivityRecordByToken(i, iBinder);
                if (findActivityRecordByToken == null) {
                    return;
                }
                findActivityRecordByToken.finished = true;
                findActivityRecordByToken.component.toString();
                findActivityRecordByToken.task.removeActivity(findActivityRecordByToken);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onActivityResumed(int i, IBinder iBinder) {
        synchronized (this.mTasks) {
            try {
                synchronizeTasks();
                ActivityRecord findActivityRecordByToken = findActivityRecordByToken(i, iBinder);
                if (findActivityRecordByToken == null) {
                    return;
                }
                findActivityRecordByToken.component.toString();
                findActivityRecordByToken.task.removeActivity(findActivityRecordByToken);
                findActivityRecordByToken.task.addTopActivity(findActivityRecordByToken);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onFinishActivity(int i, IBinder iBinder) {
        synchronized (this.mTasks) {
            try {
                synchronizeTasks();
                ActivityRecord findActivityRecordByToken = findActivityRecordByToken(i, iBinder);
                if (findActivityRecordByToken == null) {
                    return;
                }
                findActivityRecordByToken.finished = true;
                findActivityRecordByToken.component.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int startActivitiesLocked(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        if (intentArr != null) {
            if (strArr != null) {
                if (intentArr.length == strArr.length) {
                    for (int i2 = 0; i2 < intentArr.length; i2++) {
                        startActivityLocked(i, intentArr[i2], strArr[i2], iBinder, null, -1, 0, bundle);
                    }
                    return 0;
                }
                throw new IllegalArgumentException("intents are length different than resolvedTypes");
            }
            throw new NullPointerException("resolvedTypes is null");
        }
        throw new NullPointerException("intents is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0194 A[LOOP:3: B:122:0x018e->B:124:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int startActivityLocked(int r21, android.content.Intent r22, java.lang.String r23, android.os.IBinder r24, java.lang.String r25, int r26, int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.core.system.am.ActivityStack.startActivityLocked(int, android.content.Intent, java.lang.String, android.os.IBinder, java.lang.String, int, int, android.os.Bundle):int");
    }
}
