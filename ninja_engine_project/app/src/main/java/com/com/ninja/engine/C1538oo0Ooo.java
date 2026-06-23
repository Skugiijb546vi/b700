package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: com.ninja.engine.oo0Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538oo0Ooo extends AnimatorListenerAdapter implements InterfaceC1356oo0000Oo {
    public final View OooO00o;
    public final int OooO0O0;
    public final ViewGroup OooO0OO;
    public boolean OooO0o0;
    public boolean OooO0o = false;
    public final boolean OooO0Oo = true;

    public C1538oo0Ooo(View view, int i) {
        this.OooO00o = view;
        this.OooO0O0 = i;
        this.OooO0OO = (ViewGroup) view.getParent();
        OooO0oo(true);
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
    public final void OooO0OO() {
        OooO0oo(false);
        if (!this.OooO0o) {
            AbstractC1478oo0O0oOO.OooO0O0(this.OooO00o, this.OooO0O0);
        }
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0o0() {
        OooO0oo(true);
        if (!this.OooO0o) {
            AbstractC1478oo0O0oOO.OooO0O0(this.OooO00o, 0);
        }
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0oO(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        abstractC1358oo0000o0.OooOoO0(this);
    }

    public final void OooO0oo(boolean z) {
        ViewGroup viewGroup;
        if (this.OooO0Oo && this.OooO0o0 != z && (viewGroup = this.OooO0OO) != null) {
            this.OooO0o0 = z;
            AbstractC1137oOOoooO.OooOOo0(viewGroup, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.OooO0o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.OooO0o) {
            AbstractC1478oo0O0oOO.OooO0O0(this.OooO00o, this.OooO0O0);
            ViewGroup viewGroup = this.OooO0OO;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        OooO0oo(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.OooO0o) {
            AbstractC1478oo0O0oOO.OooO0O0(this.OooO00o, this.OooO0O0);
            ViewGroup viewGroup = this.OooO0OO;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        OooO0oo(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC1478oo0O0oOO.OooO0O0(this.OooO00o, 0);
            ViewGroup viewGroup = this.OooO0OO;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0Oo(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
