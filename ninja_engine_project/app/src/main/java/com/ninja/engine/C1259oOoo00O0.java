package com.ninja.engine;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
/* renamed from: com.ninja.engine.oOoo00O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259oOoo00O0 extends ByteArrayOutputStream {
    public final /* synthetic */ C1260oOoo00OO OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1259oOoo00O0(C1260oOoo00OO c1260oOoo00OO, int i) {
        super(i);
        this.OooO00o = c1260oOoo00OO;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.OooO00o.OooO0O0.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
