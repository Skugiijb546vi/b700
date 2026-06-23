package com.ninja.engine;

import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.ninja.engine.ooOOO0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1782ooOOO0o0 extends AbstractC1071oOOo0o0 {
    public boolean OooO00o = false;
    public final /* synthetic */ C1001oOOOOO OooO0O0;

    public C1782ooOOO0o0(C1001oOOOOO c1001oOOOOO) {
        this.OooO0O0 = c1001oOOOOO;
    }

    @Override // com.ninja.engine.AbstractC1071oOOo0o0
    public final void OooO00o(RecyclerView recyclerView, int i) {
        if (i == 0 && this.OooO00o) {
            this.OooO00o = false;
            this.OooO0O0.OooO0o();
        }
    }

    @Override // com.ninja.engine.AbstractC1071oOOo0o0
    public final void OooO0O0(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.OooO00o = true;
        }
    }
}


