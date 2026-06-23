package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
/* renamed from: com.ninja.engine.oOooO0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299oOooO0oO {
    public final float OooO;
    public final ColorStateList OooO00o;
    public final String OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final float OooO0o;
    public final float OooO0o0;
    public final float OooO0oO;
    public final boolean OooO0oo;
    public ColorStateList OooOO0;
    public float OooOO0O;
    public final int OooOO0o;
    public Typeface OooOOO;
    public boolean OooOOO0 = false;

    public C1299oOooO0oO(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1038oOOOoo0O.OooOooo);
        this.OooOO0O = obtainStyledAttributes.getDimension(0, 0.0f);
        this.OooOO0 = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 3);
        AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 4);
        AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 5);
        this.OooO0OO = obtainStyledAttributes.getInt(2, 0);
        this.OooO0Oo = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.OooOO0o = obtainStyledAttributes.getResourceId(i2, 0);
        this.OooO0O0 = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.OooO00o = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 6);
        this.OooO0o0 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.OooO0o = obtainStyledAttributes.getFloat(8, 0.0f);
        this.OooO0oO = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC1038oOOOoo0O.OooOo0);
        this.OooO0oo = obtainStyledAttributes2.hasValue(0);
        this.OooO = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void OooO00o() {
        Typeface typeface;
        String str;
        Typeface typeface2 = this.OooOOO;
        int i = this.OooO0OO;
        if (typeface2 == null && (str = this.OooO0O0) != null) {
            this.OooOOO = Typeface.create(str, i);
        }
        if (this.OooOOO == null) {
            int i2 = this.OooO0Oo;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        typeface = Typeface.DEFAULT;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            this.OooOOO = typeface;
            this.OooOOO = Typeface.create(this.OooOOO, i);
        }
    }

    public final Typeface OooO0O0(Context context) {
        if (this.OooOOO0) {
            return this.OooOOO;
        }
        if (!context.isRestricted()) {
            try {
                Typeface OooO0O0 = AbstractC1139oOOoooOO.OooO0O0(context, this.OooOO0o);
                this.OooOOO = OooO0O0;
                if (OooO0O0 != null) {
                    this.OooOOO = Typeface.create(OooO0O0, this.OooO0OO);
                }
            } catch (Exception unused) {
            }
        }
        OooO00o();
        this.OooOOO0 = true;
        return this.OooOOO;
    }

    public final void OooO0OO(Context context, AbstractC1091oOOoOOOO abstractC1091oOOoOOOO) {
        if (OooO0Oo(context)) {
            OooO0O0(context);
        } else {
            OooO00o();
        }
        int i = this.OooOO0o;
        if (i == 0) {
            this.OooOOO0 = true;
        }
        if (this.OooOOO0) {
            abstractC1091oOOoOOOO.OooOoOO(this.OooOOO, true);
            return;
        }
        try {
            C1298oOooO0o0 c1298oOooO0o0 = new C1298oOooO0o0(this, abstractC1091oOOoOOOO);
            ThreadLocal threadLocal = AbstractC1139oOOoooOO.OooO00o;
            if (context.isRestricted()) {
                c1298oOooO0o0.OooO00o(-4);
            } else {
                AbstractC1139oOOoooOO.OooO0OO(context, i, new TypedValue(), 0, c1298oOooO0o0, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.OooOOO0 = true;
            abstractC1091oOOoOOOO.OooOoO(1);
        } catch (Exception unused2) {
            this.OooOOO0 = true;
            abstractC1091oOOoOOOO.OooOoO(-3);
        }
    }

    public final boolean OooO0Oo(Context context) {
        Typeface typeface = null;
        int i = this.OooOO0o;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC1139oOOoooOO.OooO00o;
            if (!context.isRestricted()) {
                typeface = AbstractC1139oOOoooOO.OooO0OO(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void OooO0o(Context context, TextPaint textPaint, AbstractC1091oOOoOOOO abstractC1091oOOoOOOO) {
        if (OooO0Oo(context)) {
            OooO0oO(context, textPaint, OooO0O0(context));
            return;
        }
        OooO00o();
        OooO0oO(context, textPaint, this.OooOOO);
        OooO0OO(context, new C1297oOooO0o(this, context, textPaint, abstractC1091oOOoOOOO));
    }

    public final void OooO0o0(Context context, TextPaint textPaint, AbstractC1091oOOoOOOO abstractC1091oOOoOOOO) {
        int i;
        int i2;
        OooO0o(context, textPaint, abstractC1091oOOoOOOO);
        ColorStateList colorStateList = this.OooOO0;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        ColorStateList colorStateList2 = this.OooO00o;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(this.OooO0oO, this.OooO0o0, this.OooO0o, i2);
    }

    public final void OooO0oO(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface OooO0oo = AbstractC1137oOOoooO.OooO0oo(context.getResources().getConfiguration(), typeface);
        if (OooO0oo != null) {
            typeface = OooO0oo;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.OooO0OO;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.OooOO0O);
        if (this.OooO0oo) {
            textPaint.setLetterSpacing(this.OooO);
        }
    }
}



