package com.ninja.engine;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class o0O0o00O {
    public int OooO;
    public int[] OooO00o;
    public int[] OooO0O0;
    public int OooO0OO;
    public int[] OooO0Oo;
    public int OooO0o;
    public float[] OooO0o0;
    public int[] OooO0oO;
    public String[] OooO0oo;
    public int[] OooOO0;
    public boolean[] OooOO0O;
    public int OooOO0o;

    public final void OooO00o(int i, float f) {
        int i2 = this.OooO0o;
        int[] iArr = this.OooO0Oo;
        if (i2 >= iArr.length) {
            this.OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.OooO0o0;
            this.OooO0o0 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.OooO0Oo;
        int i3 = this.OooO0o;
        iArr2[i3] = i;
        float[] fArr2 = this.OooO0o0;
        this.OooO0o = i3 + 1;
        fArr2[i3] = f;
    }

    public final void OooO0O0(int i, int i2) {
        int i3 = this.OooO0OO;
        int[] iArr = this.OooO00o;
        if (i3 >= iArr.length) {
            this.OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.OooO0O0;
            this.OooO0O0 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.OooO00o;
        int i4 = this.OooO0OO;
        iArr3[i4] = i;
        int[] iArr4 = this.OooO0O0;
        this.OooO0OO = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void OooO0OO(int i, String str) {
        int i2 = this.OooO;
        int[] iArr = this.OooO0oO;
        if (i2 >= iArr.length) {
            this.OooO0oO = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.OooO0oo;
            this.OooO0oo = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.OooO0oO;
        int i3 = this.OooO;
        iArr2[i3] = i;
        String[] strArr2 = this.OooO0oo;
        this.OooO = i3 + 1;
        strArr2[i3] = str;
    }

    public final void OooO0Oo(int i, boolean z) {
        int i2 = this.OooOO0o;
        int[] iArr = this.OooOO0;
        if (i2 >= iArr.length) {
            this.OooOO0 = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.OooOO0O;
            this.OooOO0O = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.OooOO0;
        int i3 = this.OooOO0o;
        iArr2[i3] = i;
        boolean[] zArr2 = this.OooOO0O;
        this.OooOO0o = i3 + 1;
        zArr2[i3] = z;
    }
}
