package com.ninja.engine;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
/* loaded from: classes.dex */
public final class o00O0000 extends RatingBar {
    public final C0415o0Oo0O0O OooO00o;

    public o00O0000(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        C0415o0Oo0O0O c0415o0Oo0O0O = new C0415o0Oo0O0O(this);
        this.OooO00o = c0415o0Oo0O0O;
        c0415o0Oo0O0O.Oooo00O(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.OooO00o.OooO0OO;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}


