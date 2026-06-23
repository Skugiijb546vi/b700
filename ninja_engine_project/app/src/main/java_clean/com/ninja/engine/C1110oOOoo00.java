package com.ninja.engine;

import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.oOOoo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110oOOoo00 extends AbstractC0340o0O0oooO {
    public final /* synthetic */ C1115oOOoo0O0 OooO0Oo;

    public C1110oOOoo00(C1115oOOoo0O0 c1115oOOoo0O0) {
        this.OooO0Oo = c1115oOOoo0O0;
    }

    @Override // com.ninja.engine.AbstractC0340o0O0oooO, com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO00o(Drawable drawable) {
        C1115oOOoo0O0 c1115oOOoo0O0 = this.OooO0Oo;
        c1115oOOoo0O0.OooOo0.setVisibility(8);
        c1115oOOoo0O0.OooOo00.setVisibility(0);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0oO(Drawable drawable) {
        C1115oOOoo0O0 c1115oOOoo0O0 = this.OooO0Oo;
        c1115oOOoo0O0.OooOo0.setVisibility(8);
        c1115oOOoo0O0.OooOo00.setVisibility(0);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0oo(Object obj) {
        C1115oOOoo0O0 c1115oOOoo0O0 = this.OooO0Oo;
        c1115oOOoo0O0.OooOo0.setImageDrawable((Drawable) obj);
        c1115oOOoo0O0.OooOo0.setVisibility(0);
        c1115oOOoo0O0.OooOo00.setVisibility(8);
    }
}


