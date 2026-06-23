package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1091oOOoOOOO;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0221o00o0oo0;
import com.ninja.engine.C0455o0OoOo00;
import com.ninja.engine.InterfaceC0220o00o0oo;
import com.ninja.engine.InterfaceC0222o00o0ooo;
import com.ninja.engine.R;
import com.ninja.engine.oOO0O0O;
/* loaded from: classes.dex */
public class BottomNavigationView extends oOO0O0O {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0131o00O0o Oooo0o0 = AbstractC0692o0ooooOo.Oooo0o0(getContext(), attributeSet, AbstractC1038oOOOoo0O.OooO0OO, R.attr.bottomNavigationStyle, 2131952444, new int[0]);
        TypedArray typedArray = (TypedArray) Oooo0o0.OooO0O0;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        Oooo0o0.Oooo0o0();
        AbstractC1091oOOoOOOO.OooOO0(this, new C0455o0OoOo00(14));
    }

    @Override // com.ninja.engine.oOO0O0O
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C0221o00o0oo0 c0221o00o0oo0 = (C0221o00o0oo0) getMenuView();
        if (c0221o00o0oo0.Oooo0o0 != z) {
            c0221o00o0oo0.setItemHorizontalTranslationEnabled(z);
            getPresenter().OooO(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC0220o00o0oo interfaceC0220o00o0oo) {
        setOnItemReselectedListener(interfaceC0220o00o0oo);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC0222o00o0ooo interfaceC0222o00o0ooo) {
        setOnItemSelectedListener(interfaceC0222o00o0ooo);
    }
}


