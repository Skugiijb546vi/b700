package com.app.framework.fake.service;

import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.user.BUserHandle;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethods;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1667ooO00o0o;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IAccessibilityManagerProxy extends BinderInvocationStub {

    @ProxyMethods({"interrupt", "sendAccessibilityEvent", "addClient", "getInstalledAccessibilityServiceList", "getEnabledAccessibilityServiceList", "addAccessibilityInteractionConnection", "getWindowToken"})
    /* loaded from: classes.dex */
    public static class ReplaceUserId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                int length = objArr.length - 1;
                if (objArr[length] instanceof Integer) {
                    objArr[length] = Integer.valueOf(BUserHandle.getUserId(BlackBoxCore.getContext().getApplicationInfo().uid));
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    public IAccessibilityManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("accessibility"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1667ooO00o0o) C0217o00o0oO0.create(InterfaceC1667ooO00o0o.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("accessibility"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("accessibility");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


