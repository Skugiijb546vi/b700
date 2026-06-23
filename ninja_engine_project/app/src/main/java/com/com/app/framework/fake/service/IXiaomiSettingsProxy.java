package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.util.XiaomiDeviceDetector;
import com.app.framework.utils.AttributionSourceUtils;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IXiaomiSettingsProxy extends ClassInvocationStub {
    public static final String TAG = "IXiaomiSettingsProxy";

    @ProxyMethod("getInt")
    /* loaded from: classes.dex */
    public static class GetInt extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message == null || !message.contains("Calling uid") || !message.contains("doesn't match source uid")) {
                    throw e;
                }
                return Integer.valueOf(IXiaomiSettingsProxy.OooO0O0());
            } catch (Exception e2) {
                e2.getMessage();
                return Integer.valueOf(IXiaomiSettingsProxy.OooO0O0());
            }
        }
    }

    @ProxyMethod("getIntForUser")
    /* loaded from: classes.dex */
    public static class GetIntForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message == null || !message.contains("Calling uid") || !message.contains("doesn't match source uid")) {
                    throw e;
                }
                return Integer.valueOf(IXiaomiSettingsProxy.OooO0O0());
            } catch (Exception e2) {
                e2.getMessage();
                return Integer.valueOf(IXiaomiSettingsProxy.OooO0O0());
            }
        }
    }

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
                    return IXiaomiSettingsProxy.OooO00o();
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
                return IXiaomiSettingsProxy.OooO00o();
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
                    return IXiaomiSettingsProxy.OooO00o();
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
                return IXiaomiSettingsProxy.OooO00o();
            }
        }
    }

    @ProxyMethod("getString")
    /* loaded from: classes.dex */
    public static class GlobalGetString extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return IXiaomiSettingsProxy.OooO00o();
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
                return IXiaomiSettingsProxy.OooO00o();
            }
        }
    }

    @ProxyMethod("getStringForUser")
    /* loaded from: classes.dex */
    public static class GlobalGetStringForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                AttributionSourceUtils.fixAttributionSourceInArgs(objArr);
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message != null && message.contains("Calling uid") && message.contains("doesn't match source uid")) {
                    return IXiaomiSettingsProxy.OooO00o();
                }
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
                return IXiaomiSettingsProxy.OooO00o();
            }
        }
    }

    public static /* bridge */ /* synthetic */ String OooO00o() {
        return getSafeDefaultForXiaomiSettings();
    }

    public static /* bridge */ /* synthetic */ int OooO0O0() {
        return getSafeDefaultIntForXiaomiSettings();
    }

    private static String getSafeDefaultForXiaomiSettings() {
        return "";
    }

    private static int getSafeDefaultIntForXiaomiSettings() {
        return 0;
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
