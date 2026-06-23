package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ninja.engine.AbstractC0326o0O0oOOO;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0038Oooo0oo;
import com.ninja.engine.C1273oOoo0Oo;
import com.ninja.engine.C1275oOoo0OoO;
import com.ninja.engine.C1462oo0O0O0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0326o0O0oOOO {
    public C1462oo0O0O0 OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public int OooO0Oo = 2;
    public final float OooO0o0 = 0.5f;
    public float OooO0o = 0.0f;
    public float OooO0oO = 0.5f;
    public final C1273oOoo0Oo OooO0oo = new C1273oOoo0Oo(this);

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.OooO0O0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.OooO0O0 = false;
            }
        } else {
            z = coordinatorLayout.OooOOO(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.OooO0O0 = z;
        }
        if (!z) {
            return false;
        }
        if (this.OooO00o == null) {
            this.OooO00o = new C1462oo0O0O0(coordinatorLayout.getContext(), coordinatorLayout, this.OooO0oo);
        }
        if (!this.OooO0OO && this.OooO00o.OooOOOO(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC1460oo0O00oo.OooOOO0(view, 1048576);
            AbstractC1460oo0O00oo.OooO(view, 0);
            if (OooOo0O(view)) {
                AbstractC1460oo0O00oo.OooOOO(view, C0038Oooo0oo.OooOO0, new C1275oOoo0OoO(this));
            }
        }
        return false;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooOo0(View view, MotionEvent motionEvent) {
        if (this.OooO00o != null) {
            if (!this.OooO0OO || motionEvent.getActionMasked() != 3) {
                this.OooO00o.OooO(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean OooOo0O(View view) {
        return true;
    }
}


