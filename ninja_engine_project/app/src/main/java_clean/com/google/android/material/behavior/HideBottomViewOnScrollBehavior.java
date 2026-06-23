package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ninja.engine.AbstractC0326o0O0oOOO;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C0200o00o0O;
import com.ninja.engine.R;
import com.ninja.engine.o000OO0O;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0326o0O0oOOO {
    public int OooO0O0;
    public int OooO0OO;
    public TimeInterpolator OooO0Oo;
    public TimeInterpolator OooO0o0;
    public ViewPropertyAnimator OooO0oo;
    public final LinkedHashSet OooO00o = new LinkedHashSet();
    public int OooO0o = 0;
    public int OooO0oO = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.OooO0o = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.OooO0O0 = AbstractC0809oO0OooOO.OooooOO(view.getContext(), R.attr.motionDurationLong2, 225);
        this.OooO0OO = AbstractC0809oO0OooOO.OooooOO(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.OooO0Oo = AbstractC0809oO0OooOO.OooooOo(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o000OO0O.OooO0Oo);
        this.OooO0o0 = AbstractC0809oO0OooOO.OooooOo(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o000OO0O.OooO0OO);
        return false;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOOO(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LinkedHashSet linkedHashSet = this.OooO00o;
        if (i2 > 0) {
            if (this.OooO0oO == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.OooO0oo;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.OooO0oO = 1;
            Iterator it = linkedHashSet.iterator();
            if (!it.hasNext()) {
                int i6 = this.OooO0o;
                this.OooO0oo = view.animate().translationY(i6).setInterpolator(this.OooO0o0).setDuration(this.OooO0OO).setListener(new C0200o00o0O(3, this));
                return;
            }
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        } else if (i2 >= 0 || this.OooO0oO == 2) {
        } else {
            ViewPropertyAnimator viewPropertyAnimator2 = this.OooO0oo;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.OooO0oO = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.OooO0oo = view.animate().translationY(0).setInterpolator(this.OooO0Oo).setDuration(this.OooO0O0).setListener(new C0200o00o0O(3, this));
                return;
            }
            AbstractC1230oOoOo0o.OooOO0O(it2.next());
            throw null;
        }
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public boolean OooOOoo(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}


