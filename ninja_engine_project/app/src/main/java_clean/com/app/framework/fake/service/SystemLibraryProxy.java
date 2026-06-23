package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class SystemLibraryProxy extends ClassInvocationStub {
    public static final String TAG = "SystemLibraryProxy";

    @ProxyMethod("load")
    /* loaded from: classes.dex */
    public static class Load extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.contains("libc++_shared.so") || str.contains("c++_shared") || str.contains("flutter") || str.contains("meemo")) {
                        return null;
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("loadLibrary")
    /* loaded from: classes.dex */
    public static class LoadLibrary extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.equals("anybrainSDK")) {
                        throw new UnsatisfiedLinkError("Library anybrainSDK not available");
                    }
                    if (str.equals("c++_shared") || str.contains("c++") || str.contains("flutter") || str.contains("meemo")) {
                        return null;
                    }
                }
            }
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


