package com.ninja.engine;

import java.security.MessageDigest;
/* renamed from: com.ninja.engine.o0OO0Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345o0OO0Ooo implements InterfaceC0745oO00oOo {
    public final InterfaceC0745oO00oOo OooO0O0;
    public final InterfaceC0745oO00oOo OooO0OO;

    public C0345o0OO0Ooo(InterfaceC0745oO00oOo interfaceC0745oO00oOo, InterfaceC0745oO00oOo interfaceC0745oO00oOo2) {
        this.OooO0O0 = interfaceC0745oO00oOo;
        this.OooO0OO = interfaceC0745oO00oOo2;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        this.OooO0O0.OooO0O0(messageDigest);
        this.OooO0OO.OooO0O0(messageDigest);
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0345o0OO0Ooo)) {
            return false;
        }
        C0345o0OO0Ooo c0345o0OO0Ooo = (C0345o0OO0Ooo) obj;
        if (!this.OooO0O0.equals(c0345o0OO0Ooo.OooO0O0) || !this.OooO0OO.equals(c0345o0OO0Ooo.OooO0OO)) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        return this.OooO0OO.hashCode() + (this.OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.OooO0O0 + ", signature=" + this.OooO0OO + '}';
    }
}
