package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ninja.engine.AbstractC0326o0O0oOOO;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.AbstractC1469oo0O0Oo0;
import com.ninja.engine.C0327o0O0oOo;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1469oo0O0Oo0 {
    public final int OooO0OO;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void OooOo0o(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
        }
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 == -1 || i4 == -2) {
            OooOo0o(coordinatorLayout.OooOO0(view));
            return false;
        }
        return false;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public boolean OooO0o0(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int OooOo00;
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = ((C0327o0O0oOo) view2.getLayoutParams()).OooO00o;
        if (abstractC0326o0O0oOOO instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0326o0O0oOOO).getClass();
            int i = this.OooO0OO;
            if (i == 0) {
                OooOo00 = 0;
            } else {
                OooOo00 = AbstractC0809oO0OooOO.OooOo00((int) (0.0f * i), 0, i);
            }
            AbstractC1460oo0O00oo.OooOO0O(view, bottom - OooOo00);
        }
        return false;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOOOO(CoordinatorLayout coordinatorLayout, View view) {
        OooOo0o(coordinatorLayout.OooOO0(view));
    }

    @Override // com.ninja.engine.AbstractC1469oo0O0Oo0
    public final void OooOo0O(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooOo0o(coordinatorLayout.OooOO0(view));
        coordinatorLayout.OooOOOo(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooOoOO);
        this.OooO0OO = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooO0O0(View view, View view2) {
    }
}


