package com.ninja.engine;

import java.util.Arrays;
/* renamed from: com.ninja.engine.oOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177oOo0o extends C0146o00OO0oo {
    public C0415o0Oo0O0O OooO;
    public C1232oOoOo0oO[] OooO0o;
    public C1232oOoOo0oO[] OooO0oO;
    public int OooO0oo;

    @Override // com.ninja.engine.C0146o00OO0oo
    public final void OooO(oO0OO0O oo0oo0o, C0146o00OO0oo c0146o00OO0oo, boolean z) {
        C1232oOoOo0oO c1232oOoOo0oO = c0146o00OO0oo.OooO00o;
        if (c1232oOoOo0oO == null) {
            return;
        }
        o00OO0 o00oo0 = c0146o00OO0oo.OooO0Oo;
        int OooO0o = o00oo0.OooO0o();
        for (int i = 0; i < OooO0o; i++) {
            C1232oOoOo0oO OooO0oO = o00oo0.OooO0oO(i);
            float OooO0oo = o00oo0.OooO0oo(i);
            C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO;
            c0415o0Oo0O0O.OooO0O0 = OooO0oO;
            boolean z2 = OooO0oO.OooO00o;
            float[] fArr = c1232oOoOo0oO.OooO0oo;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C1232oOoOo0oO) c0415o0Oo0O0O.OooO0O0).OooO0oo;
                    float f = (fArr[i2] * OooO0oo) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C1232oOoOo0oO) c0415o0Oo0O0O.OooO0O0).OooO0oo[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    ((C1177oOo0o) c0415o0Oo0O0O.OooO0OO).OooOO0O((C1232oOoOo0oO) c0415o0Oo0O0O.OooO0O0);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * OooO0oo;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C1232oOoOo0oO) c0415o0Oo0O0O.OooO0O0).OooO0oo[i3] = f3;
                    } else {
                        ((C1232oOoOo0oO) c0415o0Oo0O0O.OooO0O0).OooO0oo[i3] = 0.0f;
                    }
                }
                OooOO0(OooO0oO);
            }
            this.OooO0O0 = (c0146o00OO0oo.OooO0O0 * OooO0oo) + this.OooO0O0;
        }
        OooOO0O(c1232oOoOo0oO);
    }

    @Override // com.ninja.engine.C0146o00OO0oo
    public final C1232oOoOo0oO OooO0Oo(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.OooO0oo; i2++) {
            C1232oOoOo0oO[] c1232oOoOo0oOArr = this.OooO0o;
            C1232oOoOo0oO c1232oOoOo0oO = c1232oOoOo0oOArr[i2];
            if (!zArr[c1232oOoOo0oO.OooO0O0]) {
                C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO;
                c0415o0Oo0O0O.OooO0O0 = c1232oOoOo0oO;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C1232oOoOo0oO) c0415o0Oo0O0O.OooO0O0).OooO0oo[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C1232oOoOo0oO c1232oOoOo0oO2 = c1232oOoOo0oOArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c1232oOoOo0oO2.OooO0oo[i3];
                            float f3 = ((C1232oOoOo0oO) c0415o0Oo0O0O.OooO0O0).OooO0oo[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.OooO0o[i];
    }

    @Override // com.ninja.engine.C0146o00OO0oo
    public final boolean OooO0o0() {
        if (this.OooO0oo == 0) {
            return true;
        }
        return false;
    }

    public final void OooOO0(C1232oOoOo0oO c1232oOoOo0oO) {
        int i;
        int i2 = this.OooO0oo + 1;
        C1232oOoOo0oO[] c1232oOoOo0oOArr = this.OooO0o;
        if (i2 > c1232oOoOo0oOArr.length) {
            C1232oOoOo0oO[] c1232oOoOo0oOArr2 = (C1232oOoOo0oO[]) Arrays.copyOf(c1232oOoOo0oOArr, c1232oOoOo0oOArr.length * 2);
            this.OooO0o = c1232oOoOo0oOArr2;
            this.OooO0oO = (C1232oOoOo0oO[]) Arrays.copyOf(c1232oOoOo0oOArr2, c1232oOoOo0oOArr2.length * 2);
        }
        C1232oOoOo0oO[] c1232oOoOo0oOArr3 = this.OooO0o;
        int i3 = this.OooO0oo;
        c1232oOoOo0oOArr3[i3] = c1232oOoOo0oO;
        int i4 = i3 + 1;
        this.OooO0oo = i4;
        if (i4 > 1 && c1232oOoOo0oOArr3[i3].OooO0O0 > c1232oOoOo0oO.OooO0O0) {
            int i5 = 0;
            while (true) {
                i = this.OooO0oo;
                if (i5 >= i) {
                    break;
                }
                this.OooO0oO[i5] = this.OooO0o[i5];
                i5++;
            }
            Arrays.sort(this.OooO0oO, 0, i, new C0332o0O0oo0(2));
            for (int i6 = 0; i6 < this.OooO0oo; i6++) {
                this.OooO0o[i6] = this.OooO0oO[i6];
            }
        }
        c1232oOoOo0oO.OooO00o = true;
        c1232oOoOo0oO.OooO00o(this);
    }

    public final void OooOO0O(C1232oOoOo0oO c1232oOoOo0oO) {
        int i = 0;
        while (i < this.OooO0oo) {
            if (this.OooO0o[i] == c1232oOoOo0oO) {
                while (true) {
                    int i2 = this.OooO0oo;
                    if (i < i2 - 1) {
                        C1232oOoOo0oO[] c1232oOoOo0oOArr = this.OooO0o;
                        int i3 = i + 1;
                        c1232oOoOo0oOArr[i] = c1232oOoOo0oOArr[i3];
                        i = i3;
                    } else {
                        this.OooO0oo = i2 - 1;
                        c1232oOoOo0oO.OooO00o = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.ninja.engine.C0146o00OO0oo
    public final String toString() {
        String str = " goal -> (" + this.OooO0O0 + ") : ";
        for (int i = 0; i < this.OooO0oo; i++) {
            C1232oOoOo0oO c1232oOoOo0oO = this.OooO0o[i];
            C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO;
            c0415o0Oo0O0O.OooO0O0 = c1232oOoOo0oO;
            str = str + c0415o0Oo0O0O + " ";
        }
        return str;
    }
}


