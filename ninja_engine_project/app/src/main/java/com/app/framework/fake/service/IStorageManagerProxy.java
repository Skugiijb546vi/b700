package com.app.framework.fake.service;

import android.os.storage.StorageVolume;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1592oo0oOO0o;
import com.ninja.engine.InterfaceC1971oooO0o;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IStorageManagerProxy extends BinderInvocationStub {

    @ProxyMethod("getVolumeList")
    /* loaded from: classes.dex */
    public static class GetVolumeList extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                StorageVolume[] volumeList = BlackBoxCore.getBStorageManager().getVolumeList(BActivityThread.getBUid(), null, 0, BActivityThread.getUserId());
                return volumeList == null ? method.invoke(obj, objArr) : volumeList;
            }
            try {
                StorageVolume[] volumeList2 = BlackBoxCore.getBStorageManager().getVolumeList(((Integer) objArr[0]).intValue(), (String) objArr[1], ((Integer) objArr[2]).intValue(), BActivityThread.getUserId());
                return volumeList2 == null ? method.invoke(obj, objArr) : volumeList2;
            } catch (Throwable unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("mkdirs")
    /* loaded from: classes.dex */
    public static class mkdirs extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public IStorageManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("mount"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return BuildCompat.isOreo() ? ((InterfaceC1971oooO0o) C0217o00o0oO0.create(InterfaceC1971oooO0o.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("mount")) : ((InterfaceC1592oo0oOO0o) C0217o00o0oO0.create(InterfaceC1592oo0oOO0o.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("mount"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("mount");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
