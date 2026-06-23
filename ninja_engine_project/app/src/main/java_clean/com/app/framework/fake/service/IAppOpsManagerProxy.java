package com.app.framework.fake.service;

import android.app.AppOpsManager;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1147oOo0000O;
import com.ninja.engine.InterfaceC1665ooO00o00;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IAppOpsManagerProxy extends BinderInvocationStub {

    @ProxyMethod("checkOpNoThrow")
    /* loaded from: classes.dex */
    public static class CheckOpNoThrow extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String str = (String) objArr[0];
                if (str != null && IAppOpsManagerProxy.isMediaStorageOrAudioOp(str)) {
                    return 0;
                }
            } catch (Throwable unused) {
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("checkOperation")
    /* loaded from: classes.dex */
    public static class CheckOperation extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastUid(objArr);
            try {
                String opPublicName = IAppOpsManagerProxy.getOpPublicName(((Integer) objArr[0]).intValue());
                if (opPublicName != null && IAppOpsManagerProxy.isMediaStorageOrAudioOp(opPublicName)) {
                    return 0;
                }
            } catch (Throwable unused) {
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("checkPackage")
    /* loaded from: classes.dex */
    public static class CheckPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("finishOp")
    /* loaded from: classes.dex */
    public static class FinishOp extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String opPublicName = IAppOpsManagerProxy.getOpPublicName(((Integer) objArr[0]).intValue());
                if (opPublicName != null) {
                    IAppOpsManagerProxy.isMediaStorageOrAudioOp(opPublicName);
                    return null;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @ProxyMethod("noteOp")
    /* loaded from: classes.dex */
    public static class NoteOp extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String opPublicName = IAppOpsManagerProxy.getOpPublicName(((Integer) objArr[0]).intValue());
                if (opPublicName != null && (opPublicName.contains("RECORD_AUDIO") || opPublicName.contains("AUDIO") || opPublicName.contains("MICROPHONE"))) {
                    return 0;
                }
            } catch (Throwable unused) {
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("noteOpNoThrow")
    /* loaded from: classes.dex */
    public static class NoteOpNoThrow extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String opPublicName = IAppOpsManagerProxy.getOpPublicName(((Integer) objArr[0]).intValue());
                if (opPublicName != null && (opPublicName.contains("RECORD_AUDIO") || opPublicName.contains("AUDIO") || opPublicName.contains("MICROPHONE"))) {
                    return 0;
                }
            } catch (Throwable unused) {
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("noteOperation")
    /* loaded from: classes.dex */
    public static class NoteOperation extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String opPublicName = IAppOpsManagerProxy.getOpPublicName(((Integer) objArr[0]).intValue());
                if (opPublicName != null && IAppOpsManagerProxy.isMediaStorageOrAudioOp(opPublicName)) {
                    return 0;
                }
            } catch (Throwable unused) {
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("noteProxyOperation")
    /* loaded from: classes.dex */
    public static class NoteProxyOperation extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("startOp")
    /* loaded from: classes.dex */
    public static class StartOp extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String opPublicName = IAppOpsManagerProxy.getOpPublicName(((Integer) objArr[0]).intValue());
                if (opPublicName != null && IAppOpsManagerProxy.isMediaStorageOrAudioOp(opPublicName)) {
                    return 0;
                }
            } catch (Throwable unused) {
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("startOpNoThrow")
    /* loaded from: classes.dex */
    public static class StartOpNoThrow extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String str = (String) objArr[0];
                if (str != null && IAppOpsManagerProxy.isMediaStorageOrAudioOp(str)) {
                    return 0;
                }
            } catch (Throwable unused) {
            }
            return method.invoke(obj, objArr);
        }
    }

    public IAppOpsManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("appops"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getOpPublicName(int i) {
        try {
            Object invoke = AppOpsManager.class.getMethod("opToPublicName", Integer.TYPE).invoke(null, Integer.valueOf(i));
            if (invoke != null) {
                return invoke.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMediaStorageOrAudioOp(String str) {
        if (str == null) {
            return false;
        }
        String upperCase = str.toUpperCase();
        return upperCase.contains("READ_MEDIA") || upperCase.contains("READ_EXTERNAL_STORAGE") || upperCase.contains("RECORD_AUDIO") || upperCase.contains("CAPTURE_AUDIO_OUTPUT") || upperCase.contains("MODIFY_AUDIO_SETTINGS") || upperCase.contains("AUDIO") || upperCase.contains("MICROPHONE") || upperCase.contains("FOREGROUND_SERVICE") || upperCase.contains("SYSTEM_ALERT_WINDOW") || upperCase.contains("WRITE_SETTINGS") || upperCase.contains("ACCESS_FINE_LOCATION") || upperCase.contains("ACCESS_COARSE_LOCATION") || upperCase.contains("CAMERA") || upperCase.contains("BODY_SENSORS") || upperCase.contains("BLUETOOTH_SCAN") || upperCase.contains("BLUETOOTH_CONNECT") || upperCase.contains("BLUETOOTH_ADVERTISE") || upperCase.contains("NEARBY_WIFI_DEVICES") || upperCase.contains("POST_NOTIFICATIONS");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1147oOo0000O) C0217o00o0oO0.create(InterfaceC1147oOo0000O.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("appops"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        if (((InterfaceC1665ooO00o00) C0217o00o0oO0.create(InterfaceC1665ooO00o00.class, null, false))._check_mService() != null) {
            try {
                ((InterfaceC1665ooO00o00) C0217o00o0oO0.create(InterfaceC1665ooO00o00.class, (AppOpsManager) BlackBoxCore.getContext().getSystemService("appops"), false))._set_mService(getProxyInvocation());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        replaceSystemService("appops");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            MethodParameterUtils.replaceLastUid(objArr);
            return super.invoke(obj, method, objArr);
        } catch (SecurityException unused) {
            return 0;
        } catch (Exception unused2) {
            method.getName();
            return super.invoke(obj, method, objArr);
        }
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


