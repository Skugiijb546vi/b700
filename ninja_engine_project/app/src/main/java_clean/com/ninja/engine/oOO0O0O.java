package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class oOO0O0O extends FrameLayout {
    public final oOO0 OooO00o;
    public final C0221o00o0oo0 OooO0O0;
    public final oOO0O00O OooO0OO;
    public C1271oOoo0OOO OooO0Oo;
    public oOO0O0 OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.ninja.engine.oOO0O00O, com.ninja.engine.oOo00o00, java.lang.Object] */
    public oOO0O0O(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.bottomNavigationStyle, 2131952444), attributeSet, R.attr.bottomNavigationStyle);
        ColorStateList OooO0OO;
        Object obj = new Object();
        obj.OooO0O0 = false;
        this.OooO0OO = (oOO0O00O) obj;
        Context context2 = getContext();
        C0131o00O0o Oooo0o0 = AbstractC0692o0ooooOo.Oooo0o0(context2, attributeSet, AbstractC1038oOOOoo0O.OooOoO0, R.attr.bottomNavigationStyle, 2131952444, 12, 10);
        oOO0 ooo0 = new oOO0(context2, getClass(), getMaxItemCount());
        this.OooO00o = ooo0;
        C0221o00o0oo0 c0221o00o0oo0 = new C0221o00o0oo0(context2);
        this.OooO0O0 = c0221o00o0oo0;
        obj.OooO00o = c0221o00o0oo0;
        obj.OooO0OO = 1;
        c0221o00o0oo0.setPresenter((oOO0O00O) obj);
        ooo0.OooO0O0((InterfaceC1165oOo00o00) obj, ooo0.OooO00o);
        getContext();
        obj.OooO00o.OooOooo = ooo0;
        TypedArray typedArray = (TypedArray) Oooo0o0.OooO0O0;
        if (typedArray.hasValue(6)) {
            OooO0OO = Oooo0o0.OooOo0O(6);
        } else {
            OooO0OO = c0221o00o0oo0.OooO0OO();
        }
        c0221o00o0oo0.setIconTintList(OooO0OO);
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(Oooo0o0.OooOo0O(13));
        }
        Drawable background = getBackground();
        ColorStateList OooOoO0 = AbstractC0694o0ooooo0.OooOoO0(background);
        if (background == null || OooOoO0 != null) {
            C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo(C1204oOoOOOO0.OooO0O0(context2, attributeSet, R.attr.bottomNavigationStyle, 2131952444).OooO00o());
            if (OooOoO0 != null) {
                c0875oO0oOooo.OooOO0o(OooOoO0);
            }
            c0875oO0oOooo.OooOO0(context2);
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            setBackground(c0875oO0oOooo);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(AbstractC0809oO0OooOO.OooOooo(context2, Oooo0o0, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            c0221o00o0oo0.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(AbstractC0809oO0OooOO.OooOooo(context2, Oooo0o0, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC1038oOOOoo0O.OooOo);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(AbstractC0809oO0OooOO.OooOooO(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(C1204oOoOOOO0.OooO00o(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new C0017OooOOo(0)).OooO00o());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            obj.OooO0O0 = true;
            getMenuInflater().inflate(resourceId3, ooo0);
            obj.OooO0O0 = false;
            obj.OooO(true);
        }
        Oooo0o0.Oooo0o0();
        addView(c0221o00o0oo0);
        ooo0.OooO0o0 = new C0331o0O0oo(23, (BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new C1271oOoo0OOO(getContext());
        }
        return this.OooO0Oo;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.OooO0O0.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.OooO0O0.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.OooO0O0.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.OooO0O0.getItemActiveIndicatorMarginHorizontal();
    }

    public C1204oOoOOOO0 getItemActiveIndicatorShapeAppearance() {
        return this.OooO0O0.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.OooO0O0.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.OooO0O0.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.OooO0O0.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.OooO0O0.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.OooO0O0.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.OooO0O0.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.OooO0O0.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.OooO0O0.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.OooO0O0.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.OooO0O0.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.OooO0O0.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.OooO0O0.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.OooO00o;
    }

    public oO getMenuView() {
        return this.OooO0O0;
    }

    public oOO0O00O getPresenter() {
        return this.OooO0OO;
    }

    public int getSelectedItemId() {
        return this.OooO0O0.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0875oO0oOooo) {
            AbstractC0692o0ooooOo.Ooooo00(this, (C0875oO0oOooo) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof oOO0O0O0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oOO0O0O0 ooo0o0o0 = (oOO0O0O0) parcelable;
        super.onRestoreInstanceState(ooo0o0o0.OooO00o);
        Bundle bundle = ooo0o0o0.OooO0OO;
        oOO0 ooo0 = this.OooO00o;
        ooo0.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = ooo0.OooOo0;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    InterfaceC1165oOo00o00 interfaceC1165oOo00o00 = (InterfaceC1165oOo00o00) weakReference.get();
                    if (interfaceC1165oOo00o00 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        int OooOO0 = interfaceC1165oOo00o00.OooOO0();
                        if (OooOO0 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(OooOO0)) != null) {
                            interfaceC1165oOo00o00.OooO0o(parcelable2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ninja.engine.oOO0O0O0, android.os.Parcelable, com.ninja.engine.OooOOo0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable OooOO0o;
        AbstractC0018OooOOo0 abstractC0018OooOOo0 = new AbstractC0018OooOOo0(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        abstractC0018OooOOo0.OooO0OO = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooO00o.OooOo0;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1165oOo00o00 interfaceC1165oOo00o00 = (InterfaceC1165oOo00o00) weakReference.get();
                if (interfaceC1165oOo00o00 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int OooOO0 = interfaceC1165oOo00o00.OooOO0();
                    if (OooOO0 > 0 && (OooOO0o = interfaceC1165oOo00o00.OooOO0o()) != null) {
                        sparseArray.put(OooOO0, OooOO0o);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return abstractC0018OooOOo0;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.OooO0O0.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0875oO0oOooo) {
            ((C0875oO0oOooo) background).OooOO0O(f);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.OooO0O0.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.OooO0O0.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.OooO0O0.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.OooO0O0.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C1204oOoOOOO0 c1204oOoOOOO0) {
        this.OooO0O0.setItemActiveIndicatorShapeAppearance(c1204oOoOOOO0);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.OooO0O0.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.OooO0O0.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.OooO0O0.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.OooO0O0.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.OooO0O0.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.OooO0O0.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.OooO0O0.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.OooO0O0.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.OooO0O0.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.OooO0O0.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.OooO0O0.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.OooO0O0.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C0221o00o0oo0 c0221o00o0oo0 = this.OooO0O0;
        if (c0221o00o0oo0.getLabelVisibilityMode() != i) {
            c0221o00o0oo0.setLabelVisibilityMode(i);
            this.OooO0OO.OooO(false);
        }
    }

    public void setOnItemSelectedListener(oOO0O0 ooo0o0) {
        this.OooO0o0 = ooo0o0;
    }

    public void setSelectedItemId(int i) {
        oOO0 ooo0 = this.OooO00o;
        MenuItem findItem = ooo0.findItem(i);
        if (findItem != null && !ooo0.OooOOo0(findItem, this.OooO0OO, 0)) {
            findItem.setChecked(true);
        }
    }

    public void setOnItemReselectedListener(InterfaceC0923oOO0O00o interfaceC0923oOO0O00o) {
    }
}



