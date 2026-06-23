package com.ninja.engine;

import java.util.Arrays;
/* renamed from: com.ninja.engine.oOoOo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232oOoOo0oO implements Comparable {
    public boolean OooO00o;
    public float OooO0o0;
    public int OooOO0o;
    public int OooO0O0 = -1;
    public int OooO0OO = -1;
    public int OooO0Oo = 0;
    public boolean OooO0o = false;
    public final float[] OooO0oO = new float[9];
    public final float[] OooO0oo = new float[9];
    public C0146o00OO0oo[] OooO = new C0146o00OO0oo[16];
    public int OooOO0 = 0;
    public int OooOO0O = 0;

    public C1232oOoOo0oO(int i) {
        this.OooOO0o = i;
    }

    public final void OooO00o(C0146o00OO0oo c0146o00OO0oo) {
        int i = 0;
        while (true) {
            int i2 = this.OooOO0;
            if (i < i2) {
                if (this.OooO[i] == c0146o00OO0oo) {
                    return;
                }
                i++;
            } else {
                C0146o00OO0oo[] c0146o00OO0ooArr = this.OooO;
                if (i2 >= c0146o00OO0ooArr.length) {
                    this.OooO = (C0146o00OO0oo[]) Arrays.copyOf(c0146o00OO0ooArr, c0146o00OO0ooArr.length * 2);
                }
                C0146o00OO0oo[] c0146o00OO0ooArr2 = this.OooO;
                int i3 = this.OooOO0;
                c0146o00OO0ooArr2[i3] = c0146o00OO0oo;
                this.OooOO0 = i3 + 1;
                return;
            }
        }
    }

    public final void OooO0O0(C0146o00OO0oo c0146o00OO0oo) {
        int i = this.OooOO0;
        int i2 = 0;
        while (i2 < i) {
            if (this.OooO[i2] == c0146o00OO0oo) {
                while (i2 < i - 1) {
                    C0146o00OO0oo[] c0146o00OO0ooArr = this.OooO;
                    int i3 = i2 + 1;
                    c0146o00OO0ooArr[i2] = c0146o00OO0ooArr[i3];
                    i2 = i3;
                }
                this.OooOO0--;
                return;
            }
            i2++;
        }
    }

    public final void OooO0OO() {
        this.OooOO0o = 5;
        this.OooO0Oo = 0;
        this.OooO0O0 = -1;
        this.OooO0OO = -1;
        this.OooO0o0 = 0.0f;
        this.OooO0o = false;
        int i = this.OooOO0;
        for (int i2 = 0; i2 < i; i2++) {
            this.OooO[i2] = null;
        }
        this.OooOO0 = 0;
        this.OooOO0O = 0;
        this.OooO00o = false;
        Arrays.fill(this.OooO0oo, 0.0f);
    }

    public final void OooO0Oo(oO0OO0O oo0oo0o, float f) {
        this.OooO0o0 = f;
        this.OooO0o = true;
        int i = this.OooOO0;
        this.OooO0OO = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.OooO[i2].OooO0oo(oo0oo0o, this, false);
        }
        this.OooOO0 = 0;
    }

    public final void OooO0o0(oO0OO0O oo0oo0o, C0146o00OO0oo c0146o00OO0oo) {
        int i = this.OooOO0;
        for (int i2 = 0; i2 < i; i2++) {
            this.OooO[i2].OooO(oo0oo0o, c0146o00OO0oo, false);
        }
        this.OooOO0 = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.OooO0O0 - ((C1232oOoOo0oO) obj).OooO0O0;
    }

    public final String toString() {
        return "" + this.OooO0O0;
    }
}


