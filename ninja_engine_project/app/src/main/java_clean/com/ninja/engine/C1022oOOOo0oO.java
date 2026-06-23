package com.ninja.engine;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
/* renamed from: com.ninja.engine.oOOOo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022oOOOo0oO implements InterfaceC0904oOO000o0 {
    public final Context OooO00o;
    public final InterfaceC0904oOO000o0 OooO0O0;
    public final InterfaceC0904oOO000o0 OooO0OO;
    public final Class OooO0Oo;

    public C1022oOOOo0oO(Context context, InterfaceC0904oOO000o0 interfaceC0904oOO000o0, InterfaceC0904oOO000o0 interfaceC0904oOO000o02, Class cls) {
        this.OooO00o = context.getApplicationContext();
        this.OooO0O0 = interfaceC0904oOO000o0;
        this.OooO0OO = interfaceC0904oOO000o02;
        this.OooO0Oo = cls;
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        Uri uri = (Uri) obj;
        return new C0903oOO000Oo(new C0947oOO0oO00(uri), new C1020oOOOo0o(this.OooO00o, this.OooO0O0, this.OooO0OO, uri, i, i2, c0973oOOO00o, this.OooO0Oo));
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final boolean OooO0O0(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && AbstractC0692o0ooooOo.Oooo000(uri)) {
            return true;
        }
        return false;
    }
}


