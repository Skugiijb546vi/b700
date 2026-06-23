package com.ninja.engine;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.ninja.engine.oo00ooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442oo00ooOo implements InterfaceC1125oOOooO0o {
    public final C0919oOO00oOo OooO00o;
    public final InterfaceC0206o00o0OOO OooO0O0;
    public final C0919oOO00oOo OooO0OO = OooO0o;
    public static final oOOO00o0 OooO0Oo = new oOOO00o0("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C0247o00oOooO());
    public static final oOOO00o0 OooO0o0 = new oOOO00o0("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new o0OOOO());
    public static final C0919oOO00oOo OooO0o = new C0919oOO00oOo(24);
    public static final List OooO0oO = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    public C1442oo00ooOo(InterfaceC0206o00o0OOO interfaceC0206o00o0OOO, C0919oOO00oOo c0919oOO00oOo) {
        this.OooO0O0 = interfaceC0206o00o0OOO;
        this.OooO00o = c0919oOO00oOo;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        long longValue = ((Long) c0973oOOO00o.OooO0OO(OooO0Oo)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) c0973oOOO00o.OooO0OO(OooO0o0);
        if (num == null) {
            num = 2;
        }
        C0416o0Oo0OO c0416o0Oo0OO = (C0416o0Oo0OO) c0973oOOO00o.OooO0OO(C0416o0Oo0OO.OooO0oO);
        if (c0416o0Oo0OO == null) {
            c0416o0Oo0OO = C0416o0Oo0OO.OooO0o;
        }
        C0416o0Oo0OO c0416o0Oo0OO2 = c0416o0Oo0OO;
        this.OooO0OO.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.OooO00o.OooO0oo(mediaMetadataRetriever, obj);
            return C0207o00o0OOo.OooO0OO(OooO0OO(obj, mediaMetadataRetriever, longValue, num.intValue(), i, i2, c0416o0Oo0OO2), this.OooO0O0);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:9|10|11|12|(2:14|(1:16)(3:17|18|19))|22|23|24|(5:31|32|33|(1:39)|37)|(1:42)|43|(3:70|(0)|(1:59)(2:60|61))(4:47|(3:50|(1:52)|48)|69|(0)(0))|53|54|55|(3:63|64|(1:66))|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0167, code lost:
        android.util.Log.isLoggable("VideoDecoder", 3);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap OooO0OO(java.lang.Object r15, android.media.MediaMetadataRetriever r16, long r17, int r19, int r20, int r21, com.ninja.engine.C0416o0Oo0OO r22) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1442oo00ooOo.OooO0OO(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, com.ninja.engine.o0Oo0OO):android.graphics.Bitmap");
    }
}
