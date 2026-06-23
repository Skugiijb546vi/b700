package com.ninja.engine;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oOoOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245oOoOoo {
    public byte[] OooO;
    public int[] OooO00o;
    public final C0415o0Oo0O0O OooO0OO;
    public ByteBuffer OooO0Oo;
    public short[] OooO0o;
    public byte[] OooO0o0;
    public byte[] OooO0oO;
    public byte[] OooO0oo;
    public final int[] OooOO0;
    public int OooOO0O;
    public C0690o0oooo0o OooOO0o;
    public final boolean OooOOO;
    public Bitmap OooOOO0;
    public int OooOOOO;
    public final int OooOOOo;
    public final int OooOOo;
    public final int OooOOo0;
    public Boolean OooOOoo;
    public final int[] OooO0O0 = new int[256];
    public Bitmap.Config OooOo00 = Bitmap.Config.ARGB_8888;

    public C1245oOoOoo(C0415o0Oo0O0O c0415o0Oo0O0O, C0690o0oooo0o c0690o0oooo0o, ByteBuffer byteBuffer, int i) {
        byte[] bArr;
        int[] iArr;
        this.OooO0OO = c0415o0Oo0O0O;
        this.OooOO0o = new C0690o0oooo0o();
        synchronized (this) {
            try {
                if (i > 0) {
                    int highestOneBit = Integer.highestOneBit(i);
                    this.OooOOOO = 0;
                    this.OooOO0o = c0690o0oooo0o;
                    this.OooOO0O = -1;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    this.OooO0Oo = asReadOnlyBuffer;
                    asReadOnlyBuffer.position(0);
                    this.OooO0Oo.order(ByteOrder.LITTLE_ENDIAN);
                    this.OooOOO = false;
                    Iterator it = c0690o0oooo0o.OooO0o0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((C0683o0oooOo) it.next()).OooO0oO == 3) {
                            this.OooOOO = true;
                            break;
                        }
                    }
                    this.OooOOOo = highestOneBit;
                    int i2 = c0690o0oooo0o.OooO0o;
                    this.OooOOo = i2 / highestOneBit;
                    int i3 = c0690o0oooo0o.OooO0oO;
                    this.OooOOo0 = i3 / highestOneBit;
                    int i4 = i2 * i3;
                    C0836oO0o0oO0 c0836oO0o0oO0 = (C0836oO0o0oO0) this.OooO0OO.OooO0OO;
                    if (c0836oO0o0oO0 == null) {
                        bArr = new byte[i4];
                    } else {
                        bArr = (byte[]) c0836oO0o0oO0.OooO0Oo(i4, byte[].class);
                    }
                    this.OooO = bArr;
                    C0415o0Oo0O0O c0415o0Oo0O0O2 = this.OooO0OO;
                    int i5 = this.OooOOo * this.OooOOo0;
                    C0836oO0o0oO0 c0836oO0o0oO02 = (C0836oO0o0oO0) c0415o0Oo0O0O2.OooO0OO;
                    if (c0836oO0o0oO02 == null) {
                        iArr = new int[i5];
                    } else {
                        iArr = (int[]) c0836oO0o0oO02.OooO0Oo(i5, int[].class);
                    }
                    this.OooOO0 = iArr;
                } else {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap OooO00o() {
        Bitmap.Config config;
        Boolean bool = this.OooOOoo;
        if (bool != null && !bool.booleanValue()) {
            config = this.OooOo00;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap OooO0oO = ((InterfaceC0206o00o0OOO) this.OooO0OO.OooO0O0).OooO0oO(this.OooOOo, this.OooOOo0, config);
        OooO0oO.setHasAlpha(true);
        return OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x001f, B:19:0x0029, B:21:0x0030, B:23:0x003a, B:25:0x0045, B:24:0x003d, B:26:0x0047, B:28:0x0058, B:30:0x0064, B:34:0x006d, B:36:0x0071, B:39:0x007a, B:41:0x007e, B:43:0x0090, B:45:0x0094, B:46:0x0098, B:33:0x0069, B:49:0x009e, B:10:0x0011, B:12:0x0019, B:13:0x001d), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x001f, B:19:0x0029, B:21:0x0030, B:23:0x003a, B:25:0x0045, B:24:0x003d, B:26:0x0047, B:28:0x0058, B:30:0x0064, B:34:0x006d, B:36:0x0071, B:39:0x007a, B:41:0x007e, B:43:0x0090, B:45:0x0094, B:46:0x0098, B:33:0x0069, B:49:0x009e, B:10:0x0011, B:12:0x0019, B:13:0x001d), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x001f, B:19:0x0029, B:21:0x0030, B:23:0x003a, B:25:0x0045, B:24:0x003d, B:26:0x0047, B:28:0x0058, B:30:0x0064, B:34:0x006d, B:36:0x0071, B:39:0x007a, B:41:0x007e, B:43:0x0090, B:45:0x0094, B:46:0x0098, B:33:0x0069, B:49:0x009e, B:10:0x0011, B:12:0x0019, B:13:0x001d), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x001f, B:19:0x0029, B:21:0x0030, B:23:0x003a, B:25:0x0045, B:24:0x003d, B:26:0x0047, B:28:0x0058, B:30:0x0064, B:34:0x006d, B:36:0x0071, B:39:0x007a, B:41:0x007e, B:43:0x0090, B:45:0x0094, B:46:0x0098, B:33:0x0069, B:49:0x009e, B:10:0x0011, B:12:0x0019, B:13:0x001d), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x001f, B:19:0x0029, B:21:0x0030, B:23:0x003a, B:25:0x0045, B:24:0x003d, B:26:0x0047, B:28:0x0058, B:30:0x0064, B:34:0x006d, B:36:0x0071, B:39:0x007a, B:41:0x007e, B:43:0x0090, B:45:0x0094, B:46:0x0098, B:33:0x0069, B:49:0x009e, B:10:0x0011, B:12:0x0019, B:13:0x001d), top: B:54:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap OooO0O0() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ninja.engine.o0oooo0o r0 = r8.OooOO0o     // Catch: java.lang.Throwable -> Le
            int r0 = r0.OooO0OO     // Catch: java.lang.Throwable -> Le
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L11
            int r0 = r8.OooOO0O     // Catch: java.lang.Throwable -> Le
            if (r0 >= 0) goto L1f
            goto L11
        Le:
            r0 = move-exception
            goto La5
        L11:
            java.lang.String r0 = "oOoOoo"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L1d
            com.ninja.engine.o0oooo0o r0 = r8.OooOO0o     // Catch: java.lang.Throwable -> Le
            int r0 = r0.OooO0OO     // Catch: java.lang.Throwable -> Le
        L1d:
            r8.OooOOOO = r2     // Catch: java.lang.Throwable -> Le
        L1f:
            int r0 = r8.OooOOOO     // Catch: java.lang.Throwable -> Le
            r3 = 0
            if (r0 == r2) goto L9e
            r4 = 2
            if (r0 != r4) goto L29
            goto L9e
        L29:
            r0 = 0
            r8.OooOOOO = r0     // Catch: java.lang.Throwable -> Le
            byte[] r5 = r8.OooO0o0     // Catch: java.lang.Throwable -> Le
            if (r5 != 0) goto L47
            com.ninja.engine.o0Oo0O0O r5 = r8.OooO0OO     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.OooO0OO     // Catch: java.lang.Throwable -> Le
            com.ninja.engine.oO0o0oO0 r5 = (com.ninja.engine.C0836oO0o0oO0) r5     // Catch: java.lang.Throwable -> Le
            r6 = 255(0xff, float:3.57E-43)
            if (r5 != 0) goto L3d
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> Le
            goto L45
        L3d:
            java.lang.Class<byte[]> r7 = byte[].class
            java.lang.Object r5 = r5.OooO0Oo(r6, r7)     // Catch: java.lang.Throwable -> Le
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> Le
        L45:
            r8.OooO0o0 = r5     // Catch: java.lang.Throwable -> Le
        L47:
            com.ninja.engine.o0oooo0o r5 = r8.OooOO0o     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList r5 = r5.OooO0o0     // Catch: java.lang.Throwable -> Le
            int r6 = r8.OooOO0O     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = (Object) r5.get(r6)     // Catch: java.lang.Throwable -> Le
            com.ninja.engine.o0oooOo r5 = (com.ninja.engine.C0683o0oooOo) r5     // Catch: java.lang.Throwable -> Le
            int r6 = r8.OooOO0O     // Catch: java.lang.Throwable -> Le
            int r6 = r6 - r2
            if (r6 < 0) goto L63
            com.ninja.engine.o0oooo0o r7 = r8.OooOO0o     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList r7 = r7.OooO0o0     // Catch: java.lang.Throwable -> Le
            java.lang.Object r6 = (Object) r7.get(r6)     // Catch: java.lang.Throwable -> Le
            com.ninja.engine.o0oooOo r6 = (com.ninja.engine.C0683o0oooOo) r6     // Catch: java.lang.Throwable -> Le
            goto L64
        L63:
            r6 = r3
        L64:
            int[] r7 = r5.OooOO0O     // Catch: java.lang.Throwable -> Le
            if (r7 == 0) goto L69
            goto L6d
        L69:
            com.ninja.engine.o0oooo0o r7 = r8.OooOO0o     // Catch: java.lang.Throwable -> Le
            int[] r7 = r7.OooO00o     // Catch: java.lang.Throwable -> Le
        L6d:
            r8.OooO00o = r7     // Catch: java.lang.Throwable -> Le
            if (r7 != 0) goto L7a
            java.lang.String r0 = "oOoOoo"
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            r8.OooOOOO = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r3
        L7a:
            boolean r1 = r5.OooO0o     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L98
            int[] r1 = r8.OooO0O0     // Catch: java.lang.Throwable -> Le
            int r2 = r7.length     // Catch: java.lang.Throwable -> Le
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch: java.lang.Throwable -> Le
            int[] r1 = r8.OooO0O0     // Catch: java.lang.Throwable -> Le
            r8.OooO00o = r1     // Catch: java.lang.Throwable -> Le
            int r2 = r5.OooO0oo     // Catch: java.lang.Throwable -> Le
            r1[r2] = r0     // Catch: java.lang.Throwable -> Le
            int r0 = r5.OooO0oO     // Catch: java.lang.Throwable -> Le
            if (r0 != r4) goto L98
            int r0 = r8.OooOO0O     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L98
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le
            r8.OooOOoo = r0     // Catch: java.lang.Throwable -> Le
        L98:
            android.graphics.Bitmap r0 = r8.OooO0Oo(r5, r6)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r0
        L9e:
            java.lang.String r0 = "oOoOoo"
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r3
        La5:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1245oOoOoo.OooO0O0():android.graphics.Bitmap");
    }

    public final void OooO0OO(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.OooOo00 = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r3.OooOO0 == r34.OooO0oo) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap OooO0Oo(com.ninja.engine.C0683o0oooOo r34, com.ninja.engine.C0683o0oooOo r35) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1245oOoOoo.OooO0Oo(com.ninja.engine.o0oooOo, com.ninja.engine.o0oooOo):android.graphics.Bitmap");
    }
}



