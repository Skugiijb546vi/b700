package com.ninja.engine;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
/* renamed from: com.ninja.engine.o0OO0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351o0OO0oo0 extends BaseAdapter {
    public static final int OooO0Oo;
    public final Calendar OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        OooO0Oo = i;
    }

    public C0351o0OO0oo0() {
        Calendar OooO0Oo2 = AbstractC1399oo00OO0o.OooO0Oo(null);
        this.OooO00o = OooO0Oo2;
        this.OooO0O0 = OooO0Oo2.getMaximum(7);
        this.OooO0OO = OooO0Oo2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.OooO0O0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.OooO0O0;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.OooO0OO;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.OooO0OO;
        int i3 = this.OooO0O0;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.OooO00o;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, OooO0Oo, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0351o0OO0oo0(int i) {
        Calendar OooO0Oo2 = AbstractC1399oo00OO0o.OooO0Oo(null);
        this.OooO00o = OooO0Oo2;
        this.OooO0O0 = OooO0Oo2.getMaximum(7);
        this.OooO0OO = i;
    }
}
