package com.app.framework.fake.service;

import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.frameworks.BLocationManager;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.Md5Utils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1285oOoo0oo0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ITelephonyManagerProxy extends BinderInvocationStub {
    public static final String TAG = "ITelephonyManagerProxy";

    @ProxyMethod("getAllCellInfo")
    /* loaded from: classes.dex */
    public static class GetAllCellInfo extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (BLocationManager.isFakeLocationEnable()) {
                return BLocationManager.get().getAllCell(BActivityThread.getUserId(), BActivityThread.getAppPackageName());
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @ProxyMethod("getCellLocation")
    /* loaded from: classes.dex */
    public static class GetCellLocation extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (!BLocationManager.isFakeLocationEnable() || BLocationManager.get().getCell(BActivityThread.getUserId(), BActivityThread.getAppPackageName()) == null) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getDeviceId")
    /* loaded from: classes.dex */
    public static class GetDeviceId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("getDeviceIdWithFeature")
    /* loaded from: classes.dex */
    public static class GetDeviceIdWithFeature extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("getMeidForSlot")
    /* loaded from: classes.dex */
    public static class GetMeidForSlot extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("getNeighboringCellInfo")
    /* loaded from: classes.dex */
    public static class GetNeighboringCellInfo extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (BLocationManager.isFakeLocationEnable()) {
                BLocationManager.get().getNeighboringCell(BActivityThread.getUserId(), BActivityThread.getAppPackageName());
                return null;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getNetworkOperator")
    /* loaded from: classes.dex */
    public static class GetNetworkOperator extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getNetworkTypeForSubscriber")
    /* loaded from: classes.dex */
    public static class GetNetworkTypeForSubscriber extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    @ProxyMethod("getSubscriberId")
    /* loaded from: classes.dex */
    public static class GetSubscriberId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("isUserDataEnabled")
    /* loaded from: classes.dex */
    public static class IsUserDataEnabled extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("getImeiForSlot")
    /* loaded from: classes.dex */
    public static class getImeiForSlot extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("getLine1NumberForDisplay")
    /* loaded from: classes.dex */
    public static class getLine1NumberForDisplay extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    public ITelephonyManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("phone"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1285oOoo0oo0) C0217o00o0oO0.create(InterfaceC1285oOoo0oo0.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("phone"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("phone");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
