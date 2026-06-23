package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.AttributionSourceUtils;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ISettingsSystemProxy extends ClassInvocationStub {
    public static final String TAG = "ISettingsSystemProxy";

    @ProxyMethod("getString")
    /* loaded from: classes.dex */
    public static class GetString extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return "";
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
                return "";
            }
        }
    }

    @ProxyMethod("getStringForUser")
    /* loaded from: classes.dex */
    public static class GetStringForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return "";
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
                return "";
            }
        }
    }

    @ProxyMethod("putString")
    /* loaded from: classes.dex */
    public static class PutString extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return Boolean.FALSE;
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
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


