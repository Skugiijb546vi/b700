package com.ninja.engine;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
/* renamed from: com.ninja.engine.o0o00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501o0o00O extends InputStream {
    public static final ArrayDeque OooO0OO;
    public InputStream OooO00o;
    public IOException OooO0O0;

    static {
        char[] cArr = AbstractC1401oo00OOO0.OooO00o;
        OooO0OO = new ArrayDeque(0);
    }

    public final void OooO00o() {
        this.OooO0O0 = null;
        this.OooO00o = null;
        ArrayDeque arrayDeque = OooO0OO;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.OooO00o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.OooO00o.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.OooO00o.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.OooO00o.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.OooO00o.read();
        } catch (IOException e) {
            this.OooO0O0 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.OooO00o.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.OooO00o.skip(j);
        } catch (IOException e) {
            this.OooO0O0 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.OooO00o.read(bArr);
        } catch (IOException e) {
            this.OooO0O0 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.OooO00o.read(bArr, i, i2);
        } catch (IOException e) {
            this.OooO0O0 = e;
            throw e;
        }
    }
}
