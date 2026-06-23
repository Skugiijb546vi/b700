package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
/* renamed from: com.ninja.engine.o0oOo000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577o0oOo000 {
    public static final oOOO00o0 OooO;
    public static final oOOO00o0 OooO0o = oOOO00o0.OooO00o(o0OOO0.OooO0OO, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final oOOO00o0 OooO0oO = new oOOO00o0("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, oOOO00o0.OooO0o0);
    public static final oOOO00o0 OooO0oo;
    public static final Set OooOO0;
    public static final C0601o0oOooO0 OooOO0O;
    public static final ArrayDeque OooOO0o;
    public final InterfaceC0206o00o0OOO OooO00o;
    public final DisplayMetrics OooO0O0;
    public final C0836oO0o0oO0 OooO0OO;
    public final List OooO0Oo;
    public final C0771oO0OO0oo OooO0o0 = C0771oO0OO0oo.OooO00o();

    static {
        C0416o0Oo0OO c0416o0Oo0OO = C0416o0Oo0OO.OooO0O0;
        Boolean bool = Boolean.FALSE;
        OooO0oo = oOOO00o0.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        OooO = oOOO00o0.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        OooOO0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        OooOO0O = new C0601o0oOooO0(0);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC1401oo00OOO0.OooO00o;
        OooOO0o = new ArrayDeque(0);
    }

    public C0577o0oOo000(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0206o00o0OOO interfaceC0206o00o0OOO, C0836oO0o0oO0 c0836oO0o0oO0) {
        this.OooO0Oo = arrayList;
        AbstractC0694o0ooooo0.OooOO0O(displayMetrics, "Argument must not be null");
        this.OooO0O0 = displayMetrics;
        AbstractC0694o0ooooo0.OooOO0O(interfaceC0206o00o0OOO, "Argument must not be null");
        this.OooO00o = interfaceC0206o00o0OOO;
        AbstractC0694o0ooooo0.OooOO0O(c0836oO0o0oO0, "Argument must not be null");
        this.OooO0OO = c0836oO0o0oO0;
    }

    public static Bitmap OooO0OO(C0131o00O0o c0131o00O0o, BitmapFactory.Options options, InterfaceC0659o0ooOOOO interfaceC0659o0ooOOOO, InterfaceC0206o00o0OOO interfaceC0206o00o0OOO) {
        if (!options.inJustDecodeBounds) {
            interfaceC0659o0ooOOOO.OooO0OO();
            c0131o00O0o.Oooo0oo();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC1354oo0000O0.OooO0Oo;
        lock.lock();
        try {
            try {
                Bitmap OooOO0o2 = c0131o00O0o.OooOO0o(options);
                lock.unlock();
                return OooOO0o2;
            } catch (IllegalArgumentException e) {
                IOException OooO0o0 = OooO0o0(e, i, i2, str, options);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        interfaceC0206o00o0OOO.OooO(bitmap);
                        options.inBitmap = null;
                        Bitmap OooO0OO = OooO0OO(c0131o00O0o, options, interfaceC0659o0ooOOOO, interfaceC0206o00o0OOO);
                        AbstractC1354oo0000O0.OooO0Oo.unlock();
                        return OooO0OO;
                    } catch (IOException unused) {
                        throw OooO0o0;
                    }
                }
                throw OooO0o0;
            }
        } catch (Throwable th) {
            AbstractC1354oo0000O0.OooO0Oo.unlock();
            throw th;
        }
    }

    public static String OooO0Oo(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void OooO0o(BitmapFactory.Options options) {
        OooO0oO(options);
        ArrayDeque arrayDeque = OooOO0o;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static IOException OooO0o0(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + OooO0Oo(options.inBitmap), illegalArgumentException);
    }

    public static void OooO0oO(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C0207o00o0OOo OooO00o(C0131o00O0o c0131o00O0o, int i, int i2, C0973oOOO00o c0973oOOO00o, InterfaceC0659o0ooOOOO interfaceC0659o0ooOOOO) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z;
        byte[] bArr = (byte[]) this.OooO0OO.OooO0Oo(65536, byte[].class);
        synchronized (C0577o0oOo000.class) {
            ArrayDeque arrayDeque = OooOO0o;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                OooO0oO(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        o0OOO0 o0ooo0 = (o0OOO0) c0973oOOO00o.OooO0OO(OooO0o);
        EnumC0999oOOOO0oO enumC0999oOOOO0oO = (EnumC0999oOOOO0oO) c0973oOOO00o.OooO0OO(OooO0oO);
        C0416o0Oo0OO c0416o0Oo0OO = (C0416o0Oo0OO) c0973oOOO00o.OooO0OO(C0416o0Oo0OO.OooO0oO);
        boolean booleanValue = ((Boolean) c0973oOOO00o.OooO0OO(OooO0oo)).booleanValue();
        oOOO00o0 oooo00o0 = OooO;
        if (c0973oOOO00o.OooO0OO(oooo00o0) != null && ((Boolean) c0973oOOO00o.OooO0OO(oooo00o0)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            return C0207o00o0OOo.OooO0OO(OooO0O0(c0131o00O0o, options2, c0416o0Oo0OO, o0ooo0, enumC0999oOOOO0oO, z, i, i2, booleanValue, interfaceC0659o0ooOOOO), this.OooO00o);
        } finally {
            OooO0o(options2);
            this.OooO0OO.OooO0oo(bArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x031d, code lost:
        if (r11 >= 26) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap OooO0O0(com.ninja.engine.C0131o00O0o r25, android.graphics.BitmapFactory.Options r26, com.ninja.engine.C0416o0Oo0OO r27, com.ninja.engine.o0OOO0 r28, com.ninja.engine.EnumC0999oOOOO0oO r29, boolean r30, int r31, int r32, boolean r33, com.ninja.engine.InterfaceC0659o0ooOOOO r34) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0577o0oOo000.OooO0O0(com.ninja.engine.o00O0o, android.graphics.BitmapFactory$Options, com.ninja.engine.o0Oo0OO, com.ninja.engine.o0OOO0, com.ninja.engine.oOOOO0oO, boolean, int, int, boolean, com.ninja.engine.o0ooOOOO):android.graphics.Bitmap");
    }
}
