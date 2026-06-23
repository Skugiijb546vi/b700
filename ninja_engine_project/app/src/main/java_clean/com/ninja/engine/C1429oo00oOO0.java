package com.ninja.engine;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.oo00oOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429oo00oOO0 extends Drawable.ConstantState {
    public int OooO;
    public int OooO00o;
    public C1433oo00oOoO OooO0O0;
    public ColorStateList OooO0OO;
    public PorterDuff.Mode OooO0Oo;
    public Bitmap OooO0o;
    public boolean OooO0o0;
    public ColorStateList OooO0oO;
    public PorterDuff.Mode OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public Paint OooOO0o;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.OooO00o;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1428oo00oOO(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1428oo00oOO(this);
    }
}


