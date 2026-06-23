package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.util.XiaomiDeviceDetector;
import com.app.framework.utils.AttributionSourceUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IXiaomiMiuiServicesProxy extends ClassInvocationStub {
    public static final String TAG = "IXiaomiMiuiServicesProxy";

    @ProxyMethod("ForceDarkHelperStubImpl")
    /* loaded from: classes.dex */
    public static class ForceDarkHelperStubImpl extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("HandWritingStubImpl")
    /* loaded from: classes.dex */
    public static class HandWritingStubImpl extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("MiuiCameraCoveredManager")
    /* loaded from: classes.dex */
    public static class MiuiCameraCoveredManager extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (NullPointerException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Attempt to invoke virtual method") && message.contains("android.provider.MiuiSettings$SettingsCloudData$CloudData.getString")) {
                    return IXiaomiMiuiServicesProxy.OooO00o();
                }
                throw e;
            } catch (SecurityException e2) {
                String message2 = e2.getMessage();
                if (message2 != null && message2.contains("Calling uid") && message2.contains("doesn't match source uid")) {
                    return IXiaomiMiuiServicesProxy.OooO00o();
                }
                throw e2;
            } catch (Exception e3) {
                e3.getMessage();
                return IXiaomiMiuiServicesProxy.OooO00o();
            }
        }
    }

    @ProxyMethod("MiuiDownscaleImpl")
    /* loaded from: classes.dex */
    public static class MiuiDownscaleImpl extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("MiuiForceDarkConfig")
    /* loaded from: classes.dex */
    public static class MiuiForceDarkConfig extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("MiuiMonitorThread")
    /* loaded from: classes.dex */
    public static class MiuiMonitorThread extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("OplusOverScrollerExtImpl")
    /* loaded from: classes.dex */
    public static class OplusOverScrollerExtImpl extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("OplusScrollToTopManager")
    /* loaded from: classes.dex */
    public static class OplusScrollToTopManager extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    public static /* bridge */ /* synthetic */ Object OooO00o() {
        return createSafeMiuiCameraManagerForXiaomi();
    }

    private static Object createSafeMiuiCameraManagerForXiaomi() {
        try {
            try {
                Constructor<?> declaredConstructor = Class.forName("android.provider.MiuiSettings$SettingsCloudData$CloudData").getDeclaredConstructor(null);
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
