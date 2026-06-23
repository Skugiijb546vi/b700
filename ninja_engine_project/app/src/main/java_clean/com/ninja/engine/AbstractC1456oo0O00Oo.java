package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
/* renamed from: com.ninja.engine.oo0O00Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1456oo0O00Oo {
    public static View.AccessibilityDelegate OooO00o(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void OooO0O0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }
}


