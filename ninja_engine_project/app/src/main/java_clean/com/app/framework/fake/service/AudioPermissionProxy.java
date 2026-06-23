package com.app.framework.fake.service;

import android.os.IBinder;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class AudioPermissionProxy extends BinderInvocationStub {
    public static final String TAG = "AudioPermissionProxy";

    @ProxyMethod("abandonAudioFocus")
    /* loaded from: classes.dex */
    public static class AbandonAudioFocus extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getMode")
    /* loaded from: classes.dex */
    public static class GetMode extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getRecordingState")
    /* loaded from: classes.dex */
    public static class GetRecordingState extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getRecordingStateForUser")
    /* loaded from: classes.dex */
    public static class GetRecordingStateForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getStreamMaxVolume")
    /* loaded from: classes.dex */
    public static class GetStreamMaxVolume extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getStreamVolume")
    /* loaded from: classes.dex */
    public static class GetStreamVolume extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("isBluetoothScoOn")
    /* loaded from: classes.dex */
    public static class IsBluetoothScoOn extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("isMicrophoneMuted")
    /* loaded from: classes.dex */
    public static class IsMicrophoneMuted extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("isMicrophoneMutedForUser")
    /* loaded from: classes.dex */
    public static class IsMicrophoneMutedForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("isRecordingActive")
    /* loaded from: classes.dex */
    public static class IsRecordingActive extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("isSpeakerphoneOn")
    /* loaded from: classes.dex */
    public static class IsSpeakerphoneOn extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("isStreamMute")
    /* loaded from: classes.dex */
    public static class IsStreamMute extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerAudioFocusClient")
    /* loaded from: classes.dex */
    public static class RegisterAudioFocusClient extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("requestAudioFocus")
    /* loaded from: classes.dex */
    public static class RequestAudioFocus extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setBluetoothScoOn")
    /* loaded from: classes.dex */
    public static class SetBluetoothScoOn extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setMicrophoneMute")
    /* loaded from: classes.dex */
    public static class SetMicrophoneMute extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                objArr[0] = Boolean.FALSE;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setMicrophoneMuteForUser")
    /* loaded from: classes.dex */
    public static class SetMicrophoneMuteForUser extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 1) {
                objArr[1] = Boolean.FALSE;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setMode")
    /* loaded from: classes.dex */
    public static class SetMode extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setSpeakerphoneOn")
    /* loaded from: classes.dex */
    public static class SetSpeakerphoneOn extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setStreamMute")
    /* loaded from: classes.dex */
    public static class SetStreamMute extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setStreamVolume")
    /* loaded from: classes.dex */
    public static class SetStreamVolume extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("startRecording")
    /* loaded from: classes.dex */
    public static class StartRecording extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("stopRecording")
    /* loaded from: classes.dex */
    public static class StopRecording extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("unregisterAudioFocusClient")
    /* loaded from: classes.dex */
    public static class UnregisterAudioFocusClient extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    public AudioPermissionProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("audio"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        Object invoke;
        IBinder service = AbstractC0694o0ooooo0.OooO0OO().getService("audio");
        if (service == null) {
            return null;
        }
        try {
            invoke = Class.forName("android.media.IAudioService$Stub").getMethod("asInterface", IBinder.class).invoke(null, service);
        } catch (Exception unused) {
        }
        if (invoke != null) {
            return invoke;
        }
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("audio");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


