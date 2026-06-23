package com.ninja.engine;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
/* renamed from: com.ninja.engine.o0O00o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293o0O00o0o extends AbstractC0494o0o000O {
    public EditText OooO;
    public final int OooO0o;
    public final int OooO0o0;
    public final TimeInterpolator OooO0oO;
    public final TimeInterpolator OooO0oo;
    public final View$OnClickListenerC0056OoooooO OooOO0;
    public final View$OnFocusChangeListenerC0289o0O00Ooo OooOO0O;
    public AnimatorSet OooOO0o;
    public ValueAnimator OooOOO0;

    public C0293o0O00o0o(C0495o0o000O0 c0495o0o000O0) {
        super(c0495o0o000O0);
        this.OooOO0 = new View$OnClickListenerC0056OoooooO(2, this);
        this.OooOO0O = new View$OnFocusChangeListenerC0289o0O00Ooo(this, 0);
        this.OooO0o0 = AbstractC0809oO0OooOO.OooooOO(c0495o0o000O0.getContext(), R.attr.motionDurationShort3, 100);
        this.OooO0o = AbstractC0809oO0OooOO.OooooOO(c0495o0o000O0.getContext(), R.attr.motionDurationShort3, 150);
        this.OooO0oO = AbstractC0809oO0OooOO.OooooOo(c0495o0o000O0.getContext(), R.attr.motionEasingLinearInterpolator, o000OO0O.OooO00o);
        this.OooO0oo = AbstractC0809oO0OooOO.OooooOo(c0495o0o000O0.getContext(), R.attr.motionEasingEmphasizedInterpolator, o000OO0O.OooO0Oo);
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooO00o() {
        if (this.OooO0O0.OooOOOo != null) {
            return;
        }
        OooOo00(OooOo0());
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final int OooO0OO() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final int OooO0Oo() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final View.OnClickListener OooO0o() {
        return this.OooOO0;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final View.OnFocusChangeListener OooO0o0() {
        return this.OooOO0O;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final View.OnFocusChangeListener OooO0oO() {
        return this.OooOO0O;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOO0(EditText editText) {
        this.OooO = editText;
        this.OooO00o.setEndIconVisible(OooOo0());
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOOo(boolean z) {
        if (this.OooO0O0.OooOOOo == null) {
            return;
        }
        OooOo00(z);
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOo() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.OooO0oo);
        ofFloat.setDuration(this.OooO0o);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = C0293o0O00o0o.this.OooO0Oo;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.OooO0oO;
        ofFloat2.setInterpolator(timeInterpolator);
        int i = this.OooO0o0;
        ofFloat2.setDuration(i);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0293o0O00o0o.this.OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.OooOO0o = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.OooOO0o.addListener(new C0292o0O00o0O(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0293o0O00o0o.this.OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.OooOOO0 = ofFloat3;
        ofFloat3.addListener(new C0292o0O00o0O(this, 1));
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOoo() {
        EditText editText = this.OooO;
        if (editText != null) {
            editText.post(new RunnableC0061o00000oO(5, this));
        }
    }

    public final boolean OooOo0() {
        EditText editText = this.OooO;
        if (editText != null && ((editText.hasFocus() || this.OooO0Oo.hasFocus()) && this.OooO.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    public final void OooOo00(boolean z) {
        boolean z2;
        if (this.OooO0O0.OooO0Oo() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.OooOO0o.isRunning()) {
            this.OooOOO0.cancel();
            this.OooOO0o.start();
            if (z2) {
                this.OooOO0o.end();
            }
        } else if (!z) {
            this.OooOO0o.cancel();
            this.OooOOO0.start();
            if (z2) {
                this.OooOOO0.end();
            }
        }
    }
}


