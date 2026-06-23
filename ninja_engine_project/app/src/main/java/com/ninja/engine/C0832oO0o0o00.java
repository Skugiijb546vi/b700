package com.ninja.engine;

import java.util.Arrays;
/* renamed from: com.ninja.engine.oO0o0o00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832oO0o0o00 implements Cloneable {
    public /* synthetic */ boolean OooO00o;
    public /* synthetic */ long[] OooO0O0;
    public /* synthetic */ Object[] OooO0OO;
    public /* synthetic */ int OooO0Oo;

    public C0832oO0o0o00() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.OooO0O0 = new long[i4];
        this.OooO0OO = new Object[i4];
    }

    public final Object OooO(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.OooO0Oo)) {
            if (this.OooO00o) {
                long[] jArr = this.OooO0O0;
                Object[] objArr = this.OooO0OO;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != AbstractC0809oO0OooOO.OooO0oO) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.OooO00o = false;
                this.OooO0Oo = i3;
            }
            return this.OooO0OO[i];
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final void OooO00o(long j, Long l) {
        int i = this.OooO0Oo;
        if (i != 0 && j <= this.OooO0O0[i - 1]) {
            OooO0oO(j, l);
            return;
        }
        if (this.OooO00o) {
            long[] jArr = this.OooO0O0;
            if (i >= jArr.length) {
                Object[] objArr = this.OooO0OO;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != AbstractC0809oO0OooOO.OooO0oO) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.OooO00o = false;
                this.OooO0Oo = i2;
            }
        }
        int i4 = this.OooO0Oo;
        if (i4 >= this.OooO0O0.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] copyOf = Arrays.copyOf(this.OooO0O0, i8);
            AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(this, newSize)");
            this.OooO0O0 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.OooO0OO, i8);
            AbstractC0809oO0OooOO.OooOOOO(copyOf2, "copyOf(this, newSize)");
            this.OooO0OO = copyOf2;
        }
        this.OooO0O0[i4] = j;
        this.OooO0OO[i4] = l;
        this.OooO0Oo = i4 + 1;
    }

    public final void OooO0O0() {
        int i = this.OooO0Oo;
        Object[] objArr = this.OooO0OO;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.OooO0Oo = 0;
        this.OooO00o = false;
    }

    /* renamed from: OooO0OO */
    public final C0832oO0o0o00 clone() {
        Object clone = super.clone();
        AbstractC0809oO0OooOO.OooOOO0(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0832oO0o0o00 c0832oO0o0o00 = (C0832oO0o0o00) clone;
        c0832oO0o0o00.OooO0O0 = (long[]) this.OooO0O0.clone();
        c0832oO0o0o00.OooO0OO = (Object[]) this.OooO0OO.clone();
        return c0832oO0o0o00;
    }

    public final Object OooO0Oo(long j) {
        Object obj;
        int OooO0o0 = AbstractC0694o0ooooo0.OooO0o0(this.OooO0O0, this.OooO0Oo, j);
        if (OooO0o0 < 0 || (obj = this.OooO0OO[OooO0o0]) == AbstractC0809oO0OooOO.OooO0oO) {
            return null;
        }
        return obj;
    }

    public final long OooO0o(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.OooO0Oo)) {
            if (this.OooO00o) {
                long[] jArr = this.OooO0O0;
                Object[] objArr = this.OooO0OO;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != AbstractC0809oO0OooOO.OooO0oO) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.OooO00o = false;
                this.OooO0Oo = i3;
            }
            return this.OooO0O0[i];
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object OooO0o0(long j) {
        Object obj;
        int OooO0o0 = AbstractC0694o0ooooo0.OooO0o0(this.OooO0O0, this.OooO0Oo, j);
        if (OooO0o0 < 0 || (obj = this.OooO0OO[OooO0o0]) == AbstractC0809oO0OooOO.OooO0oO) {
            return -1L;
        }
        return obj;
    }

    public final void OooO0oO(long j, Object obj) {
        int OooO0o0 = AbstractC0694o0ooooo0.OooO0o0(this.OooO0O0, this.OooO0Oo, j);
        if (OooO0o0 >= 0) {
            this.OooO0OO[OooO0o0] = obj;
            return;
        }
        int i = ~OooO0o0;
        int i2 = this.OooO0Oo;
        Object obj2 = AbstractC0809oO0OooOO.OooO0oO;
        if (i < i2) {
            Object[] objArr = this.OooO0OO;
            if (objArr[i] == obj2) {
                this.OooO0O0[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.OooO00o) {
            long[] jArr = this.OooO0O0;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.OooO0OO;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.OooO00o = false;
                this.OooO0Oo = i3;
                i = ~AbstractC0694o0ooooo0.OooO0o0(this.OooO0O0, i3, j);
            }
        }
        int i5 = this.OooO0Oo;
        if (i5 >= this.OooO0O0.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] copyOf = Arrays.copyOf(this.OooO0O0, i9);
            AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(this, newSize)");
            this.OooO0O0 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.OooO0OO, i9);
            AbstractC0809oO0OooOO.OooOOOO(copyOf2, "copyOf(this, newSize)");
            this.OooO0OO = copyOf2;
        }
        int i10 = this.OooO0Oo - i;
        if (i10 != 0) {
            long[] jArr2 = this.OooO0O0;
            int i11 = i + 1;
            AbstractC0809oO0OooOO.OooOOOo(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.OooO0OO;
            o00OO.o00Oo0(objArr3, objArr3, i11, i, this.OooO0Oo);
        }
        this.OooO0O0[i] = j;
        this.OooO0OO[i] = obj;
        this.OooO0Oo++;
    }

    public final int OooO0oo() {
        if (this.OooO00o) {
            int i = this.OooO0Oo;
            long[] jArr = this.OooO0O0;
            Object[] objArr = this.OooO0OO;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC0809oO0OooOO.OooO0oO) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.OooO00o = false;
            this.OooO0Oo = i2;
        }
        return this.OooO0Oo;
    }

    public final String toString() {
        if (OooO0oo() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.OooO0Oo * 28);
        sb.append('{');
        int i = this.OooO0Oo;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(OooO0o(i2));
            sb.append('=');
            Object OooO = OooO(i2);
            if (OooO != sb) {
                sb.append(OooO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0809oO0OooOO.OooOOOO(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
