package com.ninja.engine;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o0O00 extends C0028OooOooO {
    public static final Rect OooOOOO = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final C0601o0oOooO0 OooOOOo = new C0601o0oOooO0(8);
    public static final C0601o0oOooO0 OooOOo0 = new C0601o0oOooO0(9);
    public final View OooO;
    public final AccessibilityManager OooO0oo;
    public C0518o0o00oO0 OooOO0;
    public final /* synthetic */ Chip OooOOO;
    public final Rect OooO0Oo = new Rect();
    public final Rect OooO0o0 = new Rect();
    public final Rect OooO0o = new Rect();
    public final int[] OooO0oO = new int[2];
    public int OooOO0O = Integer.MIN_VALUE;
    public int OooOO0o = Integer.MIN_VALUE;
    public int OooOOO0 = Integer.MIN_VALUE;

    public o0O00(Chip chip, Chip chip2) {
        this.OooOOO = chip;
        if (chip2 != null) {
            this.OooO = chip2;
            this.OooO0oo = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
            chip2.setFocusable(true);
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if (chip2.getImportantForAccessibility() == 0) {
                chip2.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final C0044OoooOOO OooO0O0(View view) {
        if (this.OooOO0 == null) {
            this.OooOO0 = new C0518o0o00oO0(this);
        }
        return this.OooOO0;
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        super.OooO0OO(view, accessibilityEvent);
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0Oo(View view, C0039OoooO c0039OoooO) {
        View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.OooOOO;
        accessibilityNodeInfo.setCheckable(chip.OooO0Oo());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            c0039OoooO.OooOO0O(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean OooOO0(int i) {
        if (this.OooOO0o != i) {
            return false;
        }
        this.OooOO0o = Integer.MIN_VALUE;
        if (i == 1) {
            Chip chip = this.OooOOO;
            chip.OooOOO0 = false;
            chip.refreshDrawableState();
        }
        OooOOo0(i, 8);
        return true;
    }

    public final C0039OoooO OooOO0O(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C0039OoooO c0039OoooO = new C0039OoooO(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = OooOOOO;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        c0039OoooO.OooO0O0 = -1;
        View view = this.OooO;
        obtain.setParent(view);
        OooOOOO(i, c0039OoooO);
        if (c0039OoooO.OooO0oO() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.OooO0o0;
        c0039OoooO.OooO0o(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    c0039OoooO.OooO0OO = i;
                    obtain.setSource(view, i);
                    if (this.OooOO0O == i) {
                        obtain.setAccessibilityFocused(true);
                        c0039OoooO.OooO00o(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        c0039OoooO.OooO00o(64);
                    }
                    if (this.OooOO0o == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c0039OoooO.OooO00o(2);
                    } else if (obtain.isFocusable()) {
                        c0039OoooO.OooO00o(1);
                    }
                    obtain.setFocused(z);
                    int[] iArr = this.OooO0oO;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.OooO0Oo;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        c0039OoooO.OooO0o(rect3);
                        if (c0039OoooO.OooO0O0 != -1) {
                            C0039OoooO c0039OoooO2 = new C0039OoooO(AccessibilityNodeInfo.obtain());
                            for (int i2 = c0039OoooO.OooO0O0; i2 != -1; i2 = c0039OoooO2.OooO0O0) {
                                c0039OoooO2.OooO0O0 = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO2.OooO00o;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                OooOOOO(i2, c0039OoooO2);
                                c0039OoooO2.OooO0o(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.OooO0o;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            c0039OoooO.OooO00o.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        obtain.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return c0039OoooO;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final void OooOO0o(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Rect rect = Chip.OooOo0o;
        Chip chip = this.OooOOO;
        if (chip.OooO0OO()) {
            C0436o0OoO00O c0436o0OoO00O = chip.OooO0o0;
            if (c0436o0OoO00O != null && c0436o0OoO00O.Oooo0OO) {
                z = true;
            }
            if (z && chip.OooO0oo != null) {
                arrayList.add(1);
            }
        }
    }

    public final C0039OoooO OooOOO(int i) {
        if (i == -1) {
            View view = this.OooO;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            C0039OoooO c0039OoooO = new C0039OoooO(obtain);
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            OooOO0o(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                c0039OoooO.OooO00o.addChild(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return c0039OoooO;
        }
        return OooOO0O(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOO0(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0O00.OooOOO0(int, android.graphics.Rect):boolean");
    }

    public final void OooOOOO(int i, C0039OoooO c0039OoooO) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
        String str = "";
        if (i == 1) {
            Chip chip = this.OooOOO;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    str = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, str).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            c0039OoooO.OooO0O0(C0038Oooo0oo.OooO0o0);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.OooOo0o);
    }

    public final boolean OooOOOo(int i) {
        int i2;
        View view = this.OooO;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.OooOO0o) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            OooOO0(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.OooOO0o = i;
        if (i == 1) {
            Chip chip = this.OooOOO;
            chip.OooOOO0 = true;
            chip.refreshDrawableState();
        }
        OooOOo0(i, 8);
        return true;
    }

    public final void OooOOo0(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.OooO0oo.isEnabled() || (parent = (view = this.OooO).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            C0039OoooO OooOOO = OooOOO(i);
            obtain.getText().add(OooOOO.OooO0oO());
            AccessibilityNodeInfo accessibilityNodeInfo = OooOOO.OooO00o;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}


