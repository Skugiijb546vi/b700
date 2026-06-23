package com.ninja.engine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
/* renamed from: com.ninja.engine.oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1446oo0O implements Collection, Set {
    public int[] OooO00o = AbstractC0694o0ooooo0.OooO0O0;
    public Object[] OooO0O0 = AbstractC0694o0ooooo0.OooO0OO;
    public int OooO0OO;

    public C1446oo0O(int i) {
        if (i > 0) {
            AbstractC0809oO0OooOO.OooO0O0(this, i);
        }
    }

    public final void OooO00o(int i) {
        int i2 = this.OooO0OO;
        Object[] objArr = this.OooO0O0;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.OooO00o;
        int i4 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            AbstractC0809oO0OooOO.OooO0O0(this, i4);
            if (i > 0) {
                o00OO.o00O0O(0, 0, i, iArr, this.OooO00o);
                o00OO.o00Ooo(objArr, this.OooO0O0, 0, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                o00OO.o00O0O(i, i5, i2, iArr, this.OooO00o);
                o00OO.o00Oo0(objArr, this.OooO0O0, i, i5, i2);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                o00OO.o00O0O(i, i6, i2, iArr, iArr);
                Object[] objArr2 = this.OooO0O0;
                o00OO.o00Oo0(objArr2, objArr2, i, i6, i2);
            }
            this.OooO0O0[i3] = null;
        }
        if (i2 == this.OooO0OO) {
            this.OooO0OO = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int Oooo0o;
        boolean z;
        int i2 = this.OooO0OO;
        if (obj == null) {
            Oooo0o = AbstractC0809oO0OooOO.Oooo0o(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            Oooo0o = AbstractC0809oO0OooOO.Oooo0o(this, obj, hashCode);
        }
        if (Oooo0o >= 0) {
            return false;
        }
        int i3 = ~Oooo0o;
        int[] iArr = this.OooO00o;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.OooO0O0;
            AbstractC0809oO0OooOO.OooO0O0(this, i4);
            if (i2 == this.OooO0OO) {
                int[] iArr2 = this.OooO00o;
                if (iArr2.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    o00OO.o00O0O(0, 0, iArr.length, iArr, iArr2);
                    o00OO.o00Ooo(objArr, this.OooO0O0, 0, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.OooO00o;
            int i5 = i3 + 1;
            o00OO.o00O0O(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.OooO0O0;
            o00OO.o00Oo0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.OooO0OO;
        if (i2 == i6) {
            int[] iArr4 = this.OooO00o;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.OooO0O0[i3] = obj;
                this.OooO0OO = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC0809oO0OooOO.OooOOOo(collection, "elements");
        int size = collection.size() + this.OooO0OO;
        int i = this.OooO0OO;
        int[] iArr = this.OooO00o;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.OooO0O0;
            AbstractC0809oO0OooOO.OooO0O0(this, size);
            int i2 = this.OooO0OO;
            if (i2 > 0) {
                o00OO.o00O0O(0, 0, i2, iArr, this.OooO00o);
                o00OO.o00Ooo(objArr, this.OooO0O0, 0, 0, this.OooO0OO, 6);
            }
        }
        if (this.OooO0OO == i) {
            for (Object obj : collection) {
                z |= add(obj);
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.OooO0OO != 0) {
            this.OooO00o = AbstractC0694o0ooooo0.OooO0O0;
            this.OooO0O0 = AbstractC0694o0ooooo0.OooO0OO;
            this.OooO0OO = 0;
        }
        if (this.OooO0OO == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int Oooo0o;
        if (obj == null) {
            Oooo0o = AbstractC0809oO0OooOO.Oooo0o(this, null, 0);
        } else {
            Oooo0o = AbstractC0809oO0OooOO.Oooo0o(this, obj, obj.hashCode());
        }
        if (Oooo0o < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC0809oO0OooOO.OooOOOo(collection, "elements");
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.OooO0OO == ((Set) obj).size()) {
            try {
                int i = this.OooO0OO;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.OooO0O0[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.OooO00o;
        int i = this.OooO0OO;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.OooO0OO <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new o00OO0O(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int Oooo0o;
        if (obj == null) {
            Oooo0o = AbstractC0809oO0OooOO.Oooo0o(this, null, 0);
        } else {
            Oooo0o = AbstractC0809oO0OooOO.Oooo0o(this, obj, obj.hashCode());
        }
        if (Oooo0o < 0) {
            return false;
        }
        OooO00o(Oooo0o);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC0809oO0OooOO.OooOOOo(collection, "elements");
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC0809oO0OooOO.OooOOOo(collection, "elements");
        boolean z = false;
        for (int i = this.OooO0OO - 1; -1 < i; i--) {
            if (!AbstractC0561o0oO0O0o.o00Oo0(collection, this.OooO0O0[i])) {
                OooO00o(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.OooO0OO;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.OooO0O0;
        int i = this.OooO0OO;
        AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
        int length = objArr.length;
        if (i <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
            AbstractC0809oO0OooOO.OooOOOO(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.OooO0OO * 14);
        sb.append('{');
        int i = this.OooO0OO;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.OooO0O0[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0809oO0OooOO.OooOOOO(sb2, "StringBuilder(capacity).â€¦builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC0809oO0OooOO.OooOOOo(objArr, "array");
        int i = this.OooO0OO;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        o00OO.o00Oo0(this.OooO0O0, objArr, 0, 0, this.OooO0OO);
        return objArr;
    }
}


