package com.ninja.engine;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
/* renamed from: com.ninja.engine.oO0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841oO0oO extends C0439o0OoO0o {
    public final float OooO;
    public final AccessibilityManager OooO0o;
    public final C0781oO0OOoO OooO0o0;
    public final Rect OooO0oO;
    public final int OooO0oo;
    public ColorStateList OooOO0;
    public int OooOO0O;
    public ColorStateList OooOO0o;

    public C0841oO0oO(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.OooO0oO = new Rect();
        Context context2 = getContext();
        TypedArray Oooo0OO = AbstractC0692o0ooooOo.Oooo0OO(context2, attributeSet, AbstractC1038oOOOoo0O.OooOOO0, R.attr.autoCompleteTextViewStyle, 2131952378, new int[0]);
        if (Oooo0OO.hasValue(0) && Oooo0OO.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.OooO0oo = Oooo0OO.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.OooO = Oooo0OO.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (Oooo0OO.hasValue(2)) {
            this.OooOO0 = ColorStateList.valueOf(Oooo0OO.getColor(2, 0));
        }
        this.OooOO0O = Oooo0OO.getColor(4, 0);
        this.OooOO0o = AbstractC0809oO0OooOO.OooOooO(context2, Oooo0OO, 5);
        this.OooO0o = (AccessibilityManager) context2.getSystemService("accessibility");
        C0781oO0OOoO c0781oO0OOoO = new C0781oO0OOoO(context2, null, R.attr.listPopupWindowStyle, 0);
        this.OooO0o0 = c0781oO0OOoO;
        c0781oO0OOoO.OooOoO0 = true;
        c0781oO0OOoO.OooOoO.setFocusable(true);
        c0781oO0OOoO.OooOOOO = this;
        c0781oO0OOoO.OooOoO.setInputMethodMode(2);
        c0781oO0OOoO.OooOOO(getAdapter());
        c0781oO0OOoO.OooOOOo = new C0122o00O00Oo(1, this);
        if (Oooo0OO.hasValue(6)) {
            setSimpleItems(Oooo0OO.getResourceId(6, 0));
        }
        Oooo0OO.recycle();
    }

    public static void OooO00o(C0841oO0oO c0841oO0oO, Object obj) {
        c0841oO0oO.setText(c0841oO0oO.convertSelectionToString(obj), false);
    }

    public final TextInputLayout OooO0O0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean OooO0OO() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.OooO0o;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (OooO0OO()) {
            this.OooO0o0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.OooOO0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout OooO0O0 = OooO0O0();
        if (OooO0O0 != null && OooO0O0.OooOooo) {
            return OooO0O0.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.OooO;
    }

    public int getSimpleItemSelectedColor() {
        return this.OooOO0O;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.OooOO0o;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout OooO0O0 = OooO0O0();
        if (OooO0O0 != null && OooO0O0.OooOooo && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.OooO0o0.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout OooO0O0 = OooO0O0();
            int i3 = 0;
            if (adapter != null && OooO0O0 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0781oO0OOoO c0781oO0OOoO = this.OooO0o0;
                if (!c0781oO0OOoO.OooOoO.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c0781oO0OOoO.OooO0OO.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, OooO0O0);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = c0781oO0OOoO.OooOoO.getBackground();
                if (background != null) {
                    Rect rect = this.OooO0oO;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = OooO0O0.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (OooO0OO()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.OooO0o0.OooOOO(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0781oO0OOoO c0781oO0OOoO = this.OooO0o0;
        if (c0781oO0OOoO != null) {
            c0781oO0OOoO.OooO0o(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.OooOO0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0875oO0oOooo) {
            ((C0875oO0oOooo) dropDownBackground).OooOO0o(this.OooOO0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.OooO0o0.OooOOo0 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout OooO0O0 = OooO0O0();
        if (OooO0O0 != null) {
            OooO0O0.OooOOoo();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.OooOO0O = i;
        if (getAdapter() instanceof C1321oOooo) {
            ((C1321oOooo) getAdapter()).OooO00o();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.OooOO0o = colorStateList;
        if (getAdapter() instanceof C1321oOooo) {
            ((C1321oOooo) getAdapter()).OooO00o();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (OooO0OO()) {
            this.OooO0o0.OooO0Oo();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C1321oOooo(this, getContext(), this.OooO0oo, strArr));
    }
}
