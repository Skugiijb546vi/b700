package com.ninja.engine;

import android.content.Context;
import android.view.View;
/* renamed from: com.ninja.engine.o0OOO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355o0OOO0o extends C0897oO0oooOO {
    public final /* synthetic */ o000000 OooOOO;
    public final /* synthetic */ int OooOOO0 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355o0OOO0o(o000000 o000000Var, Context context, MenuC0887oO0oo0oo menuC0887oO0oo0oo, C1569oo0o0Oo c1569oo0o0Oo) {
        super(R.attr.actionOverflowMenuStyle, 0, context, c1569oo0o0Oo, menuC0887oO0oo0oo, true);
        this.OooOOO = o000000Var;
        this.OooO0oO = 8388613;
        o00O o00o = o000000Var.OooOo;
        this.OooO = o00o;
        AbstractC0896oO0oooO0 abstractC0896oO0oooO0 = this.OooOO0;
        if (abstractC0896oO0oooO0 != null) {
            abstractC0896oO0oooO0.OooOOO0(o00o);
        }
    }

    @Override // com.ninja.engine.C0897oO0oooOO
    public final void OooO0OO() {
        switch (this.OooOOO0) {
            case 0:
                o000000 o000000Var = this.OooOOO;
                o000000Var.OooOo0 = null;
                o000000Var.OooOoO0 = 0;
                super.OooO0OO();
                return;
            default:
                o000000 o000000Var2 = this.OooOOO;
                MenuC0887oO0oo0oo menuC0887oO0oo0oo = o000000Var2.OooO0OO;
                if (menuC0887oO0oo0oo != null) {
                    menuC0887oO0oo0oo.OooO0OO(true);
                }
                o000000Var2.OooOo00 = null;
                super.OooO0OO();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355o0OOO0o(o000000 o000000Var, Context context, SubMenuC1265oOoo0O subMenuC1265oOoo0O, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC1265oOoo0O, false);
        this.OooOOO = o000000Var;
        if (!subMenuC1265oOoo0O.OooOoOO.OooO0o()) {
            View view2 = o000000Var.OooOO0;
            this.OooO0o = view2 == null ? (View) o000000Var.OooO0oo : view2;
        }
        o00O o00o = o000000Var.OooOo;
        this.OooO = o00o;
        AbstractC0896oO0oooO0 abstractC0896oO0oooO0 = this.OooOO0;
        if (abstractC0896oO0oooO0 != null) {
            abstractC0896oO0oooO0.OooOOO0(o00o);
        }
    }
}


