package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oO00Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715oO00Oo {
    public LinearLayout OooO;
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final TimeInterpolator OooO0Oo;
    public final TimeInterpolator OooO0o;
    public final TimeInterpolator OooO0o0;
    public final Context OooO0oO;
    public final TextInputLayout OooO0oo;
    public int OooOO0;
    public FrameLayout OooOO0O;
    public Animator OooOO0o;
    public int OooOOO;
    public final float OooOOO0;
    public int OooOOOO;
    public CharSequence OooOOOo;
    public C1589oo0oOO0 OooOOo;
    public boolean OooOOo0;
    public CharSequence OooOOoo;
    public boolean OooOo;
    public int OooOo0;
    public int OooOo00;
    public ColorStateList OooOo0O;
    public CharSequence OooOo0o;
    public int OooOoO;
    public C1589oo0oOO0 OooOoO0;
    public ColorStateList OooOoOO;
    public Typeface OooOoo0;

    public C0715oO00Oo(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.OooO0oO = context;
        this.OooO0oo = textInputLayout;
        this.OooOOO0 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.OooO00o = AbstractC0809oO0OooOO.OooooOO(context, R.attr.motionDurationShort4, 217);
        this.OooO0O0 = AbstractC0809oO0OooOO.OooooOO(context, R.attr.motionDurationMedium4, 167);
        this.OooO0OO = AbstractC0809oO0OooOO.OooooOO(context, R.attr.motionDurationShort4, 167);
        this.OooO0Oo = AbstractC0809oO0OooOO.OooooOo(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, o000OO0O.OooO0Oo);
        LinearInterpolator linearInterpolator = o000OO0O.OooO00o;
        this.OooO0o0 = AbstractC0809oO0OooOO.OooooOo(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.OooO0o = AbstractC0809oO0OooOO.OooooOo(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void OooO(int i, int i2, boolean z) {
        TextView OooO0o0;
        TextView OooO0o02;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.OooOO0o = animatorSet;
            ArrayList arrayList = new ArrayList();
            OooO0Oo(arrayList, this.OooOo, this.OooOoO0, 2, i, i2);
            OooO0Oo(arrayList, this.OooOOo0, this.OooOOo, 1, i, i2);
            AbstractC0692o0ooooOo.Oooo(animatorSet, arrayList);
            animatorSet.addListener(new C0716oO00Oo0O(this, i2, OooO0o0(i), i, OooO0o0(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (OooO0o02 = OooO0o0(i2)) != null) {
                OooO0o02.setVisibility(0);
                OooO0o02.setAlpha(1.0f);
            }
            if (i != 0 && (OooO0o0 = OooO0o0(i)) != null) {
                OooO0o0.setVisibility(4);
                if (i == 1) {
                    OooO0o0.setText((CharSequence) null);
                }
            }
            this.OooOOO = i2;
        }
        TextInputLayout textInputLayout = this.OooO0oo;
        textInputLayout.OooOOo();
        textInputLayout.OooOo0(z, false);
        textInputLayout.OooOo();
    }

    public final void OooO00o(TextView textView, int i) {
        if (this.OooO == null && this.OooOO0O == null) {
            Context context = this.OooO0oO;
            LinearLayout linearLayout = new LinearLayout(context);
            this.OooO = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.OooO;
            TextInputLayout textInputLayout = this.OooO0oo;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.OooOO0O = new FrameLayout(context);
            this.OooO.addView(this.OooOO0O, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                OooO0O0();
            }
        }
        if (i != 0 && i != 1) {
            this.OooO.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.OooOO0O.setVisibility(0);
            this.OooOO0O.addView(textView);
        }
        this.OooO.setVisibility(0);
        this.OooOO0++;
    }

    public final void OooO0O0() {
        if (this.OooO != null) {
            TextInputLayout textInputLayout = this.OooO0oo;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.OooO0oO;
                boolean Oooo = AbstractC0809oO0OooOO.Oooo(context);
                LinearLayout linearLayout = this.OooO;
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                int paddingStart = editText.getPaddingStart();
                if (Oooo) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (Oooo) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (Oooo) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void OooO0OO() {
        Animator animator = this.OooOO0o;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void OooO0Oo(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        float f;
        long j;
        TimeInterpolator timeInterpolator;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                int i4 = this.OooO0OO;
                if (z2) {
                    j = this.OooO0O0;
                } else {
                    j = i4;
                }
                ofFloat.setDuration(j);
                if (z2) {
                    timeInterpolator = this.OooO0o0;
                } else {
                    timeInterpolator = this.OooO0o;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    ofFloat.setStartDelay(i4);
                }
                arrayList.add(ofFloat);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.OooOOO0, 0.0f);
                    ofFloat2.setDuration(this.OooO00o);
                    ofFloat2.setInterpolator(this.OooO0Oo);
                    ofFloat2.setStartDelay(i4);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final void OooO0o() {
        int i;
        this.OooOOOo = null;
        OooO0OO();
        if (this.OooOOO == 1) {
            if (this.OooOo && !TextUtils.isEmpty(this.OooOo0o)) {
                i = 2;
            } else {
                i = 0;
            }
            this.OooOOOO = i;
        }
        OooO(this.OooOOO, this.OooOOOO, OooO0oo(this.OooOOo, ""));
    }

    public final TextView OooO0o0(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.OooOoO0;
        }
        return this.OooOOo;
    }

    public final void OooO0oO(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.OooO;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.OooOO0O) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i2 = this.OooOO0 - 1;
        this.OooOO0 = i2;
        LinearLayout linearLayout2 = this.OooO;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean OooO0oo(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        TextInputLayout textInputLayout = this.OooO0oo;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled() && (this.OooOOOO != this.OooOOO || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }
}


