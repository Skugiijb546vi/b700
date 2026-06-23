package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1469oo0O0Oo0;
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1469oo0O0Oo0 {
    public boolean OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public VelocityTracker OooO0oO;

    public AppBarLayout$BaseBehavior() {
        this.OooO0Oo = -1;
        this.OooO0o = -1;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.OooO0o < 0) {
            this.OooO0o = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.OooO0OO) {
            int i = this.OooO0Oo;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.OooO0o0) > this.OooO0o) {
                this.OooO0o0 = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.OooO0oO;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.OooO0Oo = -1;
        motionEvent.getX();
        motionEvent.getY();
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC1469oo0O0Oo0, com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOO0o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOOO(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOOOo(View view, Parcelable parcelable) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final Parcelable OooOOo0(View view) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooOOoo(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOo0(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == r2) goto L41
            r5 = 2
            if (r0 == r5) goto L2d
            r7 = 3
            if (r0 == r7) goto L45
            r7 = 6
            if (r0 == r7) goto L14
            goto L52
        L14:
            int r7 = r8.getActionIndex()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r2 = 0
        L1c:
            int r7 = r8.getPointerId(r2)
            r6.OooO0Oo = r7
            float r7 = r8.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r7 = (int) r7
            r6.OooO0o0 = r7
            goto L52
        L2d:
            int r0 = r6.OooO0Oo
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r4
        L36:
            float r8 = r8.getY(r0)
            int r8 = (int) r8
            r6.OooO0o0 = r8
            com.ninja.engine.AbstractC1230oOoOo0o.OooOO0O(r7)
            throw r3
        L41:
            android.view.VelocityTracker r0 = r6.OooO0oO
            if (r0 != 0) goto L5c
        L45:
            r6.OooO0OO = r4
            r6.OooO0Oo = r1
            android.view.VelocityTracker r7 = r6.OooO0oO
            if (r7 == 0) goto L52
            r7.recycle()
            r6.OooO0oO = r3
        L52:
            android.view.VelocityTracker r7 = r6.OooO0oO
            if (r7 == 0) goto L59
            r7.addMovement(r8)
        L59:
            boolean r7 = r6.OooO0OO
            return r7
        L5c:
            r0.addMovement(r8)
            android.view.VelocityTracker r8 = r6.OooO0oO
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r0)
            android.view.VelocityTracker r8 = r6.OooO0oO
            int r0 = r6.OooO0Oo
            r8.getYVelocity(r0)
            com.ninja.engine.AbstractC1230oOoOo0o.OooOO0O(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.OooOo0(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOo00(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        AbstractC1230oOoOo0o.OooOOO0(view);
        throw null;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.OooO0Oo = -1;
        this.OooO0o = -1;
    }
}


