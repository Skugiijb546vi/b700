package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.oOo0000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146oOo0000 extends Drawable {
    public PorterDuffColorFilter OooO;
    public float OooO00o;
    public final Paint OooO0O0;
    public final RectF OooO0OO;
    public final Rect OooO0Oo;
    public float OooO0o0;
    public ColorStateList OooO0oo;
    public ColorStateList OooOO0;
    public boolean OooO0o = false;
    public boolean OooO0oO = true;
    public PorterDuff.Mode OooOO0O = PorterDuff.Mode.SRC_IN;

    public C1146oOo0000(ColorStateList colorStateList, float f) {
        this.OooO00o = f;
        Paint paint = new Paint(5);
        this.OooO0O0 = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.OooO0oo = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.OooO0oo.getDefaultColor()));
        this.OooO0OO = new RectF();
        this.OooO0Oo = new Rect();
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void OooO0O0(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.OooO0OO;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.OooO0Oo;
        rect2.set(rect);
        if (this.OooO0o) {
            rect2.inset((int) Math.ceil(AbstractC1145oOo000.OooO00o(this.OooO0o0, this.OooO00o, this.OooO0oO)), (int) Math.ceil(AbstractC1145oOo000.OooO0O0(this.OooO0o0, this.OooO00o, this.OooO0oO)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.OooO0O0;
        if (this.OooO != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.OooO);
            z = true;
        } else {
            z = false;
        }
        RectF rectF = this.OooO0OO;
        float f = this.OooO00o;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.OooO0Oo, this.OooO00o);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.OooOO0;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.OooO0oo) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooO0O0(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.OooO0oo;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.OooO0O0;
        if (colorForState != paint.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.OooOO0;
        if (colorStateList2 != null && (mode = this.OooOO0O) != null) {
            this.OooO = OooO00o(colorStateList2, mode);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.OooO0O0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.OooO0O0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.OooOO0 = colorStateList;
        this.OooO = OooO00o(colorStateList, this.OooOO0O);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.OooOO0O = mode;
        this.OooO = OooO00o(this.OooOO0, mode);
        invalidateSelf();
    }
}
