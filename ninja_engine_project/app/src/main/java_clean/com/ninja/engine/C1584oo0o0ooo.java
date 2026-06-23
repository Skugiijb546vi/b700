package com.ninja.engine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
/* renamed from: com.ninja.engine.oo0o0ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1584oo0o0ooo extends AbstractC1061oOOo0O0O {
    public final C0863oO0oOOoo OooO0OO;

    public C1584oo0o0ooo(C0863oO0oOOoo c0863oO0oOOoo) {
        this.OooO0OO = c0863oO0oOOoo;
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final int OooO00o() {
        return this.OooO0OO.OoooOOO.OooO0o;
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final AbstractC1083oOOoO0o OooO0o(RecyclerView recyclerView, int i) {
        return new C1583oo0o0ooO((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final void OooO0o0(AbstractC1083oOOoO0o abstractC1083oOOoO0o, int i) {
        String format;
        C0863oO0oOOoo c0863oO0oOOoo = this.OooO0OO;
        int i2 = c0863oO0oOOoo.OoooOOO.OooO00o.OooO0OO + i;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((C1583oo0o0ooO) abstractC1083oOOoO0o).OooOo00;
        textView.setText(format2);
        Context context = textView.getContext();
        if (AbstractC1399oo00OO0o.OooO0OO().get(1) == i2) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2));
        }
        textView.setContentDescription(format);
        C0415o0Oo0O0O c0415o0Oo0O0O = c0863oO0oOOoo.OoooOoO;
        if (AbstractC1399oo00OO0o.OooO0OO().get(1) == i2) {
            Object obj = c0415o0Oo0O0O.OooO0OO;
        } else {
            Object obj2 = c0415o0Oo0O0O.OooO0O0;
        }
        throw null;
    }
}


