package com.ninja.engine;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* renamed from: com.ninja.engine.o0oooOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684o0oooOo0 implements InterfaceC1351oo00000O {
    public final InterfaceC1351oo00000O OooO0O0;

    public C0684o0oooOo0(InterfaceC1351oo00000O interfaceC1351oo00000O) {
        AbstractC0694o0ooooo0.OooOO0O(interfaceC1351oo00000O, "Argument must not be null");
        this.OooO0O0 = interfaceC1351oo00000O;
    }

    @Override // com.ninja.engine.InterfaceC1351oo00000O
    public final InterfaceC1108oOOoo OooO00o(C1932ooo0Oo0 c1932ooo0Oo0, InterfaceC1108oOOoo interfaceC1108oOOoo, int i, int i2) {
        C0680o0oooOO c0680o0oooOO = (C0680o0oooOO) interfaceC1108oOOoo.get();
        InterfaceC1108oOOoo c0207o00o0OOo = new C0207o00o0OOo(((C0689o0oooo0O) c0680o0oooOO.OooO00o.OooO0O0).OooOO0o, com.bumptech.glide.OooO00o.OooO00o(c1932ooo0Oo0).OooO00o);
        InterfaceC1351oo00000O interfaceC1351oo00000O = this.OooO0O0;
        InterfaceC1108oOOoo OooO00o = interfaceC1351oo00000O.OooO00o(c1932ooo0Oo0, c0207o00o0OOo, i, i2);
        if (!c0207o00o0OOo.equals(OooO00o)) {
            c0207o00o0OOo.OooO0Oo();
        }
        ((C0689o0oooo0O) c0680o0oooOO.OooO00o.OooO0O0).OooO0OO(interfaceC1351oo00000O, (Bitmap) OooO00o.get());
        return interfaceC1108oOOoo;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        this.OooO0O0.OooO0O0(messageDigest);
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        if (obj instanceof C0684o0oooOo0) {
            return this.OooO0O0.equals(((C0684o0oooOo0) obj).OooO0O0);
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }
}
