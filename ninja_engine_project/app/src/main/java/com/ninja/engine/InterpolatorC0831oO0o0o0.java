package com.ninja.engine;

import android.view.animation.Interpolator;
/* renamed from: com.ninja.engine.oO0o0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class InterpolatorC0831oO0o0o0 implements Interpolator {
    public final float[] OooO00o;
    public final float OooO0O0;

    public InterpolatorC0831oO0o0o0(float[] fArr) {
        this.OooO00o = fArr;
        this.OooO0O0 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.OooO00o;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.OooO0O0;
        float f3 = fArr[min];
        return ((fArr[min + 1] - f3) * ((f - (min * f2)) / f2)) + f3;
    }
}

