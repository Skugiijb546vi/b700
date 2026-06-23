package com.ninja.engine;

import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.oOOoooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142oOOoooo0 extends Drawable.ConstantState {
    public C0875oO0oOooo OooO00o;
    public boolean OooO0O0;

    public C1142oOOoooo0(C1142oOOoooo0 c1142oOOoooo0) {
        this.OooO00o = (C0875oO0oOooo) c1142oOOoooo0.OooO00o.OooO00o.newDrawable();
        this.OooO0O0 = c1142oOOoooo0.OooO0O0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1141oOOoooo(new C1142oOOoooo0(this));
    }
}
