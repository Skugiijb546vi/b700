package com.app.framework.fake.service;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class GoogleAccountManagerProxy extends ClassInvocationStub {
    public static final String TAG = "GoogleAccountManagerProxy";

    @ProxyMethod("addAccount")
    /* loaded from: classes.dex */
    public static class AddAccount extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                Bundle bundle = new Bundle();
                bundle.putString("authAccount", "mock@gmail.com");
                bundle.putString("accountType", "com.google");
                return bundle;
            }
        }
    }

    @ProxyMethod("getAccounts")
    /* loaded from: classes.dex */
    public static class GetAccounts extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return (invoke == null || !(invoke instanceof Account[]) || ((Account[]) invoke).length <= 0) ? GoogleAccountManagerProxy.OooO00o() : invoke;
            } catch (Exception unused) {
                return GoogleAccountManagerProxy.OooO00o();
            }
        }
    }

    @ProxyMethod("getAccountsByType")
    /* loaded from: classes.dex */
    public static class GetAccountsByType extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && "com.google".equals((String) objArr[0])) {
                        return GoogleAccountManagerProxy.OooO00o();
                    }
                } catch (Exception unused) {
                    return GoogleAccountManagerProxy.OooO00o();
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getAuthToken")
    /* loaded from: classes.dex */
    public static class GetAuthToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "mock_google_auth_token_" + System.currentTimeMillis();
            }
        }
    }

    @ProxyMethod("getAuthenticatorTypes")
    /* loaded from: classes.dex */
    public static class GetAuthenticatorTypes extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return new String[]{"com.google"};
            }
        }
    }

    @ProxyMethod("getPassword")
    /* loaded from: classes.dex */
    public static class GetPassword extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "mock_google_password";
            }
        }
    }

    @ProxyMethod("getUserData")
    /* loaded from: classes.dex */
    public static class GetUserData extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "mock_user_data";
            }
        }
    }

    @ProxyMethod("getUserData")
    /* loaded from: classes.dex */
    public static class GetUserDataByKey extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "mock_user_data_value";
            }
        }
    }

    @ProxyMethod("hasFeatures")
    /* loaded from: classes.dex */
    public static class HasFeatures extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("invalidateAuthToken")
    /* loaded from: classes.dex */
    public static class InvalidateAuthToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("isAccountPresent")
    /* loaded from: classes.dex */
    public static class IsAccountPresent extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("peekAuthToken")
    /* loaded from: classes.dex */
    public static class PeekAuthToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "mock_peek_token_" + System.currentTimeMillis();
            }
        }
    }

    @ProxyMethod("removeAccount")
    /* loaded from: classes.dex */
    public static class RemoveAccount extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("setPassword")
    /* loaded from: classes.dex */
    public static class SetPassword extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("setUserData")
    /* loaded from: classes.dex */
    public static class SetUserData extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static /* bridge */ /* synthetic */ Account[] OooO00o() {
        return createMockGoogleAccounts();
    }

    private static Account[] createMockGoogleAccounts() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Account("mock.user@gmail.com", "com.google"));
            arrayList.add(new Account("virtual.user@gmail.com", "com.google"));
            arrayList.size();
            return (Account[]) arrayList.toArray(new Account[0]);
        } catch (Exception unused) {
            return new Account[0];
        }
    }

    private static boolean isGoogleApp() {
        String packageName;
        try {
            Context context = BlackBoxCore.getContext();
            if (context == null || (packageName = context.getPackageName()) == null) {
                return false;
            }
            if (!packageName.startsWith("com.google.") && !packageName.startsWith("com.android.") && !packageName.contains("gms")) {
                if (!packageName.contains("google")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        try {
            Context context = BlackBoxCore.getContext();
            if (context != null) {
                return AccountManager.get(context);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
