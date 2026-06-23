package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
public final class o00O000 extends C0415o0Oo0O0O {
    public PorterDuff.Mode OooO;
    public final SeekBar OooO0o;
    public Drawable OooO0oO;
    public ColorStateList OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;

    public o00O000(SeekBar seekBar) {
        super(seekBar);
        this.OooO0oo = null;
        this.OooO = null;
        this.OooOO0 = false;
        this.OooOO0O = false;
        this.OooO0o = seekBar;
    }

    @Override // com.ninja.engine.C0415o0Oo0O0O
    public final void Oooo00O(AttributeSet attributeSet, int i) {
        super.Oooo00O(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.OooO0o;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC1039oOOOoo0o.OooO0oO;
        C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        AbstractC1460oo0O00oo.OooOOOO(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) Oooo0O0.OooO0O0, R.attr.seekBarStyle);
        Drawable OooOo = Oooo0O0.OooOo(0);
        if (OooOo != null) {
            seekBar.setThumb(OooOo);
        }
        Drawable OooOo0o = Oooo0O0.OooOo0o(1);
        Drawable drawable = this.OooO0oO;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.OooO0oO = OooOo0o;
        if (OooOo0o != null) {
            OooOo0o.setCallback(seekBar);
            AbstractC0809oO0OooOO.OoooooO(OooOo0o, seekBar.getLayoutDirection());
            if (OooOo0o.isStateful()) {
                OooOo0o.setState(seekBar.getDrawableState());
            }
            OoooO0();
        }
        seekBar.invalidate();
        TypedArray typedArray = (TypedArray) Oooo0O0.OooO0O0;
        if (typedArray.hasValue(3)) {
            this.OooO = AbstractC0420o0Oo0Oo.OooO0O0(typedArray.getInt(3, -1), this.OooO);
            this.OooOO0O = true;
        }
        if (typedArray.hasValue(2)) {
            this.OooO0oo = Oooo0O0.OooOo0O(2);
            this.OooOO0 = true;
        }
        Oooo0O0.Oooo0o0();
        OoooO0();
    }

    public final void OoooO0() {
        Drawable drawable = this.OooO0oO;
        if (drawable != null) {
            if (this.OooOO0 || this.OooOO0O) {
                Drawable o0ooOoO = AbstractC0809oO0OooOO.o0ooOoO(drawable.mutate());
                this.OooO0oO = o0ooOoO;
                if (this.OooOO0) {
                    o0ooOoO.setTintList(this.OooO0oo);
                }
                if (this.OooOO0O) {
                    this.OooO0oO.setTintMode(this.OooO);
                }
                if (this.OooO0oO.isStateful()) {
                    this.OooO0oO.setState(this.OooO0o.getDrawableState());
                }
            }
        }
    }

    public final void OoooO0O(Canvas canvas) {
        int i;
        if (this.OooO0oO != null) {
            SeekBar seekBar = this.OooO0o;
            int max = seekBar.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.OooO0oO.getIntrinsicWidth();
                int intrinsicHeight = this.OooO0oO.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.OooO0oO.setBounds(-i, -i2, i, i2);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.OooO0oO.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
