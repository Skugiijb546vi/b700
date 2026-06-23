package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.oOOoooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141oOOoooo extends Drawable implements InterfaceC1210oOoOOo, InterfaceC1317oOooOoo {
    public C1142oOOoooo0 OooO00o;

    public C1141oOOoooo(C1142oOOoooo0 c1142oOOoooo0) {
        this.OooO00o = c1142oOOoooo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C1142oOOoooo0 c1142oOOoooo0 = this.OooO00o;
        if (c1142oOOoooo0.OooO0O0) {
            c1142oOOoooo0.OooO00o.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.OooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.OooO00o.OooO00o.getClass();
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.OooO00o = new C1142oOOoooo0(this.OooO00o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.OooO00o.OooO00o.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.OooO00o.OooO00o.setState(iArr)) {
            onStateChange = true;
        }
        boolean OooooO0 = AbstractC0692o0ooooOo.OooooO0(iArr);
        C1142oOOoooo0 c1142oOOoooo0 = this.OooO00o;
        if (c1142oOOoooo0.OooO0O0 != OooooO0) {
            c1142oOOoooo0.OooO0O0 = OooooO0;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.OooO00o.OooO00o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.OooO00o.OooO00o.setColorFilter(colorFilter);
    }

    @Override // com.ninja.engine.InterfaceC1210oOoOOo
    public final void setShapeAppearanceModel(C1204oOoOOOO0 c1204oOoOOOO0) {
        this.OooO00o.OooO00o.setShapeAppearanceModel(c1204oOoOOOO0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.OooO00o.OooO00o.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.OooO00o.OooO00o.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.OooO00o.OooO00o.setTintMode(mode);
    }
}


