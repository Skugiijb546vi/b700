package com.ninja.engine;

import android.view.LayoutInflater;
/* loaded from: classes.dex */
public final class o000O implements InterfaceC0966oOO0ooo0 {
    public final /* synthetic */ o000OO00 OooO00o;

    public o000O(o000OO00 o000oo00) {
        this.OooO00o = o000oo00;
    }

    @Override // com.ninja.engine.InterfaceC0966oOO0ooo0
    public final void OooO00o() {
        o000OO00 o000oo00 = this.OooO00o;
        AbstractC0094o000OooO OooOOoo = o000oo00.OooOOoo();
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo;
        LayoutInflater from = LayoutInflater.from(layoutInflater$Factory2C0109o000oOoo.OooOO0O);
        if (from.getFactory() == null) {
            from.setFactory2(layoutInflater$Factory2C0109o000oOoo);
        } else {
            boolean z = from.getFactory2() instanceof LayoutInflater$Factory2C0109o000oOoo;
        }
        ((C0086o000Oo00) o000oo00.OooO0o0.OooO0Oo).OooO0OO("androidx:appcompat");
        OooOOoo.OooO0OO();
    }
}


