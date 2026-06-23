package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: com.ninja.engine.o0OOOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362o0OOOOoo extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC1083oOOoO0o OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ View OooO0OO;
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ C0367o0OOOo0o OooO0o;
    public final /* synthetic */ ViewPropertyAnimator OooO0o0;

    public C0362o0OOOOoo(C0367o0OOOo0o c0367o0OOOo0o, AbstractC1083oOOoO0o abstractC1083oOOoO0o, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.OooO0o = c0367o0OOOo0o;
        this.OooO00o = abstractC1083oOOoO0o;
        this.OooO0O0 = i;
        this.OooO0OO = view;
        this.OooO0Oo = i2;
        this.OooO0o0 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.OooO0O0;
        View view = this.OooO0OO;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.OooO0Oo != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.OooO0o0.setListener(null);
        C0367o0OOOo0o c0367o0OOOo0o = this.OooO0o;
        AbstractC1083oOOoO0o abstractC1083oOOoO0o = this.OooO00o;
        c0367o0OOOo0o.OooO0OO(abstractC1083oOOoO0o);
        c0367o0OOOo0o.OooOOOo.remove(abstractC1083oOOoO0o);
        c0367o0OOOo0o.OooO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.OooO0o.getClass();
    }
}
