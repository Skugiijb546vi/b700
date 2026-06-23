package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0188o00o0;
import com.ninja.engine.C0436o0OoO00O;
import com.ninja.engine.C0663o0ooOoOO;
import com.ninja.engine.C1204oOoOOOO0;
import com.ninja.engine.C1299oOooO0oO;
import com.ninja.engine.C1303oOooOO00;
import com.ninja.engine.C1546oo0Oooo0;
import com.ninja.engine.InterfaceC0867oO0oOo0O;
import com.ninja.engine.InterfaceC1210oOoOOo;
import com.ninja.engine.InterfaceC1544oo0OooOo;
import com.ninja.engine.o000OOo0;
import com.ninja.engine.o0O00;
import com.ninja.engine.o0O00O0;
import com.ninja.engine.oOO00O0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Chip extends o000OOo0 implements o0O00O0, InterfaceC1210oOoOOo, Checkable {
    public CompoundButton.OnCheckedChangeListener OooO;
    public InsetDrawable OooO0o;
    public C0436o0OoO00O OooO0o0;
    public RippleDrawable OooO0oO;
    public View.OnClickListener OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public final o0O00 OooOOo;
    public CharSequence OooOOo0;
    public boolean OooOOoo;
    public final RectF OooOo0;
    public final Rect OooOo00;
    public final C0663o0ooOoOO OooOo0O;
    public static final Rect OooOo0o = new Rect();
    public static final int[] OooOo = {16842913};
    public static final int[] OooOoO0 = {16842911};

    /* JADX WARN: Removed duplicated region for block: B:102:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.OooOo0;
        rectF.setEmpty();
        if (OooO0OO() && this.OooO0oo != null) {
            C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
            Rect bounds = c0436o0OoO00O.getBounds();
            rectF.setEmpty();
            if (c0436o0OoO00O.OoooOO0()) {
                float f = c0436o0OoO00O.OooooO0 + c0436o0OoO00O.Ooooo0o + c0436o0OoO00O.Oooo0oo + c0436o0OoO00O.Ooooo00 + c0436o0OoO00O.OoooOoo;
                if (AbstractC0809oO0OooOO.Oooo00o(c0436o0OoO00O) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.OooOo00;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private C1299oOooO0oO getTextAppearance() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.o0OoOo0.OooO0oO;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.OooOO0o != z) {
            this.OooOO0o = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.OooOO0O != z) {
            this.OooOO0O = z;
            refreshDrawableState();
        }
    }

    public final void OooO0O0(int i) {
        int i2;
        int i3;
        this.OooOOOo = i;
        if (!this.OooOOO) {
            InsetDrawable insetDrawable = this.OooO0o;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.OooO0o = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    OooO0o();
                    return;
                }
                return;
            }
            OooO0o();
            return;
        }
        int max = Math.max(0, i - ((int) this.OooO0o0.OooOoO));
        int max2 = Math.max(0, i - this.OooO0o0.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.OooO0o;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.OooO0o = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    OooO0o();
                    return;
                }
                return;
            }
            OooO0o();
            return;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        } else {
            i3 = 0;
        }
        if (this.OooO0o != null) {
            Rect rect = new Rect();
            this.OooO0o.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                OooO0o();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.OooO0o = new InsetDrawable((Drawable) this.OooO0o0, i2, i3, i2, i3);
        OooO0o();
    }

    public final boolean OooO0OO() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            Drawable drawable = c0436o0OoO00O.Oooo0o0;
            if (drawable != null) {
                if (drawable instanceof InterfaceC1544oo0OooOo) {
                    drawable = ((C1546oo0Oooo0) ((InterfaceC1544oo0OooOo) drawable)).OooO0o;
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0Oo() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.OoooO00) {
            return true;
        }
        return false;
    }

    public final void OooO0o() {
        this.OooO0oO = new RippleDrawable(AbstractC0692o0ooooOo.OoooOoO(this.OooO0o0.OooOooO), getBackgroundDrawable(), null);
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O.o0OO00O) {
            c0436o0OoO00O.o0OO00O = false;
            c0436o0OoO00O.oo0o0Oo = null;
            c0436o0OoO00O.onStateChange(c0436o0OoO00O.getState());
        }
        RippleDrawable rippleDrawable = this.OooO0oO;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        setBackground(rippleDrawable);
        OooO0oO();
    }

    public final void OooO0o0() {
        boolean z;
        C0436o0OoO00O c0436o0OoO00O;
        if (OooO0OO() && (c0436o0OoO00O = this.OooO0o0) != null && c0436o0OoO00O.Oooo0OO && this.OooO0oo != null) {
            AbstractC1460oo0O00oo.OooOOOo(this, this.OooOOo);
            z = true;
        } else {
            AbstractC1460oo0O00oo.OooOOOo(this, null);
            z = false;
        }
        this.OooOOoo = z;
    }

    public final void OooO0oO() {
        C0436o0OoO00O c0436o0OoO00O;
        if (!TextUtils.isEmpty(getText()) && (c0436o0OoO00O = this.OooO0o0) != null) {
            int OooOOoo = (int) (c0436o0OoO00O.OooOOoo() + c0436o0OoO00O.OooooO0 + c0436o0OoO00O.OoooOoo);
            C0436o0OoO00O c0436o0OoO00O2 = this.OooO0o0;
            int OooOOo = (int) (c0436o0OoO00O2.OooOOo() + c0436o0OoO00O2.OoooOOO + c0436o0OoO00O2.OoooOoO);
            if (this.OooO0o != null) {
                Rect rect = new Rect();
                this.OooO0o.getPadding(rect);
                OooOOo += rect.left;
                OooOOoo += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            setPaddingRelative(OooOOo, paddingTop, OooOOoo, paddingBottom);
        }
    }

    public final void OooO0oo() {
        TextPaint paint = getPaint();
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            paint.drawableState = c0436o0OoO00O.getState();
        }
        C1299oOooO0oO textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.OooO0o0(getContext(), paint, this.OooOo0O);
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (!this.OooOOoo) {
            return super.dispatchHoverEvent(motionEvent);
        }
        o0O00 o0o00 = this.OooOOo;
        AccessibilityManager accessibilityManager = o0o00.OooO0oo;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i2 = o0o00.OooOOO0) != Integer.MIN_VALUE) {
                    if (i2 == Integer.MIN_VALUE) {
                        return true;
                    }
                    o0o00.OooOOO0 = Integer.MIN_VALUE;
                    o0o00.OooOOo0(Integer.MIN_VALUE, 128);
                    o0o00.OooOOo0(i2, 256);
                    return true;
                }
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = o0o00.OooOOO;
                if (chip.OooO0OO() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i3 = o0o00.OooOOO0;
                if (i3 != i) {
                    o0o00.OooOOO0 = i;
                    o0o00.OooOOo0(i, 128);
                    o0o00.OooOOo0(i3, 256);
                }
                if (i != Integer.MIN_VALUE) {
                    return true;
                }
            }
        }
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.OooOOoo) {
            return super.dispatchKeyEvent(keyEvent);
        }
        o0O00 o0o00 = this.OooOOo;
        o0o00.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i2 = 130;
                                        }
                                    } else {
                                        i2 = 17;
                                    }
                                } else {
                                    i2 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && o0o00.OooOOO0(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = o0o00.OooOO0o;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = o0o00.OooOOO;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.OooO0oo;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.OooOOoo) {
                                chip.OooOOo.OooOOo0(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = o0o00.OooOOO0(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = o0o00.OooOOO0(1, null);
            }
        }
        if (z && o0o00.OooOO0o != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // com.ninja.engine.o000OOo0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        boolean z = false;
        if (c0436o0OoO00O != null && C0436o0OoO00O.OooOo0O(c0436o0OoO00O.Oooo0o0)) {
            C0436o0OoO00O c0436o0OoO00O2 = this.OooO0o0;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.OooOOO0) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.OooOO0o) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.OooOO0O) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.OooOOO0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.OooOO0o) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.OooOO0O) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0436o0OoO00O2.o0Oo0oo, iArr)) {
                c0436o0OoO00O2.o0Oo0oo = iArr;
                if (c0436o0OoO00O2.OoooOO0()) {
                    z = c0436o0OoO00O2.OooOo(c0436o0OoO00O2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (TextUtils.isEmpty(this.OooOOo0)) {
            if (!OooO0Oo()) {
                return isClickable() ? "android.widget.Button" : "android.view.View";
            }
            getParent();
            return "android.widget.Button";
        }
        return this.OooOOo0;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.OooO0o;
        return insetDrawable == null ? this.OooO0o0 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OoooO0O;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OoooO;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OooOoO0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return Math.max(0.0f, c0436o0OoO00O.OooOo00());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.OooO0o0;
    }

    public float getChipEndPadding() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OooooO0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O == null || (drawable = c0436o0OoO00O.Oooo00O) == null) {
            return null;
        }
        if (drawable instanceof InterfaceC1544oo0OooOo) {
            drawable = ((C1546oo0Oooo0) ((InterfaceC1544oo0OooOo) drawable)).OooO0o;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.Oooo0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.Oooo00o;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OooOoO;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OoooOOO;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OooOoo0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OooOoo;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O == null || (drawable = c0436o0OoO00O.Oooo0o0) == null) {
            return null;
        }
        if (drawable instanceof InterfaceC1544oo0OooOo) {
            drawable = ((C1546oo0Oooo0) ((InterfaceC1544oo0OooOo) drawable)).OooO0o;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.Oooo;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.Ooooo0o;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.Oooo0oo;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.Ooooo00;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.Oooo0oO;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.o000OOo;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.OooOOoo) {
            o0O00 o0o00 = this.OooOOo;
            if (o0o00.OooOO0o == 1 || o0o00.OooOO0O == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public oOO00O0 getHideMotionSpec() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.o000oOoO;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OoooOo0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OoooOOo;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OooOooO;
        }
        return null;
    }

    public C1204oOoOOOO0 getShapeAppearanceModel() {
        return this.OooO0o0.OooO00o.OooO00o;
    }

    public oOO00O0 getShowMotionSpec() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OoooOO0;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OoooOoo;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            return c0436o0OoO00O.OoooOoO;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0692o0ooooOo.Ooooo00(this, this.OooO0o0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, OooOo);
        }
        if (OooO0Oo()) {
            View.mergeDrawableStates(onCreateDrawableState, OooOoO0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.OooOOoo) {
            o0O00 o0o00 = this.OooOOo;
            int i2 = o0o00.OooOO0o;
            if (i2 != Integer.MIN_VALUE) {
                o0o00.OooOO0(i2);
            }
            if (z) {
                o0o00.OooOOO0(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(OooO0Oo());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.OooOOOO != i) {
            this.OooOOOO = i;
            OooO0oO();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.OooOO0O
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = 1
            goto L51
        L2c:
            boolean r0 = r5.OooOO0O
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.OooO0oo
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.OooOOoo
            if (r0 == 0) goto L43
            com.ninja.engine.o0O00 r0 = r5.OooOOo
            r0.OooOOo0(r3, r3)
        L43:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = 1
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.OooOOo0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.OooO0oO) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // com.ninja.engine.o000OOo0, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.OooO0oO) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.ninja.engine.o000OOo0, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoO0(z);
        }
    }

    public void setCheckableResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoO0(c0436o0OoO00O.OooooOO.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O == null) {
            this.OooOO0 = z;
        } else if (c0436o0OoO00O.OoooO00) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoO(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoO(AbstractC0692o0ooooOo.OooOo0(c0436o0OoO00O.OooooOO, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoOO(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoOO(AbstractC0809oO0OooOO.OooOoo(c0436o0OoO00O.OooooOO, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoo0(c0436o0OoO00O.OooooOO.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.OooOoO0 != colorStateList) {
            c0436o0OoO00O.OooOoO0 = colorStateList;
            c0436o0OoO00O.onStateChange(c0436o0OoO00O.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList OooOoo;
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.OooOoO0 != (OooOoo = AbstractC0809oO0OooOO.OooOoo(c0436o0OoO00O.OooooOO, i))) {
            c0436o0OoO00O.OooOoO0 = OooOoo;
            c0436o0OoO00O.onStateChange(c0436o0OoO00O.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoo(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoo(c0436o0OoO00O.OooooOO.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0436o0OoO00O c0436o0OoO00O) {
        C0436o0OoO00O c0436o0OoO00O2 = this.OooO0o0;
        if (c0436o0OoO00O2 != c0436o0OoO00O) {
            if (c0436o0OoO00O2 != null) {
                c0436o0OoO00O2.o0O0O00 = new WeakReference(null);
            }
            this.OooO0o0 = c0436o0OoO00O;
            c0436o0OoO00O.o000000 = false;
            c0436o0OoO00O.o0O0O00 = new WeakReference(this);
            OooO0O0(this.OooOOOo);
        }
    }

    public void setChipEndPadding(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.OooooO0 != f) {
            c0436o0OoO00O.OooooO0 = f;
            c0436o0OoO00O.invalidateSelf();
            c0436o0OoO00O.OooOo0o();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            float dimension = c0436o0OoO00O.OooooOO.getResources().getDimension(i);
            if (c0436o0OoO00O.OooooO0 != dimension) {
                c0436o0OoO00O.OooooO0 = dimension;
                c0436o0OoO00O.invalidateSelf();
                c0436o0OoO00O.OooOo0o();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOooO(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOooO(AbstractC0692o0ooooOo.OooOo0(c0436o0OoO00O.OooooOO, i));
        }
    }

    public void setChipIconSize(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOooo(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOooo(c0436o0OoO00O.OooooOO.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo000(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo000(AbstractC0809oO0OooOO.OooOoo(c0436o0OoO00O.OooooOO, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo00O(c0436o0OoO00O.OooooOO.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.OooOoO != f) {
            c0436o0OoO00O.OooOoO = f;
            c0436o0OoO00O.invalidateSelf();
            c0436o0OoO00O.OooOo0o();
        }
    }

    public void setChipMinHeightResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            float dimension = c0436o0OoO00O.OooooOO.getResources().getDimension(i);
            if (c0436o0OoO00O.OooOoO != dimension) {
                c0436o0OoO00O.OooOoO = dimension;
                c0436o0OoO00O.invalidateSelf();
                c0436o0OoO00O.OooOo0o();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.OoooOOO != f) {
            c0436o0OoO00O.OoooOOO = f;
            c0436o0OoO00O.invalidateSelf();
            c0436o0OoO00O.OooOo0o();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            float dimension = c0436o0OoO00O.OooooOO.getResources().getDimension(i);
            if (c0436o0OoO00O.OoooOOO != dimension) {
                c0436o0OoO00O.OoooOOO = dimension;
                c0436o0OoO00O.invalidateSelf();
                c0436o0OoO00O.OooOo0o();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo00o(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo00o(AbstractC0809oO0OooOO.OooOoo(c0436o0OoO00O.OooooOO, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0(c0436o0OoO00O.OooooOO.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0O0(drawable);
        }
        OooO0o0();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0188o00o0 c0188o00o0;
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.Oooo != charSequence) {
            String str = C0188o00o0.OooO0Oo;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                c0188o00o0 = C0188o00o0.OooO0oO;
            } else {
                c0188o00o0 = C0188o00o0.OooO0o;
            }
            c0436o0OoO00O.Oooo = c0188o00o0.OooO0OO(charSequence, c0188o00o0.OooO0OO);
            c0436o0OoO00O.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0OO(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0OO(c0436o0OoO00O.OooooOO.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0O0(AbstractC0692o0ooooOo.OooOo0(c0436o0OoO00O.OooooOO, i));
        }
        OooO0o0();
    }

    public void setCloseIconSize(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0o0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0o0(c0436o0OoO00O.OooooOO.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0o(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0o(c0436o0OoO00O.OooooOO.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0oO(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0oO(AbstractC0809oO0OooOO.OooOoo(c0436o0OoO00O.OooooOO, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // com.ninja.engine.o000OOo0, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // com.ninja.engine.o000OOo0, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOO0O(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.OooO0o0 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
            if (c0436o0OoO00O != null) {
                c0436o0OoO00O.o000OOo = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.OooOOO = z;
        OooO0O0(this.OooOOOo);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(oOO00O0 ooo00o0) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.o000oOoO = ooo00o0;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.o000oOoO = oOO00O0.OooO00o(c0436o0OoO00O.OooooOO, i);
        }
    }

    public void setIconEndPadding(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo(c0436o0OoO00O.OooooOO.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OoooO00(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OoooO00(c0436o0OoO00O.OooooOO.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.OooO0o0 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.o000000O = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.OooO = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.OooO0oo = onClickListener;
        OooO0o0();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OoooO0(colorStateList);
        }
        if (!this.OooO0o0.o0OO00O) {
            OooO0o();
        }
    }

    public void setRippleColorResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OoooO0(AbstractC0809oO0OooOO.OooOoo(c0436o0OoO00O.OooooOO, i));
            if (!this.OooO0o0.o0OO00O) {
                OooO0o();
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1210oOoOOo
    public void setShapeAppearanceModel(C1204oOoOOOO0 c1204oOoOOOO0) {
        this.OooO0o0.setShapeAppearanceModel(c1204oOoOOOO0);
    }

    public void setShowMotionSpec(oOO00O0 ooo00o0) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OoooOO0 = ooo00o0;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OoooOO0 = oOO00O0.OooO00o(c0436o0OoO00O.OooooOO, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c0436o0OoO00O.o000000) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C0436o0OoO00O c0436o0OoO00O2 = this.OooO0o0;
        if (c0436o0OoO00O2 != null && !TextUtils.equals(c0436o0OoO00O2.OooOooo, charSequence)) {
            c0436o0OoO00O2.OooOooo = charSequence;
            c0436o0OoO00O2.o0OoOo0.OooO0o0 = true;
            c0436o0OoO00O2.invalidateSelf();
            c0436o0OoO00O2.OooOo0o();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            Context context = c0436o0OoO00O.OooooOO;
            c0436o0OoO00O.o0OoOo0.OooO0O0(new C1299oOooO0oO(context, i), context);
        }
        OooO0oo();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.OoooOoo != f) {
            c0436o0OoO00O.OoooOoo = f;
            c0436o0OoO00O.invalidateSelf();
            c0436o0OoO00O.OooOo0o();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            float dimension = c0436o0OoO00O.OooooOO.getResources().getDimension(i);
            if (c0436o0OoO00O.OoooOoo != dimension) {
                c0436o0OoO00O.OoooOoo = dimension;
                c0436o0OoO00O.invalidateSelf();
                c0436o0OoO00O.OooOo0o();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C1303oOooOO00 c1303oOooOO00 = c0436o0OoO00O.o0OoOo0;
            C1299oOooO0oO c1299oOooO0oO = c1303oOooOO00.OooO0oO;
            if (c1299oOooO0oO != null) {
                c1299oOooO0oO.OooOO0O = applyDimension;
                c1303oOooOO00.OooO00o.setTextSize(applyDimension);
                c0436o0OoO00O.OooO00o();
            }
        }
        OooO0oo();
    }

    public void setTextStartPadding(float f) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null && c0436o0OoO00O.OoooOoO != f) {
            c0436o0OoO00O.OoooOoO = f;
            c0436o0OoO00O.invalidateSelf();
            c0436o0OoO00O.OooOo0o();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            float dimension = c0436o0OoO00O.OooooOO.getResources().getDimension(i);
            if (c0436o0OoO00O.OoooOoO != dimension) {
                c0436o0OoO00O.OoooOoO = dimension;
                c0436o0OoO00O.invalidateSelf();
                c0436o0OoO00O.OooOo0o();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo0oo(z);
        }
        OooO0o0();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCheckedIconVisible(boolean z) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.OooOoo0(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.Oooo00O(z);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            Context context2 = c0436o0OoO00O.OooooOO;
            c0436o0OoO00O.o0OoOo0.OooO0O0(new C1299oOooO0oO(context2, i), context2);
        }
        OooO0oo();
    }

    public void setTextAppearance(C1299oOooO0oO c1299oOooO0oO) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.o0OoOo0.OooO0O0(c1299oOooO0oO, c0436o0OoO00O.OooooOO);
        }
        OooO0oo();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0867oO0oOo0O interfaceC0867oO0oOo0O) {
    }
}
