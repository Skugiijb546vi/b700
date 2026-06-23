package com.ninja.engine;

import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o0Oo00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0408o0Oo00o {
    public static void OooO(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static String[] OooO00o(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int OooO0O0(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int OooO0OO(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int OooO0Oo(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int OooO0o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int OooO0o0(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int OooO0oO(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params OooO0oo(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static boolean OooOO0(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
