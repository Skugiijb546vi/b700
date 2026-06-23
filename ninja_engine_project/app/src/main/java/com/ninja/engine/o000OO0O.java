package com.ninja.engine;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes.dex */
public abstract class o000OO0O {
    public static final LinearInterpolator OooO00o = new LinearInterpolator();
    public static final C0534o0o0O0o OooO0O0 = new C0534o0o0O0o(1);
    public static final C0534o0o0O0o OooO0OO = new C0534o0o0O0o(0);
    public static final C0534o0o0O0o OooO0Oo = new C0534o0o0O0o(2);

    static {
        new DecelerateInterpolator();
    }

    public static float OooO00o(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float OooO0O0(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return OooO00o(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int OooO0OO(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
