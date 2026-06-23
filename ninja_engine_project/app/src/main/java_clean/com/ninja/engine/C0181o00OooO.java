package com.ninja.engine;
/* renamed from: com.ninja.engine.o00OooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181o00OooO extends AbstractC0705oO000o0o {
    public boolean o00oO0O;
    public int o00oO0o;
    public int o0ooOO0;
    public boolean o0ooOOo;

    @Override // com.ninja.engine.C0316o0O0o0o
    public final void OooO0O0(oO0OO0O oo0oo0o, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        C1232oOoOo0oO c1232oOoOo0oO;
        C0304o0O0OoO c0304o0O0OoO;
        int i2;
        int i3;
        int i4;
        C1232oOoOo0oO c1232oOoOo0oO2;
        int i5;
        C0304o0O0OoO[] c0304o0O0OoOArr = this.OoooO00;
        C0304o0O0OoO c0304o0O0OoO2 = this.Oooo0;
        c0304o0O0OoOArr[0] = c0304o0O0OoO2;
        C0304o0O0OoO c0304o0O0OoO3 = this.Oooo0O0;
        int i6 = 2;
        c0304o0O0OoOArr[2] = c0304o0O0OoO3;
        C0304o0O0OoO c0304o0O0OoO4 = this.Oooo0OO;
        c0304o0O0OoOArr[1] = c0304o0O0OoO4;
        C0304o0O0OoO c0304o0O0OoO5 = this.Oooo0o0;
        c0304o0O0OoOArr[3] = c0304o0O0OoO5;
        for (C0304o0O0OoO c0304o0O0OoO6 : c0304o0O0OoOArr) {
            c0304o0O0OoO6.OooO = oo0oo0o.OooOO0O(c0304o0O0OoO6);
        }
        int i7 = this.o00oO0o;
        if (i7 >= 0 && i7 < 4) {
            C0304o0O0OoO c0304o0O0OoO7 = c0304o0O0OoOArr[i7];
            if (!this.o0ooOOo) {
                OoooO();
            }
            if (this.o0ooOOo) {
                this.o0ooOOo = false;
                int i8 = this.o00oO0o;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        oo0oo0o.OooO0Oo(c0304o0O0OoO3.OooO, this.OoooOoO);
                        c1232oOoOo0oO2 = c0304o0O0OoO5.OooO;
                        i5 = this.OoooOoO;
                    } else {
                        return;
                    }
                } else {
                    oo0oo0o.OooO0Oo(c0304o0O0OoO2.OooO, this.OoooOo0);
                    c1232oOoOo0oO2 = c0304o0O0OoO4.OooO;
                    i5 = this.OoooOo0;
                }
                oo0oo0o.OooO0Oo(c1232oOoOo0oO2, i5);
                return;
            }
            for (int i9 = 0; i9 < this.oo000o; i9++) {
                C0316o0O0o0o c0316o0O0o0o = this.o00ooo[i9];
                if ((this.o00oO0O || c0316o0O0o0o.OooO0OO()) && ((((i4 = this.o00oO0o) == 0 || i4 == 1) && c0316o0O0o0o.o00o0O[0] == 3 && c0316o0O0o0o.Oooo0.OooO0o != null && c0316o0O0o0o.Oooo0OO.OooO0o != null) || ((i4 == 2 || i4 == 3) && c0316o0O0o0o.o00o0O[1] == 3 && c0316o0O0o0o.Oooo0O0.OooO0o != null && c0316o0O0o0o.Oooo0o0.OooO0o != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!c0304o0O0OoO2.OooO0oO() && !c0304o0O0OoO4.OooO0oO()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!c0304o0O0OoO3.OooO0oO() && !c0304o0O0OoO5.OooO0oO()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.o00oO0o) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                i = 5;
            } else {
                i = 4;
            }
            int i10 = 0;
            while (i10 < this.oo000o) {
                C0316o0O0o0o c0316o0O0o0o2 = this.o00ooo[i10];
                if (this.o00oO0O || c0316o0O0o0o2.OooO0OO()) {
                    C1232oOoOo0oO OooOO0O = oo0oo0o.OooOO0O(c0316o0O0o0o2.OoooO00[this.o00oO0o]);
                    int i11 = this.o00oO0o;
                    C0304o0O0OoO c0304o0O0OoO8 = c0316o0O0o0o2.OoooO00[i11];
                    c0304o0O0OoO8.OooO = OooOO0O;
                    C0304o0O0OoO c0304o0O0OoO9 = c0304o0O0OoO8.OooO0o;
                    if (c0304o0O0OoO9 != null && c0304o0O0OoO9.OooO0Oo == this) {
                        i2 = c0304o0O0OoO8.OooO0oO;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != i6) {
                        C0146o00OO0oo OooOO0o = oo0oo0o.OooOO0o();
                        C1232oOoOo0oO OooOOO0 = oo0oo0o.OooOOO0();
                        OooOOO0.OooO0Oo = 0;
                        OooOO0o.OooO0O0(c0304o0O0OoO7.OooO, OooOO0O, OooOOO0, this.o0ooOO0 + i2);
                        oo0oo0o.OooO0OO(OooOO0o);
                    } else {
                        C0146o00OO0oo OooOO0o2 = oo0oo0o.OooOO0o();
                        C1232oOoOo0oO OooOOO02 = oo0oo0o.OooOOO0();
                        OooOOO02.OooO0Oo = 0;
                        OooOO0o2.OooO0OO(c0304o0O0OoO7.OooO, OooOO0O, OooOOO02, this.o0ooOO0 - i2);
                        oo0oo0o.OooO0OO(OooOO0o2);
                    }
                    oo0oo0o.OooO0o0(c0304o0O0OoO7.OooO, OooOO0O, this.o0ooOO0 + i2, i);
                }
                i10++;
                i6 = 2;
            }
            int i12 = this.o00oO0o;
            if (i12 == 0) {
                oo0oo0o.OooO0o0(c0304o0O0OoO4.OooO, c0304o0O0OoO2.OooO, 0, 8);
                oo0oo0o.OooO0o0(c0304o0O0OoO2.OooO, this.OoooO.Oooo0OO.OooO, 0, 4);
                c1232oOoOo0oO = c0304o0O0OoO2.OooO;
                c0304o0O0OoO = this.OoooO.Oooo0;
            } else if (i12 == 1) {
                oo0oo0o.OooO0o0(c0304o0O0OoO2.OooO, c0304o0O0OoO4.OooO, 0, 8);
                oo0oo0o.OooO0o0(c0304o0O0OoO2.OooO, this.OoooO.Oooo0.OooO, 0, 4);
                c1232oOoOo0oO = c0304o0O0OoO2.OooO;
                c0304o0O0OoO = this.OoooO.Oooo0OO;
            } else if (i12 == 2) {
                oo0oo0o.OooO0o0(c0304o0O0OoO5.OooO, c0304o0O0OoO3.OooO, 0, 8);
                oo0oo0o.OooO0o0(c0304o0O0OoO3.OooO, this.OoooO.Oooo0o0.OooO, 0, 4);
                c1232oOoOo0oO = c0304o0O0OoO3.OooO;
                c0304o0O0OoO = this.OoooO.Oooo0O0;
            } else if (i12 == 3) {
                oo0oo0o.OooO0o0(c0304o0O0OoO3.OooO, c0304o0O0OoO5.OooO, 0, 8);
                oo0oo0o.OooO0o0(c0304o0O0OoO3.OooO, this.OoooO.Oooo0O0.OooO, 0, 4);
                c1232oOoOo0oO = c0304o0O0OoO3.OooO;
                c0304o0O0OoO = this.OoooO.Oooo0o0;
            } else {
                return;
            }
            oo0oo0o.OooO0o0(c1232oOoOo0oO, c0304o0O0OoO.OooO, 0, 0);
        }
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final boolean OooOoOO() {
        return this.o0ooOOo;
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final boolean OooOoo0() {
        return this.o0ooOOo;
    }

    public final boolean OoooO() {
        int i;
        C0304o0O0OoO OooO;
        C0304o0O0OoO OooO2;
        C0304o0O0OoO OooO3;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.oo000o;
            if (i4 >= i) {
                break;
            }
            C0316o0O0o0o c0316o0O0o0o = this.o00ooo[i4];
            if ((this.o00oO0O || c0316o0O0o0o.OooO0OO()) && ((((i2 = this.o00oO0o) == 0 || i2 == 1) && !c0316o0O0o0o.OooOoOO()) || (((i3 = this.o00oO0o) == 2 || i3 == 3) && !c0316o0O0o0o.OooOoo0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.oo000o; i6++) {
            C0316o0O0o0o c0316o0O0o0o2 = this.o00ooo[i6];
            if (this.o00oO0O || c0316o0O0o0o2.OooO0OO()) {
                if (!z2) {
                    int i7 = this.o00oO0o;
                    if (i7 == 0) {
                        OooO3 = c0316o0O0o0o2.OooO(2);
                    } else if (i7 == 1) {
                        OooO3 = c0316o0O0o0o2.OooO(4);
                    } else if (i7 == 2) {
                        OooO3 = c0316o0O0o0o2.OooO(3);
                    } else {
                        if (i7 == 3) {
                            OooO3 = c0316o0O0o0o2.OooO(5);
                        }
                        z2 = true;
                    }
                    i5 = OooO3.OooO0Oo();
                    z2 = true;
                }
                int i8 = this.o00oO0o;
                if (i8 == 0) {
                    OooO2 = c0316o0O0o0o2.OooO(2);
                } else {
                    if (i8 == 1) {
                        OooO = c0316o0O0o0o2.OooO(4);
                    } else if (i8 == 2) {
                        OooO2 = c0316o0O0o0o2.OooO(3);
                    } else if (i8 == 3) {
                        OooO = c0316o0O0o0o2.OooO(5);
                    }
                    i5 = Math.max(i5, OooO.OooO0Oo());
                }
                i5 = Math.min(i5, OooO2.OooO0Oo());
            }
        }
        int i9 = i5 + this.o0ooOO0;
        int i10 = this.o00oO0o;
        if (i10 != 0 && i10 != 1) {
            Oooo0OO(i9, i9);
        } else {
            Oooo0O0(i9, i9);
        }
        this.o0ooOOo = true;
        return true;
    }

    public final int OoooOO0() {
        int i = this.o00oO0o;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final String toString() {
        String OooO = AbstractC1230oOoOo0o.OooO(new StringBuilder("[Barrier] "), this.Oooooo, " {");
        for (int i = 0; i < this.oo000o; i++) {
            C0316o0O0o0o c0316o0O0o0o = this.o00ooo[i];
            if (i > 0) {
                OooO = AbstractC1230oOoOo0o.OooO0oO(OooO, ", ");
            }
            OooO = OooO + c0316o0O0o0o.Oooooo;
        }
        return AbstractC1230oOoOo0o.OooO0oO(OooO, "}");
    }
}


