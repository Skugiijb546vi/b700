package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.ninja.engine.AbstractC0192o00o000O;
import com.ninja.engine.C0044OoooOOO;
import com.ninja.engine.C0455o0OoOo00;
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final C0455o0OoOo00 OooO;

    public BaseTransientBottomBar$Behavior() {
        C0455o0OoOo00 c0455o0OoOo00 = new C0455o0OoOo00(11);
        this.OooO0o = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.OooO0oO = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.OooO0Oo = 0;
        this.OooO = c0455o0OoOo00;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.OooO.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0044OoooOOO.OooO0O0 == null) {
                    C0044OoooOOO.OooO0O0 = new C0044OoooOOO(1);
                }
                synchronized (C0044OoooOOO.OooO0O0.OooO00o) {
                }
            }
        } else if (coordinatorLayout.OooOOO(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0044OoooOOO.OooO0O0 == null) {
                C0044OoooOOO.OooO0O0 = new C0044OoooOOO(1);
            }
            C0044OoooOOO.OooO0O0.OooO0OO();
        }
        return super.OooO0oO(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean OooOo0O(View view) {
        this.OooO.getClass();
        return view instanceof AbstractC0192o00o000O;
    }
}
