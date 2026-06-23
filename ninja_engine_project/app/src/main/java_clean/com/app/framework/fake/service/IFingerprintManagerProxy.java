package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.service.base.PkgMethodProxy;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1768ooOO0oO;
/* loaded from: classes.dex */
public class IFingerprintManagerProxy extends BinderInvocationStub {
    public IFingerprintManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("fingerprint"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1768ooOO0oO) C0217o00o0oO0.create(InterfaceC1768ooOO0oO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("fingerprint"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("fingerprint");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new PkgMethodProxy("isHardwareDetected"));
        addMethodHook(new PkgMethodProxy("hasEnrolledFingerprints"));
        addMethodHook(new PkgMethodProxy("authenticate"));
        addMethodHook(new PkgMethodProxy("cancelAuthentication"));
        addMethodHook(new PkgMethodProxy("getEnrolledFingerprints"));
        addMethodHook(new PkgMethodProxy("getAuthenticatorId"));
    }
}


