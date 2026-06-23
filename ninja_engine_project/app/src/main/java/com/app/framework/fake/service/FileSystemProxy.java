package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.io.File;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class FileSystemProxy extends ClassInvocationStub {
    public static final String TAG = "FileSystemProxy";

    @ProxyMethod("isDirectory")
    /* loaded from: classes.dex */
    public static class IsDirectory extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String absolutePath = ((File) obj).getAbsolutePath();
                if (!absolutePath.contains("Helium Crashpad") && !absolutePath.contains("HeliumCrashReporter")) {
                    return method.invoke(obj, objArr);
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    @ProxyMethod("mkdir")
    /* loaded from: classes.dex */
    public static class Mkdir extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String absolutePath = ((File) obj).getAbsolutePath();
                if (!absolutePath.contains("Helium Crashpad") && !absolutePath.contains("HeliumCrashReporter")) {
                    return method.invoke(obj, objArr);
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("mkdirs")
    /* loaded from: classes.dex */
    public static class Mkdirs extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String absolutePath = ((File) obj).getAbsolutePath();
                if (!absolutePath.contains("Helium Crashpad") && !absolutePath.contains("HeliumCrashReporter")) {
                    return method.invoke(obj, objArr);
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
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
