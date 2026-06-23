package com.app.framework.fake.service;

import com.android.volley.BuildConfig;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class MediaRecorderClassProxy extends ClassInvocationStub {
    public static final String TAG = "MediaRecorderClassProxy";

    @ProxyMethod("<init>")
    /* loaded from: classes.dex */
    public static class Constructor extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("prepare")
    /* loaded from: classes.dex */
    public static class Prepare extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod(BuildConfig.BUILD_TYPE)
    /* loaded from: classes.dex */
    public static class Release extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("reset")
    /* loaded from: classes.dex */
    public static class Reset extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setAudioEncoder")
    /* loaded from: classes.dex */
    public static class SetAudioEncoder extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setAudioSource")
    /* loaded from: classes.dex */
    public static class SetAudioSource extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setOutputFile")
    /* loaded from: classes.dex */
    public static class SetOutputFile extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setOutputFormat")
    /* loaded from: classes.dex */
    public static class SetOutputFormat extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("start")
    /* loaded from: classes.dex */
    public static class Start extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("stop")
    /* loaded from: classes.dex */
    public static class Stop extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
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
