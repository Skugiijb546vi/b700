package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* renamed from: com.ninja.engine.o00O0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132o00O0o0 extends ToggleButton implements InterfaceC1322oOooo0 {
    public final o0000OO0 OooO00o;
    public final o00O0OO OooO0O0;
    public C0116o000ooO0 OooO0OO;

    public C0132o00O0o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        o0000OO0 o0000oo0 = new o0000OO0(this);
        this.OooO00o = o0000oo0;
        o0000oo0.OooOO0O(attributeSet, 16842827);
        o00O0OO o00o0oo = new o00O0OO(this);
        this.OooO0O0 = o00o0oo;
        o00o0oo.OooO0o(attributeSet, 16842827);
        getEmojiTextViewHelper().OooO00o(attributeSet, 16842827);
    }

    private C0116o000ooO0 getEmojiTextViewHelper() {
        if (this.OooO0OO == null) {
            this.OooO0OO = new C0116o000ooO0(this);
        }
        return this.OooO0OO;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0O0(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0694o0ooooo0) getEmojiTextViewHelper().OooO0O0.OooO0O0).OooOoO(inputFilterArr));
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
}
