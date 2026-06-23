package com.ninja.engine;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.app.framework.core.system.JarConfig;
import com.app.framework.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.ninja.engine.OoooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039OoooO {
    public static int OooO0Oo;
    public final AccessibilityNodeInfo OooO00o;
    public int OooO0O0 = -1;
    public int OooO0OO = -1;

    public C0039OoooO(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.OooO00o = accessibilityNodeInfo;
    }

    public static String OooO0Oo(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case FileUtils.FileMode.MODE_ISUID /* 2048 */:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case JarConfig.DEFAULT_BUFFER_SIZE /* 8192 */:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case JarConfig.MAX_BUFFER_SIZE /* 32768 */:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908382:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void OooO(C0042OoooO0O c0042OoooO0O) {
        this.OooO00o.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c0042OoooO0O.OooO00o);
    }

    public final void OooO00o(int i) {
        this.OooO00o.addAction(i);
    }

    public final void OooO0O0(C0038Oooo0oo c0038Oooo0oo) {
        this.OooO00o.addAction((AccessibilityNodeInfo.AccessibilityAction) c0038Oooo0oo.OooO00o);
    }

    public final ArrayList OooO0OO(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.OooO00o;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final void OooO0o(Rect rect) {
        this.OooO00o.getBoundsInParent(rect);
    }

    public final boolean OooO0o0(int i) {
        Bundle extras = this.OooO00o.getExtras();
        if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    public final CharSequence OooO0oO() {
        boolean z = !OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.OooO00o;
        if (z) {
            ArrayList OooO0OO = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList OooO0OO2 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList OooO0OO3 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList OooO0OO4 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < OooO0OO.size(); i++) {
                spannableString.setSpan(new C0027OooOoo0(((Integer) OooO0OO4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) OooO0OO.get(i)).intValue(), ((Integer) OooO0OO2.get(i)).intValue(), ((Integer) OooO0OO3.get(i)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final void OooO0oo(int i, boolean z) {
        Bundle extras = this.OooO00o.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void OooOO0(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.OooO00o;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void OooOO0O(CharSequence charSequence) {
        this.OooO00o.setText(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0039OoooO)) {
            return false;
        }
        C0039OoooO c0039OoooO = (C0039OoooO) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.OooO00o;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        if (this.OooO0OO == c0039OoooO.OooO0OO && this.OooO0O0 == c0039OoooO.OooO0O0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.OooO00o;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        boolean z;
        CharSequence charSequence3;
        boolean z2;
        boolean OooO0o0;
        boolean OooO0o02;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        OooO0o(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.OooO00o;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AbstractC0040OoooO0.OooO0OO(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(OooO0oO());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (i >= 30) {
            charSequence = AbstractC0030Oooo.OooO0O0(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        if (i >= 28) {
            charSequence2 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence2 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence2);
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (i >= 33) {
            string = AbstractC0041OoooO00.OooO0O0(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        if (i >= 23) {
            z = accessibilityNodeInfo.isContextClickable();
        } else {
            z = false;
        }
        sb.append(z);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        if (i >= 34) {
            charSequence3 = AbstractC0040OoooO0.OooO0Oo(accessibilityNodeInfo);
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(OooO0o0(67108864));
        sb.append("; importantForAccessibility: ");
        if (i >= 24) {
            z2 = accessibilityNodeInfo.isImportantForAccessibility();
        } else {
            z2 = true;
        }
        sb.append(z2);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i >= 33) {
            OooO0o0 = AbstractC0041OoooO00.OooO0OO(accessibilityNodeInfo);
        } else {
            OooO0o0 = OooO0o0(8388608);
        }
        sb.append(OooO0o0);
        sb.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            OooO0o02 = AbstractC0040OoooO0.OooO0oO(accessibilityNodeInfo);
        } else {
            OooO0o02 = OooO0o0(64);
        }
        sb.append(OooO0o02);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C0038Oooo0oo(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0038Oooo0oo c0038Oooo0oo = (C0038Oooo0oo) arrayList.get(i3);
            String OooO0Oo2 = OooO0Oo(c0038Oooo0oo.OooO00o());
            if (OooO0Oo2.equals("ACTION_UNKNOWN")) {
                Object obj = c0038Oooo0oo.OooO00o;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    OooO0Oo2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(OooO0Oo2);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
