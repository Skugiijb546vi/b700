package com.ninja.engine;

import android.view.View;
import android.view.WindowInsets;
/* renamed from: com.ninja.engine.oo0O000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1449oo0O000 {
    public static WindowInsets OooO00o(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets OooO0O0(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void OooO0OO(View view) {
        view.requestApplyInsets();
    }
}
