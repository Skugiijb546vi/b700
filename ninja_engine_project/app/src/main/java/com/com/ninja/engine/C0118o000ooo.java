package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
/* renamed from: com.ninja.engine.o000ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118o000ooo extends MultiAutoCompleteTextView implements InterfaceC1322oOooo0 {
    public static final int[] OooO0Oo = {16843126};
    public final o0000OO0 OooO00o;
    public final o00O0OO OooO0O0;
    public final C0415o0Oo0O0O OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0118o000ooo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        AbstractC1320oOooOooo.OooO00o(context);
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(getContext(), attributeSet, OooO0Oo, R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) Oooo0O0.OooO0O0).hasValue(0)) {
            setDropDownBackgroundDrawable(Oooo0O0.OooOo0o(0));
        }
        Oooo0O0.Oooo0o0();
        o0000OO0 o0000oo0 = new o0000OO0(this);
        this.OooO00o = o0000oo0;
        o0000oo0.OooOO0O(attributeSet, R.attr.autoCompleteTextViewStyle);
        o00O0OO o00o0oo = new o00O0OO(this);
        this.OooO0O0 = o00o0oo;
        o00o0oo.OooO0o(attributeSet, R.attr.autoCompleteTextViewStyle);
        o00o0oo.OooO0O0();
        C0415o0Oo0O0O c0415o0Oo0O0O = new C0415o0Oo0O0O(this, 5);
        this.OooO0OO = c0415o0Oo0O0O;
        c0415o0Oo0O0O.Oooo00O(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener OooOooO = c0415o0Oo0O0O.OooOooO(keyListener);
            if (OooOooO != keyListener) {
                super.setKeyListener(OooOooO);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0809oO0OooOO.OoooOO0(onCreateInputConnection, editorInfo, this);
        return this.OooO0OO.Oooo00o(onCreateInputConnection, editorInfo);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.OooO0OO.Oooo0oo(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.OooO0OO.OooOooO(keyListener));
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
}
