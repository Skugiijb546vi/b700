package com.ninja.engine;

import android.graphics.Bitmap;
/* renamed from: com.ninja.engine.ooOOO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784ooOOO0oo implements InterfaceC0994oOOOO00o {
    public final C0834oO0o0o0o OooO00o;
    public int OooO0O0;
    public Bitmap.Config OooO0OO;

    public C1784ooOOO0oo(C0834oO0o0o0o c0834oO0o0o0o) {
        this.OooO00o = c0834oO0o0o0o;
    }

    @Override // com.ninja.engine.InterfaceC0994oOOOO00o
    public final void OooO00o() {
        this.OooO00o.OooO00o(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1784ooOOO0oo)) {
            return false;
        }
        C1784ooOOO0oo c1784ooOOO0oo = (C1784ooOOO0oo) obj;
        if (this.OooO0O0 != c1784ooOOO0oo.OooO0O0 || !AbstractC1401oo00OOO0.OooO0O0(this.OooO0OO, c1784ooOOO0oo.OooO0OO)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = this.OooO0O0 * 31;
        Bitmap.Config config = this.OooO0OO;
        if (config != null) {
            i = config.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        return C1330oOooo0Oo.OooO0OO(this.OooO0O0, this.OooO0OO);
    }
}
