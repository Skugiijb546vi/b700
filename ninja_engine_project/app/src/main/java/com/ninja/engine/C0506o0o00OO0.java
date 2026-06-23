package com.ninja.engine;

import android.media.MediaDataSource;
import java.io.IOException;
/* renamed from: com.ninja.engine.o0o00OO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506o0o00OO0 extends MediaDataSource {
    public long OooO00o;
    public final /* synthetic */ C0511o0o00OoO OooO0O0;

    public C0506o0o00OO0(C0511o0o00OoO c0511o0o00OoO) {
        this.OooO0O0 = c0511o0o00OoO;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.OooO00o;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.OooO0O0.OooO00o.available()) {
                    return -1;
                }
                this.OooO0O0.OooO0O0(j);
                this.OooO00o = j;
            }
            if (i2 > this.OooO0O0.OooO00o.available()) {
                i2 = this.OooO0O0.OooO00o.available();
            }
            int read = this.OooO0O0.read(bArr, i, i2);
            if (read >= 0) {
                this.OooO00o += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.OooO00o = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
