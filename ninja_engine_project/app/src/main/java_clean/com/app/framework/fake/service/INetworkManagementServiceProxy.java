package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.service.base.UidMethodProxy;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1668ooO00oO;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class INetworkManagementServiceProxy extends BinderInvocationStub {
    public static final String NAME = "network_management";

    @ProxyMethod("getNetworkStatsUidDetail")
    /* loaded from: classes.dex */
    public static class getNetworkStatsUidDetail extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstUid(objArr);
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public INetworkManagementServiceProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService(NAME));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1668ooO00oO) C0217o00o0oO0.create(InterfaceC1668ooO00oO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService(NAME));
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
        addMethodHook(new UidMethodProxy("setUidCleartextNetworkPolicy", 0));
        addMethodHook(new UidMethodProxy("setUidMeteredNetworkBlacklist", 0));
        addMethodHook(new UidMethodProxy("setUidMeteredNetworkWhitelist", 0));
    }
}


