package com.ninja.engine;

import android.view.View;
/* renamed from: com.ninja.engine.oo0O00OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1455oo0O00OO {
    public static CharSequence OooO00o(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean OooO0O0(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean OooO0OO(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void OooO0Oo(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void OooO0o(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static void OooO0o0(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}


