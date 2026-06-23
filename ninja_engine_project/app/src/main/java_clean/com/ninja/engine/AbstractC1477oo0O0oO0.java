package com.ninja.engine;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
/* renamed from: com.ninja.engine.oo0O0oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1477oo0O0oO0 {
    public static void OooO00o(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }
}


