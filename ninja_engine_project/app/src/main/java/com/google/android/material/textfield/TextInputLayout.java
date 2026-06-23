package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.framework.utils.FileUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.ninja.engine.AbstractC0018OooOOo0;
import com.ninja.engine.AbstractC0420o0Oo0Oo;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1091oOOoOOOO;
import com.ninja.engine.AbstractC1094oOOoOOo0;
import com.ninja.engine.AbstractC1349oo000;
import com.ninja.engine.AbstractC1453oo0O00O;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0017OooOOo;
import com.ninja.engine.C0113o000oo0O;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0188o00o0;
import com.ninja.engine.C0251o00oo000;
import com.ninja.engine.C0260o00ooO;
import com.ninja.engine.C0331o0O0oo;
import com.ninja.engine.C0386o0OOoO;
import com.ninja.engine.C0455o0OoOo00;
import com.ninja.engine.C0493o0o0000o;
import com.ninja.engine.C0495o0o000O0;
import com.ninja.engine.C0551o0o0Oo00;
import com.ninja.engine.C0715oO00Oo;
import com.ninja.engine.C0717oO00Oo0o;
import com.ninja.engine.C0841oO0oO;
import com.ninja.engine.C0868oO0oOoO;
import com.ninja.engine.C0875oO0oOooo;
import com.ninja.engine.C1135oOOooo00;
import com.ninja.engine.C1198oOoOOO;
import com.ninja.engine.C1204oOoOOOO0;
import com.ninja.engine.C1250oOoOoooO;
import com.ninja.engine.C1299oOooO0oO;
import com.ninja.engine.C1301oOooOO;
import com.ninja.engine.C1302oOooOO0;
import com.ninja.engine.C1304oOooOO0O;
import com.ninja.engine.C1589oo0oOO0;
import com.ninja.engine.InterfaceC0336o0O0ooO0;
import com.ninja.engine.InterfaceC1305oOooOO0o;
import com.ninja.engine.R;
import com.ninja.engine.RunnableC0061o00000oO;
import com.ninja.engine.o00000OO;
import com.ninja.engine.o000OO0O;
import com.ninja.engine.o0O0O0O;
import com.ninja.engine.o0O0OO0;
import com.ninja.engine.o0OO000;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] o0OO00O = {new int[]{16842919}, new int[0]};
    public int OooO;
    public final FrameLayout OooO00o;
    public final C1250oOoOoooO OooO0O0;
    public final C0495o0o000O0 OooO0OO;
    public EditText OooO0Oo;
    public int OooO0o;
    public CharSequence OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public final C0715oO00Oo OooOO0;
    public boolean OooOO0O;
    public int OooOO0o;
    public InterfaceC1305oOooOO0o OooOOO;
    public boolean OooOOO0;
    public C1589oo0oOO0 OooOOOO;
    public int OooOOOo;
    public CharSequence OooOOo;
    public int OooOOo0;
    public boolean OooOOoo;
    public C0551o0o0Oo00 OooOo;
    public ColorStateList OooOo0;
    public C1589oo0oOO0 OooOo00;
    public int OooOo0O;
    public C0551o0o0Oo00 OooOo0o;
    public ColorStateList OooOoO;
    public ColorStateList OooOoO0;
    public ColorStateList OooOoOO;
    public boolean OooOoo;
    public ColorStateList OooOoo0;
    public CharSequence OooOooO;
    public boolean OooOooo;
    public int Oooo;
    public boolean Oooo0;
    public C0875oO0oOooo Oooo000;
    public C0875oO0oOooo Oooo00O;
    public StateListDrawable Oooo00o;
    public C0875oO0oOooo Oooo0O0;
    public C0875oO0oOooo Oooo0OO;
    public boolean Oooo0o;
    public C1204oOoOOOO0 Oooo0o0;
    public final int Oooo0oO;
    public int Oooo0oo;
    public int OoooO;
    public int OoooO0;
    public int OoooO00;
    public int OoooO0O;
    public int OoooOO0;
    public final Rect OoooOOO;
    public final RectF OoooOOo;
    public Typeface OoooOo0;
    public ColorDrawable OoooOoO;
    public int OoooOoo;
    public final LinkedHashSet Ooooo00;
    public ColorDrawable Ooooo0o;
    public int OooooO0;
    public Drawable OooooOO;
    public ColorStateList OooooOo;
    public int Oooooo;
    public ColorStateList Oooooo0;
    public int OoooooO;
    public int Ooooooo;
    public final Rect o000oOoO;
    public int o00O0O;
    public int o00Oo0;
    public int o00Ooo;
    public int o00o0O;
    public boolean o00oO0O;
    public final o0O0O0O o00oO0o;
    public int o00ooo;
    public boolean o0OOO0o;
    public boolean o0Oo0oo;
    public ColorStateList o0OoOo0;
    public boolean o0ooOO0;
    public ValueAnimator o0ooOOo;
    public boolean o0ooOoO;
    public boolean oo000o;
    public int ooOO;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.textInputStyle, 2131952453), attributeSet, R.attr.textInputStyle);
        int colorForState;
        this.OooO0o = -1;
        this.OooO0oO = -1;
        this.OooO0oo = -1;
        this.OooO = -1;
        this.OooOO0 = new C0715oO00Oo(this);
        this.OooOOO = new C0386o0OOoO(2);
        this.o000oOoO = new Rect();
        this.OoooOOO = new Rect();
        this.OoooOOo = new RectF();
        this.Ooooo00 = new LinkedHashSet();
        o0O0O0O o0o0o0o = new o0O0O0O(this);
        this.o00oO0o = o0o0o0o;
        this.o0Oo0oo = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.OooO00o = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = o000OO0O.OooO00o;
        o0o0o0o.OoooO00 = linearInterpolator;
        o0o0o0o.OooO0oo(false);
        o0o0o0o.Oooo = linearInterpolator;
        o0o0o0o.OooO0oo(false);
        if (o0o0o0o.OooO0oO != 8388659) {
            o0o0o0o.OooO0oO = 8388659;
            o0o0o0o.OooO0oo(false);
        }
        C0131o00O0o Oooo0o0 = AbstractC0692o0ooooOo.Oooo0o0(context2, attributeSet, AbstractC1038oOOOoo0O.Oooo00O, R.attr.textInputStyle, 2131952453, 22, 20, 40, 45, 49);
        C1250oOoOoooO c1250oOoOoooO = new C1250oOoOoooO(this, Oooo0o0);
        this.OooO0O0 = c1250oOoOoooO;
        TypedArray typedArray = (TypedArray) Oooo0o0.OooO0O0;
        this.OooOoo = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.o0ooOO0 = typedArray.getBoolean(47, true);
        this.o00oO0O = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.Oooo0o0 = C1204oOoOOOO0.OooO0O0(context2, attributeSet, R.attr.textInputStyle, 2131952453).OooO00o();
        this.Oooo0oO = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.Oooo = typedArray.getDimensionPixelOffset(9, 0);
        this.OoooO0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.OoooO0O = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.OoooO00 = this.OoooO0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        C1198oOoOOO OooO0o0 = this.Oooo0o0.OooO0o0();
        if (dimension >= 0.0f) {
            OooO0o0.OooO0o0 = new C0017OooOOo(dimension);
        }
        if (dimension2 >= 0.0f) {
            OooO0o0.OooO0o = new C0017OooOOo(dimension2);
        }
        if (dimension3 >= 0.0f) {
            OooO0o0.OooO0oO = new C0017OooOOo(dimension3);
        }
        if (dimension4 >= 0.0f) {
            OooO0o0.OooO0oo = new C0017OooOOo(dimension4);
        }
        this.Oooo0o0 = OooO0o0.OooO00o();
        ColorStateList OooOooo = AbstractC0809oO0OooOO.OooOooo(context2, Oooo0o0, 7);
        if (OooOooo != null) {
            int defaultColor = OooOooo.getDefaultColor();
            this.ooOO = defaultColor;
            this.OoooOO0 = defaultColor;
            if (OooOooo.isStateful()) {
                this.o00O0O = OooOooo.getColorForState(new int[]{-16842910}, -1);
                this.o00Oo0 = OooOooo.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = OooOooo.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.o00Oo0 = this.ooOO;
                ColorStateList OooOoo = AbstractC0809oO0OooOO.OooOoo(context2, R.color.mtrl_filled_background_color);
                this.o00O0O = OooOoo.getColorForState(new int[]{-16842910}, -1);
                colorForState = OooOoo.getColorForState(new int[]{16843623}, -1);
            }
            this.o00Ooo = colorForState;
        } else {
            this.OoooOO0 = 0;
            this.ooOO = 0;
            this.o00O0O = 0;
            this.o00Oo0 = 0;
            this.o00Ooo = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList OooOo0O = Oooo0o0.OooOo0O(1);
            this.Oooooo0 = OooOo0O;
            this.OooooOo = OooOo0O;
        }
        ColorStateList OooOooo2 = AbstractC0809oO0OooOO.OooOooo(context2, Oooo0o0, 14);
        this.Ooooooo = typedArray.getColor(14, 0);
        this.Oooooo = AbstractC0809oO0OooOO.OooOoo0(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.o00o0O = AbstractC0809oO0OooOO.OooOoo0(context2, R.color.mtrl_textinput_disabled_color);
        this.OoooooO = AbstractC0809oO0OooOO.OooOoo0(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (OooOooo2 != null) {
            setBoxStrokeColorStateList(OooOooo2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0809oO0OooOO.OooOooo(context2, Oooo0o0, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.OooOoOO = Oooo0o0.OooOo0O(24);
        this.OooOoo0 = Oooo0o0.OooOo0O(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.OooOOo0 = typedArray.getResourceId(22, 0);
        this.OooOOOo = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.OooOOOo);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.OooOOo0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(Oooo0o0.OooOo0O(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(Oooo0o0.OooOo0O(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(Oooo0o0.OooOo0O(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(Oooo0o0.OooOo0O(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(Oooo0o0.OooOo0O(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(Oooo0o0.OooOo0O(58));
        }
        C0495o0o000O0 c0495o0o000O0 = new C0495o0o000O0(this, Oooo0o0);
        this.OooO0OO = c0495o0o000O0;
        boolean z4 = typedArray.getBoolean(0, true);
        Oooo0o0.Oooo0o0();
        setImportantForAccessibility(2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 >= 26) {
            AbstractC1453oo0O00O.OooO0O0(this, 1);
        }
        frameLayout.addView(c1250oOoOoooO);
        frameLayout.addView(c0495o0o000O0);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public static void OooOO0O(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                OooOO0O((ViewGroup) childAt, z);
            }
        }
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.OooO0Oo;
        if ((editText instanceof AutoCompleteTextView) && !AbstractC0694o0ooooo0.OooOooO(editText)) {
            int OooOo = AbstractC0694o0ooooo0.OooOo(this.OooO0Oo, R.attr.colorControlHighlight);
            int i2 = this.Oooo0oo;
            int[][] iArr = o0OO00O;
            if (i2 == 2) {
                Context context = getContext();
                C0875oO0oOooo c0875oO0oOooo = this.Oooo000;
                TypedValue OoooOo0 = AbstractC0692o0ooooOo.OoooOo0(context, "TextInputLayout", R.attr.colorSurface);
                int i3 = OoooOo0.resourceId;
                if (i3 != 0) {
                    i = AbstractC0809oO0OooOO.OooOoo0(context, i3);
                } else {
                    i = OoooOo0.data;
                }
                C0875oO0oOooo c0875oO0oOooo2 = new C0875oO0oOooo(c0875oO0oOooo.OooO00o.OooO00o);
                int Oooo000 = AbstractC0694o0ooooo0.Oooo000(OooOo, i, 0.1f);
                c0875oO0oOooo2.OooOO0o(new ColorStateList(iArr, new int[]{Oooo000, 0}));
                c0875oO0oOooo2.setTint(i);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{Oooo000, i});
                C0875oO0oOooo c0875oO0oOooo3 = new C0875oO0oOooo(c0875oO0oOooo.OooO00o.OooO00o);
                c0875oO0oOooo3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0875oO0oOooo2, c0875oO0oOooo3), c0875oO0oOooo});
            } else if (i2 == 1) {
                C0875oO0oOooo c0875oO0oOooo4 = this.Oooo000;
                int i4 = this.OoooOO0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0694o0ooooo0.Oooo000(OooOo, i4, 0.1f), i4}), c0875oO0oOooo4, c0875oO0oOooo4);
            } else {
                return null;
            }
        }
        return this.Oooo000;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.Oooo00o == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.Oooo00o = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.Oooo00o.addState(new int[0], OooO0o(false));
        }
        return this.Oooo00o;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.Oooo00O == null) {
            this.Oooo00O = OooO0o(true);
        }
        return this.Oooo00O;
    }

    private void setEditText(EditText editText) {
        if (this.OooO0Oo == null) {
            if (getEndIconMode() != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.OooO0Oo = editText;
            int i = this.OooO0o;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.OooO0oo);
            }
            int i2 = this.OooO0oO;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.OooO);
            }
            this.Oooo0 = false;
            OooO();
            setTextInputAccessibilityDelegate(new C1304oOooOO0O(this));
            Typeface typeface = this.OooO0Oo.getTypeface();
            o0O0O0O o0o0o0o = this.o00oO0o;
            o0o0o0o.OooOOO0(typeface);
            float textSize = this.OooO0Oo.getTextSize();
            if (o0o0o0o.OooO0oo != textSize) {
                o0o0o0o.OooO0oo = textSize;
                o0o0o0o.OooO0oo(false);
            }
            int i3 = Build.VERSION.SDK_INT;
            float letterSpacing = this.OooO0Oo.getLetterSpacing();
            if (o0o0o0o.OoooOOO != letterSpacing) {
                o0o0o0o.OoooOOO = letterSpacing;
                o0o0o0o.OooO0oo(false);
            }
            int gravity = this.OooO0Oo.getGravity();
            int i4 = (gravity & (-113)) | 48;
            if (o0o0o0o.OooO0oO != i4) {
                o0o0o0o.OooO0oO = i4;
                o0o0o0o.OooO0oo(false);
            }
            if (o0o0o0o.OooO0o != gravity) {
                o0o0o0o.OooO0o = gravity;
                o0o0o0o.OooO0oo(false);
            }
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            this.o00ooo = editText.getMinimumHeight();
            this.OooO0Oo.addTextChangedListener(new C1302oOooOO0(this, editText));
            if (this.OooooOo == null) {
                this.OooooOo = this.OooO0Oo.getHintTextColors();
            }
            if (this.OooOoo) {
                if (TextUtils.isEmpty(this.OooOooO)) {
                    CharSequence hint = this.OooO0Oo.getHint();
                    this.OooO0o0 = hint;
                    setHint(hint);
                    this.OooO0Oo.setHint((CharSequence) null);
                }
                this.OooOooo = true;
            }
            if (i3 >= 29) {
                OooOOOo();
            }
            if (this.OooOOOO != null) {
                OooOOO(this.OooO0Oo.getText());
            }
            OooOOo();
            this.OooOO0.OooO0O0();
            this.OooO0O0.bringToFront();
            C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
            c0495o0o000O0.bringToFront();
            Iterator it = this.Ooooo00.iterator();
            while (it.hasNext()) {
                ((C0493o0o0000o) it.next()).OooO00o(this);
            }
            c0495o0o000O0.OooOOO0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            OooOo0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.OooOooO)) {
            this.OooOooO = charSequence;
            o0O0O0O o0o0o0o = this.o00oO0o;
            if (charSequence == null || !TextUtils.equals(o0o0o0o.OooOoOO, charSequence)) {
                o0o0o0o.OooOoOO = charSequence;
                o0o0o0o.OooOoo0 = null;
                Bitmap bitmap = o0o0o0o.OooOooo;
                if (bitmap != null) {
                    bitmap.recycle();
                    o0o0o0o.OooOooo = null;
                }
                o0o0o0o.OooO0oo(false);
            }
            if (!this.oo000o) {
                OooOO0();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.OooOOoo == z) {
            return;
        }
        if (z) {
            C1589oo0oOO0 c1589oo0oOO0 = this.OooOo00;
            if (c1589oo0oOO0 != null) {
                this.OooO00o.addView(c1589oo0oOO0);
                this.OooOo00.setVisibility(0);
            }
        } else {
            C1589oo0oOO0 c1589oo0oOO02 = this.OooOo00;
            if (c1589oo0oOO02 != null) {
                c1589oo0oOO02.setVisibility(8);
            }
            this.OooOo00 = null;
        }
        this.OooOOoo = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooO():void");
    }

    public final void OooO00o(float f) {
        o0O0O0O o0o0o0o = this.o00oO0o;
        if (o0o0o0o.OooO0O0 == f) {
            return;
        }
        if (this.o0ooOOo == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.o0ooOOo = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0809oO0OooOO.OooooOo(getContext(), R.attr.motionEasingEmphasizedInterpolator, o000OO0O.OooO0O0));
            this.o0ooOOo.setDuration(AbstractC0809oO0OooOO.OooooOO(getContext(), R.attr.motionDurationMedium4, 167));
            this.o0ooOOo.addUpdateListener(new C0251o00oo000(2, this));
        }
        this.o0ooOOo.setFloatValues(o0o0o0o.OooO0O0, f);
        this.o0ooOOo.start();
    }

    public final void OooO0O0() {
        int i;
        int i2;
        int i3;
        C0875oO0oOooo c0875oO0oOooo = this.Oooo000;
        if (c0875oO0oOooo == null) {
            return;
        }
        C1204oOoOOOO0 c1204oOoOOOO0 = c0875oO0oOooo.OooO00o.OooO00o;
        C1204oOoOOOO0 c1204oOoOOOO02 = this.Oooo0o0;
        if (c1204oOoOOOO0 != c1204oOoOOOO02) {
            c0875oO0oOooo.setShapeAppearanceModel(c1204oOoOOOO02);
        }
        if (this.Oooo0oo == 2 && (i2 = this.OoooO00) > -1 && (i3 = this.OoooO) != 0) {
            C0875oO0oOooo c0875oO0oOooo2 = this.Oooo000;
            c0875oO0oOooo2.OooO00o.OooOO0O = i2;
            c0875oO0oOooo2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i3);
            C0868oO0oOoO c0868oO0oOoO = c0875oO0oOooo2.OooO00o;
            if (c0868oO0oOoO.OooO0Oo != valueOf) {
                c0868oO0oOoO.OooO0Oo = valueOf;
                c0875oO0oOooo2.onStateChange(c0875oO0oOooo2.getState());
            }
        }
        int i4 = this.OoooOO0;
        if (this.Oooo0oo == 1) {
            i4 = o0O0OO0.OooO0O0(this.OoooOO0, AbstractC0694o0ooooo0.OooOo0o(getContext(), R.attr.colorSurface, 0));
        }
        this.OoooOO0 = i4;
        this.Oooo000.OooOO0o(ColorStateList.valueOf(i4));
        C0875oO0oOooo c0875oO0oOooo3 = this.Oooo0O0;
        if (c0875oO0oOooo3 != null && this.Oooo0OO != null) {
            if (this.OoooO00 > -1 && this.OoooO != 0) {
                if (this.OooO0Oo.isFocused()) {
                    i = this.Oooooo;
                } else {
                    i = this.OoooO;
                }
                c0875oO0oOooo3.OooOO0o(ColorStateList.valueOf(i));
                this.Oooo0OO.OooOO0o(ColorStateList.valueOf(this.OoooO));
            }
            invalidate();
        }
        OooOOoo();
    }

    public final int OooO0OO() {
        float OooO0Oo;
        if (this.OooOoo) {
            int i = this.Oooo0oo;
            o0O0O0O o0o0o0o = this.o00oO0o;
            if (i == 0) {
                OooO0Oo = o0o0o0o.OooO0Oo();
            } else if (i != 2) {
                return 0;
            } else {
                OooO0Oo = o0o0o0o.OooO0Oo() / 2.0f;
            }
            return (int) OooO0Oo;
        }
        return 0;
    }

    public final C0551o0o0Oo00 OooO0Oo() {
        C0551o0o0Oo00 c0551o0o0Oo00 = new C0551o0o0Oo00();
        c0551o0o0Oo00.OooO0OO = AbstractC0809oO0OooOO.OooooOO(getContext(), R.attr.motionDurationShort2, 87);
        c0551o0o0Oo00.OooO0Oo = AbstractC0809oO0OooOO.OooooOo(getContext(), R.attr.motionEasingLinearInterpolator, o000OO0O.OooO00o);
        return c0551o0o0Oo00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.ninja.engine.oOoOOOO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.ninja.engine.o0ooooOo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.ninja.engine.o0ooooOo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.ninja.engine.o0ooooOo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.ninja.engine.o0ooooOo, java.lang.Object] */
    public final C0875oO0oOooo OooO0o(boolean z) {
        float f;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = 0.0f;
        }
        EditText editText = this.OooO0Oo;
        if (editText instanceof C0841oO0oO) {
            dimensionPixelOffset = ((C0841oO0oO) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        C0455o0OoOo00 c0455o0OoOo00 = new C0455o0OoOo00(0);
        C0455o0OoOo00 c0455o0OoOo002 = new C0455o0OoOo00(0);
        C0455o0OoOo00 c0455o0OoOo003 = new C0455o0OoOo00(0);
        C0455o0OoOo00 c0455o0OoOo004 = new C0455o0OoOo00(0);
        C0017OooOOo c0017OooOOo = new C0017OooOOo(f);
        C0017OooOOo c0017OooOOo2 = new C0017OooOOo(f);
        C0017OooOOo c0017OooOOo3 = new C0017OooOOo(dimensionPixelOffset2);
        C0017OooOOo c0017OooOOo4 = new C0017OooOOo(dimensionPixelOffset2);
        Object obj5 = new Object();
        obj5.OooO00o = obj;
        obj5.OooO0O0 = obj2;
        obj5.OooO0OO = obj3;
        obj5.OooO0Oo = obj4;
        obj5.OooO0o0 = c0017OooOOo;
        obj5.OooO0o = c0017OooOOo2;
        obj5.OooO0oO = c0017OooOOo4;
        obj5.OooO0oo = c0017OooOOo3;
        obj5.OooO = c0455o0OoOo00;
        obj5.OooOO0 = c0455o0OoOo002;
        obj5.OooOO0O = c0455o0OoOo003;
        obj5.OooOO0o = c0455o0OoOo004;
        EditText editText2 = this.OooO0Oo;
        if (editText2 instanceof C0841oO0oO) {
            colorStateList = ((C0841oO0oO) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = C0875oO0oOooo.OooOo0o;
            TypedValue OoooOo0 = AbstractC0692o0ooooOo.OoooOo0(context, C0875oO0oOooo.class.getSimpleName(), R.attr.colorSurface);
            int i2 = OoooOo0.resourceId;
            if (i2 != 0) {
                i = AbstractC0809oO0OooOO.OooOoo0(context, i2);
            } else {
                i = OoooOo0.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo();
        c0875oO0oOooo.OooOO0(context);
        c0875oO0oOooo.OooOO0o(colorStateList);
        c0875oO0oOooo.OooOO0O(dimensionPixelOffset);
        c0875oO0oOooo.setShapeAppearanceModel(obj5);
        C0868oO0oOoO c0868oO0oOoO = c0875oO0oOooo.OooO00o;
        if (c0868oO0oOoO.OooO0oo == null) {
            c0868oO0oOoO.OooO0oo = new Rect();
        }
        c0875oO0oOooo.OooO00o.OooO0oo.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        c0875oO0oOooo.invalidateSelf();
        return c0875oO0oOooo;
    }

    public final boolean OooO0o0() {
        return this.OooOoo && !TextUtils.isEmpty(this.OooOooO) && (this.Oooo000 instanceof o0OO000);
    }

    public final int OooO0oO(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.OooO0Oo.getCompoundPaddingLeft() : this.OooO0OO.OooO0OO() : this.OooO0O0.OooO00o()) + i;
    }

    public final int OooO0oo(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.OooO0Oo.getCompoundPaddingRight() : this.OooO0O0.OooO00o() : this.OooO0OO.OooO0OO());
    }

    public final void OooOO0() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        if (!OooO0o0()) {
            return;
        }
        int width = this.OooO0Oo.getWidth();
        int gravity = this.OooO0Oo.getGravity();
        o0O0O0O o0o0o0o = this.o00oO0o;
        boolean OooO0O0 = o0o0o0o.OooO0O0(o0o0o0o.OooOoOO);
        o0o0o0o.OooOoo = OooO0O0;
        Rect rect = o0o0o0o.OooO0Oo;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !OooO0O0 : OooO0O0) {
                f = rect.right;
                f2 = o0o0o0o.OoooOoO;
            } else {
                f3 = rect.left;
                float max = Math.max(f3, rect.left);
                rectF = this.OoooOOo;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (!o0o0o0o.OooOoo) {
                            f4 = o0o0o0o.OoooOoO + max;
                        }
                        f4 = rect.right;
                    } else {
                        if (o0o0o0o.OooOoo) {
                            f4 = max + o0o0o0o.OoooOoO;
                        }
                        f4 = rect.right;
                    }
                } else {
                    f4 = (width / 2.0f) + (o0o0o0o.OoooOoO / 2.0f);
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = o0o0o0o.OooO0Oo() + rect.top;
                if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                    float f5 = rectF.left;
                    float f6 = this.Oooo0oO;
                    rectF.left = f5 - f6;
                    rectF.right += f6;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.OoooO00);
                    o0OO000 o0oo000 = (o0OO000) this.Oooo000;
                    o0oo000.getClass();
                    o0oo000.OooOOOo(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
        } else {
            f = width / 2.0f;
            f2 = o0o0o0o.OoooOoO / 2.0f;
        }
        f3 = f - f2;
        float max2 = Math.max(f3, rect.left);
        rectF = this.OoooOOo;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f4 = (width / 2.0f) + (o0o0o0o.OoooOoO / 2.0f);
        rectF.right = Math.min(f4, rect.right);
        rectF.bottom = o0o0o0o.OooO0Oo() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    public final void OooOO0o(TextView textView, int i) {
        try {
            AbstractC1094oOOoOOo0.OooOo0o(textView, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            AbstractC1094oOOoOOo0.OooOo0o(textView, 2131952028);
            textView.setTextColor(AbstractC0809oO0OooOO.OooOoo0(getContext(), R.color.design_error));
        }
    }

    public final void OooOOO(Editable editable) {
        int i;
        boolean z;
        int i2;
        C0188o00o0 c0188o00o0;
        ((C0386o0OOoO) this.OooOOO).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z2 = this.OooOOO0;
        int i3 = this.OooOO0o;
        String str = null;
        if (i3 == -1) {
            this.OooOOOO.setText(String.valueOf(i));
            this.OooOOOO.setContentDescription(null);
            this.OooOOO0 = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.OooOOO0 = z;
            Context context = getContext();
            C1589oo0oOO0 c1589oo0oOO0 = this.OooOOOO;
            int i4 = this.OooOO0o;
            if (this.OooOOO0) {
                i2 = R.string.character_counter_overflowed_content_description;
            } else {
                i2 = R.string.character_counter_content_description;
            }
            c1589oo0oOO0.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z2 != this.OooOOO0) {
                OooOOOO();
            }
            String str2 = C0188o00o0.OooO0Oo;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                c0188o00o0 = C0188o00o0.OooO0oO;
            } else {
                c0188o00o0 = C0188o00o0.OooO0o;
            }
            C1589oo0oOO0 c1589oo0oOO02 = this.OooOOOO;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.OooOO0o));
            if (string == null) {
                c0188o00o0.getClass();
            } else {
                str = c0188o00o0.OooO0OO(string, c0188o00o0.OooO0OO).toString();
            }
            c1589oo0oOO02.setText(str);
        }
        if (this.OooO0Oo != null && z2 != this.OooOOO0) {
            OooOo0(false, false);
            OooOo();
            OooOOo();
        }
    }

    public final boolean OooOOO0() {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        if (c0715oO00Oo.OooOOOO == 1 && c0715oO00Oo.OooOOo != null && !TextUtils.isEmpty(c0715oO00Oo.OooOOOo)) {
            return true;
        }
        return false;
    }

    public final void OooOOOO() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1589oo0oOO0 c1589oo0oOO0 = this.OooOOOO;
        if (c1589oo0oOO0 != null) {
            OooOO0o(c1589oo0oOO0, this.OooOOO0 ? this.OooOOOo : this.OooOOo0);
            if (!this.OooOOO0 && (colorStateList2 = this.OooOoO0) != null) {
                this.OooOOOO.setTextColor(colorStateList2);
            }
            if (!this.OooOOO0 || (colorStateList = this.OooOoO) == null) {
                return;
            }
            this.OooOOOO.setTextColor(colorStateList);
        }
    }

    public final void OooOOOo() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.OooOoOO;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue OoooOOO = AbstractC0692o0ooooOo.OoooOOO(context, R.attr.colorControlActivated);
            if (OoooOOO != null) {
                int i = OoooOOO.resourceId;
                if (i != 0) {
                    colorStateList2 = AbstractC0809oO0OooOO.OooOoo(context, i);
                } else {
                    int i2 = OoooOOO.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.OooO0Oo;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.OooO0Oo.getTextCursorDrawable();
                Drawable mutate = AbstractC0809oO0OooOO.o0ooOoO(textCursorDrawable2).mutate();
                if ((OooOOO0() || (this.OooOOOO != null && this.OooOOO0)) && (colorStateList = this.OooOoo0) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    public final void OooOOo() {
        Drawable background;
        C1589oo0oOO0 c1589oo0oOO0;
        PorterDuffColorFilter OooO0OO;
        EditText editText = this.OooO0Oo;
        if (editText == null || this.Oooo0oo != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0420o0Oo0Oo.OooO00o;
        Drawable mutate = background.mutate();
        if (OooOOO0()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C0113o000oo0O.OooO0O0;
            synchronized (C0113o000oo0O.class) {
                OooO0OO = C1135oOOooo00.OooO0oo(errorCurrentTextColors, mode);
            }
        } else if (this.OooOOO0 && (c1589oo0oOO0 = this.OooOOOO) != null) {
            OooO0OO = C0113o000oo0O.OooO0OO(c1589oo0oOO0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
        } else {
            AbstractC0809oO0OooOO.OooOo0(mutate);
            this.OooO0Oo.refreshDrawableState();
            return;
        }
        mutate.setColorFilter(OooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOo0() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOOo0():boolean");
    }

    public final void OooOOoo() {
        EditText editText = this.OooO0Oo;
        if (editText != null && this.Oooo000 != null) {
            if ((this.Oooo0 || editText.getBackground() == null) && this.Oooo0oo != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.OooO0Oo;
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                editText2.setBackground(editTextBoxBackground);
                this.Oooo0 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOo() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOo():void");
    }

    public final void OooOo0(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        C1589oo0oOO0 c1589oo0oOO0;
        ColorStateList textColors;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.OooO0Oo;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.OooO0Oo;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ColorStateList colorStateList2 = this.OooooOo;
        o0O0O0O o0o0o0o = this.o00oO0o;
        if (colorStateList2 != null) {
            o0o0o0o.OooO(colorStateList2);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.OooooOo;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.o00o0O);
            } else {
                i = this.o00o0O;
            }
            o0o0o0o.OooO(ColorStateList.valueOf(i));
        } else {
            if (OooOOO0()) {
                C1589oo0oOO0 c1589oo0oOO02 = this.OooOO0.OooOOo;
                if (c1589oo0oOO02 != null) {
                    textColors = c1589oo0oOO02.getTextColors();
                } else {
                    textColors = null;
                }
            } else if (this.OooOOO0 && (c1589oo0oOO0 = this.OooOOOO) != null) {
                textColors = c1589oo0oOO0.getTextColors();
            } else if (z4 && (colorStateList = this.Oooooo0) != null && o0o0o0o.OooOO0O != colorStateList) {
                o0o0o0o.OooOO0O = colorStateList;
                o0o0o0o.OooO0oo(false);
            }
            o0o0o0o.OooO(textColors);
        }
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        C1250oOoOoooO c1250oOoOoooO = this.OooO0O0;
        if (!z3 && this.o00oO0O && (!isEnabled() || !z4)) {
            if (z2 || !this.oo000o) {
                ValueAnimator valueAnimator = this.o0ooOOo;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.o0ooOOo.cancel();
                }
                if (z && this.o0ooOO0) {
                    OooO00o(0.0f);
                } else {
                    o0o0o0o.OooOO0O(0.0f);
                }
                if (OooO0o0() && (!((o0OO000) this.Oooo000).OooOo.OooOo0O.isEmpty()) && OooO0o0()) {
                    ((o0OO000) this.Oooo000).OooOOOo(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.oo000o = true;
                C1589oo0oOO0 c1589oo0oOO03 = this.OooOo00;
                if (c1589oo0oOO03 != null && this.OooOOoo) {
                    c1589oo0oOO03.setText((CharSequence) null);
                    AbstractC1349oo000.OooO00o(this.OooO00o, this.OooOo);
                    this.OooOo00.setVisibility(4);
                }
                c1250oOoOoooO.OooOO0 = true;
                c1250oOoOoooO.OooO0o0();
                c0495o0o000O0.OooOOo = true;
                c0495o0o000O0.OooOOO();
            }
        } else if (z2 || this.oo000o) {
            ValueAnimator valueAnimator2 = this.o0ooOOo;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.o0ooOOo.cancel();
            }
            if (z && this.o0ooOO0) {
                OooO00o(1.0f);
            } else {
                o0o0o0o.OooOO0O(1.0f);
            }
            this.oo000o = false;
            if (OooO0o0()) {
                OooOO0();
            }
            EditText editText3 = this.OooO0Oo;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            OooOo0O(editable);
            c1250oOoOoooO.OooOO0 = false;
            c1250oOoOoooO.OooO0o0();
            c0495o0o000O0.OooOOo = false;
            c0495o0o000O0.OooOOO();
        }
    }

    public final void OooOo00() {
        if (this.Oooo0oo != 1) {
            FrameLayout frameLayout = this.OooO00o;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int OooO0OO = OooO0OO();
            if (OooO0OO != layoutParams.topMargin) {
                layoutParams.topMargin = OooO0OO;
                frameLayout.requestLayout();
            }
        }
    }

    public final void OooOo0O(Editable editable) {
        int i;
        ((C0386o0OOoO) this.OooOOO).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.OooO00o;
        if (i == 0 && !this.oo000o) {
            if (this.OooOo00 != null && this.OooOOoo && !TextUtils.isEmpty(this.OooOOo)) {
                this.OooOo00.setText(this.OooOOo);
                AbstractC1349oo000.OooO00o(frameLayout, this.OooOo0o);
                this.OooOo00.setVisibility(0);
                this.OooOo00.bringToFront();
                announceForAccessibility(this.OooOOo);
                return;
            }
            return;
        }
        C1589oo0oOO0 c1589oo0oOO0 = this.OooOo00;
        if (c1589oo0oOO0 != null && this.OooOOoo) {
            c1589oo0oOO0.setText((CharSequence) null);
            AbstractC1349oo000.OooO00o(frameLayout, this.OooOo);
            this.OooOo00.setVisibility(4);
        }
    }

    public final void OooOo0o(boolean z, boolean z2) {
        int defaultColor = this.o0OoOo0.getDefaultColor();
        int colorForState = this.o0OoOo0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.o0OoOo0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.OoooO = colorForState2;
        } else if (z2) {
            this.OoooO = colorForState;
        } else {
            this.OoooO = defaultColor;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.OooO00o;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        OooOo00();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.OooO0Oo;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.OooO0o0 != null) {
            boolean z = this.OooOooo;
            this.OooOooo = false;
            CharSequence hint = editText.getHint();
            this.OooO0Oo.setHint(this.OooO0o0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.OooO0Oo.setHint(hint);
                this.OooOooo = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.OooO00o;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.OooO0Oo) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.o0OOO0o = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.o0OOO0o = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0875oO0oOooo c0875oO0oOooo;
        int i;
        super.draw(canvas);
        boolean z = this.OooOoo;
        o0O0O0O o0o0o0o = this.o00oO0o;
        if (z) {
            o0o0o0o.getClass();
            int save = canvas.save();
            if (o0o0o0o.OooOoo0 != null) {
                RectF rectF = o0o0o0o.OooO0o0;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = o0o0o0o.Oooo0oO;
                    textPaint.setTextSize(o0o0o0o.Oooo00O);
                    float f = o0o0o0o.OooOOOo;
                    float f2 = o0o0o0o.OooOOo0;
                    float f3 = o0o0o0o.Oooo000;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (o0o0o0o.OooooO0 > 1 && !o0o0o0o.OooOoo) {
                        int alpha = textPaint.getAlpha();
                        canvas.translate(o0o0o0o.OooOOOo - o0o0o0o.OoooOo0.getLineStart(0), f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (o0o0o0o.Ooooo00 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(o0o0o0o.Oooo00o, o0o0o0o.Oooo0, o0o0o0o.Oooo0O0, AbstractC0694o0ooooo0.OooOO0o(o0o0o0o.Oooo0OO, textPaint.getAlpha()));
                        }
                        o0o0o0o.OoooOo0.draw(canvas);
                        textPaint.setAlpha((int) (o0o0o0o.OoooOoo * f4));
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(o0o0o0o.Oooo00o, o0o0o0o.Oooo0, o0o0o0o.Oooo0O0, AbstractC0694o0ooooo0.OooOO0o(o0o0o0o.Oooo0OO, textPaint.getAlpha()));
                        }
                        int lineBaseline = o0o0o0o.OoooOo0.getLineBaseline(0);
                        CharSequence charSequence = o0o0o0o.Ooooo0o;
                        float f5 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(o0o0o0o.Oooo00o, o0o0o0o.Oooo0, o0o0o0o.Oooo0O0, o0o0o0o.Oooo0OO);
                        }
                        String trim = o0o0o0o.Ooooo0o.toString().trim();
                        if (trim.endsWith("â€¦")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(o0o0o0o.OoooOo0.getLineEnd(i), str.length()), 0.0f, f5, (Paint) textPaint);
                    } else {
                        canvas.translate(f, f2);
                        o0o0o0o.OoooOo0.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.Oooo0OO != null && (c0875oO0oOooo = this.Oooo0O0) != null) {
            c0875oO0oOooo.draw(canvas);
            if (this.OooO0Oo.isFocused()) {
                Rect bounds = this.Oooo0OO.getBounds();
                Rect bounds2 = this.Oooo0O0.getBounds();
                float f6 = o0o0o0o.OooO0O0;
                int centerX = bounds2.centerX();
                bounds.left = o000OO0O.OooO0OO(centerX, bounds2.left, f6);
                bounds.right = o000OO0O.OooO0OO(centerX, bounds2.right, f6);
                this.Oooo0OO.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.o0ooOoO
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.o0ooOoO = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            com.ninja.engine.o0O0O0O r3 = r4.o00oO0o
            if (r3 == 0) goto L2f
            r3.Oooo0o0 = r1
            android.content.res.ColorStateList r1 = r3.OooOO0O
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.OooOO0
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.OooO0oo(r2)
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            android.widget.EditText r3 = r4.OooO0Oo
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = com.ninja.engine.AbstractC1460oo0O00oo.OooO00o
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            r4.OooOo0(r0, r2)
        L47:
            r4.OooOOo()
            r4.OooOo()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.o0ooOoO = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.OooO0Oo;
        if (editText != null) {
            return OooO0OO() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public C0875oO0oOooo getBoxBackground() {
        int i = this.Oooo0oo;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.Oooo000;
    }

    public int getBoxBackgroundColor() {
        return this.OoooOO0;
    }

    public int getBoxBackgroundMode() {
        return this.Oooo0oo;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Oooo;
    }

    public float getBoxCornerRadiusBottomEnd() {
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0;
        boolean OooOo0o = AbstractC1091oOOoOOOO.OooOo0o(this);
        RectF rectF = this.OoooOOo;
        if (OooOo0o) {
            interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0oo;
        } else {
            interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0oO;
        }
        return interfaceC0336o0O0ooO0.OooO00o(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0;
        boolean OooOo0o = AbstractC1091oOOoOOOO.OooOo0o(this);
        RectF rectF = this.OoooOOo;
        if (OooOo0o) {
            interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0oO;
        } else {
            interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0oo;
        }
        return interfaceC0336o0O0ooO0.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0;
        boolean OooOo0o = AbstractC1091oOOoOOOO.OooOo0o(this);
        RectF rectF = this.OoooOOo;
        if (OooOo0o) {
            interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0o0;
        } else {
            interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0o;
        }
        return interfaceC0336o0O0ooO0.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0;
        boolean OooOo0o = AbstractC1091oOOoOOOO.OooOo0o(this);
        RectF rectF = this.OoooOOo;
        if (OooOo0o) {
            interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0o;
        } else {
            interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0o0;
        }
        return interfaceC0336o0O0ooO0.OooO00o(rectF);
    }

    public int getBoxStrokeColor() {
        return this.Ooooooo;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.o0OoOo0;
    }

    public int getBoxStrokeWidth() {
        return this.OoooO0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.OoooO0O;
    }

    public int getCounterMaxLength() {
        return this.OooOO0o;
    }

    public CharSequence getCounterOverflowDescription() {
        C1589oo0oOO0 c1589oo0oOO0;
        if (this.OooOO0O && this.OooOOO0 && (c1589oo0oOO0 = this.OooOOOO) != null) {
            return c1589oo0oOO0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.OooOoO;
    }

    public ColorStateList getCounterTextColor() {
        return this.OooOoO0;
    }

    public ColorStateList getCursorColor() {
        return this.OooOoOO;
    }

    public ColorStateList getCursorErrorColor() {
        return this.OooOoo0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.OooooOo;
    }

    public EditText getEditText() {
        return this.OooO0Oo;
    }

    public CharSequence getEndIconContentDescription() {
        return this.OooO0OO.OooO0oO.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.OooO0OO.OooO0oO.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.OooO0OO.OooOOO0;
    }

    public int getEndIconMode() {
        return this.OooO0OO.OooO;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.OooO0OO.OooOOO;
    }

    public CheckableImageButton getEndIconView() {
        return this.OooO0OO.OooO0oO;
    }

    public CharSequence getError() {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        if (c0715oO00Oo.OooOOo0) {
            return c0715oO00Oo.OooOOOo;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.OooOO0.OooOo00;
    }

    public CharSequence getErrorContentDescription() {
        return this.OooOO0.OooOOoo;
    }

    public int getErrorCurrentTextColors() {
        C1589oo0oOO0 c1589oo0oOO0 = this.OooOO0.OooOOo;
        if (c1589oo0oOO0 != null) {
            return c1589oo0oOO0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.OooO0OO.OooO0OO.getDrawable();
    }

    public CharSequence getHelperText() {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        if (c0715oO00Oo.OooOo) {
            return c0715oO00Oo.OooOo0o;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1589oo0oOO0 c1589oo0oOO0 = this.OooOO0.OooOoO0;
        if (c1589oo0oOO0 != null) {
            return c1589oo0oOO0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.OooOoo) {
            return this.OooOooO;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.o00oO0o.OooO0Oo();
    }

    public final int getHintCurrentCollapsedTextColor() {
        o0O0O0O o0o0o0o = this.o00oO0o;
        return o0o0o0o.OooO0o0(o0o0o0o.OooOO0O);
    }

    public ColorStateList getHintTextColor() {
        return this.Oooooo0;
    }

    public InterfaceC1305oOooOO0o getLengthCounter() {
        return this.OooOOO;
    }

    public int getMaxEms() {
        return this.OooO0oO;
    }

    public int getMaxWidth() {
        return this.OooO;
    }

    public int getMinEms() {
        return this.OooO0o;
    }

    public int getMinWidth() {
        return this.OooO0oo;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.OooO0OO.OooO0oO.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.OooO0OO.OooO0oO.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.OooOOoo) {
            return this.OooOOo;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.OooOo0O;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.OooOo0;
    }

    public CharSequence getPrefixText() {
        return this.OooO0O0.OooO0OO;
    }

    public ColorStateList getPrefixTextColor() {
        return this.OooO0O0.OooO0O0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.OooO0O0.OooO0O0;
    }

    public C1204oOoOOOO0 getShapeAppearanceModel() {
        return this.Oooo0o0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.OooO0O0.OooO0Oo.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.OooO0O0.OooO0Oo.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.OooO0O0.OooO0oO;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.OooO0O0.OooO0oo;
    }

    public CharSequence getSuffixText() {
        return this.OooO0OO.OooOOOo;
    }

    public ColorStateList getSuffixTextColor() {
        return this.OooO0OO.OooOOo0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.OooO0OO.OooOOo0;
    }

    public Typeface getTypeface() {
        return this.OoooOo0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o00oO0o.OooO0oO(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.o0Oo0oo = false;
        if (this.OooO0Oo != null && this.OooO0Oo.getMeasuredHeight() < (max = Math.max(c0495o0o000O0.getMeasuredHeight(), this.OooO0O0.getMeasuredHeight()))) {
            this.OooO0Oo.setMinimumHeight(max);
            z = true;
        }
        boolean OooOOo0 = OooOOo0();
        if (z || OooOOo0) {
            this.OooO0Oo.post(new RunnableC0061o00000oO(19, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.o0Oo0oo;
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        if (!z) {
            c0495o0o000O0.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.o0Oo0oo = true;
        }
        if (this.OooOo00 != null && (editText = this.OooO0Oo) != null) {
            this.OooOo00.setGravity(editText.getGravity());
            this.OooOo00.setPadding(this.OooO0Oo.getCompoundPaddingLeft(), this.OooO0Oo.getCompoundPaddingTop(), this.OooO0Oo.getCompoundPaddingRight(), this.OooO0Oo.getCompoundPaddingBottom());
        }
        c0495o0o000O0.OooOOO0();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1301oOooOO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1301oOooOO c1301oOooOO = (C1301oOooOO) parcelable;
        super.onRestoreInstanceState(c1301oOooOO.OooO00o);
        setError(c1301oOooOO.OooO0OO);
        if (c1301oOooOO.OooO0Oo) {
            post(new o00000OO(15, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.ninja.engine.oOoOOOO0, java.lang.Object] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.Oooo0o) {
            InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0o0;
            RectF rectF = this.OoooOOo;
            float OooO00o = interfaceC0336o0O0ooO0.OooO00o(rectF);
            float OooO00o2 = this.Oooo0o0.OooO0o.OooO00o(rectF);
            float OooO00o3 = this.Oooo0o0.OooO0oo.OooO00o(rectF);
            float OooO00o4 = this.Oooo0o0.OooO0oO.OooO00o(rectF);
            C1204oOoOOOO0 c1204oOoOOOO0 = this.Oooo0o0;
            AbstractC0692o0ooooOo abstractC0692o0ooooOo = c1204oOoOOOO0.OooO00o;
            AbstractC0692o0ooooOo abstractC0692o0ooooOo2 = c1204oOoOOOO0.OooO0O0;
            AbstractC0692o0ooooOo abstractC0692o0ooooOo3 = c1204oOoOOOO0.OooO0Oo;
            AbstractC0692o0ooooOo abstractC0692o0ooooOo4 = c1204oOoOOOO0.OooO0OO;
            C0455o0OoOo00 c0455o0OoOo00 = new C0455o0OoOo00(0);
            C0455o0OoOo00 c0455o0OoOo002 = new C0455o0OoOo00(0);
            C0455o0OoOo00 c0455o0OoOo003 = new C0455o0OoOo00(0);
            C0455o0OoOo00 c0455o0OoOo004 = new C0455o0OoOo00(0);
            C1198oOoOOO.OooO0O0(abstractC0692o0ooooOo2);
            C1198oOoOOO.OooO0O0(abstractC0692o0ooooOo);
            C1198oOoOOO.OooO0O0(abstractC0692o0ooooOo4);
            C1198oOoOOO.OooO0O0(abstractC0692o0ooooOo3);
            C0017OooOOo c0017OooOOo = new C0017OooOOo(OooO00o2);
            C0017OooOOo c0017OooOOo2 = new C0017OooOOo(OooO00o);
            C0017OooOOo c0017OooOOo3 = new C0017OooOOo(OooO00o4);
            C0017OooOOo c0017OooOOo4 = new C0017OooOOo(OooO00o3);
            Object obj = new Object();
            obj.OooO00o = abstractC0692o0ooooOo2;
            obj.OooO0O0 = abstractC0692o0ooooOo;
            obj.OooO0OO = abstractC0692o0ooooOo3;
            obj.OooO0Oo = abstractC0692o0ooooOo4;
            obj.OooO0o0 = c0017OooOOo;
            obj.OooO0o = c0017OooOOo2;
            obj.OooO0oO = c0017OooOOo4;
            obj.OooO0oo = c0017OooOOo3;
            obj.OooO = c0455o0OoOo00;
            obj.OooOO0 = c0455o0OoOo002;
            obj.OooOO0O = c0455o0OoOo003;
            obj.OooOO0o = c0455o0OoOo004;
            this.Oooo0o = z;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ninja.engine.oOooOO, android.os.Parcelable, com.ninja.engine.OooOOo0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        AbstractC0018OooOOo0 abstractC0018OooOOo0 = new AbstractC0018OooOOo0(super.onSaveInstanceState());
        if (OooOOO0()) {
            abstractC0018OooOOo0.OooO0OO = getError();
        }
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        if (c0495o0o000O0.OooO != 0 && c0495o0o000O0.OooO0oO.OooO0Oo) {
            z = true;
        } else {
            z = false;
        }
        abstractC0018OooOOo0.OooO0Oo = z;
        return abstractC0018OooOOo0;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.OoooOO0 != i) {
            this.OoooOO0 = i;
            this.ooOO = i;
            this.o00Oo0 = i;
            this.o00Ooo = i;
            OooO0O0();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC0809oO0OooOO.OooOoo0(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.ooOO = defaultColor;
        this.OoooOO0 = defaultColor;
        this.o00O0O = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.o00Oo0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.o00Ooo = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        OooO0O0();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.Oooo0oo) {
            return;
        }
        this.Oooo0oo = i;
        if (this.OooO0Oo != null) {
            OooO();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.Oooo = i;
    }

    public void setBoxCornerFamily(int i) {
        C1198oOoOOO OooO0o0 = this.Oooo0o0.OooO0o0();
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0 = this.Oooo0o0.OooO0o0;
        AbstractC0692o0ooooOo OooOOOo = AbstractC0692o0ooooOo.OooOOOo(i);
        OooO0o0.OooO00o = OooOOOo;
        C1198oOoOOO.OooO0O0(OooOOOo);
        OooO0o0.OooO0o0 = interfaceC0336o0O0ooO0;
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO02 = this.Oooo0o0.OooO0o;
        AbstractC0692o0ooooOo OooOOOo2 = AbstractC0692o0ooooOo.OooOOOo(i);
        OooO0o0.OooO0O0 = OooOOOo2;
        C1198oOoOOO.OooO0O0(OooOOOo2);
        OooO0o0.OooO0o = interfaceC0336o0O0ooO02;
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO03 = this.Oooo0o0.OooO0oo;
        AbstractC0692o0ooooOo OooOOOo3 = AbstractC0692o0ooooOo.OooOOOo(i);
        OooO0o0.OooO0Oo = OooOOOo3;
        C1198oOoOOO.OooO0O0(OooOOOo3);
        OooO0o0.OooO0oo = interfaceC0336o0O0ooO03;
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO04 = this.Oooo0o0.OooO0oO;
        AbstractC0692o0ooooOo OooOOOo4 = AbstractC0692o0ooooOo.OooOOOo(i);
        OooO0o0.OooO0OO = OooOOOo4;
        C1198oOoOOO.OooO0O0(OooOOOo4);
        OooO0o0.OooO0oO = interfaceC0336o0O0ooO04;
        this.Oooo0o0 = OooO0o0.OooO00o();
        OooO0O0();
    }

    public void setBoxStrokeColor(int i) {
        if (this.Ooooooo != i) {
            this.Ooooooo = i;
            OooOo();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.Ooooooo != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            OooOo();
        }
        this.Oooooo = colorStateList.getDefaultColor();
        this.o00o0O = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.OoooooO = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.Ooooooo = defaultColor;
        OooOo();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.o0OoOo0 != colorStateList) {
            this.o0OoOo0 = colorStateList;
            OooOo();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.OoooO0 = i;
        OooOo();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.OoooO0O = i;
        OooOo();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.OooOO0O != z) {
            Editable editable = null;
            C0715oO00Oo c0715oO00Oo = this.OooOO0;
            if (z) {
                C1589oo0oOO0 c1589oo0oOO0 = new C1589oo0oOO0(getContext(), null);
                this.OooOOOO = c1589oo0oOO0;
                c1589oo0oOO0.setId(R.id.textinput_counter);
                Typeface typeface = this.OoooOo0;
                if (typeface != null) {
                    this.OooOOOO.setTypeface(typeface);
                }
                this.OooOOOO.setMaxLines(1);
                c0715oO00Oo.OooO00o(this.OooOOOO, 2);
                ((ViewGroup.MarginLayoutParams) this.OooOOOO.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                OooOOOO();
                if (this.OooOOOO != null) {
                    EditText editText = this.OooO0Oo;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    OooOOO(editable);
                }
            } else {
                c0715oO00Oo.OooO0oO(this.OooOOOO, 2);
                this.OooOOOO = null;
            }
            this.OooOO0O = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.OooOO0o != i) {
            if (i <= 0) {
                i = -1;
            }
            this.OooOO0o = i;
            if (this.OooOO0O && this.OooOOOO != null) {
                EditText editText = this.OooO0Oo;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                OooOOO(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.OooOOOo != i) {
            this.OooOOOo = i;
            OooOOOO();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.OooOoO != colorStateList) {
            this.OooOoO = colorStateList;
            OooOOOO();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.OooOOo0 != i) {
            this.OooOOo0 = i;
            OooOOOO();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.OooOoO0 != colorStateList) {
            this.OooOoO0 = colorStateList;
            OooOOOO();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.OooOoOO != colorStateList) {
            this.OooOoOO = colorStateList;
            OooOOOo();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.OooOoo0 != colorStateList) {
            this.OooOoo0 = colorStateList;
            if (OooOOO0() || (this.OooOOOO != null && this.OooOOO0)) {
                OooOOOo();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.OooooOo = colorStateList;
        this.Oooooo0 = colorStateList;
        if (this.OooO0Oo != null) {
            OooOo0(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OooOO0O(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.OooO0OO.OooO0oO.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.OooO0OO.OooO0oO.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        CharSequence text = i != 0 ? c0495o0o000O0.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0495o0o000O0.OooO0oO;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        Drawable OooOo0 = i != 0 ? AbstractC0692o0ooooOo.OooOo0(c0495o0o000O0.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c0495o0o000O0.OooO0oO;
        checkableImageButton.setImageDrawable(OooOo0);
        if (OooOo0 != null) {
            ColorStateList colorStateList = c0495o0o000O0.OooOO0O;
            PorterDuff.Mode mode = c0495o0o000O0.OooOO0o;
            TextInputLayout textInputLayout = c0495o0o000O0.OooO00o;
            AbstractC0809oO0OooOO.OooO0Oo(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0809oO0OooOO.OooooO0(textInputLayout, checkableImageButton, c0495o0o000O0.OooOO0O);
        }
    }

    public void setEndIconMinSize(int i) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        if (i >= 0) {
            if (i != c0495o0o000O0.OooOOO0) {
                c0495o0o000O0.OooOOO0 = i;
                CheckableImageButton checkableImageButton = c0495o0o000O0.OooO0oO;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                CheckableImageButton checkableImageButton2 = c0495o0o000O0.OooO0OO;
                checkableImageButton2.setMinimumWidth(i);
                checkableImageButton2.setMinimumHeight(i);
                return;
            }
            return;
        }
        c0495o0o000O0.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i) {
        this.OooO0OO.OooO0oO(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        View.OnLongClickListener onLongClickListener = c0495o0o000O0.OooOOOO;
        CheckableImageButton checkableImageButton = c0495o0o000O0.OooO0oO;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.OooOOOO = onLongClickListener;
        CheckableImageButton checkableImageButton = c0495o0o000O0.OooO0oO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.OooOOO = scaleType;
        c0495o0o000O0.OooO0oO.setScaleType(scaleType);
        c0495o0o000O0.OooO0OO.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        if (c0495o0o000O0.OooOO0O != colorStateList) {
            c0495o0o000O0.OooOO0O = colorStateList;
            AbstractC0809oO0OooOO.OooO0Oo(c0495o0o000O0.OooO00o, c0495o0o000O0.OooO0oO, colorStateList, c0495o0o000O0.OooOO0o);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        if (c0495o0o000O0.OooOO0o != mode) {
            c0495o0o000O0.OooOO0o = mode;
            AbstractC0809oO0OooOO.OooO0Oo(c0495o0o000O0.OooO00o, c0495o0o000O0.OooO0oO, c0495o0o000O0.OooOO0O, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.OooO0OO.OooO0oo(z);
    }

    public void setError(CharSequence charSequence) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        if (!c0715oO00Oo.OooOOo0) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            c0715oO00Oo.OooO0OO();
            c0715oO00Oo.OooOOOo = charSequence;
            c0715oO00Oo.OooOOo.setText(charSequence);
            int i = c0715oO00Oo.OooOOO;
            if (i != 1) {
                c0715oO00Oo.OooOOOO = 1;
            }
            c0715oO00Oo.OooO(i, c0715oO00Oo.OooOOOO, c0715oO00Oo.OooO0oo(c0715oO00Oo.OooOOo, charSequence));
            return;
        }
        c0715oO00Oo.OooO0o();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        c0715oO00Oo.OooOo00 = i;
        C1589oo0oOO0 c1589oo0oOO0 = c0715oO00Oo.OooOOo;
        if (c1589oo0oOO0 != null) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            c1589oo0oOO0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        c0715oO00Oo.OooOOoo = charSequence;
        C1589oo0oOO0 c1589oo0oOO0 = c0715oO00Oo.OooOOo;
        if (c1589oo0oOO0 != null) {
            c1589oo0oOO0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        if (c0715oO00Oo.OooOOo0 != z) {
            c0715oO00Oo.OooO0OO();
            TextInputLayout textInputLayout = c0715oO00Oo.OooO0oo;
            if (z) {
                C1589oo0oOO0 c1589oo0oOO0 = new C1589oo0oOO0(c0715oO00Oo.OooO0oO, null);
                c0715oO00Oo.OooOOo = c1589oo0oOO0;
                c1589oo0oOO0.setId(R.id.textinput_error);
                c0715oO00Oo.OooOOo.setTextAlignment(5);
                Typeface typeface = c0715oO00Oo.OooOoo0;
                if (typeface != null) {
                    c0715oO00Oo.OooOOo.setTypeface(typeface);
                }
                int i = c0715oO00Oo.OooOo0;
                c0715oO00Oo.OooOo0 = i;
                C1589oo0oOO0 c1589oo0oOO02 = c0715oO00Oo.OooOOo;
                if (c1589oo0oOO02 != null) {
                    textInputLayout.OooOO0o(c1589oo0oOO02, i);
                }
                ColorStateList colorStateList = c0715oO00Oo.OooOo0O;
                c0715oO00Oo.OooOo0O = colorStateList;
                C1589oo0oOO0 c1589oo0oOO03 = c0715oO00Oo.OooOOo;
                if (c1589oo0oOO03 != null && colorStateList != null) {
                    c1589oo0oOO03.setTextColor(colorStateList);
                }
                CharSequence charSequence = c0715oO00Oo.OooOOoo;
                c0715oO00Oo.OooOOoo = charSequence;
                C1589oo0oOO0 c1589oo0oOO04 = c0715oO00Oo.OooOOo;
                if (c1589oo0oOO04 != null) {
                    c1589oo0oOO04.setContentDescription(charSequence);
                }
                int i2 = c0715oO00Oo.OooOo00;
                c0715oO00Oo.OooOo00 = i2;
                C1589oo0oOO0 c1589oo0oOO05 = c0715oO00Oo.OooOOo;
                if (c1589oo0oOO05 != null) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    c1589oo0oOO05.setAccessibilityLiveRegion(i2);
                }
                c0715oO00Oo.OooOOo.setVisibility(4);
                c0715oO00Oo.OooO00o(c0715oO00Oo.OooOOo, 0);
            } else {
                c0715oO00Oo.OooO0o();
                c0715oO00Oo.OooO0oO(c0715oO00Oo.OooOOo, 0);
                c0715oO00Oo.OooOOo = null;
                textInputLayout.OooOOo();
                textInputLayout.OooOo();
            }
            c0715oO00Oo.OooOOo0 = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.OooO(i != 0 ? AbstractC0692o0ooooOo.OooOo0(c0495o0o000O0.getContext(), i) : null);
        AbstractC0809oO0OooOO.OooooO0(c0495o0o000O0.OooO00o, c0495o0o000O0.OooO0OO, c0495o0o000O0.OooO0Oo);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        CheckableImageButton checkableImageButton = c0495o0o000O0.OooO0OO;
        View.OnLongClickListener onLongClickListener = c0495o0o000O0.OooO0o;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.OooO0o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0495o0o000O0.OooO0OO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        if (c0495o0o000O0.OooO0Oo != colorStateList) {
            c0495o0o000O0.OooO0Oo = colorStateList;
            AbstractC0809oO0OooOO.OooO0Oo(c0495o0o000O0.OooO00o, c0495o0o000O0.OooO0OO, colorStateList, c0495o0o000O0.OooO0o0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        if (c0495o0o000O0.OooO0o0 != mode) {
            c0495o0o000O0.OooO0o0 = mode;
            AbstractC0809oO0OooOO.OooO0Oo(c0495o0o000O0.OooO00o, c0495o0o000O0.OooO0OO, c0495o0o000O0.OooO0Oo, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        c0715oO00Oo.OooOo0 = i;
        C1589oo0oOO0 c1589oo0oOO0 = c0715oO00Oo.OooOOo;
        if (c1589oo0oOO0 != null) {
            c0715oO00Oo.OooO0oo.OooOO0o(c1589oo0oOO0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        c0715oO00Oo.OooOo0O = colorStateList;
        C1589oo0oOO0 c1589oo0oOO0 = c0715oO00Oo.OooOOo;
        if (c1589oo0oOO0 != null && colorStateList != null) {
            c1589oo0oOO0.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.o00oO0O != z) {
            this.o00oO0O = z;
            OooOo0(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        if (isEmpty) {
            if (c0715oO00Oo.OooOo) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0715oO00Oo.OooOo) {
            setHelperTextEnabled(true);
        }
        c0715oO00Oo.OooO0OO();
        c0715oO00Oo.OooOo0o = charSequence;
        c0715oO00Oo.OooOoO0.setText(charSequence);
        int i = c0715oO00Oo.OooOOO;
        if (i != 2) {
            c0715oO00Oo.OooOOOO = 2;
        }
        c0715oO00Oo.OooO(i, c0715oO00Oo.OooOOOO, c0715oO00Oo.OooO0oo(c0715oO00Oo.OooOoO0, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        c0715oO00Oo.OooOoOO = colorStateList;
        C1589oo0oOO0 c1589oo0oOO0 = c0715oO00Oo.OooOoO0;
        if (c1589oo0oOO0 != null && colorStateList != null) {
            c1589oo0oOO0.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        if (c0715oO00Oo.OooOo != z) {
            c0715oO00Oo.OooO0OO();
            if (z) {
                C1589oo0oOO0 c1589oo0oOO0 = new C1589oo0oOO0(c0715oO00Oo.OooO0oO, null);
                c0715oO00Oo.OooOoO0 = c1589oo0oOO0;
                c1589oo0oOO0.setId(R.id.textinput_helper_text);
                c0715oO00Oo.OooOoO0.setTextAlignment(5);
                Typeface typeface = c0715oO00Oo.OooOoo0;
                if (typeface != null) {
                    c0715oO00Oo.OooOoO0.setTypeface(typeface);
                }
                c0715oO00Oo.OooOoO0.setVisibility(4);
                c0715oO00Oo.OooOoO0.setAccessibilityLiveRegion(1);
                int i = c0715oO00Oo.OooOoO;
                c0715oO00Oo.OooOoO = i;
                C1589oo0oOO0 c1589oo0oOO02 = c0715oO00Oo.OooOoO0;
                if (c1589oo0oOO02 != null) {
                    AbstractC1094oOOoOOo0.OooOo0o(c1589oo0oOO02, i);
                }
                ColorStateList colorStateList = c0715oO00Oo.OooOoOO;
                c0715oO00Oo.OooOoOO = colorStateList;
                C1589oo0oOO0 c1589oo0oOO03 = c0715oO00Oo.OooOoO0;
                if (c1589oo0oOO03 != null && colorStateList != null) {
                    c1589oo0oOO03.setTextColor(colorStateList);
                }
                c0715oO00Oo.OooO00o(c0715oO00Oo.OooOoO0, 1);
                c0715oO00Oo.OooOoO0.setAccessibilityDelegate(new C0717oO00Oo0o(c0715oO00Oo));
            } else {
                c0715oO00Oo.OooO0OO();
                int i2 = c0715oO00Oo.OooOOO;
                if (i2 == 2) {
                    c0715oO00Oo.OooOOOO = 0;
                }
                c0715oO00Oo.OooO(i2, c0715oO00Oo.OooOOOO, c0715oO00Oo.OooO0oo(c0715oO00Oo.OooOoO0, ""));
                c0715oO00Oo.OooO0oO(c0715oO00Oo.OooOoO0, 1);
                c0715oO00Oo.OooOoO0 = null;
                TextInputLayout textInputLayout = c0715oO00Oo.OooO0oo;
                textInputLayout.OooOOo();
                textInputLayout.OooOo();
            }
            c0715oO00Oo.OooOo = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C0715oO00Oo c0715oO00Oo = this.OooOO0;
        c0715oO00Oo.OooOoO = i;
        C1589oo0oOO0 c1589oo0oOO0 = c0715oO00Oo.OooOoO0;
        if (c1589oo0oOO0 != null) {
            AbstractC1094oOOoOOo0.OooOo0o(c1589oo0oOO0, i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.o0ooOO0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.OooOoo) {
            this.OooOoo = z;
            if (z) {
                CharSequence hint = this.OooO0Oo.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.OooOooO)) {
                        setHint(hint);
                    }
                    this.OooO0Oo.setHint((CharSequence) null);
                }
                this.OooOooo = true;
            } else {
                this.OooOooo = false;
                if (!TextUtils.isEmpty(this.OooOooO) && TextUtils.isEmpty(this.OooO0Oo.getHint())) {
                    this.OooO0Oo.setHint(this.OooOooO);
                }
                setHintInternal(null);
            }
            if (this.OooO0Oo != null) {
                OooOo00();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        o0O0O0O o0o0o0o = this.o00oO0o;
        View view = o0o0o0o.OooO00o;
        C1299oOooO0oO c1299oOooO0oO = new C1299oOooO0oO(view.getContext(), i);
        ColorStateList colorStateList = c1299oOooO0oO.OooOO0;
        if (colorStateList != null) {
            o0o0o0o.OooOO0O = colorStateList;
        }
        float f = c1299oOooO0oO.OooOO0O;
        if (f != 0.0f) {
            o0o0o0o.OooO = f;
        }
        ColorStateList colorStateList2 = c1299oOooO0oO.OooO00o;
        if (colorStateList2 != null) {
            o0o0o0o.OoooOO0 = colorStateList2;
        }
        o0o0o0o.OoooO0O = c1299oOooO0oO.OooO0o0;
        o0o0o0o.OoooO = c1299oOooO0oO.OooO0o;
        o0o0o0o.OoooO0 = c1299oOooO0oO.OooO0oO;
        o0o0o0o.o000oOoO = c1299oOooO0oO.OooO;
        C0260o00ooO c0260o00ooO = o0o0o0o.OooOoO0;
        if (c0260o00ooO != null) {
            c0260o00ooO.OooO0o0 = true;
        }
        C0331o0O0oo c0331o0O0oo = new C0331o0O0oo(5, o0o0o0o);
        c1299oOooO0oO.OooO00o();
        o0o0o0o.OooOoO0 = new C0260o00ooO(c0331o0O0oo, c1299oOooO0oO.OooOOO);
        c1299oOooO0oO.OooO0OO(view.getContext(), o0o0o0o.OooOoO0);
        o0o0o0o.OooO0oo(false);
        this.Oooooo0 = o0o0o0o.OooOO0O;
        if (this.OooO0Oo != null) {
            OooOo0(false, false);
            OooOo00();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.Oooooo0 != colorStateList) {
            if (this.OooooOo == null) {
                o0O0O0O o0o0o0o = this.o00oO0o;
                if (o0o0o0o.OooOO0O != colorStateList) {
                    o0o0o0o.OooOO0O = colorStateList;
                    o0o0o0o.OooO0oo(false);
                }
            }
            this.Oooooo0 = colorStateList;
            if (this.OooO0Oo != null) {
                OooOo0(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC1305oOooOO0o interfaceC1305oOooOO0o) {
        this.OooOOO = interfaceC1305oOooOO0o;
    }

    public void setMaxEms(int i) {
        this.OooO0oO = i;
        EditText editText = this.OooO0Oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.OooO = i;
        EditText editText = this.OooO0Oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.OooO0o = i;
        EditText editText = this.OooO0Oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.OooO0oo = i;
        EditText editText = this.OooO0Oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.OooO0oO.setContentDescription(i != 0 ? c0495o0o000O0.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.OooO0oO.setImageDrawable(i != 0 ? AbstractC0692o0ooooOo.OooOo0(c0495o0o000O0.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        if (z && c0495o0o000O0.OooO != 1) {
            c0495o0o000O0.OooO0oO(1);
        } else if (!z) {
            c0495o0o000O0.OooO0oO(0);
        } else {
            c0495o0o000O0.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.OooOO0O = colorStateList;
        AbstractC0809oO0OooOO.OooO0Oo(c0495o0o000O0.OooO00o, c0495o0o000O0.OooO0oO, colorStateList, c0495o0o000O0.OooOO0o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.OooOO0o = mode;
        AbstractC0809oO0OooOO.OooO0Oo(c0495o0o000O0.OooO00o, c0495o0o000O0.OooO0oO, c0495o0o000O0.OooOO0O, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.OooOo00 == null) {
            C1589oo0oOO0 c1589oo0oOO0 = new C1589oo0oOO0(getContext(), null);
            this.OooOo00 = c1589oo0oOO0;
            c1589oo0oOO0.setId(R.id.textinput_placeholder);
            this.OooOo00.setImportantForAccessibility(2);
            C0551o0o0Oo00 OooO0Oo = OooO0Oo();
            this.OooOo0o = OooO0Oo;
            OooO0Oo.OooO0O0 = 67L;
            this.OooOo = OooO0Oo();
            setPlaceholderTextAppearance(this.OooOo0O);
            setPlaceholderTextColor(this.OooOo0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.OooOOoo) {
                setPlaceholderTextEnabled(true);
            }
            this.OooOOo = charSequence;
        }
        EditText editText = this.OooO0Oo;
        if (editText != null) {
            editable = editText.getText();
        }
        OooOo0O(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.OooOo0O = i;
        C1589oo0oOO0 c1589oo0oOO0 = this.OooOo00;
        if (c1589oo0oOO0 != null) {
            AbstractC1094oOOoOOo0.OooOo0o(c1589oo0oOO0, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.OooOo0 != colorStateList) {
            this.OooOo0 = colorStateList;
            C1589oo0oOO0 c1589oo0oOO0 = this.OooOo00;
            if (c1589oo0oOO0 == null || colorStateList == null) {
                return;
            }
            c1589oo0oOO0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        C1250oOoOoooO c1250oOoOoooO = this.OooO0O0;
        c1250oOoOoooO.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        c1250oOoOoooO.OooO0OO = charSequence2;
        c1250oOoOoooO.OooO0O0.setText(charSequence);
        c1250oOoOoooO.OooO0o0();
    }

    public void setPrefixTextAppearance(int i) {
        AbstractC1094oOOoOOo0.OooOo0o(this.OooO0O0.OooO0O0, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.OooO0O0.OooO0O0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C1204oOoOOOO0 c1204oOoOOOO0) {
        C0875oO0oOooo c0875oO0oOooo = this.Oooo000;
        if (c0875oO0oOooo != null && c0875oO0oOooo.OooO00o.OooO00o != c1204oOoOOOO0) {
            this.Oooo0o0 = c1204oOoOOOO0;
            OooO0O0();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.OooO0O0.OooO0Oo.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0692o0ooooOo.OooOo0(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C1250oOoOoooO c1250oOoOoooO = this.OooO0O0;
        if (i >= 0) {
            if (i != c1250oOoOoooO.OooO0oO) {
                c1250oOoOoooO.OooO0oO = i;
                CheckableImageButton checkableImageButton = c1250oOoOoooO.OooO0Oo;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                return;
            }
            return;
        }
        c1250oOoOoooO.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C1250oOoOoooO c1250oOoOoooO = this.OooO0O0;
        View.OnLongClickListener onLongClickListener = c1250oOoOoooO.OooO;
        CheckableImageButton checkableImageButton = c1250oOoOoooO.OooO0Oo;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1250oOoOoooO c1250oOoOoooO = this.OooO0O0;
        c1250oOoOoooO.OooO = onLongClickListener;
        CheckableImageButton checkableImageButton = c1250oOoOoooO.OooO0Oo;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0809oO0OooOO.Oooooo(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C1250oOoOoooO c1250oOoOoooO = this.OooO0O0;
        c1250oOoOoooO.OooO0oo = scaleType;
        c1250oOoOoooO.OooO0Oo.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C1250oOoOoooO c1250oOoOoooO = this.OooO0O0;
        if (c1250oOoOoooO.OooO0o0 != colorStateList) {
            c1250oOoOoooO.OooO0o0 = colorStateList;
            AbstractC0809oO0OooOO.OooO0Oo(c1250oOoOoooO.OooO00o, c1250oOoOoooO.OooO0Oo, colorStateList, c1250oOoOoooO.OooO0o);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C1250oOoOoooO c1250oOoOoooO = this.OooO0O0;
        if (c1250oOoOoooO.OooO0o != mode) {
            c1250oOoOoooO.OooO0o = mode;
            AbstractC0809oO0OooOO.OooO0Oo(c1250oOoOoooO.OooO00o, c1250oOoOoooO.OooO0Oo, c1250oOoOoooO.OooO0o0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.OooO0O0.OooO0OO(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        c0495o0o000O0.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        c0495o0o000O0.OooOOOo = charSequence2;
        c0495o0o000O0.OooOOo0.setText(charSequence);
        c0495o0o000O0.OooOOO();
    }

    public void setSuffixTextAppearance(int i) {
        AbstractC1094oOOoOOo0.OooOo0o(this.OooO0OO.OooOOo0, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.OooO0OO.OooOOo0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C1304oOooOO0O c1304oOooOO0O) {
        EditText editText = this.OooO0Oo;
        if (editText != null) {
            AbstractC1460oo0O00oo.OooOOOo(editText, c1304oOooOO0O);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.OoooOo0) {
            this.OoooOo0 = typeface;
            this.o00oO0o.OooOOO0(typeface);
            C0715oO00Oo c0715oO00Oo = this.OooOO0;
            if (typeface != c0715oO00Oo.OooOoo0) {
                c0715oO00Oo.OooOoo0 = typeface;
                C1589oo0oOO0 c1589oo0oOO0 = c0715oO00Oo.OooOOo;
                if (c1589oo0oOO0 != null) {
                    c1589oo0oOO0.setTypeface(typeface);
                }
                C1589oo0oOO0 c1589oo0oOO02 = c0715oO00Oo.OooOoO0;
                if (c1589oo0oOO02 != null) {
                    c1589oo0oOO02.setTypeface(typeface);
                }
            }
            C1589oo0oOO0 c1589oo0oOO03 = this.OooOOOO;
            if (c1589oo0oOO03 != null) {
                c1589oo0oOO03.setTypeface(typeface);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.OooOoo) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(FileUtils.FileMode.MODE_ISUID);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.OooO0O0.OooO0Oo;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.OooO0O0.OooO0O0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.OooO0OO.OooO0oO.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.OooO0OO.OooO0oO.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.OooO0OO.OooO(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.OooO0OO.OooO0oO;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO0OO;
        CheckableImageButton checkableImageButton = c0495o0o000O0.OooO0oO;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0495o0o000O0.OooOO0O;
            PorterDuff.Mode mode = c0495o0o000O0.OooOO0o;
            TextInputLayout textInputLayout = c0495o0o000O0.OooO00o;
            AbstractC0809oO0OooOO.OooO0Oo(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0809oO0OooOO.OooooO0(textInputLayout, checkableImageButton, c0495o0o000O0.OooOO0O);
        }
    }
}
