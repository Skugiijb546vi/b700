package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: com.ninja.engine.oo0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1526oo0OoO extends AnimatorListenerAdapter implements InterfaceC1356oo0000Oo {
    public final ViewGroup OooO00o;
    public final View OooO0O0;
    public final View OooO0OO;
    public boolean OooO0Oo = true;
    public final /* synthetic */ C0551o0o0Oo00 OooO0o0;

    public C1526oo0OoO(C0551o0o0Oo00 c0551o0o0Oo00, ViewGroup viewGroup, View view, View view2) {
        this.OooO0o0 = c0551o0o0Oo00;
        this.OooO00o = viewGroup;
        this.OooO0O0 = view;
        this.OooO0OO = view2;
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO00o(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        abstractC1358oo0000o0.OooOoO0(this);
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0O0(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        throw null;
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0Oo(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        if (this.OooO0Oo) {
            OooO0oo();
        }
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0oO(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        abstractC1358oo0000o0.OooOoO0(this);
    }

    public final void OooO0oo() {
        this.OooO0OO.setTag(R.id.save_overlay_view, null);
        this.OooO00o.getOverlay().remove(this.OooO0O0);
        this.OooO0Oo = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooO0oo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.OooO00o.getOverlay().remove(this.OooO0O0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.OooO0O0;
        if (view.getParent() == null) {
            this.OooO00o.getOverlay().add(view);
        } else {
            this.OooO0o0.OooO0Oo();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.OooO0OO;
            View view2 = this.OooO0O0;
            view.setTag(R.id.save_overlay_view, view2);
            this.OooO00o.getOverlay().add(view2);
            this.OooO0Oo = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        OooO0oo();
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0OO() {
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o0() {
    }
}
