package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.ninja.engine.AbstractC0018OooOOo0;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1091oOOoOOOO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0017OooOOo;
import com.ninja.engine.C0083o000OO0o;
import com.ninja.engine.C0331o0O0oo;
import com.ninja.engine.C0852oO0oOO0;
import com.ninja.engine.C0853oO0oOO00;
import com.ninja.engine.C1141oOOoooo;
import com.ninja.engine.C1198oOoOOO;
import com.ninja.engine.C1204oOoOOOO0;
import com.ninja.engine.InterfaceC0870oO0oOoOO;
import com.ninja.engine.InterfaceC1210oOoOOo;
import com.ninja.engine.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class MaterialButton extends C0083o000OO0o implements Checkable, InterfaceC1210oOoOOo {
    public static final int[] OooOOo = {16842911};
    public static final int[] OooOOoo = {16842912};
    public Drawable OooO;
    public final C0852oO0oOO0 OooO0Oo;
    public InterfaceC0870oO0oOoOO OooO0o;
    public final LinkedHashSet OooO0o0;
    public PorterDuff.Mode OooO0oO;
    public ColorStateList OooO0oo;
    public String OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public int OooOOo0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.materialButtonStyle, 2131952646), attributeSet, R.attr.materialButtonStyle);
        this.OooO0o0 = new LinkedHashSet();
        this.OooOOOO = false;
        this.OooOOOo = false;
        Context context2 = getContext();
        TypedArray Oooo0OO = AbstractC0692o0ooooOo.Oooo0OO(context2, attributeSet, AbstractC1038oOOOoo0O.OooOOO, R.attr.materialButtonStyle, 2131952646, new int[0]);
        this.OooOOO = Oooo0OO.getDimensionPixelSize(12, 0);
        int i = Oooo0OO.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.OooO0oO = AbstractC1091oOOoOOOO.OooOoo0(i, mode);
        this.OooO0oo = AbstractC0809oO0OooOO.OooOooO(getContext(), Oooo0OO, 14);
        this.OooO = AbstractC0809oO0OooOO.Oooo00O(getContext(), Oooo0OO, 10);
        this.OooOOo0 = Oooo0OO.getInteger(11, 1);
        this.OooOO0O = Oooo0OO.getDimensionPixelSize(13, 0);
        C0852oO0oOO0 c0852oO0oOO0 = new C0852oO0oOO0(this, C1204oOoOOOO0.OooO0O0(context2, attributeSet, R.attr.materialButtonStyle, 2131952646).OooO00o());
        this.OooO0Oo = c0852oO0oOO0;
        c0852oO0oOO0.OooO0OO = Oooo0OO.getDimensionPixelOffset(1, 0);
        c0852oO0oOO0.OooO0Oo = Oooo0OO.getDimensionPixelOffset(2, 0);
        c0852oO0oOO0.OooO0o0 = Oooo0OO.getDimensionPixelOffset(3, 0);
        c0852oO0oOO0.OooO0o = Oooo0OO.getDimensionPixelOffset(4, 0);
        if (Oooo0OO.hasValue(8)) {
            int dimensionPixelSize = Oooo0OO.getDimensionPixelSize(8, -1);
            c0852oO0oOO0.OooO0oO = dimensionPixelSize;
            float f = dimensionPixelSize;
            C1198oOoOOO OooO0o0 = c0852oO0oOO0.OooO0O0.OooO0o0();
            OooO0o0.OooO0o0 = new C0017OooOOo(f);
            OooO0o0.OooO0o = new C0017OooOOo(f);
            OooO0o0.OooO0oO = new C0017OooOOo(f);
            OooO0o0.OooO0oo = new C0017OooOOo(f);
            c0852oO0oOO0.OooO0OO(OooO0o0.OooO00o());
            c0852oO0oOO0.OooOOOo = true;
        }
        c0852oO0oOO0.OooO0oo = Oooo0OO.getDimensionPixelSize(20, 0);
        c0852oO0oOO0.OooO = AbstractC1091oOOoOOOO.OooOoo0(Oooo0OO.getInt(7, -1), mode);
        c0852oO0oOO0.OooOO0 = AbstractC0809oO0OooOO.OooOooO(getContext(), Oooo0OO, 6);
        c0852oO0oOO0.OooOO0O = AbstractC0809oO0OooOO.OooOooO(getContext(), Oooo0OO, 19);
        c0852oO0oOO0.OooOO0o = AbstractC0809oO0OooOO.OooOooO(getContext(), Oooo0OO, 16);
        c0852oO0oOO0.OooOOo0 = Oooo0OO.getBoolean(5, false);
        c0852oO0oOO0.OooOo00 = Oooo0OO.getDimensionPixelSize(9, 0);
        c0852oO0oOO0.OooOOo = Oooo0OO.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (Oooo0OO.hasValue(0)) {
            c0852oO0oOO0.OooOOOO = true;
            setSupportBackgroundTintList(c0852oO0oOO0.OooOO0);
            setSupportBackgroundTintMode(c0852oO0oOO0.OooO);
        } else {
            c0852oO0oOO0.OooO0o0();
        }
        setPaddingRelative(paddingStart + c0852oO0oOO0.OooO0OO, paddingTop + c0852oO0oOO0.OooO0o0, paddingEnd + c0852oO0oOO0.OooO0Oo, paddingBottom + c0852oO0oOO0.OooO0o);
        Oooo0OO.recycle();
        setCompoundDrawablePadding(this.OooOOO);
        OooO0Oo(this.OooO != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    public final boolean OooO00o() {
        C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
        if (c0852oO0oOO0 != null && c0852oO0oOO0.OooOOo0) {
            return true;
        }
        return false;
    }

    public final boolean OooO0O0() {
        C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
        if (c0852oO0oOO0 != null && !c0852oO0oOO0.OooOOOO) {
            return true;
        }
        return false;
    }

    public final void OooO0OO() {
        int i = this.OooOOo0;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.OooO, null, null, null);
        } else if (i != 3 && i != 4) {
            if (i == 16 || i == 32) {
                setCompoundDrawablesRelative(null, this.OooO, null, null);
            }
        } else {
            setCompoundDrawablesRelative(null, null, this.OooO, null);
        }
    }

    public final void OooO0Oo(boolean z) {
        Drawable drawable = this.OooO;
        if (drawable != null) {
            Drawable mutate = AbstractC0809oO0OooOO.o0ooOoO(drawable).mutate();
            this.OooO = mutate;
            mutate.setTintList(this.OooO0oo);
            PorterDuff.Mode mode = this.OooO0oO;
            if (mode != null) {
                this.OooO.setTintMode(mode);
            }
            int i = this.OooOO0O;
            if (i == 0) {
                i = this.OooO.getIntrinsicWidth();
            }
            int i2 = this.OooOO0O;
            if (i2 == 0) {
                i2 = this.OooO.getIntrinsicHeight();
            }
            Drawable drawable2 = this.OooO;
            int i3 = this.OooOO0o;
            int i4 = this.OooOOO0;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.OooO.setVisible(true, z);
        }
        if (z) {
            OooO0OO();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.OooOOo0;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.OooO) || (((i5 == 3 || i5 == 4) && drawable5 != this.OooO) || ((i5 == 16 || i5 == 32) && drawable4 != this.OooO))) {
            OooO0OO();
        }
    }

    public final void OooO0o0(int i, int i2) {
        boolean z;
        boolean z2;
        if (this.OooO != null && getLayout() != null) {
            int i3 = this.OooOOo0;
            boolean z3 = true;
            if (i3 != 1 && i3 != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!z && i3 != 3 && i3 != 4) {
                if (i3 == 16 || i3 == 32) {
                    this.OooOO0o = 0;
                    if (i3 == 16) {
                        this.OooOOO0 = 0;
                        OooO0Oo(false);
                    }
                    int i4 = this.OooOO0O;
                    if (i4 == 0) {
                        i4 = this.OooO.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.OooOOO) - getPaddingBottom()) / 2);
                    if (this.OooOOO0 != max) {
                        this.OooOOO0 = max;
                        OooO0Oo(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.OooOOO0 = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.OooOOo0;
            if (i5 != 1 && i5 != 3 && ((i5 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i5 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i6 = this.OooOO0O;
                if (i6 == 0) {
                    i6 = this.OooO.getIntrinsicWidth();
                }
                int textLayoutWidth = i - getTextLayoutWidth();
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.OooOOO) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.OooOOo0 != 4) {
                    z3 = false;
                }
                if (z2 != z3) {
                    paddingEnd = -paddingEnd;
                }
                if (this.OooOO0o != paddingEnd) {
                    this.OooOO0o = paddingEnd;
                    OooO0Oo(false);
                    return;
                }
                return;
            }
            this.OooOO0o = 0;
            OooO0Oo(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.OooOO0)) {
            return (OooO00o() ? CompoundButton.class : Button.class).getName();
        }
        return this.OooOO0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (OooO0O0()) {
            return this.OooO0Oo.OooO0oO;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.OooO;
    }

    public int getIconGravity() {
        return this.OooOOo0;
    }

    public int getIconPadding() {
        return this.OooOOO;
    }

    public int getIconSize() {
        return this.OooOO0O;
    }

    public ColorStateList getIconTint() {
        return this.OooO0oo;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.OooO0oO;
    }

    public int getInsetBottom() {
        return this.OooO0Oo.OooO0o;
    }

    public int getInsetTop() {
        return this.OooO0Oo.OooO0o0;
    }

    public ColorStateList getRippleColor() {
        if (OooO0O0()) {
            return this.OooO0Oo.OooOO0o;
        }
        return null;
    }

    public C1204oOoOOOO0 getShapeAppearanceModel() {
        if (OooO0O0()) {
            return this.OooO0Oo.OooO0O0;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (OooO0O0()) {
            return this.OooO0Oo.OooOO0O;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (OooO0O0()) {
            return this.OooO0Oo.OooO0oo;
        }
        return 0;
    }

    @Override // com.ninja.engine.C0083o000OO0o
    public ColorStateList getSupportBackgroundTintList() {
        if (OooO0O0()) {
            return this.OooO0Oo.OooOO0;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // com.ninja.engine.C0083o000OO0o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (OooO0O0()) {
            return this.OooO0Oo.OooO;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.OooOOOO;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (OooO0O0()) {
            AbstractC0692o0ooooOo.Ooooo00(this, this.OooO0Oo.OooO0O0(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (OooO00o()) {
            View.mergeDrawableStates(onCreateDrawableState, OooOOo);
        }
        if (this.OooOOOO) {
            View.mergeDrawableStates(onCreateDrawableState, OooOOoo);
        }
        return onCreateDrawableState;
    }

    @Override // com.ninja.engine.C0083o000OO0o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.OooOOOO);
    }

    @Override // com.ninja.engine.C0083o000OO0o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(OooO00o());
        accessibilityNodeInfo.setChecked(this.OooOOOO);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // com.ninja.engine.C0083o000OO0o, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0852oO0oOO0 c0852oO0oOO0;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (c0852oO0oOO0 = this.OooO0Oo) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = c0852oO0oOO0.OooOOO0;
            if (drawable != null) {
                drawable.setBounds(c0852oO0oOO0.OooO0OO, c0852oO0oOO0.OooO0o0, i6 - c0852oO0oOO0.OooO0Oo, i5 - c0852oO0oOO0.OooO0o);
            }
        }
        OooO0o0(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0853oO0oOO00)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0853oO0oOO00 c0853oO0oOO00 = (C0853oO0oOO00) parcelable;
        super.onRestoreInstanceState(c0853oO0oOO00.OooO00o);
        setChecked(c0853oO0oOO00.OooO0OO);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.ninja.engine.oO0oOO00, com.ninja.engine.OooOOo0] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? abstractC0018OooOOo0 = new AbstractC0018OooOOo0(super.onSaveInstanceState());
        abstractC0018OooOOo0.OooO0OO = this.OooOOOO;
        return abstractC0018OooOOo0;
    }

    @Override // com.ninja.engine.C0083o000OO0o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        OooO0o0(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.OooO0Oo.OooOOo) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.OooO != null) {
            if (this.OooO.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.OooOO0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (OooO0O0()) {
            C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
            if (c0852oO0oOO0.OooO0O0(false) != null) {
                c0852oO0oOO0.OooO0O0(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // com.ninja.engine.C0083o000OO0o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (OooO0O0()) {
            if (drawable != getBackground()) {
                C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
                c0852oO0oOO0.OooOOOO = true;
                ColorStateList colorStateList = c0852oO0oOO0.OooOO0;
                MaterialButton materialButton = c0852oO0oOO0.OooO00o;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(c0852oO0oOO0.OooO);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.ninja.engine.C0083o000OO0o, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0692o0ooooOo.OooOo0(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (OooO0O0()) {
            this.OooO0Oo.OooOOo0 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (OooO00o() && isEnabled() && this.OooOOOO != z) {
            this.OooOOOO = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.OooOOOO;
                if (!materialButtonToggleGroup.OooO0o) {
                    materialButtonToggleGroup.OooO0O0(getId(), z2);
                }
            }
            if (this.OooOOOo) {
                return;
            }
            this.OooOOOo = true;
            Iterator it = this.OooO0o0.iterator();
            if (!it.hasNext()) {
                this.OooOOOo = false;
            } else {
                AbstractC1230oOoOo0o.OooOO0O(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (OooO0O0()) {
            C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
            if (!c0852oO0oOO0.OooOOOo || c0852oO0oOO0.OooO0oO != i) {
                c0852oO0oOO0.OooO0oO = i;
                c0852oO0oOO0.OooOOOo = true;
                float f = i;
                C1198oOoOOO OooO0o0 = c0852oO0oOO0.OooO0O0.OooO0o0();
                OooO0o0.OooO0o0 = new C0017OooOOo(f);
                OooO0o0.OooO0o = new C0017OooOOo(f);
                OooO0o0.OooO0oO = new C0017OooOOo(f);
                OooO0o0.OooO0oo = new C0017OooOOo(f);
                c0852oO0oOO0.OooO0OO(OooO0o0.OooO00o());
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (OooO0O0()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (OooO0O0()) {
            this.OooO0Oo.OooO0O0(false).OooOO0O(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.OooO != drawable) {
            this.OooO = drawable;
            OooO0Oo(true);
            OooO0o0(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.OooOOo0 != i) {
            this.OooOOo0 = i;
            OooO0o0(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.OooOOO != i) {
            this.OooOOO = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0692o0ooooOo.OooOo0(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.OooOO0O != i) {
            this.OooOO0O = i;
            OooO0Oo(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.OooO0oo != colorStateList) {
            this.OooO0oo = colorStateList;
            OooO0Oo(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.OooO0oO != mode) {
            this.OooO0oO = mode;
            OooO0Oo(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC0809oO0OooOO.OooOoo(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
        c0852oO0oOO0.OooO0Oo(c0852oO0oOO0.OooO0o0, i);
    }

    public void setInsetTop(int i) {
        C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
        c0852oO0oOO0.OooO0Oo(i, c0852oO0oOO0.OooO0o);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0870oO0oOoOO interfaceC0870oO0oOoOO) {
        this.OooO0o = interfaceC0870oO0oOoOO;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC0870oO0oOoOO interfaceC0870oO0oOoOO = this.OooO0o;
        if (interfaceC0870oO0oOoOO != null) {
            ((MaterialButtonToggleGroup) ((C0331o0O0oo) interfaceC0870oO0oOoOO).OooO0O0).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (OooO0O0()) {
            C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
            if (c0852oO0oOO0.OooOO0o != colorStateList) {
                c0852oO0oOO0.OooOO0o = colorStateList;
                boolean z = C0852oO0oOO0.OooOo0;
                MaterialButton materialButton = c0852oO0oOO0.OooO00o;
                if (z && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC0692o0ooooOo.OoooOoO(colorStateList));
                } else if (!z && (materialButton.getBackground() instanceof C1141oOOoooo)) {
                    ((C1141oOOoooo) materialButton.getBackground()).setTintList(AbstractC0692o0ooooOo.OoooOoO(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (OooO0O0()) {
            setRippleColor(AbstractC0809oO0OooOO.OooOoo(getContext(), i));
        }
    }

    @Override // com.ninja.engine.InterfaceC1210oOoOOo
    public void setShapeAppearanceModel(C1204oOoOOOO0 c1204oOoOOOO0) {
        if (OooO0O0()) {
            this.OooO0Oo.OooO0OO(c1204oOoOOOO0);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (OooO0O0()) {
            C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
            c0852oO0oOO0.OooOOO = z;
            c0852oO0oOO0.OooO0o();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (OooO0O0()) {
            C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
            if (c0852oO0oOO0.OooOO0O != colorStateList) {
                c0852oO0oOO0.OooOO0O = colorStateList;
                c0852oO0oOO0.OooO0o();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (OooO0O0()) {
            setStrokeColor(AbstractC0809oO0OooOO.OooOoo(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (OooO0O0()) {
            C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
            if (c0852oO0oOO0.OooO0oo != i) {
                c0852oO0oOO0.OooO0oo = i;
                c0852oO0oOO0.OooO0o();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (OooO0O0()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // com.ninja.engine.C0083o000OO0o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (OooO0O0()) {
            C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
            if (c0852oO0oOO0.OooOO0 != colorStateList) {
                c0852oO0oOO0.OooOO0 = colorStateList;
                if (c0852oO0oOO0.OooO0O0(false) != null) {
                    c0852oO0oOO0.OooO0O0(false).setTintList(c0852oO0oOO0.OooOO0);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // com.ninja.engine.C0083o000OO0o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (OooO0O0()) {
            C0852oO0oOO0 c0852oO0oOO0 = this.OooO0Oo;
            if (c0852oO0oOO0.OooO != mode) {
                c0852oO0oOO0.OooO = mode;
                if (c0852oO0oOO0.OooO0O0(false) != null && c0852oO0oOO0.OooO != null) {
                    c0852oO0oOO0.OooO0O0(false).setTintMode(c0852oO0oOO0.OooO);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        OooO0o0(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.OooO0Oo.OooOOo = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.OooOOOO);
    }
}
