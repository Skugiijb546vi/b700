package com.app.framework.fake.service;

import android.app.ActivityManager;
import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.GmsCore;
import com.app.framework.core.env.AppSystemEnv;
import com.app.framework.entity.am.RunningAppProcessInfo;
import com.app.framework.entity.am.RunningServiceInfo;
import com.app.framework.fake.delegate.InnerReceiverDelegate;
import com.app.framework.fake.delegate.ServiceConnectionDelegate;
import com.app.framework.fake.frameworks.BActivityManager;
import com.app.framework.fake.frameworks.BPackageManager;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.hook.ScanClass;
import com.app.framework.fake.service.base.PkgMethodProxy;
import com.app.framework.proxy.ProxyManifest;
import com.app.framework.proxy.record.ProxyBroadcastRecord;
import com.app.framework.proxy.record.ProxyPendingRecord;
import com.app.framework.utils.MethodParameterUtils;
import com.app.framework.utils.compat.BuildCompat;
import com.app.framework.utils.compat.ParceledListSliceCompat;
import com.app.framework.utils.compat.TaskDescriptionCompat;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0174o00OoOoO;
import com.ninja.engine.InterfaceC0443o0OoOO;
import com.ninja.engine.InterfaceC0527o0o0O00;
import com.ninja.engine.InterfaceC1410oo00Oo0O;
import com.ninja.engine.InterfaceC1713ooO0o00O;
import com.ninja.engine.InterfaceC1918ooOooOo;
import com.ninja.engine.OooOO0O;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@ScanClass({ActivityManagerCommonProxy.class})
/* loaded from: classes.dex */
public class IActivityManagerProxy extends ClassInvocationStub {
    public static final String TAG = "ActivityManagerStub";
    private static final Set<String> THREAT_EVENT_ACTIONS = new HashSet(Arrays.asList("HookFrameworkDetected", "IllegalDisplayEvent", "IllegalAccessibilityServiceEvent", "FridaDetected", "FridaCustomDetected", "MagiskManagerDetected", "RootedDevice", "UnknownSourcesEnabled", "DetectUnlockedBootloader", "OverlayDetected", "DeveloperOptionsEnabled", "ActiveADBDetected", "RuntimeBundleValidationViolation"));

    @ProxyMethod("bindIsolatedService")
    /* loaded from: classes.dex */
    public static class BindIsolatedService extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[6] = null;
            return IActivityManagerProxy.BindServiceCommon(obj, method, objArr, 7);
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public boolean isEnable() {
            return BlackBoxCore.get().isBlackProcess() || BlackBoxCore.get().isServerProcess();
        }
    }

    @ProxyMethod("bindService")
    /* loaded from: classes.dex */
    public static class BindService extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return IActivityManagerProxy.BindServiceCommon(obj, method, objArr, 6);
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public boolean isEnable() {
            return BlackBoxCore.get().isBlackProcess() || BlackBoxCore.get().isServerProcess();
        }
    }

    @ProxyMethod("broadcastIntent")
    /* loaded from: classes.dex */
    public static class BroadcastIntent extends MethodHook {
        public int getIntentIndex(Object[] objArr) {
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof Intent) {
                    return i;
                }
            }
            return 1;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intentIndex = getIntentIndex(objArr);
            Intent intent = (Intent) objArr[intentIndex];
            if (intent != null && intent.getAction() != null && IActivityManagerProxy.THREAT_EVENT_ACTIONS.contains(intent.getAction())) {
                intent.getAction();
                return 0;
            }
            Intent sendBroadcast = BlackBoxCore.getBActivityManager().sendBroadcast(intent, (String) objArr[intentIndex + 1], BActivityThread.getUserId());
            if (sendBroadcast != null) {
                sendBroadcast.setExtrasClassLoader(BActivityThread.getApplication().getClassLoader());
                ProxyBroadcastRecord.saveStub(sendBroadcast, intent, BActivityThread.getUserId());
                objArr[intentIndex] = sendBroadcast;
            }
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof String[]) {
                    objArr[i] = null;
                }
            }
            if (objArr.length > 0) {
                int length = objArr.length - 1;
                Object obj2 = objArr[length];
                if ((obj2 instanceof Integer) && ((Integer) obj2).intValue() == -1) {
                    objArr[length] = 0;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("broadcastIntentWithFeature")
    /* loaded from: classes.dex */
    public static class BroadcastIntentWithFeature extends BroadcastIntent {
    }

    @ProxyMethod("getContentProvider")
    /* loaded from: classes.dex */
    public static class GetContentProvider extends MethodHook {
        private static boolean isGmsAuthority(String str) {
            if (str == null) {
                return false;
            }
            return str.startsWith("com.google.android.gms.") || str.equals(GmsCore.GSF_PKG) || str.startsWith("com.google.android.gsf.") || str.equals("com.google.settings");
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.app.framework.fake.hook.MethodHook
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object hook(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = r7.length     // Catch: java.lang.Exception -> Le
                r2 = 2
                if (r1 <= r2) goto L10
                r1 = r7[r2]     // Catch: java.lang.Exception -> Le
                boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> Le
                if (r3 == 0) goto L10
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Le
                goto L12
            Le:
                r5 = move-exception
                goto L32
            L10:
                java.lang.String r1 = "unknown"
            L12:
                int r3 = r7.length     // Catch: java.lang.Exception -> Le
                if (r3 <= r2) goto L22
                r2 = 1
                r3 = r7[r2]     // Catch: java.lang.Exception -> Le
                boolean r3 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> Le
                if (r3 == 0) goto L22
                java.lang.String r3 = com.app.framework.BlackBoxCore.getHostPkg()     // Catch: java.lang.Exception -> Le
                r7[r2] = r3     // Catch: java.lang.Exception -> Le
            L22:
                java.lang.Object r5 = r6.invoke(r5, r7)     // Catch: java.lang.Exception -> Le
                if (r5 == 0) goto L31
                com.app.framework.fake.delegate.ContentProviderDelegate.update(r5, r1)     // Catch: java.lang.Exception -> L2c
                goto L30
            L2c:
                r6 = move-exception
                r6.getMessage()     // Catch: java.lang.Exception -> Le
            L30:
                return r5
            L31:
                return r0
            L32:
                r5.getMessage()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.service.IActivityManagerProxy.GetContentProvider.hook(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    @ProxyMethod("getIntentSender")
    /* loaded from: classes.dex */
    public static class GetIntentSender extends MethodHook {
        private int getIntentsIndex(Object[] objArr) {
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof Intent[]) {
                    return i;
                }
            }
            return BuildCompat.isR() ? 6 : 5;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[0]).intValue();
            Intent[] intentArr = (Intent[]) objArr[getIntentsIndex(objArr)];
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            for (int i = 0; i < intentArr.length; i++) {
                Intent intent = intentArr[i];
                if (intValue == 2) {
                    Intent intent2 = new Intent();
                    intent2.setComponent(new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.getProxyPendingActivity(BActivityThread.getAppPid())));
                    ProxyPendingRecord.saveStub(intent2, intent, BActivityThread.getUserId());
                    intentArr[i] = intent2;
                }
            }
            IInterface iInterface = (IInterface) method.invoke(obj, objArr);
            if (iInterface != null) {
                String[] packagesForUid = BPackageManager.get().getPackagesForUid(BActivityThread.getCallingBUid());
                if (packagesForUid.length < 1) {
                    packagesForUid = new String[]{BlackBoxCore.getHostPkg()};
                }
                BlackBoxCore.getBActivityManager().getIntentSender(iInterface.asBinder(), packagesForUid[0], BActivityThread.getCallingBUid());
            }
            return iInterface;
        }
    }

    @ProxyMethod("getIntentSenderWithFeature")
    /* loaded from: classes.dex */
    public static class GetIntentSenderWithFeature extends GetIntentSender {
    }

    @ProxyMethod("getIntentSenderWithSourceToken")
    /* loaded from: classes.dex */
    public static class GetIntentSenderWithSourceToken extends GetIntentSender {
    }

    @ProxyMethod("getRunningAppProcesses")
    /* loaded from: classes.dex */
    public static class GetRunningAppProcesses extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            RunningAppProcessInfo runningAppProcesses = BActivityManager.get().getRunningAppProcesses(BActivityThread.getAppPackageName(), BActivityThread.getUserId());
            return runningAppProcesses == null ? new ArrayList() : runningAppProcesses.mAppProcessInfoList;
        }
    }

    @ProxyMethod("getServices")
    /* loaded from: classes.dex */
    public static class GetServices extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            RunningServiceInfo runningServices = BActivityManager.get().getRunningServices(BActivityThread.getAppPackageName(), BActivityThread.getUserId());
            return runningServices == null ? new ArrayList() : runningServices.mRunningServiceInfoList;
        }
    }

    @ProxyMethod("grantUriPermission")
    /* loaded from: classes.dex */
    public static class GrantUriPermission extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastUid(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("peekService")
    /* loaded from: classes.dex */
    public static class PeekService extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastAppPkg(objArr);
            return BlackBoxCore.getBActivityManager().peekService((Intent) objArr[0], (String) objArr[1], BActivityThread.getUserId());
        }
    }

    @ProxyMethod("publishService")
    /* loaded from: classes.dex */
    public static class PublishService extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerReceiver")
    /* loaded from: classes.dex */
    public static class RegisterReceiver extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (IActivityManagerProxy.isThreatEventFilter(objArr, 3)) {
                IntentFilter intentFilter = (IntentFilter) objArr[3];
                if (intentFilter.countActions() > 0) {
                    intentFilter.getAction(0);
                }
                return null;
            }
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            Object obj2 = objArr[2];
            if (obj2 != null) {
                IIntentReceiver iIntentReceiver = (IIntentReceiver) obj2;
                IIntentReceiver createProxy = InnerReceiverDelegate.createProxy(iIntentReceiver);
                WeakReference<?> mDispatcher = ((InterfaceC0174o00OoOoO) C0217o00o0oO0.create(InterfaceC0174o00OoOoO.class, iIntentReceiver, false)).mDispatcher();
                if (mDispatcher != null) {
                    ((OooOO0O) C0217o00o0oO0.create(OooOO0O.class, mDispatcher.get(), false))._set_mIIntentReceiver(createProxy);
                }
                objArr[2] = createProxy;
            }
            if (objArr[4] != null) {
                objArr[4] = null;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerReceiverWithFeature")
    /* loaded from: classes.dex */
    public static class RegisterReceiverWithFeature extends MethodHook {
        public int getPermissionIndex() {
            return BuildCompat.isS() ? 6 : 5;
        }

        public int getReceiverIndex() {
            return BuildCompat.isS() ? 4 : 3;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int receiverIndex = getReceiverIndex() + 1;
            if (IActivityManagerProxy.isThreatEventFilter(objArr, receiverIndex)) {
                IntentFilter intentFilter = (IntentFilter) objArr[receiverIndex];
                if (intentFilter.countActions() > 0) {
                    intentFilter.getAction(0);
                }
                return null;
            }
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            int receiverIndex2 = getReceiverIndex();
            Object obj2 = objArr[receiverIndex2];
            if (obj2 != null) {
                IIntentReceiver iIntentReceiver = (IIntentReceiver) obj2;
                IIntentReceiver createProxy = InnerReceiverDelegate.createProxy(iIntentReceiver);
                WeakReference<?> mDispatcher = ((InterfaceC0174o00OoOoO) C0217o00o0oO0.create(InterfaceC0174o00OoOoO.class, iIntentReceiver, false)).mDispatcher();
                if (mDispatcher != null) {
                    ((OooOO0O) C0217o00o0oO0.create(OooOO0O.class, mDispatcher.get(), false))._set_mIIntentReceiver(createProxy);
                }
                objArr[receiverIndex2] = createProxy;
            }
            if (objArr[getPermissionIndex()] != null) {
                objArr[getPermissionIndex()] = null;
            }
            if (BuildCompat.isU()) {
                int length = objArr.length - 1;
                int intValue = ((Integer) objArr[length]).intValue();
                if ((intValue & 4) == 0 && (intValue & 2) == 0) {
                    intValue |= 4;
                }
                objArr[length] = Integer.valueOf(intValue);
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("sendIntentSender")
    /* loaded from: classes.dex */
    public static class SendIntentSender extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("setActivityLocusContext")
    /* loaded from: classes.dex */
    public static class SetActivityLocusContext extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length >= 2) {
                        String str = (String) objArr[1];
                        String appPackageName = BActivityThread.getAppPackageName();
                        if (str != null && !str.equals(appPackageName)) {
                            return null;
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setTaskDescription")
    /* loaded from: classes.dex */
    public static class SetTaskDescription extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[1] = TaskDescriptionCompat.fix((ActivityManager.TaskDescription) objArr[1]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("startService")
    /* loaded from: classes.dex */
    public static class StartService extends MethodHook {
        public int getRequireForeground() {
            return BuildCompat.isOreo() ? 3 : -1;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Intent intent = (Intent) objArr[1];
            String str = (String) objArr[2];
            if (BlackBoxCore.getBPackageManager().resolveService(intent, 0, str, BActivityThread.getUserId()) == null) {
                return method.invoke(obj, objArr);
            }
            int requireForeground = getRequireForeground();
            return BlackBoxCore.getBActivityManager().startService(intent, str, requireForeground != -1 ? ((Boolean) objArr[requireForeground]).booleanValue() : false, BActivityThread.getUserId());
        }
    }

    @ProxyMethod("stopService")
    /* loaded from: classes.dex */
    public static class StopService extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Intent intent = (Intent) objArr[1];
                return (intent == null || intent.getComponent() == null || intent.getComponent().getPackageName().equals(BActivityThread.getAppPackageName())) ? Integer.valueOf(BlackBoxCore.getBActivityManager().stopService(intent, (String) objArr[2], BActivityThread.getUserId())) : Boolean.FALSE;
            } catch (SecurityException unused) {
                return Boolean.FALSE;
            } catch (Exception unused2) {
                return Boolean.FALSE;
            }
        }
    }

    @ProxyMethod("stopServiceToken")
    /* loaded from: classes.dex */
    public static class StopServiceToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                ComponentName componentName = (ComponentName) objArr[0];
                IBinder iBinder = (IBinder) objArr[1];
                if (componentName == null || componentName.getPackageName().equals(BActivityThread.getAppPackageName())) {
                    BlackBoxCore.getBActivityManager().stopServiceToken(componentName, iBinder, BActivityThread.getUserId());
                    return Boolean.TRUE;
                }
                return Boolean.TRUE;
            } catch (SecurityException unused) {
                return Boolean.TRUE;
            } catch (Exception unused2) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("unbindService")
    /* loaded from: classes.dex */
    public static class UnbindService extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            IServiceConnection iServiceConnection = (IServiceConnection) objArr[0];
            if (iServiceConnection == null) {
                return method.invoke(obj, objArr);
            }
            BlackBoxCore.getBActivityManager().unbindService(iServiceConnection.asBinder(), BActivityThread.getUserId());
            ServiceConnectionDelegate delegate = ServiceConnectionDelegate.getDelegate(iServiceConnection.asBinder());
            if (delegate != null) {
                objArr[0] = delegate;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("bindServiceInstance")
    /* loaded from: classes.dex */
    public static class bindServiceInstance extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return IActivityManagerProxy.BindServiceCommon(obj, method, objArr, 7);
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public boolean isEnable() {
            return BlackBoxCore.get().isBlackProcess() || BlackBoxCore.get().isServerProcess();
        }
    }

    @ProxyMethod("checkPermission")
    /* loaded from: classes.dex */
    public static class checkPermission extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastUid(objArr);
            String str = (String) objArr[0];
            if (str.equals("android.permission.ACCOUNT_MANAGER") || str.equals("android.permission.SEND_SMS") || IActivityManagerProxy.isAudioPermission(str) || IActivityManagerProxy.isStorageOrMediaPermission(str) || IActivityManagerProxy.isNetworkPermission(str)) {
                return 0;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("checkUriPermission")
    /* loaded from: classes.dex */
    public static class checkUriPermission extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("finishReceiver")
    /* loaded from: classes.dex */
    public static class finishReceiver extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getCurrentUser")
    /* loaded from: classes.dex */
    public static class getCurrentUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ((InterfaceC1713ooO0o00O) C0217o00o0oO0.create(InterfaceC1713ooO0o00O.class, null, false))._new(BActivityThread.getUserId(), "BlackBox", ((InterfaceC1713ooO0o00O) C0217o00o0oO0.create(InterfaceC1713ooO0o00O.class, null, false)).FLAG_PRIMARY().intValue());
        }
    }

    @ProxyMethod("getHistoricalProcessExitReasons")
    /* loaded from: classes.dex */
    public static class getHistoricalProcessExitReasons extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(new ArrayList());
        }
    }

    @ProxyMethod("getPackageForIntentSender")
    /* loaded from: classes.dex */
    public static class getPackageForIntentSender extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BlackBoxCore.getBActivityManager().getPackageForIntentSender(((IInterface) objArr[0]).asBinder());
        }
    }

    @ProxyMethod("getUidForIntentSender")
    /* loaded from: classes.dex */
    public static class getUidForIntentSender extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(BlackBoxCore.getBActivityManager().getUidForIntentSender(((IInterface) objArr[0]).asBinder()));
        }
    }

    @ProxyMethod("registerUidObserver")
    /* loaded from: classes.dex */
    public static class registerUidObserver extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("setRequestedOrientation")
    /* loaded from: classes.dex */
    public static class setRequestedOrientation extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable th) {
                th.printStackTrace();
                return 0;
            }
        }
    }

    @ProxyMethod("setServiceForeground")
    /* loaded from: classes.dex */
    public static class setServiceForeground extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int length = objArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (objArr[length] instanceof Integer) {
                    objArr[length] = 0;
                    break;
                } else {
                    length--;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("unregisterReceiver")
    /* loaded from: classes.dex */
    public static class unregisterReceiver extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("unregisterUidObserver")
    /* loaded from: classes.dex */
    public static class unregisterUidObserver extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("updateConfiguration")
    /* loaded from: classes.dex */
    public static class updateConfiguration extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public static Object BindServiceCommon(Object obj, Method method, Object[] objArr, int i) {
        int flagsIndex;
        try {
            Intent intent = (Intent) objArr[2];
            String str = (String) objArr[3];
            IServiceConnection iServiceConnection = (IServiceConnection) objArr[4];
            if (intent == null) {
                return method.invoke(obj, objArr);
            }
            String action = intent.getAction();
            ComponentName component = intent.getComponent();
            String className = component != null ? component.getClassName() : null;
            if ((action == null || (!"com.google.android.play.core.integrityservice.BIND_INTEGRITY_SERVICE".equals(action) && !"com.google.android.play.core.expressintegrityservice.BIND_EXPRESS_INTEGRITY_SERVICE".equals(action))) && (className == null || (!className.contains("IntegrityService") && !className.contains("IntegrityBroker")))) {
                boolean z = true;
                String lowerCase = action != null ? action.toLowerCase() : "";
                ComponentName component2 = intent.getComponent();
                String lowerCase2 = component2 != null ? component2.getClassName().toLowerCase() : "";
                if (!lowerCase.contains("games") && !lowerCase2.contains("games")) {
                    String str2 = intent.getPackage();
                    ComponentName component3 = intent.getComponent();
                    boolean z2 = (str2 != null && (str2.equals(GmsCore.GMS_PKG) || str2.equals(GmsCore.GSF_PKG) || str2.equals(GmsCore.VENDING_PKG) || str2.equals("com.google.android.play.games"))) || (component3 != null && component3.getPackageName().equals(GmsCore.GMS_PKG));
                    if (z2) {
                        intent.getAction();
                        Objects.toString(component3);
                    }
                    int intExtra = intent.getIntExtra("_B_|_UserId", -1);
                    if (intExtra == -1) {
                        intExtra = BActivityThread.getUserId();
                    }
                    ResolveInfo resolveService = BlackBoxCore.getBPackageManager().resolveService(intent, 0, str, intExtra);
                    if (!z2 || !AppSystemEnv.isGmsPackage(str2)) {
                        z = false;
                    }
                    if (resolveService != null || AppSystemEnv.isOpenPackage(intent.getComponent()) || z) {
                        Intent bindService = BlackBoxCore.getBActivityManager().bindService(intent, iServiceConnection != null ? iServiceConnection.asBinder() : null, str, intExtra);
                        if (z2) {
                            intent.getAction();
                            Objects.toString(component3);
                            if (bindService != null) {
                                bindService.toString();
                            }
                            if (resolveService != null) {
                                String str3 = resolveService.serviceInfo.name;
                            }
                        }
                        if (iServiceConnection != null) {
                            if (intent.getComponent() == null && resolveService != null) {
                                ServiceInfo serviceInfo = resolveService.serviceInfo;
                                intent.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                            }
                            IServiceConnection createProxy = ServiceConnectionDelegate.createProxy(iServiceConnection, intent);
                            objArr[4] = createProxy;
                            WeakReference<?> mDispatcher = ((InterfaceC0527o0o0O00) C0217o00o0oO0.create(InterfaceC0527o0o0O00.class, iServiceConnection, false)).mDispatcher();
                            if (mDispatcher != null) {
                                ((InterfaceC0443o0OoOO) C0217o00o0oO0.create(InterfaceC0443o0OoOO.class, mDispatcher.get(), false))._set_mConnection(createProxy);
                            }
                        }
                        if (bindService != null && bindService.getComponent() != null && bindService.getComponent().getPackageName().equals(BlackBoxCore.getHostPkg()) && (flagsIndex = getFlagsIndex(objArr)) >= 0) {
                            objArr[flagsIndex] = Integer.valueOf(MethodParameterUtils.toInt(objArr[flagsIndex]) & Integer.MAX_VALUE);
                        }
                        objArr[i] = BlackBoxCore.getHostPkg();
                        if (bindService != null) {
                            objArr[2] = bindService;
                            Object invoke = method.invoke(obj, objArr);
                            if (z2) {
                                intent.getAction();
                                Objects.toString(invoke);
                            }
                            return invoke;
                        } else if (z2) {
                            intent.getAction();
                        }
                    }
                    if (str2 != null && AppSystemEnv.isGmsPackage(str2)) {
                        objArr[i] = BlackBoxCore.getHostPkg();
                    }
                    return method.invoke(obj, objArr);
                }
                return 0;
            }
            Binder binder = new Binder() { // from class: com.app.framework.fake.service.IActivityManagerProxy.1
                @Override // android.os.Binder
                public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
                    throw new DeadObjectException("Integrity service unavailable in container");
                }
            };
            ComponentName componentName = new ComponentName(GmsCore.VENDING_PKG, "com.google.android.finsky.integrityservice.IntegrityService");
            try {
                try {
                    iServiceConnection.getClass().getMethod("connected", ComponentName.class, IBinder.class, Boolean.TYPE).invoke(iServiceConnection, componentName, binder, Boolean.FALSE);
                } catch (NoSuchMethodException unused) {
                    iServiceConnection.getClass().getMethod("connected", ComponentName.class, IBinder.class).invoke(iServiceConnection, componentName, binder);
                }
            } catch (Exception e) {
                e.toString();
            }
            return 1;
        } catch (Exception unused2) {
            return method.invoke(obj, objArr);
        }
    }

    private static int getFlagsIndex(Object[] objArr) {
        for (int i = 5; i < objArr.length; i++) {
            Object obj = objArr[i];
            if ((obj instanceof Integer) || (obj instanceof Long)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAudioPermission(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("android.permission.RECORD_AUDIO") || str.equals("android.permission.CAPTURE_AUDIO_OUTPUT") || str.equals("android.permission.MODIFY_AUDIO_SETTINGS") || str.equals("android.permission.FOREGROUND_SERVICE_MICROPHONE") || str.equals("android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION") || str.equals("android.permission.FOREGROUND_SERVICE_CAMERA") || str.equals("android.permission.FOREGROUND_SERVICE_LOCATION") || str.equals("android.permission.FOREGROUND_SERVICE_HEALTH") || str.equals("android.permission.FOREGROUND_SERVICE_DATA_SYNC") || str.equals("android.permission.FOREGROUND_SERVICE_SPECIAL_USE") || str.equals("android.permission.FOREGROUND_SERVICE_SYSTEM_EXEMPTED") || str.equals("android.permission.FOREGROUND_SERVICE_PHONE_CALL") || str.equals("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNetworkPermission(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("android.permission.INTERNET") || str.equals("android.permission.ACCESS_NETWORK_STATE") || str.equals("android.permission.ACCESS_WIFI_STATE") || str.equals("android.permission.CHANGE_NETWORK_STATE") || str.equals("android.permission.CHANGE_WIFI_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isStorageOrMediaPermission(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("android.permission.READ_EXTERNAL_STORAGE") || str.equals("android.permission.WRITE_EXTERNAL_STORAGE") || str.equals("android.permission.READ_MEDIA_AUDIO") || str.equals("android.permission.READ_MEDIA_VIDEO") || str.equals("android.permission.READ_MEDIA_IMAGES") || str.equals("android.permission.READ_MEDIA_VISUAL") || str.equals("android.permission.READ_MEDIA_AURAL") || str.equals("android.permission.ACCESS_MEDIA_LOCATION") || str.equals("android.permission.READ_MEDIA_AUDIO_USER_SELECTED") || str.equals("android.permission.READ_MEDIA_VIDEO_USER_SELECTED") || str.equals("android.permission.READ_MEDIA_IMAGES_USER_SELECTED") || str.equals("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") || str.equals("android.permission.READ_MEDIA_AURAL_USER_SELECTED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isThreatEventFilter(Object[] objArr, int i) {
        if (i >= 0 && i < objArr.length) {
            Object obj = objArr[i];
            if (obj instanceof IntentFilter) {
                IntentFilter intentFilter = (IntentFilter) obj;
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    if (THREAT_EVENT_ACTIONS.contains(intentFilter.getAction(i2))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        Object obj = null;
        if (BuildCompat.isOreo()) {
            obj = ((InterfaceC1918ooOooOo) C0217o00o0oO0.create(InterfaceC1918ooOooOo.class, null, false)).IActivityManagerSingleton();
        } else if (BuildCompat.isL()) {
            obj = AbstractC0809oO0OooOO.OooO00o().gDefault();
        }
        return ((InterfaceC1410oo00Oo0O) C0217o00o0oO0.create(InterfaceC1410oo00Oo0O.class, obj, false)).get();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        Object obj3 = null;
        if (BuildCompat.isOreo()) {
            obj3 = ((InterfaceC1918ooOooOo) C0217o00o0oO0.create(InterfaceC1918ooOooOo.class, null, false)).IActivityManagerSingleton();
        } else if (BuildCompat.isL()) {
            obj3 = AbstractC0809oO0OooOO.OooO00o().gDefault();
        }
        ((InterfaceC1410oo00Oo0O) C0217o00o0oO0.create(InterfaceC1410oo00Oo0O.class, obj3, false))._set_mInstance(obj2);
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return super.invoke(obj, method, objArr);
        } catch (SecurityException unused) {
            String name = method.getName();
            if (name.startsWith("set") || name.startsWith("update") || name.startsWith("get") || name.startsWith("query")) {
                return null;
            }
            if (name.startsWith("start") || name.startsWith("bind")) {
                return Boolean.FALSE;
            }
            if (name.startsWith("stop") || name.startsWith("unbind")) {
                return Boolean.TRUE;
            }
            return null;
        } catch (Exception unused2) {
            method.getName();
            return super.invoke(obj, method, objArr);
        }
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return getProxyInvocation() != getWho();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new PkgMethodProxy("getAppStartMode"));
        addMethodHook(new PkgMethodProxy("setAppLockedVerifying"));
        addMethodHook(new PkgMethodProxy("reportJunkFromApp"));
    }
}



