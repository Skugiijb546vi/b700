package com.ninja.engine;
/* renamed from: com.ninja.engine.o0Oo0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416o0Oo0OO {
    public static final C0416o0Oo0OO OooO0O0 = new C0416o0Oo0OO(2);
    public static final C0416o0Oo0OO OooO0OO = new C0416o0Oo0OO(0);
    public static final C0416o0Oo0OO OooO0Oo;
    public static final C0416o0Oo0OO OooO0o;
    public static final C0416o0Oo0OO OooO0o0;
    public static final oOOO00o0 OooO0oO;
    public static final boolean OooO0oo;
    public final /* synthetic */ int OooO00o;

    static {
        C0416o0Oo0OO c0416o0Oo0OO = new C0416o0Oo0OO(1);
        OooO0Oo = c0416o0Oo0OO;
        OooO0o0 = new C0416o0Oo0OO(3);
        OooO0o = c0416o0Oo0OO;
        OooO0oO = oOOO00o0.OooO00o(c0416o0Oo0OO, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        OooO0oo = true;
    }

    public /* synthetic */ C0416o0Oo0OO(int i) {
        this.OooO00o = i;
    }

    public final int OooO00o(int i, int i2, int i3, int i4) {
        switch (this.OooO00o) {
            case 0:
                if (OooO0O0(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return OooO0O0.OooO00o(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                if (OooO0oo) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    public final float OooO0O0(int i, int i2, int i3, int i4) {
        switch (this.OooO00o) {
            case 0:
                return Math.min(1.0f, OooO0O0.OooO0O0(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (OooO0oo) {
                    return Math.min(i3 / i, i4 / i2);
                }
                int max = Math.max(i2 / i4, i / i3);
                if (max == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(max);
            default:
                return 1.0f;
        }
    }
}


