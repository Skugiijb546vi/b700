package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* renamed from: com.ninja.engine.oo0000O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353oo0000O extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o = 0;
    public final /* synthetic */ Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public C1353oo0000O(AbstractC1358oo0000o0 abstractC1358oo0000o0, C0145o00OO0oO c0145o00OO0oO) {
        this.OooO0OO = abstractC1358oo0000o0;
        this.OooO0O0 = c0145o00OO0oO;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                ((C0145o00OO0oO) this.OooO0O0).remove(animator);
                ((AbstractC1358oo0000o0) this.OooO0OO).OooOOO.remove(animator);
                return;
            default:
                ((C1520oo0Oo0OO) this.OooO0O0).OooO00o.OooO0Oo(1.0f);
                C1515oo0Oo00.OooO0o0((View) this.OooO0OO);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                ((AbstractC1358oo0000o0) this.OooO0OO).OooOOO.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C1353oo0000O(C1520oo0Oo0OO c1520oo0Oo0OO, View view) {
        this.OooO0O0 = c1520oo0Oo0OO;
        this.OooO0OO = view;
    }
}
