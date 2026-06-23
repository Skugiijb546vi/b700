package com.ninja.engine;

import java.io.FileOutputStream;
import java.io.OutputStream;
/* renamed from: com.ninja.engine.o00oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223o00oO0 extends OutputStream {
    public final OutputStream OooO00o;
    public byte[] OooO0O0;
    public final C0836oO0o0oO0 OooO0OO;
    public int OooO0Oo;

    public C0223o00oO0(FileOutputStream fileOutputStream, C0836oO0o0oO0 c0836oO0o0oO0) {
        this.OooO00o = fileOutputStream;
        this.OooO0OO = c0836oO0o0oO0;
        this.OooO0O0 = (byte[]) c0836oO0o0oO0.OooO0Oo(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.OooO00o;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.OooO0O0;
            if (bArr != null) {
                this.OooO0OO.OooO0oo(bArr);
                this.OooO0O0 = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.OooO0Oo;
        OutputStream outputStream = this.OooO00o;
        if (i > 0) {
            outputStream.write(this.OooO0O0, 0, i);
            this.OooO0Oo = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.OooO0O0;
        int i2 = this.OooO0Oo;
        int i3 = i2 + 1;
        this.OooO0Oo = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.OooO00o.write(bArr, 0, i3);
        this.OooO0Oo = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.OooO0Oo;
            OutputStream outputStream = this.OooO00o;
            if (i6 == 0 && i4 >= this.OooO0O0.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.OooO0O0.length - i6);
            System.arraycopy(bArr, i5, this.OooO0O0, this.OooO0Oo, min);
            int i7 = this.OooO0Oo + min;
            this.OooO0Oo = i7;
            i3 += min;
            byte[] bArr2 = this.OooO0O0;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.OooO0Oo = 0;
                continue;
            }
        } while (i3 < i2);
    }
}
