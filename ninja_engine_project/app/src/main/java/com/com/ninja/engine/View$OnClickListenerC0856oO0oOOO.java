package com.ninja.engine;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
/* renamed from: com.ninja.engine.oO0oOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnClickListenerC0856oO0oOOO implements View.OnClickListener {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public /* synthetic */ View$OnClickListenerC0856oO0oOOO(C0863oO0oOOoo c0863oO0oOOoo, com.google.android.material.datepicker.OooO0OO oooO0OO, int i) {
        this.OooO00o = i;
        this.OooO0OO = c0863oO0oOOoo;
        this.OooO0O0 = oooO0OO;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int Oooo00o;
        switch (this.OooO00o) {
            case 0:
                C0863oO0oOOoo c0863oO0oOOoo = (C0863oO0oOOoo) this.OooO0OO;
                int o00000o0 = ((LinearLayoutManager) c0863oO0oOOoo.Ooooo00.getLayoutManager()).o00000o0() - 1;
                if (o00000o0 >= 0) {
                    Calendar OooO0O0 = AbstractC1399oo00OO0o.OooO0O0(((com.google.android.material.datepicker.OooO0OO) this.OooO0O0).OooO0OO.OooO00o.OooO00o);
                    OooO0O0.add(2, o00000o0);
                    c0863oO0oOOoo.Oooo0o(new C0906oOO000oo(OooO0O0));
                    return;
                }
                return;
            case 1:
                C0863oO0oOOoo c0863oO0oOOoo2 = (C0863oO0oOOoo) this.OooO0OO;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0863oO0oOOoo2.Ooooo00.getLayoutManager();
                View o00000oO = linearLayoutManager.o00000oO(0, linearLayoutManager.OooOo0O(), false);
                if (o00000oO == null) {
                    Oooo00o = -1;
                } else {
                    Oooo00o = AbstractC1066oOOo0Oo.Oooo00o(o00000oO);
                }
                int i = Oooo00o + 1;
                if (i < c0863oO0oOOoo2.Ooooo00.getAdapter().OooO00o()) {
                    Calendar OooO0O02 = AbstractC1399oo00OO0o.OooO0O0(((com.google.android.material.datepicker.OooO0OO) this.OooO0O0).OooO0OO.OooO00o.OooO00o);
                    OooO0O02.add(2, i);
                    c0863oO0oOOoo2.Oooo0o(new C0906oOO000oo(OooO0O02));
                    return;
                }
                return;
            default:
                C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) this.OooO0OO;
                Window.Callback callback = c1339oOoooOO0.OooOO0O;
                if (callback != null && c1339oOoooOO0.OooOO0o) {
                    callback.onMenuItemSelected(0, (C0655o0ooOO0) this.OooO0O0);
                    return;
                }
                return;
        }
    }

    public View$OnClickListenerC0856oO0oOOO(C1339oOoooOO0 c1339oOoooOO0) {
        this.OooO00o = 2;
        this.OooO0OO = c1339oOoooOO0;
        this.OooO0O0 = new C0655o0ooOO0(c1339oOoooOO0.OooO00o.getContext(), c1339oOoooOO0.OooO0oo);
    }
}
