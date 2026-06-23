package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o00o000O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0192o00o000O extends FrameLayout {
    public static final View$OnTouchListenerC0190o00o000 OooO = new View();
    public final C1204oOoOOOO0 OooO00o;
    public int OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public ColorStateList OooO0oO;
    public PorterDuff.Mode OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0192o00o000O(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Drawable o0ooOoO;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooOooO);
        if (obtainStyledAttributes.hasValue(6)) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            AbstractC1452oo0O000o.OooOO0o(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.OooO0O0 = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.OooO00o = C1204oOoOOOO0.OooO0O0(context2, attributeSet, 0, 0).OooO00o();
        }
        this.OooO0OO = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0809oO0OooOO.OooOooO(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC1091oOOoOOOO.OooOoo0(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.OooO0Oo = obtainStyledAttributes.getFloat(1, 1.0f);
        this.OooO0o0 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.OooO0o = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(OooO);
        setFocusable(true);
        if (getBackground() == null) {
            int Oooo000 = AbstractC0694o0ooooo0.Oooo000(AbstractC0694o0ooooo0.OooOo(this, R.attr.colorSurface), AbstractC0694o0ooooo0.OooOo(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C1204oOoOOOO0 c1204oOoOOOO0 = this.OooO00o;
            if (c1204oOoOOOO0 != null) {
                int i = AbstractC0193o00o000o.OooO00o;
                C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo(c1204oOoOOOO0);
                c0875oO0oOooo.OooOO0o(ColorStateList.valueOf(Oooo000));
                gradientDrawable = c0875oO0oOooo;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC0193o00o000o.OooO00o;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(Oooo000);
                gradientDrawable = gradientDrawable2;
            }
            if (this.OooO0oO != null) {
                o0ooOoO = AbstractC0809oO0OooOO.o0ooOoO(gradientDrawable);
                o0ooOoO.setTintList(this.OooO0oO);
            } else {
                o0ooOoO = AbstractC0809oO0OooOO.o0ooOoO(gradientDrawable);
            }
            WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
            setBackground(o0ooOoO);
        }
    }

    public float getActionTextColorAlpha() {
        return this.OooO0Oo;
    }

    public int getAnimationMode() {
        return this.OooO0O0;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.OooO0OO;
    }

    public int getMaxInlineActionWidth() {
        return this.OooO0o;
    }

    public int getMaxWidth() {
        return this.OooO0o0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        AbstractC1449oo0O000.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.OooO0o0;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.OooO0O0 = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.OooO0oO != null) {
            drawable = AbstractC0809oO0OooOO.o0ooOoO(drawable.mutate());
            drawable.setTintList(this.OooO0oO);
            drawable.setTintMode(this.OooO0oo);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.OooO0oO = colorStateList;
        if (getBackground() != null) {
            Drawable o0ooOoO = AbstractC0809oO0OooOO.o0ooOoO(getBackground().mutate());
            o0ooOoO.setTintList(colorStateList);
            o0ooOoO.setTintMode(this.OooO0oo);
            if (o0ooOoO != getBackground()) {
                super.setBackgroundDrawable(o0ooOoO);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.OooO0oo = mode;
        if (getBackground() != null) {
            Drawable o0ooOoO = AbstractC0809oO0OooOO.o0ooOoO(getBackground().mutate());
            o0ooOoO.setTintMode(mode);
            if (o0ooOoO != getBackground()) {
                super.setBackgroundDrawable(o0ooOoO);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View$OnTouchListenerC0190o00o000 view$OnTouchListenerC0190o00o000;
        if (onClickListener != null) {
            view$OnTouchListenerC0190o00o000 = null;
        } else {
            view$OnTouchListenerC0190o00o000 = OooO;
        }
        setOnTouchListener(view$OnTouchListenerC0190o00o000);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0193o00o000o abstractC0193o00o000o) {
    }
}


