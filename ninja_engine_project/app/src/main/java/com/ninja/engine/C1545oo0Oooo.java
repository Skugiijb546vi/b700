package com.ninja.engine;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.oo0Oooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545oo0Oooo extends Drawable.ConstantState {
    public int OooO00o;
    public Drawable.ConstantState OooO0O0;
    public ColorStateList OooO0OO;
    public PorterDuff.Mode OooO0Oo;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i;
        int i2 = this.OooO00o;
        Drawable.ConstantState constantState = this.OooO0O0;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, com.ninja.engine.oo0Oooo0] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        Drawable drawable = new Drawable();
        drawable.OooO0Oo = this;
        Drawable.ConstantState constantState = this.OooO0O0;
        if (constantState != null) {
            drawable.OooO0oO(constantState.newDrawable(resources));
        }
        if (C1546oo0Oooo0.OooO0oo == null) {
            try {
                C1546oo0Oooo0.OooO0oo = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
        return drawable;
    }
}

