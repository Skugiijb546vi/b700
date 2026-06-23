package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
/* renamed from: com.ninja.engine.oOooOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1313oOooOo0 {
    public static final ThreadLocal OooO00o = new ThreadLocal();
    public static final int[] OooO0O0 = {-16842910};
    public static final int[] OooO0OO = {16842908};
    public static final int[] OooO0Oo = {16842919};
    public static final int[] OooO0o0 = {16842912};
    public static final int[] OooO0o = new int[0];
    public static final int[] OooO0oO = new int[1];

    public static void OooO00o(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1039oOOOoo0o.OooOO0);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int OooO0O0(Context context, int i) {
        ColorStateList OooO0Oo2 = OooO0Oo(context, i);
        if (OooO0Oo2 != null && OooO0Oo2.isStateful()) {
            return OooO0Oo2.getColorForState(OooO0O0, OooO0Oo2.getDefaultColor());
        }
        ThreadLocal threadLocal = OooO00o;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int OooO0OO2 = OooO0OO(context, i);
        return o0O0OO0.OooO0Oo(OooO0OO2, Math.round(Color.alpha(OooO0OO2) * f));
    }

    public static int OooO0OO(Context context, int i) {
        int[] iArr = OooO0oO;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList OooO0Oo(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = OooO0oO;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0809oO0OooOO.OooOoo(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}


