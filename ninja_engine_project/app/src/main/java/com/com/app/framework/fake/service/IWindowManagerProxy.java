package com.app.framework.fake.service;

import android.os.IInterface;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0812oO0OoooO;
import com.ninja.engine.InterfaceC0945oOO0oO;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IWindowManagerProxy extends BinderInvocationStub {
    public static final String TAG = "WindowManagerStub";

    @ProxyMethod("openSession")
    /* loaded from: classes.dex */
    public static class OpenSession extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            IWindowSessionProxy iWindowSessionProxy = new IWindowSessionProxy((IInterface) method.invoke(obj, objArr));
            iWindowSessionProxy.injectHook();
            return iWindowSessionProxy.getProxyInvocation();
        }
    }

    public IWindowManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("window"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC0812oO0OoooO) C0217o00o0oO0.create(InterfaceC0812oO0OoooO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("window"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("window");
        ((InterfaceC0945oOO0oO) C0217o00o0oO0.create(InterfaceC0945oOO0oO.class, null, false))._set_sWindowManagerService(null);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
