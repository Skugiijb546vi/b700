package com.app.framework.fake.service;

import android.os.Build;
import android.os.IBinder;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.AbstractC0694o0ooooo0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IMiuiSecurityManagerProxy extends BinderInvocationStub {
    private static final String SERVICE_NAME = "miui.security.SecurityManager";
    public static final String TAG = "MiuiSecurityManagerProxy";

    @ProxyMethod("actuallyCheckPermission")
    /* loaded from: classes.dex */
    public static class ActuallyCheckPermission extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("checkAccessControl")
    /* loaded from: classes.dex */
    public static class CheckAccessControl extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("checkSmsBlocked")
    /* loaded from: classes.dex */
    public static class CheckSmsBlocked extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("getAppPrivacyStatus")
    /* loaded from: classes.dex */
    public static class GetAppPrivacyStatus extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr.length > 0) {
                String str = (String) objArr[0];
            }
            return 0;
        }
    }

    @ProxyMethod("getAppRunningControlEnabled")
    /* loaded from: classes.dex */
    public static class GetAppRunningControlEnabled extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("getCurrentUserId")
    /* loaded from: classes.dex */
    public static class GetCurrentUserId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("getIcon")
    /* loaded from: classes.dex */
    public static class GetIcon extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    @ProxyMethod("getWakeUpTime")
    /* loaded from: classes.dex */
    public static class GetWakeUpTime extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0L;
        }
    }

    @ProxyMethod("isAllowStartActivity")
    /* loaded from: classes.dex */
    public static class IsAllowStartActivity extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("isAppPermissionControlOpen")
    /* loaded from: classes.dex */
    public static class IsAppPermissionControlOpen extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("isGameMode")
    /* loaded from: classes.dex */
    public static class IsGameMode extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("isTrackWakeUp")
    /* loaded from: classes.dex */
    public static class IsTrackWakeUp extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("isValidDevice")
    /* loaded from: classes.dex */
    public static class IsValidDevice extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("pushNewNotification")
    /* loaded from: classes.dex */
    public static class PushNewNotification extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("saveIcon")
    /* loaded from: classes.dex */
    public static class SaveIcon extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setAppPermissionControlOpen")
    /* loaded from: classes.dex */
    public static class SetAppPermissionControlOpen extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setAppPrivacyStatus")
    /* loaded from: classes.dex */
    public static class SetAppPrivacyStatus extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr.length > 0) {
                String str = (String) objArr[0];
            }
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setAppRunningControlEnabled")
    /* loaded from: classes.dex */
    public static class SetAppRunningControlEnabled extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setCurrentUserId")
    /* loaded from: classes.dex */
    public static class SetCurrentUserId extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setGameMode")
    /* loaded from: classes.dex */
    public static class SetGameMode extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setTrackWakeUp")
    /* loaded from: classes.dex */
    public static class SetTrackWakeUp extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setWakeUpTime")
    /* loaded from: classes.dex */
    public static class SetWakeUpTime extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    public IMiuiSecurityManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService(SERVICE_NAME));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        IBinder service = AbstractC0694o0ooooo0.OooO0OO().getService(SERVICE_NAME);
        if (service == null) {
            return null;
        }
        try {
            return Class.forName("miui.security.ISecurityManager$Stub").getMethod("asInterface", IBinder.class).invoke(null, service);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(SERVICE_NAME);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    public boolean isEnable() {
        return BuildCompat.isMIUI() || Build.MANUFACTURER.toLowerCase().contains("xiaomi") || Build.BRAND.toLowerCase().contains("xiaomi") || Build.DISPLAY.toLowerCase().contains("hyperos");
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new SetAppPrivacyStatus());
        addMethodHook(new GetAppPrivacyStatus());
        addMethodHook(new SetAppPermissionControlOpen());
        addMethodHook(new IsAppPermissionControlOpen());
        addMethodHook(new SetWakeUpTime());
        addMethodHook(new GetWakeUpTime());
        addMethodHook(new SetTrackWakeUp());
        addMethodHook(new IsTrackWakeUp());
        addMethodHook(new SetGameMode());
        addMethodHook(new IsGameMode());
        addMethodHook(new PushNewNotification());
        addMethodHook(new IsAllowStartActivity());
        addMethodHook(new SetAppRunningControlEnabled());
        addMethodHook(new GetAppRunningControlEnabled());
        addMethodHook(new CheckAccessControl());
        addMethodHook(new SaveIcon());
        addMethodHook(new GetIcon());
        addMethodHook(new IsValidDevice());
        addMethodHook(new ActuallyCheckPermission());
        addMethodHook(new CheckSmsBlocked());
        addMethodHook(new SetCurrentUserId());
        addMethodHook(new GetCurrentUserId());
    }
}
