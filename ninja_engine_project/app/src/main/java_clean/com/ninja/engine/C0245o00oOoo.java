package com.ninja.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* renamed from: com.ninja.engine.o00oOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245o00oOoo extends SeekBar {
    public final o00O000 OooO00o;

    public C0245o00oOoo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        o00O000 o00o000 = new o00O000(this);
        this.OooO00o = o00o000;
        o00o000.Oooo00O(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00O000 o00o000 = this.OooO00o;
        Drawable drawable = o00o000.OooO0oO;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = o00o000.OooO0o;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.OooO00o.OooO0oO;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.OooO00o.OoooO0O(canvas);
    }
}


