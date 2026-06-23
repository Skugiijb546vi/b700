package com.ninja.engine;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* renamed from: com.ninja.engine.OoooOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0043OoooOO0 extends AccessibilityNodeProvider {
    public final C0044OoooOOO OooO00o;

    public C0043OoooOO0(C0044OoooOOO c0044OoooOOO) {
        this.OooO00o = c0044OoooOOO;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0039OoooO OooO00o = this.OooO00o.OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.OooO00o;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.OooO00o.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0039OoooO OooO0O0 = this.OooO00o.OooO0O0(i);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0.OooO00o;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.OooO00o.OooO0Oo(i, i2, bundle);
    }
}
