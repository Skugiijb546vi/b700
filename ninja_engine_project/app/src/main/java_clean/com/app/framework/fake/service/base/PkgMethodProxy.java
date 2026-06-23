package com.app.framework.fake.service.base;

import com.app.framework.fake.hook.MethodHook;
import com.app.framework.utils.MethodParameterUtils;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class PkgMethodProxy extends MethodHook {
    String mName;

    public PkgMethodProxy(String str) {
        this.mName = str;
    }

    @Override // com.app.framework.fake.hook.MethodHook
    public String getMethodName() {
        return this.mName;
    }

    @Override // com.app.framework.fake.hook.MethodHook
    public Object hook(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return method.invoke(obj, objArr);
    }
}


