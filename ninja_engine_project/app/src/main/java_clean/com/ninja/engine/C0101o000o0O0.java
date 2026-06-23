package com.ninja.engine;

import android.window.OnBackInvokedCallback;
/* renamed from: com.ninja.engine.o000o0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0101o000o0O0 implements OnBackInvokedCallback {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0101o000o0O0(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    public final void onBackInvoked() {
        switch (this.OooO00o) {
            case 0:
                ((LayoutInflater$Factory2C0109o000oOoo) this.OooO0O0).OooOoo();
                return;
            case 1:
                InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo = (InterfaceC0625o0oo0OOo) this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(interfaceC0625o0oo0OOo, "$onBackInvoked");
                interfaceC0625o0oo0OOo.OooO00o();
                return;
            default:
                ((Runnable) this.OooO0O0).run();
                return;
        }
    }
}


