package com.ninja.engine;

import java.io.File;
/* renamed from: com.ninja.engine.o00oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230o00oOO implements InterfaceC0904oOO000o0 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public /* synthetic */ C0230o00oOO(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C0903oOO000Oo(new C0947oOO0oO00(bArr), new C0880oO0oo00o(bArr, 1, (InterfaceC0654o0ooOO) this.OooO0O0));
            case 1:
                return new C0903oOO000Oo(new C0947oOO0oO00(obj), new C0349o0OO0oOO(0, obj.toString(), (C0455o0OoOo00) this.OooO0O0));
            default:
                File file = (File) obj;
                return new C0903oOO000Oo(new C0947oOO0oO00(file), new C0349o0OO0oOO(1, file, (C0601o0oOooO0) this.OooO0O0));
        }
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final boolean OooO0O0(Object obj) {
        switch (this.OooO00o) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                File file = (File) obj;
                return true;
        }
    }
}
