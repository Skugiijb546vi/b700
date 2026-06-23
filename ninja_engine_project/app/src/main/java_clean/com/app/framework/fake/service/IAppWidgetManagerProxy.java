package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.service.base.ValueMethodProxy;
import com.app.framework.utils.MethodParameterUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1014oOOOo000;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IAppWidgetManagerProxy extends BinderInvocationStub {
    public IAppWidgetManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("appwidget"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1014oOOOo000) C0217o00o0oO0.create(InterfaceC1014oOOOo000.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("appwidget"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("appwidget");
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
        addMethodHook(new ValueMethodProxy("startListening", new int[0]));
        addMethodHook(new ValueMethodProxy("stopListening", 0));
        addMethodHook(new ValueMethodProxy("allocateAppWidgetId", 0));
        addMethodHook(new ValueMethodProxy("deleteAppWidgetId", 0));
        addMethodHook(new ValueMethodProxy("deleteHost", 0));
        addMethodHook(new ValueMethodProxy("deleteAllHosts", 0));
        addMethodHook(new ValueMethodProxy("getAppWidgetViews", null));
        addMethodHook(new ValueMethodProxy("getAppWidgetIdsForHost", null));
        addMethodHook(new ValueMethodProxy("createAppWidgetConfigIntentSender", null));
        addMethodHook(new ValueMethodProxy("updateAppWidgetIds", 0));
        addMethodHook(new ValueMethodProxy("updateAppWidgetOptions", 0));
        addMethodHook(new ValueMethodProxy("getAppWidgetOptions", null));
        addMethodHook(new ValueMethodProxy("partiallyUpdateAppWidgetIds", 0));
        addMethodHook(new ValueMethodProxy("updateAppWidgetProvider", 0));
        addMethodHook(new ValueMethodProxy("notifyAppWidgetViewDataChanged", 0));
        addMethodHook(new ValueMethodProxy("getInstalledProvidersForProfile", null));
        addMethodHook(new ValueMethodProxy("getAppWidgetInfo", null));
        Boolean bool = Boolean.FALSE;
        addMethodHook(new ValueMethodProxy("hasBindAppWidgetPermission", bool));
        addMethodHook(new ValueMethodProxy("setBindAppWidgetPermission", 0));
        addMethodHook(new ValueMethodProxy("bindAppWidgetId", bool));
        addMethodHook(new ValueMethodProxy("bindRemoteViewsService", 0));
        addMethodHook(new ValueMethodProxy("unbindRemoteViewsService", 0));
        addMethodHook(new ValueMethodProxy("getAppWidgetIds", new int[0]));
        addMethodHook(new ValueMethodProxy("isBoundWidgetPackage", bool));
    }
}


