package com.app.framework.fake.service;

import android.app.Notification;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.frameworks.BNotificationManager;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.MethodParameterUtils;
import com.app.framework.utils.compat.BuildCompat;
import com.app.framework.utils.compat.ParceledListSliceCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1601oo0oOo00;
import com.ninja.engine.InterfaceC1743ooOO00;
import com.ninja.engine.Oooo0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class INotificationManagerProxy extends BinderInvocationStub {
    public static final String TAG = "INotificationManagerProxy";

    @ProxyMethod("cancelNotificationWithTag")
    /* loaded from: classes.dex */
    public static class CancelNotificationWithTag extends MethodHook {
        public int getIdIndex() {
            return getTagIndex() + 1;
        }

        public int getTagIndex() {
            return BuildCompat.isR() ? 2 : 1;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[getIdIndex()]).intValue();
            BNotificationManager.get().cancelNotificationWithTag(intValue, (String) objArr[getTagIndex()]);
            return 0;
        }
    }

    @ProxyMethod("createNotificationChannelGroups")
    /* loaded from: classes.dex */
    public static class CreateNotificationChannelGroups extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Iterator<?> it = ((InterfaceC1743ooOO00) C0217o00o0oO0.create(InterfaceC1743ooOO00.class, objArr[1], false)).getList().iterator();
            while (it.hasNext()) {
                BNotificationManager.get().createNotificationChannelGroup(Oooo0.OooO0Oo(it.next()));
            }
            return 0;
        }
    }

    @ProxyMethod("createNotificationChannels")
    /* loaded from: classes.dex */
    public static class CreateNotificationChannels extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            List<?> list = ((InterfaceC1743ooOO00) C0217o00o0oO0.create(InterfaceC1743ooOO00.class, objArr[1], false)).getList();
            if (list == null) {
                return 0;
            }
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                BNotificationManager.get().createNotificationChannel(Oooo0.OooO0O0(it.next()));
            }
            return 0;
        }
    }

    @ProxyMethod("deleteNotificationChannel")
    /* loaded from: classes.dex */
    public static class DeleteNotificationChannel extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BNotificationManager.get().deleteNotificationChannel((String) objArr[1]);
            return 0;
        }
    }

    @ProxyMethod("deleteNotificationChannelGroup")
    /* loaded from: classes.dex */
    public static class DeleteNotificationChannelGroup extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BNotificationManager.get().deleteNotificationChannelGroup((String) objArr[1]);
            return 0;
        }
    }

    @ProxyMethod("enqueueNotificationWithTag")
    /* loaded from: classes.dex */
    public static class EnqueueNotificationWithTag extends MethodHook {
        public int getIdIndex() {
            return getTagIndex() + 1;
        }

        public int getTagIndex() {
            return 2;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[getIdIndex()]).intValue();
            BNotificationManager.get().enqueueNotificationWithTag(intValue, (String) objArr[getTagIndex()], (Notification) MethodParameterUtils.getFirstParam(objArr, Notification.class));
            return 0;
        }
    }

    @ProxyMethod("getNotificationChannel")
    /* loaded from: classes.dex */
    public static class GetNotificationChannel extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BNotificationManager.get().getNotificationChannel((String) objArr[objArr.length - 1]);
        }
    }

    @ProxyMethod("getNotificationChannelGroups")
    /* loaded from: classes.dex */
    public static class GetNotificationChannelGroups extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BNotificationManager.get().getNotificationChannelGroups(BActivityThread.getAppPackageName()));
        }
    }

    @ProxyMethod("getNotificationChannels")
    /* loaded from: classes.dex */
    public static class GetNotificationChannels extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BNotificationManager.get().getNotificationChannels(BActivityThread.getAppPackageName()));
        }
    }

    public INotificationManagerProxy() {
        super(((InterfaceC1601oo0oOo00) C0217o00o0oO0.create(InterfaceC1601oo0oOo00.class, null, false)).getService().asBinder());
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1601oo0oOo00) C0217o00o0oO0.create(InterfaceC1601oo0oOo00.class, null, false)).getService();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        ((InterfaceC1601oo0oOo00) C0217o00o0oO0.create(InterfaceC1601oo0oOo00.class, null, false))._set_sService(getProxyInvocation());
        replaceSystemService("notification");
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
}
