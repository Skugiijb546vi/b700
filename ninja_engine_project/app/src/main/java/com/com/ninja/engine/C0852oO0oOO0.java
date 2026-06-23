package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oO0oOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852oO0oOO0 {
    public static final boolean OooOo0;
    public static final boolean OooOo0O;
    public PorterDuff.Mode OooO;
    public final MaterialButton OooO00o;
    public C1204oOoOOOO0 OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public ColorStateList OooOO0;
    public ColorStateList OooOO0O;
    public ColorStateList OooOO0o;
    public Drawable OooOOO0;
    public boolean OooOOo0;
    public LayerDrawable OooOOoo;
    public int OooOo00;
    public boolean OooOOO = false;
    public boolean OooOOOO = false;
    public boolean OooOOOo = false;
    public boolean OooOOo = true;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        OooOo0 = true;
        if (i > 22) {
            z = false;
        }
        OooOo0O = z;
    }

    public C0852oO0oOO0(MaterialButton materialButton, C1204oOoOOOO0 c1204oOoOOOO0) {
        this.OooO00o = materialButton;
        this.OooO0O0 = c1204oOoOOOO0;
    }

    public final InterfaceC1210oOoOOo OooO00o() {
        Drawable drawable;
        LayerDrawable layerDrawable = this.OooOOoo;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.OooOOoo.getNumberOfLayers() > 2) {
                drawable = this.OooOOoo.getDrawable(2);
            } else {
                drawable = this.OooOOoo.getDrawable(1);
            }
            return (InterfaceC1210oOoOOo) drawable;
        }
        return null;
    }

    public final C0875oO0oOooo OooO0O0(boolean z) {
        LayerDrawable layerDrawable;
        LayerDrawable layerDrawable2 = this.OooOOoo;
        if (layerDrawable2 != null && layerDrawable2.getNumberOfLayers() > 0) {
            if (OooOo0) {
                layerDrawable = (LayerDrawable) ((InsetDrawable) this.OooOOoo.getDrawable(0)).getDrawable();
            } else {
                layerDrawable = this.OooOOoo;
            }
            return (C0875oO0oOooo) layerDrawable.getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    public final void OooO0OO(C1204oOoOOOO0 c1204oOoOOOO0) {
        this.OooO0O0 = c1204oOoOOOO0;
        if (OooOo0O && !this.OooOOOO) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            MaterialButton materialButton = this.OooO00o;
            int paddingStart = materialButton.getPaddingStart();
            int paddingTop = materialButton.getPaddingTop();
            int paddingEnd = materialButton.getPaddingEnd();
            int paddingBottom = materialButton.getPaddingBottom();
            OooO0o0();
            materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        if (OooO0O0(false) != null) {
            OooO0O0(false).setShapeAppearanceModel(c1204oOoOOOO0);
        }
        if (OooO0O0(true) != null) {
            OooO0O0(true).setShapeAppearanceModel(c1204oOoOOOO0);
        }
        if (OooO00o() != null) {
            OooO00o().setShapeAppearanceModel(c1204oOoOOOO0);
        }
    }

    public final void OooO0Oo(int i, int i2) {
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        MaterialButton materialButton = this.OooO00o;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.OooO0o0;
        int i4 = this.OooO0o;
        this.OooO0o = i2;
        this.OooO0o0 = i;
        if (!this.OooOOOO) {
            OooO0o0();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void OooO0o() {
        int i = 0;
        C0875oO0oOooo OooO0O0 = OooO0O0(false);
        C0875oO0oOooo OooO0O02 = OooO0O0(true);
        if (OooO0O0 != null) {
            ColorStateList colorStateList = this.OooOO0O;
            OooO0O0.OooO00o.OooOO0O = this.OooO0oo;
            OooO0O0.invalidateSelf();
            C0868oO0oOoO c0868oO0oOoO = OooO0O0.OooO00o;
            if (c0868oO0oOoO.OooO0Oo != colorStateList) {
                c0868oO0oOoO.OooO0Oo = colorStateList;
                OooO0O0.onStateChange(OooO0O0.getState());
            }
            if (OooO0O02 != null) {
                float f = this.OooO0oo;
                if (this.OooOOO) {
                    i = AbstractC0694o0ooooo0.OooOo(this.OooO00o, R.attr.colorSurface);
                }
                OooO0O02.OooO00o.OooOO0O = f;
                OooO0O02.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                C0868oO0oOoO c0868oO0oOoO2 = OooO0O02.OooO00o;
                if (c0868oO0oOoO2.OooO0Oo != valueOf) {
                    c0868oO0oOoO2.OooO0Oo = valueOf;
                    OooO0O02.onStateChange(OooO0O02.getState());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.graphics.drawable.Drawable$ConstantState, com.ninja.engine.oOOoooo0] */
    public final void OooO0o0() {
        int i;
        InsetDrawable insetDrawable;
        C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo(this.OooO0O0);
        MaterialButton materialButton = this.OooO00o;
        c0875oO0oOooo.OooOO0(materialButton.getContext());
        c0875oO0oOooo.setTintList(this.OooOO0);
        PorterDuff.Mode mode = this.OooO;
        if (mode != null) {
            c0875oO0oOooo.setTintMode(mode);
        }
        ColorStateList colorStateList = this.OooOO0O;
        c0875oO0oOooo.OooO00o.OooOO0O = this.OooO0oo;
        c0875oO0oOooo.invalidateSelf();
        C0868oO0oOoO c0868oO0oOoO = c0875oO0oOooo.OooO00o;
        if (c0868oO0oOoO.OooO0Oo != colorStateList) {
            c0868oO0oOoO.OooO0Oo = colorStateList;
            c0875oO0oOooo.onStateChange(c0875oO0oOooo.getState());
        }
        C0875oO0oOooo c0875oO0oOooo2 = new C0875oO0oOooo(this.OooO0O0);
        c0875oO0oOooo2.setTint(0);
        float f = this.OooO0oo;
        if (this.OooOOO) {
            i = AbstractC0694o0ooooo0.OooOo(materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        c0875oO0oOooo2.OooO00o.OooOO0O = f;
        c0875oO0oOooo2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C0868oO0oOoO c0868oO0oOoO2 = c0875oO0oOooo2.OooO00o;
        if (c0868oO0oOoO2.OooO0Oo != valueOf) {
            c0868oO0oOoO2.OooO0Oo = valueOf;
            c0875oO0oOooo2.onStateChange(c0875oO0oOooo2.getState());
        }
        if (OooOo0) {
            C0875oO0oOooo c0875oO0oOooo3 = new C0875oO0oOooo(this.OooO0O0);
            this.OooOOO0 = c0875oO0oOooo3;
            c0875oO0oOooo3.setTint(-1);
            ?? rippleDrawable = new RippleDrawable(AbstractC0692o0ooooOo.OoooOoO(this.OooOO0o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0875oO0oOooo2, c0875oO0oOooo}), this.OooO0OO, this.OooO0o0, this.OooO0Oo, this.OooO0o), this.OooOOO0);
            this.OooOOoo = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            C0875oO0oOooo c0875oO0oOooo4 = new C0875oO0oOooo(this.OooO0O0);
            ?? constantState = new Drawable.ConstantState();
            constantState.OooO00o = c0875oO0oOooo4;
            constantState.OooO0O0 = false;
            C1141oOOoooo c1141oOOoooo = new C1141oOOoooo(constantState);
            this.OooOOO0 = c1141oOOoooo;
            c1141oOOoooo.setTintList(AbstractC0692o0ooooOo.OoooOoO(this.OooOO0o));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c0875oO0oOooo2, c0875oO0oOooo, this.OooOOO0});
            this.OooOOoo = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.OooO0OO, this.OooO0o0, this.OooO0Oo, this.OooO0o);
        }
        materialButton.setInternalBackground(insetDrawable);
        C0875oO0oOooo OooO0O0 = OooO0O0(false);
        if (OooO0O0 != null) {
            OooO0O0.OooOO0O(this.OooOo00);
            OooO0O0.setState(materialButton.getDrawableState());
        }
    }
}
