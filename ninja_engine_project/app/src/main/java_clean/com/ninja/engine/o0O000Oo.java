package com.ninja.engine;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
/* loaded from: classes.dex */
public final class o0O000Oo extends C0028OooOooO {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ o0O000Oo(int i, Object obj) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // com.ninja.engine.C0028OooOooO
    public void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        int i = this.OooO0Oo;
        super.OooO0OO(view, accessibilityEvent);
        switch (i) {
            case 0:
                accessibilityEvent.setChecked(((CheckableImageButton) this.OooO0o0).OooO0Oo);
                return;
            default:
                return;
        }
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0Oo(View view, C0039OoooO c0039OoooO) {
        int i;
        Object obj = this.OooO0o0;
        View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
        switch (this.OooO0Oo) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.OooO0o0);
                accessibilityNodeInfo.setChecked(checkableImageButton.OooO0Oo);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0039OoooO.OooO00o);
                int i2 = MaterialButtonToggleGroup.OooOO0O;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i3 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.OooO0OO(i4)) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                c0039OoooO.OooO(C0042OoooO0O.OooO00o(((MaterialButton) view).OooOOOO, 0, 1, i3, 1));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0039OoooO.OooO00o);
                C0863oO0oOOoo c0863oO0oOOoo = (C0863oO0oOOoo) obj;
                if (c0863oO0oOOoo.OooooOo.getVisibility() == 0) {
                    i = R.string.mtrl_picker_toggle_to_year_selection;
                } else {
                    i = R.string.mtrl_picker_toggle_to_day_selection;
                }
                c0039OoooO.OooOO0(c0863oO0oOOoo.OooOOO0(i));
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0039OoooO.OooO00o;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).OooOo);
                return;
        }
    }
}


