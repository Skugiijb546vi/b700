package com.roger.catloadinglibrary;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.android.volley.toolbox.ImageRequest;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0433o0Oo0ooo;
/* loaded from: classes.dex */
public final class EyelidView extends View {
    public static final /* synthetic */ int OooO0oO = 0;
    public final ValueAnimator OooO00o;
    public final Paint OooO0O0;
    public float OooO0OO;
    public final boolean OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0;

    public EyelidView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0Oo = true;
        this.OooO0o0 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        Paint paint = new Paint(1);
        this.OooO0O0 = paint;
        paint.setColor(-16777216);
        Paint paint2 = this.OooO0O0;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
            setBackground(null);
            setFocusable(false);
            setEnabled(false);
            setFocusableInTouchMode(false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.OooO0o0);
            this.OooO00o = duration;
            if (duration != null) {
                duration.setInterpolator(new AccelerateDecelerateInterpolator());
                ValueAnimator valueAnimator = this.OooO00o;
                if (valueAnimator != null) {
                    valueAnimator.setRepeatCount(-1);
                    ValueAnimator valueAnimator2 = this.OooO00o;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setRepeatMode(2);
                        ValueAnimator valueAnimator3 = this.OooO00o;
                        if (valueAnimator3 != null) {
                            valueAnimator3.addUpdateListener(new C0433o0Oo0ooo(1, this));
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
        AbstractC0809oO0OooOO.o00oO0o("paint");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC0809oO0OooOO.OooOOOo(canvas, "canvas");
        super.onDraw(canvas);
        if (this.OooO0Oo) {
            return;
        }
        float height = (!this.OooO0o ? this.OooO0OO : 1.0f - this.OooO0OO) * getHeight();
        if (height >= getHeight() / 2) {
            height = getHeight() / 2;
        }
        float f = height;
        float width = getWidth();
        Paint paint = this.OooO0O0;
        if (paint != null) {
            canvas.drawRect(0.0f, 0.0f, width, f, paint);
        } else {
            AbstractC0809oO0OooOO.o00oO0o("paint");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC0809oO0OooOO.OooOOOo(view, "changedView");
        super.onVisibilityChanged(view, i);
    }

    public final void setColor(int i) {
        Paint paint = this.OooO0O0;
        if (paint != null) {
            paint.setColor(i);
        } else {
            AbstractC0809oO0OooOO.o00oO0o("paint");
            throw null;
        }
    }

    public final void setDuration(int i) {
        this.OooO0o0 = i;
    }

    public final void setFromFull(boolean z) {
        this.OooO0o = z;
    }
}


