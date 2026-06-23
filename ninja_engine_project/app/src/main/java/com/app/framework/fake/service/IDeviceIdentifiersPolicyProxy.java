package com.app.framework.fake.service;

import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.Md5Utils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1164oOo00o;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IDeviceIdentifiersPolicyProxy extends BinderInvocationStub {

    @ProxyMethod("getSerialForPackage")
    /* loaded from: classes.dex */
    public static class x extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    public IDeviceIdentifiersPolicyProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("device_identifiers"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1164oOo00o) C0217o00o0oO0.create(InterfaceC1164oOo00o.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("device_identifiers"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("device_identifiers");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
