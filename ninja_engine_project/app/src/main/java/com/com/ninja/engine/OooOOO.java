package com.ninja.engine;

import androidx.appcompat.widget.ActionBarContextView;
/* loaded from: classes.dex */
public final class OooOOO implements InterfaceC1474oo0O0o00 {
    public boolean OooO00o = false;
    public int OooO0O0;
    public final /* synthetic */ ActionBarContextView OooO0OO;

    public OooOOO(ActionBarContextView actionBarContextView) {
        this.OooO0OO = actionBarContextView;
    }

    @Override // com.ninja.engine.InterfaceC1474oo0O0o00
    public final void OooO00o() {
        if (this.OooO00o) {
            return;
        }
        ActionBarContextView actionBarContextView = this.OooO0OO;
        actionBarContextView.OooO0o = null;
        super/*android.view.ViewGroup*/.setVisibility(this.OooO0O0);
    }

    @Override // com.ninja.engine.InterfaceC1474oo0O0o00
    public final void OooO0O0() {
        this.OooO00o = true;
    }

    @Override // com.ninja.engine.InterfaceC1474oo0O0o00
    public final void OooO0OO() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.OooO00o = false;
    }
}
