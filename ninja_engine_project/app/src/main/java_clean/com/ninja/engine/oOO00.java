package com.ninja.engine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class oOO00 extends BaseAdapter {
    public static final int OooO0Oo = AbstractC1399oo00OO0o.OooO0Oo(null).getMaximum(4);
    public static final int OooO0o0 = (AbstractC1399oo00OO0o.OooO0Oo(null).getMaximum(7) + AbstractC1399oo00OO0o.OooO0Oo(null).getMaximum(5)) - 1;
    public final C0906oOO000oo OooO00o;
    public C0415o0Oo0O0O OooO0O0;
    public final o0O0o OooO0OO;

    public oOO00(C0906oOO000oo c0906oOO000oo, o0O0o o0o0o) {
        this.OooO00o = c0906oOO000oo;
        this.OooO0OO = o0o0o;
        throw null;
    }

    public final int OooO00o() {
        int i = this.OooO0OO.OooO0o0;
        C0906oOO000oo c0906oOO000oo = this.OooO00o;
        Calendar calendar = c0906oOO000oo.OooO00o;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + c0906oOO000oo.OooO0Oo;
        }
        return i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0 */
    public final Long getItem(int i) {
        if (i >= OooO00o() && i <= OooO0OO()) {
            Calendar OooO0O0 = AbstractC1399oo00OO0o.OooO0O0(this.OooO00o.OooO00o);
            OooO0O0.set(5, (i - OooO00o()) + 1);
            return Long.valueOf(OooO0O0.getTimeInMillis());
        }
        return null;
    }

    public final int OooO0OO() {
        return (OooO00o() + this.OooO00o.OooO0o0) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return OooO0o0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.OooO00o.OooO0Oo;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C0415o0Oo0O0O(context, 8);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int OooO00o = i - OooO00o();
        if (OooO00o >= 0) {
            C0906oOO000oo c0906oOO000oo = this.OooO00o;
            if (OooO00o < c0906oOO000oo.OooO0o0) {
                textView.setTag(c0906oOO000oo);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(OooO00o + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                AbstractC1399oo00OO0o.OooO0OO().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            AbstractC1399oo00OO0o.OooO0OO().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}


