package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
/* renamed from: com.ninja.engine.o00o0OO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205o00o0OO0 implements InterfaceC1125oOOooO0o {
    public final /* synthetic */ int OooO00o;
    public final InterfaceC0206o00o0OOO OooO0O0;

    public C0205o00o0OO0() {
        this.OooO00o = 0;
        this.OooO0O0 = new C0455o0OoOo00(12);
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final /* bridge */ /* synthetic */ boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                AbstractC0032Oooo00o.OooOo0O(obj);
                return true;
            default:
                C1245oOoOoo c1245oOoOoo = (C1245oOoOoo) obj;
                return true;
        }
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                return OooO0OO(AbstractC0032Oooo00o.OooO0o0(obj), i, i2, c0973oOOO00o);
            default:
                return C0207o00o0OOo.OooO0OO(((C1245oOoOoo) obj).OooO0O0(), this.OooO0O0);
        }
    }

    public C0207o00o0OOo OooO0OO(ImageDecoder.Source source, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new C0370o0OOOoOo(i, i2, c0973oOOO00o));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new C0207o00o0OOo(decodeBitmap, (C0455o0OoOo00) this.OooO0O0);
    }

    public C0205o00o0OO0(InterfaceC0206o00o0OOO interfaceC0206o00o0OOO) {
        this.OooO00o = 1;
        this.OooO0O0 = interfaceC0206o00o0OOO;
    }
}


