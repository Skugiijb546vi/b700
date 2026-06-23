package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ninja.engine.AbstractC0326o0O0oOOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C0327o0O0oOo;
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC0326o0O0oOOO {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final /* bridge */ /* synthetic */ boolean OooO00o(View view) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooO0Oo(C0327o0O0oOo c0327o0O0oOo) {
        if (c0327o0O0oOo.OooO0oo == 0) {
            c0327o0O0oOo.OooO0oo = 80;
        }
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0o0(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooO);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
