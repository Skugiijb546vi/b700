package com.ninja.engine;

import android.os.Build;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.o00o0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0216o00o0oO {
    public static final Object OooO00o;
    public static final Method OooO0O0;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                OooO0O0 = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                OooO00o = ((Method) declaredMethod2.invoke(cls, "getRuntime", null)).invoke(null, null);
            } catch (Throwable unused) {
            }
        }
    }
}


