package com.app.framework.fake.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.hook.IInjectHook;
import com.app.framework.proxy.ProxyManifest;
import com.app.framework.proxy.record.ProxyActivityRecord;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0155o00Oo000;
import com.ninja.engine.InterfaceC0529o0o0O00O;
import com.ninja.engine.InterfaceC0670o0ooo00o;
import com.ninja.engine.InterfaceC1178oOo0o00;
import com.ninja.engine.InterfaceC1347oo;
import com.ninja.engine.InterfaceC1673ooO00ooO;
import com.ninja.engine.InterfaceC1709ooO0o;
import com.ninja.engine.InterfaceC1841ooOo000O;
import com.ninja.engine.InterfaceC1878ooOoOO0O;
import com.ninja.engine.InterfaceC1986oooOO0O;
import com.ninja.engine.o0O00OOO;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class HCallbackProxy implements IInjectHook, Handler.Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "HCallbackStub";
    private AtomicBoolean mBeing = new AtomicBoolean(false);
    private Handler.Callback mOtherCallback;

    private void checkActivityClient() {
        try {
            Object activityClientController = ((InterfaceC1841ooOo000O) C0217o00o0oO0.create(InterfaceC1841ooOo000O.class, null, false)).getActivityClientController();
            if (activityClientController instanceof Proxy) {
                return;
            }
            IActivityClientProxy iActivityClientProxy = new IActivityClientProxy(activityClientController);
            iActivityClientProxy.onlyProxy(true);
            iActivityClientProxy.injectHook();
            ((InterfaceC1347oo) C0217o00o0oO0.create(InterfaceC1347oo.class, ((InterfaceC1673ooO00ooO) C0217o00o0oO0.create(InterfaceC1673ooO00ooO.class, ((InterfaceC1841ooOo000O) C0217o00o0oO0.create(InterfaceC1841ooOo000O.class, null, false)).getInstance(), false)).INTERFACE_SINGLETON(), false))._set_mKnownInstance(iActivityClientProxy.getProxyInvocation());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #2 {all -> 0x0057, blocks: (B:2:0x0000, B:32:0x003f, B:34:0x004d, B:38:0x0063, B:42:0x0071, B:37:0x0059), top: B:56:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void fixLaunchActivityConfiguration(com.ninja.engine.InterfaceC1709ooO0o r6, android.content.pm.ActivityInfo r7) {
        /*
            r5 = this;
            int r7 = r7.screenOrientation     // Catch: java.lang.Throwable -> L57
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L14
            r2 = 6
            if (r7 == r2) goto L14
            r2 = 8
            if (r7 == r2) goto L14
            r2 = 11
            if (r7 != r2) goto L12
            goto L14
        L12:
            r2 = 0
            goto L15
        L14:
            r2 = 1
        L15:
            if (r7 == r1) goto L22
            r3 = 7
            if (r7 == r3) goto L22
            r3 = 9
            if (r7 == r3) goto L22
            r3 = 12
            if (r7 != r3) goto L23
        L22:
            r0 = 1
        L23:
            if (r2 != 0) goto L28
            if (r0 != 0) goto L28
            return
        L28:
            android.content.Context r7 = com.app.framework.BlackBoxCore.getContext()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch: java.lang.Throwable -> L3b
            android.view.WindowManager r7 = (android.view.WindowManager) r7     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L3b
            android.view.Display r7 = r7.getDefaultDisplay()     // Catch: java.lang.Throwable -> L3b
            goto L3c
        L3b:
            r7 = 0
        L3c:
            if (r7 != 0) goto L3f
            return
        L3f:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            r7.getRealMetrics(r0)     // Catch: java.lang.Throwable -> L57
            int r7 = r0.widthPixels     // Catch: java.lang.Throwable -> L57
            int r3 = r0.heightPixels     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L59
            int r1 = java.lang.Math.max(r7, r3)     // Catch: java.lang.Throwable -> L57
            int r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L57
            r2 = 2
            goto L63
        L57:
            r6 = move-exception
            goto L9f
        L59:
            int r2 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L57
            int r7 = java.lang.Math.max(r7, r3)     // Catch: java.lang.Throwable -> L57
            r1 = r2
            r2 = 1
        L63:
            android.content.res.Configuration r3 = new android.content.res.Configuration     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            android.content.res.Configuration r4 = r6.mCurConfig()     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L71
            r3.setTo(r4)     // Catch: java.lang.Throwable -> L71
        L71:
            r3.orientation = r2     // Catch: java.lang.Throwable -> L57
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L57
            float r0 = r0.density     // Catch: java.lang.Throwable -> L57
            float r1 = r1 / r0
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L57
            r3.screenWidthDp = r1     // Catch: java.lang.Throwable -> L57
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L57
            float r7 = r7 / r0
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L57
            r3.screenHeightDp = r7     // Catch: java.lang.Throwable -> L57
            int r7 = java.lang.Math.min(r1, r7)     // Catch: java.lang.Throwable -> L57
            r3.smallestScreenWidthDp = r7     // Catch: java.lang.Throwable -> L57
            r6._set_mCurConfig(r3)     // Catch: java.lang.Throwable -> L88
        L88:
            android.content.res.Configuration r7 = new android.content.res.Configuration     // Catch: java.lang.Throwable -> La2
            r7.<init>()     // Catch: java.lang.Throwable -> La2
            r7.orientation = r2     // Catch: java.lang.Throwable -> La2
            int r0 = r3.screenWidthDp     // Catch: java.lang.Throwable -> La2
            r7.screenWidthDp = r0     // Catch: java.lang.Throwable -> La2
            int r0 = r3.screenHeightDp     // Catch: java.lang.Throwable -> La2
            r7.screenHeightDp = r0     // Catch: java.lang.Throwable -> La2
            int r0 = r3.smallestScreenWidthDp     // Catch: java.lang.Throwable -> La2
            r7.smallestScreenWidthDp = r0     // Catch: java.lang.Throwable -> La2
            r6._set_mOverrideConfig(r7)     // Catch: java.lang.Throwable -> La2
            goto La2
        L9f:
            r6.getMessage()
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.service.HCallbackProxy.fixLaunchActivityConfiguration(com.ninja.engine.ooO0o, android.content.pm.ActivityInfo):void");
    }

    private Handler getH() {
        return ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).mH();
    }

    private Handler.Callback getHCallback() {
        return ((InterfaceC1178oOo0o00) C0217o00o0oO0.create(InterfaceC1178oOo0o00.class, getH(), false)).mCallback();
    }

    private Object getLaunchActivityItem(Object obj) {
        List<Object> mActivityCallbacks = ((InterfaceC1986oooOO0O) C0217o00o0oO0.create(InterfaceC1986oooOO0O.class, obj, false)).mActivityCallbacks();
        if (mActivityCallbacks == null) {
            Objects.toString(obj);
            return null;
        }
        for (Object obj2 : mActivityCallbacks) {
            if (o0O00OOO.classReady(InterfaceC1709ooO0o.class).getName().equals(obj2.getClass().getCanonicalName())) {
                return obj2;
            }
        }
        return null;
    }

    private boolean handleCreateService(Object obj) {
        if (BActivityThread.getAppConfig() != null) {
            String appPackageName = BActivityThread.getAppPackageName();
            ServiceInfo info = ((InterfaceC0670o0ooo00o) C0217o00o0oO0.create(InterfaceC0670o0ooo00o.class, obj, false)).info();
            if (!info.name.equals(ProxyManifest.getProxyService(BActivityThread.getAppPid())) && !info.name.equals(ProxyManifest.getProxyJobService(BActivityThread.getAppPid()))) {
                Objects.toString(obj);
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(appPackageName, info.name));
                BlackBoxCore.getBActivityManager().startService(intent, null, false, BActivityThread.getUserId());
                return true;
            }
        }
        return false;
    }

    private boolean handleLaunchActivity(Object obj) {
        Intent intent;
        IBinder iBinder;
        ProxyActivityRecord create;
        ActivityInfo activityInfo;
        Object launchActivityItem = BuildCompat.isPie() ? getLaunchActivityItem(obj) : obj;
        if (launchActivityItem == null) {
            return false;
        }
        if (BuildCompat.isPie()) {
            intent = ((InterfaceC1709ooO0o) C0217o00o0oO0.create(InterfaceC1709ooO0o.class, launchActivityItem, false)).mIntent();
            iBinder = ((InterfaceC1986oooOO0O) C0217o00o0oO0.create(InterfaceC1986oooOO0O.class, obj, false)).mActivityToken();
        } else {
            InterfaceC0155o00Oo000 interfaceC0155o00Oo000 = (InterfaceC0155o00Oo000) C0217o00o0oO0.create(InterfaceC0155o00Oo000.class, launchActivityItem, false);
            intent = interfaceC0155o00Oo000.intent();
            iBinder = interfaceC0155o00Oo000.token();
        }
        if (intent != null && (activityInfo = (create = ProxyActivityRecord.create(intent)).mActivityInfo) != null) {
            if (BActivityThread.getAppConfig() == null) {
                BlackBoxCore.getBActivityManager().restartProcess(activityInfo.packageName, activityInfo.processName, create.mUserId);
                Intent intent2 = create.mTarget;
                if (intent2 == null) {
                    intent2 = BlackBoxCore.getBPackageManager().getLaunchIntentForPackage(activityInfo.packageName, create.mUserId);
                }
                intent.setExtrasClassLoader(getClass().getClassLoader());
                ProxyActivityRecord.saveStub(intent, intent2, create.mActivityInfo, create.mActivityRecord, create.mUserId);
                if (BuildCompat.isPie()) {
                    InterfaceC1709ooO0o interfaceC1709ooO0o = (InterfaceC1709ooO0o) C0217o00o0oO0.create(InterfaceC1709ooO0o.class, launchActivityItem, false);
                    interfaceC1709ooO0o._set_mIntent(intent);
                    interfaceC1709ooO0o._set_mInfo(activityInfo);
                } else {
                    InterfaceC0155o00Oo000 interfaceC0155o00Oo0002 = (InterfaceC0155o00Oo000) C0217o00o0oO0.create(InterfaceC0155o00Oo000.class, launchActivityItem, false);
                    interfaceC0155o00Oo0002._set_intent(intent);
                    interfaceC0155o00Oo0002._set_activityInfo(activityInfo);
                }
                return true;
            } else if (!BActivityThread.currentActivityThread().isInit()) {
                BActivityThread.currentActivityThread().bindApplication(activityInfo.packageName, activityInfo.processName);
                return true;
            } else {
                BlackBoxCore.getBActivityManager().onActivityCreated(((InterfaceC1878ooOoOO0O) C0217o00o0oO0.create(InterfaceC1878ooOoOO0O.class, AbstractC0809oO0OooOO.OooO00o().getDefault(), false)).getTaskForActivity(iBinder, false).intValue(), iBinder, create.mActivityRecord);
                if (!BuildCompat.isTiramisu()) {
                    if (BuildCompat.isS()) {
                        InterfaceC0155o00Oo000 interfaceC0155o00Oo0003 = (InterfaceC0155o00Oo000) C0217o00o0oO0.create(InterfaceC0155o00Oo000.class, ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).getLaunchingActivity(iBinder), false);
                        interfaceC0155o00Oo0003._set_intent(create.mTarget);
                        interfaceC0155o00Oo0003._set_activityInfo(activityInfo);
                        interfaceC0155o00Oo0003._set_packageInfo(BActivityThread.currentActivityThread().getPackageInfo());
                        checkActivityClient();
                    } else if (!BuildCompat.isPie()) {
                        InterfaceC0155o00Oo000 interfaceC0155o00Oo0004 = (InterfaceC0155o00Oo000) C0217o00o0oO0.create(InterfaceC0155o00Oo000.class, launchActivityItem, false);
                        interfaceC0155o00Oo0004._set_intent(create.mTarget);
                        interfaceC0155o00Oo0004._set_activityInfo(activityInfo);
                    }
                }
                InterfaceC1709ooO0o interfaceC1709ooO0o2 = (InterfaceC1709ooO0o) C0217o00o0oO0.create(InterfaceC1709ooO0o.class, launchActivityItem, false);
                interfaceC1709ooO0o2._set_mIntent(create.mTarget);
                interfaceC1709ooO0o2._set_mInfo(activityInfo);
                fixLaunchActivityConfiguration(interfaceC1709ooO0o2, activityInfo);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:4:0x000a, B:7:0x0013, B:9:0x0025, B:11:0x002d, B:12:0x0035, B:22:0x0063, B:24:0x0075, B:27:0x0081, B:29:0x0085, B:17:0x0040, B:19:0x0052, B:21:0x005a), top: B:36:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #0 {all -> 0x003e, blocks: (B:4:0x000a, B:7:0x0013, B:9:0x0025, B:11:0x002d, B:12:0x0035, B:22:0x0063, B:24:0x0075, B:27:0x0081, B:29:0x0085, B:17:0x0040, B:19:0x0052, B:21:0x005a), top: B:36:0x000a }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.mBeing
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            r2 = 0
            if (r0 != 0) goto L96
            boolean r0 = com.app.framework.utils.compat.BuildCompat.isPie()     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            java.lang.Class<com.ninja.engine.oO0OOOOo> r4 = com.ninja.engine.oO0OOOOo.class
            if (r0 == 0) goto L40
            int r0 = r7.what     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r5 = com.ninja.engine.C0217o00o0oO0.create(r4, r3, r2)     // Catch: java.lang.Throwable -> L3e
            com.ninja.engine.oO0OOOOo r5 = (com.ninja.engine.oO0OOOOo) r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r5 = r5.EXECUTE_TRANSACTION()     // Catch: java.lang.Throwable -> L3e
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L3e
            if (r0 != r5) goto L63
            java.lang.Object r0 = r7.obj     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r6.handleLaunchActivity(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L63
            android.os.Handler r0 = r6.getH()     // Catch: java.lang.Throwable -> L3e
            android.os.Message r7 = android.os.Message.obtain(r7)     // Catch: java.lang.Throwable -> L3e
        L35:
            r0.sendMessageAtFrontOfQueue(r7)     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.mBeing
            r7.set(r2)
            return r1
        L3e:
            r7 = move-exception
            goto L90
        L40:
            int r0 = r7.what     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r5 = com.ninja.engine.C0217o00o0oO0.create(r4, r3, r2)     // Catch: java.lang.Throwable -> L3e
            com.ninja.engine.oO0OOOOo r5 = (com.ninja.engine.oO0OOOOo) r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r5 = r5.LAUNCH_ACTIVITY()     // Catch: java.lang.Throwable -> L3e
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L3e
            if (r0 != r5) goto L63
            java.lang.Object r0 = r7.obj     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r6.handleLaunchActivity(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L63
            android.os.Handler r0 = r6.getH()     // Catch: java.lang.Throwable -> L3e
            android.os.Message r7 = android.os.Message.obtain(r7)     // Catch: java.lang.Throwable -> L3e
            goto L35
        L63:
            int r0 = r7.what     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = com.ninja.engine.C0217o00o0oO0.create(r4, r3, r2)     // Catch: java.lang.Throwable -> L3e
            com.ninja.engine.oO0OOOOo r1 = (com.ninja.engine.oO0OOOOo) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r1 = r1.CREATE_SERVICE()     // Catch: java.lang.Throwable -> L3e
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L3e
            if (r0 != r1) goto L81
            java.lang.Object r7 = r7.obj     // Catch: java.lang.Throwable -> L3e
            boolean r7 = r6.handleCreateService(r7)     // Catch: java.lang.Throwable -> L3e
        L7b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.mBeing
            r0.set(r2)
            return r7
        L81:
            android.os.Handler$Callback r0 = r6.mOtherCallback     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L8a
            boolean r7 = r0.handleMessage(r7)     // Catch: java.lang.Throwable -> L3e
            goto L7b
        L8a:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.mBeing
            r7.set(r2)
            return r2
        L90:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.mBeing
            r0.set(r2)
            throw r7
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.service.HCallbackProxy.handleMessage(android.os.Message):boolean");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public void injectHook() {
        Handler.Callback hCallback = getHCallback();
        this.mOtherCallback = hCallback;
        if (hCallback != null && (hCallback == this || hCallback.getClass().getName().equals(getClass().getName()))) {
            this.mOtherCallback = null;
        }
        ((InterfaceC1178oOo0o00) C0217o00o0oO0.create(InterfaceC1178oOo0o00.class, getH(), false))._set_mCallback(this);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        Handler.Callback hCallback = getHCallback();
        return (hCallback == null || hCallback == this) ? false : true;
    }
}
