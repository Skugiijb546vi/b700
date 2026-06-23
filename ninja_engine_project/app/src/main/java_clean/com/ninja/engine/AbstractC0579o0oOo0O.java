package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
/* renamed from: com.ninja.engine.o0oOo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0579o0oOo0O extends AbstractC1159oOo00OOO {
    public Drawable OooOOOo;
    public final Rect OooOOo;
    public final Rect OooOOo0;
    public int OooOOoo;
    public boolean OooOo0;
    public final boolean OooOo00;

    public AbstractC0579o0oOo0O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooOOo0 = new Rect();
        this.OooOOo = new Rect();
        this.OooOOoo = 119;
        this.OooOo00 = true;
        this.OooOo0 = false;
        int[] iArr = AbstractC1038oOOOoo0O.OooOO0O;
        AbstractC0692o0ooooOo.OooOO0(context, attributeSet, 0, 0);
        AbstractC0692o0ooooOo.OooOO0O(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.OooOOoo = obtainStyledAttributes.getInt(1, this.OooOOoo);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.OooOo00 = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.OooOOOo;
        if (drawable != null) {
            if (this.OooOo0) {
                this.OooOo0 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.OooOo00;
                Rect rect = this.OooOOo0;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.OooOOoo;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.OooOOo;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.OooOOOo;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.OooOOOo;
        if (drawable != null && drawable.isStateful()) {
            this.OooOOOo.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.OooOOOo;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.OooOOoo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.OooOOOo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // com.ninja.engine.AbstractC1159oOo00OOO, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.OooOo0 = z | this.OooOo0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.OooOo0 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.OooOOOo;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.OooOOOo);
            }
            this.OooOOOo = drawable;
            this.OooOo0 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.OooOOoo == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.OooOOoo != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.OooOOoo = i;
            if (i == 119 && this.OooOOOo != null) {
                this.OooOOOo.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.OooOOOo) {
            return false;
        }
        return true;
    }
}


