package com.ninja.engine;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOOoO0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084oOOoO0oO extends C0028OooOooO {
    public final C1085oOOoO0oo OooO0Oo;
    public final WeakHashMap OooO0o0 = new WeakHashMap();

    public C1084oOOoO0oO(C1085oOOoO0oo c1085oOOoO0oo) {
        this.OooO0Oo = c1085oOOoO0oo;
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO(View view, AccessibilityEvent accessibilityEvent) {
        C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(view);
        if (c0028OooOooO != null) {
            c0028OooOooO.OooO(view, accessibilityEvent);
        } else {
            super.OooO(view, accessibilityEvent);
        }
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final boolean OooO00o(View view, AccessibilityEvent accessibilityEvent) {
        C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(view);
        if (c0028OooOooO != null) {
            return c0028OooOooO.OooO00o(view, accessibilityEvent);
        }
        return this.OooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final C0044OoooOOO OooO0O0(View view) {
        C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(view);
        if (c0028OooOooO != null) {
            return c0028OooOooO.OooO0O0(view);
        }
        return super.OooO0O0(view);
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(view);
        if (c0028OooOooO != null) {
            c0028OooOooO.OooO0OO(view, accessibilityEvent);
        } else {
            super.OooO0OO(view, accessibilityEvent);
        }
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0Oo(View view, C0039OoooO c0039OoooO) {
        C1085oOOoO0oo c1085oOOoO0oo = this.OooO0Oo;
        boolean Oooo0OO = c1085oOOoO0oo.OooO0Oo.Oooo0OO();
        View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
        if (!Oooo0OO) {
            RecyclerView recyclerView = c1085oOOoO0oo.OooO0Oo;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().OoooOO0(view, c0039OoooO);
                C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(view);
                if (c0028OooOooO != null) {
                    c0028OooOooO.OooO0Oo(view, c0039OoooO);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final boolean OooO0o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(viewGroup);
        if (c0028OooOooO != null) {
            return c0028OooOooO.OooO0o(viewGroup, view, accessibilityEvent);
        }
        return this.OooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0o0(View view, AccessibilityEvent accessibilityEvent) {
        C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(view);
        if (c0028OooOooO != null) {
            c0028OooOooO.OooO0o0(view, accessibilityEvent);
        } else {
            super.OooO0o0(view, accessibilityEvent);
        }
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        C1085oOOoO0oo c1085oOOoO0oo = this.OooO0Oo;
        if (!c1085oOOoO0oo.OooO0Oo.Oooo0OO()) {
            RecyclerView recyclerView = c1085oOOoO0oo.OooO0Oo;
            if (recyclerView.getLayoutManager() != null) {
                C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(view);
                if (c0028OooOooO != null) {
                    if (c0028OooOooO.OooO0oO(view, i, bundle)) {
                        return true;
                    }
                } else if (super.OooO0oO(view, i, bundle)) {
                    return true;
                }
                C1070oOOo0o c1070oOOo0o = recyclerView.getLayoutManager().OooO0O0.OooO0O0;
                return false;
            }
        }
        return super.OooO0oO(view, i, bundle);
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0oo(View view, int i) {
        C0028OooOooO c0028OooOooO = (C0028OooOooO) this.OooO0o0.get(view);
        if (c0028OooOooO != null) {
            c0028OooOooO.OooO0oo(view, i);
        } else {
            super.OooO0oo(view, i);
        }
    }
}
