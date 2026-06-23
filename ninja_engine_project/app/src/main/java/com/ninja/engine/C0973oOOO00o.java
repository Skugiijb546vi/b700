package com.ninja.engine;

import java.security.MessageDigest;
/* renamed from: com.ninja.engine.oOOO00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973oOOO00o implements InterfaceC0745oO00oOo {
    public final C0257o00oo0o OooO0O0 = new C1218oOoOOoo(0);

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0257o00oo0o c0257o00oo0o = this.OooO0O0;
            if (i < c0257o00oo0o.OooO0OO) {
                oOOO00o0 oooo00o0 = (oOOO00o0) c0257o00oo0o.OooO0o(i);
                Object OooOO0 = this.OooO0O0.OooOO0(i);
                oOOO00Oo oooo00oo = oooo00o0.OooO0O0;
                if (oooo00o0.OooO0Oo == null) {
                    oooo00o0.OooO0Oo = oooo00o0.OooO0OO.getBytes(InterfaceC0745oO00oOo.OooO00o);
                }
                oooo00oo.OooO00o(oooo00o0.OooO0Oo, OooOO0, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final Object OooO0OO(oOOO00o0 oooo00o0) {
        C0257o00oo0o c0257o00oo0o = this.OooO0O0;
        if (c0257o00oo0o.containsKey(oooo00o0)) {
            return c0257o00oo0o.get(oooo00o0);
        }
        return oooo00o0.OooO00o;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        if (obj instanceof C0973oOOO00o) {
            return this.OooO0O0.equals(((C0973oOOO00o) obj).OooO0O0);
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.OooO0O0 + '}';
    }
}
