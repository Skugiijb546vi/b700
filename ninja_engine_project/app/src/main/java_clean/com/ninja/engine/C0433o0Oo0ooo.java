package com.ninja.engine;

import android.animation.ValueAnimator;
import android.view.View;
import com.roger.catloadinglibrary.EyelidView;
import com.roger.catloadinglibrary.GraduallyTextView;
/* renamed from: com.ninja.engine.o0Oo0ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0433o0Oo0ooo implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0433o0Oo0ooo(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                C0434o0OoO0 c0434o0OoO0 = (C0434o0OoO0) obj;
                c0434o0OoO0.getClass();
                c0434o0OoO0.OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                int i = EyelidView.OooO0oO;
                AbstractC0809oO0OooOO.OooOOOo(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC0809oO0OooOO.OooOOO0(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                EyelidView eyelidView = (EyelidView) obj;
                eyelidView.OooO0OO = ((Float) animatedValue).floatValue();
                eyelidView.invalidate();
                return;
            case 2:
                int i2 = GraduallyTextView.OooOO0o;
                AbstractC0809oO0OooOO.OooOOOo(valueAnimator, "animation");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC0809oO0OooOO.OooOOO0(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                GraduallyTextView graduallyTextView = (GraduallyTextView) obj;
                graduallyTextView.OooO = ((Float) animatedValue2).floatValue();
                graduallyTextView.invalidate();
                return;
            default:
                ((C1275oOoo0OoO) obj).OooO0OO();
                return;
        }
    }

    public /* synthetic */ C0433o0Oo0ooo(C1275oOoo0OoO c1275oOoo0OoO, View view) {
        this.OooO00o = 3;
        this.OooO0O0 = c1275oOoo0OoO;
    }
}


