package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.ninja.engine.AbstractC1399oo00OO0o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0858oO0oOOOO;
import com.ninja.engine.C0864oO0oOo;
import com.ninja.engine.R;
import com.ninja.engine.oOO00;
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean OooO00o;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC1399oo00OO0o.OooO0Oo(null);
        if (C0864oO0oOo.OoooO00(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.OooO00o = C0864oO0oOo.OoooO00(getContext(), R.attr.nestedScrollable);
        AbstractC1460oo0O00oo.OooOOOo(this, new C0858oO0oOOOO(2));
    }

    public final oOO00 OooO00o() {
        return (oOO00) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (oOO00) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((oOO00) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oOO00 ooo00 = (oOO00) super.getAdapter();
        ooo00.getClass();
        int max = Math.max(ooo00.OooO00o(), getFirstVisiblePosition());
        int min = Math.min(ooo00.OooO0OO(), getLastVisiblePosition());
        ooo00.getItem(max);
        ooo00.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int OooO00o;
        if (z) {
            if (i == 33) {
                OooO00o = ((oOO00) super.getAdapter()).OooO0OO();
            } else if (i == 130) {
                OooO00o = ((oOO00) super.getAdapter()).OooO00o();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(OooO00o);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((oOO00) super.getAdapter()).OooO00o()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((oOO00) super.getAdapter()).OooO00o());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.OooO00o) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((oOO00) super.getAdapter()).OooO00o()) {
            i = ((oOO00) super.getAdapter()).OooO00o();
        }
        super.setSelection(i);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (oOO00) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof oOO00)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), oOO00.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
