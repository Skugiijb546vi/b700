package com.ninja.engine;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
/* renamed from: com.ninja.engine.o0ooOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660o0ooOOo extends AbstractView$OnTouchListenerC0582o0oOo0Oo {
    public final /* synthetic */ int OooOO0 = 0;
    public final /* synthetic */ View OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0660o0ooOOo(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.OooOO0O = actionMenuItemView;
    }

    @Override // com.ninja.engine.AbstractView$OnTouchListenerC0582o0oOo0Oo
    public final InterfaceC1216oOoOOoOO OooO0O0() {
        C0355o0OOO0o c0355o0OOO0o;
        switch (this.OooOO0) {
            case 0:
                AbstractC0662o0ooOoO abstractC0662o0ooOoO = ((ActionMenuItemView) this.OooOO0O).OooOOO0;
                if (abstractC0662o0ooOoO == null || (c0355o0OOO0o = ((C0430o0Oo0oo) abstractC0662o0ooOoO).OooO00o.OooOo0) == null) {
                    return null;
                }
                return c0355o0OOO0o.OooO00o();
            default:
                C0355o0OOO0o c0355o0OOO0o2 = ((C1569oo0o0Oo) this.OooOO0O).OooO0Oo.OooOo00;
                if (c0355o0OOO0o2 == null) {
                    return null;
                }
                return c0355o0OOO0o2.OooO00o();
        }
    }

    @Override // com.ninja.engine.AbstractView$OnTouchListenerC0582o0oOo0Oo
    public final boolean OooO0OO() {
        InterfaceC1216oOoOOoOO OooO0O0;
        switch (this.OooOO0) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.OooOO0O;
                InterfaceC0885oO0oo0o interfaceC0885oO0oo0o = actionMenuItemView.OooOO0O;
                if (interfaceC0885oO0oo0o == null || !interfaceC0885oO0oo0o.OooO0OO(actionMenuItemView.OooO0oo) || (OooO0O0 = OooO0O0()) == null || !OooO0O0.OooO00o()) {
                    return false;
                }
                return true;
            default:
                ((C1569oo0o0Oo) this.OooOO0O).OooO0Oo.OooOOOO();
                return true;
        }
    }

    @Override // com.ninja.engine.AbstractView$OnTouchListenerC0582o0oOo0Oo
    public boolean OooO0Oo() {
        switch (this.OooOO0) {
            case 1:
                o000000 o000000Var = ((C1569oo0o0Oo) this.OooOO0O).OooO0Oo;
                if (o000000Var.OooOo0O != null) {
                    return false;
                }
                o000000Var.OooO0Oo();
                return true;
            default:
                return super.OooO0Oo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0660o0ooOOo(C1569oo0o0Oo c1569oo0o0Oo, View view) {
        super(view);
        this.OooOO0O = c1569oo0o0Oo;
    }
}
