package com.ninja.engine;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* renamed from: com.ninja.engine.o0000ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078o0000ooO implements InterfaceC1125oOOooO0o {
    public final /* synthetic */ int OooO00o;
    public final C0415o0Oo0O0O OooO0O0;

    public /* synthetic */ C0078o0000ooO(C0415o0Oo0O0O c0415o0Oo0O0O, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0415o0Oo0O0O;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                ImageHeaderParser$ImageType OooOooO = AbstractC0692o0ooooOo.OooOooO((List) this.OooO0O0.OooO0O0, (ByteBuffer) obj);
                if (OooOooO != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || OooOooO != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
            default:
                C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO0O0;
                ImageHeaderParser$ImageType OooOoo = AbstractC0692o0ooooOo.OooOoo((List) c0415o0Oo0O0O.OooO0O0, (InputStream) obj, (C0836oO0o0oO0) c0415o0Oo0O0O.OooO0OO);
                if (OooOoo != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || OooOoo != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.OooO00o) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                this.OooO0O0.getClass();
                return C0415o0Oo0O0O.OooO0o(createSource, i, i2, c0973oOOO00o);
            default:
                createSource2 = ImageDecoder.createSource(AbstractC0242o00oOoO0.OooO0O0((InputStream) obj));
                this.OooO0O0.getClass();
                return C0415o0Oo0O0O.OooO0o(createSource2, i, i2, c0973oOOO00o);
        }
    }
}


