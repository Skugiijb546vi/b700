package com.ninja.engine;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class oO00o000 implements Iterator {
    public final int OooO00o;
    public final int OooO0O0;
    public boolean OooO0OO;
    public int OooO0Oo;

    public oO00o000(int i, int i2, int i3) {
        this.OooO00o = i3;
        this.OooO0O0 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.OooO0OO = z;
        this.OooO0Oo = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OooO0OO;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.OooO0Oo;
        if (i == this.OooO0O0) {
            if (this.OooO0OO) {
                this.OooO0OO = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.OooO0Oo = this.OooO00o + i;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
