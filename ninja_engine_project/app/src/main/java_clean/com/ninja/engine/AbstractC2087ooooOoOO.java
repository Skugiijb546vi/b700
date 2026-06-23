package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.ooooOoOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2087ooooOoOO extends ViewGroup implements oO {
    public static final int[] Oooo000 = {16842912};
    public static final int[] Oooo00O = {-16842910};
    public ColorStateList OooO;
    public final o00OOOO0 OooO00o;
    public final View$OnClickListenerC0176o00Ooo OooO0O0;
    public final C0996oOOOO0Oo OooO0OO;
    public final SparseArray OooO0Oo;
    public AbstractC0921oOO00ooO[] OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public ColorStateList OooOO0O;
    public final ColorStateList OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public boolean OooOOOO;
    public Drawable OooOOOo;
    public int OooOOo;
    public ColorStateList OooOOo0;
    public final SparseArray OooOOoo;
    public int OooOo;
    public int OooOo0;
    public int OooOo00;
    public int OooOo0O;
    public boolean OooOo0o;
    public int OooOoO;
    public int OooOoO0;
    public C1204oOoOOOO0 OooOoOO;
    public ColorStateList OooOoo;
    public boolean OooOoo0;
    public oOO0O00O OooOooO;
    public MenuC0887oO0oo0oo OooOooo;

    public AbstractC2087ooooOoOO(Context context) {
        super(context);
        this.OooO0OO = new C0996oOOOO0Oo(5);
        this.OooO0Oo = new SparseArray(5);
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOoo = new SparseArray(5);
        this.OooOo00 = -1;
        this.OooOo0 = -1;
        this.OooOo0O = -1;
        this.OooOoo0 = false;
        this.OooOO0o = OooO0OO();
        if (isInEditMode()) {
            this.OooO00o = null;
        } else {
            o00OOOO0 o00oooo0 = new o00OOOO0();
            this.OooO00o = o00oooo0;
            o00oooo0.Oooo0oO(0);
            o00oooo0.OooOoo(AbstractC0809oO0OooOO.OooooOO(getContext(), R.attr.motionDurationMedium4, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            o00oooo0.OooOooo(AbstractC0809oO0OooOO.OooooOo(getContext(), R.attr.motionEasingStandard, o000OO0O.OooO0O0));
            o00oooo0.Oooo0OO(new AbstractC1358oo0000o0() {});
        }
        this.OooO0O0 = new View$OnClickListenerC0176o00Ooo(3, (C0221o00o0oo0) this);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        setImportantForAccessibility(1);
    }

    private AbstractC0921oOO00ooO getNewItem() {
        AbstractC0921oOO00ooO abstractC0921oOO00ooO = (AbstractC0921oOO00ooO) this.OooO0OO.OooO();
        if (abstractC0921oOO00ooO == null) {
            return new AbstractC0921oOO00ooO(getContext());
        }
        return abstractC0921oOO00ooO;
    }

    private void setBadgeIfNeeded(AbstractC0921oOO00ooO abstractC0921oOO00ooO) {
        C0177o00Ooo0 c0177o00Ooo0;
        int id = abstractC0921oOO00ooO.getId();
        if (id != -1 && (c0177o00Ooo0 = (C0177o00Ooo0) this.OooOOoo.get(id)) != null) {
            abstractC0921oOO00ooO.setBadge(c0177o00Ooo0);
        }
    }

    @Override // com.ninja.engine.oO
    public final void OooO00o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        this.OooOooo = menuC0887oO0oo0oo;
    }

    public final void OooO0O0() {
        boolean z;
        removeAllViews();
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                if (abstractC0921oOO00ooO != null) {
                    this.OooO0OO.OooO0OO(abstractC0921oOO00ooO);
                    abstractC0921oOO00ooO.OooO(abstractC0921oOO00ooO.OooOOO);
                    abstractC0921oOO00ooO.OooOo00 = null;
                    abstractC0921oOO00ooO.OooOoO = 0.0f;
                    abstractC0921oOO00ooO.OooO00o = false;
                }
            }
        }
        if (this.OooOooo.OooO0o.size() == 0) {
            this.OooO0oO = 0;
            this.OooO0oo = 0;
            this.OooO0o = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.OooOooo.OooO0o.size(); i++) {
            hashSet.add(Integer.valueOf(this.OooOooo.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.OooOOoo;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i2++;
        }
        this.OooO0o = new AbstractC0921oOO00ooO[this.OooOooo.OooO0o.size()];
        int i3 = this.OooO0o0;
        int size = this.OooOooo.OooOO0o().size();
        if (i3 != -1 ? i3 == 0 : size > 3) {
            z = true;
        } else {
            z = false;
        }
        for (int i4 = 0; i4 < this.OooOooo.OooO0o.size(); i4++) {
            this.OooOooO.OooO0O0 = true;
            this.OooOooo.getItem(i4).setCheckable(true);
            this.OooOooO.OooO0O0 = false;
            AbstractC0921oOO00ooO newItem = getNewItem();
            this.OooO0o[i4] = newItem;
            newItem.setIconTintList(this.OooO);
            newItem.setIconSize(this.OooOO0);
            newItem.setTextColor(this.OooOO0o);
            newItem.setTextAppearanceInactive(this.OooOOO0);
            newItem.setTextAppearanceActive(this.OooOOO);
            newItem.setTextAppearanceActiveBoldEnabled(this.OooOOOO);
            newItem.setTextColor(this.OooOO0O);
            int i5 = this.OooOo00;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.OooOo0;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            int i7 = this.OooOo0O;
            if (i7 != -1) {
                newItem.setActiveIndicatorLabelPadding(i7);
            }
            newItem.setActiveIndicatorWidth(this.OooOo);
            newItem.setActiveIndicatorHeight(this.OooOoO0);
            newItem.setActiveIndicatorMarginHorizontal(this.OooOoO);
            newItem.setActiveIndicatorDrawable(OooO0Oo());
            newItem.setActiveIndicatorResizeable(this.OooOoo0);
            newItem.setActiveIndicatorEnabled(this.OooOo0o);
            Drawable drawable = this.OooOOOo;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.OooOOo);
            }
            newItem.setItemRippleColor(this.OooOOo0);
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.OooO0o0);
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) this.OooOooo.getItem(i4);
            newItem.OooO0O0(c0892oO0ooO0o);
            newItem.setItemPosition(i4);
            SparseArray sparseArray2 = this.OooO0Oo;
            int i8 = c0892oO0ooO0o.OooO00o;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i8));
            newItem.setOnClickListener(this.OooO0O0);
            int i9 = this.OooO0oO;
            if (i9 != 0 && i8 == i9) {
                this.OooO0oo = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.OooOooo.OooO0o.size() - 1, this.OooO0oo);
        this.OooO0oo = min;
        this.OooOooo.getItem(min).setChecked(true);
    }

    public final ColorStateList OooO0OO() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList OooOoo = AbstractC0809oO0OooOO.OooOoo(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = OooOoo.getDefaultColor();
        int[] iArr = Oooo00O;
        return new ColorStateList(new int[][]{iArr, Oooo000, ViewGroup.EMPTY_STATE_SET}, new int[]{OooOoo.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final C0875oO0oOooo OooO0Oo() {
        if (this.OooOoOO != null && this.OooOoo != null) {
            C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo(this.OooOoOO);
            c0875oO0oOooo.OooOO0o(this.OooOoo);
            return c0875oO0oOooo;
        }
        return null;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.OooOo0O;
    }

    public SparseArray<C0177o00Ooo0> getBadgeDrawables() {
        return this.OooOOoo;
    }

    public ColorStateList getIconTintList() {
        return this.OooO;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.OooOoo;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.OooOo0o;
    }

    public int getItemActiveIndicatorHeight() {
        return this.OooOoO0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.OooOoO;
    }

    public C1204oOoOOOO0 getItemActiveIndicatorShapeAppearance() {
        return this.OooOoOO;
    }

    public int getItemActiveIndicatorWidth() {
        return this.OooOo;
    }

    public Drawable getItemBackground() {
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null && abstractC0921oOO00ooOArr.length > 0) {
            return abstractC0921oOO00ooOArr[0].getBackground();
        }
        return this.OooOOOo;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.OooOOo;
    }

    public int getItemIconSize() {
        return this.OooOO0;
    }

    public int getItemPaddingBottom() {
        return this.OooOo0;
    }

    public int getItemPaddingTop() {
        return this.OooOo00;
    }

    public ColorStateList getItemRippleColor() {
        return this.OooOOo0;
    }

    public int getItemTextAppearanceActive() {
        return this.OooOOO;
    }

    public int getItemTextAppearanceInactive() {
        return this.OooOOO0;
    }

    public ColorStateList getItemTextColor() {
        return this.OooOO0O;
    }

    public int getLabelVisibilityMode() {
        return this.OooO0o0;
    }

    public MenuC0887oO0oo0oo getMenu() {
        return this.OooOooo;
    }

    public int getSelectedItemId() {
        return this.OooO0oO;
    }

    public int getSelectedItemPosition() {
        return this.OooO0oo;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.OooOooo.OooOO0o().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.OooOo0O = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.OooO = colorStateList;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.OooOoo = colorStateList;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setActiveIndicatorDrawable(OooO0Oo());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.OooOo0o = z;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.OooOoO0 = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.OooOoO = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.OooOoo0 = z;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C1204oOoOOOO0 c1204oOoOOOO0) {
        this.OooOoOO = c1204oOoOOOO0;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setActiveIndicatorDrawable(OooO0Oo());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.OooOo = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.OooOOOo = drawable;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.OooOOo = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.OooOO0 = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.OooOo0 = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.OooOo00 = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.OooOOo0 = colorStateList;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.OooOOO = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.OooOO0O;
                if (colorStateList != null) {
                    abstractC0921oOO00ooO.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.OooOOOO = z;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.OooOOO0 = i;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.OooOO0O;
                if (colorStateList != null) {
                    abstractC0921oOO00ooO.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.OooOO0O = colorStateList;
        AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = this.OooO0o;
        if (abstractC0921oOO00ooOArr != null) {
            for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                abstractC0921oOO00ooO.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.OooO0o0 = i;
    }

    public void setPresenter(oOO0O00O ooo0o00o) {
        this.OooOooO = ooo0o00o;
    }
}


