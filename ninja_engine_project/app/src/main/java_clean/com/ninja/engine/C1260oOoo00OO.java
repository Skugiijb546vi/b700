package com.ninja.engine;

import com.app.framework.core.system.JarConfig;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
/* renamed from: com.ninja.engine.oOoo00OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1260oOoo00OO implements Closeable {
    public final InputStream OooO00o;
    public final Charset OooO0O0;
    public byte[] OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public C1260oOoo00OO(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(AbstractC1400oo00OOO.OooO00o)) {
                this.OooO00o = fileInputStream;
                this.OooO0O0 = charset;
                this.OooO0OO = new byte[JarConfig.DEFAULT_BUFFER_SIZE];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final String OooO00o() {
        int i;
        synchronized (this.OooO00o) {
            try {
                byte[] bArr = this.OooO0OO;
                if (bArr != null) {
                    if (this.OooO0Oo >= this.OooO0o0) {
                        int read = this.OooO00o.read(bArr, 0, bArr.length);
                        if (read != -1) {
                            this.OooO0Oo = 0;
                            this.OooO0o0 = read;
                        } else {
                            throw new EOFException();
                        }
                    }
                    for (int i2 = this.OooO0Oo; i2 != this.OooO0o0; i2++) {
                        byte[] bArr2 = this.OooO0OO;
                        if (bArr2[i2] == 10) {
                            int i3 = this.OooO0Oo;
                            if (i2 != i3) {
                                i = i2 - 1;
                                if (bArr2[i] == 13) {
                                    String str = new String(bArr2, i3, i - i3, this.OooO0O0.name());
                                    this.OooO0Oo = i2 + 1;
                                    return str;
                                }
                            }
                            i = i2;
                            String str2 = new String(bArr2, i3, i - i3, this.OooO0O0.name());
                            this.OooO0Oo = i2 + 1;
                            return str2;
                        }
                    }
                    C1259oOoo00O0 c1259oOoo00O0 = new C1259oOoo00O0(this, (this.OooO0o0 - this.OooO0Oo) + 80);
                    while (true) {
                        byte[] bArr3 = this.OooO0OO;
                        int i4 = this.OooO0Oo;
                        c1259oOoo00O0.write(bArr3, i4, this.OooO0o0 - i4);
                        this.OooO0o0 = -1;
                        byte[] bArr4 = this.OooO0OO;
                        int read2 = this.OooO00o.read(bArr4, 0, bArr4.length);
                        if (read2 != -1) {
                            this.OooO0Oo = 0;
                            this.OooO0o0 = read2;
                            for (int i5 = 0; i5 != this.OooO0o0; i5++) {
                                byte[] bArr5 = this.OooO0OO;
                                if (bArr5[i5] == 10) {
                                    int i6 = this.OooO0Oo;
                                    if (i5 != i6) {
                                        c1259oOoo00O0.write(bArr5, i6, i5 - i6);
                                    }
                                    this.OooO0Oo = i5 + 1;
                                    return c1259oOoo00O0.toString();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                } else {
                    throw new IOException("LineReader is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0OO != null) {
                    this.OooO0OO = null;
                    this.OooO00o.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}


