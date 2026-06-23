package com.roger.catloadinglibrary;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0110o000oo;
import com.ninja.engine.C0433o0Oo0ooo;
/* loaded from: classes.dex */
public final class GraduallyTextView extends C0110o000oo {
    public static final /* synthetic */ int OooOO0o = 0;
    public float OooO;
    public final Paint OooO0oO;
    public final ValueAnimator OooO0oo;
    public final boolean OooOO0;
    public int OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduallyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0809oO0OooOO.OooOOOo(context, "context");
        this.OooOO0 = true;
        this.OooOO0O = 2000;
        Paint paint = new Paint(1);
        this.OooO0oO = paint;
        paint.setStyle(Paint.Style.FILL);
        setBackground(null);
        setCursorVisible(false);
        setFocusable(false);
        setEnabled(false);
        setFocusableInTouchMode(false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 100.0f).setDuration(this.OooOO0O);
        this.OooO0oo = duration;
        if (duration != null) {
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimator = this.OooO0oo;
            if (valueAnimator != null) {
                valueAnimator.setRepeatCount(-1);
                ValueAnimator valueAnimator2 = this.OooO0oo;
                if (valueAnimator2 != null) {
                    valueAnimator2.setRepeatMode(1);
                    ValueAnimator valueAnimator3 = this.OooO0oo;
                    if (valueAnimator3 != null) {
                        valueAnimator3.addUpdateListener(new C0433o0Oo0ooo(2, this));
                        return;
                    } else {
                        AbstractC0809oO0OooOO.o00oO0o("valueAnimator");
                        throw null;
                    }
                }
                AbstractC0809oO0OooOO.o00oO0o("valueAnimator");
                throw null;
            }
            AbstractC0809oO0OooOO.o00oO0o("valueAnimator");
            throw null;
        }
        AbstractC0809oO0OooOO.o00oO0o("valueAnimator");
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC0809oO0OooOO.OooOOOo(canvas, "canvas");
        super.onDraw(canvas);
        if (this.OooOO0) {
            return;
        }
        Paint paint = this.OooO0oO;
        if (paint == null) {
            AbstractC0809oO0OooOO.o00oO0o("paint");
            throw null;
        }
        paint.setAlpha(255);
        float f = this.OooO;
        if (f / 0.0f >= 1.0f) {
            AbstractC0809oO0OooOO.o00oO0o("charSequence");
            throw null;
        }
        Paint paint2 = this.OooO0oO;
        if (paint2 == null) {
            AbstractC0809oO0OooOO.o00oO0o("paint");
            throw null;
        }
        paint2.setAlpha((int) (((f % 0.0f) / 0.0f) * 255));
        if (((int) (this.OooO / 0.0f)) >= 0) {
            return;
        }
        AbstractC0809oO0OooOO.o00oO0o("charSequence");
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC0809oO0OooOO.OooOOOo(view, "changedView");
        super.onVisibilityChanged(view, i);
    }

    public final void setDuration(int i) {
        this.OooOO0O = i;
    }
}
