package com.app.framework.fake.service;

import android.os.IBinder;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.GmsCore;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class GmsProxy extends BinderInvocationStub {
    public static final String TAG = "GmsProxy";

    @ProxyMethod("authenticate")
    /* loaded from: classes.dex */
    public static class Authenticate extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return GmsProxy.OooO00o();
            }
        }
    }

    @ProxyMethod("clearToken")
    /* loaded from: classes.dex */
    public static class ClearToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("getAccount")
    /* loaded from: classes.dex */
    public static class GetAccount extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("getService")
    /* loaded from: classes.dex */
    public static class GetService extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && GmsCore.GMS_PKG.equals((String) objArr[0])) {
                        objArr[0] = BlackBoxCore.getHostPkg();
                        BlackBoxCore.getHostPkg();
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getServiceBroker")
    /* loaded from: classes.dex */
    public static class GetServiceBroker extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("getToken")
    /* loaded from: classes.dex */
    public static class GetToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "mock_gms_token_" + System.currentTimeMillis();
            }
        }
    }

    @ProxyMethod("invalidateToken")
    /* loaded from: classes.dex */
    public static class InvalidateToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public GmsProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("gms"));
    }

    public static /* bridge */ /* synthetic */ Object OooO00o() {
        return createMockAuthResult();
    }

    private static Object createMockAuthResult() {
        try {
            return Class.forName("android.os.Bundle").newInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        Object invoke;
        IBinder service = AbstractC0694o0ooooo0.OooO0OO().getService("gms");
        if (service == null) {
            return null;
        }
        try {
            invoke = Class.forName("com.google.android.gms.common.api.internal.IGmsServiceBroker$Stub").getMethod("asInterface", IBinder.class).invoke(null, service);
        } catch (Exception unused) {
        }
        if (invoke != null) {
            return invoke;
        }
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("gms");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


