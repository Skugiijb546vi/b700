package com.ninja.engine;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.ninja.engine.oO0oOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863oO0oOOoo<S> extends AbstractC0993oOOOO00 {
    public o0O0o OoooOOO;
    public C0906oOO000oo OoooOOo;
    public int OoooOo0;
    public C0415o0Oo0O0O OoooOoO;
    public RecyclerView OoooOoo;
    public RecyclerView Ooooo00;
    public View Ooooo0o;
    public View OooooO0;
    public View OooooOO;
    public View OooooOo;
    public int o000oOoO;

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOo0(Bundle bundle) {
        super.OooOo0(bundle);
        if (bundle == null) {
            bundle = this.OooO0o;
        }
        this.o000oOoO = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC1230oOoOo0o.OooOO0(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.OoooOOO = (o0O0o) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC1230oOoOo0o.OooOO0(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.OoooOOo = (C0906oOO000oo) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0197, code lost:
        r0 = new com.ninja.engine.C1001oOOOOO();
     */
    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View OooOo0O(android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0863oO0oOOoo.OooOo0O(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOoOO(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.o000oOoO);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.OoooOOO);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.OoooOOo);
    }

    public final void Oooo0o(C0906oOO000oo c0906oOO000oo) {
        boolean z;
        RecyclerView recyclerView;
        RunnableC0263o00ooO0O runnableC0263o00ooO0O;
        com.google.android.material.datepicker.OooO0OO oooO0OO = (com.google.android.material.datepicker.OooO0OO) this.Ooooo00.getAdapter();
        int OooO0Oo = oooO0OO.OooO0OO.OooO00o.OooO0Oo(c0906oOO000oo);
        int OooO0Oo2 = OooO0Oo - oooO0OO.OooO0OO.OooO00o.OooO0Oo(this.OoooOOo);
        boolean z2 = false;
        if (Math.abs(OooO0Oo2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (OooO0Oo2 > 0) {
            z2 = true;
        }
        this.OoooOOo = c0906oOO000oo;
        if (z && z2) {
            this.Ooooo00.OoooOoo(OooO0Oo - 3);
            recyclerView = this.Ooooo00;
            runnableC0263o00ooO0O = new RunnableC0263o00ooO0O(OooO0Oo, 2, this);
        } else if (z) {
            this.Ooooo00.OoooOoo(OooO0Oo + 3);
            recyclerView = this.Ooooo00;
            runnableC0263o00ooO0O = new RunnableC0263o00ooO0O(OooO0Oo, 2, this);
        } else {
            recyclerView = this.Ooooo00;
            runnableC0263o00ooO0O = new RunnableC0263o00ooO0O(OooO0Oo, 2, this);
        }
        recyclerView.post(runnableC0263o00ooO0O);
    }

    public final void Oooo0oO(int i) {
        this.OoooOo0 = i;
        if (i == 2) {
            this.OoooOoo.getLayoutManager().o00Ooo(this.OoooOOo.OooO0OO - ((C1584oo0o0ooo) this.OoooOoo.getAdapter()).OooO0OO.OoooOOO.OooO00o.OooO0OO);
            this.OooooOO.setVisibility(0);
            this.OooooOo.setVisibility(8);
            this.Ooooo0o.setVisibility(8);
            this.OooooO0.setVisibility(8);
        } else if (i == 1) {
            this.OooooOO.setVisibility(8);
            this.OooooOo.setVisibility(0);
            this.Ooooo0o.setVisibility(0);
            this.OooooO0.setVisibility(0);
            Oooo0o(this.OoooOOo);
        }
    }
}
