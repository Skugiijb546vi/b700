package com.ninja.engine;

import java.io.Writer;
/* renamed from: com.ninja.engine.oO0o000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815oO0o000 extends Writer {
    public final StringBuilder OooO00o = new StringBuilder(128);

    public final void OooO00o() {
        StringBuilder sb = this.OooO00o;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO00o();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        OooO00o();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                OooO00o();
            } else {
                this.OooO00o.append(c);
            }
        }
    }
}


