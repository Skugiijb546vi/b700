package com.app.framework.fake.service;

import android.content.ComponentName;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.proxy.ProxyManifest;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1732ooO0oOoO;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IAutofillManagerProxy extends BinderInvocationStub {
    public static final String TAG = "AutofillManagerStub";

    @ProxyMethod("startSession")
    /* loaded from: classes.dex */
    public static class StartSession extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                for (int i = 0; i < objArr.length; i++) {
                    Object obj2 = objArr[i];
                    if (obj2 != null && (obj2 instanceof ComponentName)) {
                        objArr[i] = new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.getProxyActivity(BlackBoxCore.getAppPid()));
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    public IAutofillManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("autofill"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1732ooO0oOoO) C0217o00o0oO0.create(InterfaceC1732ooO0oOoO.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("autofill"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("autofill");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
