package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0977oOOO0OO;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IMediaRouterServiceProxy extends BinderInvocationStub {

    @ProxyMethod("registerClientAsUser")
    /* loaded from: classes.dex */
    public static class registerClientAsUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerRouter2")
    /* loaded from: classes.dex */
    public static class registerRouter2 extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public IMediaRouterServiceProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("media_router"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC0977oOOO0OO) C0217o00o0oO0.create(InterfaceC0977oOOO0OO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("media_router"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("media_router");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


