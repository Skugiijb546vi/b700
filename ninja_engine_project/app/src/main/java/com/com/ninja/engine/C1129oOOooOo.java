package com.ninja.engine;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
/* renamed from: com.ninja.engine.oOOooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129oOOooOo implements oOO000o {
    public final /* synthetic */ int OooO00o;
    public final Resources OooO0O0;

    public /* synthetic */ C1129oOOooOo(Resources resources, int i) {
        this.OooO00o = i;
        this.OooO0O0 = resources;
    }

    @Override // com.ninja.engine.oOO000o
    public final InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        switch (this.OooO00o) {
            case 0:
                return new C0549o0o0Oo(this.OooO0O0, ooo00ooo.OooOO0(Uri.class, AssetFileDescriptor.class));
            default:
                return new C0549o0o0Oo(this.OooO0O0, C1390oo00O0Oo.OooO0O0);
        }
    }
}
