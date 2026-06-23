package com.ninja.engine;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.ninja.engine.oOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222oOoOo implements TextWatcher, SpanWatcher {
    public final Object OooO00o;
    public final AtomicInteger OooO0O0 = new AtomicInteger(0);

    public C1222oOoOo(Object obj) {
        this.OooO00o = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.OooO00o).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.OooO00o).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.OooO0O0.get() > 0 && (obj instanceof C1375oo000o0O)) {
            return;
        }
        ((SpanWatcher) this.OooO00o).onSpanAdded(spannable, obj, i, i2);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.OooO0O0.get() > 0 && (obj instanceof C1375oo000o0O)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i > i2) {
                i = 0;
            }
            if (i3 > i4) {
                i5 = i;
                i6 = 0;
                ((SpanWatcher) this.OooO00o).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }
        i5 = i;
        i6 = i3;
        ((SpanWatcher) this.OooO00o).onSpanChanged(spannable, obj, i5, i2, i6, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.OooO0O0.get() > 0 && (obj instanceof C1375oo000o0O)) {
            return;
        }
        ((SpanWatcher) this.OooO00o).onSpanRemoved(spannable, obj, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.OooO00o).onTextChanged(charSequence, i, i2, i3);
    }
}
