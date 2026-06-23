package com.ninja.engine;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOoOoooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250oOoOoooO extends LinearLayout {
    public View.OnLongClickListener OooO;
    public final TextInputLayout OooO00o;
    public final C1589oo0oOO0 OooO0O0;
    public CharSequence OooO0OO;
    public final CheckableImageButton OooO0Oo;
    public PorterDuff.Mode OooO0o;
    public ColorStateList OooO0o0;
    public int OooO0oO;
    public ImageView.ScaleType OooO0oo;
    public boolean OooOO0;

    public C1250oOoOoooO(TextInputLayout textInputLayout, C0131o00O0o c0131o00O0o) {
        super(textInputLayout.getContext());
        CharSequence text;
        Drawable OooO0O0;
        this.OooO00o = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.OooO0Oo = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            OooO0O0 = AbstractC1143oOOooooO.OooO0O0(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics()));
            checkableImageButton.setBackground(OooO0O0);
        }
        C1589oo0oOO0 c1589oo0oOO0 = new C1589oo0oOO0(getContext(), null);
        this.OooO0O0 = c1589oo0oOO0;
        if (AbstractC0809oO0OooOO.Oooo(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.OooO;
        checkableImageButton.setOnClickListener(null);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
        this.OooO = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0131o00O0o.OooO0O0;
        if (typedArray.hasValue(69)) {
            this.OooO0o0 = AbstractC0809oO0OooOO.OooOooo(getContext(), c0131o00O0o, 69);
        }
        if (typedArray.hasValue(70)) {
            this.OooO0o = AbstractC1091oOOoOOOO.OooOoo0(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            OooO0O0(c0131o00O0o.OooOo0o(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.OooO0oO) {
                this.OooO0oO = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(68)) {
                ImageView.ScaleType OooOo0o = AbstractC0809oO0OooOO.OooOo0o(typedArray.getInt(68, -1));
                this.OooO0oo = OooOo0o;
                checkableImageButton.setScaleType(OooOo0o);
            }
            c1589oo0oOO0.setVisibility(8);
            c1589oo0oOO0.setId(R.id.textinput_prefix_text);
            c1589oo0oOO0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            c1589oo0oOO0.setAccessibilityLiveRegion(1);
            AbstractC1094oOOoOOo0.OooOo0o(c1589oo0oOO0, typedArray.getResourceId(60, 0));
            if (typedArray.hasValue(61)) {
                c1589oo0oOO0.setTextColor(c0131o00O0o.OooOo0O(61));
            }
            CharSequence text2 = typedArray.getText(59);
            this.OooO0OO = TextUtils.isEmpty(text2) ? null : text2;
            c1589oo0oOO0.setText(text2);
            OooO0o0();
            addView(checkableImageButton);
            addView(c1589oo0oOO0);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int OooO00o() {
        int i;
        CheckableImageButton checkableImageButton = this.OooO0Oo;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        return this.OooO0O0.getPaddingStart() + getPaddingStart() + i;
    }

    public final void OooO0O0(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.OooO0Oo;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.OooO0o0;
            PorterDuff.Mode mode = this.OooO0o;
            TextInputLayout textInputLayout = this.OooO00o;
            AbstractC0809oO0OooOO.OooO0Oo(textInputLayout, checkableImageButton, colorStateList, mode);
            OooO0OO(true);
            AbstractC0809oO0OooOO.OooooO0(textInputLayout, checkableImageButton, this.OooO0o0);
            return;
        }
        OooO0OO(false);
        View.OnLongClickListener onLongClickListener = this.OooO;
        checkableImageButton.setOnClickListener(null);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
        this.OooO = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void OooO0OO(boolean z) {
        boolean z2;
        CheckableImageButton checkableImageButton = this.OooO0Oo;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            OooO0Oo();
            OooO0o0();
        }
    }

    public final void OooO0Oo() {
        int paddingStart;
        EditText editText = this.OooO00o.OooO0Oo;
        if (editText == null) {
            return;
        }
        if (this.OooO0Oo.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
        this.OooO0O0.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void OooO0o0() {
        int i;
        int i2 = 8;
        if (this.OooO0OO != null && !this.OooOO0) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility((this.OooO0Oo.getVisibility() == 0 || i == 0) ? 0 : 0);
        this.OooO0O0.setVisibility(i);
        this.OooO00o.OooOOo0();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0Oo();
    }
}
