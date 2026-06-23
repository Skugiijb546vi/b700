package com.ninja.engine;

import android.animation.ValueAnimator;
/* renamed from: com.ninja.engine.oOO00oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918oOO00oOO implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float OooO00o;
    public final /* synthetic */ AbstractC0921oOO00ooO OooO0O0;

    public C0918oOO00oOO(AbstractC0921oOO00ooO abstractC0921oOO00ooO, float f) {
        this.OooO0O0 = abstractC0921oOO00ooO;
        this.OooO00o = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.OooO0O0.OooO0o0(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.OooO00o);
    }
}
