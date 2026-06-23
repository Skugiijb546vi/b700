package com.ninja.engine;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.o00oOo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239o00oOo0O extends InputStream {
    public final ByteBuffer OooO00o;
    public int OooO0O0 = -1;

    public C0239o00oOo0O(ByteBuffer byteBuffer) {
        this.OooO00o = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.OooO00o.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.OooO0O0 = this.OooO00o.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.OooO00o;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.OooO0O0;
        if (i != -1) {
            this.OooO00o.position(i);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.OooO00o;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.OooO00o;
        if (byteBuffer.hasRemaining()) {
            int min = Math.min(i2, byteBuffer.remaining());
            byteBuffer.get(bArr, i, min);
            return min;
        }
        return -1;
    }
}
