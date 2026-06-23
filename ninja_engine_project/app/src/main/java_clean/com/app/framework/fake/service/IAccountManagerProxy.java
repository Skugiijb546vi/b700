package com.app.framework.fake.service;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import com.app.framework.fake.frameworks.BAccountManager;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1751ooOO00oO;
import java.lang.reflect.Method;
import java.util.Map;
/* loaded from: classes.dex */
public class IAccountManagerProxy extends BinderInvocationStub {
    public static final String TAG = "IAccountManagerProxy";

    @ProxyMethod("accountAuthenticated")
    /* loaded from: classes.dex */
    public static class accountAuthenticated extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().accountAuthenticated((Account) objArr[0]);
            return 0;
        }
    }

    @ProxyMethod("addAccount")
    /* loaded from: classes.dex */
    public static class addAccount extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().addAccount((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    @ProxyMethod("addAccountAsUser")
    /* loaded from: classes.dex */
    public static class addAccountAsUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().addAccountAsUser((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    @ProxyMethod("addAccountExplicitly")
    /* loaded from: classes.dex */
    public static class addAccountExplicitly extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(BAccountManager.get().addAccountExplicitly((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2]));
        }
    }

    @ProxyMethod("addAccountExplicitlyWithVisibility")
    /* loaded from: classes.dex */
    public static class addAccountExplicitlyWithVisibility extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(BAccountManager.get().addAccountExplicitlyWithVisibility((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2], (Map) objArr[3]));
        }
    }

    @ProxyMethod("clearPassword")
    /* loaded from: classes.dex */
    public static class clearPassword extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().clearPassword((Account) objArr[0]);
            return 0;
        }
    }

    @ProxyMethod("confirmCredentialsAsUser")
    /* loaded from: classes.dex */
    public static class confirmCredentialsAsUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().confirmCredentialsAsUser((IAccountManagerResponse) objArr[0], (Account) objArr[1], (Bundle) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return 0;
        }
    }

    @ProxyMethod("copyAccountToUser")
    /* loaded from: classes.dex */
    public static class copyAccountToUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().copyAccountToUser((IAccountManagerResponse) objArr[0], (Account) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
            return 0;
        }
    }

    @ProxyMethod("editProperties")
    /* loaded from: classes.dex */
    public static class editProperties extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().editProperties((IAccountManagerResponse) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }
    }

    @ProxyMethod("getAccountByTypeAndFeatures")
    /* loaded from: classes.dex */
    public static class getAccountByTypeAndFeatures extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().getAccountByTypeAndFeatures((IAccountManagerResponse) objArr[0], (String) objArr[1], (String[]) objArr[2]);
            return 0;
        }
    }

    @ProxyMethod("getAccountVisibility")
    /* loaded from: classes.dex */
    public static class getAccountVisibility extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(BAccountManager.get().getAccountVisibility((Account) objArr[0], (String) objArr[1]));
        }
    }

    @ProxyMethod("getAccountsAndVisibilityForPackage")
    /* loaded from: classes.dex */
    public static class getAccountsAndVisibilityForPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().getAccountsAndVisibilityForPackage((String) objArr[0], (String) objArr[1]);
        }
    }

    @ProxyMethod("getAccountsAsUser")
    /* loaded from: classes.dex */
    public static class getAccountsAsUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().getAccountsAsUser((String) objArr[0]);
        }
    }

    @ProxyMethod("getAccountsByFeatures")
    /* loaded from: classes.dex */
    public static class getAccountsByFeatures extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().getAccountsByFeatures((IAccountManagerResponse) objArr[0], (String) objArr[1], (String[]) objArr[2]);
            return 0;
        }
    }

    @ProxyMethod("getAccountsByTypeForPackage")
    /* loaded from: classes.dex */
    public static class getAccountsByTypeForPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().getAccountsByTypeForPackage((String) objArr[0], (String) objArr[1]);
        }
    }

    @ProxyMethod("getAccountsForPackage")
    /* loaded from: classes.dex */
    public static class getAccountsForPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().getAccountsForPackage((String) objArr[0], ((Integer) objArr[1]).intValue());
        }
    }

    @ProxyMethod("getAuthToken")
    /* loaded from: classes.dex */
    public static class getAuthToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().getAuthToken((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return 0;
        }
    }

    @ProxyMethod("getAuthTokenLabel")
    /* loaded from: classes.dex */
    public static class getAuthTokenLabel extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().getAuthTokenLabel((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    @ProxyMethod("getAuthenticatorTypes")
    /* loaded from: classes.dex */
    public static class getAuthenticatorTypes extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().getAuthenticatorTypes();
        }
    }

    @ProxyMethod("getPackagesAndVisibilityForAccount")
    /* loaded from: classes.dex */
    public static class getPackagesAndVisibilityForAccount extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().getPackagesAndVisibilityForAccount((Account) objArr[0]);
        }
    }

    @ProxyMethod("getPassword")
    /* loaded from: classes.dex */
    public static class getPassword extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().getPassword((Account) objArr[0]);
        }
    }

    @ProxyMethod("getUserData")
    /* loaded from: classes.dex */
    public static class getUserData extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().getUserData((Account) objArr[0], (String) objArr[1]);
        }
    }

    @ProxyMethod("invalidateAuthToken")
    /* loaded from: classes.dex */
    public static class invalidateAuthToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().invalidateAuthToken((String) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    @ProxyMethod("peekAuthToken")
    /* loaded from: classes.dex */
    public static class peekAuthToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BAccountManager.get().peekAuthToken((Account) objArr[0], (String) objArr[1]);
        }
    }

    @ProxyMethod("registerAccountListener")
    /* loaded from: classes.dex */
    public static class registerAccountListener extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().registerAccountListener((String[]) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    @ProxyMethod("removeAccountAsUser")
    /* loaded from: classes.dex */
    public static class removeAccountAsUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().removeAccountAsUser((IAccountManagerResponse) objArr[0], (Account) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return 0;
        }
    }

    @ProxyMethod("removeAccountExplicitly")
    /* loaded from: classes.dex */
    public static class removeAccountExplicitly extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(BAccountManager.get().removeAccountExplicitly((Account) objArr[0]));
        }
    }

    @ProxyMethod("setAccountVisibility")
    /* loaded from: classes.dex */
    public static class setAccountVisibility extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(BAccountManager.get().setAccountVisibility((Account) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue()));
        }
    }

    @ProxyMethod("setAuthToken")
    /* loaded from: classes.dex */
    public static class setAuthToken extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().setAuthToken((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    @ProxyMethod("setPassword")
    /* loaded from: classes.dex */
    public static class setPassword extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().setPassword((Account) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    @ProxyMethod("setUserData")
    /* loaded from: classes.dex */
    public static class setUserData extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().setUserData((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return 0;
        }
    }

    @ProxyMethod("unregisterAccountListener")
    /* loaded from: classes.dex */
    public static class unregisterAccountListener extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().unregisterAccountListener((String[]) objArr[0], (String) objArr[1]);
            return 0;
        }
    }

    @ProxyMethod("updateAppPermission")
    /* loaded from: classes.dex */
    public static class updateAppPermission extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().updateAppPermission((Account) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue());
            return 0;
        }
    }

    @ProxyMethod("updateCredentials")
    /* loaded from: classes.dex */
    public static class updateCredentials extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BAccountManager.get().updateCredentials((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), (Bundle) objArr[4]);
            return 0;
        }
    }

    public IAccountManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("account"));
    }

    private static boolean shouldForwardToRealSystem(Account account) {
        return false;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1751ooOO00oO) C0217o00o0oO0.create(InterfaceC1751ooOO00oO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("account"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("account");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return super.invoke(obj, method, objArr);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
    }

    private static boolean shouldForwardToRealSystem(String str) {
        return false;
    }
}


