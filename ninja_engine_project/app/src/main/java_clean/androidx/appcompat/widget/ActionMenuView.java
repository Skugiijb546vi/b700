package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.ninja.engine.AbstractC1159oOo00OOO;
import com.ninja.engine.AbstractC1479oo0O0oOo;
import com.ninja.engine.C0058o000000o;
import com.ninja.engine.C0331o0O0oo;
import com.ninja.engine.C0355o0OOO0o;
import com.ninja.engine.C0455o0OoOo00;
import com.ninja.engine.C0765oO0O0oo0;
import com.ninja.engine.C0892oO0ooO0o;
import com.ninja.engine.C1569oo0o0Oo;
import com.ninja.engine.InterfaceC0885oO0oo0o;
import com.ninja.engine.InterfaceC0886oO0oo0o0;
import com.ninja.engine.InterfaceC0899oO0oooo;
import com.ninja.engine.MenuC0887oO0oo0oo;
import com.ninja.engine.o00000;
import com.ninja.engine.o000000;
import com.ninja.engine.o000000O;
import com.ninja.engine.oO;
/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1159oOo00OOO implements InterfaceC0885oO0oo0o, oO {
    public MenuC0887oO0oo0oo OooOOOo;
    public int OooOOo;
    public Context OooOOo0;
    public boolean OooOOoo;
    public int OooOo;
    public InterfaceC0899oO0oooo OooOo0;
    public o000000 OooOo00;
    public InterfaceC0886oO0oo0o0 OooOo0O;
    public boolean OooOo0o;
    public final int OooOoO;
    public final int OooOoO0;
    public o00000 OooOoOO;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.OooOoO0 = (int) (56.0f * f);
        this.OooOoO = (int) (f * 4.0f);
        this.OooOOo0 = context;
        this.OooOOo = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o000000o, android.widget.LinearLayout$LayoutParams] */
    public static C0058o000000o OooOO0() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.OooO00o = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ninja.engine.o000000o, android.widget.LinearLayout$LayoutParams] */
    public static C0058o000000o OooOO0O(ViewGroup.LayoutParams layoutParams) {
        C0058o000000o c0058o000000o;
        if (layoutParams != null) {
            if (layoutParams instanceof C0058o000000o) {
                C0058o000000o c0058o000000o2 = (C0058o000000o) layoutParams;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c0058o000000o2);
                layoutParams2.OooO00o = c0058o000000o2.OooO00o;
                c0058o000000o = layoutParams2;
            } else {
                c0058o000000o = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c0058o000000o).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0058o000000o).gravity = 16;
            }
            return c0058o000000o;
        }
        return OooOO0();
    }

    @Override // com.ninja.engine.oO
    public final void OooO00o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        this.OooOOOo = menuC0887oO0oo0oo;
    }

    @Override // com.ninja.engine.InterfaceC0885oO0oo0o
    public final boolean OooO0OO(C0892oO0ooO0o c0892oO0ooO0o) {
        return this.OooOOOo.OooOOo0(c0892oO0ooO0o, null, 0);
    }

    @Override // com.ninja.engine.AbstractC1159oOo00OOO
    public final /* bridge */ /* synthetic */ C0765oO0O0oo0 OooO0o() {
        return OooOO0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, com.ninja.engine.oO0O0oo0] */
    @Override // com.ninja.engine.AbstractC1159oOo00OOO
    public final C0765oO0O0oo0 OooO0oO(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // com.ninja.engine.AbstractC1159oOo00OOO
    public final /* bridge */ /* synthetic */ C0765oO0O0oo0 OooO0oo(ViewGroup.LayoutParams layoutParams) {
        return OooOO0O(layoutParams);
    }

    public final boolean OooOO0o(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof o000000O)) {
            z = ((o000000O) childAt).OooO00o();
        }
        return (i <= 0 || !(childAt2 instanceof o000000O)) ? z : z | ((o000000O) childAt2).OooO0OO();
    }

    @Override // com.ninja.engine.AbstractC1159oOo00OOO, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0058o000000o;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // com.ninja.engine.AbstractC1159oOo00OOO, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return OooOO0();
    }

    @Override // com.ninja.engine.AbstractC1159oOo00OOO, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.OooOOOo == null) {
            Context context = getContext();
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = new MenuC0887oO0oo0oo(context);
            this.OooOOOo = menuC0887oO0oo0oo;
            menuC0887oO0oo0oo.OooO0o0 = new C0331o0O0oo(2, this);
            o000000 o000000Var = new o000000(context);
            this.OooOo00 = o000000Var;
            o000000Var.OooOOO0 = true;
            o000000Var.OooOOO = true;
            InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooOo0;
            if (interfaceC0899oO0oooo == null) {
                interfaceC0899oO0oooo = new C0455o0OoOo00(9);
            }
            o000000Var.OooO0o0 = interfaceC0899oO0oooo;
            this.OooOOOo.OooO0O0(o000000Var, this.OooOOo0);
            o000000 o000000Var2 = this.OooOo00;
            o000000Var2.OooO0oo = this;
            this.OooOOOo = o000000Var2.OooO0OO;
        }
        return this.OooOOOo;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        o000000 o000000Var = this.OooOo00;
        C1569oo0o0Oo c1569oo0o0Oo = o000000Var.OooOO0;
        if (c1569oo0o0Oo != null) {
            return c1569oo0o0Oo.getDrawable();
        }
        if (o000000Var.OooOO0o) {
            return o000000Var.OooOO0O;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.OooOOo;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o000000 o000000Var = this.OooOo00;
        if (o000000Var != null) {
            o000000Var.OooO(false);
            if (this.OooOo00.OooO0oO()) {
                this.OooOo00.OooO0Oo();
                this.OooOo00.OooOOOO();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o000000 o000000Var = this.OooOo00;
        if (o000000Var != null) {
            o000000Var.OooO0Oo();
            C0355o0OOO0o c0355o0OOO0o = o000000Var.OooOo0;
            if (c0355o0OOO0o != null && c0355o0OOO0o.OooO0O0()) {
                c0355o0OOO0o.OooOO0.dismiss();
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1159oOo00OOO, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int width;
        int i6;
        if (!this.OooOo0o) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = AbstractC1479oo0O0oOo.OooO00o;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0058o000000o c0058o000000o = (C0058o000000o) childAt.getLayoutParams();
                if (c0058o000000o.OooO00o) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (OooOO0o(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0058o000000o).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0058o000000o).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0058o000000o).leftMargin) + ((LinearLayout.LayoutParams) c0058o000000o).rightMargin;
                    OooOO0o(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0058o000000o c0058o000000o2 = (C0058o000000o) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0058o000000o2.OooO00o) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c0058o000000o2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0058o000000o2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0058o000000o c0058o000000o3 = (C0058o000000o) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0058o000000o3.OooO00o) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) c0058o000000o3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0058o000000o3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // com.ninja.engine.AbstractC1159oOo00OOO, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object r1 = null;
        boolean z5;
        int i11;
        int i12;
        int i13;
        ActionMenuItemView actionMenuItemView;
        boolean z6;
        int i14;
        boolean z7;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo;
        boolean z8 = this.OooOo0o;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.OooOo0o = z;
        if (z8 != z) {
            this.OooOo = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.OooOo0o && (menuC0887oO0oo0oo = this.OooOOOo) != null && size != this.OooOo) {
            this.OooOo = size;
            menuC0887oO0oo0oo.OooOOOo(true);
        }
        int childCount = getChildCount();
        if (this.OooOo0o && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i15 = size2 - paddingRight;
            int i16 = this.OooOoO0;
            int i17 = i15 / i16;
            int i18 = i15 % i16;
            if (i17 == 0) {
                setMeasuredDimension(i15, 0);
                return;
            }
            int i19 = (i18 / i17) + i16;
            int childCount2 = getChildCount();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            boolean z9 = false;
            long j = 0;
            int i23 = 0;
            int i24 = 0;
            while (true) {
                i3 = this.OooOoO;
                if (i22 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i22);
                int i25 = size3;
                if (childAt.getVisibility() == 8) {
                    i12 = i15;
                    i13 = paddingBottom;
                } else {
                    boolean z10 = childAt instanceof ActionMenuItemView;
                    int i26 = i20 + 1;
                    if (z10) {
                        childAt.setPadding(i3, 0, i3, 0);
                    }
                    C0058o000000o c0058o000000o = (C0058o000000o) childAt.getLayoutParams();
                    c0058o000000o.OooO0o = false;
                    c0058o000000o.OooO0OO = 0;
                    c0058o000000o.OooO0O0 = 0;
                    c0058o000000o.OooO0Oo = false;
                    ((LinearLayout.LayoutParams) c0058o000000o).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c0058o000000o).rightMargin = 0;
                    if (z10 && (!TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()))) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c0058o000000o.OooO0o0 = z5;
                    if (c0058o000000o.OooO00o) {
                        i11 = 1;
                    } else {
                        i11 = i17;
                    }
                    C0058o000000o c0058o000000o2 = (C0058o000000o) childAt.getLayoutParams();
                    i12 = i15;
                    i13 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z10) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && (!TextUtils.isEmpty(actionMenuItemView.getText()))) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i11 > 0 && (!z6 || i11 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i14 = measuredWidth / i19;
                        if (measuredWidth % i19 != 0) {
                            i14++;
                        }
                        if (z6 && i14 < 2) {
                            i14 = 2;
                        }
                    } else {
                        i14 = 0;
                    }
                    if (!c0058o000000o2.OooO00o && z6) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    c0058o000000o2.OooO0Oo = z7;
                    c0058o000000o2.OooO0O0 = i14;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i19, 1073741824), makeMeasureSpec);
                    i21 = Math.max(i21, i14);
                    if (c0058o000000o.OooO0Oo) {
                        i23++;
                    }
                    if (c0058o000000o.OooO00o) {
                        z9 = true;
                    }
                    i17 -= i14;
                    i24 = Math.max(i24, childAt.getMeasuredHeight());
                    if (i14 == 1) {
                        j |= 1 << i22;
                    }
                    i20 = i26;
                }
                i22++;
                size3 = i25;
                paddingBottom = i13;
                i15 = i12;
            }
            int i27 = i15;
            int i28 = size3;
            int i29 = i24;
            if (z9 && i20 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z11 = false;
            while (i23 > 0 && i17 > 0) {
                int i30 = Integer.MAX_VALUE;
                int i31 = 0;
                int i32 = 0;
                long j2 = 0;
                while (i32 < childCount2) {
                    int i33 = i29;
                    C0058o000000o c0058o000000o3 = (C0058o000000o) getChildAt(i32).getLayoutParams();
                    boolean z12 = z11;
                    if (c0058o000000o3.OooO0Oo) {
                        int i34 = c0058o000000o3.OooO0O0;
                        if (i34 < i30) {
                            j2 = 1 << i32;
                            i30 = i34;
                            i31 = 1;
                        } else if (i34 == i30) {
                            i31++;
                            j2 |= 1 << i32;
                        }
                    }
                    i32++;
                    z11 = z12;
                    i29 = i33;
                }
                i5 = i29;
                z3 = z11;
                j |= j2;
                if (i31 > i17) {
                    i4 = mode;
                    break;
                }
                int i35 = i30 + 1;
                int i36 = 0;
                while (i36 < childCount2) {
                    View childAt2 = getChildAt(i36);
                    C0058o000000o c0058o000000o4 = (C0058o000000o) childAt2.getLayoutParams();
                    int i37 = mode;
                    int i38 = childMeasureSpec;
                    int i39 = childCount2;
                    long j3 = 1 << i36;
                    if ((j2 & j3) == 0) {
                        if (c0058o000000o4.OooO0O0 == i35) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && c0058o000000o4.OooO0o0) {
                            r1 = 1;
                            r1 = 1;
                            if (i17 == 1) {
                                childAt2.setPadding(i3 + i19, 0, i3, 0);
                            }
                        } else {
                            r1 = 1;
                        }
                        c0058o000000o4.OooO0O0 += r1;
                        c0058o000000o4.OooO0o = r1;
                        i17--;
                    }
                    i36++;
                    childMeasureSpec = i38;
                    mode = i37;
                    childCount2 = i39;
                }
                i29 = i5;
                z11 = true;
            }
            i4 = mode;
            i5 = i29;
            z3 = z11;
            int i40 = childMeasureSpec;
            int i41 = childCount2;
            if (!z9 && i20 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i17 <= 0 || j == 0 || (i17 >= i20 - 1 && !z4 && i21 <= 1)) {
                i6 = i41;
            } else {
                float bitCount = Long.bitCount(j);
                if (!z4) {
                    if ((j & 1) != 0 && !((C0058o000000o) getChildAt(0).getLayoutParams()).OooO0o0) {
                        bitCount -= 0.5f;
                    }
                    int i42 = i41 - 1;
                    if ((j & (1 << i42)) != 0 && !((C0058o000000o) getChildAt(i42).getLayoutParams()).OooO0o0) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i10 = (int) ((i17 * i19) / bitCount);
                } else {
                    i10 = 0;
                }
                i6 = i41;
                for (int i43 = 0; i43 < i6; i43++) {
                    if ((j & (1 << i43)) != 0) {
                        View childAt3 = getChildAt(i43);
                        C0058o000000o c0058o000000o5 = (C0058o000000o) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0058o000000o5.OooO0OO = i10;
                            c0058o000000o5.OooO0o = true;
                            if (i43 == 0 && !c0058o000000o5.OooO0o0) {
                                ((LinearLayout.LayoutParams) c0058o000000o5).leftMargin = (-i10) / 2;
                            }
                        } else if (c0058o000000o5.OooO00o) {
                            c0058o000000o5.OooO0OO = i10;
                            c0058o000000o5.OooO0o = true;
                            ((LinearLayout.LayoutParams) c0058o000000o5).rightMargin = (-i10) / 2;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c0058o000000o5).leftMargin = i10 / 2;
                            }
                            if (i43 != i6 - 1) {
                                ((LinearLayout.LayoutParams) c0058o000000o5).rightMargin = i10 / 2;
                            }
                        }
                        z3 = true;
                    }
                }
            }
            if (z3) {
                int i44 = 0;
                while (i44 < i6) {
                    View childAt4 = getChildAt(i44);
                    C0058o000000o c0058o000000o6 = (C0058o000000o) childAt4.getLayoutParams();
                    if (!c0058o000000o6.OooO0o) {
                        i9 = i40;
                    } else {
                        i9 = i40;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0058o000000o6.OooO0O0 * i19) + c0058o000000o6.OooO0OO, 1073741824), i9);
                    }
                    i44++;
                    i40 = i9;
                }
            }
            if (i4 != 1073741824) {
                i8 = i27;
                i7 = i5;
            } else {
                i7 = i28;
                i8 = i27;
            }
            setMeasuredDimension(i8, i7);
            return;
        }
        for (int i45 = 0; i45 < childCount; i45++) {
            C0058o000000o c0058o000000o7 = (C0058o000000o) getChildAt(i45).getLayoutParams();
            ((LinearLayout.LayoutParams) c0058o000000o7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0058o000000o7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.OooOo00.OooOOo = z;
    }

    public void setOnMenuItemClickListener(o00000 o00000Var) {
        this.OooOoOO = o00000Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        o000000 o000000Var = this.OooOo00;
        C1569oo0o0Oo c1569oo0o0Oo = o000000Var.OooOO0;
        if (c1569oo0o0Oo != null) {
            c1569oo0o0Oo.setImageDrawable(drawable);
            return;
        }
        o000000Var.OooOO0o = true;
        o000000Var.OooOO0O = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.OooOOoo = z;
    }

    public void setPopupTheme(int i) {
        if (this.OooOOo != i) {
            this.OooOOo = i;
            if (i == 0) {
                this.OooOOo0 = getContext();
            } else {
                this.OooOOo0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(o000000 o000000Var) {
        this.OooOo00 = o000000Var;
        o000000Var.OooO0oo = this;
        this.OooOOOo = o000000Var.OooO0OO;
    }

    @Override // com.ninja.engine.AbstractC1159oOo00OOO, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooOO0O(layoutParams);
    }
}


