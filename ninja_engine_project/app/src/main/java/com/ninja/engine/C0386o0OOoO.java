package com.ninja.engine;

import com.android.volley.Response;
import com.android.volley.VolleyError;
/* renamed from: com.ninja.engine.o0OOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0386o0OOoO implements Response.ErrorListener, InterfaceC1305oOooOO0o {
    public final /* synthetic */ int OooO00o;
    public static final C0386o0OOoO OooO0O0 = new C0386o0OOoO(3);
    public static final C0386o0OOoO OooO0OO = new C0386o0OOoO(4);
    public static final C0386o0OOoO OooO0Oo = new C0386o0OOoO(5);
    public static final C0386o0OOoO OooO0o0 = new C0386o0OOoO(6);
    public static final C0386o0OOoO OooO0o = new C0386o0OOoO(7);

    public /* synthetic */ C0386o0OOoO(int i) {
        this.OooO00o = i;
    }

    public void OooO00o(InterfaceC1356oo0000Oo interfaceC1356oo0000Oo, AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        switch (this.OooO00o) {
            case 3:
                interfaceC1356oo0000Oo.OooO0o(abstractC1358oo0000o0);
                return;
            case 4:
                interfaceC1356oo0000Oo.OooO00o(abstractC1358oo0000o0);
                return;
            case 5:
                interfaceC1356oo0000Oo.OooO0Oo(abstractC1358oo0000o0);
                return;
            case 6:
                interfaceC1356oo0000Oo.OooO0OO();
                return;
            default:
                interfaceC1356oo0000Oo.OooO0o0();
                return;
        }
    }

    @Override // com.android.volley.Response.ErrorListener
    public void onErrorResponse(VolleyError volleyError) {
    }
}
