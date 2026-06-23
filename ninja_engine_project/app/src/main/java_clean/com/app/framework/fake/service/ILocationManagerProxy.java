package com.app.framework.fake.service;

import android.os.IInterface;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.GmsCore;
import com.app.framework.fake.frameworks.BLocationManager;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1167oOo00o0o;
import com.ninja.engine.o0OO;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class ILocationManagerProxy extends BinderInvocationStub {
    public static final String TAG = "ILocationManagerProxy";

    @ProxyMethod("getAllProviders")
    /* loaded from: classes.dex */
    public static class GetAllProviders extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Arrays.asList("gps", "network");
        }
    }

    @ProxyMethod("getBestProvider")
    /* loaded from: classes.dex */
    public static class GetBestProvider extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BLocationManager.isFakeLocationEnable() ? "gps" : method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getLastKnownLocation")
    /* loaded from: classes.dex */
    public static class GetLastKnownLocation extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (BLocationManager.isFakeLocationEnable()) {
                return BLocationManager.get().getLocation(BActivityThread.getUserId(), BActivityThread.getAppPackageName()).convert2SystemLocation();
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                if (e.getCause() instanceof SecurityException) {
                    return null;
                }
                throw e;
            }
        }
    }

    @ProxyMethod("getLastLocation")
    /* loaded from: classes.dex */
    public static class GetLastLocation extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (BLocationManager.isFakeLocationEnable()) {
                return BLocationManager.get().getLocation(BActivityThread.getUserId(), BActivityThread.getAppPackageName()).convert2SystemLocation();
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                if (e.getCause() instanceof SecurityException) {
                    return null;
                }
                throw e;
            }
        }
    }

    @ProxyMethod("getProviderProperties")
    /* loaded from: classes.dex */
    public static class GetProviderProperties extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Object invoke = method.invoke(obj, objArr);
            if (BLocationManager.isFakeLocationEnable()) {
                Boolean bool = Boolean.FALSE;
                ((o0OO) C0217o00o0oO0.create(o0OO.class, invoke, false))._set_mHasNetworkRequirement(bool);
                if (BLocationManager.get().getCell(BActivityThread.getUserId(), BActivityThread.getAppPackageName()) == null) {
                    ((o0OO) C0217o00o0oO0.create(o0OO.class, invoke, false))._set_mHasCellRequirement(bool);
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerGnssStatusCallback")
    /* loaded from: classes.dex */
    public static class RegisterGnssStatusCallback extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("removeGpsStatusListener")
    /* loaded from: classes.dex */
    public static class RemoveGpsStatusListener extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("removeUpdates")
    /* loaded from: classes.dex */
    public static class RemoveUpdates extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Object obj2 = objArr[0];
            if (obj2 instanceof IInterface) {
                BLocationManager.get().removeUpdates(((IInterface) obj2).asBinder());
                return 0;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("requestLocationUpdates")
    /* loaded from: classes.dex */
    public static class RequestLocationUpdates extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (BLocationManager.isFakeLocationEnable()) {
                Object obj2 = objArr[1];
                if (obj2 instanceof IInterface) {
                    BLocationManager.get().requestLocationUpdates(((IInterface) obj2).asBinder());
                    return 0;
                }
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                if (e.getCause() instanceof SecurityException) {
                    return 0;
                }
                throw e;
            }
        }
    }

    @ProxyMethod("isProviderEnabledForUser")
    /* loaded from: classes.dex */
    public static class isProviderEnabledForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(Objects.equals((String) objArr[0], "gps"));
        }
    }

    @ProxyMethod("setExtraLocationControllerPackageEnabled")
    /* loaded from: classes.dex */
    public static class setExtraLocationControllerPackageEnabled extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public ILocationManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("location"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1167oOo00o0o) C0217o00o0oO0.create(InterfaceC1167oOo00o0o.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("location"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("location");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        String appPackageName = BActivityThread.getAppPackageName();
        if (appPackageName != null && appPackageName.equals(GmsCore.GMS_PKG) && (method.getName().equals("getLastLocation") || method.getName().equals("getLastKnownLocation") || method.getName().equals("requestLocationUpdates"))) {
            return null;
        }
        return super.invoke(obj, method, objArr);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


