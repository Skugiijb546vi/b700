package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.oO0O0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758oO0O0OoO extends AbstractC1504oo0OOo00 {
    public static final int[] OooOO0O = new int[2];

    public static void OooOOO0(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0236, code lost:
        if (r3 != 1) goto L127;
     */
    @Override // com.ninja.engine.InterfaceC0376o0OOo00O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(com.ninja.engine.InterfaceC0376o0OOo00O r24) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0758oO0O0OoO.OooO00o(com.ninja.engine.o0OOo00O):void");
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0Oo() {
        C0316o0O0o0o c0316o0O0o0o;
        C0316o0O0o0o c0316o0O0o0o2;
        int i;
        C0316o0O0o0o c0316o0O0o0o3;
        C0304o0O0OoO c0304o0O0OoO;
        ArrayList arrayList;
        C0316o0O0o0o c0316o0O0o0o4;
        int i2;
        C0316o0O0o0o c0316o0O0o0o5 = this.OooO0O0;
        boolean z = c0316o0O0o0o5.OooO00o;
        C0392o0OOoOOO c0392o0OOoOOO = this.OooO0o0;
        if (z) {
            c0392o0OOoOOO.OooO0Oo(c0316o0O0o0o5.OooOOo0());
        }
        boolean z2 = c0392o0OOoOOO.OooOO0;
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO;
        C0379o0OOo0O0 c0379o0OOo0O02 = this.OooO0oo;
        if (!z2) {
            C0316o0O0o0o c0316o0O0o0o6 = this.OooO0O0;
            int i3 = c0316o0O0o0o6.o00o0O[0];
            this.OooO0Oo = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0316o0O0o0o4 = c0316o0O0o0o6.OoooO) != null && ((i2 = c0316o0O0o0o4.o00o0O[0]) == 1 || i2 == 4)) {
                    int OooOOo0 = (c0316o0O0o0o4.OooOOo0() - this.OooO0O0.Oooo0.OooO0o0()) - this.OooO0O0.Oooo0OO.OooO0o0();
                    AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O02, c0316o0O0o0o4.OooO0Oo.OooO0oo, this.OooO0O0.Oooo0.OooO0o0());
                    AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O0, c0316o0O0o0o4.OooO0Oo.OooO, -this.OooO0O0.Oooo0OO.OooO0o0());
                    c0392o0OOoOOO.OooO0Oo(OooOOo0);
                    return;
                } else if (i3 == 1) {
                    c0392o0OOoOOO.OooO0Oo(c0316o0O0o0o6.OooOOo0());
                }
            }
        } else if (this.OooO0Oo == 4 && (c0316o0O0o0o2 = (c0316o0O0o0o = this.OooO0O0).OoooO) != null && ((i = c0316o0O0o0o2.o00o0O[0]) == 1 || i == 4)) {
            AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O02, c0316o0O0o0o2.OooO0Oo.OooO0oo, c0316o0O0o0o.Oooo0.OooO0o0());
            AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O0, c0316o0O0o0o2.OooO0Oo.OooO, -this.OooO0O0.Oooo0OO.OooO0o0());
            return;
        }
        if (c0392o0OOoOOO.OooOO0) {
            C0316o0O0o0o c0316o0O0o0o7 = this.OooO0O0;
            if (c0316o0O0o0o7.OooO00o) {
                C0304o0O0OoO[] c0304o0O0OoOArr = c0316o0O0o0o7.OoooO00;
                C0304o0O0OoO c0304o0O0OoO2 = c0304o0O0OoOArr[0];
                C0304o0O0OoO c0304o0O0OoO3 = c0304o0O0OoO2.OooO0o;
                if (c0304o0O0OoO3 != null && c0304o0O0OoOArr[1].OooO0o != null) {
                    if (c0316o0O0o0o7.OooOo()) {
                        c0379o0OOo0O02.OooO0o = this.OooO0O0.OoooO00[0].OooO0o0();
                        c0304o0O0OoO = this.OooO0O0.OoooO00[1];
                        c0379o0OOo0O0.OooO0o = -c0304o0O0OoO.OooO0o0();
                        return;
                    }
                    C0379o0OOo0O0 OooO0oo = AbstractC1504oo0OOo00.OooO0oo(this.OooO0O0.OoooO00[0]);
                    if (OooO0oo != null) {
                        AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O02, OooO0oo, this.OooO0O0.OoooO00[0].OooO0o0());
                    }
                    C0379o0OOo0O0 OooO0oo2 = AbstractC1504oo0OOo00.OooO0oo(this.OooO0O0.OoooO00[1]);
                    if (OooO0oo2 != null) {
                        AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O0, OooO0oo2, -this.OooO0O0.OoooO00[1].OooO0o0());
                    }
                    c0379o0OOo0O02.OooO0O0 = true;
                    c0379o0OOo0O0.OooO0O0 = true;
                    return;
                }
                if (c0304o0O0OoO3 != null) {
                    C0379o0OOo0O0 OooO0oo3 = AbstractC1504oo0OOo00.OooO0oo(c0304o0O0OoO2);
                    if (OooO0oo3 != null) {
                        AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O02, OooO0oo3, this.OooO0O0.OoooO00[0].OooO0o0());
                    } else {
                        return;
                    }
                } else {
                    C0304o0O0OoO c0304o0O0OoO4 = c0304o0O0OoOArr[1];
                    if (c0304o0O0OoO4.OooO0o != null) {
                        C0379o0OOo0O0 OooO0oo4 = AbstractC1504oo0OOo00.OooO0oo(c0304o0O0OoO4);
                        if (OooO0oo4 != null) {
                            AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O0, OooO0oo4, -this.OooO0O0.OoooO00[1].OooO0o0());
                            AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O02, c0379o0OOo0O0, -c0392o0OOoOOO.OooO0oO);
                            return;
                        }
                        return;
                    } else if (!(c0316o0O0o0o7 instanceof AbstractC0705oO000o0o) && c0316o0O0o0o7.OoooO != null && c0316o0O0o0o7.OooO(7).OooO0o == null) {
                        C0316o0O0o0o c0316o0O0o0o8 = this.OooO0O0;
                        AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O02, c0316o0O0o0o8.OoooO.OooO0Oo.OooO0oo, c0316o0O0o0o8.OooOOo());
                    } else {
                        return;
                    }
                }
                AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O0, c0379o0OOo0O02, c0392o0OOoOOO.OooO0oO);
                return;
            }
        }
        if (this.OooO0Oo == 3) {
            C0316o0O0o0o c0316o0O0o0o9 = this.OooO0O0;
            int i4 = c0316o0O0o0o9.OooOOo;
            if (i4 != 2) {
                if (i4 == 3) {
                    if (c0316o0O0o0o9.OooOOoo == 3) {
                        c0379o0OOo0O02.OooO00o = this;
                        c0379o0OOo0O0.OooO00o = this;
                        C1435oo00oo c1435oo00oo = c0316o0O0o0o9.OooO0o0;
                        c1435oo00oo.OooO0oo.OooO00o = this;
                        c1435oo00oo.OooO.OooO00o = this;
                        c0392o0OOoOOO.OooO00o = this;
                        if (c0316o0O0o0o9.OooOoO0()) {
                            c0392o0OOoOOO.OooOO0o.add(this.OooO0O0.OooO0o0.OooO0o0);
                            this.OooO0O0.OooO0o0.OooO0o0.OooOO0O.add(c0392o0OOoOOO);
                            C1435oo00oo c1435oo00oo2 = this.OooO0O0.OooO0o0;
                            c1435oo00oo2.OooO0o0.OooO00o = this;
                            c0392o0OOoOOO.OooOO0o.add(c1435oo00oo2.OooO0oo);
                            c0392o0OOoOOO.OooOO0o.add(this.OooO0O0.OooO0o0.OooO);
                            this.OooO0O0.OooO0o0.OooO0oo.OooOO0O.add(c0392o0OOoOOO);
                            arrayList = this.OooO0O0.OooO0o0.OooO.OooOO0O;
                        } else if (this.OooO0O0.OooOo()) {
                            this.OooO0O0.OooO0o0.OooO0o0.OooOO0o.add(c0392o0OOoOOO);
                            c0392o0OOoOOO.OooOO0O.add(this.OooO0O0.OooO0o0.OooO0o0);
                        } else {
                            arrayList = this.OooO0O0.OooO0o0.OooO0o0.OooOO0o;
                        }
                    } else {
                        C0392o0OOoOOO c0392o0OOoOOO2 = c0316o0O0o0o9.OooO0o0.OooO0o0;
                        c0392o0OOoOOO.OooOO0o.add(c0392o0OOoOOO2);
                        c0392o0OOoOOO2.OooOO0O.add(c0392o0OOoOOO);
                        this.OooO0O0.OooO0o0.OooO0oo.OooOO0O.add(c0392o0OOoOOO);
                        this.OooO0O0.OooO0o0.OooO.OooOO0O.add(c0392o0OOoOOO);
                        c0392o0OOoOOO.OooO0O0 = true;
                        c0392o0OOoOOO.OooOO0O.add(c0379o0OOo0O02);
                        c0392o0OOoOOO.OooOO0O.add(c0379o0OOo0O0);
                        c0379o0OOo0O02.OooOO0o.add(c0392o0OOoOOO);
                        arrayList = c0379o0OOo0O0.OooOO0o;
                    }
                    arrayList.add(c0392o0OOoOOO);
                }
            } else {
                C0316o0O0o0o c0316o0O0o0o10 = c0316o0O0o0o9.OoooO;
                if (c0316o0O0o0o10 != null) {
                    C0392o0OOoOOO c0392o0OOoOOO3 = c0316o0O0o0o10.OooO0o0.OooO0o0;
                    c0392o0OOoOOO.OooOO0o.add(c0392o0OOoOOO3);
                    c0392o0OOoOOO3.OooOO0O.add(c0392o0OOoOOO);
                    c0392o0OOoOOO.OooO0O0 = true;
                    c0392o0OOoOOO.OooOO0O.add(c0379o0OOo0O02);
                    c0392o0OOoOOO.OooOO0O.add(c0379o0OOo0O0);
                }
            }
        }
        C0316o0O0o0o c0316o0O0o0o11 = this.OooO0O0;
        C0304o0O0OoO[] c0304o0O0OoOArr2 = c0316o0O0o0o11.OoooO00;
        C0304o0O0OoO c0304o0O0OoO5 = c0304o0O0OoOArr2[0];
        C0304o0O0OoO c0304o0O0OoO6 = c0304o0O0OoO5.OooO0o;
        if (c0304o0O0OoO6 != null && c0304o0O0OoOArr2[1].OooO0o != null) {
            if (c0316o0O0o0o11.OooOo()) {
                c0379o0OOo0O02.OooO0o = this.OooO0O0.OoooO00[0].OooO0o0();
                c0304o0O0OoO = this.OooO0O0.OoooO00[1];
                c0379o0OOo0O0.OooO0o = -c0304o0O0OoO.OooO0o0();
                return;
            }
            C0379o0OOo0O0 OooO0oo5 = AbstractC1504oo0OOo00.OooO0oo(this.OooO0O0.OoooO00[0]);
            C0379o0OOo0O0 OooO0oo6 = AbstractC1504oo0OOo00.OooO0oo(this.OooO0O0.OoooO00[1]);
            if (OooO0oo5 != null) {
                OooO0oo5.OooO0O0(this);
            }
            if (OooO0oo6 != null) {
                OooO0oo6.OooO0O0(this);
            }
            this.OooOO0 = 4;
            return;
        }
        if (c0304o0O0OoO6 != null) {
            C0379o0OOo0O0 OooO0oo7 = AbstractC1504oo0OOo00.OooO0oo(c0304o0O0OoO5);
            if (OooO0oo7 != null) {
                AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O02, OooO0oo7, this.OooO0O0.OoooO00[0].OooO0o0());
            } else {
                return;
            }
        } else {
            C0304o0O0OoO c0304o0O0OoO7 = c0304o0O0OoOArr2[1];
            if (c0304o0O0OoO7.OooO0o != null) {
                C0379o0OOo0O0 OooO0oo8 = AbstractC1504oo0OOo00.OooO0oo(c0304o0O0OoO7);
                if (OooO0oo8 != null) {
                    AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O0, OooO0oo8, -this.OooO0O0.OoooO00[1].OooO0o0());
                    OooO0OO(c0379o0OOo0O02, c0379o0OOo0O0, -1, c0392o0OOoOOO);
                    return;
                }
                return;
            } else if (!(c0316o0O0o0o11 instanceof AbstractC0705oO000o0o) && (c0316o0O0o0o3 = c0316o0O0o0o11.OoooO) != null) {
                AbstractC1504oo0OOo00.OooO0O0(c0379o0OOo0O02, c0316o0O0o0o3.OooO0Oo.OooO0oo, c0316o0O0o0o11.OooOOo());
            } else {
                return;
            }
        }
        OooO0OO(c0379o0OOo0O0, c0379o0OOo0O02, 1, c0392o0OOoOOO);
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o() {
        this.OooO0OO = null;
        this.OooO0oo.OooO0OO();
        this.OooO.OooO0OO();
        this.OooO0o0.OooO0OO();
        this.OooO0oO = false;
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o0() {
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
        if (c0379o0OOo0O0.OooOO0) {
            this.OooO0O0.OoooOo0 = c0379o0OOo0O0.OooO0oO;
        }
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final boolean OooOO0O() {
        if (this.OooO0Oo != 3 || this.OooO0O0.OooOOo == 0) {
            return true;
        }
        return false;
    }

    public final void OooOOO() {
        this.OooO0oO = false;
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
        c0379o0OOo0O0.OooO0OO();
        c0379o0OOo0O0.OooOO0 = false;
        C0379o0OOo0O0 c0379o0OOo0O02 = this.OooO;
        c0379o0OOo0O02.OooO0OO();
        c0379o0OOo0O02.OooOO0 = false;
        this.OooO0o0.OooOO0 = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.OooO0O0.Oooooo;
    }
}


