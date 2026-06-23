package com.ninja.engine;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
/* renamed from: com.ninja.engine.o00o0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201o00o0O0 implements InterfaceC1134oOOooo0, oOO000o {
    public final Resources OooO00o;

    public /* synthetic */ C0201o00o0O0(Resources resources) {
        this.OooO00o = resources;
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        return new C0549o0o0Oo(this.OooO00o, ooo00ooo.OooOO0(Uri.class, InputStream.class));
    }

    @Override // com.ninja.engine.InterfaceC1134oOOooo0
    public InterfaceC1108oOOoo OooOOo(InterfaceC1108oOOoo interfaceC1108oOOoo, C0973oOOO00o c0973oOOO00o) {
        if (interfaceC1108oOOoo == null) {
            return null;
        }
        return new C0207o00o0OOo(this.OooO00o, interfaceC1108oOOoo);
    }
}
