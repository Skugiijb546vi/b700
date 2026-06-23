package com.app.framework.fake.service;

import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC2037oooOooO;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IMediaSessionManagerProxy extends BinderInvocationStub {

    @ProxyMethod("createSession")
    /* loaded from: classes.dex */
    public static class CreateSession extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof String)) {
                objArr[0] = BlackBoxCore.getHostPkg();
            }
            return method.invoke(obj, objArr);
        }
    }

    public IMediaSessionManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("media_session"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC2037oooOooO) C0217o00o0oO0.create(InterfaceC2037oooOooO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("media_session"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("media_session");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
