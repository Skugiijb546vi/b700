package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1768ooOO0oO;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IGraphicsStatsProxy extends BinderInvocationStub {

    @ProxyMethod("requestBufferForProcess")
    /* loaded from: classes.dex */
    public static class RequestBufferForProcess extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public IGraphicsStatsProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("graphicsstats"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1768ooOO0oO) C0217o00o0oO0.create(InterfaceC1768ooOO0oO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("graphicsstats"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("graphicsstats");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


