package com.ninja.engine;

import java.util.Iterator;
/* renamed from: com.ninja.engine.ooOOOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1792ooOOOOOo extends AbstractC1504oo0OOo00 {
    @Override // com.ninja.engine.InterfaceC0376o0OOo00O
    public final void OooO00o(InterfaceC0376o0OOo00O interfaceC0376o0OOo00O) {
        C0181o00OooO c0181o00OooO = (C0181o00OooO) this.OooO0O0;
        int i = c0181o00OooO.o00oO0o;
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
        Iterator it = c0379o0OOo0O0.OooOO0o.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0379o0OOo0O0) it.next()).OooO0oO;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            c0379o0OOo0O0.OooO0Oo(i2 + c0181o00OooO.o0ooOO0);
        } else {
            c0379o0OOo0O0.OooO0Oo(i3 + c0181o00OooO.o0ooOO0);
        }
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0Oo() {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00;
        C0316o0O0o0o c0316o0O0o0o = this.OooO0O0;
        if (c0316o0O0o0o instanceof C0181o00OooO) {
            C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
            c0379o0OOo0O0.OooO0O0 = true;
            C0181o00OooO c0181o00OooO = (C0181o00OooO) c0316o0O0o0o;
            int i = c0181o00OooO.o00oO0o;
            boolean z = c0181o00OooO.o00oO0O;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c0379o0OOo0O0.OooO0o0 = 7;
                            while (i2 < c0181o00OooO.oo000o) {
                                C0316o0O0o0o c0316o0O0o0o2 = c0181o00OooO.o00ooo[i2];
                                if (z || c0316o0O0o0o2.Oooooo0 != 8) {
                                    C0379o0OOo0O0 c0379o0OOo0O02 = c0316o0O0o0o2.OooO0o0.OooO;
                                    c0379o0OOo0O02.OooOO0O.add(c0379o0OOo0O0);
                                    c0379o0OOo0O0.OooOO0o.add(c0379o0OOo0O02);
                                }
                                i2++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        c0379o0OOo0O0.OooO0o0 = 6;
                        while (i2 < c0181o00OooO.oo000o) {
                            C0316o0O0o0o c0316o0O0o0o3 = c0181o00OooO.o00ooo[i2];
                            if (z || c0316o0O0o0o3.Oooooo0 != 8) {
                                C0379o0OOo0O0 c0379o0OOo0O03 = c0316o0O0o0o3.OooO0o0.OooO0oo;
                                c0379o0OOo0O03.OooOO0O.add(c0379o0OOo0O0);
                                c0379o0OOo0O0.OooOO0o.add(c0379o0OOo0O03);
                            }
                            i2++;
                        }
                    }
                    OooOOO0(this.OooO0O0.OooO0o0.OooO0oo);
                    abstractC1504oo0OOo00 = this.OooO0O0.OooO0o0;
                    OooOOO0(abstractC1504oo0OOo00.OooO);
                }
                c0379o0OOo0O0.OooO0o0 = 5;
                while (i2 < c0181o00OooO.oo000o) {
                    C0316o0O0o0o c0316o0O0o0o4 = c0181o00OooO.o00ooo[i2];
                    if (z || c0316o0O0o0o4.Oooooo0 != 8) {
                        C0379o0OOo0O0 c0379o0OOo0O04 = c0316o0O0o0o4.OooO0Oo.OooO;
                        c0379o0OOo0O04.OooOO0O.add(c0379o0OOo0O0);
                        c0379o0OOo0O0.OooOO0o.add(c0379o0OOo0O04);
                    }
                    i2++;
                }
            } else {
                c0379o0OOo0O0.OooO0o0 = 4;
                while (i2 < c0181o00OooO.oo000o) {
                    C0316o0O0o0o c0316o0O0o0o5 = c0181o00OooO.o00ooo[i2];
                    if (z || c0316o0O0o0o5.Oooooo0 != 8) {
                        C0379o0OOo0O0 c0379o0OOo0O05 = c0316o0O0o0o5.OooO0Oo.OooO0oo;
                        c0379o0OOo0O05.OooOO0O.add(c0379o0OOo0O0);
                        c0379o0OOo0O0.OooOO0o.add(c0379o0OOo0O05);
                    }
                    i2++;
                }
            }
            OooOOO0(this.OooO0O0.OooO0Oo.OooO0oo);
            abstractC1504oo0OOo00 = this.OooO0O0.OooO0Oo;
            OooOOO0(abstractC1504oo0OOo00.OooO);
        }
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o() {
        this.OooO0OO = null;
        this.OooO0oo.OooO0OO();
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o0() {
        C0316o0O0o0o c0316o0O0o0o = this.OooO0O0;
        if (c0316o0O0o0o instanceof C0181o00OooO) {
            int i = ((C0181o00OooO) c0316o0O0o0o).o00oO0o;
            C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
            if (i != 0 && i != 1) {
                c0316o0O0o0o.OoooOoO = c0379o0OOo0O0.OooO0oO;
            } else {
                c0316o0O0o0o.OoooOo0 = c0379o0OOo0O0.OooO0oO;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final boolean OooOO0O() {
        return false;
    }

    public final void OooOOO0(C0379o0OOo0O0 c0379o0OOo0O0) {
        C0379o0OOo0O0 c0379o0OOo0O02 = this.OooO0oo;
        c0379o0OOo0O02.OooOO0O.add(c0379o0OOo0O0);
        c0379o0OOo0O0.OooOO0o.add(c0379o0OOo0O02);
    }
}
