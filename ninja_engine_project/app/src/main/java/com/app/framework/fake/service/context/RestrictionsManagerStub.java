package com.app.framework.fake.service.context;

import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1824ooOOoOoO;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class RestrictionsManagerStub extends BinderInvocationStub {

    @ProxyMethod("getApplicationRestrictions")
    /* loaded from: classes.dex */
    public static class GetApplicationRestrictions extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[0] = BlackBoxCore.getHostPkg();
            return method.invoke(obj, objArr);
        }
    }

    public RestrictionsManagerStub() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("restrictions"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1824ooOOoOoO) C0217o00o0oO0.create(InterfaceC1824ooOOoOoO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("restrictions"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("restrictions");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
