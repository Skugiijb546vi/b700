package com.app.framework.fake.service;

import android.os.Process;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IAttributionSourceProxy extends ClassInvocationStub {
    public static final String TAG = "IAttributionSourceProxy";

    @ProxyMethod("AttributionSource")
    /* loaded from: classes.dex */
    public static class AttributionSourceConstructor extends MethodHook {
        private Object createSafeAttributionSource(int i, String str) {
            Constructor<?> declaredConstructor;
            int parameterCount;
            int parameterCount2;
            try {
                Class<?> cls = Class.forName("android.content.AttributionSource");
                try {
                    try {
                        declaredConstructor = cls.getDeclaredConstructor(Integer.TYPE, String.class, String.class);
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls.getDeclaredConstructor(null);
                    }
                } catch (NoSuchMethodException unused2) {
                    declaredConstructor = cls.getDeclaredConstructor(Integer.TYPE, String.class);
                }
                if (declaredConstructor != null) {
                    declaredConstructor.setAccessible(true);
                    parameterCount = declaredConstructor.getParameterCount();
                    if (parameterCount == 3) {
                        return declaredConstructor.newInstance(Integer.valueOf(i), str, null);
                    }
                    parameterCount2 = declaredConstructor.getParameterCount();
                    return parameterCount2 == 2 ? declaredConstructor.newInstance(Integer.valueOf(i), str) : declaredConstructor.newInstance(null);
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object createSafeAttributionSource = createSafeAttributionSource(Process.myUid(), BlackBoxCore.getHostPkg());
                return createSafeAttributionSource != null ? createSafeAttributionSource : method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return createSafeAttributionSource(Process.myUid(), BlackBoxCore.getHostPkg());
            }
        }
    }

    @ProxyMethod("enforceCallingUid")
    /* loaded from: classes.dex */
    public static class EnforceCallingUid extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    @ProxyMethod("enforceCallingUidAndPid")
    /* loaded from: classes.dex */
    public static class EnforceCallingUidAndPid extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    @ProxyMethod("fromParcel")
    /* loaded from: classes.dex */
    public static class FromParcel extends MethodHook {
        private Object createSafeAttributionSource(int i, String str) {
            try {
                Constructor<?> declaredConstructor = Class.forName("android.content.AttributionSource").getDeclaredConstructor(Integer.TYPE, String.class, String.class);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(Integer.valueOf(i), str, null);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        private void fixAttributionSourceUid(Object obj) {
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod("setUid", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, Integer.valueOf(Process.myUid()));
                Process.myUid();
            } catch (Exception e) {
                e.getMessage();
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    fixAttributionSourceUid(invoke);
                    return invoke;
                }
                return createSafeAttributionSource(Process.myUid(), BlackBoxCore.getHostPkg());
            } catch (Exception e) {
                e.getMessage();
                return createSafeAttributionSource(Process.myUid(), BlackBoxCore.getHostPkg());
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


