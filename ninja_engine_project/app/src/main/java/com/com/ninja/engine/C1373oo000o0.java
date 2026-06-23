package com.ninja.engine;

import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.oo000o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1373oo000o0 {
    public static final ThreadLocal OooO0Oo = new ThreadLocal();
    public final int OooO00o;
    public final oOO00OOO OooO0O0;
    public volatile int OooO0OO = 0;

    public C1373oo000o0(oOO00OOO ooo00ooo, int i) {
        this.OooO0O0 = ooo00ooo;
        this.OooO00o = i;
    }

    public final int OooO00o(int i) {
        oOO0000 OooO0OO = OooO0OO();
        int OooO00o = OooO0OO.OooO00o(16);
        if (OooO00o != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) OooO0OO.OooO0Oo;
            int i2 = OooO00o + OooO0OO.OooO00o;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    public final int OooO0O0() {
        oOO0000 OooO0OO = OooO0OO();
        int OooO00o = OooO0OO.OooO00o(16);
        if (OooO00o != 0) {
            int i = OooO00o + OooO0OO.OooO00o;
            return ((ByteBuffer) OooO0OO.OooO0Oo).getInt(((ByteBuffer) OooO0OO.OooO0Oo).getInt(i) + i);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ninja.engine.oOooO00, java.lang.Object] */
    public final oOO0000 OooO0OO() {
        short s;
        ThreadLocal threadLocal = OooO0Oo;
        oOO0000 ooo0000 = (oOO0000) threadLocal.get();
        oOO0000 ooo00002 = ooo0000;
        if (ooo0000 == null) {
            ?? abstractC1290oOooO00 = new AbstractC1290oOooO00();
            threadLocal.set(abstractC1290oOooO00);
            ooo00002 = abstractC1290oOooO00;
        }
        oOO0000O ooo0000o = (oOO0000O) this.OooO0O0.OooO00o;
        int OooO00o = ooo0000o.OooO00o(6);
        if (OooO00o != 0) {
            int i = OooO00o + ooo0000o.OooO00o;
            int i2 = (this.OooO00o * 4) + ((ByteBuffer) ooo0000o.OooO0Oo).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ooo0000o.OooO0Oo).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ooo0000o.OooO0Oo;
            ooo00002.OooO0Oo = byteBuffer;
            if (byteBuffer != null) {
                ooo00002.OooO00o = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ooo00002.OooO0O0 = i4;
                s = ((ByteBuffer) ooo00002.OooO0Oo).getShort(i4);
            } else {
                s = 0;
                ooo00002.OooO00o = 0;
                ooo00002.OooO0O0 = 0;
            }
            ooo00002.OooO0OO = s;
        }
        return ooo00002;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        oOO0000 OooO0OO = OooO0OO();
        int OooO00o = OooO0OO.OooO00o(4);
        if (OooO00o != 0) {
            i = ((ByteBuffer) OooO0OO.OooO0Oo).getInt(OooO00o + OooO0OO.OooO00o);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int OooO0O0 = OooO0O0();
        for (int i2 = 0; i2 < OooO0O0; i2++) {
            sb.append(Integer.toHexString(OooO00o(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
