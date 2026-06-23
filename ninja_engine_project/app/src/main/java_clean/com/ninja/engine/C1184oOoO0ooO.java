package com.ninja.engine;

import java.util.Iterator;
/* renamed from: com.ninja.engine.oOoO0ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184oOoO0ooO extends AbstractC1185oOoO0ooo implements Iterator {
    public C1183oOoO0oo OooO00o;
    public boolean OooO0O0 = true;
    public final /* synthetic */ C1182oOoO OooO0OO;

    public C1184oOoO0ooO(C1182oOoO c1182oOoO) {
        this.OooO0OO = c1182oOoO;
    }

    @Override // com.ninja.engine.AbstractC1185oOoO0ooo
    public final void OooO00o(C1183oOoO0oo c1183oOoO0oo) {
        boolean z;
        C1183oOoO0oo c1183oOoO0oo2 = this.OooO00o;
        if (c1183oOoO0oo == c1183oOoO0oo2) {
            C1183oOoO0oo c1183oOoO0oo3 = c1183oOoO0oo2.OooO0Oo;
            this.OooO00o = c1183oOoO0oo3;
            if (c1183oOoO0oo3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.OooO0O0 = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.OooO0O0) {
            if (this.OooO0OO.OooO00o == null) {
                return false;
            }
            return true;
        }
        C1183oOoO0oo c1183oOoO0oo = this.OooO00o;
        if (c1183oOoO0oo == null || c1183oOoO0oo.OooO0OO == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1183oOoO0oo c1183oOoO0oo;
        if (this.OooO0O0) {
            this.OooO0O0 = false;
            c1183oOoO0oo = this.OooO0OO.OooO00o;
        } else {
            C1183oOoO0oo c1183oOoO0oo2 = this.OooO00o;
            if (c1183oOoO0oo2 != null) {
                c1183oOoO0oo = c1183oOoO0oo2.OooO0OO;
            } else {
                c1183oOoO0oo = null;
            }
        }
        this.OooO00o = c1183oOoO0oo;
        return this.OooO00o;
    }
}


