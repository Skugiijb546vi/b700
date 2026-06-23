package com.app.framework.fake.service;

import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.proxy.ProxyVpnService;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1910ooOoo0oo;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
public class VpnCommonProxy {

    @ProxyMethod("prepareVpn")
    /* loaded from: classes.dex */
    public static class PrepareVpn extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("establishVpn")
    /* loaded from: classes.dex */
    public static class establishVpn extends MethodHook {
        private void handlePackage(List<String> list) {
            if (list != null && list.contains(BActivityThread.getAppPackageName())) {
                list.add(BlackBoxCore.getHostPkg());
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            InterfaceC1910ooOoo0oo interfaceC1910ooOoo0oo = (InterfaceC1910ooOoo0oo) C0217o00o0oO0.create(InterfaceC1910ooOoo0oo.class, objArr[0], false);
            interfaceC1910ooOoo0oo._set_user(ProxyVpnService.class.getName());
            handlePackage(interfaceC1910ooOoo0oo.allowedApplications());
            handlePackage(interfaceC1910ooOoo0oo.disallowedApplications());
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setVpnPackageAuthorization")
    /* loaded from: classes.dex */
    public static class setVpnPackageAuthorization extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }
}


