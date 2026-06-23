package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class AndroidIdProxy extends ClassInvocationStub {
    public static final String TAG = "AndroidIdProxy";

    @ProxyMethod("get")
    /* loaded from: classes.dex */
    public static class Get extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (objArr != null && objArr.length > 0) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        if ((str.contains("android_id") || str.contains("ANDROID_ID") || str.contains("secure_id") || str.contains("device_id")) && (invoke == null || "0".equals(invoke.toString()) || "".equals(invoke.toString()))) {
                            return AndroidIdProxy.OooO00o();
                        }
                    }
                }
                return invoke;
            } catch (Exception unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("getAndroidId")
    /* loaded from: classes.dex */
    public static class GetAndroidId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null && !"0".equals(invoke.toString()) && !"".equals(invoke.toString())) {
                    return invoke;
                }
                return AndroidIdProxy.OooO00o();
            } catch (Exception unused) {
                return AndroidIdProxy.OooO00o();
            }
        }
    }

    @ProxyMethod("getLong")
    /* loaded from: classes.dex */
    public static class GetLong extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (objArr != null && objArr.length > 0) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        if ((str.contains("android_id") || str.contains("ANDROID_ID") || str.contains("secure_id") || str.contains("device_id")) && (invoke == null || ((Number) invoke).longValue() == 0)) {
                            return AndroidIdProxy.OooO0O0();
                        }
                    }
                }
                return invoke;
            } catch (Exception unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("getString")
    /* loaded from: classes.dex */
    public static class GetString extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (objArr != null && objArr.length > 0) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        if ((str.contains("android_id") || str.contains("ANDROID_ID") || str.contains("secure_id") || str.contains("device_id")) && (invoke == null || "0".equals(invoke.toString()) || "".equals(invoke.toString()))) {
                            return AndroidIdProxy.OooO00o();
                        }
                    }
                }
                return invoke;
            } catch (Exception unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("read")
    /* loaded from: classes.dex */
    public static class Read extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (objArr != null && objArr.length > 0) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        if ((str.contains("android_id") || str.contains("ANDROID_ID") || str.contains("secure_id") || str.contains("device_id")) && (invoke == null || "0".equals(invoke.toString()) || "".equals(invoke.toString()))) {
                            return AndroidIdProxy.OooO00o();
                        }
                    }
                }
                return invoke;
            } catch (Exception unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    public static /* bridge */ /* synthetic */ String OooO00o() {
        return generateMockAndroidId();
    }

    public static /* bridge */ /* synthetic */ Long OooO0O0() {
        return generateMockAndroidIdLong();
    }

    private static String generateMockAndroidId() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(Integer.toHexString((int) (Math.random() * 16.0d)));
        }
        return sb.toString().toUpperCase();
    }

    private static Long generateMockAndroidIdLong() {
        return Long.valueOf((long) (Math.random() * 9.223372036854776E18d));
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


