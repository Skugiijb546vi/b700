package com.ninja.engine;

import java.io.FilterInputStream;
import java.io.InputStream;
/* renamed from: com.ninja.engine.o0o00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513o0o00o extends FilterInputStream {
    public static final byte[] OooO0OO = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int OooO0Oo = 31;
    public final byte OooO00o;
    public int OooO0O0;

    public C0513o0o00o(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.OooO00o = (byte) i;
            return;
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Cannot add invalid orientation: "));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i2 = this.OooO0O0;
        int read = (i2 < 2 || i2 > (i = OooO0Oo)) ? super.read() : i2 == i ? this.OooO00o : OooO0OO[i2 - 2] & 255;
        if (read != -1) {
            this.OooO0O0++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.OooO0O0 = (int) (this.OooO0O0 + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.OooO0O0;
        int i5 = OooO0Oo;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.OooO00o;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(OooO0OO, this.OooO0O0 - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.OooO0O0 += i3;
        }
        return i3;
    }
}


