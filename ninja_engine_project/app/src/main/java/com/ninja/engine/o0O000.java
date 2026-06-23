package com.ninja.engine;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class o0O000 extends AbstractC1357oo0000o {
    public boolean OooO00o = false;
    public final ViewGroup OooO0O0;

    public o0O000(ViewGroup viewGroup) {
        this.OooO0O0 = viewGroup;
    }

    @Override // com.ninja.engine.AbstractC1357oo0000o, com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0OO() {
        AbstractC1137oOOoooO.OooOOo0(this.OooO0O0, false);
    }

    @Override // com.ninja.engine.AbstractC1357oo0000o, com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0Oo(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        AbstractC1137oOOoooO.OooOOo0(this.OooO0O0, false);
        this.OooO00o = true;
    }

    @Override // com.ninja.engine.AbstractC1357oo0000o, com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o0() {
        AbstractC1137oOOoooO.OooOOo0(this.OooO0O0, true);
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0oO(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        if (!this.OooO00o) {
            AbstractC1137oOOoooO.OooOOo0(this.OooO0O0, false);
        }
        abstractC1358oo0000o0.OooOoO0(this);
    }
}
