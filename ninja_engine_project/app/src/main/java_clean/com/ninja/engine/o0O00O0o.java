package com.ninja.engine;

import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class o0O00O0o extends AbstractC0209o00o0Oo0 {
    public static final byte[] OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC0745oO00oOo.OooO00o);

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        messageDigest.update(OooO0O0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    @Override // com.ninja.engine.AbstractC0209o00o0Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap OooO0OO(com.ninja.engine.InterfaceC0206o00o0OOO r8, android.graphics.Bitmap r9, int r10, int r11) {
        /*
            r7 = this;
            android.graphics.Paint r0 = com.ninja.engine.AbstractC1354oo0000O0.OooO00o
            int r10 = java.lang.Math.min(r10, r11)
            float r11 = (float) r10
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r11 / r0
            int r2 = r9.getWidth()
            int r3 = r9.getHeight()
            float r2 = (float) r2
            float r4 = r11 / r2
            float r3 = (float) r3
            float r5 = r11 / r3
            float r4 = java.lang.Math.max(r4, r5)
            float r2 = r2 * r4
            float r4 = r4 * r3
            float r3 = r11 - r2
            float r3 = r3 / r0
            float r11 = r11 - r4
            float r11 = r11 / r0
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r2 + r3
            float r4 = r4 + r11
            r0.<init>(r3, r11, r2, r4)
            int r11 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r11 < r2) goto L46
            android.graphics.Bitmap$Config r3 = com.ninja.engine.AbstractC1008oOOOOoo0.OooO0OO()
            android.graphics.Bitmap$Config r4 = r9.getConfig()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L46
            android.graphics.Bitmap$Config r3 = com.ninja.engine.AbstractC1008oOOOOoo0.OooO0OO()
            goto L48
        L46:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L48:
            android.graphics.Bitmap$Config r4 = r9.getConfig()
            boolean r4 = r3.equals(r4)
            r5 = 0
            if (r4 == 0) goto L55
            r3 = r9
            goto L6a
        L55:
            int r4 = r9.getWidth()
            int r6 = r9.getHeight()
            android.graphics.Bitmap r3 = r8.OooO0oo(r4, r6, r3)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r3)
            r6 = 0
            r4.drawBitmap(r9, r6, r6, r5)
        L6a:
            if (r11 < r2) goto L7f
            android.graphics.Bitmap$Config r11 = com.ninja.engine.AbstractC1008oOOOOoo0.OooO0OO()
            android.graphics.Bitmap$Config r2 = r9.getConfig()
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L7f
            android.graphics.Bitmap$Config r11 = com.ninja.engine.AbstractC1008oOOOOoo0.OooO0OO()
            goto L81
        L7f:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
        L81:
            android.graphics.Bitmap r10 = r8.OooO0oo(r10, r10, r11)
            r11 = 1
            r10.setHasAlpha(r11)
            java.util.concurrent.locks.Lock r11 = com.ninja.engine.AbstractC1354oo0000O0.OooO0Oo
            r11.lock()
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Lad
            r2.<init>(r10)     // Catch: java.lang.Throwable -> Lad
            android.graphics.Paint r4 = com.ninja.engine.AbstractC1354oo0000O0.OooO0O0     // Catch: java.lang.Throwable -> Lad
            r2.drawCircle(r1, r1, r1, r4)     // Catch: java.lang.Throwable -> Lad
            android.graphics.Paint r1 = com.ninja.engine.AbstractC1354oo0000O0.OooO0OO     // Catch: java.lang.Throwable -> Lad
            r2.drawBitmap(r3, r5, r0, r1)     // Catch: java.lang.Throwable -> Lad
            r2.setBitmap(r5)     // Catch: java.lang.Throwable -> Lad
            r11.unlock()
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto Lac
            r8.OooO(r3)
        Lac:
            return r10
        Lad:
            r8 = move-exception
            r11.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0O00O0o.OooO0OO(com.ninja.engine.o00o0OOO, android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        return obj instanceof o0O00O0o;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        return 1101716364;
    }
}


