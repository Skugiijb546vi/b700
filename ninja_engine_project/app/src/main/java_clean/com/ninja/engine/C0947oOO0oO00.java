package com.ninja.engine;

import java.security.MessageDigest;
/* renamed from: com.ninja.engine.oOO0oO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947oOO0oO00 implements InterfaceC0745oO00oOo {
    public final Object OooO0O0;

    public C0947oOO0oO00(Object obj) {
        AbstractC0694o0ooooo0.OooOO0O(obj, "Argument must not be null");
        this.OooO0O0 = obj;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        messageDigest.update(this.OooO0O0.toString().getBytes(InterfaceC0745oO00oOo.OooO00o));
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        if (obj instanceof C0947oOO0oO00) {
            return this.OooO0O0.equals(((C0947oOO0oO00) obj).OooO0O0);
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.OooO0O0 + '}';
    }
}


