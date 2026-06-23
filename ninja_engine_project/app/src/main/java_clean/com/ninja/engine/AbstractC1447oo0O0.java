package com.ninja.engine;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1447oo0O0 {
    public static final Method OooO00o;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                OooO00o = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    public static float OooO00o(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = OooO00o) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}


