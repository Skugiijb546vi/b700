package com.ninja.engine;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
/* renamed from: com.ninja.engine.oo00oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432oo00oOo extends Drawable.ConstantState {
    public final Drawable.ConstantState OooO00o;

    public C1432oo00oOo(Drawable.ConstantState constantState) {
        this.OooO00o = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.OooO00o.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.OooO00o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1428oo00oOO c1428oo00oOO = new C1428oo00oOO();
        c1428oo00oOO.OooO00o = (VectorDrawable) this.OooO00o.newDrawable();
        return c1428oo00oOO;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1428oo00oOO c1428oo00oOO = new C1428oo00oOO();
        c1428oo00oOO.OooO00o = (VectorDrawable) this.OooO00o.newDrawable(resources);
        return c1428oo00oOO;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1428oo00oOO c1428oo00oOO = new C1428oo00oOO();
        c1428oo00oOO.OooO00o = (VectorDrawable) this.OooO00o.newDrawable(resources, theme);
        return c1428oo00oOO;
    }
}
