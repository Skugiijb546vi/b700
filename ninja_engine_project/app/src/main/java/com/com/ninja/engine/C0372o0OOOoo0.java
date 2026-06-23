package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
/* renamed from: com.ninja.engine.o0OOOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372o0OOOoo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup OooO00o;
    public final /* synthetic */ View OooO0O0;
    public final /* synthetic */ boolean OooO0OO;
    public final /* synthetic */ C1237oOoOoO0O OooO0Oo;
    public final /* synthetic */ C0373o0OOOooO OooO0o0;

    public C0372o0OOOoo0(ViewGroup viewGroup, View view, boolean z, C1237oOoOoO0O c1237oOoOoO0O, C0373o0OOOooO c0373o0OOOooO) {
        this.OooO00o = viewGroup;
        this.OooO0O0 = view;
        this.OooO0OO = z;
        this.OooO0Oo = c1237oOoOoO0O;
        this.OooO0o0 = c0373o0OOOooO;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.OooO00o;
        View view = this.OooO0O0;
        viewGroup.endViewTransition(view);
        boolean z = this.OooO0OO;
        C1237oOoOoO0O c1237oOoOoO0O = this.OooO0Oo;
        if (z) {
            AbstractC1230oOoOo0o.OooO00o(view, c1237oOoOoO0O.OooO00o);
        }
        this.OooO0o0.OooO0o();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c1237oOoOoO0O);
        }
    }
}
