package com.ninja.engine;

import android.view.View;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629o0oo0o implements InterfaceC1356oo0000Oo {
    public final /* synthetic */ View OooO00o;
    public final /* synthetic */ ArrayList OooO0O0;

    public C0629o0oo0o(View view, ArrayList arrayList) {
        this.OooO00o = view;
        this.OooO0O0 = arrayList;
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO00o(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        OooO0oO(abstractC1358oo0000o0);
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0O0(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        abstractC1358oo0000o0.OooOoO0(this);
        abstractC1358oo0000o0.OooO00o(this);
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        OooO0O0(abstractC1358oo0000o0);
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0oO(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        abstractC1358oo0000o0.OooOoO0(this);
        this.OooO00o.setVisibility(8);
        ArrayList arrayList = this.OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0Oo(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0OO() {
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o0() {
    }
}
