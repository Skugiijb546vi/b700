package com.ninja.engine;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
/* renamed from: com.ninja.engine.oOO0oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960oOO0oo0O implements OnBackAnimationCallback {
    public final /* synthetic */ InterfaceC0638o0oo0oo0 OooO00o;
    public final /* synthetic */ InterfaceC0638o0oo0oo0 OooO0O0;
    public final /* synthetic */ InterfaceC0625o0oo0OOo OooO0OO;
    public final /* synthetic */ InterfaceC0625o0oo0OOo OooO0Oo;

    public C0960oOO0oo0O(InterfaceC0638o0oo0oo0 interfaceC0638o0oo0oo0, InterfaceC0638o0oo0oo0 interfaceC0638o0oo0oo02, InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo, InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo2) {
        this.OooO00o = interfaceC0638o0oo0oo0;
        this.OooO0O0 = interfaceC0638o0oo0oo02;
        this.OooO0OO = interfaceC0625o0oo0OOo;
        this.OooO0Oo = interfaceC0625o0oo0OOo2;
    }

    public final void onBackCancelled() {
        this.OooO0Oo.OooO00o();
    }

    public final void onBackInvoked() {
        this.OooO0OO.OooO00o();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0809oO0OooOO.OooOOOo(backEvent, "backEvent");
        this.OooO0O0.OooO0O0(new C0173o00OoOo0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0809oO0OooOO.OooOOOo(backEvent, "backEvent");
        this.OooO00o.OooO0O0(new C0173o00OoOo0(backEvent));
    }
}


