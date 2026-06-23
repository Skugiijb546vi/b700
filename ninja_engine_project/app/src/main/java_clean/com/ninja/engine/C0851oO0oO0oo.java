package com.ninja.engine;

import java.io.FilterInputStream;
/* renamed from: com.ninja.engine.oO0oO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851oO0oO0oo extends FilterInputStream {
    public int OooO00o;

    public C0851oO0oO0oo(C0501o0o00O c0501o0o00O) {
        super(c0501o0o00O);
        this.OooO00o = Integer.MIN_VALUE;
    }

    public final long OooO00o(long j) {
        int i = this.OooO00o;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE && j > i) {
            return i;
        }
        return j;
    }

    public final void OooO0O0(long j) {
        int i = this.OooO00o;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.OooO00o = (int) (i - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.OooO00o;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.OooO00o = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (OooO00o(1L) == -1) {
            return -1;
        }
        int read = super.read();
        OooO0O0(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.OooO00o = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long OooO00o = OooO00o(j);
        if (OooO00o == -1) {
            return 0L;
        }
        long skip = super.skip(OooO00o);
        OooO0O0(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int OooO00o = (int) OooO00o(i2);
        if (OooO00o == -1) {
            return -1;
        }
        int read = super.read(bArr, i, OooO00o);
        OooO0O0(read);
        return read;
    }
}


