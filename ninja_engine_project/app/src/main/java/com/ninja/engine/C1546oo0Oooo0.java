package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oo0Oooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546oo0Oooo0 extends Drawable implements Drawable.Callback, InterfaceC1544oo0OooOo, InterfaceC1317oOooOoo {
    public static final PorterDuff.Mode OooO0oO = PorterDuff.Mode.SRC_IN;
    public static Method OooO0oo;
    public int OooO00o;
    public PorterDuff.Mode OooO0O0;
    public boolean OooO0OO;
    public C1545oo0Oooo OooO0Oo;
    public Drawable OooO0o;
    public boolean OooO0o0;

    public final boolean OooO00o() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.OooO0o;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, com.ninja.engine.oo0Oooo] */
    public final C1545oo0Oooo OooO0O0() {
        C1545oo0Oooo c1545oo0Oooo = this.OooO0Oo;
        Object constantState = new Drawable.ConstantState();
        constantState.OooO0OO = null;
        constantState.OooO0Oo = OooO0oO;
        if (c1545oo0Oooo != null) {
            constantState.OooO00o = c1545oo0Oooo.OooO00o;
            constantState.OooO0O0 = c1545oo0Oooo.OooO0O0;
            constantState.OooO0OO = c1545oo0Oooo.OooO0OO;
            constantState.OooO0Oo = c1545oo0Oooo.OooO0Oo;
        }
        return constantState;
    }

    public final boolean OooO0OO(int[] iArr) {
        boolean state = this.OooO0o.setState(iArr);
        if (!OooO0oo(iArr) && !state) {
            return false;
        }
        return true;
    }

    public final void OooO0Oo(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void OooO0o(PorterDuff.Mode mode) {
        this.OooO0Oo.OooO0Oo = mode;
        OooO0oo(this.OooO0o.getState());
    }

    public final void OooO0o0(ColorStateList colorStateList) {
        this.OooO0Oo.OooO0OO = colorStateList;
        OooO0oo(this.OooO0o.getState());
    }

    public final void OooO0oO(Drawable drawable) {
        Drawable drawable2 = this.OooO0o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.OooO0o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1545oo0Oooo c1545oo0Oooo = this.OooO0Oo;
            if (c1545oo0Oooo != null) {
                c1545oo0Oooo.OooO0O0 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean OooO0oo(int[] iArr) {
        if (!OooO00o()) {
            return false;
        }
        C1545oo0Oooo c1545oo0Oooo = this.OooO0Oo;
        ColorStateList colorStateList = c1545oo0Oooo.OooO0OO;
        PorterDuff.Mode mode = c1545oo0Oooo.OooO0Oo;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.OooO0OO || colorForState != this.OooO00o || mode != this.OooO0O0) {
                setColorFilter(colorForState, mode);
                this.OooO00o = colorForState;
                this.OooO0O0 = mode;
                this.OooO0OO = true;
                return true;
            }
        } else {
            this.OooO0OO = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.OooO0o.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C1545oo0Oooo c1545oo0Oooo = this.OooO0Oo;
        if (c1545oo0Oooo != null) {
            i = c1545oo0Oooo.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.OooO0o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C1545oo0Oooo c1545oo0Oooo = this.OooO0Oo;
        if (c1545oo0Oooo != null && c1545oo0Oooo.OooO0O0 != null) {
            c1545oo0Oooo.OooO00o = getChangingConfigurations();
            return this.OooO0Oo;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.OooO0o.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.OooO0o.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.OooO0o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.OooO0o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return AbstractC0809oO0OooOO.Oooo00o(this.OooO0o);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.OooO0o.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.OooO0o.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.OooO0o.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.OooO0o.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.OooO0o.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.OooO0o.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.OooO0o.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.OooO0o.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.OooO0o;
        if (drawable != null && (method = OooO0oo) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        C1545oo0Oooo c1545oo0Oooo;
        if (OooO00o() && (c1545oo0Oooo = this.OooO0Oo) != null) {
            colorStateList = c1545oo0Oooo.OooO0OO;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.OooO0o.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.OooO0o.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.OooO0o0 && super.mutate() == this) {
            this.OooO0Oo = OooO0O0();
            Drawable drawable = this.OooO0o;
            if (drawable != null) {
                drawable.mutate();
            }
            C1545oo0Oooo c1545oo0Oooo = this.OooO0Oo;
            if (c1545oo0Oooo != null) {
                Drawable drawable2 = this.OooO0o;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                c1545oo0Oooo.OooO0O0 = constantState;
            }
            this.OooO0o0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.OooO0o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return AbstractC0809oO0OooOO.OoooooO(this.OooO0o, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.OooO0o.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.OooO0o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.OooO0o.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.OooO0o.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.OooO0o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.OooO0o.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.OooO0o.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.OooO0o.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.OooO0o.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (OooO0OO(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (OooO00o()) {
            OooO0Oo(i);
        } else {
            this.OooO0o.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (OooO00o()) {
            OooO0o0(colorStateList);
        } else {
            this.OooO0o.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (OooO00o()) {
            OooO0o(mode);
        } else {
            this.OooO0o.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2) && !this.OooO0o.setVisible(z, z2)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

