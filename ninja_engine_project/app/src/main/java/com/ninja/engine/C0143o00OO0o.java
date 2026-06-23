package com.ninja.engine;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o00OO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143o00OO0o implements Collection {
    public final /* synthetic */ C0145o00OO0oO OooO00o;

    public C0143o00OO0o(C0145o00OO0oO c0145o00OO0oO) {
        this.OooO00o = c0145o00OO0oO;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.OooO00o.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.OooO00o.OooO00o(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.OooO00o.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new o00OO0O(this.OooO00o, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int OooO00o = c0145o00OO0oO.OooO00o(obj);
        if (OooO00o >= 0) {
            c0145o00OO0oO.OooO0oo(OooO00o);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int i = c0145o00OO0oO.OooO0OO;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c0145o00OO0oO.OooOO0(i2))) {
                c0145o00OO0oO.OooO0oo(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int i = c0145o00OO0oO.OooO0OO;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c0145o00OO0oO.OooOO0(i2))) {
                c0145o00OO0oO.OooO0oo(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.OooO00o.OooO0OO;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int i = c0145o00OO0oO.OooO0OO;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0145o00OO0oO.OooOO0(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int i = c0145o00OO0oO.OooO0OO;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0145o00OO0oO.OooOO0(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
