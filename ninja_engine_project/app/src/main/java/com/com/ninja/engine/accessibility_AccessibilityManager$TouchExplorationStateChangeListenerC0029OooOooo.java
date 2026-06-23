package com.ninja.engine;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.OooOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0029OooOooo implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C0435o0OoO000 OooO00o;

    public accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0029OooOooo(C0435o0OoO000 c0435o0OoO000) {
        this.OooO00o = c0435o0OoO000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0029OooOooo)) {
            return false;
        }
        return this.OooO00o.equals(((accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0029OooOooo) obj).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i;
        C0434o0OoO0 c0434o0OoO0 = (C0434o0OoO0) this.OooO00o.OooO0O0;
        AutoCompleteTextView autoCompleteTextView = c0434o0OoO0.OooO0oo;
        if (autoCompleteTextView != null && !AbstractC0694o0ooooo0.OooOooO(autoCompleteTextView)) {
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            c0434o0OoO0.OooO0Oo.setImportantForAccessibility(i);
        }
    }
}
