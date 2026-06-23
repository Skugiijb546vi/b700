package com.ninja.engine;

import java.io.InputStream;
/* renamed from: com.ninja.engine.o0o00OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511o0o00OoO extends C0507o0o00OOO {
    public C0511o0o00OoO(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.OooO00o.mark(Integer.MAX_VALUE);
    }

    public final void OooO0O0(long j) {
        int i = this.OooO0OO;
        if (i > j) {
            this.OooO0OO = 0;
            this.OooO00o.reset();
        } else {
            j -= i;
        }
        OooO00o((int) j);
    }

    public C0511o0o00OoO(byte[] bArr) {
        super(bArr);
        this.OooO00o.mark(Integer.MAX_VALUE);
    }
}


