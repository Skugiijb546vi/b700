package com.ninja.engine;

import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.oOo000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1145oOo000 extends Drawable {
    public static final double OooO00o = Math.cos(Math.toRadians(45.0d));

    public static float OooO00o(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - OooO00o) * f2) + f);
        }
        return f;
    }

    public static float OooO0O0(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (z) {
            return (float) (((1.0d - OooO00o) * f2) + f3);
        }
        return f3;
    }
}
