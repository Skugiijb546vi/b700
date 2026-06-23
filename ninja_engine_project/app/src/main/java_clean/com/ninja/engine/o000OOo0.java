package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* loaded from: classes.dex */
public class o000OOo0 extends CheckBox implements InterfaceC1326oOooo00o, InterfaceC1322oOooo0 {
    public final C0086o000Oo00 OooO00o;
    public final o0000OO0 OooO0O0;
    public final o00O0OO OooO0OO;
    public C0116o000ooO0 OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1320oOooOooo.OooO00o(context);
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        C0086o000Oo00 c0086o000Oo00 = new C0086o000Oo00(this);
        this.OooO00o = c0086o000Oo00;
        c0086o000Oo00.OooO0Oo(attributeSet, i);
        o0000OO0 o0000oo0 = new o0000OO0(this);
        this.OooO0O0 = o0000oo0;
        o0000oo0.OooOO0O(attributeSet, i);
        o00O0OO o00o0oo = new o00O0OO(this);
        this.OooO0OO = o00o0oo;
        o00o0oo.OooO0o(attributeSet, i);
        getEmojiTextViewHelper().OooO00o(attributeSet, i);
    }

    private C0116o000ooO0 getEmojiTextViewHelper() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new C0116o000ooO0(this);
        }
        return this.OooO0Oo;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooO00o();
        }
        o00O0OO o00o0oo = this.OooO0OO;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            return o0000oo0.OooO0oo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            return o0000oo0.OooO();
        }
        return null;
    }

    @Override // com.ninja.engine.InterfaceC1326oOooo00o
    public ColorStateList getSupportButtonTintList() {
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            return (ColorStateList) c0086o000Oo00.OooO00o;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            return (PorterDuff.Mode) c0086o000Oo00.OooO0O0;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.OooO0OO.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.OooO0OO.OooO0o0();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0O0(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0OO;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0OO;
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
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooOo00(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooOo0(mode);
        }
    }

    @Override // com.ninja.engine.InterfaceC1326oOooo00o
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            c0086o000Oo00.OooO00o = colorStateList;
            c0086o000Oo00.OooO0OO = true;
            c0086o000Oo00.OooO00o();
        }
    }

    @Override // com.ninja.engine.InterfaceC1326oOooo00o
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            c0086o000Oo00.OooO0O0 = mode;
            c0086o000Oo00.OooO0Oo = true;
            c0086o000Oo00.OooO00o();
        }
    }

    @Override // com.ninja.engine.InterfaceC1322oOooo0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00O0OO o00o0oo = this.OooO0OO;
        o00o0oo.OooOO0o(colorStateList);
        o00o0oo.OooO0O0();
    }

    @Override // com.ninja.engine.InterfaceC1322oOooo0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00O0OO o00o0oo = this.OooO0OO;
        o00o0oo.OooOOO0(mode);
        o00o0oo.OooO0O0();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            if (c0086o000Oo00.OooO0o0) {
                c0086o000Oo00.OooO0o0 = false;
                return;
            }
            c0086o000Oo00.OooO0o0 = true;
            c0086o000Oo00.OooO00o();
        }
    }
}


