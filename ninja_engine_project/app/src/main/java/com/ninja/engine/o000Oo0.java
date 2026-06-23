package com.ninja.engine;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class o000Oo0 extends Drawable.ConstantState {
    public C1428oo00oOO OooO00o;
    public AnimatorSet OooO0O0;
    public ArrayList OooO0OO;
    public C0145o00OO0oO OooO0Oo;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
