package com.ninja.engine;
/* renamed from: com.ninja.engine.oo00oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435oo00oo extends AbstractC1504oo0OOo00 {
    public C0379o0OOo0O0 OooOO0O;
    public C1424oo00oO OooOO0o;

    @Override // com.ninja.engine.InterfaceC0376o0OOo00O
    public final void OooO00o(InterfaceC0376o0OOo00O interfaceC0376o0OOo00O) {
        C0392o0OOoOOO c0392o0OOoOOO;
        float f;
        int i;
        float f2;
        if (AbstractC1230oOoOo0o.OooOOOo(this.OooOO0) != 3) {
            C0392o0OOoOOO c0392o0OOoOOO2 = this.OooO0o0;
            if (c0392o0OOoOOO2.OooO0OO && !c0392o0OOoOOO2.OooOO0 && this.OooO0Oo == 3) {
                C0316o0O0o0o c0316o0O0o0o = this.OooO0O0;
                int i2 = c0316o0O0o0o.OooOOoo;
                if (i2 != 2) {
                    if (i2 == 3) {
                        C0392o0OOoOOO c0392o0OOoOOO3 = c0316o0O0o0o.OooO0Oo.OooO0o0;
                        if (c0392o0OOoOOO3.OooOO0) {
                            int i3 = c0316o0O0o0o.OoooOOo;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                    } else {
                                        f2 = c0392o0OOoOOO3.OooO0oO;
                                    }
                                } else {
                                    f = c0392o0OOoOOO3.OooO0oO * c0316o0O0o0o.OoooOOO;
                                    i = (int) (f + 0.5f);
                                }
                            } else {
                                f2 = c0392o0OOoOOO3.OooO0oO;
                            }
                            f = f2 / c0316o0O0o0o.OoooOOO;
                            i = (int) (f + 0.5f);
                        }
                    }
                } else {
                    C0316o0O0o0o c0316o0O0o0o2 = c0316o0O0o0o.OoooO;
                    if (c0316o0O0o0o2 != null) {
                        if (c0316o0O0o0o2.OooO0o0.OooO0o0.OooOO0) {
                            f = c0392o0OOoOOO.OooO0oO * c0316o0O0o0o.OooOoO;
                            i = (int) (f + 0.5f);
                        }
                    }
                }
                c0392o0OOoOOO2.OooO0Oo(i);
            }
            C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
            if (c0379o0OOo0O0.OooO0OO) {
                C0379o0OOo0O0 c0379o0OOo0O02 = this.OooO;
                if (c0379o0OOo0O02.OooO0OO) {
                    if (c0379o0OOo0O0.OooOO0 && c0379o0OOo0O02.OooOO0 && c0392o0OOoOOO2.OooOO0) {
                        return;
                    }
                    if (!c0392o0OOoOOO2.OooOO0 && this.OooO0Oo == 3) {
                        C0316o0O0o0o c0316o0O0o0o3 = this.OooO0O0;
                        if (c0316o0O0o0o3.OooOOo == 0 && !c0316o0O0o0o3.OooOoO0()) {
                            int i4 = ((C0379o0OOo0O0) c0379o0OOo0O0.OooOO0o.get(0)).OooO0oO + c0379o0OOo0O0.OooO0o;
                            int i5 = ((C0379o0OOo0O0) c0379o0OOo0O02.OooOO0o.get(0)).OooO0oO + c0379o0OOo0O02.OooO0o;
                            c0379o0OOo0O0.OooO0Oo(i4);
                            c0379o0OOo0O02.OooO0Oo(i5);
                            c0392o0OOoOOO2.OooO0Oo(i5 - i4);
                            return;
                        }
                    }
                    if (!c0392o0OOoOOO2.OooOO0 && this.OooO0Oo == 3 && this.OooO00o == 1 && c0379o0OOo0O0.OooOO0o.size() > 0 && c0379o0OOo0O02.OooOO0o.size() > 0) {
                        int i6 = (((C0379o0OOo0O0) c0379o0OOo0O02.OooOO0o.get(0)).OooO0oO + c0379o0OOo0O02.OooO0o) - (((C0379o0OOo0O0) c0379o0OOo0O0.OooOO0o.get(0)).OooO0oO + c0379o0OOo0O0.OooO0o);
                        int i7 = c0392o0OOoOOO2.OooOOO0;
                        if (i6 < i7) {
                            c0392o0OOoOOO2.OooO0Oo(i6);
                        } else {
                            c0392o0OOoOOO2.OooO0Oo(i7);
                        }
                    }
                    if (c0392o0OOoOOO2.OooOO0 && c0379o0OOo0O0.OooOO0o.size() > 0 && c0379o0OOo0O02.OooOO0o.size() > 0) {
                        C0379o0OOo0O0 c0379o0OOo0O03 = (C0379o0OOo0O0) c0379o0OOo0O0.OooOO0o.get(0);
                        C0379o0OOo0O0 c0379o0OOo0O04 = (C0379o0OOo0O0) c0379o0OOo0O02.OooOO0o.get(0);
                        int i8 = c0379o0OOo0O03.OooO0oO;
                        int i9 = c0379o0OOo0O0.OooO0o + i8;
                        int i10 = c0379o0OOo0O04.OooO0oO;
                        int i11 = c0379o0OOo0O02.OooO0o + i10;
                        float f3 = this.OooO0O0.OooooOO;
                        if (c0379o0OOo0O03 == c0379o0OOo0O04) {
                            f3 = 0.5f;
                        } else {
                            i8 = i9;
                            i10 = i11;
                        }
                        c0379o0OOo0O0.OooO0Oo((int) ((((i10 - i8) - c0392o0OOoOOO2.OooO0oO) * f3) + i8 + 0.5f));
                        c0379o0OOo0O02.OooO0Oo(c0379o0OOo0O0.OooO0oO + c0392o0OOoOOO2.OooO0oO);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C0316o0O0o0o c0316o0O0o0o4 = this.OooO0O0;
        OooOO0o(c0316o0O0o0o4.Oooo0O0, c0316o0O0o0o4.Oooo0o0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x025b, code lost:
        if (r14.OooO0O0.OooOooo != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x025d, code lost:
        OooO0OO(r7, r3, 1, r14.OooOO0o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0298, code lost:
        if (r0.OooO0Oo == 3) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02be, code lost:
        if (r14.OooO0O0.OooOooo != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x030a, code lost:
        if (r0.OooO0Oo == 3) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030c, code lost:
        r0.OooO0o0.OooOO0O.add(r2);
        r2.OooOO0o.add(r14.OooO0O0.OooO0Oo.OooO0o0);
        r2.OooO00o = r14;
     */
    /* JADX WARN: Type inference failed for: r0v116, types: [com.ninja.engine.oo00oO, com.ninja.engine.o0OOoOOO] */
    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0Oo() {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1435oo00oo.OooO0Oo():void");
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o() {
        this.OooO0OO = null;
        this.OooO0oo.OooO0OO();
        this.OooO.OooO0OO();
        this.OooOO0O.OooO0OO();
        this.OooO0o0.OooO0OO();
        this.OooO0oO = false;
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o0() {
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
        if (c0379o0OOo0O0.OooOO0) {
            this.OooO0O0.OoooOoO = c0379o0OOo0O0.OooO0oO;
        }
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final boolean OooOO0O() {
        if (this.OooO0Oo != 3 || this.OooO0O0.OooOOoo == 0) {
            return true;
        }
        return false;
    }

    public final void OooOOO0() {
        this.OooO0oO = false;
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
        c0379o0OOo0O0.OooO0OO();
        c0379o0OOo0O0.OooOO0 = false;
        C0379o0OOo0O0 c0379o0OOo0O02 = this.OooO;
        c0379o0OOo0O02.OooO0OO();
        c0379o0OOo0O02.OooOO0 = false;
        C0379o0OOo0O0 c0379o0OOo0O03 = this.OooOO0O;
        c0379o0OOo0O03.OooO0OO();
        c0379o0OOo0O03.OooOO0 = false;
        this.OooO0o0.OooOO0 = false;
    }

    public final String toString() {
        return "VerticalRun " + this.OooO0O0.Oooooo;
    }
}
