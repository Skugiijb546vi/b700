package com.ninja.engine;

import android.animation.TypeEvaluator;
/* renamed from: com.ninja.engine.o000O0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080o000O0o0 implements TypeEvaluator {
    public C0989oOOO0oo0[] OooO00o;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C0989oOOO0oo0[] c0989oOOO0oo0Arr = (C0989oOOO0oo0[]) obj;
        C0989oOOO0oo0[] c0989oOOO0oo0Arr2 = (C0989oOOO0oo0[]) obj2;
        if (AbstractC0694o0ooooo0.OooO0o(c0989oOOO0oo0Arr, c0989oOOO0oo0Arr2)) {
            if (!AbstractC0694o0ooooo0.OooO0o(this.OooO00o, c0989oOOO0oo0Arr)) {
                this.OooO00o = AbstractC0694o0ooooo0.OooOOo(c0989oOOO0oo0Arr);
            }
            for (int i = 0; i < c0989oOOO0oo0Arr.length; i++) {
                C0989oOOO0oo0 c0989oOOO0oo0 = this.OooO00o[i];
                C0989oOOO0oo0 c0989oOOO0oo02 = c0989oOOO0oo0Arr[i];
                C0989oOOO0oo0 c0989oOOO0oo03 = c0989oOOO0oo0Arr2[i];
                c0989oOOO0oo0.getClass();
                c0989oOOO0oo0.OooO00o = c0989oOOO0oo02.OooO00o;
                int i2 = 0;
                while (true) {
                    float[] fArr = c0989oOOO0oo02.OooO0O0;
                    if (i2 < fArr.length) {
                        c0989oOOO0oo0.OooO0O0[i2] = (c0989oOOO0oo03.OooO0O0[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.OooO00o;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}


