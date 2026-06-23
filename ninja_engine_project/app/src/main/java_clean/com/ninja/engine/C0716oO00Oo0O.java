package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
/* renamed from: com.ninja.engine.oO00Oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716oO00Oo0O extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ TextView OooO0O0;
    public final /* synthetic */ int OooO0OO;
    public final /* synthetic */ TextView OooO0Oo;
    public final /* synthetic */ C0715oO00Oo OooO0o0;

    public C0716oO00Oo0O(C0715oO00Oo c0715oO00Oo, int i, TextView textView, int i2, TextView textView2) {
        this.OooO0o0 = c0715oO00Oo;
        this.OooO00o = i;
        this.OooO0O0 = textView;
        this.OooO0OO = i2;
        this.OooO0Oo = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1589oo0oOO0 c1589oo0oOO0;
        int i = this.OooO00o;
        C0715oO00Oo c0715oO00Oo = this.OooO0o0;
        c0715oO00Oo.OooOOO = i;
        c0715oO00Oo.OooOO0o = null;
        TextView textView = this.OooO0O0;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.OooO0OO == 1 && (c1589oo0oOO0 = c0715oO00Oo.OooOOo) != null) {
                c1589oo0oOO0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.OooO0Oo;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.OooO0Oo;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}


