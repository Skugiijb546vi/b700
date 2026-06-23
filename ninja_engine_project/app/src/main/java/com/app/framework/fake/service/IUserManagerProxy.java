package com.app.framework.fake.service;

import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1646ooO00;
import com.ninja.engine.InterfaceC1713ooO0o00O;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class IUserManagerProxy extends BinderInvocationStub {

    @ProxyMethod("getApplicationRestrictions")
    /* loaded from: classes.dex */
    public static class GetApplicationRestrictions extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[0] = BlackBoxCore.getHostPkg();
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getProfileParent")
    /* loaded from: classes.dex */
    public static class GetProfileParent extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ((InterfaceC1713ooO0o00O) C0217o00o0oO0.create(InterfaceC1713ooO0o00O.class, null, false))._new(BActivityThread.getUserId(), "BlackBox", ((InterfaceC1713ooO0o00O) C0217o00o0oO0.create(InterfaceC1713ooO0o00O.class, null, false)).FLAG_PRIMARY().intValue());
        }
    }

    @ProxyMethod("getUsers")
    /* loaded from: classes.dex */
    public static class getUsers extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return new ArrayList();
        }
    }

    public IUserManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("user"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1646ooO00) C0217o00o0oO0.create(InterfaceC1646ooO00.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("user"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("user");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
