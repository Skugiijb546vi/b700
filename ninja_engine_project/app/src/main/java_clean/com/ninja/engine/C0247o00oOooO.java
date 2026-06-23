package com.ninja.engine;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
/* renamed from: com.ninja.engine.o00oOooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247o00oOooO implements o0OO0oO0, o0OOOOO, oOOO00Oo {
    public final ByteBuffer OooO00o;

    public C0247o00oOooO() {
        this.OooO00o = ByteBuffer.allocate(8);
    }

    @Override // com.ninja.engine.oOOO00Oo
    public void OooO00o(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.OooO00o) {
            this.OooO00o.position(0);
            messageDigest.update(this.OooO00o.putLong(l.longValue()).array());
        }
    }

    @Override // com.ninja.engine.o0OOOOO
    public long OooO0o0(long j) {
        ByteBuffer byteBuffer = this.OooO00o;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // com.ninja.engine.o0OOOOO
    public int OooO0oO(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.OooO00o;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // com.ninja.engine.o0OOOOO
    public short OooO0oo() {
        ByteBuffer byteBuffer = this.OooO00o;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new o0OOOOO0();
    }

    @Override // com.ninja.engine.o0OOOOO
    public int OooOO0o() {
        return (OooO0oo() << 8) | OooO0oo();
    }

    @Override // com.ninja.engine.o0OO0oO0
    public Object OooOOOo() {
        ByteBuffer byteBuffer = this.OooO00o;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public C0247o00oOooO(ByteBuffer byteBuffer, int i) {
        switch (i) {
            case 1:
                this.OooO00o = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return;
            default:
                this.OooO00o = byteBuffer;
                return;
        }
    }

    @Override // com.ninja.engine.o0OO0oO0
    public void OooO0OO() {
    }
}


