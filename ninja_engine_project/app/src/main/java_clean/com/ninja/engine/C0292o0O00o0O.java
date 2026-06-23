package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* renamed from: com.ninja.engine.o0O00o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292o0O00o0O extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C0293o0O00o0o OooO0O0;

    public /* synthetic */ C0292o0O00o0O(C0293o0O00o0o c0293o0O00o0o, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0293o0O00o0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                this.OooO0O0.OooO0O0.OooO0oo(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0.OooO0O0.OooO0oo(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}


