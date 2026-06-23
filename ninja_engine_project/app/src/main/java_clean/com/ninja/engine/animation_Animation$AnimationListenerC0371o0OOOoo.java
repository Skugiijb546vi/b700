package com.ninja.engine;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;
/* renamed from: com.ninja.engine.o0OOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class animation_Animation$AnimationListenerC0371o0OOOoo implements Animation.AnimationListener {
    public final /* synthetic */ C1237oOoOoO0O OooO00o;
    public final /* synthetic */ ViewGroup OooO0O0;
    public final /* synthetic */ View OooO0OO;
    public final /* synthetic */ C0373o0OOOooO OooO0Oo;

    public animation_Animation$AnimationListenerC0371o0OOOoo(View view, ViewGroup viewGroup, C0373o0OOOooO c0373o0OOOooO, C1237oOoOoO0O c1237oOoOoO0O) {
        this.OooO00o = c1237oOoOoO0O;
        this.OooO0O0 = viewGroup;
        this.OooO0OO = view;
        this.OooO0Oo = c0373o0OOOooO;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.OooO0O0.post(new o00000OO(5, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.OooO00o);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.OooO00o);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}




