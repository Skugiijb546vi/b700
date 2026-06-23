package com.ninja.engine;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.o00oOOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231o00oOOO0 implements InterfaceC1125oOOooO0o {
    public final /* synthetic */ int OooO00o;
    public final C0577o0oOo000 OooO0O0;

    public /* synthetic */ C0231o00oOOO0(C0577o0oOo000 c0577o0oOo000, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0577o0oOo000;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                this.OooO0O0.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    this.OooO0O0.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                C0577o0oOo000 c0577o0oOo000 = this.OooO0O0;
                return c0577o0oOo000.OooO00o(new C0131o00O0o((ByteBuffer) obj, c0577o0oOo000.OooO0Oo, c0577o0oOo000.OooO0OO, 13), i, i2, c0973oOOO00o, C0577o0oOo000.OooOO0O);
            default:
                C0577o0oOo000 c0577o0oOo0002 = this.OooO0O0;
                return c0577o0oOo0002.OooO00o(new C0131o00O0o((ParcelFileDescriptor) obj, c0577o0oOo0002.OooO0Oo, c0577o0oOo0002.OooO0OO), i, i2, c0973oOOO00o, C0577o0oOo000.OooOO0O);
        }
    }
}
