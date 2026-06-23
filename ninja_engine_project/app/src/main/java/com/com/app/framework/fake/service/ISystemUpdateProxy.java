package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1732ooO0oOoO;
/* loaded from: classes.dex */
public class ISystemUpdateProxy extends BinderInvocationStub {
    public ISystemUpdateProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("system_update"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1732ooO0oOoO) C0217o00o0oO0.create(InterfaceC1732ooO0oOoO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("system_update"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("system_update");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
