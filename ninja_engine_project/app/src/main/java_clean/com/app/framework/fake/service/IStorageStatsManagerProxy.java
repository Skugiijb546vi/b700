package com.app.framework.fake.service;

import android.annotation.TargetApi;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC2072oooo0o0o;
import java.lang.reflect.Method;
@TargetApi(26)
/* loaded from: classes.dex */
public class IStorageStatsManagerProxy extends BinderInvocationStub {
    public IStorageStatsManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("storagestats"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC2072oooo0o0o) C0217o00o0oO0.create(InterfaceC2072oooo0o0o.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("storagestats"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("storagestats");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


