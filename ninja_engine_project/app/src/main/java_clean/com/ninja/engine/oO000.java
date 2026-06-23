package com.ninja.engine;
/* loaded from: classes.dex */
public final class oO000 extends AbstractC1504oo0OOo00 {
    public oO000(C0316o0O0o0o o0o0o0o) {
        super(o0o0o0o);
    }

    @Override // com.ninja.engine.InterfaceC0376o0OOo00O
    public final void OooO00o(InterfaceC0376o0OOo00O interfaceC0376o0OOo00O) {
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
        if (!c0379o0OOo0O0.OooO0OO || c0379o0OOo0O0.OooOO0) {
            return;
        }
        c0379o0OOo0O0.OooO0Oo((int) ((((C0379o0OOo0O0) c0379o0OOo0O0.OooOO0o.get(0)).OooO0oO * ((C0699oO0000oo) this.OooO0O0).o00ooo) + 0.5f));
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0Oo() {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00;
        C0316o0O0o0o c0316o0O0o0o = this.OooO0O0;
        C0699oO0000oo c0699oO0000oo = (C0699oO0000oo) c0316o0O0o0o;
        int i = c0699oO0000oo.oo000o;
        int i2 = c0699oO0000oo.o00oO0o;
        int i3 = c0699oO0000oo.o0ooOO0;
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
        if (i3 == 1) {
            if (i != -1) {
                c0379o0OOo0O0.OooOO0o.add(c0316o0O0o0o.OoooO.OooO0Oo.OooO0oo);
                this.OooO0O0.OoooO.OooO0Oo.OooO0oo.OooOO0O.add(c0379o0OOo0O0);
                c0379o0OOo0O0.OooO0o = i;
            } else if (i2 != -1) {
                c0379o0OOo0O0.OooOO0o.add(c0316o0O0o0o.OoooO.OooO0Oo.OooO);
                this.OooO0O0.OoooO.OooO0Oo.OooO.OooOO0O.add(c0379o0OOo0O0);
                c0379o0OOo0O0.OooO0o = -i2;
            } else {
                c0379o0OOo0O0.OooO0O0 = true;
                c0379o0OOo0O0.OooOO0o.add(c0316o0O0o0o.OoooO.OooO0Oo.OooO);
                this.OooO0O0.OoooO.OooO0Oo.OooO.OooOO0O.add(c0379o0OOo0O0);
            }
            OooOOO0(this.OooO0O0.OooO0Oo.OooO0oo);
            abstractC1504oo0OOo00 = this.OooO0O0.OooO0Oo;
        } else {
            if (i != -1) {
                c0379o0OOo0O0.OooOO0o.add(c0316o0O0o0o.OoooO.OooO0o0.OooO0oo);
                this.OooO0O0.OoooO.OooO0o0.OooO0oo.OooOO0O.add(c0379o0OOo0O0);
                c0379o0OOo0O0.OooO0o = i;
            } else if (i2 != -1) {
                c0379o0OOo0O0.OooOO0o.add(c0316o0O0o0o.OoooO.OooO0o0.OooO);
                this.OooO0O0.OoooO.OooO0o0.OooO.OooOO0O.add(c0379o0OOo0O0);
                c0379o0OOo0O0.OooO0o = -i2;
            } else {
                c0379o0OOo0O0.OooO0O0 = true;
                c0379o0OOo0O0.OooOO0o.add(c0316o0O0o0o.OoooO.OooO0o0.OooO);
                this.OooO0O0.OoooO.OooO0o0.OooO.OooOO0O.add(c0379o0OOo0O0);
            }
            OooOOO0(this.OooO0O0.OooO0o0.OooO0oo);
            abstractC1504oo0OOo00 = this.OooO0O0.OooO0o0;
        }
        OooOOO0(abstractC1504oo0OOo00.OooO);
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o() {
        this.OooO0oo.OooO0OO();
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o0() {
        C0316o0O0o0o c0316o0O0o0o = this.OooO0O0;
        int i = ((C0699oO0000oo) c0316o0O0o0o).o0ooOO0;
        C0379o0OOo0O0 c0379o0OOo0O0 = this.OooO0oo;
        if (i == 1) {
            c0316o0O0o0o.OoooOo0 = c0379o0OOo0O0.OooO0oO;
        } else {
            c0316o0O0o0o.OoooOoO = c0379o0OOo0O0.OooO0oO;
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


