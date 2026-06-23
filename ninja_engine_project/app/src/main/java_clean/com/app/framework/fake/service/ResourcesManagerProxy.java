package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ResourcesManagerProxy extends ClassInvocationStub {
    private static final String RESOURCES_MANAGER_CLASS = "android.app.ResourcesManager";
    public static final String TAG = "ResourcesManagerProxy";

    @ProxyMethod("loadApkAssets")
    /* loaded from: classes.dex */
    public static class LoadApkAssets extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            if (str == null || !(str.contains("resource-cache") || str.contains("@idmap") || str.contains(".frro") || str.contains("systemui") || str.contains("data@resource-cache@"))) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("loadOverlayFromPath")
    /* loaded from: classes.dex */
    public static class LoadOverlayFromPath extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            if (str == null || !(str.contains("resource-cache") || str.contains("@idmap") || str.contains(".frro") || str.contains("systemui") || str.contains("data@resource-cache@"))) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    public ResourcesManagerProxy() {
        try {
            Class.forName(RESOURCES_MANAGER_CLASS);
        } catch (ClassNotFoundException e) {
            e.getMessage();
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

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
    }
}


