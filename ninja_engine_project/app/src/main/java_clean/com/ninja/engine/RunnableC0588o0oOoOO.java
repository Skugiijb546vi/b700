package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* renamed from: com.ninja.engine.o0oOoOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0588o0oOoOO extends AnimationSet implements Runnable {
    public final ViewGroup OooO00o;
    public final View OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;

    public RunnableC0588o0oOoOO(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.OooO0o0 = true;
        this.OooO00o = viewGroup;
        this.OooO0O0 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.OooO0o0 = true;
        if (this.OooO0OO) {
            return !this.OooO0Oo;
        }
        if (!super.getTransformation(j, transformation)) {
            this.OooO0OO = true;
            oOOO00.OooO00o(this.OooO00o, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.OooO0OO;
        ViewGroup viewGroup = this.OooO00o;
        if (!z && this.OooO0o0) {
            this.OooO0o0 = false;
            viewGroup.post(this);
            return;
        }
        viewGroup.endViewTransition(this.OooO0O0);
        this.OooO0Oo = true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.OooO0o0 = true;
        if (this.OooO0OO) {
            return !this.OooO0Oo;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.OooO0OO = true;
            oOOO00.OooO00o(this.OooO00o, this);
        }
        return true;
    }
}


