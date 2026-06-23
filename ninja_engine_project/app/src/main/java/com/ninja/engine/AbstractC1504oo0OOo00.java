package com.ninja.engine;
/* renamed from: com.ninja.engine.oo0OOo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1504oo0OOo00 implements InterfaceC0376o0OOo00O {
    public int OooO00o;
    public C0316o0O0o0o OooO0O0;
    public C1155oOo00O0 OooO0OO;
    public int OooO0Oo;
    public final C0392o0OOoOOO OooO0o0 = new C0392o0OOoOOO(this);
    public int OooO0o = 0;
    public boolean OooO0oO = false;
    public final C0379o0OOo0O0 OooO0oo = new C0379o0OOo0O0(this);
    public final C0379o0OOo0O0 OooO = new C0379o0OOo0O0(this);
    public int OooOO0 = 1;

    public AbstractC1504oo0OOo00(C0316o0O0o0o c0316o0O0o0o) {
        this.OooO0O0 = c0316o0O0o0o;
    }

    public static C0379o0OOo0O0 OooO(C0304o0O0OoO c0304o0O0OoO, int i) {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00;
        C0304o0O0OoO c0304o0O0OoO2 = c0304o0O0OoO.OooO0o;
        if (c0304o0O0OoO2 == null) {
            return null;
        }
        C0316o0O0o0o c0316o0O0o0o = c0304o0O0OoO2.OooO0Oo;
        if (i == 0) {
            abstractC1504oo0OOo00 = c0316o0O0o0o.OooO0Oo;
        } else {
            abstractC1504oo0OOo00 = c0316o0O0o0o.OooO0o0;
        }
        int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(c0304o0O0OoO2.OooO0o0);
        if (OooOOOo != 1 && OooOOOo != 2) {
            if (OooOOOo != 3 && OooOOOo != 4) {
                return null;
            }
            return abstractC1504oo0OOo00.OooO;
        }
        return abstractC1504oo0OOo00.OooO0oo;
    }

    public static void OooO0O0(C0379o0OOo0O0 c0379o0OOo0O0, C0379o0OOo0O0 c0379o0OOo0O02, int i) {
        c0379o0OOo0O0.OooOO0o.add(c0379o0OOo0O02);
        c0379o0OOo0O0.OooO0o = i;
        c0379o0OOo0O02.OooOO0O.add(c0379o0OOo0O0);
    }

    public static C0379o0OOo0O0 OooO0oo(C0304o0O0OoO c0304o0O0OoO) {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00;
        AbstractC1504oo0OOo00 abstractC1504oo0OOo002;
        C0304o0O0OoO c0304o0O0OoO2 = c0304o0O0OoO.OooO0o;
        if (c0304o0O0OoO2 == null) {
            return null;
        }
        int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(c0304o0O0OoO2.OooO0o0);
        C0316o0O0o0o c0316o0O0o0o = c0304o0O0OoO2.OooO0Oo;
        if (OooOOOo != 1) {
            if (OooOOOo != 2) {
                if (OooOOOo != 3) {
                    if (OooOOOo != 4) {
                        if (OooOOOo != 5) {
                            return null;
                        }
                        return c0316o0O0o0o.OooO0o0.OooOO0O;
                    }
                    abstractC1504oo0OOo002 = c0316o0O0o0o.OooO0o0;
                } else {
                    abstractC1504oo0OOo002 = c0316o0O0o0o.OooO0Oo;
                }
                return abstractC1504oo0OOo002.OooO;
            }
            abstractC1504oo0OOo00 = c0316o0O0o0o.OooO0o0;
        } else {
            abstractC1504oo0OOo00 = c0316o0O0o0o.OooO0Oo;
        }
        return abstractC1504oo0OOo00.OooO0oo;
    }

    public final void OooO0OO(C0379o0OOo0O0 c0379o0OOo0O0, C0379o0OOo0O0 c0379o0OOo0O02, int i, C0392o0OOoOOO c0392o0OOoOOO) {
        c0379o0OOo0O0.OooOO0o.add(c0379o0OOo0O02);
        c0379o0OOo0O0.OooOO0o.add(this.OooO0o0);
        c0379o0OOo0O0.OooO0oo = i;
        c0379o0OOo0O0.OooO = c0392o0OOoOOO;
        c0379o0OOo0O02.OooOO0O.add(c0379o0OOo0O0);
        c0392o0OOoOOO.OooOO0O.add(c0379o0OOo0O0);
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public final int OooO0oO(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0316o0O0o0o c0316o0O0o0o = this.OooO0O0;
            int i3 = c0316o0O0o0o.OooOo0O;
            max = Math.max(c0316o0O0o0o.OooOo0, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0316o0O0o0o c0316o0O0o0o2 = this.OooO0O0;
            int i4 = c0316o0O0o0o2.OooOoO0;
            max = Math.max(c0316o0O0o0o2.OooOo, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long OooOO0() {
        C0392o0OOoOOO c0392o0OOoOOO = this.OooO0o0;
        if (c0392o0OOoOOO.OooOO0) {
            return c0392o0OOoOOO.OooO0oO;
        }
        return 0L;
    }

    public abstract boolean OooOO0O();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.OooO00o == 3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0o(com.ninja.engine.C0304o0O0OoO r12, com.ninja.engine.C0304o0O0OoO r13, int r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1504oo0OOo00.OooOO0o(com.ninja.engine.o0O0OoO, com.ninja.engine.o0O0OoO, int):void");
    }
}
