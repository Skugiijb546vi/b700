package com.ninja.engine;

import com.app.framework.fake.service.ICredentialManagerProxy;
import com.app.framework.utils.SystemHookManager;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final /* synthetic */ class oO00OOOo implements InvocationHandler {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ oO00OOOo(int i) {
        this.OooO00o = i;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.OooO00o) {
            case 0:
                return ICredentialManagerProxy.OooO00o(obj, method, objArr);
            case 1:
                return SystemHookManager.OooO0O0(obj, method, objArr);
            default:
                return SystemHookManager.OooO00o(obj, method, objArr);
        }
    }
}
