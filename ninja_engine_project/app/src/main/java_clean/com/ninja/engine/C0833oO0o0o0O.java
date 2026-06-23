package com.ninja.engine;
/* renamed from: com.ninja.engine.oO0o0o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833oO0o0o0O implements InterfaceC0994oOOOO00o {
    public final C0834oO0o0o0o OooO00o;
    public int OooO0O0;
    public Class OooO0OO;

    public C0833oO0o0o0O(C0834oO0o0o0o c0834oO0o0o0o) {
        this.OooO00o = c0834oO0o0o0o;
    }

    @Override // com.ninja.engine.InterfaceC0994oOOOO00o
    public final void OooO00o() {
        this.OooO00o.OooO00o(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0833oO0o0o0O)) {
            return false;
        }
        C0833oO0o0o0O c0833oO0o0o0O = (C0833oO0o0o0O) obj;
        if (this.OooO0O0 != c0833oO0o0o0O.OooO0O0 || this.OooO0OO != c0833oO0o0o0O.OooO0OO) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = this.OooO0O0 * 31;
        Class cls = this.OooO0OO;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        return "Key{size=" + this.OooO0O0 + "array=" + this.OooO0OO + '}';
    }
}


