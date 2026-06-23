package com.ninja.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* renamed from: com.ninja.engine.oo0oOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1589oo0oOO0 extends TextView implements InterfaceC1322oOooo0 {
    public final o0000OO0 OooO00o;
    public final o00O0OO OooO0O0;
    public final C0415o0Oo0O0O OooO0OO;
    public C0116o000ooO0 OooO0Oo;
    public C0331o0O0oo OooO0o;
    public boolean OooO0o0;
    public Future OooO0oO;

    public C1589oo0oOO0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
    void super_setFirstBaselineToTopHeight(int i) { super.setFirstBaselineToTopHeight(i); }
    void super_setLastBaselineToBottomHeight(int i) { super.setLastBaselineToBottomHeight(i); }
    void super_setLineHeight(int i, float f) { super.setLineHeight(i, f); }

    private C0116o000ooO0 getEmojiTextViewHelper() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new C0116o000ooO0(this);
        }
        return this.OooO0Oo;
    }

    public final void OooOOO0() {
        Future future = this.OooO0oO;
        if (future != null) {
            try {
                this.OooO0oO = null;
                AbstractC1230oOoOo0o.OooOO0O(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC1094oOOoOOo0.OooO(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public o00O0OOO getSuperCaller() {
        C0331o0O0oo c0331o0O0oo;
        if (this.OooO0o == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                c0331o0O0oo = new C0128o00O0Oo0(this);
            } else if (i >= 28) {
                c0331o0O0oo = new C0126o00O0OOo(this);
            } else if (i >= 26) {
                c0331o0O0oo = new C0331o0O0oo(3, this);
            }
            this.OooO0o = c0331o0O0oo;
        }
        return this.OooO0o;
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
    public CharSequence getText() {
        OooOOO0();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0415o0Oo0O0O c0415o0Oo0O0O;
        if (Build.VERSION.SDK_INT < 28 && (c0415o0Oo0O0O = this.OooO0OO) != null) {
            TextClassifier textClassifier = (TextClassifier) c0415o0Oo0O0O.OooO0OO;
            if (textClassifier == null) {
                return o00O0.OooO00o((TextView) c0415o0Oo0O0O.OooO0O0);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public C0998oOOOO0o0 getTextMetricsParamsCompat() {
        return AbstractC1094oOOoOOo0.OooO(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.OooO0O0.getClass();
        o00O0OO.OooO0oo(this, onCreateInputConnection, editorInfo);
        AbstractC0809oO0OooOO.OoooOO0(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null && !AbstractC1479oo0O0oOo.OooO0OO) {
            o00o0oo.OooO.OooO00o();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        OooOOO0();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0692o0ooooOo.OooOo0(context, i) : null, i2 != 0 ? AbstractC0692o0ooooOo.OooOo0(context, i2) : null, i3 != 0 ? AbstractC0692o0ooooOo.OooOo0(context, i3) : null, i4 != 0 ? AbstractC0692o0ooooOo.OooOo0(context, i4) : null);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0692o0ooooOo.OooOo0(context, i) : null, i2 != 0 ? AbstractC0692o0ooooOo.OooOo0(context, i2) : null, i3 != 0 ? AbstractC0692o0ooooOo.OooOo0(context, i3) : null, i4 != 0 ? AbstractC0692o0ooooOo.OooOo0(context, i4) : null);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooOOo(i);
        } else {
            AbstractC1094oOOoOOo0.OooOo00(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooO0o(i);
        } else {
            AbstractC1094oOOoOOo0.OooOo0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC1094oOOoOOo0.OooOo0O(this, i);
    }

    public void setPrecomputedText(AbstractC0997oOOOO0o abstractC0997oOOOO0o) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC1094oOOoOOo0.OooO(this);
        throw null;
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0oO(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0415o0Oo0O0O c0415o0Oo0O0O;
        if (Build.VERSION.SDK_INT >= 28 || (c0415o0Oo0O0O = this.OooO0OO) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0415o0Oo0O0O.OooO0OO = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0997oOOOO0o> future) {
        this.OooO0oO = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0998oOOOO0o0 c0998oOOOO0o0) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0998oOOOO0o0.OooO0O0;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        int i2 = Build.VERSION.SDK_INT;
        TextPaint textPaint = c0998oOOOO0o0.OooO00o;
        if (i2 < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        AbstractC0121o000oooo.OooOOO0(this, c0998oOOOO0o0.OooO0OO);
        AbstractC0121o000oooo.OooOOOo(this, c0998oOOOO0o0.OooO0Oo);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.OooO0o0) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            AbstractC1091oOOoOOOO abstractC1091oOOoOOOO = AbstractC1367oo000OOO.OooO00o;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.OooO0o0 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.OooO0o0 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589oo0oOO0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1320oOooOooo.OooO00o(context);
        this.OooO0o0 = false;
        this.OooO0o = null;
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        o0000OO0 o0000oo0 = new o0000OO0(this);
        this.OooO00o = o0000oo0;
        o0000oo0.OooOO0O(attributeSet, i);
        o00O0OO o00o0oo = new o00O0OO(this);
        this.OooO0O0 = o00o0oo;
        o00o0oo.OooO0o(attributeSet, i);
        o00o0oo.OooO0O0();
        C0415o0Oo0O0O c0415o0Oo0O0O = new C0415o0Oo0O0O(6, false);
        c0415o0Oo0O0O.OooO0O0 = this;
        this.OooO0OO = c0415o0Oo0O0O;
        getEmojiTextViewHelper().OooO00o(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().OooOo0o(i, f);
        } else if (i2 >= 34) {
            AbstractC0040OoooO0.OooO0oo(this, i, f);
        } else {
            AbstractC1094oOOoOOo0.OooOo0O(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }
}


