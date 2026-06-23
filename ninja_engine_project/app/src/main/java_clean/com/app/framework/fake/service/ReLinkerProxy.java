package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ReLinkerProxy extends ClassInvocationStub {
    public static final String TAG = "ReLinkerProxy";

    @ProxyMethod("loadLibrary")
    /* loaded from: classes.dex */
    public static class LoadLibrary extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    @ProxyMethod("loadLibrary")
    /* loaded from: classes.dex */
    public static class LoadLibraryWithAllParams extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr == null || objArr.length <= 2) {
                return null;
            }
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            return null;
        }
    }

    @ProxyMethod("loadLibrary")
    /* loaded from: classes.dex */
    public static class LoadLibraryWithContext extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr == null || objArr.length <= 1) {
                return null;
            }
            String str = (String) objArr[1];
            return null;
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


