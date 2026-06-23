package com.ninja.engine;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.o00oOOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232o00oOOOO implements InterfaceC1125oOOooO0o {
    public final /* synthetic */ int OooO00o;
    public final C0205o00o0OO0 OooO0O0;

    public C0232o00oOOOO(int i) {
        this.OooO00o = i;
        switch (i) {
            case 1:
                this.OooO0O0 = new C0205o00o0OO0();
                return;
            default:
                this.OooO0O0 = new C0205o00o0OO0();
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final /* bridge */ /* synthetic */ boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return true;
            default:
                InputStream inputStream = (InputStream) obj;
                return true;
        }
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.OooO00o) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return this.OooO0O0.OooO0OO(createSource, i, i2, c0973oOOO00o);
            default:
                createSource2 = ImageDecoder.createSource(AbstractC0242o00oOoO0.OooO0O0((InputStream) obj));
                return this.OooO0O0.OooO0OO(createSource2, i, i2, c0973oOOO00o);
        }
    }
}


