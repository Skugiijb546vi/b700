package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.ninja.engine.AbstractC1083oOOoO0o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C1348oo0;
import com.ninja.engine.R;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class OooO0O0 extends AbstractC1083oOOoO0o {
    public final MaterialCalendarGridView OooOo0;
    public final TextView OooOo00;

    public OooO0O0(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.OooOo00 = textView;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        new C1348oo0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).OooO0o0(textView, Boolean.TRUE);
        this.OooOo0 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}


