package com.app.framework.fake.service.base;

import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.hook.MethodHook;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class UidMethodProxy extends MethodHook {
    private final int index;
    private final String name;

    public UidMethodProxy(String str, int i) {
        this.index = i;
        this.name = str;
    }

    @Override // com.app.framework.fake.hook.MethodHook
    public String getMethodName() {
        return this.name;
    }

    @Override // com.app.framework.fake.hook.MethodHook
    public Object hook(Object obj, Method method, Object[] objArr) {
        if (((Integer) objArr[this.index]).intValue() == BActivityThread.getBUid()) {
            objArr[this.index] = Integer.valueOf(BlackBoxCore.getHostUid());
        }
        return method.invoke(obj, objArr);
    }
}
