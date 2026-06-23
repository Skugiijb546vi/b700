package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.ninja.engine.oO0oOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865oO0oOo0 extends o000OOo0 {
    public boolean OooO;
    public final LinkedHashSet OooO0o;
    public final LinkedHashSet OooO0o0;
    public ColorStateList OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public CharSequence OooOO0O;
    public Drawable OooOO0o;
    public boolean OooOOO;
    public Drawable OooOOO0;
    public ColorStateList OooOOOO;
    public ColorStateList OooOOOo;
    public int OooOOo;
    public PorterDuff.Mode OooOOo0;
    public int[] OooOOoo;
    public final C0291o0O00o0 OooOo;
    public CharSequence OooOo0;
    public boolean OooOo00;
    public CompoundButton.OnCheckedChangeListener OooOo0O;
    public final o000O00O OooOo0o;
    public static final int[] OooOoO0 = {R.attr.state_indeterminate};
    public static final int[] OooOoO = {R.attr.state_error};
    public static final int[][] OooOoOO = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public static final int OooOoo0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C0865oO0oOo0(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.checkboxStyle, 2131952670), attributeSet, R.attr.checkboxStyle);
        o000O00O o000o00o;
        int next;
        this.OooO0o0 = new LinkedHashSet();
        this.OooO0o = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            o000o00o = new o000O00O(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = AbstractC1139oOOoooOO.OooO00o;
            Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            o000o00o.OooO00o = drawable;
            drawable.setCallback(o000o00o.OooO0o);
            new o000O00(0, o000o00o.OooO00o.getConstantState());
        } else {
            int i = o000O00O.OooO0oO;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    Resources resources2 = context2.getResources();
                    Resources.Theme theme2 = context2.getTheme();
                    o000O00O o000o00o2 = new o000O00O(context2);
                    o000o00o2.inflate(resources2, xml, asAttributeSet, theme2);
                    o000o00o = o000o00o2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException unused) {
                o000o00o = null;
            }
        }
        this.OooOo0o = o000o00o;
        this.OooOo = new C0291o0O00o0(this, 2);
        Context context3 = getContext();
        this.OooOO0o = AbstractC0694o0ooooo0.OooOo0O(this);
        this.OooOOOO = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C0131o00O0o Oooo0o0 = AbstractC0692o0ooooOo.Oooo0o0(context3, attributeSet, AbstractC1038oOOOoo0O.OooOOo, R.attr.checkboxStyle, 2131952670, new int[0]);
        this.OooOOO0 = Oooo0o0.OooOo0o(2);
        Drawable drawable2 = this.OooOO0o;
        TypedArray typedArray = (TypedArray) Oooo0o0.OooO0O0;
        if (drawable2 != null && AbstractC0692o0ooooOo.OoooOOo(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == OooOoo0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.OooOO0o = AbstractC0692o0ooooOo.OooOo0(context3, R.drawable.mtrl_checkbox_button);
                this.OooOOO = true;
                if (this.OooOOO0 == null) {
                    this.OooOOO0 = AbstractC0692o0ooooOo.OooOo0(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.OooOOOo = AbstractC0809oO0OooOO.OooOooo(context3, Oooo0o0, 3);
        this.OooOOo0 = AbstractC1091oOOoOOOO.OooOoo0(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.OooO0oo = typedArray.getBoolean(10, false);
        this.OooO = typedArray.getBoolean(6, true);
        this.OooOO0 = typedArray.getBoolean(9, false);
        this.OooOO0O = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        Oooo0o0.Oooo0o0();
        OooO00o();
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i;
        int i2 = this.OooOOo;
        if (i2 == 1) {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_checked;
        } else if (i2 == 0) {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.OooO0oO == null) {
            int OooOo = AbstractC0694o0ooooo0.OooOo(this, R.attr.colorControlActivated);
            int OooOo2 = AbstractC0694o0ooooo0.OooOo(this, R.attr.colorError);
            int OooOo3 = AbstractC0694o0ooooo0.OooOo(this, R.attr.colorSurface);
            int OooOo4 = AbstractC0694o0ooooo0.OooOo(this, R.attr.colorOnSurface);
            this.OooO0oO = new ColorStateList(OooOoOO, new int[]{AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo2, 1.0f), AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo, 1.0f), AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo4, 0.54f), AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo4, 0.38f), AbstractC0694o0ooooo0.Oooo000(OooOo3, OooOo4, 0.38f)});
        }
        return this.OooO0oO;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.OooOOOO;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void OooO00o() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0200o00o0O c0200o00o0O;
        this.OooOO0o = AbstractC0694o0ooooo0.OooOOo0(this.OooOO0o, this.OooOOOO, getButtonTintMode());
        this.OooOOO0 = AbstractC0694o0ooooo0.OooOOo0(this.OooOOO0, this.OooOOOo, this.OooOOo0);
        if (this.OooOOO) {
            o000O00O o000o00o = this.OooOo0o;
            if (o000o00o != null) {
                Drawable drawable = o000o00o.OooO00o;
                C0291o0O00o0 c0291o0O00o0 = this.OooOo;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0291o0O00o0.OooO00o == null) {
                        c0291o0O00o0.OooO00o = new C0075o0000oOo(c0291o0O00o0);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0291o0O00o0.OooO00o);
                }
                ArrayList arrayList = o000o00o.OooO0o0;
                o000Oo0 o000oo0 = o000o00o.OooO0O0;
                if (arrayList != null && c0291o0O00o0 != null) {
                    arrayList.remove(c0291o0O00o0);
                    if (o000o00o.OooO0o0.size() == 0 && (c0200o00o0O = o000o00o.OooO0Oo) != null) {
                        o000oo0.OooO0O0.removeListener(c0200o00o0O);
                        o000o00o.OooO0Oo = null;
                    }
                }
                Drawable drawable2 = o000o00o.OooO00o;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0291o0O00o0.OooO00o == null) {
                        c0291o0O00o0.OooO00o = new C0075o0000oOo(c0291o0O00o0);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0291o0O00o0.OooO00o);
                } else if (c0291o0O00o0 != null) {
                    if (o000o00o.OooO0o0 == null) {
                        o000o00o.OooO0o0 = new ArrayList();
                    }
                    if (!o000o00o.OooO0o0.contains(c0291o0O00o0)) {
                        o000o00o.OooO0o0.add(c0291o0O00o0);
                        if (o000o00o.OooO0Oo == null) {
                            o000o00o.OooO0Oo = new C0200o00o0O(1, o000o00o);
                        }
                        o000oo0.OooO0O0.addListener(o000o00o.OooO0Oo);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.OooOO0o;
                if ((drawable3 instanceof AnimatedStateListDrawable) && o000o00o != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, o000o00o, false);
                    ((AnimatedStateListDrawable) this.OooOO0o).addTransition(R.id.indeterminate, R.id.unchecked, o000o00o, false);
                }
            }
        }
        Drawable drawable4 = this.OooOO0o;
        if (drawable4 != null && (colorStateList2 = this.OooOOOO) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.OooOOO0;
        if (drawable5 != null && (colorStateList = this.OooOOOo) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.OooOO0o;
        Drawable drawable7 = this.OooOOO0;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int max = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int max2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, max, max2, max, max2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.OooOO0o;
    }

    public Drawable getButtonIconDrawable() {
        return this.OooOOO0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.OooOOOo;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.OooOOo0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.OooOOOO;
    }

    public int getCheckedState() {
        return this.OooOOo;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.OooOO0O;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.OooOOo == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.OooO0oo && this.OooOOOO == null && this.OooOOOo == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, OooOoO0);
        }
        if (this.OooOO0) {
            View.mergeDrawableStates(onCreateDrawableState, OooOoO);
        }
        int i2 = 0;
        while (true) {
            if (i2 < onCreateDrawableState.length) {
                int i3 = onCreateDrawableState[i2];
                if (i3 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                } else if (i3 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i2] = 16842912;
                    break;
                } else {
                    i2++;
                }
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.OooOOoo = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable OooOo0O;
        int i;
        if (this.OooO && TextUtils.isEmpty(getText()) && (OooOo0O = AbstractC0694o0ooooo0.OooOo0O(this)) != null) {
            if (AbstractC1091oOOoOOOO.OooOo0o(this)) {
                i = -1;
            } else {
                i = 1;
            }
            int width = ((getWidth() - OooOo0O.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = OooOo0O.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.OooOO0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.OooOO0O));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0866oO0oOo00)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0866oO0oOo00 c0866oO0oOo00 = (C0866oO0oOo00) parcelable;
        super.onRestoreInstanceState(c0866oO0oOo00.getSuperState());
        setCheckedState(c0866oO0oOo00.OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.ninja.engine.oO0oOo00] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.OooO00o = getCheckedState();
        return baseSavedState;
    }

    @Override // com.ninja.engine.o000OOo0, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.OooOOO0 = drawable;
        OooO00o();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.OooOOOo == colorStateList) {
            return;
        }
        this.OooOOOo = colorStateList;
        OooO00o();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.OooOOo0 == mode) {
            return;
        }
        this.OooOOo0 = mode;
        OooO00o();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.OooOOOO == colorStateList) {
            return;
        }
        this.OooOOOO = colorStateList;
        OooO00o();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        OooO00o();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.OooO = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.OooOOo != i) {
            this.OooOOo = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.OooOo0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.OooOo00) {
                return;
            }
            this.OooOo00 = true;
            LinkedHashSet linkedHashSet = this.OooO0o;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC1230oOoOo0o.OooOO0O(it.next());
                    throw null;
                }
            }
            if (this.OooOOo != 2 && (onCheckedChangeListener = this.OooOo0O) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.OooOo00 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.OooOO0O = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z) {
        if (this.OooOO0 == z) {
            return;
        }
        this.OooOO0 = z;
        refreshDrawableState();
        Iterator it = this.OooO0o0.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC1230oOoOo0o.OooOO0O(it.next());
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.OooOo0O = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.OooOo0 = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.OooO0oo = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        setButtonTintList(colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // com.ninja.engine.o000OOo0, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.OooOO0o = drawable;
        this.OooOOO = false;
        OooO00o();
    }
}
