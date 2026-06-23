package com.ninja.engine;

import android.content.Context;
import android.net.Uri;
/* renamed from: com.ninja.engine.oO0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877oO0oo0 implements InterfaceC0904oOO000o0 {
    public final /* synthetic */ int OooO00o;
    public final Context OooO0O0;

    public C0877oO0oo0(Context context, int i) {
        this.OooO00o = i;
        switch (i) {
            case 1:
                this.OooO0O0 = context.getApplicationContext();
                return;
            case 2:
                this.OooO0O0 = context.getApplicationContext();
                return;
            default:
                this.OooO0O0 = context;
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        Long l;
        Uri uri = (Uri) obj;
        switch (this.OooO00o) {
            case 0:
                return new C0903oOO000Oo(new C0947oOO0oO00(uri), new C0880oO0oo00o(this.OooO0O0, 0, uri));
            case 1:
                if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
                    C0947oOO0oO00 c0947oOO0oO00 = new C0947oOO0oO00(uri);
                    Context context = this.OooO0O0;
                    return new C0903oOO000Oo(c0947oOO0oO00, C0349o0OO0oOO.OooO0O0(context, uri, new C1312oOooOo(context.getContentResolver())));
                }
                return null;
            default:
                if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384 && (l = (Long) c0973oOOO00o.OooO0OO(C1442oo00ooOo.OooO0Oo)) != null && l.longValue() == -1) {
                    C0947oOO0oO00 c0947oOO0oO002 = new C0947oOO0oO00(uri);
                    Context context2 = this.OooO0O0;
                    return new C0903oOO000Oo(c0947oOO0oO002, C0349o0OO0oOO.OooO0O0(context2, uri, new C1314oOooOoO(context2.getContentResolver(), 0)));
                }
                return null;
        }
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final boolean OooO0O0(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.OooO00o) {
            case 0:
                return AbstractC0692o0ooooOo.Oooo000(uri);
            case 1:
                if (AbstractC0692o0ooooOo.Oooo000(uri) && !uri.getPathSegments().contains("video")) {
                    return true;
                }
                return false;
            default:
                if (AbstractC0692o0ooooOo.Oooo000(uri) && uri.getPathSegments().contains("video")) {
                    return true;
                }
                return false;
        }
    }
}
