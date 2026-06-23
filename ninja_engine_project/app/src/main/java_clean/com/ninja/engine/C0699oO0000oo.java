package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.oO0000oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699oO0000oo extends C0316o0O0o0o {
    public boolean o0ooOOo;
    public float o00ooo = -1.0f;
    public int oo000o = -1;
    public int o00oO0o = -1;
    public C0304o0O0OoO o00oO0O = this.Oooo0O0;
    public int o0ooOO0 = 0;

    public C0699oO0000oo() {
        this.OoooO0.clear();
        this.OoooO0.add(this.o00oO0O);
        int length = this.OoooO00.length;
        for (int i = 0; i < length; i++) {
            this.OoooO00[i] = this.o00oO0O;
        }
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final C0304o0O0OoO OooO(int i) {
        int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(i);
        if (OooOOOo != 1) {
            if (OooOOOo != 2) {
                if (OooOOOo != 3) {
                    if (OooOOOo != 4) {
                        return null;
                    }
                }
            }
            if (this.o0ooOO0 == 0) {
                return this.o00oO0O;
            }
            return null;
        }
        if (this.o0ooOO0 == 1) {
            return this.o00oO0O;
        }
        return null;
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final void OooO0O0(oO0OO0O oo0oo0o, boolean z) {
        boolean z2;
        C1232oOoOo0oO OooOO0O;
        C1232oOoOo0oO OooOO0O2;
        C1232oOoOo0oO OooOO0O3;
        C0580o0oOo0O0 c0580o0oOo0O0 = (C0580o0oOo0O0) this.OoooO;
        if (c0580o0oOo0O0 == null) {
            return;
        }
        Object OooO = c0580o0oOo0O0.OooO(2);
        Object OooO2 = c0580o0oOo0O0.OooO(4);
        C0316o0O0o0o c0316o0O0o0o = this.OoooO;
        boolean z3 = true;
        if (c0316o0O0o0o != null && c0316o0O0o0o.o00o0O[0] == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.o0ooOO0 == 0) {
            OooO = c0580o0oOo0O0.OooO(3);
            OooO2 = c0580o0oOo0O0.OooO(5);
            C0316o0O0o0o c0316o0O0o0o2 = this.OoooO;
            z2 = (c0316o0O0o0o2 == null || c0316o0O0o0o2.o00o0O[1] != 2) ? false : false;
        }
        if (this.o0ooOOo) {
            C0304o0O0OoO c0304o0O0OoO = this.o00oO0O;
            if (c0304o0O0OoO.OooO0OO) {
                C1232oOoOo0oO OooOO0O4 = oo0oo0o.OooOO0O(c0304o0O0OoO);
                oo0oo0o.OooO0Oo(OooOO0O4, this.o00oO0O.OooO0Oo());
                if (this.oo000o != -1) {
                    if (z2) {
                        OooOO0O3 = oo0oo0o.OooOO0O(OooO2);
                        oo0oo0o.OooO0o(OooOO0O3, OooOO0O4, 0, 5);
                    }
                    this.o0ooOOo = false;
                    return;
                }
                if (this.o00oO0o != -1 && z2) {
                    OooOO0O3 = oo0oo0o.OooOO0O(OooO2);
                    oo0oo0o.OooO0o(OooOO0O4, oo0oo0o.OooOO0O(OooO), 0, 5);
                    oo0oo0o.OooO0o(OooOO0O3, OooOO0O4, 0, 5);
                }
                this.o0ooOOo = false;
                return;
            }
        }
        if (this.oo000o != -1) {
            OooOO0O = oo0oo0o.OooOO0O(this.o00oO0O);
            oo0oo0o.OooO0o0(OooOO0O, oo0oo0o.OooOO0O(OooO), this.oo000o, 8);
            if (z2) {
                OooOO0O2 = oo0oo0o.OooOO0O(OooO2);
            } else {
                return;
            }
        } else if (this.o00oO0o != -1) {
            OooOO0O = oo0oo0o.OooOO0O(this.o00oO0O);
            OooOO0O2 = oo0oo0o.OooOO0O(OooO2);
            oo0oo0o.OooO0o0(OooOO0O, OooOO0O2, -this.o00oO0o, 8);
            if (z2) {
                oo0oo0o.OooO0o(OooOO0O, oo0oo0o.OooOO0O(OooO), 0, 5);
            } else {
                return;
            }
        } else if (this.o00ooo != -1.0f) {
            C1232oOoOo0oO OooOO0O5 = oo0oo0o.OooOO0O(this.o00oO0O);
            C1232oOoOo0oO OooOO0O6 = oo0oo0o.OooOO0O(OooO2);
            float f = this.o00ooo;
            C0146o00OO0oo OooOO0o = oo0oo0o.OooOO0o();
            OooOO0o.OooO0Oo.OooOO0(OooOO0O5, -1.0f);
            OooOO0o.OooO0Oo.OooOO0(OooOO0O6, f);
            oo0oo0o.OooO0OO(OooOO0o);
            return;
        } else {
            return;
        }
        oo0oo0o.OooO0o(OooOO0O2, OooOO0O, 0, 5);
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

    public final void OoooO0(int i) {
        this.o00oO0O.OooOO0o(i);
        this.o0ooOOo = true;
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final void OoooO00(oO0OO0O oo0oo0o, boolean z) {
        if (this.OoooO == null) {
            return;
        }
        C0304o0O0OoO c0304o0O0OoO = this.o00oO0O;
        oo0oo0o.getClass();
        int OooOOO = oO0OO0O.OooOOO(c0304o0O0OoO);
        if (this.o0ooOO0 == 1) {
            this.OoooOo0 = OooOOO;
            this.OoooOoO = 0;
            Oooo0o0(this.OoooO.OooOO0O());
            Oooo0oo(0);
            return;
        }
        this.OoooOo0 = 0;
        this.OoooOoO = OooOOO;
        Oooo0oo(this.OoooO.OooOOo0());
        Oooo0o0(0);
    }

    public final void OoooO0O(int i) {
        C0304o0O0OoO c0304o0O0OoO;
        if (this.o0ooOO0 == i) {
            return;
        }
        this.o0ooOO0 = i;
        ArrayList arrayList = this.OoooO0;
        arrayList.clear();
        if (this.o0ooOO0 == 1) {
            c0304o0O0OoO = this.Oooo0;
        } else {
            c0304o0O0OoO = this.Oooo0O0;
        }
        this.o00oO0O = c0304o0O0OoO;
        arrayList.add(this.o00oO0O);
        C0304o0O0OoO[] c0304o0O0OoOArr = this.OoooO00;
        int length = c0304o0O0OoOArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0304o0O0OoOArr[i2] = this.o00oO0O;
        }
    }
}


