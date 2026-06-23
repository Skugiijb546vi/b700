package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class AuthenticationProxy extends ClassInvocationStub {
    public static final String TAG = "AuthenticationProxy";

    @ProxyMethod("getAccessToken")
    /* loaded from: classes.dex */
    public static class GetAccessToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "mock_access_token_" + System.currentTimeMillis();
            }
        }
    }

    @ProxyMethod("getCurrentUser")
    /* loaded from: classes.dex */
    public static class GetCurrentUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return AuthenticationProxy.OooO0OO();
            }
        }
    }

    @ProxyMethod("isLoggedIn")
    /* loaded from: classes.dex */
    public static class IsLoggedIn extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("isSignedIn")
    /* loaded from: classes.dex */
    public static class IsSignedIn extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("login")
    /* loaded from: classes.dex */
    public static class Login extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return AuthenticationProxy.OooO00o();
            }
        }
    }

    @ProxyMethod("logout")
    /* loaded from: classes.dex */
    public static class Logout extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("refreshToken")
    /* loaded from: classes.dex */
    public static class RefreshToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "mock_refresh_token_" + System.currentTimeMillis();
            }
        }
    }

    @ProxyMethod("signIn")
    /* loaded from: classes.dex */
    public static class SignIn extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return AuthenticationProxy.OooO0O0();
            }
        }
    }

    @ProxyMethod("signOut")
    /* loaded from: classes.dex */
    public static class SignOut extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("validateToken")
    /* loaded from: classes.dex */
    public static class ValidateToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    public static /* bridge */ /* synthetic */ Object OooO00o() {
        return createMockLoginResult();
    }

    public static /* bridge */ /* synthetic */ Object OooO0O0() {
        return createMockSignInResult();
    }

    public static /* bridge */ /* synthetic */ Object OooO0OO() {
        return createMockUser();
    }

    private static Object createMockLoginResult() {
        try {
            return Class.forName("android.os.Bundle").newInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object createMockSignInResult() {
        try {
            return Class.forName("android.os.Bundle").newInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object createMockUser() {
        try {
            return Class.forName("android.os.Bundle").newInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
