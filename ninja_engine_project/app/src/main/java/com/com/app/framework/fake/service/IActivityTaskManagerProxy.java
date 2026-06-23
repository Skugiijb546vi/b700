package com.app.framework.fake.service;

import android.app.ActivityManager;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.hook.ScanClass;
import com.app.framework.utils.compat.TaskDescriptionCompat;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0148o00OOOo0;
import com.ninja.engine.InterfaceC1410oo00Oo0O;
import com.ninja.engine.InterfaceC2073oooo0oO;
import java.lang.reflect.Method;
@ScanClass({ActivityManagerCommonProxy.class})
/* loaded from: classes.dex */
public class IActivityTaskManagerProxy extends BinderInvocationStub {
    public static final String TAG = "ActivityTaskManager";

    @ProxyMethod("setTaskDescription")
    /* loaded from: classes.dex */
    public static class SetTaskDescription extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[1] = TaskDescriptionCompat.fix((ActivityManager.TaskDescription) objArr[1]);
            return method.invoke(obj, objArr);
        }
    }

    public IActivityTaskManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("activity_task"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC0148o00OOOo0) C0217o00o0oO0.create(InterfaceC0148o00OOOo0.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("activity_task"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("activity_task");
        ((InterfaceC2073oooo0oO) C0217o00o0oO0.create(InterfaceC2073oooo0oO.class, null, false)).getService();
        ((InterfaceC1410oo00Oo0O) C0217o00o0oO0.create(InterfaceC1410oo00Oo0O.class, ((InterfaceC2073oooo0oO) C0217o00o0oO0.create(InterfaceC2073oooo0oO.class, null, false)).IActivityTaskManagerSingleton(), false))._set_mInstance(((InterfaceC0148o00OOOo0) C0217o00o0oO0.create(InterfaceC0148o00OOOo0.class, null, false)).asInterface(this));
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
