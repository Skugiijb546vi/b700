package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.AttributionSourceUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ISystemSensorManagerProxy extends ClassInvocationStub {
    public static final String TAG = "ISystemSensorManagerProxy";

    @ProxyMethod("SystemSensorManager")
    /* loaded from: classes.dex */
    public static class Constructor extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return ISystemSensorManagerProxy.OooO00o();
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
                return ISystemSensorManagerProxy.OooO00o();
            }
        }
    }

    @ProxyMethod("parsePackageList")
    /* loaded from: classes.dex */
    public static class ParsePackageList extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return new ArrayList();
            }
        }
    }

    public static /* bridge */ /* synthetic */ Object OooO00o() {
        return createSafeSensorManager();
    }

    private static Object createSafeSensorManager() {
        try {
            try {
                java.lang.reflect.Constructor<?> declaredConstructor = Class.forName("android.hardware.SystemSensorManager").getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(null);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        } catch (Exception e2) {
            e2.getMessage();
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


