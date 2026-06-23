package com.ninja.engine;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* renamed from: com.ninja.engine.oOoOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1218oOoOOoo {
    public int[] OooO00o;
    public Object[] OooO0O0;
    public int OooO0OO;

    public C1218oOoOOoo() {
        this(0);
    }

    public Object OooO(int i, Object obj) {
        if (i >= 0 && i < this.OooO0OO) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.OooO0O0;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final int OooO00o(Object obj) {
        int i = this.OooO0OO * 2;
        Object[] objArr = this.OooO0O0;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (AbstractC0809oO0OooOO.OooO0o0(obj, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void OooO0O0(int i) {
        int i2 = this.OooO0OO;
        int[] iArr = this.OooO00o;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(this, newSize)");
            this.OooO00o = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.OooO0O0, i * 2);
            AbstractC0809oO0OooOO.OooOOOO(copyOf2, "copyOf(this, newSize)");
            this.OooO0O0 = copyOf2;
        }
        if (this.OooO0OO == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final int OooO0OO(int i, Object obj) {
        int i2 = this.OooO0OO;
        if (i2 == 0) {
            return -1;
        }
        int OooO0Oo = AbstractC0694o0ooooo0.OooO0Oo(i2, i, this.OooO00o);
        if (OooO0Oo < 0) {
            return OooO0Oo;
        }
        if (AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[OooO0Oo << 1])) {
            return OooO0Oo;
        }
        int i3 = OooO0Oo + 1;
        while (i3 < i2 && this.OooO00o[i3] == i) {
            if (AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = OooO0Oo - 1; i4 >= 0 && this.OooO00o[i4] == i; i4--) {
            if (AbstractC0809oO0OooOO.OooO0o0(obj, this.OooO0O0[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int OooO0Oo(Object obj) {
        if (obj == null) {
            return OooO0o0();
        }
        return OooO0OO(obj.hashCode(), obj);
    }

    public final Object OooO0o(int i) {
        if (i >= 0 && i < this.OooO0OO) {
            return this.OooO0O0[i << 1];
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final int OooO0o0() {
        int i = this.OooO0OO;
        if (i == 0) {
            return -1;
        }
        int OooO0Oo = AbstractC0694o0ooooo0.OooO0Oo(i, 0, this.OooO00o);
        if (OooO0Oo < 0) {
            return OooO0Oo;
        }
        if (this.OooO0O0[OooO0Oo << 1] == null) {
            return OooO0Oo;
        }
        int i2 = OooO0Oo + 1;
        while (i2 < i && this.OooO00o[i2] == 0) {
            if (this.OooO0O0[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = OooO0Oo - 1; i3 >= 0 && this.OooO00o[i3] == 0; i3--) {
            if (this.OooO0O0[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void OooO0oO(C0145o00OO0oO c0145o00OO0oO) {
        AbstractC0809oO0OooOO.OooOOOo(c0145o00OO0oO, "map");
        int i = c0145o00OO0oO.OooO0OO;
        OooO0O0(this.OooO0OO + i);
        if (this.OooO0OO == 0) {
            if (i > 0) {
                o00OO.o00O0O(0, 0, i, c0145o00OO0oO.OooO00o, this.OooO00o);
                o00OO.o00Oo0(c0145o00OO0oO.OooO0O0, this.OooO0O0, 0, 0, i << 1);
                this.OooO0OO = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(c0145o00OO0oO.OooO0o(i2), c0145o00OO0oO.OooOO0(i2));
        }
    }

    public Object OooO0oo(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.OooO0OO)) {
            Object[] objArr = this.OooO0O0;
            int i3 = i << 1;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
            } else {
                int i4 = i2 - 1;
                int[] iArr = this.OooO00o;
                int i5 = 8;
                if (iArr.length > 8 && i2 < iArr.length / 3) {
                    if (i2 > 8) {
                        i5 = i2 + (i2 >> 1);
                    }
                    int[] copyOf = Arrays.copyOf(iArr, i5);
                    AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(this, newSize)");
                    this.OooO00o = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.OooO0O0, i5 << 1);
                    AbstractC0809oO0OooOO.OooOOOO(copyOf2, "copyOf(this, newSize)");
                    this.OooO0O0 = copyOf2;
                    if (i2 == this.OooO0OO) {
                        if (i > 0) {
                            o00OO.o00O0O(0, 0, i, iArr, this.OooO00o);
                            o00OO.o00Oo0(objArr, this.OooO0O0, 0, 0, i3);
                        }
                        if (i < i4) {
                            int i6 = i + 1;
                            o00OO.o00O0O(i, i6, i2, iArr, this.OooO00o);
                            o00OO.o00Oo0(objArr, this.OooO0O0, i3, i6 << 1, i2 << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    if (i < i4) {
                        int i7 = i + 1;
                        o00OO.o00O0O(i, i7, i2, iArr, iArr);
                        Object[] objArr2 = this.OooO0O0;
                        o00OO.o00Oo0(objArr2, objArr2, i3, i7 << 1, i2 << 1);
                    }
                    Object[] objArr3 = this.OooO0O0;
                    int i8 = i4 << 1;
                    objArr3[i8] = null;
                    objArr3[i8 + 1] = null;
                }
                if (i2 == this.OooO0OO) {
                    this.OooO0OO = i4;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return obj;
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object OooOO0(int i) {
        if (i >= 0 && i < this.OooO0OO) {
            return this.OooO0O0[(i << 1) + 1];
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public void clear() {
        if (this.OooO0OO > 0) {
            this.OooO00o = AbstractC0694o0ooooo0.OooO0O0;
            this.OooO0O0 = AbstractC0694o0ooooo0.OooO0OO;
            this.OooO0OO = 0;
        }
        if (this.OooO0OO <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (OooO0Oo(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (OooO00o(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1218oOoOOoo) {
                int i = this.OooO0OO;
                if (i != ((C1218oOoOOoo) obj).OooO0OO) {
                    return false;
                }
                C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object OooO0o = OooO0o(i2);
                    Object OooOO0 = OooOO0(i2);
                    Object obj2 = c1218oOoOOoo.get(OooO0o);
                    if (OooOO0 == null) {
                        if (obj2 != null || !c1218oOoOOoo.containsKey(OooO0o)) {
                            return false;
                        }
                    } else if (!AbstractC0809oO0OooOO.OooO0o0(OooOO0, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.OooO0OO != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.OooO0OO;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object OooO0o2 = OooO0o(i4);
                    Object OooOO02 = OooOO0(i4);
                    Object obj3 = ((Map) obj).get(OooO0o2);
                    if (OooOO02 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(OooO0o2)) {
                            return false;
                        }
                    } else if (!AbstractC0809oO0OooOO.OooO0o0(OooOO02, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int OooO0Oo = OooO0Oo(obj);
        if (OooO0Oo >= 0) {
            return this.OooO0O0[(OooO0Oo << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int OooO0Oo = OooO0Oo(obj);
        if (OooO0Oo >= 0) {
            return this.OooO0O0[(OooO0Oo << 1) + 1];
        }
        return obj2;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.OooO00o;
        Object[] objArr = this.OooO0O0;
        int i2 = this.OooO0OO;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final boolean isEmpty() {
        if (this.OooO0OO <= 0) {
            return true;
        }
        return false;
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int OooO0o0;
        int i2 = this.OooO0OO;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            OooO0o0 = OooO0OO(i, obj);
        } else {
            OooO0o0 = OooO0o0();
        }
        if (OooO0o0 >= 0) {
            int i3 = (OooO0o0 << 1) + 1;
            Object[] objArr = this.OooO0O0;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~OooO0o0;
        int[] iArr = this.OooO00o;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(this, newSize)");
            this.OooO00o = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.OooO0O0, i5 << 1);
            AbstractC0809oO0OooOO.OooOOOO(copyOf2, "copyOf(this, newSize)");
            this.OooO0O0 = copyOf2;
            if (i2 != this.OooO0OO) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.OooO00o;
            int i6 = i4 + 1;
            o00OO.o00O0O(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.OooO0O0;
            o00OO.o00Oo0(objArr2, objArr2, i6 << 1, i4 << 1, this.OooO0OO << 1);
        }
        int i7 = this.OooO0OO;
        if (i2 == i7) {
            int[] iArr3 = this.OooO00o;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.OooO0O0;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.OooO0OO = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int OooO0Oo = OooO0Oo(obj);
        if (OooO0Oo >= 0) {
            return OooO0oo(OooO0Oo);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int OooO0Oo = OooO0Oo(obj);
        if (OooO0Oo >= 0) {
            return OooO(OooO0Oo, obj2);
        }
        return null;
    }

    public final int size() {
        return this.OooO0OO;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.OooO0OO * 28);
        sb.append('{');
        int i = this.OooO0OO;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object OooO0o = OooO0o(i2);
            if (OooO0o != sb) {
                sb.append(OooO0o);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object OooOO0 = OooOO0(i2);
            if (OooOO0 != sb) {
                sb.append(OooOO0);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0809oO0OooOO.OooOOOO(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C1218oOoOOoo(int i) {
        this.OooO00o = i == 0 ? AbstractC0694o0ooooo0.OooO0O0 : new int[i];
        this.OooO0O0 = i == 0 ? AbstractC0694o0ooooo0.OooO0OO : new Object[i << 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int OooO0Oo = OooO0Oo(obj);
        if (OooO0Oo < 0 || !AbstractC0809oO0OooOO.OooO0o0(obj2, OooOO0(OooO0Oo))) {
            return false;
        }
        OooO0oo(OooO0Oo);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int OooO0Oo = OooO0Oo(obj);
        if (OooO0Oo < 0 || !AbstractC0809oO0OooOO.OooO0o0(obj2, OooOO0(OooO0Oo))) {
            return false;
        }
        OooO(OooO0Oo, obj3);
        return true;
    }
}
