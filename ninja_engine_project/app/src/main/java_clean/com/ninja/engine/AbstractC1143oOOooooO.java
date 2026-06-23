package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
/* renamed from: com.ninja.engine.oOOooooO */
/* loaded from: classes.dex */
public abstract class AbstractC1143oOOooooO {
    public static Drawable OooO0O0(Context context, int i) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i, i, i, i);
        ColorStateList valueOf = ColorStateList.valueOf(0);
        TypedValue OoooOOO = AbstractC0692o0ooooOo.OoooOOO(context, R.attr.colorControlHighlight);
        if (OoooOOO != null) {
            int i2 = OoooOOO.resourceId;
            if (i2 != 0) {
                colorStateList = AbstractC0809oO0OooOO.OooOoo(context, i2);
            } else {
                colorStateList = ColorStateList.valueOf(OoooOOO.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            valueOf = colorStateList;
        }
        return new RippleDrawable(valueOf, null, insetDrawable);
    }
}


