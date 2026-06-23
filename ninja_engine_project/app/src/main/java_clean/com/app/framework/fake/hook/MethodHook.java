package com.app.framework.fake.hook;

import com.app.framework.BlackBoxCore;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class MethodHook {
    public Object afterHook(Object obj) {
        return obj;
    }

    public Object beforeHook(Object obj, Method method, Object[] objArr) {
        return null;
    }

    public String getMethodName() {
        return null;
    }

    public abstract Object hook(Object obj, Method method, Object[] objArr);

    public boolean isEnable() {
        return BlackBoxCore.get().isBlackProcess();
    }
}


