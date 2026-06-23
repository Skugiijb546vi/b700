package com.app.framework.fake.service;

import android.os.IInterface;
import android.view.WindowManager;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IWindowSessionProxy extends BinderInvocationStub {
    public static final String TAG = "WindowSessionStub";
    private IInterface mSession;

    @ProxyMethod("addToDisplay")
    /* loaded from: classes.dex */
    public static class AddToDisplay extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            for (Object obj2 : objArr) {
                if (obj2 != null && (obj2 instanceof WindowManager.LayoutParams)) {
                    ((WindowManager.LayoutParams) obj2).packageName = BlackBoxCore.getHostPkg();
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("addToDisplayAsUser")
    /* loaded from: classes.dex */
    public static class AddToDisplayAsUser extends AddToDisplay {
    }

    public IWindowSessionProxy(IInterface iInterface) {
        super(iInterface.asBinder());
        this.mSession = iInterface;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getProxyInvocation() {
        return super.getProxyInvocation();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return this.mSession;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
