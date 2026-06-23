package com.ninja.engine;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.ninja.engine.oOOo00oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057oOOo00oO extends FilterInputStream {
    public volatile byte[] OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public final C0836oO0o0oO0 OooO0o;
    public int OooO0o0;

    public C1057oOOo00oO(InputStream inputStream, C0836oO0o0oO0 c0836oO0o0oO0) {
        super(inputStream);
        this.OooO0Oo = -1;
        this.OooO0o = c0836oO0o0oO0;
        this.OooO00o = (byte[]) c0836oO0o0oO0.OooO0Oo(65536, byte[].class);
    }

    public static void OooO0OO() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int OooO00o(InputStream inputStream, byte[] bArr) {
        int i = this.OooO0Oo;
        if (i != -1) {
            int i2 = this.OooO0o0 - i;
            int i3 = this.OooO0OO;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.OooO0O0 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.OooO0o.OooO0Oo(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.OooO00o = bArr2;
                    this.OooO0o.OooO0oo(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.OooO0o0 - this.OooO0Oo;
                this.OooO0o0 = i4;
                this.OooO0Oo = 0;
                this.OooO0O0 = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.OooO0o0;
                if (read > 0) {
                    i5 += read;
                }
                this.OooO0O0 = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.OooO0Oo = -1;
            this.OooO0o0 = 0;
            this.OooO0O0 = read2;
        }
        return read2;
    }

    public final synchronized void OooO0O0() {
        if (this.OooO00o != null) {
            this.OooO0o.OooO0oo(this.OooO00o);
            this.OooO00o = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = super.in;
        if (this.OooO00o != null && inputStream != null) {
        } else {
            OooO0OO();
            throw null;
        }
        return (this.OooO0O0 - this.OooO0o0) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.OooO00o != null) {
            this.OooO0o.OooO0oo(this.OooO00o);
            this.OooO00o = null;
        }
        InputStream inputStream = super.in;
        super.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.OooO0OO = Math.max(this.OooO0OO, i);
        this.OooO0Oo = this.OooO0o0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.OooO00o;
        InputStream inputStream = super.in;
        if (bArr == null || inputStream == null) {
            OooO0OO();
            throw null;
        } else if (this.OooO0o0 < this.OooO0O0 || OooO00o(inputStream, bArr) != -1) {
            if (bArr != this.OooO00o && (bArr = this.OooO00o) == null) {
                OooO0OO();
                throw null;
            }
            int i = this.OooO0O0;
            int i2 = this.OooO0o0;
            if (i - i2 > 0) {
                this.OooO0o0 = i2 + 1;
                return bArr[i2] & 255;
            }
            return -1;
        } else {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.OooO00o != null) {
            int i = this.OooO0Oo;
            if (-1 != i) {
                this.OooO0o0 = i;
            } else {
                throw new IOException("Mark has been invalidated, pos: " + this.OooO0o0 + " markLimit: " + this.OooO0OO);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.OooO00o;
        if (bArr != null) {
            InputStream inputStream = super.in;
            if (inputStream != null) {
                int i = this.OooO0O0;
                int i2 = this.OooO0o0;
                if (i - i2 >= j) {
                    this.OooO0o0 = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.OooO0o0 = i;
                if (this.OooO0Oo != -1 && j <= this.OooO0OO) {
                    if (OooO00o(inputStream, bArr) == -1) {
                        return j2;
                    }
                    int i3 = this.OooO0O0;
                    int i4 = this.OooO0o0;
                    if (i3 - i4 >= j - j2) {
                        this.OooO0o0 = (int) ((i4 + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + i3) - i4;
                    this.OooO0o0 = i3;
                    return j3;
                }
                long skip = inputStream.skip(j - j2);
                if (skip > 0) {
                    this.OooO0Oo = -1;
                }
                return j2 + skip;
            }
            OooO0OO();
            throw null;
        }
        OooO0OO();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.OooO00o;
        if (bArr2 == null) {
            OooO0OO();
            throw null;
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = super.in;
            if (inputStream == null) {
                OooO0OO();
                throw null;
            }
            int i5 = this.OooO0o0;
            int i6 = this.OooO0O0;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.OooO0o0 += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.OooO0Oo == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else if (OooO00o(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (bArr2 != this.OooO00o && (bArr2 = this.OooO00o) == null) {
                        OooO0OO();
                        throw null;
                    }
                    int i8 = this.OooO0O0;
                    int i9 = this.OooO0o0;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.OooO0o0 += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        }
    }
}


