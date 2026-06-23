package com.ninja.engine;

import android.graphics.Bitmap;
/* renamed from: com.ninja.engine.o00o0Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0209o00o0Oo0 implements InterfaceC1351oo00000O {
    @Override // com.ninja.engine.InterfaceC1351oo00000O
    public final InterfaceC1108oOOoo OooO00o(C1932ooo0Oo0 c1932ooo0Oo0, InterfaceC1108oOOoo interfaceC1108oOOoo, int i, int i2) {
        if (AbstractC1401oo00OOO0.OooO(i, i2)) {
            InterfaceC0206o00o0OOO interfaceC0206o00o0OOO = com.bumptech.glide.OooO00o.OooO00o(c1932ooo0Oo0).OooO00o;
            Bitmap bitmap = (Bitmap) interfaceC1108oOOoo.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap OooO0OO = OooO0OO(interfaceC0206o00o0OOO, bitmap, i, i2);
            if (!bitmap.equals(OooO0OO)) {
                return C0207o00o0OOo.OooO0OO(OooO0OO, interfaceC0206o00o0OOO);
            }
            return interfaceC1108oOOoo;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap OooO0OO(InterfaceC0206o00o0OOO interfaceC0206o00o0OOO, Bitmap bitmap, int i, int i2);
}
