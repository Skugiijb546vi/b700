package com.ninja.engine;

import java.util.Iterator;
/* renamed from: com.ninja.engine.oOo0O00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176oOo0O00o extends AbstractC1185oOoO0ooo implements Iterator {
    public C1183oOoO0oo OooO00o;
    public C1183oOoO0oo OooO0O0;
    public final /* synthetic */ int OooO0OO;

    public C1176oOo0O00o(C1183oOoO0oo c1183oOoO0oo, C1183oOoO0oo c1183oOoO0oo2, int i) {
        this.OooO0OO = i;
        this.OooO00o = c1183oOoO0oo2;
        this.OooO0O0 = c1183oOoO0oo;
    }

    @Override // com.ninja.engine.AbstractC1185oOoO0ooo
    public final void OooO00o(C1183oOoO0oo c1183oOoO0oo) {
        C1183oOoO0oo c1183oOoO0oo2 = null;
        if (this.OooO00o == c1183oOoO0oo && c1183oOoO0oo == this.OooO0O0) {
            this.OooO0O0 = null;
            this.OooO00o = null;
        }
        C1183oOoO0oo c1183oOoO0oo3 = this.OooO00o;
        if (c1183oOoO0oo3 == c1183oOoO0oo) {
            this.OooO00o = OooO0O0(c1183oOoO0oo3);
        }
        C1183oOoO0oo c1183oOoO0oo4 = this.OooO0O0;
        if (c1183oOoO0oo4 == c1183oOoO0oo) {
            C1183oOoO0oo c1183oOoO0oo5 = this.OooO00o;
            if (c1183oOoO0oo4 != c1183oOoO0oo5 && c1183oOoO0oo5 != null) {
                c1183oOoO0oo2 = OooO0OO(c1183oOoO0oo4);
            }
            this.OooO0O0 = c1183oOoO0oo2;
        }
    }

    public final C1183oOoO0oo OooO0O0(C1183oOoO0oo c1183oOoO0oo) {
        switch (this.OooO0OO) {
            case 0:
                return c1183oOoO0oo.OooO0Oo;
            default:
                return c1183oOoO0oo.OooO0OO;
        }
    }

    public final C1183oOoO0oo OooO0OO(C1183oOoO0oo c1183oOoO0oo) {
        switch (this.OooO0OO) {
            case 0:
                return c1183oOoO0oo.OooO0OO;
            default:
                return c1183oOoO0oo.OooO0Oo;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.OooO0O0 != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1183oOoO0oo c1183oOoO0oo;
        C1183oOoO0oo c1183oOoO0oo2 = this.OooO0O0;
        C1183oOoO0oo c1183oOoO0oo3 = this.OooO00o;
        if (c1183oOoO0oo2 != c1183oOoO0oo3 && c1183oOoO0oo3 != null) {
            c1183oOoO0oo = OooO0OO(c1183oOoO0oo2);
        } else {
            c1183oOoO0oo = null;
        }
        this.OooO0O0 = c1183oOoO0oo;
        return c1183oOoO0oo2;
    }
}
