package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: com.ninja.engine.o0OOOo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365o0OOOo00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C0364o0OOOo0 OooO0O0;
    public final /* synthetic */ ViewPropertyAnimator OooO0OO;
    public final /* synthetic */ View OooO0Oo;
    public final /* synthetic */ C0367o0OOOo0o OooO0o0;

    public /* synthetic */ C0365o0OOOo00(C0367o0OOOo0o c0367o0OOOo0o, C0364o0OOOo0 c0364o0OOOo0, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.OooO00o = i;
        this.OooO0o0 = c0367o0OOOo0o;
        this.OooO0O0 = c0364o0OOOo0;
        this.OooO0OO = viewPropertyAnimator;
        this.OooO0Oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0OO.setListener(null);
                View view = this.OooO0Oo;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0364o0OOOo0 c0364o0OOOo0 = this.OooO0O0;
                AbstractC1083oOOoO0o abstractC1083oOOoO0o = c0364o0OOOo0.OooO00o;
                C0367o0OOOo0o c0367o0OOOo0o = this.OooO0o0;
                c0367o0OOOo0o.OooO0OO(abstractC1083oOOoO0o);
                c0367o0OOOo0o.OooOOo.remove(c0364o0OOOo0.OooO00o);
                c0367o0OOOo0o.OooO();
                return;
            default:
                this.OooO0OO.setListener(null);
                View view2 = this.OooO0Oo;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0364o0OOOo0 c0364o0OOOo02 = this.OooO0O0;
                AbstractC1083oOOoO0o abstractC1083oOOoO0o2 = c0364o0OOOo02.OooO0O0;
                C0367o0OOOo0o c0367o0OOOo0o2 = this.OooO0o0;
                c0367o0OOOo0o2.OooO0OO(abstractC1083oOOoO0o2);
                c0367o0OOOo0o2.OooOOo.remove(c0364o0OOOo02.OooO0O0);
                c0367o0OOOo0o2.OooO();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                AbstractC1083oOOoO0o abstractC1083oOOoO0o = this.OooO0O0.OooO00o;
                this.OooO0o0.getClass();
                return;
            default:
                AbstractC1083oOOoO0o abstractC1083oOOoO0o2 = this.OooO0O0.OooO0O0;
                this.OooO0o0.getClass();
                return;
        }
    }
}
