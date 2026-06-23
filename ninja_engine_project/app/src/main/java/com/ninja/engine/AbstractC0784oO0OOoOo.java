package com.ninja.engine;

import java.util.Iterator;
/* renamed from: com.ninja.engine.oO0OOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0784oO0OOoOo implements Iterable {
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;

    public AbstractC0784oO0OOoOo(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.OooO00o = i;
                if (i3 > 0) {
                    if (i < i2) {
                        int i4 = i2 % i3;
                        int i5 = i % i3;
                        int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                        i2 -= i6 < 0 ? i6 + i3 : i6;
                    }
                } else if (i3 < 0) {
                    if (i > i2) {
                        int i7 = -i3;
                        int i8 = i % i7;
                        int i9 = i2 % i7;
                        int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                        i2 += i10 < 0 ? i10 + i7 : i10;
                    }
                } else {
                    throw new IllegalArgumentException("Step is zero.");
                }
                this.OooO0O0 = i2;
                this.OooO0OO = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new oO00o000(this.OooO00o, this.OooO0O0, this.OooO0OO);
    }
}
