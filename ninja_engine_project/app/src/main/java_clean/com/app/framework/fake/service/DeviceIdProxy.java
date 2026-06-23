package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class DeviceIdProxy extends ClassInvocationStub {
    public static final String TAG = "DeviceIdProxy";

    @ProxyMethod("generateDeviceId")
    /* loaded from: classes.dex */
    public static class GenerateDeviceId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return "generated_device_id_" + System.currentTimeMillis();
            }
        }
    }

    @ProxyMethod("getDeviceId")
    /* loaded from: classes.dex */
    public static class GetDeviceId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (obj == null) {
                return "default_device_id";
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return "default_device_id";
            }
        }
    }

    @ProxyMethod("isValidDeviceId")
    /* loaded from: classes.dex */
    public static class IsValidDeviceId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return obj == null ? Boolean.TRUE : method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("retrieveDeviceId")
    /* loaded from: classes.dex */
    public static class RetrieveDeviceId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (obj == null) {
                return "retrieved_device_id";
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return "retrieved_device_id";
            }
        }
    }

    @ProxyMethod("setDeviceId")
    /* loaded from: classes.dex */
    public static class SetDeviceId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (obj == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("storeDeviceId")
    /* loaded from: classes.dex */
    public static class StoreDeviceId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (obj == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
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


