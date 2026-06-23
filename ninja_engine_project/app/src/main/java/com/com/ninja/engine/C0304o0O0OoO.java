package com.ninja.engine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0O0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304o0O0OoO {
    public C1232oOoOo0oO OooO;
    public int OooO0O0;
    public boolean OooO0OO;
    public final C0316o0O0o0o OooO0Oo;
    public C0304o0O0OoO OooO0o;
    public final int OooO0o0;
    public HashSet OooO00o = null;
    public int OooO0oO = 0;
    public int OooO0oo = Integer.MIN_VALUE;

    public C0304o0O0OoO(C0316o0O0o0o c0316o0O0o0o, int i) {
        this.OooO0Oo = c0316o0O0o0o;
        this.OooO0o0 = i;
    }

    public final boolean OooO(C0304o0O0OoO c0304o0O0OoO) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c0304o0O0OoO == null) {
            return false;
        }
        int i = this.OooO0o0;
        C0316o0O0o0o c0316o0O0o0o = c0304o0O0OoO.OooO0Oo;
        int i2 = c0304o0O0OoO.OooO0o0;
        if (i2 != i) {
            switch (AbstractC1230oOoOo0o.OooOOOo(i)) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (i2 != 2 && i2 != 4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (c0316o0O0o0o instanceof C0699oO0000oo) {
                        return (z || i2 == 8) ? true : true;
                    }
                    return z;
                case 2:
                case 4:
                    if (i2 != 3 && i2 != 5) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (c0316o0O0o0o instanceof C0699oO0000oo) {
                        return (z2 || i2 == 9) ? true : true;
                    }
                    return z2;
                case 5:
                    if (i2 == 2 || i2 == 4) {
                        return false;
                    }
                    return true;
                case 6:
                    if (i2 == 6 || i2 == 8 || i2 == 9) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(AbstractC1230oOoOo0o.OooOOO(i));
            }
        } else if (i == 6 && (!c0316o0O0o0o.OooOooo || !this.OooO0Oo.OooOooo)) {
            return false;
        } else {
            return true;
        }
    }

    public final void OooO00o(C0304o0O0OoO c0304o0O0OoO, int i) {
        OooO0O0(c0304o0O0OoO, i, Integer.MIN_VALUE, false);
    }

    public final boolean OooO0O0(C0304o0O0OoO c0304o0O0OoO, int i, int i2, boolean z) {
        if (c0304o0O0OoO == null) {
            OooOO0();
            return true;
        } else if (!z && !OooO(c0304o0O0OoO)) {
            return false;
        } else {
            this.OooO0o = c0304o0O0OoO;
            if (c0304o0O0OoO.OooO00o == null) {
                c0304o0O0OoO.OooO00o = new HashSet();
            }
            HashSet hashSet = this.OooO0o.OooO00o;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.OooO0oO = i;
            this.OooO0oo = i2;
            return true;
        }
    }

    public final void OooO0OO(int i, C1501oo0OOOoo c1501oo0OOOoo, ArrayList arrayList) {
        HashSet hashSet = this.OooO00o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0809oO0OooOO.OooOoOO(((C0304o0O0OoO) it.next()).OooO0Oo, i, arrayList, c1501oo0OOOoo);
            }
        }
    }

    public final int OooO0Oo() {
        if (!this.OooO0OO) {
            return 0;
        }
        return this.OooO0O0;
    }

    public final C0304o0O0OoO OooO0o() {
        int i = this.OooO0o0;
        int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(i);
        C0316o0O0o0o c0316o0O0o0o = this.OooO0Oo;
        switch (OooOOOo) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0316o0O0o0o.Oooo0OO;
            case 2:
                return c0316o0O0o0o.Oooo0o0;
            case 3:
                return c0316o0O0o0o.Oooo0;
            case 4:
                return c0316o0O0o0o.Oooo0O0;
            default:
                throw new AssertionError(AbstractC1230oOoOo0o.OooOOO(i));
        }
    }

    public final int OooO0o0() {
        C0304o0O0OoO c0304o0O0OoO;
        if (this.OooO0Oo.Oooooo0 == 8) {
            return 0;
        }
        int i = this.OooO0oo;
        if (i != Integer.MIN_VALUE && (c0304o0O0OoO = this.OooO0o) != null && c0304o0O0OoO.OooO0Oo.Oooooo0 == 8) {
            return i;
        }
        return this.OooO0oO;
    }

    public final boolean OooO0oO() {
        HashSet hashSet = this.OooO00o;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0304o0O0OoO) it.next()).OooO0o().OooO0oo()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0oo() {
        if (this.OooO0o != null) {
            return true;
        }
        return false;
    }

    public final void OooOO0() {
        HashSet hashSet;
        C0304o0O0OoO c0304o0O0OoO = this.OooO0o;
        if (c0304o0O0OoO != null && (hashSet = c0304o0O0OoO.OooO00o) != null) {
            hashSet.remove(this);
            if (this.OooO0o.OooO00o.size() == 0) {
                this.OooO0o.OooO00o = null;
            }
        }
        this.OooO00o = null;
        this.OooO0o = null;
        this.OooO0oO = 0;
        this.OooO0oo = Integer.MIN_VALUE;
        this.OooO0OO = false;
        this.OooO0O0 = 0;
    }

    public final void OooOO0O() {
        C1232oOoOo0oO c1232oOoOo0oO = this.OooO;
        if (c1232oOoOo0oO == null) {
            this.OooO = new C1232oOoOo0oO(1);
        } else {
            c1232oOoOo0oO.OooO0OO();
        }
    }

    public final void OooOO0o(int i) {
        this.OooO0O0 = i;
        this.OooO0OO = true;
    }

    public final String toString() {
        return this.OooO0Oo.Oooooo + ":" + AbstractC1230oOoOo0o.OooOOO(this.OooO0o0);
    }
}
