package com.ninja.engine;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.ninja.engine.oOoo000o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258oOoo000o implements InterfaceC1125oOOooO0o {
    public final List OooO00o;
    public final InterfaceC1125oOOooO0o OooO0O0;
    public final C0836oO0o0oO0 OooO0OO;

    public C1258oOoo000o(ArrayList arrayList, C0236o00oOOoO c0236o00oOOoO, C0836oO0o0oO0 c0836oO0o0oO0) {
        this.OooO00o = arrayList;
        this.OooO0O0 = c0236o00oOOoO;
        this.OooO0OO = c0836oO0o0oO0;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) c0973oOOO00o.OooO0OO(AbstractC0691o0ooooO0.OooO0O0)).booleanValue() && AbstractC0692o0ooooOo.OooOoo(this.OooO00o, inputStream, this.OooO0OO) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.OooO0O0.OooO0O0(ByteBuffer.wrap(bArr), i, i2, c0973oOOO00o);
    }
}
