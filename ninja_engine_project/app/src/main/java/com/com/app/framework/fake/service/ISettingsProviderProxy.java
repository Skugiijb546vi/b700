package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ISettingsProviderProxy extends ClassInvocationStub {
    public static final String TAG = "ISettingsProviderProxy";

    @ProxyMethod("getFloat")
    /* loaded from: classes.dex */
    public static class GetFloat extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return Float.valueOf(1.0f);
                }
                throw e;
            }
        }
    }

    @ProxyMethod("getFloatForUser")
    /* loaded from: classes.dex */
    public static class GetFloatForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return Float.valueOf(1.0f);
                }
                throw e;
            }
        }
    }

    @ProxyMethod("getInt")
    /* loaded from: classes.dex */
    public static class GetInt extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return 1;
                }
                throw e;
            }
        }
    }

    @ProxyMethod("getIntForUser")
    /* loaded from: classes.dex */
    public static class GetIntForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return 1;
                }
                throw e;
            }
        }
    }

    @ProxyMethod("getLong")
    /* loaded from: classes.dex */
    public static class GetLong extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return 1L;
                }
                throw e;
            }
        }
    }

    @ProxyMethod("getLongForUser")
    /* loaded from: classes.dex */
    public static class GetLongForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return 1L;
                }
                throw e;
            }
        }
    }

    @ProxyMethod("getString")
    /* loaded from: classes.dex */
    public static class GetString extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (str = (String) objArr[0]) != null && str.contains("feature_flag")) {
                        return "true";
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                        return "true";
                    }
                    throw e;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getStringForUser")
    /* loaded from: classes.dex */
    public static class GetStringForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (str = (String) objArr[0]) != null && str.contains("feature_flag")) {
                        return "true";
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                        return "true";
                    }
                    throw e;
                }
            }
            return method.invoke(obj, objArr);
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
