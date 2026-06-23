package com.ninja.engine;

import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
/* renamed from: com.ninja.engine.o0oOoo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598o0oOoo00 implements InterfaceC1351oo00000O {
    public final InterfaceC1351oo00000O OooO0O0;
    public final boolean OooO0OO;

    public C0598o0oOoo00(InterfaceC1351oo00000O interfaceC1351oo00000O, boolean z) {
        this.OooO0O0 = interfaceC1351oo00000O;
        this.OooO0OO = z;
    }

    @Override // com.ninja.engine.InterfaceC1351oo00000O
    public final InterfaceC1108oOOoo OooO00o(C1932ooo0Oo0 c1932ooo0Oo0, InterfaceC1108oOOoo interfaceC1108oOOoo, int i, int i2) {
        InterfaceC0206o00o0OOO interfaceC0206o00o0OOO = com.bumptech.glide.OooO00o.OooO00o(c1932ooo0Oo0).OooO00o;
        Drawable drawable = (Drawable) interfaceC1108oOOoo.get();
        C0207o00o0OOo OooOOO0 = AbstractC0692o0ooooOo.OooOOO0(interfaceC0206o00o0OOO, drawable, i, i2);
        if (OooOOO0 == null) {
            if (!this.OooO0OO) {
                return interfaceC1108oOOoo;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        InterfaceC1108oOOoo OooO00o = this.OooO0O0.OooO00o(c1932ooo0Oo0, OooOOO0, i, i2);
        if (OooO00o.equals(OooOOO0)) {
            OooO00o.OooO0Oo();
            return interfaceC1108oOOoo;
        }
        return new C0207o00o0OOo(c1932ooo0Oo0.getResources(), OooO00o);
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        this.OooO0O0.OooO0O0(messageDigest);
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        if (obj instanceof C0598o0oOoo00) {
            return this.OooO0O0.equals(((C0598o0oOoo00) obj).OooO0O0);
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }
}


