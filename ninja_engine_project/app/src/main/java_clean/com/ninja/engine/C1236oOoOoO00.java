package com.ninja.engine;

import java.util.Arrays;
/* renamed from: com.ninja.engine.oOoOoO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1236oOoOoO00 implements Cloneable {
    public /* synthetic */ int[] OooO00o;
    public /* synthetic */ Object[] OooO0O0;
    public /* synthetic */ int OooO0OO;

    public C1236oOoOoO00() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.OooO00o = new int[i4];
        this.OooO0O0 = new Object[i4];
    }

    public final void OooO00o(int i, Object obj) {
        int i2 = this.OooO0OO;
        if (i2 != 0 && i <= this.OooO00o[i2 - 1]) {
            OooO0Oo(i, obj);
            return;
        }
        if (i2 >= this.OooO00o.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] copyOf = Arrays.copyOf(this.OooO00o, i6);
            AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(this, newSize)");
            this.OooO00o = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.OooO0O0, i6);
            AbstractC0809oO0OooOO.OooOOOO(copyOf2, "copyOf(this, newSize)");
            this.OooO0O0 = copyOf2;
        }
        this.OooO00o[i2] = i;
        this.OooO0O0[i2] = obj;
        this.OooO0OO = i2 + 1;
    }

    /* renamed from: OooO0O0 */
    public final C1236oOoOoO00 clone() {
        Object clone = super.clone();
        AbstractC0809oO0OooOO.OooOOO0(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C1236oOoOoO00 c1236oOoOoO00 = (C1236oOoOoO00) clone;
        c1236oOoOoO00.OooO00o = (int[]) this.OooO00o.clone();
        c1236oOoOoO00.OooO0O0 = (Object[]) this.OooO0O0.clone();
        return c1236oOoOoO00;
    }

    public final Object OooO0OO(int i) {
        Object obj;
        int OooO0Oo = AbstractC0694o0ooooo0.OooO0Oo(this.OooO0OO, i, this.OooO00o);
        if (OooO0Oo < 0 || (obj = this.OooO0O0[OooO0Oo]) == AbstractC0809oO0OooOO.OooOO0o) {
            return null;
        }
        return obj;
    }

    public final void OooO0Oo(int i, Object obj) {
        int OooO0Oo = AbstractC0694o0ooooo0.OooO0Oo(this.OooO0OO, i, this.OooO00o);
        if (OooO0Oo >= 0) {
            this.OooO0O0[OooO0Oo] = obj;
            return;
        }
        int i2 = ~OooO0Oo;
        int i3 = this.OooO0OO;
        if (i2 < i3) {
            Object[] objArr = this.OooO0O0;
            if (objArr[i2] == AbstractC0809oO0OooOO.OooOO0o) {
                this.OooO00o[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.OooO00o.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] copyOf = Arrays.copyOf(this.OooO00o, i7);
            AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(this, newSize)");
            this.OooO00o = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.OooO0O0, i7);
            AbstractC0809oO0OooOO.OooOOOO(copyOf2, "copyOf(this, newSize)");
            this.OooO0O0 = copyOf2;
        }
        int i8 = this.OooO0OO;
        if (i8 - i2 != 0) {
            int[] iArr = this.OooO00o;
            int i9 = i2 + 1;
            o00OO.o00O0O(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.OooO0O0;
            o00OO.o00Oo0(objArr2, objArr2, i9, i2, this.OooO0OO);
        }
        this.OooO00o[i2] = i;
        this.OooO0O0[i2] = obj;
        this.OooO0OO++;
    }

    public final String toString() {
        int i = this.OooO0OO;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.OooO0OO;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.OooO00o[i3]);
            sb.append('=');
            Object obj = this.OooO0O0[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0809oO0OooOO.OooOOOO(sb2, "buffer.toString()");
        return sb2;
    }
}


