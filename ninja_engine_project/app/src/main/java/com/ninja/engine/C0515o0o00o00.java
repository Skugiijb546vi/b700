package com.ninja.engine;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.ninja.engine.o0o00o00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515o0o00o00 implements oO00Oo00 {
    @Override // com.ninja.engine.oO00Oo00
    public final ImageHeaderParser$ImageType OooO00o(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // com.ninja.engine.oO00Oo00
    public final int OooO0O0(ByteBuffer byteBuffer, C0836oO0o0oO0 c0836oO0o0oO0) {
        AtomicReference atomicReference = AbstractC0242o00oOoO0.OooO00o;
        return OooO0OO(new C0239o00oOo0O(byteBuffer), c0836oO0o0oO0);
    }

    @Override // com.ninja.engine.oO00Oo00
    public final int OooO0OO(InputStream inputStream, C0836oO0o0oO0 c0836oO0o0oO0) {
        C0512o0o00Ooo c0512o0o00Ooo = new C0512o0o00Ooo(inputStream);
        C0508o0o00OOo OooO0OO = c0512o0o00Ooo.OooO0OO("Orientation");
        int i = 1;
        if (OooO0OO != null) {
            try {
                i = OooO0OO.OooO0o0(c0512o0o00Ooo.OooO0o);
            } catch (NumberFormatException unused) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    @Override // com.ninja.engine.oO00Oo00
    public final ImageHeaderParser$ImageType OooO0Oo(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
