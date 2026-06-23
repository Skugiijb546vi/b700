package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* renamed from: com.ninja.engine.o0o0O0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531o0o0O0O extends AnimatorListenerAdapter implements InterfaceC1356oo0000Oo {
    public final View OooO00o;
    public boolean OooO0O0 = false;

    public C0531o0o0O0O(View view) {
        this.OooO00o = view;
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO00o(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0O0(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        throw null;
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0OO() {
        float f;
        View view = this.OooO00o;
        if (view.getVisibility() == 0) {
            f = AbstractC1478oo0O0oOO.OooO00o.OooO0o0(view);
        } else {
            f = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o0() {
        this.OooO00o.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0oO(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC1478oo0O0oOO.OooO00o.OooOOO0(this.OooO00o, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.OooO00o;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.OooO0O0 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.OooO0O0;
        View view = this.OooO00o;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C0919oOO00oOo c0919oOO00oOo = AbstractC1478oo0O0oOO.OooO00o;
        c0919oOO00oOo.OooOOO0(view, 1.0f);
        c0919oOO00oOo.getClass();
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0Oo(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
    }
}


