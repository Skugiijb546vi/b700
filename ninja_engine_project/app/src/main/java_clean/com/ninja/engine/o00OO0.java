package com.ninja.engine;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class o00OO0 {
    public final C0146o00OO0oo OooO0O0;
    public final C0131o00O0o OooO0OO;
    public int OooO00o = 0;
    public int OooO0Oo = 8;
    public int[] OooO0o0 = new int[8];
    public int[] OooO0o = new int[8];
    public float[] OooO0oO = new float[8];
    public int OooO0oo = -1;
    public int OooO = -1;
    public boolean OooOO0 = false;

    public o00OO0(C0146o00OO0oo c0146o00OO0oo, C0131o00O0o c0131o00O0o) {
        this.OooO0O0 = c0146o00OO0oo;
        this.OooO0OO = c0131o00O0o;
    }

    public final void OooO() {
        int i = this.OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            float[] fArr = this.OooO0oO;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.OooO0o[i];
        }
    }

    public final void OooO00o(C1232oOoOo0oO c1232oOoOo0oO, float f, boolean z) {
        if (f > -0.001f && f < 0.001f) {
            return;
        }
        int i = this.OooO0oo;
        C0146o00OO0oo c0146o00OO0oo = this.OooO0O0;
        if (i == -1) {
            this.OooO0oo = 0;
            this.OooO0oO[0] = f;
            this.OooO0o0[0] = c1232oOoOo0oO.OooO0O0;
            this.OooO0o[0] = -1;
            c1232oOoOo0oO.OooOO0O++;
            c1232oOoOo0oO.OooO00o(c0146o00OO0oo);
            this.OooO00o++;
            if (!this.OooOO0) {
                int i2 = this.OooO + 1;
                this.OooO = i2;
                int[] iArr = this.OooO0o0;
                if (i2 >= iArr.length) {
                    this.OooOO0 = true;
                    this.OooO = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.OooO00o; i4++) {
            int i5 = this.OooO0o0[i];
            int i6 = c1232oOoOo0oO.OooO0O0;
            if (i5 == i6) {
                float[] fArr = this.OooO0oO;
                float f2 = fArr[i] + f;
                if (f2 > -0.001f && f2 < 0.001f) {
                    f2 = 0.0f;
                }
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    if (i == this.OooO0oo) {
                        this.OooO0oo = this.OooO0o[i];
                    } else {
                        int[] iArr2 = this.OooO0o;
                        iArr2[i3] = iArr2[i];
                    }
                    if (z) {
                        c1232oOoOo0oO.OooO0O0(c0146o00OO0oo);
                    }
                    if (this.OooOO0) {
                        this.OooO = i;
                    }
                    c1232oOoOo0oO.OooOO0O--;
                    this.OooO00o--;
                    return;
                }
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.OooO0o[i];
        }
        int i7 = this.OooO;
        int i8 = i7 + 1;
        if (this.OooOO0) {
            int[] iArr3 = this.OooO0o0;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.OooO0o0;
        if (i7 >= iArr4.length && this.OooO00o < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.OooO0o0;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.OooO0o0;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.OooO0Oo * 2;
            this.OooO0Oo = i10;
            this.OooOO0 = false;
            this.OooO = i7 - 1;
            this.OooO0oO = Arrays.copyOf(this.OooO0oO, i10);
            this.OooO0o0 = Arrays.copyOf(this.OooO0o0, this.OooO0Oo);
            this.OooO0o = Arrays.copyOf(this.OooO0o, this.OooO0Oo);
        }
        this.OooO0o0[i7] = c1232oOoOo0oO.OooO0O0;
        this.OooO0oO[i7] = f;
        int[] iArr7 = this.OooO0o;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.OooO0oo;
            this.OooO0oo = i7;
        }
        c1232oOoOo0oO.OooOO0O++;
        c1232oOoOo0oO.OooO00o(c0146o00OO0oo);
        this.OooO00o++;
        if (!this.OooOO0) {
            this.OooO++;
        }
        int i11 = this.OooO;
        int[] iArr8 = this.OooO0o0;
        if (i11 >= iArr8.length) {
            this.OooOO0 = true;
            this.OooO = iArr8.length - 1;
        }
    }

    public final void OooO0O0() {
        int i = this.OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            C1232oOoOo0oO c1232oOoOo0oO = ((C1232oOoOo0oO[]) this.OooO0OO.OooO0Oo)[this.OooO0o0[i]];
            if (c1232oOoOo0oO != null) {
                c1232oOoOo0oO.OooO0O0(this.OooO0O0);
            }
            i = this.OooO0o[i];
        }
        this.OooO0oo = -1;
        this.OooO = -1;
        this.OooOO0 = false;
        this.OooO00o = 0;
    }

    public final boolean OooO0OO(C1232oOoOo0oO c1232oOoOo0oO) {
        int i = this.OooO0oo;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            if (this.OooO0o0[i] == c1232oOoOo0oO.OooO0O0) {
                return true;
            }
            i = this.OooO0o[i];
        }
        return false;
    }

    public final void OooO0Oo(float f) {
        int i = this.OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            float[] fArr = this.OooO0oO;
            fArr[i] = fArr[i] / f;
            i = this.OooO0o[i];
        }
    }

    public final int OooO0o() {
        return this.OooO00o;
    }

    public final float OooO0o0(C1232oOoOo0oO c1232oOoOo0oO) {
        int i = this.OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            if (this.OooO0o0[i] == c1232oOoOo0oO.OooO0O0) {
                return this.OooO0oO[i];
            }
            i = this.OooO0o[i];
        }
        return 0.0f;
    }

    public final C1232oOoOo0oO OooO0oO(int i) {
        int i2 = this.OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.OooO00o; i3++) {
            if (i3 == i) {
                return ((C1232oOoOo0oO[]) this.OooO0OO.OooO0Oo)[this.OooO0o0[i2]];
            }
            i2 = this.OooO0o[i2];
        }
        return null;
    }

    public final float OooO0oo(int i) {
        int i2 = this.OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.OooO00o; i3++) {
            if (i3 == i) {
                return this.OooO0oO[i2];
            }
            i2 = this.OooO0o[i2];
        }
        return 0.0f;
    }

    public final void OooOO0(C1232oOoOo0oO c1232oOoOo0oO, float f) {
        if (f == 0.0f) {
            OooOO0O(c1232oOoOo0oO, true);
            return;
        }
        int i = this.OooO0oo;
        C0146o00OO0oo c0146o00OO0oo = this.OooO0O0;
        if (i == -1) {
            this.OooO0oo = 0;
            this.OooO0oO[0] = f;
            this.OooO0o0[0] = c1232oOoOo0oO.OooO0O0;
            this.OooO0o[0] = -1;
            c1232oOoOo0oO.OooOO0O++;
            c1232oOoOo0oO.OooO00o(c0146o00OO0oo);
            this.OooO00o++;
            if (!this.OooOO0) {
                int i2 = this.OooO + 1;
                this.OooO = i2;
                int[] iArr = this.OooO0o0;
                if (i2 >= iArr.length) {
                    this.OooOO0 = true;
                    this.OooO = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.OooO00o; i4++) {
            int i5 = this.OooO0o0[i];
            int i6 = c1232oOoOo0oO.OooO0O0;
            if (i5 == i6) {
                this.OooO0oO[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.OooO0o[i];
        }
        int i7 = this.OooO;
        int i8 = i7 + 1;
        if (this.OooOO0) {
            int[] iArr2 = this.OooO0o0;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.OooO0o0;
        if (i7 >= iArr3.length && this.OooO00o < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.OooO0o0;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.OooO0o0;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.OooO0Oo * 2;
            this.OooO0Oo = i10;
            this.OooOO0 = false;
            this.OooO = i7 - 1;
            this.OooO0oO = Arrays.copyOf(this.OooO0oO, i10);
            this.OooO0o0 = Arrays.copyOf(this.OooO0o0, this.OooO0Oo);
            this.OooO0o = Arrays.copyOf(this.OooO0o, this.OooO0Oo);
        }
        this.OooO0o0[i7] = c1232oOoOo0oO.OooO0O0;
        this.OooO0oO[i7] = f;
        int[] iArr6 = this.OooO0o;
        if (i3 != -1) {
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            iArr6[i7] = this.OooO0oo;
            this.OooO0oo = i7;
        }
        c1232oOoOo0oO.OooOO0O++;
        c1232oOoOo0oO.OooO00o(c0146o00OO0oo);
        int i11 = this.OooO00o + 1;
        this.OooO00o = i11;
        if (!this.OooOO0) {
            this.OooO++;
        }
        int[] iArr7 = this.OooO0o0;
        if (i11 >= iArr7.length) {
            this.OooOO0 = true;
        }
        if (this.OooO >= iArr7.length) {
            this.OooOO0 = true;
            this.OooO = iArr7.length - 1;
        }
    }

    public final float OooOO0O(C1232oOoOo0oO c1232oOoOo0oO, boolean z) {
        int i = this.OooO0oo;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.OooO00o) {
            if (this.OooO0o0[i] == c1232oOoOo0oO.OooO0O0) {
                if (i == this.OooO0oo) {
                    this.OooO0oo = this.OooO0o[i];
                } else {
                    int[] iArr = this.OooO0o;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c1232oOoOo0oO.OooO0O0(this.OooO0O0);
                }
                c1232oOoOo0oO.OooOO0O--;
                this.OooO00o--;
                this.OooO0o0[i] = -1;
                if (this.OooOO0) {
                    this.OooO = i;
                }
                return this.OooO0oO[i];
            }
            i2++;
            i3 = i;
            i = this.OooO0o[i];
        }
        return 0.0f;
    }

    public final float OooOO0o(C0146o00OO0oo c0146o00OO0oo, boolean z) {
        float OooO0o0 = OooO0o0(c0146o00OO0oo.OooO00o);
        OooOO0O(c0146o00OO0oo.OooO00o, z);
        o00OO0 o00oo0 = c0146o00OO0oo.OooO0Oo;
        int OooO0o = o00oo0.OooO0o();
        for (int i = 0; i < OooO0o; i++) {
            C1232oOoOo0oO OooO0oO = o00oo0.OooO0oO(i);
            OooO00o(OooO0oO, o00oo0.OooO0o0(OooO0oO) * OooO0o0, z);
        }
        return OooO0o0;
    }

    public final String toString() {
        int i = this.OooO0oo;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            str = (AbstractC1230oOoOo0o.OooO0oO(str, " -> ") + this.OooO0oO[i] + " : ") + ((C1232oOoOo0oO[]) this.OooO0OO.OooO0Oo)[this.OooO0o0[i]];
            i = this.OooO0o[i];
        }
        return str;
    }
}


