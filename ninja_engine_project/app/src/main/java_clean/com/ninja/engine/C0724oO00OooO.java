package com.ninja.engine;

import android.graphics.Insets;
/* renamed from: com.ninja.engine.oO00OooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724oO00OooO {
    public static final C0724oO00OooO OooO0o0 = new C0724oO00OooO(0, 0, 0, 0);
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    public C0724oO00OooO(int i, int i2, int i3, int i4) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.OooO0Oo = i4;
    }

    public static C0724oO00OooO OooO00o(C0724oO00OooO c0724oO00OooO, C0724oO00OooO c0724oO00OooO2) {
        return OooO0O0(Math.max(c0724oO00OooO.OooO00o, c0724oO00OooO2.OooO00o), Math.max(c0724oO00OooO.OooO0O0, c0724oO00OooO2.OooO0O0), Math.max(c0724oO00OooO.OooO0OO, c0724oO00OooO2.OooO0OO), Math.max(c0724oO00OooO.OooO0Oo, c0724oO00OooO2.OooO0Oo));
    }

    public static C0724oO00OooO OooO0O0(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return OooO0o0;
        }
        return new C0724oO00OooO(i, i2, i3, i4);
    }

    public static C0724oO00OooO OooO0OO(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return OooO0O0(i, i2, i3, i4);
    }

    public final Insets OooO0Oo() {
        return AbstractC0139o00O0oo.OooO0OO(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0724oO00OooO.class != obj.getClass()) {
            return false;
        }
        C0724oO00OooO c0724oO00OooO = (C0724oO00OooO) obj;
        if (this.OooO0Oo == c0724oO00OooO.OooO0Oo && this.OooO00o == c0724oO00OooO.OooO00o && this.OooO0OO == c0724oO00OooO.OooO0OO && this.OooO0O0 == c0724oO00OooO.OooO0O0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.OooO00o * 31) + this.OooO0O0) * 31) + this.OooO0OO) * 31) + this.OooO0Oo;
    }

    public final String toString() {
        return "Insets{left=" + this.OooO00o + ", top=" + this.OooO0O0 + ", right=" + this.OooO0OO + ", bottom=" + this.OooO0Oo + '}';
    }
}


