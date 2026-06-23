package com.app.framework.fake.service;

import android.content.ComponentName;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1550oo0o00;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IDevicePolicyManagerProxy extends BinderInvocationStub {

    @ProxyMethod("getDeviceOwnerComponent")
    /* loaded from: classes.dex */
    public static class GetDeviceOwnerComponent extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return new ComponentName("", "");
        }
    }

    @ProxyMethod("getStorageEncryptionStatus")
    /* loaded from: classes.dex */
    public static class GetStorageEncryptionStatus extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getDeviceOwnerName")
    /* loaded from: classes.dex */
    public static class getDeviceOwnerName extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return "BlackBox";
        }
    }

    @ProxyMethod("getProfileOwnerName")
    /* loaded from: classes.dex */
    public static class getProfileOwnerName extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return "BlackBox";
        }
    }

    @ProxyMethod("isDeviceProvisioned")
    /* loaded from: classes.dex */
    public static class isDeviceProvisioned extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    public IDevicePolicyManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("device_policy"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1550oo0o00) C0217o00o0oO0.create(InterfaceC1550oo0o00.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("device_policy"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("device_policy");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
