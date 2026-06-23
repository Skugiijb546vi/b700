package com.ninja.engine;

import java.util.AbstractSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o00OO0O0 extends AbstractSet {
    public final /* synthetic */ C0145o00OO0oO OooO00o;

    public o00OO0O0(C0145o00OO0oO c0145o00OO0oO) {
        this.OooO00o = c0145o00OO0oO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0144o00OO0o0(this.OooO00o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.OooO00o.OooO0OO;
    }
}
