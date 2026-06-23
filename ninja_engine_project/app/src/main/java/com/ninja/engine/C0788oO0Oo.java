package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* renamed from: com.ninja.engine.oO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788oO0Oo extends AnimatorListenerAdapter {
    public boolean OooO00o = false;
    public final /* synthetic */ oO0OO OooO0O0;

    public C0788oO0Oo(oO0OO oo0oo) {
        this.OooO0O0 = oo0oo;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.OooO00o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.OooO00o) {
            this.OooO00o = false;
            return;
        }
        oO0OO oo0oo = this.OooO0O0;
        if (((Float) oo0oo.OooOoO.getAnimatedValue()).floatValue() == 0.0f) {
            oo0oo.OooOoOO = 0;
            oo0oo.OooO0o(0);
            return;
        }
        oo0oo.OooOoOO = 2;
        oo0oo.OooOOoo.invalidate();
    }
}
