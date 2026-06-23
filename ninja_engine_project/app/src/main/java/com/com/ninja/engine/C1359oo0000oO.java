package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.oo0000oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1359oo0000oO extends AbstractC1357oo0000o {
    public final /* synthetic */ C0145o00OO0oO OooO00o;
    public final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC1360oo0000oo OooO0O0;

    public C1359oo0000oO(ViewTreeObserver$OnPreDrawListenerC1360oo0000oo viewTreeObserver$OnPreDrawListenerC1360oo0000oo, C0145o00OO0oO c0145o00OO0oO) {
        this.OooO0O0 = viewTreeObserver$OnPreDrawListenerC1360oo0000oo;
        this.OooO00o = c0145o00OO0oO;
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0oO(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        ((ArrayList) this.OooO00o.get(this.OooO0O0.OooO0O0)).remove(abstractC1358oo0000o0);
        abstractC1358oo0000o0.OooOoO0(this);
    }
}
