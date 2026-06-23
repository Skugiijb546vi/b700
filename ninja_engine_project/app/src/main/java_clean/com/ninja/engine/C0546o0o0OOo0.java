package com.ninja.engine;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* renamed from: com.ninja.engine.o0o0OOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546o0o0OOo0 extends AbstractC0209o00o0Oo0 {
    public static final byte[] OooO0O0 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC0745oO00oOo.OooO00o);

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        messageDigest.update(OooO0O0);
    }

    @Override // com.ninja.engine.AbstractC0209o00o0Oo0
    public final Bitmap OooO0OO(InterfaceC0206o00o0OOO interfaceC0206o00o0OOO, Bitmap bitmap, int i, int i2) {
        return AbstractC1354oo0000O0.OooO0O0(interfaceC0206o00o0OOO, bitmap, i, i2);
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        return obj instanceof C0546o0o0OOo0;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        return 1572326941;
    }
}


