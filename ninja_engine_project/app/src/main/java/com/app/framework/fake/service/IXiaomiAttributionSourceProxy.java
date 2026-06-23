package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.util.XiaomiDeviceDetector;
import com.app.framework.utils.AttributionSourceUtils;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IXiaomiAttributionSourceProxy extends ClassInvocationStub {
    public static final String TAG = "IXiaomiAttributionSourceProxy";

    @ProxyMethod("AttributionSource")
    /* loaded from: classes.dex */
    public static class AttributionSourceConstructor extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return AttributionSourceUtils.createSafeAttributionSource();
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
                return AttributionSourceUtils.createSafeAttributionSource();
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
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    AttributionSourceUtils.fixAttributionSourceUid(invoke);
                }
                return invoke;
            } catch (Exception e) {
                e.getMessage();
                return AttributionSourceUtils.createSafeAttributionSource();
            }
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        if (XiaomiDeviceDetector.isXiaomiDevice()) {
            XiaomiDeviceDetector.getDeviceModel();
            XiaomiDeviceDetector.getMiuiVersion();
        }
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
