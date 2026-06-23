package com.ninja.engine;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
/* renamed from: com.ninja.engine.oO00Oo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717oO00Oo0o extends View.AccessibilityDelegate {
    public final /* synthetic */ C0715oO00Oo OooO00o;

    public C0717oO00Oo0o(C0715oO00Oo c0715oO00Oo) {
        this.OooO00o = c0715oO00Oo;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.OooO00o.OooO0oo.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}


