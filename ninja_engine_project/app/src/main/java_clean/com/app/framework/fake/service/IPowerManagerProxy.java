package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.service.base.ValueMethodProxy;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.o0OO00o0;
/* loaded from: classes.dex */
public class IPowerManagerProxy extends BinderInvocationStub {
    public IPowerManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("power"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((o0OO00o0) C0217o00o0oO0.create(o0OO00o0.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("power"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("power");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new ValueMethodProxy("acquireWakeLock", 0));
        addMethodHook(new ValueMethodProxy("acquireWakeLockWithUid", 0));
        addMethodHook(new ValueMethodProxy("releaseWakeLock", 0));
        addMethodHook(new ValueMethodProxy("updateWakeLockWorkSource", 0));
        addMethodHook(new ValueMethodProxy("isWakeLockLevelSupported", Boolean.TRUE));
    }
}


