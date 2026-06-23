package com.ninja.engine;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.ninja.engine.o0O0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320o0O0oO extends FilterInputStream {
    public final long OooO00o;
    public int OooO0O0;

    public C0320o0O0oO(InputStream inputStream, long j) {
        super(inputStream);
        this.OooO00o = j;
    }

    public final void OooO00o(int i) {
        if (i >= 0) {
            this.OooO0O0 += i;
            return;
        }
        long j = this.OooO00o;
        if (j - this.OooO0O0 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + this.OooO0O0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.OooO00o - this.OooO0O0, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        OooO00o(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        OooO00o(read);
        return read;
    }
}
