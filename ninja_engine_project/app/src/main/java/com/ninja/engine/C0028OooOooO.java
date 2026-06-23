package com.ninja.engine;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* renamed from: com.ninja.engine.OooOooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0028OooOooO {
    public static final View.AccessibilityDelegate OooO0OO = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate OooO00o;
    public final C0026OooOoo OooO0O0;

    public C0028OooOooO() {
        this(OooO0OO);
    }

    public void OooO(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean OooO00o(View view, AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C0044OoooOOO OooO0O0(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.OooO00o.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0044OoooOOO(accessibilityNodeProvider);
        }
        return null;
    }

    public void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void OooO0Oo(View view, C0039OoooO c0039OoooO) {
        this.OooO00o.onInitializeAccessibilityNodeInfo(view, c0039OoooO.OooO00o);
    }

    public boolean OooO0o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void OooO0o0(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean OooO0oO(View view, int i, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i2 >= list.size()) {
                break;
            }
            C0038Oooo0oo c0038Oooo0oo = (C0038Oooo0oo) list.get(i2);
            if (c0038Oooo0oo.OooO00o() == i) {
                InterfaceC0052OooooOO interfaceC0052OooooOO = c0038Oooo0oo.OooO0Oo;
                if (interfaceC0052OooooOO != null) {
                    Class cls = c0038Oooo0oo.OooO0OO;
                    if (cls != null) {
                        try {
                            AbstractC1230oOoOo0o.OooOO0O(cls.getDeclaredConstructor(null).newInstance(null));
                            throw null;
                        } catch (Exception unused) {
                            z = interfaceC0052OooooOO.OooO0O0(view);
                        }
                    }
                    z = interfaceC0052OooooOO.OooO0O0(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = this.OooO00o.performAccessibilityAction(view, i, bundle);
        }
        if (!z && i == R.id.accessibility_action_clickable_span && bundle != null) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i4 = 0;
                while (true) {
                    if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i4])) {
                        clickableSpan.onClick(view);
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            return z2;
        }
        return z;
    }

    public void OooO0oo(View view, int i) {
        this.OooO00o.sendAccessibilityEvent(view, i);
    }

    public C0028OooOooO(View.AccessibilityDelegate accessibilityDelegate) {
        this.OooO00o = accessibilityDelegate;
        this.OooO0O0 = new C0026OooOoo(this);
    }
}
