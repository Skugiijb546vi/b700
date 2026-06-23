package com.ninja.engine;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class o0OOOO implements oOOO00Oo {
    public final ByteBuffer OooO00o;

    public o0OOOO() {
        this.OooO00o = ByteBuffer.allocate(4);
    }

    @Override // com.ninja.engine.oOOO00Oo
    public void OooO00o(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.OooO00o) {
                this.OooO00o.position(0);
                messageDigest.update(this.OooO00o.putInt(num.intValue()).array());
            }
        }
    }

    public short OooO0O0(int i) {
        ByteBuffer byteBuffer = this.OooO00o;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    public o0OOOO(byte[] bArr, int i) {
        this.OooO00o = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }
}


