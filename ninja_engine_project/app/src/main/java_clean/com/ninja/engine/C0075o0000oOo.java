package com.ninja.engine;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.o0000oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075o0000oOo extends Animatable2.AnimationCallback {
    public final /* synthetic */ C0291o0O00o0 OooO00o;

    public C0075o0000oOo(C0291o0O00o0 c0291o0O00o0) {
        this.OooO00o = c0291o0O00o0;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.OooO00o.OooO00o(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.OooO00o.OooO0O0(drawable);
    }
}


