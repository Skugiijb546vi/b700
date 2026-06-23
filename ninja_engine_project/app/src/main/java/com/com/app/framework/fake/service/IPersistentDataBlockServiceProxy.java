package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.service.base.ValueMethodProxy;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1940oooO0;
/* loaded from: classes.dex */
public class IPersistentDataBlockServiceProxy extends BinderInvocationStub {
    public static final String NAME = "persistent_data_block";

    public IPersistentDataBlockServiceProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService(NAME));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1940oooO0) C0217o00o0oO0.create(InterfaceC1940oooO0.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService(NAME));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(NAME);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new ValueMethodProxy("write", -1));
        addMethodHook(new ValueMethodProxy("read", new byte[0]));
        addMethodHook(new ValueMethodProxy("wipe", null));
        addMethodHook(new ValueMethodProxy("getDataBlockSize", 0));
        addMethodHook(new ValueMethodProxy("getMaximumDataBlockSize", 0));
        addMethodHook(new ValueMethodProxy("setOemUnlockEnabled", 0));
        addMethodHook(new ValueMethodProxy("getOemUnlockEnabled", Boolean.FALSE));
    }
}
