package com.app.framework.fake.service.base;

import com.app.framework.fake.hook.MethodHook;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ValueMethodProxy extends MethodHook {
    String mName;
    Object mValue;

    public ValueMethodProxy(String str, Object obj) {
        this.mValue = obj;
        this.mName = str;
    }

    @Override // com.app.framework.fake.hook.MethodHook
    public String getMethodName() {
        return this.mName;
    }

    @Override // com.app.framework.fake.hook.MethodHook
    public Object hook(Object obj, Method method, Object[] objArr) {
        return this.mValue;
    }
}


