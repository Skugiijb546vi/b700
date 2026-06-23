package com.ninja.engine;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.oo00ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1440oo00ooO extends MediaDataSource {
    public final /* synthetic */ ByteBuffer OooO00o;

    public C1440oo00ooO(ByteBuffer byteBuffer) {
        this.OooO00o = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.OooO00o.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.OooO00o.limit()) {
            return -1;
        }
        this.OooO00o.position((int) j);
        int min = Math.min(i2, this.OooO00o.remaining());
        this.OooO00o.get(bArr, i, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
