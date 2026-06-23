package com.ninja.engine;
/* renamed from: com.ninja.engine.oOoOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242oOoOoOo {
    public double OooO;
    public double OooO00o;
    public double OooO0O0;
    public boolean OooO0OO;
    public double OooO0Oo;
    public double OooO0o;
    public double OooO0o0;
    public double OooO0oO;
    public double OooO0oo;
    public final C0437o0OoO0OO OooOO0;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ninja.engine.o0OoO0OO, java.lang.Object] */
    public C1242oOoOoOo() {
        this.OooO00o = Math.sqrt(1500.0d);
        this.OooO0O0 = 0.5d;
        this.OooO0OO = false;
        this.OooO = Double.MAX_VALUE;
        this.OooOO0 = new Object();
    }

    public final C0437o0OoO0OO OooO00o(double d, double d2, long j) {
        double cos;
        double d3;
        if (!this.OooO0OO) {
            if (this.OooO != Double.MAX_VALUE) {
                double d4 = this.OooO0O0;
                if (d4 > 1.0d) {
                    double d5 = this.OooO00o;
                    this.OooO0o = (Math.sqrt((d4 * d4) - 1.0d) * d5) + ((-d4) * d5);
                    double d6 = this.OooO0O0;
                    double d7 = this.OooO00o;
                    this.OooO0oO = ((-d6) * d7) - (Math.sqrt((d6 * d6) - 1.0d) * d7);
                } else if (d4 >= 0.0d && d4 < 1.0d) {
                    this.OooO0oo = Math.sqrt(1.0d - (d4 * d4)) * this.OooO00o;
                }
                this.OooO0OO = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d8 = j / 1000.0d;
        double d9 = d - this.OooO;
        double d10 = this.OooO0O0;
        if (d10 > 1.0d) {
            double d11 = this.OooO0oO;
            double d12 = this.OooO0o;
            double d13 = d9 - (((d11 * d9) - d2) / (d11 - d12));
            double d14 = ((d9 * d11) - d2) / (d11 - d12);
            d3 = (Math.pow(2.718281828459045d, this.OooO0o * d8) * d14) + (Math.pow(2.718281828459045d, d11 * d8) * d13);
            double d15 = this.OooO0oO;
            double pow = Math.pow(2.718281828459045d, d15 * d8) * d13 * d15;
            double d16 = this.OooO0o;
            cos = (Math.pow(2.718281828459045d, d16 * d8) * d14 * d16) + pow;
        } else if (d10 == 1.0d) {
            double d17 = this.OooO00o;
            double d18 = (d17 * d9) + d2;
            double d19 = (d18 * d8) + d9;
            double pow2 = Math.pow(2.718281828459045d, (-d17) * d8) * d19;
            double pow3 = Math.pow(2.718281828459045d, (-this.OooO00o) * d8) * d19;
            double d20 = this.OooO00o;
            cos = (Math.pow(2.718281828459045d, (-d20) * d8) * d18) + (pow3 * (-d20));
            d3 = pow2;
        } else {
            double d21 = 1.0d / this.OooO0oo;
            double d22 = this.OooO00o;
            double d23 = ((d10 * d22 * d9) + d2) * d21;
            double sin = ((Math.sin(this.OooO0oo * d8) * d23) + (Math.cos(this.OooO0oo * d8) * d9)) * Math.pow(2.718281828459045d, (-d10) * d22 * d8);
            double d24 = this.OooO00o;
            double d25 = this.OooO0O0;
            double d26 = (-d24) * sin * d25;
            double pow4 = Math.pow(2.718281828459045d, (-d25) * d24 * d8);
            double d27 = this.OooO0oo;
            double d28 = (-d27) * d9;
            double d29 = this.OooO0oo;
            cos = (((Math.cos(d29 * d8) * d23 * d29) + (Math.sin(d27 * d8) * d28)) * pow4) + d26;
            d3 = sin;
        }
        C0437o0OoO0OO c0437o0OoO0OO = this.OooOO0;
        c0437o0OoO0OO.OooO00o = (float) (d3 + this.OooO);
        c0437o0OoO0OO.OooO0O0 = (float) cos;
        return c0437o0OoO0OO;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ninja.engine.o0OoO0OO, java.lang.Object] */
    public C1242oOoOoOo(float f) {
        this.OooO00o = Math.sqrt(1500.0d);
        this.OooO0O0 = 0.5d;
        this.OooO0OO = false;
        this.OooOO0 = new Object();
        this.OooO = f;
    }
}
