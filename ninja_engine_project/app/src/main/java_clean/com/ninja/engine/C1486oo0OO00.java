package com.ninja.engine;
/* renamed from: com.ninja.engine.oo0OO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486oo0OO00 {
    public static final C1486oo0OO00 OooOO0O;
    public final float OooO;
    public final float OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public final float OooO0o;
    public final float OooO0o0;
    public final float[] OooO0oO;
    public final float OooO0oo;
    public final float OooOO0;

    static {
        float f;
        float[] fArr = AbstractC0809oO0OooOO.OooO0OO;
        float oo0o0Oo = (float) ((AbstractC0809oO0OooOO.oo0o0Oo() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0809oO0OooOO.OooO00o;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + (fArr3[0] * f2);
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f2 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.69f;
        } else {
            f = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp(((-oo0o0Oo) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * oo0o0Oo) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(oo0o0Oo * 5.0d))) + (f10 * oo0o0Oo);
        float oo0o0Oo2 = AbstractC0809oO0OooOO.oo0o0Oo() / fArr[1];
        double d2 = oo0o0Oo2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        OooOO0O = new C1486oo0OO00(oo0o0Oo2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C1486oo0OO00(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.OooO0o = f;
        this.OooO00o = f2;
        this.OooO0O0 = f3;
        this.OooO0OO = f4;
        this.OooO0Oo = f5;
        this.OooO0o0 = f6;
        this.OooO0oO = fArr;
        this.OooO0oo = f7;
        this.OooO = f8;
        this.OooOO0 = f9;
    }
}


