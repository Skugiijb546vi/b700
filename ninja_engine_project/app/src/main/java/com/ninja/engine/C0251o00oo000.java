package com.ninja.engine;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: com.ninja.engine.o00oo000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251o00oo000 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0251o00oo000(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.OooO00o) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0875oO0oOooo c0875oO0oOooo = ((BottomSheetBehavior) this.OooO0O0).OooO;
                if (c0875oO0oOooo != null) {
                    C0868oO0oOoO c0868oO0oOoO = c0875oO0oOooo.OooO00o;
                    if (c0868oO0oOoO.OooOO0 != floatValue) {
                        c0868oO0oOoO.OooOO0 = floatValue;
                        c0875oO0oOooo.OooO0o0 = true;
                        c0875oO0oOooo.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                oO0OO oo0oo = (oO0OO) this.OooO0O0;
                oo0oo.OooO0OO.setAlpha(floatValue2);
                oo0oo.OooO0Oo.setAlpha(floatValue2);
                oo0oo.OooOOoo.invalidate();
                return;
            case 2:
                ((TextInputLayout) this.OooO0O0).o00oO0o.OooOO0O(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.OooO0O0;
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
                return;
        }
    }
}
