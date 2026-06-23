package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* renamed from: com.ninja.engine.oO0O0oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764oO0O0oOo extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C1160oOo00OOo OooO0O0;

    public /* synthetic */ C0764oO0O0oOo(C1160oOo00OOo c1160oOo00OOo, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c1160oOo00OOo;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                super.onAnimationEnd(animator);
                C1160oOo00OOo c1160oOo00OOo = this.OooO0O0;
                c1160oOo00OOo.OooO0OO();
                C0291o0O00o0 c0291o0O00o0 = c1160oOo00OOo.OooOO0;
                if (c0291o0O00o0 != null) {
                    c0291o0O00o0.OooO00o((oO00Oo0) c1160oOo00OOo.OooO00o);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        int i = this.OooO00o;
        super.onAnimationRepeat(animator);
        switch (i) {
            case 0:
                C1160oOo00OOo c1160oOo00OOo = this.OooO0O0;
                c1160oOo00OOo.OooO0oO = (c1160oOo00OOo.OooO0oO + 1) % c1160oOo00OOo.OooO0o.OooO0OO.length;
                c1160oOo00OOo.OooO0oo = true;
                return;
            default:
                return;
        }
    }
}


