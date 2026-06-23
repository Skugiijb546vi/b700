package com.ninja.engine;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class o00OO0O implements Iterator {
    public int OooO00o;
    public int OooO0O0;
    public boolean OooO0OO;
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public o00OO0O(int i) {
        this.OooO00o = i;
    }

    public final Object OooO00o(int i) {
        switch (this.OooO0Oo) {
            case 0:
                return ((C0145o00OO0oO) this.OooO0o0).OooO0o(i);
            case 1:
                return ((C0145o00OO0oO) this.OooO0o0).OooOO0(i);
            default:
                return ((C1446oo0O) this.OooO0o0).OooO0O0[i];
        }
    }

    public final void OooO0O0(int i) {
        switch (this.OooO0Oo) {
            case 0:
                ((C0145o00OO0oO) this.OooO0o0).OooO0oo(i);
                return;
            case 1:
                ((C0145o00OO0oO) this.OooO0o0).OooO0oo(i);
                return;
            default:
                ((C1446oo0O) this.OooO0o0).OooO00o(i);
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.OooO0O0 < this.OooO00o) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object OooO00o = OooO00o(this.OooO0O0);
            this.OooO0O0++;
            this.OooO0OO = true;
            return OooO00o;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.OooO0OO) {
            int i = this.OooO0O0 - 1;
            this.OooO0O0 = i;
            OooO0O0(i);
            this.OooO00o--;
            this.OooO0OO = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.".toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o00OO0O(C0145o00OO0oO c0145o00OO0oO, int i) {
        this(c0145o00OO0oO.OooO0OO);
        this.OooO0Oo = i;
        this.OooO0o0 = c0145o00OO0oO;
        switch (i) {
            case 1:
                this(c0145o00OO0oO.OooO0OO);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o00OO0O(C1446oo0O c1446oo0O) {
        this(c1446oo0O.OooO0OO);
        this.OooO0Oo = 2;
        this.OooO0o0 = c1446oo0O;
    }
}
