package com.ninja.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* renamed from: com.ninja.engine.o000OO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0083o000OO0o extends Button implements InterfaceC1322oOooo0 {
    public final o0000OO0 OooO00o;
    public final o00O0OO OooO0O0;
    public C0116o000ooO0 OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083o000OO0o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1320oOooOooo.OooO00o(context);
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        o0000OO0 o0000oo0 = new o0000OO0(this);
        this.OooO00o = o0000oo0;
        o0000oo0.OooOO0O(attributeSet, i);
        o00O0OO o00o0oo = new o00O0OO(this);
        this.OooO0O0 = o00o0oo;
        o00o0oo.OooO0o(attributeSet, i);
        o00o0oo.OooO0O0();
        getEmojiTextViewHelper().OooO00o(attributeSet, i);
    }

    private C0116o000ooO0 getEmojiTextViewHelper() {
        if (this.OooO0OO == null) {
            this.OooO0OO = new C0116o000ooO0(this);
        }
        return this.OooO0OO;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooO00o();
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1479oo0O0oOo.OooO0OO) {
            return super.getAutoSizeMaxTextSize();
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            return Math.round(o00o0oo.OooO.OooO0o0);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC1479oo0O0oOo.OooO0OO) {
            return super.getAutoSizeMinTextSize();
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            return Math.round(o00o0oo.OooO.OooO0Oo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC1479oo0O0oOo.OooO0OO) {
            return super.getAutoSizeStepGranularity();
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            return Math.round(o00o0oo.OooO.OooO0OO);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC1479oo0O0oOo.OooO0OO) {
            return super.getAutoSizeTextAvailableSizes();
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            return o00o0oo.OooO.OooO0o;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1479oo0O0oOo.OooO0OO) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo == null) {
            return 0;
        }
        return o00o0oo.OooO.OooO00o;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1094oOOoOOo0.OooOoO0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            return o0000oo0.OooO0oo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            return o0000oo0.OooO();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.OooO0O0.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.OooO0O0.OooO0o0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null && !AbstractC1479oo0O0oOo.OooO0OO) {
            o00o0oo.OooO.OooO00o();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null && !AbstractC1479oo0O0oOo.OooO0OO) {
            C0234o00oOOo c0234o00oOOo = o00o0oo.OooO;
            if (c0234o00oOOo.OooO0o()) {
                c0234o00oOOo.OooO00o();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0O0(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC1479oo0O0oOo.OooO0OO) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC1479oo0O0oOo.OooO0OO) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooOO0(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC1479oo0O0oOo.OooO0OO) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooOO0O(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1094oOOoOOo0.OooOoO(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0694o0ooooo0) getEmojiTextViewHelper().OooO0O0.OooO0O0).OooOoO(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO00o.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOo00(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOo0(mode);
        }
    }

    @Override // com.ninja.engine.InterfaceC1322oOooo0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00O0OO o00o0oo = this.OooO0O0;
        o00o0oo.OooOO0o(colorStateList);
        o00o0oo.OooO0O0();
    }

    @Override // com.ninja.engine.InterfaceC1322oOooo0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00O0OO o00o0oo = this.OooO0O0;
        o00o0oo.OooOOO0(mode);
        o00o0oo.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0oO(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC1479oo0O0oOo.OooO0OO;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null && !z) {
            C0234o00oOOo c0234o00oOOo = o00o0oo.OooO;
            if (!c0234o00oOOo.OooO0o()) {
                c0234o00oOOo.OooO0oO(i, f);
            }
        }
    }
}


