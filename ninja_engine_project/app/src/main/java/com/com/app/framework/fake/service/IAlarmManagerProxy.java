package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0653o0ooO0oo;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IAlarmManagerProxy extends BinderInvocationStub {

    @ProxyMethod("set")
    /* loaded from: classes.dex */
    public static class Set extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public IAlarmManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("alarm"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC0653o0ooO0oo) C0217o00o0oO0.create(InterfaceC0653o0ooO0oo.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("alarm"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("alarm");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
