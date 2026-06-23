package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class LevelDbProxy extends ClassInvocationStub {
    public static final String TAG = "LevelDbProxy";

    @ProxyMethod("delete")
    /* loaded from: classes.dex */
    public static class Delete extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (obj == null) {
                return Boolean.FALSE;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return Boolean.FALSE;
            }
        }
    }

    @ProxyMethod("get")
    /* loaded from: classes.dex */
    public static class Get extends MethodHook {
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

    @ProxyMethod("nativeOpen")
    /* loaded from: classes.dex */
    public static class NativeOpen extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null || !(message.contains("lock") || message.contains("IO error"))) {
                    throw e;
                }
                return null;
            }
        }
    }

    @ProxyMethod("open")
    /* loaded from: classes.dex */
    public static class Open extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("lock") && message.contains("Try again")) {
                    return null;
                }
                if (message == null || !message.contains("IO error")) {
                    throw e;
                }
                return null;
            }
        }
    }

    @ProxyMethod("put")
    /* loaded from: classes.dex */
    public static class Put extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (obj == null) {
                return Boolean.FALSE;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return Boolean.FALSE;
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


