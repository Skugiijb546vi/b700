package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: com.ninja.engine.o0OOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360o0OOOOo extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o = 1;
    public final /* synthetic */ AbstractC1083oOOoO0o OooO0O0;
    public final /* synthetic */ View OooO0OO;
    public final /* synthetic */ ViewPropertyAnimator OooO0Oo;
    public final /* synthetic */ C0367o0OOOo0o OooO0o0;

    public C0360o0OOOOo(C0367o0OOOo0o c0367o0OOOo0o, AbstractC1083oOOoO0o abstractC1083oOOoO0o, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.OooO0o0 = c0367o0OOOo0o;
        this.OooO0O0 = abstractC1083oOOoO0o;
        this.OooO0OO = view;
        this.OooO0Oo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                this.OooO0OO.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0Oo.setListener(null);
                this.OooO0OO.setAlpha(1.0f);
                C0367o0OOOo0o c0367o0OOOo0o = this.OooO0o0;
                AbstractC1083oOOoO0o abstractC1083oOOoO0o = this.OooO0O0;
                c0367o0OOOo0o.OooO0OO(abstractC1083oOOoO0o);
                c0367o0OOOo0o.OooOOo0.remove(abstractC1083oOOoO0o);
                c0367o0OOOo0o.OooO();
                return;
            default:
                this.OooO0Oo.setListener(null);
                C0367o0OOOo0o c0367o0OOOo0o2 = this.OooO0o0;
                AbstractC1083oOOoO0o abstractC1083oOOoO0o2 = this.OooO0O0;
                c0367o0OOOo0o2.OooO0OO(abstractC1083oOOoO0o2);
                c0367o0OOOo0o2.OooOOOO.remove(abstractC1083oOOoO0o2);
                c0367o0OOOo0o2.OooO();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0o0.getClass();
                return;
            default:
                this.OooO0o0.getClass();
                return;
        }
    }

    public C0360o0OOOOo(C0367o0OOOo0o c0367o0OOOo0o, AbstractC1083oOOoO0o abstractC1083oOOoO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.OooO0o0 = c0367o0OOOo0o;
        this.OooO0O0 = abstractC1083oOOoO0o;
        this.OooO0Oo = viewPropertyAnimator;
        this.OooO0OO = view;
    }
}
