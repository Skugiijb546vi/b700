package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
/* renamed from: com.ninja.engine.o00oooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280o00oooo extends AbstractC0209o00o0Oo0 {
    public static final byte[] OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0745oO00oOo.OooO00o);

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        messageDigest.update(OooO0O0);
    }

    @Override // com.ninja.engine.AbstractC0209o00o0Oo0
    public final Bitmap OooO0OO(InterfaceC0206o00o0OOO interfaceC0206o00o0OOO, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = AbstractC1354oo0000O0.OooO00o;
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Matrix matrix = new Matrix();
            float f = 0.0f;
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = i2 / bitmap.getHeight();
                f = (i - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i / bitmap.getWidth();
                height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap OooO0oo = interfaceC0206o00o0OOO.OooO0oo(i, i2, config);
            OooO0oo.setHasAlpha(bitmap.hasAlpha());
            AbstractC1354oo0000O0.OooO00o(bitmap, OooO0oo, matrix);
            return OooO0oo;
        }
        return bitmap;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        return obj instanceof C0280o00oooo;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        return -599754482;
    }
}


