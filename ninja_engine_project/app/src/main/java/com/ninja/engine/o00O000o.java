package com.ninja.engine;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
/* loaded from: classes.dex */
public final class o00O000o extends AbstractView$OnTouchListenerC0582o0oOo0Oo {
    public final /* synthetic */ C0123o00O00o OooOO0;
    public final /* synthetic */ AppCompatSpinner OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(AppCompatSpinner appCompatSpinner, View view, C0123o00O00o c0123o00O00o) {
        super(view);
        this.OooOO0O = appCompatSpinner;
        this.OooOO0 = c0123o00O00o;
    }

    @Override // com.ninja.engine.AbstractView$OnTouchListenerC0582o0oOo0Oo
    public final InterfaceC1216oOoOOoOO OooO0O0() {
        return this.OooOO0;
    }

    @Override // com.ninja.engine.AbstractView$OnTouchListenerC0582o0oOo0Oo
    public final boolean OooO0OO() {
        AppCompatSpinner appCompatSpinner = this.OooOO0O;
        if (!appCompatSpinner.getInternalPopup().OooO00o()) {
            appCompatSpinner.OooO0o.OooOO0O(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            return true;
        }
        return true;
    }
}
