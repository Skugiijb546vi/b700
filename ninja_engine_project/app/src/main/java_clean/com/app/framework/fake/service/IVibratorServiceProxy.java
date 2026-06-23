package com.app.framework.fake.service;

import android.os.IBinder;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.utils.MethodParameterUtils;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1737ooO0oo0O;
import com.ninja.engine.InterfaceC1848ooOo0OOo;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IVibratorServiceProxy extends BinderInvocationStub {
    private static String NAME;

    static {
        NAME = BuildCompat.isS() ? "vibrator_manager" : "vibrator";
    }

    public IVibratorServiceProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService(NAME));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        IBinder service = AbstractC0694o0ooooo0.OooO0OO().getService(NAME);
        return BuildCompat.isS() ? ((InterfaceC1737ooO0oo0O) C0217o00o0oO0.create(InterfaceC1737ooO0oo0O.class, null, false)).asInterface(service) : ((InterfaceC1848ooOo0OOo) C0217o00o0oO0.create(InterfaceC1848ooOo0OOo.class, null, false)).asInterface(service);
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(NAME);
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstUid(objArr);
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


