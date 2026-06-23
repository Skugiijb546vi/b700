package com.app.framework.fake.service;

import android.os.IBinder;
import com.app.framework.fake.frameworks.BActivityManager;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.hook.ScanClass;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1410oo00Oo0O;
import com.ninja.engine.InterfaceC1673ooO00ooO;
import com.ninja.engine.InterfaceC1841ooOo000O;
import java.lang.reflect.Method;
@ScanClass({ActivityManagerCommonProxy.class})
/* loaded from: classes.dex */
public class IActivityClientProxy extends ClassInvocationStub {
    public static final String TAG = "IActivityClientProxy";
    private final Object who;

    @ProxyMethod("activityDestroyed")
    /* loaded from: classes.dex */
    public static class ActivityDestroyed extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BActivityManager.get().onActivityDestroyed((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("activityResumed")
    /* loaded from: classes.dex */
    public static class ActivityResumed extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BActivityManager.get().onActivityResumed((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("finishActivity")
    /* loaded from: classes.dex */
    public static class FinishActivity extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BActivityManager.get().onFinishActivity((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setTaskDescription")
    /* loaded from: classes.dex */
    public static class SetTaskDescription extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    public IActivityClientProxy(Object obj) {
        this.who = obj;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getProxyInvocation() {
        return super.getProxyInvocation();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        Object obj = this.who;
        return obj != null ? obj : ((InterfaceC1410oo00Oo0O) C0217o00o0oO0.create(InterfaceC1410oo00Oo0O.class, ((InterfaceC1673ooO00ooO) C0217o00o0oO0.create(InterfaceC1673ooO00ooO.class, ((InterfaceC1841ooOo000O) C0217o00o0oO0.create(InterfaceC1841ooOo000O.class, null, false)).getInstance(), false)).INTERFACE_SINGLETON(), false)).get();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        ((InterfaceC1410oo00Oo0O) C0217o00o0oO0.create(InterfaceC1410oo00Oo0O.class, ((InterfaceC1673ooO00ooO) C0217o00o0oO0.create(InterfaceC1673ooO00ooO.class, ((InterfaceC1841ooOo000O) C0217o00o0oO0.create(InterfaceC1841ooOo000O.class, null, false)).getInstance(), false)).INTERFACE_SINGLETON(), false))._set_mInstance(obj2);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void onlyProxy(boolean z) {
        super.onlyProxy(z);
    }
}
