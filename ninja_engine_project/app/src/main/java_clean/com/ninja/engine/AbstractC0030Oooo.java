package com.ninja.engine;

import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
/* renamed from: com.ninja.engine.Oooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0030Oooo {
    public static void OooO00o(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void OooO0OO(Window window, boolean z) {
        int i;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & (-257);
        } else {
            i = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z);
    }

    public static void OooO0Oo(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void OooO0o0(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}


