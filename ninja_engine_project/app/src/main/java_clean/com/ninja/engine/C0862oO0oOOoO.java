package com.ninja.engine;

import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* renamed from: com.ninja.engine.oO0oOOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862oO0oOOoO extends AbstractC1071oOOo0o0 {
    public final /* synthetic */ com.google.android.material.datepicker.OooO0OO OooO00o;
    public final /* synthetic */ MaterialButton OooO0O0;
    public final /* synthetic */ C0863oO0oOOoo OooO0OO;

    public C0862oO0oOOoO(C0863oO0oOOoo c0863oO0oOOoo, com.google.android.material.datepicker.OooO0OO oooO0OO, MaterialButton materialButton) {
        this.OooO0OO = c0863oO0oOOoo;
        this.OooO00o = oooO0OO;
        this.OooO0O0 = materialButton;
    }

    @Override // com.ninja.engine.AbstractC1071oOOo0o0
    public final void OooO00o(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.OooO0O0.getText());
        }
    }

    @Override // com.ninja.engine.AbstractC1071oOOo0o0
    public final void OooO0O0(RecyclerView recyclerView, int i, int i2) {
        int o00000o0;
        String formatDateTime;
        C0863oO0oOOoo c0863oO0oOOoo = this.OooO0OO;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0863oO0oOOoo.Ooooo00.getLayoutManager();
            View o00000oO = linearLayoutManager.o00000oO(0, linearLayoutManager.OooOo0O(), false);
            if (o00000oO == null) {
                o00000o0 = -1;
            } else {
                o00000o0 = AbstractC1066oOOo0Oo.Oooo00o(o00000oO);
            }
        } else {
            o00000o0 = ((LinearLayoutManager) c0863oO0oOOoo.Ooooo00.getLayoutManager()).o00000o0();
        }
        com.google.android.material.datepicker.OooO0OO oooO0OO = this.OooO00o;
        Calendar OooO0O0 = AbstractC1399oo00OO0o.OooO0O0(oooO0OO.OooO0OO.OooO00o.OooO00o);
        OooO0O0.add(2, o00000o0);
        c0863oO0oOOoo.OoooOOo = new C0906oOO000oo(OooO0O0);
        Calendar OooO0O02 = AbstractC1399oo00OO0o.OooO0O0(oooO0OO.OooO0OO.OooO00o.OooO00o);
        OooO0O02.add(2, o00000o0);
        OooO0O02.set(5, 1);
        Calendar OooO0O03 = AbstractC1399oo00OO0o.OooO0O0(OooO0O02);
        OooO0O03.get(2);
        OooO0O03.get(1);
        OooO0O03.getMaximum(7);
        OooO0O03.getActualMaximum(5);
        OooO0O03.getTimeInMillis();
        long timeInMillis = OooO0O03.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            formatDateTime = AbstractC1399oo00OO0o.OooO00o("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
        } else {
            formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.OooO0O0.setText(formatDateTime);
    }
}


