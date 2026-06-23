package com.app.framework.fake.service;

import android.os.IBinder;
import android.os.IInterface;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.Reflector;
import com.ninja.engine.AbstractC0694o0ooooo0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ISensorPrivacyManagerProxy extends BinderInvocationStub {
    public static final String TAG = "SensorPrivacyProxy";

    @ProxyMethod("isSensorPrivacyEnabled")
    /* loaded from: classes.dex */
    public static class IsSensorPrivacyEnabled extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("isSensorPrivacyEnabledForProfile")
    /* loaded from: classes.dex */
    public static class IsSensorPrivacyEnabledForProfile extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("isSensorPrivacyEnabledForUser")
    /* loaded from: classes.dex */
    public static class IsSensorPrivacyEnabledForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("setSensorPrivacy")
    /* loaded from: classes.dex */
    public static class SetSensorPrivacy extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setSensorPrivacyForProfile")
    /* loaded from: classes.dex */
    public static class SetSensorPrivacyForProfile extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    public ISensorPrivacyManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("sensor_privacy"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        Object invoke;
        try {
            try {
                invoke = Reflector.on("android.hardware.ISensorPrivacyManager$Stub").call("asInterface", AbstractC0694o0ooooo0.OooO0OO().getService("sensor_privacy"));
            } catch (Exception e) {
                e.getMessage();
                try {
                    invoke = Reflector.on("android.hardware.ISensorPrivacyManager").call("asInterface", AbstractC0694o0ooooo0.OooO0OO().getService("sensor_privacy"));
                } catch (Exception e2) {
                    e2.getMessage();
                    invoke = Class.forName("android.hardware.ISensorPrivacyManager$Stub").getMethod("asInterface", IBinder.class).invoke(null, AbstractC0694o0ooooo0.OooO0OO().getService("sensor_privacy"));
                }
            }
            if (invoke != null) {
                return (IInterface) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("sensor_privacy");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


