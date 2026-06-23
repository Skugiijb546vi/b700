package com.ninja.engine;
/* loaded from: classes.dex */
public final class o0O000o0 {
    public long OooO00o = 0;
    public o0O000o0 OooO0O0;

    public final void OooO00o(int i) {
        if (i >= 64) {
            o0O000o0 o0o000o0 = this.OooO0O0;
            if (o0o000o0 != null) {
                o0o000o0.OooO00o(i - 64);
                return;
            }
            return;
        }
        this.OooO00o &= ~(1 << i);
    }

    public final int OooO0O0(int i) {
        long j;
        o0O000o0 o0o000o0 = this.OooO0O0;
        if (o0o000o0 == null) {
            if (i >= 64) {
                j = this.OooO00o;
                return Long.bitCount(j);
            }
        } else if (i >= 64) {
            return Long.bitCount(this.OooO00o) + o0o000o0.OooO0O0(i - 64);
        }
        j = this.OooO00o & ((1 << i) - 1);
        return Long.bitCount(j);
    }

    public final void OooO0OO() {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new o0O000o0();
        }
    }

    public final boolean OooO0Oo(int i) {
        if (i >= 64) {
            OooO0OO();
            return this.OooO0O0.OooO0Oo(i - 64);
        } else if ((this.OooO00o & (1 << i)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean OooO0o(int i) {
        boolean z;
        if (i >= 64) {
            OooO0OO();
            return this.OooO0O0.OooO0o(i - 64);
        }
        long j = 1 << i;
        long j2 = this.OooO00o;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.OooO00o = j3;
        long j4 = j - 1;
        this.OooO00o = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        o0O000o0 o0o000o0 = this.OooO0O0;
        if (o0o000o0 != null) {
            if (o0o000o0.OooO0Oo(0)) {
                OooO0oo(63);
            }
            this.OooO0O0.OooO0o(0);
        }
        return z;
    }

    public final void OooO0o0(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            OooO0OO();
            this.OooO0O0.OooO0o0(i - 64, z);
            return;
        }
        long j = this.OooO00o;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.OooO00o = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            OooO0oo(i);
        } else {
            OooO00o(i);
        }
        if (z2 || this.OooO0O0 != null) {
            OooO0OO();
            this.OooO0O0.OooO0o0(0, z2);
        }
    }

    public final void OooO0oO() {
        this.OooO00o = 0L;
        o0O000o0 o0o000o0 = this.OooO0O0;
        if (o0o000o0 != null) {
            o0o000o0.OooO0oO();
        }
    }

    public final void OooO0oo(int i) {
        if (i >= 64) {
            OooO0OO();
            this.OooO0O0.OooO0oo(i - 64);
            return;
        }
        this.OooO00o |= 1 << i;
    }

    public final String toString() {
        if (this.OooO0O0 == null) {
            return Long.toBinaryString(this.OooO00o);
        }
        return this.OooO0O0.toString() + "xx" + Long.toBinaryString(this.OooO00o);
    }
}


