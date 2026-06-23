package com.app.framework.fake.service.context.providers;

import android.os.Bundle;
import android.os.IInterface;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.utils.compat.ContextCompat;
import com.ninja.engine.InterfaceC2003oooOOOoO;
import com.ninja.engine.o0O00OOO;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SystemProviderStub extends ClassInvocationStub implements BContentProvider {
    private IInterface mBase;

    private boolean isConfigStyleCall(Method method, Object[] objArr) {
        if (method == null || !"call".equals(method.getName()) || objArr == null || objArr.length == 0) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        for (Object obj : objArr) {
            if (obj instanceof String) {
                String lowerCase = ((String) obj).toLowerCase();
                z2 = ("settings".equals(lowerCase) || lowerCase.contains("settings")) ? true : true;
                if (lowerCase.contains("config")) {
                    z = true;
                }
            }
        }
        if (z) {
            return z2 || objArr.length >= 3;
        }
        return false;
    }

    private boolean isSystemProviderAuthority(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("settings") || str.equals("media") || str.equals("downloads") || str.equals("contacts") || str.equals("call_log") || str.equals("telephony") || str.equals("calendar") || str.equals("browser") || str.equals("user_dictionary") || str.equals("applications") || str.startsWith("com.android.") || str.startsWith("android.");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return this.mBase;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if ("asBinder".equals(method.getName())) {
            return method.invoke(this.mBase, objArr);
        }
        if (objArr != null && objArr.length > 0) {
            Object obj2 = objArr[0];
            if (obj2 instanceof String) {
                if (!isSystemProviderAuthority((String) obj2)) {
                    objArr[0] = BlackBoxCore.getHostPkg();
                }
            } else if (obj2 != null && obj2.getClass().getName().equals(o0O00OOO.classReady(InterfaceC2003oooOOOoO.class).getName())) {
                ContextCompat.fixAttributionSourceState(obj2, BlackBoxCore.getHostUid());
            }
        }
        Object invoke = method.invoke(this.mBase, objArr);
        if (isConfigStyleCall(method, objArr)) {
            if (invoke == null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("value", new HashMap());
                return bundle;
            } else if (invoke instanceof Bundle) {
                Bundle bundle2 = (Bundle) invoke;
                if (!(bundle2.get("value") instanceof Map)) {
                    bundle2.putSerializable("value", new HashMap());
                }
            }
        }
        return invoke;
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
    }

    @Override // com.app.framework.fake.service.context.providers.BContentProvider
    public IInterface wrapper(IInterface iInterface, String str) {
        this.mBase = iInterface;
        injectHook();
        return (IInterface) getProxyInvocation();
    }
}


