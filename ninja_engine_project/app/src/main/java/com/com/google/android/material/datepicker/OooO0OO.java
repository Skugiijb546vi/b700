package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ninja.engine.AbstractC1061oOOo0O0O;
import com.ninja.engine.AbstractC1083oOOoO0o;
import com.ninja.engine.AbstractC1399oo00OO0o;
import com.ninja.engine.C0864oO0oOo;
import com.ninja.engine.C0906oOO000oo;
import com.ninja.engine.C1068oOOo0OoO;
import com.ninja.engine.R;
import com.ninja.engine.o00O;
import com.ninja.engine.o0O0o;
import com.ninja.engine.oOO00;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class OooO0OO extends AbstractC1061oOOo0O0O {
    public final o0O0o OooO0OO;
    public final o00O OooO0Oo;
    public final int OooO0o0;

    public OooO0OO(ContextThemeWrapper contextThemeWrapper, o0O0o o0o0o, o00O o00o) {
        int i;
        C0906oOO000oo c0906oOO000oo = o0o0o.OooO00o;
        C0906oOO000oo c0906oOO000oo2 = o0o0o.OooO0Oo;
        if (c0906oOO000oo.OooO00o.compareTo(c0906oOO000oo2.OooO00o) <= 0) {
            if (c0906oOO000oo2.OooO00o.compareTo(o0o0o.OooO0O0.OooO00o) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * oOO00.OooO0Oo;
                if (C0864oO0oOo.OoooO00(contextThemeWrapper, 16843277)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i = 0;
                }
                this.OooO0o0 = dimensionPixelSize + i;
                this.OooO0OO = o0o0o;
                this.OooO0Oo = o00o;
                if (!this.OooO00o.OooO00o()) {
                    this.OooO0O0 = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final int OooO00o() {
        return this.OooO0OO.OooO0oO;
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final long OooO0O0(int i) {
        Calendar OooO0O0 = AbstractC1399oo00OO0o.OooO0O0(this.OooO0OO.OooO00o.OooO00o);
        OooO0O0.add(2, i);
        return new C0906oOO000oo(OooO0O0).OooO00o.getTimeInMillis();
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final AbstractC1083oOOoO0o OooO0o(RecyclerView recyclerView, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (C0864oO0oOo.OoooO00(recyclerView.getContext(), 16843277)) {
            linearLayout.setLayoutParams(new C1068oOOo0OoO(-1, this.OooO0o0));
            return new OooO0O0(linearLayout, true);
        }
        return new OooO0O0(linearLayout, false);
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final void OooO0o0(AbstractC1083oOOoO0o abstractC1083oOOoO0o, int i) {
        OooO0O0 oooO0O0 = (OooO0O0) abstractC1083oOOoO0o;
        o0O0o o0o0o = this.OooO0OO;
        Calendar OooO0O0 = AbstractC1399oo00OO0o.OooO0O0(o0o0o.OooO00o.OooO00o);
        OooO0O0.add(2, i);
        C0906oOO000oo c0906oOO000oo = new C0906oOO000oo(OooO0O0);
        oooO0O0.OooOo00.setText(c0906oOO000oo.OooO0OO());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) oooO0O0.OooOo0.findViewById(R.id.month_grid);
        if (materialCalendarGridView.OooO00o() != null && c0906oOO000oo.equals(materialCalendarGridView.OooO00o().OooO00o)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.OooO00o().getClass();
            throw null;
        }
        new oOO00(c0906oOO000oo, o0o0o);
        throw null;
    }
}
