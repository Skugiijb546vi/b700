package com.ninja.engine;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.OooOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026OooOoo extends View.AccessibilityDelegate {
    public final C0028OooOooO OooO00o;

    public C0026OooOoo(C0028OooOooO c0028OooOooO) {
        this.OooO00o = c0028OooOooO;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.OooO00o(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0044OoooOOO OooO0O0 = this.OooO00o.OooO0O0(view);
        if (OooO0O0 != null) {
            return (AccessibilityNodeProvider) OooO0O0.OooO00o;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.OooO0OO(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z;
        Object tag2;
        boolean z2;
        Object tag3;
        ClickableSpan[] clickableSpanArr;
        int i;
        int i2 = 1;
        C0039OoooO c0039OoooO = new C0039OoooO(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(AbstractC1455oo0O00OO.OooO0OO(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            c0039OoooO.OooO0oo(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(AbstractC1455oo0O00OO.OooO0O0(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        if (bool2 != null && bool2.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            c0039OoooO.OooO0oo(2, z2);
        }
        CharSequence OooO0Oo = AbstractC1460oo0O00oo.OooO0Oo(view);
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(OooO0Oo);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", OooO0Oo);
        }
        if (i3 >= 30) {
            tag3 = AbstractC1458oo0O00o0.OooO00o(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i3 >= 30) {
            AbstractC0030Oooo.OooO0o0(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.OooO00o.OooO0Oo(view, c0039OoooO);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int i6 = 0; i6 < clickableSpanArr.length; i6++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i6];
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                i = sparseArray2.keyAt(i7);
                                break;
                            }
                            i7 += i2;
                        } else {
                            i = C0039OoooO.OooO0Oo;
                            C0039OoooO.OooO0Oo = i + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i6]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                    Spanned spanned = (Spanned) text;
                    c0039OoooO.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c0039OoooO.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c0039OoooO.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c0039OoooO.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    i2 = 1;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            c0039OoooO.OooO0O0((C0038Oooo0oo) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.OooO0o0(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.OooO0o(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.OooO00o.OooO0oO(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.OooO00o.OooO0oo(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.OooO(view, accessibilityEvent);
    }
}
