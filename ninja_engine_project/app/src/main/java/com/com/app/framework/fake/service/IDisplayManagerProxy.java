package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC2007oooOOo00;
import com.ninja.engine.InterfaceC2025oooOoO0o;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IDisplayManagerProxy extends ClassInvocationStub {

    @ProxyMethod("createVirtualDisplay")
    /* loaded from: classes.dex */
    public static class CreateVirtualDisplay extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public String getMethodName() {
            return "createVirtualDisplay";
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC2007oooOOo00) C0217o00o0oO0.create(InterfaceC2007oooOOo00.class, ((InterfaceC2025oooOoO0o) C0217o00o0oO0.create(InterfaceC2025oooOoO0o.class, null, false)).getInstance(), false)).mDm();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        ((InterfaceC2007oooOOo00) C0217o00o0oO0.create(InterfaceC2007oooOOo00.class, ((InterfaceC2025oooOoO0o) C0217o00o0oO0.create(InterfaceC2025oooOoO0o.class, null, false)).getInstance(), false))._set_mDm(getProxyInvocation());
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return ((InterfaceC2007oooOOo00) C0217o00o0oO0.create(InterfaceC2007oooOOo00.class, ((InterfaceC2025oooOoO0o) C0217o00o0oO0.create(InterfaceC2025oooOoO0o.class, null, false)).getInstance(), false)).mDm() != getProxyInvocation();
    }
}
