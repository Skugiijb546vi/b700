package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.service.base.PkgMethodProxy;
import com.app.framework.fake.service.base.ValueMethodProxy;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1597oo0oOOo0;
import com.ninja.engine.InterfaceC1864ooOoO00;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IPermissionManagerProxy extends BinderInvocationStub {
    private static final String P = "permissionmgr";
    public static final String TAG = "IPermissionManagerProxy";

    @ProxyMethod("checkUidPermission")
    /* loaded from: classes.dex */
    public static class CheckUidPermission extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            if (str == null || !IPermissionManagerProxy.isNetworkPermission(str)) {
                return method.invoke(obj, objArr);
            }
            return 0;
        }
    }

    public IPermissionManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService(P));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNetworkPermission(String str) {
        return str.equals("android.permission.INTERNET") || str.equals("android.permission.ACCESS_NETWORK_STATE") || str.equals("android.permission.ACCESS_WIFI_STATE") || str.equals("android.permission.CHANGE_NETWORK_STATE") || str.equals("android.permission.CHANGE_WIFI_STATE");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1864ooOoO00) C0217o00o0oO0.create(InterfaceC1864ooOoO00.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService(P));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(P);
        ((InterfaceC1597oo0oOOo0) C0217o00o0oO0.create(InterfaceC1597oo0oOOo0.class, null, true))._set_sPermissionManager(obj2);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        Boolean bool = Boolean.TRUE;
        addMethodHook(new ValueMethodProxy("addPermissionAsync", bool));
        addMethodHook(new ValueMethodProxy("addPermission", bool));
        addMethodHook(new ValueMethodProxy("performDexOpt", bool));
        Boolean bool2 = Boolean.FALSE;
        addMethodHook(new ValueMethodProxy("performDexOptIfNeeded", bool2));
        addMethodHook(new ValueMethodProxy("performDexOptSecondary", bool));
        addMethodHook(new ValueMethodProxy("addOnPermissionsChangeListener", 0));
        addMethodHook(new ValueMethodProxy("removeOnPermissionsChangeListener", 0));
        addMethodHook(new ValueMethodProxy("checkDeviceIdentifierAccess", bool2));
        addMethodHook(new PkgMethodProxy("shouldShowRequestPermissionRationale"));
        if (BuildCompat.isOreo()) {
            addMethodHook(new ValueMethodProxy("notifyDexLoad", 0));
            addMethodHook(new ValueMethodProxy("notifyPackageUse", 0));
            addMethodHook(new ValueMethodProxy("setInstantAppCookie", bool2));
            addMethodHook(new ValueMethodProxy("isInstantApp", bool2));
        }
    }
}


