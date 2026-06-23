package com.ninja.engine;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* renamed from: com.ninja.engine.o00OO00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142o00OO00o extends AbstractList implements List {
    public static final Object[] OooO0Oo = new Object[0];
    public int OooO00o;
    public Object[] OooO0O0 = OooO0Oo;
    public int OooO0OO;

    public final void OooO00o(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.OooO0O0.length;
        while (i < length && it.hasNext()) {
            this.OooO0O0[i] = it.next();
            i++;
        }
        int i2 = this.OooO00o;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.OooO0O0[i3] = it.next();
        }
        this.OooO0OO = collection.size() + this.OooO0OO;
    }

    public final void OooO0O0(int i) {
        if (i >= 0) {
            Object[] objArr = this.OooO0O0;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == OooO0Oo) {
                if (i < 10) {
                    i = 10;
                }
                this.OooO0O0 = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            o00OO.o00Oo0(objArr, objArr2, 0, this.OooO00o, objArr.length);
            Object[] objArr3 = this.OooO0O0;
            int length2 = objArr3.length;
            int i3 = this.OooO00o;
            o00OO.o00Oo0(objArr3, objArr2, length2 - i3, 0, i3);
            this.OooO00o = 0;
            this.OooO0O0 = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int OooO0OO(int i) {
        Object[] objArr = this.OooO0O0;
        AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int OooO0Oo(int i) {
        Object[] objArr = this.OooO0O0;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.OooO0OO;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i3);
        } else if (i == i3) {
            addLast(obj);
        } else if (i == 0) {
            addFirst(obj);
        } else {
            OooO0O0(i3 + 1);
            int OooO0Oo2 = OooO0Oo(this.OooO00o + i);
            int i4 = this.OooO0OO;
            if (i < ((i4 + 1) >> 1)) {
                if (OooO0Oo2 == 0) {
                    Object[] objArr = this.OooO0O0;
                    AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
                    OooO0Oo2 = objArr.length;
                }
                int i5 = OooO0Oo2 - 1;
                int i6 = this.OooO00o;
                if (i6 == 0) {
                    Object[] objArr2 = this.OooO0O0;
                    AbstractC0809oO0OooOO.OooOOOo(objArr2, "<this>");
                    i2 = objArr2.length - 1;
                } else {
                    i2 = i6 - 1;
                }
                int i7 = this.OooO00o;
                Object[] objArr3 = this.OooO0O0;
                if (i5 >= i7) {
                    objArr3[i2] = objArr3[i7];
                    o00OO.o00Oo0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
                } else {
                    o00OO.o00Oo0(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                    Object[] objArr4 = this.OooO0O0;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    o00OO.o00Oo0(objArr4, objArr4, 0, 1, i5 + 1);
                }
                this.OooO0O0[i5] = obj;
                this.OooO00o = i2;
            } else {
                int OooO0Oo3 = OooO0Oo(this.OooO00o + i4);
                Object[] objArr5 = this.OooO0O0;
                if (OooO0Oo2 < OooO0Oo3) {
                    o00OO.o00Oo0(objArr5, objArr5, OooO0Oo2 + 1, OooO0Oo2, OooO0Oo3);
                } else {
                    o00OO.o00Oo0(objArr5, objArr5, 1, 0, OooO0Oo3);
                    Object[] objArr6 = this.OooO0O0;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    o00OO.o00Oo0(objArr6, objArr6, OooO0Oo2 + 1, OooO0Oo2, objArr6.length - 1);
                }
                this.OooO0O0[OooO0Oo2] = obj;
            }
            this.OooO0OO++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0809oO0OooOO.OooOOOo(collection, "elements");
        int i2 = this.OooO0OO;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            int i3 = this.OooO0OO;
            if (i == i3) {
                return addAll(collection);
            }
            OooO0O0(collection.size() + i3);
            int OooO0Oo2 = OooO0Oo(this.OooO00o + this.OooO0OO);
            int OooO0Oo3 = OooO0Oo(this.OooO00o + i);
            int size = collection.size();
            if (i < ((this.OooO0OO + 1) >> 1)) {
                int i4 = this.OooO00o;
                int i5 = i4 - size;
                if (OooO0Oo3 < i4) {
                    Object[] objArr = this.OooO0O0;
                    o00OO.o00Oo0(objArr, objArr, i5, i4, objArr.length);
                    Object[] objArr2 = this.OooO0O0;
                    if (size >= OooO0Oo3) {
                        o00OO.o00Oo0(objArr2, objArr2, objArr2.length - size, 0, OooO0Oo3);
                    } else {
                        o00OO.o00Oo0(objArr2, objArr2, objArr2.length - size, 0, size);
                        Object[] objArr3 = this.OooO0O0;
                        o00OO.o00Oo0(objArr3, objArr3, 0, size, OooO0Oo3);
                    }
                } else if (i5 >= 0) {
                    Object[] objArr4 = this.OooO0O0;
                    o00OO.o00Oo0(objArr4, objArr4, i5, i4, OooO0Oo3);
                } else {
                    Object[] objArr5 = this.OooO0O0;
                    i5 += objArr5.length;
                    int i6 = OooO0Oo3 - i4;
                    int length = objArr5.length - i5;
                    if (length >= i6) {
                        o00OO.o00Oo0(objArr5, objArr5, i5, i4, OooO0Oo3);
                    } else {
                        o00OO.o00Oo0(objArr5, objArr5, i5, i4, i4 + length);
                        Object[] objArr6 = this.OooO0O0;
                        o00OO.o00Oo0(objArr6, objArr6, 0, this.OooO00o + length, OooO0Oo3);
                    }
                }
                this.OooO00o = i5;
                OooO0Oo3 -= size;
                if (OooO0Oo3 < 0) {
                    OooO0Oo3 += this.OooO0O0.length;
                }
            } else {
                int i7 = OooO0Oo3 + size;
                if (OooO0Oo3 < OooO0Oo2) {
                    int i8 = size + OooO0Oo2;
                    Object[] objArr7 = this.OooO0O0;
                    if (i8 > objArr7.length) {
                        if (i7 >= objArr7.length) {
                            i7 -= objArr7.length;
                        } else {
                            int length2 = OooO0Oo2 - (i8 - objArr7.length);
                            o00OO.o00Oo0(objArr7, objArr7, 0, length2, OooO0Oo2);
                            Object[] objArr8 = this.OooO0O0;
                            o00OO.o00Oo0(objArr8, objArr8, i7, OooO0Oo3, length2);
                        }
                    }
                    o00OO.o00Oo0(objArr7, objArr7, i7, OooO0Oo3, OooO0Oo2);
                } else {
                    Object[] objArr9 = this.OooO0O0;
                    o00OO.o00Oo0(objArr9, objArr9, size, 0, OooO0Oo2);
                    Object[] objArr10 = this.OooO0O0;
                    if (i7 >= objArr10.length) {
                        o00OO.o00Oo0(objArr10, objArr10, i7 - objArr10.length, OooO0Oo3, objArr10.length);
                    } else {
                        o00OO.o00Oo0(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                        Object[] objArr11 = this.OooO0O0;
                        o00OO.o00Oo0(objArr11, objArr11, i7, OooO0Oo3, objArr11.length - size);
                    }
                }
            }
            OooO00o(OooO0Oo3, collection);
            return true;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public final void addFirst(Object obj) {
        OooO0O0(this.OooO0OO + 1);
        int i = this.OooO00o;
        if (i == 0) {
            Object[] objArr = this.OooO0O0;
            AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.OooO00o = i2;
        this.OooO0O0[i2] = obj;
        this.OooO0OO++;
    }

    public final void addLast(Object obj) {
        OooO0O0(this.OooO0OO + 1);
        this.OooO0O0[OooO0Oo(this.OooO00o + this.OooO0OO)] = obj;
        this.OooO0OO++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int OooO0Oo2 = OooO0Oo(this.OooO00o + this.OooO0OO);
        int i = this.OooO00o;
        if (i < OooO0Oo2) {
            Object[] objArr = this.OooO0O0;
            AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
            Arrays.fill(objArr, i, OooO0Oo2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.OooO0O0;
            Arrays.fill(objArr2, this.OooO00o, objArr2.length, (Object) null);
            Object[] objArr3 = this.OooO0O0;
            AbstractC0809oO0OooOO.OooOOOo(objArr3, "<this>");
            Arrays.fill(objArr3, 0, OooO0Oo2, (Object) null);
        }
        this.OooO00o = 0;
        this.OooO0OO = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.OooO0OO;
        if (i >= 0 && i < i2) {
            return this.OooO0O0[OooO0Oo(this.OooO00o + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int OooO0Oo2 = OooO0Oo(this.OooO00o + this.OooO0OO);
        int i = this.OooO00o;
        if (i < OooO0Oo2) {
            while (i < OooO0Oo2) {
                if (!AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i >= OooO0Oo2) {
            int length = this.OooO0O0.length;
            while (true) {
                if (i < length) {
                    if (AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[i])) {
                        break;
                    }
                    i++;
                } else {
                    for (int i2 = 0; i2 < OooO0Oo2; i2++) {
                        if (AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[i2])) {
                            i = i2 + this.OooO0O0.length;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i - this.OooO00o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.OooO0OO == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int OooO0Oo2 = OooO0Oo(this.OooO00o + this.OooO0OO);
        int i = this.OooO00o;
        if (i < OooO0Oo2) {
            length = OooO0Oo2 - 1;
            if (i <= length) {
                while (!AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[length])) {
                    if (length != i) {
                        length--;
                    }
                }
                return length - this.OooO00o;
            }
            return -1;
        }
        if (i > OooO0Oo2) {
            int i2 = OooO0Oo2 - 1;
            while (true) {
                if (-1 < i2) {
                    if (AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[i2])) {
                        length = i2 + this.OooO0O0.length;
                        break;
                    }
                    i2--;
                } else {
                    Object[] objArr = this.OooO0O0;
                    AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
                    length = objArr.length - 1;
                    int i3 = this.OooO00o;
                    if (i3 <= length) {
                        while (!AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.OooO0OO;
        if (i >= 0 && i < i2) {
            if (i == size() - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            int OooO0Oo2 = OooO0Oo(this.OooO00o + i);
            Object[] objArr = this.OooO0O0;
            Object obj = objArr[OooO0Oo2];
            if (i < (this.OooO0OO >> 1)) {
                int i3 = this.OooO00o;
                if (OooO0Oo2 >= i3) {
                    o00OO.o00Oo0(objArr, objArr, i3 + 1, i3, OooO0Oo2);
                } else {
                    o00OO.o00Oo0(objArr, objArr, 1, 0, OooO0Oo2);
                    Object[] objArr2 = this.OooO0O0;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i4 = this.OooO00o;
                    o00OO.o00Oo0(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
                }
                Object[] objArr3 = this.OooO0O0;
                int i5 = this.OooO00o;
                objArr3[i5] = null;
                this.OooO00o = OooO0OO(i5);
            } else {
                int OooO0Oo3 = OooO0Oo((size() - 1) + this.OooO00o);
                Object[] objArr4 = this.OooO0O0;
                int i6 = OooO0Oo2 + 1;
                if (OooO0Oo2 <= OooO0Oo3) {
                    o00OO.o00Oo0(objArr4, objArr4, OooO0Oo2, i6, OooO0Oo3 + 1);
                } else {
                    o00OO.o00Oo0(objArr4, objArr4, OooO0Oo2, i6, objArr4.length);
                    Object[] objArr5 = this.OooO0O0;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    o00OO.o00Oo0(objArr5, objArr5, 0, 1, OooO0Oo3 + 1);
                }
                this.OooO0O0[OooO0Oo3] = null;
            }
            this.OooO0OO--;
            return obj;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int OooO0Oo2;
        AbstractC0809oO0OooOO.OooOOOo(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.OooO0O0.length != 0) {
            int OooO0Oo3 = OooO0Oo(this.OooO00o + this.OooO0OO);
            int i = this.OooO00o;
            if (i < OooO0Oo3) {
                OooO0Oo2 = i;
                while (i < OooO0Oo3) {
                    Object obj = this.OooO0O0[i];
                    if (!collection.contains(obj)) {
                        this.OooO0O0[OooO0Oo2] = obj;
                        OooO0Oo2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Object[] objArr = this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
                Arrays.fill(objArr, OooO0Oo2, OooO0Oo3, (Object) null);
            } else {
                int length = this.OooO0O0.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.OooO0O0;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.OooO0O0[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                OooO0Oo2 = OooO0Oo(i2);
                for (int i3 = 0; i3 < OooO0Oo3; i3++) {
                    Object[] objArr3 = this.OooO0O0;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.OooO0O0[OooO0Oo2] = obj3;
                        OooO0Oo2 = OooO0OO(OooO0Oo2);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int i4 = OooO0Oo2 - this.OooO00o;
                if (i4 < 0) {
                    i4 += this.OooO0O0.length;
                }
                this.OooO0OO = i4;
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.OooO0O0;
            int i = this.OooO00o;
            Object obj = objArr[i];
            objArr[i] = null;
            this.OooO00o = OooO0OO(i);
            this.OooO0OO--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            int OooO0Oo2 = OooO0Oo((size() - 1) + this.OooO00o);
            Object[] objArr = this.OooO0O0;
            Object obj = objArr[OooO0Oo2];
            objArr[OooO0Oo2] = null;
            this.OooO0OO--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int OooO0Oo2;
        AbstractC0809oO0OooOO.OooOOOo(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.OooO0O0.length != 0) {
            int OooO0Oo3 = OooO0Oo(this.OooO00o + this.OooO0OO);
            int i = this.OooO00o;
            if (i < OooO0Oo3) {
                OooO0Oo2 = i;
                while (i < OooO0Oo3) {
                    Object obj = this.OooO0O0[i];
                    if (collection.contains(obj)) {
                        this.OooO0O0[OooO0Oo2] = obj;
                        OooO0Oo2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Object[] objArr = this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
                Arrays.fill(objArr, OooO0Oo2, OooO0Oo3, (Object) null);
            } else {
                int length = this.OooO0O0.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.OooO0O0;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.OooO0O0[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                OooO0Oo2 = OooO0Oo(i2);
                for (int i3 = 0; i3 < OooO0Oo3; i3++) {
                    Object[] objArr3 = this.OooO0O0;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.OooO0O0[OooO0Oo2] = obj3;
                        OooO0Oo2 = OooO0OO(OooO0Oo2);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int i4 = OooO0Oo2 - this.OooO00o;
                if (i4 < 0) {
                    i4 += this.OooO0O0.length;
                }
                this.OooO0OO = i4;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.OooO0OO;
        if (i >= 0 && i < i2) {
            int OooO0Oo2 = OooO0Oo(this.OooO00o + i);
            Object[] objArr = this.OooO0O0;
            Object obj2 = objArr[OooO0Oo2];
            objArr[OooO0Oo2] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO0OO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.OooO0OO]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0809oO0OooOO.OooOOOo(objArr, "array");
        int length = objArr.length;
        int i = this.OooO0OO;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC0809oO0OooOO.OooOOO0(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int OooO0Oo2 = OooO0Oo(this.OooO00o + this.OooO0OO);
        int i2 = this.OooO00o;
        if (i2 < OooO0Oo2) {
            o00OO.o00Ooo(this.OooO0O0, objArr, 0, i2, OooO0Oo2, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.OooO0O0;
            o00OO.o00Oo0(objArr2, objArr, 0, this.OooO00o, objArr2.length);
            Object[] objArr3 = this.OooO0O0;
            o00OO.o00Oo0(objArr3, objArr, objArr3.length - this.OooO00o, 0, OooO0Oo2);
        }
        int i3 = this.OooO0OO;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0809oO0OooOO.OooOOOo(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        OooO0O0(collection.size() + this.OooO0OO);
        OooO00o(OooO0Oo(this.OooO00o + this.OooO0OO), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }
}


