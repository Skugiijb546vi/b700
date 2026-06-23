package com.ninja.engine;
/* renamed from: com.ninja.engine.o00o0O0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203o00o0O0O implements InterfaceC1128oOOooOOo {
    public static final oOOO00o0 OooO0O0 = oOOO00o0.OooO00o(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final oOOO00o0 OooO0OO = new oOOO00o0("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, oOOO00o0.OooO0o0);
    public final C0836oO0o0oO0 OooO00o;

    public C0203o00o0O0O(C0836oO0o0oO0 c0836oO0o0oO0) {
        this.OooO00o = c0836oO0o0oO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    @Override // com.ninja.engine.InterfaceC0488o0Ooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0o0(java.lang.Object r7, java.io.File r8, com.ninja.engine.C0973oOOO00o r9) {
        /*
            r6 = this;
            com.ninja.engine.oOOoo r7 = (com.ninja.engine.InterfaceC1108oOOoo) r7
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r7 = (Object) r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            com.ninja.engine.oOOO00o0 r1 = com.ninja.engine.C0203o00o0O0O.OooO0OO
            java.lang.Object r2 = r9.OooO0OO(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r7.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r7.getWidth()
            r7.getHeight()
            int r3 = com.ninja.engine.oO0o0000.OooO00o
            android.os.SystemClock.elapsedRealtimeNanos()
            com.ninja.engine.oOOO00o0 r3 = com.ninja.engine.C0203o00o0O0O.OooO0O0
            java.lang.Object r3 = r9.OooO0OO(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.ninja.engine.oO0o0oO0 r8 = r6.OooO00o
            if (r8 == 0) goto L4d
            com.ninja.engine.o00oO0 r4 = new com.ninja.engine.o00oO0     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L4b
            r4.<init>(r5, r8)     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L4b
            goto L4e
        L47:
            r4 = r5
            goto L83
        L49:
            r4 = r5
            goto L5e
        L4b:
            r7 = move-exception
            goto L47
        L4d:
            r4 = r5
        L4e:
            r7.compress(r2, r3, r4)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r4.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r4.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            goto L5a
        L58:
            r7 = move-exception
            goto L89
        L5a:
            r8 = 1
            goto L68
        L5c:
            r7 = move-exception
            goto L83
        L5e:
            r8 = 3
            android.util.Log.isLoggable(r0, r8)     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L67
            r4.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L67
        L67:
            r8 = 0
        L68:
            r3 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L82
            java.util.Objects.toString(r2)
            com.ninja.engine.AbstractC1401oo00OOO0.OooO0OO(r7)
            android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Object r9 = r9.OooO0OO(r1)
            java.util.Objects.toString(r9)
            r7.hasAlpha()
        L82:
            return r8
        L83:
            if (r4 == 0) goto L8a
            r4.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L8a
            goto L8a
        L89:
            throw r7
        L8a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0203o00o0O0O.OooO0o0(java.lang.Object, java.io.File, com.ninja.engine.oOOO00o):boolean");
    }

    @Override // com.ninja.engine.InterfaceC1128oOOooOOo
    public final int OooOoO0(C0973oOOO00o c0973oOOO00o) {
        return 2;
    }
}



