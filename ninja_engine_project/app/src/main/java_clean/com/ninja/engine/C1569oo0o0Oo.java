package com.ninja.engine;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.oo0o0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569oo0o0Oo extends C0119o000ooo0 implements o000000O {
    public final /* synthetic */ o000000 OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569oo0o0Oo(o000000 o000000Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.OooO0Oo = o000000Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1137oOOoooO.OooOOOO(this, getContentDescription());
        setOnTouchListener(new C0660o0ooOOo(this, this));
    }

    @Override // com.ninja.engine.o000000O
    public final boolean OooO00o() {
        return false;
    }

    @Override // com.ninja.engine.o000000O
    public final boolean OooO0OO() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.OooO0Oo.OooOOOO();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}


