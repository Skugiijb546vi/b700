package com.ninja.engine;
/* renamed from: com.ninja.engine.oo00ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443oo00ooo {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public final boolean OooO00o() {
        int i;
        int i2;
        int i3;
        int i4 = this.OooO00o;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.OooO0Oo;
            int i7 = this.OooO0O0;
            if (i6 > i7) {
                i3 = 1;
            } else if (i6 == i7) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.OooO0Oo;
            int i9 = this.OooO0OO;
            if (i8 > i9) {
                i2 = 1;
            } else if (i8 == i9) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.OooO0o0;
            int i11 = this.OooO0O0;
            if (i10 > i11) {
                i = 1;
            } else if (i10 == i11) {
                i = 2;
            } else {
                i = 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.OooO0o0;
            int i13 = this.OooO0OO;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
