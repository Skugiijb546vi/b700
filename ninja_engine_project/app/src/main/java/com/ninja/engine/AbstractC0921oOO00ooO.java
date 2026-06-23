package com.ninja.engine;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOO00ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0921oOO00ooO extends FrameLayout implements InterfaceC0901oO0ooooo {
    public float OooO;
    public boolean OooO00o;
    public ColorStateList OooO0O0;
    public Drawable OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public float OooO0oO;
    public float OooO0oo;
    public int OooOO0;
    public boolean OooOO0O;
    public final FrameLayout OooOO0o;
    public final ImageView OooOOO;
    public final View OooOOO0;
    public final ViewGroup OooOOOO;
    public final TextView OooOOOo;
    public int OooOOo;
    public final TextView OooOOo0;
    public int OooOOoo;
    public ValueAnimator OooOo;
    public ColorStateList OooOo0;
    public C0892oO0ooO0o OooOo00;
    public Drawable OooOo0O;
    public Drawable OooOo0o;
    public float OooOoO;
    public C0919oOO00oOo OooOoO0;
    public boolean OooOoOO;
    public int OooOoo;
    public int OooOoo0;
    public boolean OooOooO;
    public int OooOooo;
    public C0177o00Ooo0 Oooo000;
    public static final int[] Oooo00O = {16842912};
    public static final C0919oOO00oOo Oooo00o = new C0919oOO00oOo(0);
    public static final C0920oOO00oo Oooo0 = new C0919oOO00oOo(0);

    public AbstractC0921oOO00ooO(Context context) {
        super(context);
        this.OooO00o = false;
        this.OooOOo = -1;
        this.OooOOoo = 0;
        this.OooOoO0 = Oooo00o;
        this.OooOoO = 0.0f;
        this.OooOoOO = false;
        this.OooOoo0 = 0;
        this.OooOoo = 0;
        this.OooOooO = false;
        this.OooOooo = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.OooOO0o = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.OooOOO0 = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.OooOOO = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.OooOOOO = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.OooOOOo = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.OooOOo0 = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.OooO0Oo = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.OooO0o0 = viewGroup.getPaddingBottom();
        this.OooO0o = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        OooO00o(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0218o00o0oOO(1, (C0219o00o0oOo) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0o(android.widget.TextView r4, int r5) {
        /*
            com.ninja.engine.AbstractC1094oOOoOOo0.OooOo0o(r4, r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = 0
            goto L58
        Lc:
            int[] r2 = com.ninja.engine.AbstractC1038oOOOoo0O.OooOooo
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r5 < r3) goto L2c
            int r5 = com.ninja.engine.Oooo000.OooO00o(r2)
            goto L30
        L2c:
            int r5 = r2.data
            r5 = r5 & 15
        L30:
            r3 = 2
            if (r5 != r3) goto L4a
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L58
        L4a:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L58:
            if (r5 == 0) goto L5e
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0921oOO00ooO.OooO0o(android.widget.TextView, int):void");
    }

    public static void OooO0oO(TextView textView, float f, float f2, int i) {
        textView.setScaleX(f);
        textView.setScaleY(f2);
        textView.setVisibility(i);
    }

    public static void OooO0oo(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void OooOO0O(ViewGroup viewGroup, int i) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.OooOO0o;
        if (frameLayout == null) {
            return this.OooOOO;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof AbstractC0921oOO00ooO) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        C0177o00Ooo0 c0177o00Ooo0 = this.Oooo000;
        if (c0177o00Ooo0 == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = c0177o00Ooo0.getMinimumWidth() - this.Oooo000.OooO0o0.OooO0O0.OooOo0o.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(minimumWidth, layoutParams.leftMargin);
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.OooOOO.getMeasuredWidth() + max;
    }

    public final void OooO(ImageView imageView) {
        if (this.Oooo000 != null) {
            if (imageView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C0177o00Ooo0 c0177o00Ooo0 = this.Oooo000;
                if (c0177o00Ooo0 != null) {
                    if (c0177o00Ooo0.OooO0OO() != null) {
                        c0177o00Ooo0.OooO0OO().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c0177o00Ooo0);
                    }
                }
            }
            this.Oooo000 = null;
        }
    }

    public final void OooO00o(float f, float f2) {
        this.OooO0oO = f - f2;
        this.OooO0oo = (f2 * 1.0f) / f;
        this.OooO = (f * 1.0f) / f2;
    }

    @Override // com.ninja.engine.InterfaceC0901oO0ooooo
    public final void OooO0O0(C0892oO0ooO0o c0892oO0ooO0o) {
        CharSequence charSequence;
        int i;
        this.OooOo00 = c0892oO0ooO0o;
        setCheckable(c0892oO0ooO0o.isCheckable());
        setChecked(c0892oO0ooO0o.isChecked());
        setEnabled(c0892oO0ooO0o.isEnabled());
        setIcon(c0892oO0ooO0o.getIcon());
        setTitle(c0892oO0ooO0o.OooO0o0);
        setId(c0892oO0ooO0o.OooO00o);
        if (!TextUtils.isEmpty(c0892oO0ooO0o.OooOOo0)) {
            setContentDescription(c0892oO0ooO0o.OooOOo0);
        }
        if (!TextUtils.isEmpty(c0892oO0ooO0o.OooOOo)) {
            charSequence = c0892oO0ooO0o.OooOOo;
        } else {
            charSequence = c0892oO0ooO0o.OooO0o0;
        }
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC1137oOOoooO.OooOOOO(this, charSequence);
        }
        if (c0892oO0ooO0o.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        this.OooO00o = true;
    }

    public final void OooO0OO() {
        C0892oO0ooO0o c0892oO0ooO0o = this.OooOo00;
        if (c0892oO0ooO0o != null) {
            setChecked(c0892oO0ooO0o.isChecked());
        }
    }

    public final void OooO0Oo() {
        Drawable drawable = this.OooO0OO;
        ColorStateList colorStateList = this.OooO0O0;
        FrameLayout frameLayout = this.OooOO0o;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.OooOoOO && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(AbstractC0692o0ooooOo.OoooOoO(this.OooO0O0), null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                ColorStateList colorStateList2 = this.OooO0O0;
                int OooOOo = AbstractC0692o0ooooOo.OooOOo(colorStateList2, AbstractC0692o0ooooOo.OooOo0O);
                int[] iArr = AbstractC0692o0ooooOo.OooOo0;
                drawable = new RippleDrawable(new ColorStateList(new int[][]{AbstractC0692o0ooooOo.OooOo0o, iArr, StateSet.NOTHING}, new int[]{OooOOo, AbstractC0692o0ooooOo.OooOOo(colorStateList2, iArr), AbstractC0692o0ooooOo.OooOOo(colorStateList2, AbstractC0692o0ooooOo.OooOo00)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    public final void OooO0o0(float f, float f2) {
        float f3;
        float f4;
        View view = this.OooOOO0;
        if (view != null) {
            C0919oOO00oOo c0919oOO00oOo = this.OooOoO0;
            c0919oOO00oOo.getClass();
            view.setScaleX(o000OO0O.OooO00o(0.4f, 1.0f, f));
            view.setScaleY(c0919oOO00oOo.OooO0O0(f, f2));
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0) {
                f3 = 0.8f;
            } else {
                f3 = 0.0f;
            }
            if (i == 0) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            view.setAlpha(o000OO0O.OooO0O0(0.0f, 1.0f, f3, f4, f));
        }
        this.OooOoO = f;
    }

    public final void OooOO0(int i) {
        int i2;
        View view = this.OooOOO0;
        if (view != null && i > 0) {
            int min = Math.min(this.OooOoo0, i - (this.OooOooo * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.OooOooO && this.OooOO0 == 2) {
                i2 = min;
            } else {
                i2 = this.OooOoo;
            }
            layoutParams.height = i2;
            layoutParams.width = min;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.OooOO0o;
        if (frameLayout != null && this.OooOoOO) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.OooOOO0;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C0177o00Ooo0 getBadge() {
        return this.Oooo000;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // com.ninja.engine.InterfaceC0901oO0ooooo
    public C0892oO0ooO0o getItemData() {
        return this.OooOo00;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.OooOOo;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int i;
        ViewGroup viewGroup = this.OooOOOO;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        int suggestedIconHeight = getSuggestedIconHeight();
        if (viewGroup.getVisibility() == 0) {
            i = this.OooO0o;
        } else {
            i = 0;
        }
        return viewGroup.getMeasuredHeight() + suggestedIconHeight + i + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.OooOOOO;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0892oO0ooO0o c0892oO0ooO0o = this.OooOo00;
        if (c0892oO0ooO0o != null && c0892oO0ooO0o.isCheckable() && this.OooOo00.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Oooo00O);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0177o00Ooo0 c0177o00Ooo0 = this.Oooo000;
        if (c0177o00Ooo0 != null && c0177o00Ooo0.isVisible()) {
            C0892oO0ooO0o c0892oO0ooO0o = this.OooOo00;
            CharSequence charSequence = c0892oO0ooO0o.OooO0o0;
            if (!TextUtils.isEmpty(c0892oO0ooO0o.OooOOo0)) {
                charSequence = this.OooOo00.OooOOo0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            C0177o00Ooo0 c0177o00Ooo02 = this.Oooo000;
            CharSequence charSequence2 = null;
            if (c0177o00Ooo02.isVisible()) {
                C0179o00Ooo0O c0179o00Ooo0O = c0177o00Ooo02.OooO0o0.OooO0O0;
                String str = c0179o00Ooo0O.OooOO0;
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    CharSequence charSequence3 = c0179o00Ooo0O.OooOOOO;
                    charSequence2 = charSequence3 != null ? charSequence3 : str;
                } else if (c0177o00Ooo02.OooO0o()) {
                    if (c0179o00Ooo0O.OooOOo0 != 0 && (context = (Context) c0177o00Ooo02.OooO00o.get()) != null) {
                        if (c0177o00Ooo02.OooO0oo != -2) {
                            int OooO0Oo = c0177o00Ooo02.OooO0Oo();
                            int i = c0177o00Ooo02.OooO0oo;
                            if (OooO0Oo > i) {
                                charSequence2 = context.getString(c0179o00Ooo0O.OooOOo, Integer.valueOf(i));
                            }
                        }
                        charSequence2 = context.getResources().getQuantityString(c0179o00Ooo0O.OooOOo0, c0177o00Ooo02.OooO0Oo(), Integer.valueOf(c0177o00Ooo02.OooO0Oo()));
                    }
                } else {
                    charSequence2 = c0179o00Ooo0O.OooOOOo;
                }
            }
            sb.append((Object) charSequence2);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0042OoooO0O.OooO00o(isSelected(), 0, 1, getItemVisiblePosition(), 1).OooO00o);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0038Oooo0oo.OooO0o0.OooO00o);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC0263o00ooO0O(i, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.OooOOO0;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        OooO0Oo();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.OooOoOO = z;
        OooO0Oo();
        View view = this.OooOOO0;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.OooOoo = i;
        OooOO0(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.OooO0o != i) {
            this.OooO0o = i;
            OooO0OO();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.OooOooo = i;
        OooOO0(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.OooOooO = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.OooOoo0 = i;
        OooOO0(getWidth());
    }

    public void setBadge(C0177o00Ooo0 c0177o00Ooo0) {
        boolean z;
        C0177o00Ooo0 c0177o00Ooo02 = this.Oooo000;
        if (c0177o00Ooo02 == c0177o00Ooo0) {
            return;
        }
        if (c0177o00Ooo02 != null) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.OooOOO;
        if (z && imageView != null) {
            OooO(imageView);
        }
        this.Oooo000 = c0177o00Ooo0;
        if (imageView != null && c0177o00Ooo0 != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C0177o00Ooo0 c0177o00Ooo03 = this.Oooo000;
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            c0177o00Ooo03.setBounds(rect);
            c0177o00Ooo03.OooO0oo(imageView, null);
            if (c0177o00Ooo03.OooO0OO() != null) {
                c0177o00Ooo03.OooO0OO().setForeground(c0177o00Ooo03);
            } else {
                imageView.getOverlay().add(c0177o00Ooo03);
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
        if (r13 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
        OooO0oo(getIconOrContainer(), (int) (r12.OooO0Oo + r12.OooO0oO), 49);
        OooO0oO(r2, 1.0f, 1.0f, 0);
        r0 = r12.OooO0oo;
        OooO0oO(r3, r0, r0, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
        OooO0oo(getIconOrContainer(), r12.OooO0Oo, 49);
        r0 = r12.OooO;
        OooO0oO(r2, r0, r0, 4);
        OooO0oO(r3, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
        if (r13 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
        OooO0oo(r0, r4, 49);
        OooOO0O(r10, r12.OooO0o0);
        r2.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
        OooO0oo(r0, r4, 17);
        OooOO0O(r10, 0);
        r2.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
        r3.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011a, code lost:
        if (r13 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
        if (r13 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0921oOO00ooO.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        PointerIcon OooO0o0;
        o00O o00o;
        super.setEnabled(z);
        this.OooOOOo.setEnabled(z);
        this.OooOOo0.setEnabled(z);
        this.OooOOO.setEnabled(z);
        if (z) {
            Context context = getContext();
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                o00o = new o00O(19, AbstractC0795oO0OoO.OooO0Oo(context));
            } else {
                o00o = new o00O(19, (Object) null);
            }
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if (i >= 24) {
                OooO0o0 = AbstractC1311oOooOOoo.OooO0o0((PointerIcon) o00o.OooO0O0);
            } else {
                return;
            }
        } else {
            WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
            if (Build.VERSION.SDK_INT >= 24) {
                OooO0o0 = AbstractC1311oOooOOoo.OooO0o0(null);
            } else {
                return;
            }
        }
        AbstractC1454oo0O00O0.OooO00o(this, OooO0o0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.OooOo0O) {
            return;
        }
        this.OooOo0O = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = AbstractC0809oO0OooOO.o0ooOoO(drawable).mutate();
            this.OooOo0o = drawable;
            ColorStateList colorStateList = this.OooOo0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.OooOOO.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.OooOOO;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.OooOo0 = colorStateList;
        if (this.OooOo00 != null && (drawable = this.OooOo0o) != null) {
            drawable.setTintList(colorStateList);
            this.OooOo0o.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.OooO0o0 != i) {
            this.OooO0o0 = i;
            OooO0OO();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.OooO0Oo != i) {
            this.OooO0Oo = i;
            OooO0OO();
        }
    }

    public void setItemPosition(int i) {
        this.OooOOo = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.OooO0O0 = colorStateList;
        OooO0Oo();
    }

    public void setLabelVisibilityMode(int i) {
        C0919oOO00oOo c0919oOO00oOo;
        if (this.OooOO0 != i) {
            this.OooOO0 = i;
            if (this.OooOooO && i == 2) {
                c0919oOO00oOo = Oooo0;
            } else {
                c0919oOO00oOo = Oooo00o;
            }
            this.OooOoO0 = c0919oOO00oOo;
            OooOO0(getWidth());
            OooO0OO();
        }
    }

    public void setShifting(boolean z) {
        if (this.OooOO0O != z) {
            this.OooOO0O = z;
            OooO0OO();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.OooOOoo = i;
        TextView textView = this.OooOOo0;
        OooO0o(textView, i);
        OooO00o(this.OooOOOo.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.OooOOoo);
        TextView textView = this.OooOOo0;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.OooOOOo;
        OooO0o(textView, i);
        OooO00o(textView.getTextSize(), this.OooOOo0.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.OooOOOo.setTextColor(colorStateList);
            this.OooOOo0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.OooOOOo.setText(charSequence);
        this.OooOOo0.setText(charSequence);
        C0892oO0ooO0o c0892oO0ooO0o = this.OooOo00;
        if (c0892oO0ooO0o == null || TextUtils.isEmpty(c0892oO0ooO0o.OooOOo0)) {
            setContentDescription(charSequence);
        }
        C0892oO0ooO0o c0892oO0ooO0o2 = this.OooOo00;
        if (c0892oO0ooO0o2 != null && !TextUtils.isEmpty(c0892oO0ooO0o2.OooOOo)) {
            charSequence = this.OooOo00.OooOOo;
        }
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC1137oOOoooO.OooOOOO(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.OooO0OO = drawable;
        OooO0Oo();
    }
}
