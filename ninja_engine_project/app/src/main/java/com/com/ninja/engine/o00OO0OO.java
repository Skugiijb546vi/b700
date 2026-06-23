package com.ninja.engine;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public final class o00OO0OO implements Set {
    public final /* synthetic */ C0145o00OO0oO OooO00o;

    public o00OO0OO(C0145o00OO0oO c0145o00OO0oO) {
        this.OooO00o = c0145o00OO0oO;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.OooO00o.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.OooO00o.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.OooO00o.OooOO0O(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int i = 0;
        for (int i2 = c0145o00OO0oO.OooO0OO - 1; i2 >= 0; i2--) {
            Object OooO0o = c0145o00OO0oO.OooO0o(i2);
            if (OooO0o == null) {
                hashCode = 0;
            } else {
                hashCode = OooO0o.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.OooO00o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new o00OO0O(this.OooO00o, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int OooO0Oo = c0145o00OO0oO.OooO0Oo(obj);
        if (OooO0Oo >= 0) {
            c0145o00OO0oO.OooO0oo(OooO0Oo);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.OooO00o.OooOO0o(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int i = c0145o00OO0oO.OooO0OO;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c0145o00OO0oO.OooO0o(i2))) {
                c0145o00OO0oO.OooO0oo(i2);
            }
        }
        if (i != c0145o00OO0oO.OooO0OO) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.OooO00o.OooO0OO;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int i = c0145o00OO0oO.OooO0OO;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0145o00OO0oO.OooO0o(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        int i = c0145o00OO0oO.OooO0OO;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0145o00OO0oO.OooO0o(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
