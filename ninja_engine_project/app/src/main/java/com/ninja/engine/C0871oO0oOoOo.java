package com.ninja.engine;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: com.ninja.engine.oO0oOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871oO0oOoOo<S> extends AbstractC0993oOOOO00 {
    public o0O0o OoooOOO;
    public int o000oOoO;

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOo0(Bundle bundle) {
        super.OooOo0(bundle);
        if (bundle == null) {
            bundle = this.OooO0o;
        }
        this.o000oOoO = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC1230oOoOo0o.OooOO0(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.OoooOOO = (o0O0o) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(OooO(), this.o000oOoO));
        throw null;
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOoOO(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.o000oOoO);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.OoooOOO);
    }
}
