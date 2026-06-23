package com.app.framework.fake.service.libcore;

import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.IOCore;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.Reflector;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1868ooOoO0O0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class OsStub extends ClassInvocationStub {
    public static final String TAG = "OsStub";
    private Object mBase = ((InterfaceC1868ooOoO0O0) C0217o00o0oO0.create(InterfaceC1868ooOoO0O0.class, null, false)).os();

    @ProxyMethod("getuid")
    /* loaded from: classes.dex */
    public static class getuid extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(OsStub.getFakeUid(((Integer) method.invoke(obj, objArr)).intValue()));
        }
    }

    @ProxyMethod("stat")
    /* loaded from: classes.dex */
    public static class stat extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                Reflector.with(invoke).field("st_uid").set(Integer.valueOf(OsStub.getFakeUid(-1)));
                return invoke;
            } catch (Throwable th) {
                throw th.getCause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFakeUid(int i) {
        return (i <= 0 || i > 10000) ? (BActivityThread.isThreadInit() && BActivityThread.currentActivityThread().isInit()) ? BActivityThread.getBAppId() : BlackBoxCore.getHostUid() : i;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return this.mBase;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        ((InterfaceC1868ooOoO0O0) C0217o00o0oO0.create(InterfaceC1868ooOoO0O0.class, null, false))._set_os(obj2);
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 != null && (obj2 instanceof String) && ((String) obj2).startsWith("/")) {
                    objArr[i] = IOCore.get().redirectPath((String) objArr[i]);
                }
            }
        }
        return super.invoke(obj, method, objArr);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return ((InterfaceC1868ooOoO0O0) C0217o00o0oO0.create(InterfaceC1868ooOoO0O0.class, null, false)).os() != getProxyInvocation();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
    }
}


