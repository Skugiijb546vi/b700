package com.ninja.engine;

import android.content.res.ColorStateList;
/* renamed from: com.ninja.engine.oO0oOoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0869oO0oOoO0 extends o00 {
    public C0869oO0oOoO0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
    public static final int[][] OooO0oO = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public boolean OooO0o;
    public ColorStateList OooO0o0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.OooO0o0 == null) {
            int OooOo = AbstractC0694o0ooooo0.OooOo(this, R.attr.colorControlActivated);
            int OooOo2 = AbstractC0694o0ooooo0.OooOo(this, R.attr.colorOnSurface);
            int OooOo3 = AbstractC0694o0ooooo0.OooOo(this, R.attr.colorSurface);
            this.OooO0o0 = new ColorStateList(OooO0oO, new int[]{AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo, 1.0f), AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo2, 0.54f), AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo2, 0.38f), AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo2, 0.38f)});
        }
        return this.OooO0o0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.OooO0o && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.OooO0o = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        setButtonTintList(colorStateList);
    }
}


