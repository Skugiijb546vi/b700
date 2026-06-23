package com.ninja.engine;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o0o000O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495o0o000O0 extends LinearLayout {
    public int OooO;
    public final TextInputLayout OooO00o;
    public final FrameLayout OooO0O0;
    public final CheckableImageButton OooO0OO;
    public ColorStateList OooO0Oo;
    public View.OnLongClickListener OooO0o;
    public PorterDuff.Mode OooO0o0;
    public final CheckableImageButton OooO0oO;
    public final C0492o0o000 OooO0oo;
    public final LinkedHashSet OooOO0;
    public ColorStateList OooOO0O;
    public PorterDuff.Mode OooOO0o;
    public ImageView.ScaleType OooOOO;
    public int OooOOO0;
    public View.OnLongClickListener OooOOOO;
    public CharSequence OooOOOo;
    public boolean OooOOo;
    public final C1589oo0oOO0 OooOOo0;
    public EditText OooOOoo;
    public C0435o0OoO000 OooOo0;
    public final AccessibilityManager OooOo00;
    public final C0559o0o0o00O OooOo0O;

    public C0495o0o000O0(TextInputLayout textInputLayout, C0131o00O0o c0131o00O0o) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.OooO = 0;
        this.OooOO0 = new LinkedHashSet();
        this.OooOo0O = new C0559o0o0o00O(this);
        C0493o0o0000o c0493o0o0000o = new C0493o0o0000o(this);
        this.OooOo00 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.OooO00o = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.OooO0O0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton OooO00o = OooO00o(this, from, R.id.text_input_error_icon);
        this.OooO0OO = OooO00o;
        CheckableImageButton OooO00o2 = OooO00o(frameLayout, from, R.id.text_input_end_icon);
        this.OooO0oO = OooO00o2;
        this.OooO0oo = new C0492o0o000(this, c0131o00O0o);
        C1589oo0oOO0 c1589oo0oOO0 = new C1589oo0oOO0(getContext(), null);
        this.OooOOo0 = c1589oo0oOO0;
        TypedArray typedArray = (TypedArray) c0131o00O0o.OooO0O0;
        if (typedArray.hasValue(38)) {
            this.OooO0Oo = AbstractC0809oO0OooOO.OooOooo(getContext(), c0131o00O0o, 38);
        }
        if (typedArray.hasValue(39)) {
            this.OooO0o0 = AbstractC1091oOOoOOOO.OooOoo0(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            OooO(c0131o00O0o.OooOo0o(37));
        }
        OooO00o.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        OooO00o.setImportantForAccessibility(2);
        OooO00o.setClickable(false);
        OooO00o.setPressable(false);
        OooO00o.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.OooOO0O = AbstractC0809oO0OooOO.OooOooo(getContext(), c0131o00O0o, 32);
            }
            if (typedArray.hasValue(33)) {
                this.OooOO0o = AbstractC1091oOOoOOOO.OooOoo0(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            OooO0oO(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && OooO00o2.getContentDescription() != (text = typedArray.getText(27))) {
                OooO00o2.setContentDescription(text);
            }
            OooO00o2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.OooOO0O = AbstractC0809oO0OooOO.OooOooo(getContext(), c0131o00O0o, 54);
            }
            if (typedArray.hasValue(55)) {
                this.OooOO0o = AbstractC1091oOOoOOOO.OooOoo0(typedArray.getInt(55, -1), null);
            }
            OooO0oO(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (OooO00o2.getContentDescription() != text2) {
                OooO00o2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.OooOOO0) {
                this.OooOOO0 = dimensionPixelSize;
                OooO00o2.setMinimumWidth(dimensionPixelSize);
                OooO00o2.setMinimumHeight(dimensionPixelSize);
                OooO00o.setMinimumWidth(dimensionPixelSize);
                OooO00o.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType OooOo0o = AbstractC0809oO0OooOO.OooOo0o(typedArray.getInt(31, -1));
                this.OooOOO = OooOo0o;
                OooO00o2.setScaleType(OooOo0o);
                OooO00o.setScaleType(OooOo0o);
            }
            c1589oo0oOO0.setVisibility(8);
            c1589oo0oOO0.setId(R.id.textinput_suffix_text);
            c1589oo0oOO0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            c1589oo0oOO0.setAccessibilityLiveRegion(1);
            AbstractC1094oOOoOOo0.OooOo0o(c1589oo0oOO0, typedArray.getResourceId(72, 0));
            if (typedArray.hasValue(73)) {
                c1589oo0oOO0.setTextColor(c0131o00O0o.OooOo0O(73));
            }
            CharSequence text3 = typedArray.getText(71);
            this.OooOOOo = TextUtils.isEmpty(text3) ? null : text3;
            c1589oo0oOO0.setText(text3);
            OooOOO();
            frameLayout.addView(OooO00o2);
            addView(c1589oo0oOO0);
            addView(frameLayout);
            addView(OooO00o);
            textInputLayout.Ooooo00.add(c0493o0o0000o);
            if (textInputLayout.OooO0Oo != null) {
                c0493o0o0000o.OooO00o(textInputLayout);
            }
            addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0274o00ooo00(1, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final void OooO(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.OooO0OO;
        checkableImageButton.setImageDrawable(drawable);
        OooOO0o();
        AbstractC0809oO0OooOO.OooO0Oo(this.OooO00o, checkableImageButton, this.OooO0Oo, this.OooO0o0);
    }

    public final CheckableImageButton OooO00o(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(AbstractC1143oOOooooO.OooO00o(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        if (AbstractC0809oO0OooOO.Oooo(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final AbstractC0494o0o000O OooO0O0() {
        AbstractC0494o0o000O c0338o0O0ooo;
        int i = this.OooO;
        C0492o0o000 c0492o0o000 = this.OooO0oo;
        SparseArray sparseArray = c0492o0o000.OooO00o;
        AbstractC0494o0o000O abstractC0494o0o000O = (AbstractC0494o0o000O) sparseArray.get(i);
        if (abstractC0494o0o000O == null) {
            C0495o0o000O0 c0495o0o000O0 = c0492o0o000.OooO0O0;
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c0338o0O0ooo = new C0434o0OoO0(c0495o0o000O0);
                            } else {
                                throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Invalid end icon mode: "));
                            }
                        } else {
                            c0338o0O0ooo = new C0293o0O00o0o(c0495o0o000O0);
                        }
                    } else {
                        abstractC0494o0o000O = new C0990oOOO0ooO(c0495o0o000O0, c0492o0o000.OooO0Oo);
                        sparseArray.append(i, abstractC0494o0o000O);
                    }
                } else {
                    c0338o0O0ooo = new C0338o0O0ooo(c0495o0o000O0, 1);
                }
            } else {
                c0338o0O0ooo = new C0338o0O0ooo(c0495o0o000O0, 0);
            }
            abstractC0494o0o000O = c0338o0O0ooo;
            sparseArray.append(i, abstractC0494o0o000O);
        }
        return abstractC0494o0o000O;
    }

    public final int OooO0OO() {
        int marginStart;
        if (!OooO0Oo() && !OooO0o0()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.OooO0oO;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        return this.OooOOo0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean OooO0Oo() {
        if (this.OooO0O0.getVisibility() == 0 && this.OooO0oO.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void OooO0o(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        AbstractC0494o0o000O OooO0O0 = OooO0O0();
        boolean OooOO0O = OooO0O0.OooOO0O();
        CheckableImageButton checkableImageButton = this.OooO0oO;
        boolean z4 = true;
        if (OooOO0O && (z3 = checkableImageButton.OooO0Oo) != OooO0O0.OooOO0o()) {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((OooO0O0 instanceof C0434o0OoO0) && (isActivated = checkableImageButton.isActivated()) != OooO0O0.OooOO0()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z4 = z2;
        }
        if (z || z4) {
            AbstractC0809oO0OooOO.OooooO0(this.OooO00o, checkableImageButton, this.OooOO0O);
        }
    }

    public final boolean OooO0o0() {
        if (this.OooO0OO.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void OooO0oO(int i) {
        boolean z;
        Drawable drawable;
        if (this.OooO == i) {
            return;
        }
        AbstractC0494o0o000O OooO0O0 = OooO0O0();
        C0435o0OoO000 c0435o0OoO000 = this.OooOo0;
        AccessibilityManager accessibilityManager = this.OooOo00;
        if (c0435o0OoO000 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0029OooOooo(c0435o0OoO000));
        }
        CharSequence charSequence = null;
        this.OooOo0 = null;
        OooO0O0.OooOOoo();
        this.OooO = i;
        Iterator it = this.OooOO0.iterator();
        if (!it.hasNext()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            OooO0oo(z);
            AbstractC0494o0o000O OooO0O02 = OooO0O0();
            int i2 = this.OooO0oo.OooO0OO;
            if (i2 == 0) {
                i2 = OooO0O02.OooO0Oo();
            }
            if (i2 != 0) {
                drawable = AbstractC0692o0ooooOo.OooOo0(getContext(), i2);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.OooO0oO;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.OooO00o;
            if (drawable != null) {
                AbstractC0809oO0OooOO.OooO0Oo(textInputLayout, checkableImageButton, this.OooOO0O, this.OooOO0o);
                AbstractC0809oO0OooOO.OooooO0(textInputLayout, checkableImageButton, this.OooOO0O);
            }
            int OooO0OO = OooO0O02.OooO0OO();
            if (OooO0OO != 0) {
                charSequence = getResources().getText(OooO0OO);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(OooO0O02.OooOO0O());
            if (OooO0O02.OooO(textInputLayout.getBoxBackgroundMode())) {
                OooO0O02.OooOOo();
                C0435o0OoO000 OooO0oo = OooO0O02.OooO0oo();
                this.OooOo0 = OooO0oo;
                if (OooO0oo != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    if (isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC0029OooOooo(this.OooOo0));
                    }
                }
                View.OnClickListener OooO0o = OooO0O02.OooO0o();
                View.OnLongClickListener onLongClickListener = this.OooOOOO;
                checkableImageButton.setOnClickListener(OooO0o);
                AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
                EditText editText = this.OooOOoo;
                if (editText != null) {
                    OooO0O02.OooOOO0(editText);
                    OooOO0(OooO0O02);
                }
                AbstractC0809oO0OooOO.OooO0Oo(textInputLayout, checkableImageButton, this.OooOO0O, this.OooOO0o);
                OooO0o(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        AbstractC1230oOoOo0o.OooOO0O(it.next());
        throw null;
    }

    public final void OooO0oo(boolean z) {
        int i;
        if (OooO0Oo() != z) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.OooO0oO.setVisibility(i);
            OooOO0O();
            OooOOO0();
            this.OooO00o.OooOOo0();
        }
    }

    public final void OooOO0(AbstractC0494o0o000O abstractC0494o0o000O) {
        if (this.OooOOoo == null) {
            return;
        }
        if (abstractC0494o0o000O.OooO0o0() != null) {
            this.OooOOoo.setOnFocusChangeListener(abstractC0494o0o000O.OooO0o0());
        }
        if (abstractC0494o0o000O.OooO0oO() != null) {
            this.OooO0oO.setOnFocusChangeListener(abstractC0494o0o000O.OooO0oO());
        }
    }

    public final void OooOO0O() {
        int i;
        char c;
        int i2 = 8;
        if (this.OooO0oO.getVisibility() == 0 && !OooO0o0()) {
            i = 0;
        } else {
            i = 8;
        }
        this.OooO0O0.setVisibility(i);
        if (this.OooOOOo != null && !this.OooOOo) {
            c = 0;
        } else {
            c = '\b';
        }
        setVisibility((OooO0Oo() || OooO0o0() || c == 0) ? 0 : 0);
    }

    public final void OooOO0o() {
        int i;
        CheckableImageButton checkableImageButton = this.OooO0OO;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.OooO00o;
        if (drawable != null && textInputLayout.OooOO0.OooOOo0 && textInputLayout.OooOOO0()) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        OooOO0O();
        OooOOO0();
        if (this.OooO == 0) {
            textInputLayout.OooOOo0();
        }
    }

    public final void OooOOO() {
        int i;
        C1589oo0oOO0 c1589oo0oOO0 = this.OooOOo0;
        int visibility = c1589oo0oOO0.getVisibility();
        boolean z = false;
        if (this.OooOOOo != null && !this.OooOOo) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            AbstractC0494o0o000O OooO0O0 = OooO0O0();
            if (i == 0) {
                z = true;
            }
            OooO0O0.OooOOOo(z);
        }
        OooOO0O();
        c1589oo0oOO0.setVisibility(i);
        this.OooO00o.OooOOo0();
    }

    public final void OooOOO0() {
        int i;
        TextInputLayout textInputLayout = this.OooO00o;
        if (textInputLayout.OooO0Oo == null) {
            return;
        }
        if (!OooO0Oo() && !OooO0o0()) {
            EditText editText = textInputLayout.OooO0Oo;
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            i = editText.getPaddingEnd();
        } else {
            i = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.OooO0Oo.getPaddingTop();
        int paddingBottom = textInputLayout.OooO0Oo.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
        this.OooOOo0.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }
}
