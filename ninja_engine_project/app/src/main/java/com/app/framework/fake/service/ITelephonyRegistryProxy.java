package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1012oOOOo0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ITelephonyRegistryProxy extends BinderInvocationStub {

    @ProxyMethod("listen")
    /* loaded from: classes.dex */
    public static class Listen extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("listenForSubscriber")
    /* loaded from: classes.dex */
    public static class ListenForSubscriber extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public ITelephonyRegistryProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("telephony.registry"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1012oOOOo0) C0217o00o0oO0.create(InterfaceC1012oOOOo0.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("telephony.registry"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("telephony.registry");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
