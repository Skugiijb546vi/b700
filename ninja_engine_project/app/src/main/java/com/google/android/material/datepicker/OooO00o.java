package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import com.ninja.engine.C0863oO0oOOoo;
import com.ninja.engine.oOO00;
/* loaded from: classes.dex */
public final class OooO00o implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView OooO00o;
    public final /* synthetic */ OooO0OO OooO0O0;

    public OooO00o(OooO0OO oooO0OO, MaterialCalendarGridView materialCalendarGridView) {
        this.OooO0O0 = oooO0OO;
        this.OooO00o = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.OooO00o;
        oOO00 OooO00o = materialCalendarGridView.OooO00o();
        if (i >= OooO00o.OooO00o() && i <= OooO00o.OooO0OO()) {
            if (materialCalendarGridView.OooO00o().getItem(i).longValue() >= ((C0863oO0oOOoo) this.OooO0O0.OooO0Oo.OooO0O0).OoooOOO.OooO0OO.OooO00o) {
                throw null;
            }
        }
    }
}
