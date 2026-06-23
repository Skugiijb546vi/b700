package com.app.framework.fake.service;

import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IPhoneSubInfoProxy extends ClassInvocationStub {
    public static final String TAG = "IPhoneSubInfoProxy";

    @ProxyMethod("getLine1NumberForSubscriber")
    /* loaded from: classes.dex */
    public static class getLine1NumberForSubscriber extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    public IPhoneSubInfoProxy() {
        if (AbstractC0694o0ooooo0.OooO00o()._check_sServiceHandleCacheEnabled() != null) {
            AbstractC0694o0ooooo0.OooO00o()._set_sServiceHandleCacheEnabled(Boolean.TRUE);
        }
        if (AbstractC0694o0ooooo0.OooO00o()._check_getSubscriberInfoService() != null) {
            AbstractC0694o0ooooo0.OooO00o().getSubscriberInfoService();
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return AbstractC0694o0ooooo0.OooO00o().sIPhoneSubInfo();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        AbstractC0694o0ooooo0.OooO00o()._set_sIPhoneSubInfo(obj2);
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
