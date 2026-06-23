package com.app.framework.fake.service;

import android.content.Intent;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.service.base.PkgMethodProxy;
import com.app.framework.utils.MethodParameterUtils;
import com.app.framework.utils.compat.ParceledListSliceCompat;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1684ooO0O0o;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class IShortcutManagerProxy extends BinderInvocationStub {

    @ProxyMethod("addDynamicShortcuts")
    /* loaded from: classes.dex */
    public static class AddDynamicShortcuts extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("createShortcutResultIntent")
    /* loaded from: classes.dex */
    public static class CreateShortcutResultIntent extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return new Intent();
        }
    }

    @ProxyMethod("requestPinShortcut")
    /* loaded from: classes.dex */
    public static class RequestPinShortcut extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setDynamicShortcuts")
    /* loaded from: classes.dex */
    public static class SetDynamicShortcuts extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("pushDynamicShortcut")
    /* loaded from: classes.dex */
    public static class pushDynamicShortcut extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public IShortcutManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("shortcut"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1684ooO0O0o) C0217o00o0oO0.create(InterfaceC1684ooO0O0o.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("shortcut"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("shortcut");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceAllAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new PkgMethodProxy("getShortcuts"));
        addMethodHook(new PkgMethodProxy("disableShortcuts"));
        addMethodHook(new PkgMethodProxy("enableShortcuts"));
        addMethodHook(new PkgMethodProxy("getRemainingCallCount"));
        addMethodHook(new PkgMethodProxy("getRateLimitResetTime"));
        addMethodHook(new PkgMethodProxy("getIconMaxDimensions"));
        addMethodHook(new PkgMethodProxy("getMaxShortcutCountPerActivity"));
        addMethodHook(new PkgMethodProxy("reportShortcutUsed"));
        addMethodHook(new PkgMethodProxy("onApplicationActive"));
        addMethodHook(new PkgMethodProxy("hasShortcutHostPermission"));
        addMethodHook(new PkgMethodProxy("removeAllDynamicShortcuts"));
        addMethodHook(new PkgMethodProxy("removeDynamicShortcuts"));
        addMethodHook(new PkgMethodProxy("removeLongLivedShortcuts"));
        addMethodHook(new PkgMethodProxy("getManifestShortcuts") { // from class: com.app.framework.fake.service.IShortcutManagerProxy.1
            @Override // com.app.framework.fake.service.base.PkgMethodProxy, com.app.framework.fake.hook.MethodHook
            public Object hook(Object obj, Method method, Object[] objArr) {
                return ParceledListSliceCompat.create(new ArrayList());
            }
        });
    }
}


