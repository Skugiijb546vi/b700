package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.service.base.ValueMethodProxy;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0913oOO00o0;
/* loaded from: classes.dex */
public class IContextHubServiceProxy extends BinderInvocationStub {
    public IContextHubServiceProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService(getServiceName()));
    }

    private static String getServiceName() {
        return BuildCompat.isOreo() ? "contexthub" : "contexthub_service";
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC0913oOO00o0) C0217o00o0oO0.create(InterfaceC0913oOO00o0.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService(getServiceName()));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(getServiceName());
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new ValueMethodProxy("registerCallback", 0));
        addMethodHook(new ValueMethodProxy("getContextHubInfo", null));
        addMethodHook(new ValueMethodProxy("getContextHubHandles", new int[0]));
    }
}
