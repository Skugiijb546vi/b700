package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0528o0o0O000;
/* loaded from: classes.dex */
public class IWifiScannerProxy extends BinderInvocationStub {
    public IWifiScannerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("wifiscanner"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC0528o0o0O000) C0217o00o0oO0.create(InterfaceC0528o0o0O000.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("wifiscanner"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("wifiscanner");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
