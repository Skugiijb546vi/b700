package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC1039oOOOoo0o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.AbstractC1479oo0O0oOo;
import com.ninja.engine.C0355o0OOO0o;
import com.ninja.engine.C1470oo0O0OoO;
import com.ninja.engine.MenuC0887oO0oo0oo;
import com.ninja.engine.OooOOO;
import com.ninja.engine.R;
import com.ninja.engine.o000000;
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public CharSequence OooO;
    public final OooOOO OooO00o;
    public final Context OooO0O0;
    public ActionMenuView OooO0OO;
    public o000000 OooO0Oo;
    public C1470oo0O0OoO OooO0o;
    public int OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public CharSequence OooOO0;
    public View OooOO0O;
    public View OooOO0o;
    public LinearLayout OooOOO;
    public View OooOOO0;
    public TextView OooOOOO;
    public TextView OooOOOo;
    public final int OooOOo;
    public final int OooOOo0;
    public boolean OooOOoo;
    public final int OooOo00;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.OooO00o = new OooOOO(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.OooO0O0 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.OooO0O0 = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooO0Oo, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = AbstractC0692o0ooooOo.OooOo0(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.OooOOo0 = obtainStyledAttributes.getResourceId(5, 0);
        this.OooOOo = obtainStyledAttributes.getResourceId(4, 0);
        this.OooO0o0 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.OooOo00 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int OooO0o(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int OooO0oO(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final C1470oo0O0OoO OooO(int i, long j) {
        C1470oo0O0OoO c1470oo0O0OoO = this.OooO0o;
        if (c1470oo0O0OoO != null) {
            c1470oo0O0OoO.OooO0O0();
        }
        OooOOO oooOOO = this.OooO00o;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1470oo0O0OoO OooO00o = AbstractC1460oo0O00oo.OooO00o(this);
            OooO00o.OooO00o(1.0f);
            OooO00o.OooO0OO(j);
            oooOOO.OooO0OO.OooO0o = OooO00o;
            oooOOO.OooO0O0 = i;
            OooO00o.OooO0Oo(oooOOO);
            return OooO00o;
        }
        C1470oo0O0OoO OooO00o2 = AbstractC1460oo0O00oo.OooO00o(this);
        OooO00o2.OooO00o(0.0f);
        OooO00o2.OooO0OO(j);
        oooOOO.OooO0OO.OooO0o = OooO00o2;
        oooOOO.OooO0O0 = i;
        OooO00o2.OooO0Oo(oooOOO);
        return OooO00o2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(com.ninja.engine.o00000O r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.OooOO0O
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.OooOo00
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.OooOO0O = r0
        L15:
            r6.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r6.OooOO0O
            goto L15
        L22:
            android.view.View r0 = r6.OooOO0O
            r2 = 2131296323(0x7f090043, float:1.821056E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.OooOO0o = r0
            com.ninja.engine.o00Ooo r2 = new com.ninja.engine.o00Ooo
            r3 = 0
            r2.<init>(r3, r7)
            r0.setOnClickListener(r2)
            com.ninja.engine.oO0oo0oo r7 = r7.OooO0Oo()
            com.ninja.engine.o000000 r0 = r6.OooO0Oo
            if (r0 == 0) goto L50
            r0.OooO0Oo()
            com.ninja.engine.o0OOO0o r0 = r0.OooOo0
            if (r0 == 0) goto L50
            boolean r2 = r0.OooO0O0()
            if (r2 == 0) goto L50
            com.ninja.engine.oO0oooO0 r0 = r0.OooOO0
            r0.dismiss()
        L50:
            com.ninja.engine.o000000 r0 = new com.ninja.engine.o000000
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.OooO0Oo = r0
            r2 = 1
            r0.OooOOO0 = r2
            r0.OooOOO = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            com.ninja.engine.o000000 r3 = r6.OooO0Oo
            android.content.Context r4 = r6.OooO0O0
            r7.OooO0O0(r3, r4)
            com.ninja.engine.o000000 r7 = r6.OooO0Oo
            com.ninja.engine.oO r3 = r7.OooO0oo
            if (r3 != 0) goto L88
            android.view.LayoutInflater r4 = r7.OooO0Oo
            int r5 = r7.OooO0o
            android.view.View r1 = r4.inflate(r5, r6, r1)
            com.ninja.engine.oO r1 = (com.ninja.engine.oO) r1
            r7.OooO0oo = r1
            com.ninja.engine.oO0oo0oo r4 = r7.OooO0OO
            r1.OooO00o(r4)
            r7.OooO(r2)
        L88:
            com.ninja.engine.oO r1 = r7.OooO0oo
            if (r3 == r1) goto L92
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L92:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.OooO0OO = r1
            r7 = 0
            r1.setBackground(r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.OooO0OO
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.OooO0OO(com.ninja.engine.o00000O):void");
    }

    public final void OooO0Oo() {
        if (this.OooOOO == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.OooOOO = linearLayout;
            this.OooOOOO = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.OooOOOo = (TextView) this.OooOOO.findViewById(R.id.action_bar_subtitle);
            int i = this.OooOOo0;
            if (i != 0) {
                this.OooOOOO.setTextAppearance(getContext(), i);
            }
            int i2 = this.OooOOo;
            if (i2 != 0) {
                this.OooOOOo.setTextAppearance(getContext(), i2);
            }
        }
        this.OooOOOO.setText(this.OooO);
        this.OooOOOo.setText(this.OooOO0);
        boolean z = !TextUtils.isEmpty(this.OooO);
        boolean z2 = !TextUtils.isEmpty(this.OooOO0);
        int i3 = 8;
        this.OooOOOo.setVisibility(z2 ? 0 : 8);
        this.OooOOO.setVisibility((z || z2) ? 0 : 0);
        if (this.OooOOO.getParent() == null) {
            addView(this.OooOOO);
        }
    }

    public final void OooO0o0() {
        removeAllViews();
        this.OooOOO0 = null;
        this.OooO0OO = null;
        this.OooO0Oo = null;
        View view = this.OooOO0o;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: OooO0oo */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C1470oo0O0OoO c1470oo0O0OoO = this.OooO0o;
            if (c1470oo0O0OoO != null) {
                c1470oo0O0OoO.OooO0O0();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.OooO0o != null) {
            return this.OooO00o.OooO0O0;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.OooO0o0;
    }

    public CharSequence getSubtitle() {
        return this.OooOO0;
    }

    public CharSequence getTitle() {
        return this.OooO;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1039oOOOoo0o.OooO00o, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        o000000 o000000Var = this.OooO0Oo;
        if (o000000Var != null) {
            Configuration configuration2 = o000000Var.OooO0O0.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
                if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                    if (i2 >= 360) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 5;
            }
            o000000Var.OooOOo0 = i;
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = o000000Var.OooO0OO;
            if (menuC0887oO0oo0oo != null) {
                menuC0887oO0oo0oo.OooOOOo(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o000000 o000000Var = this.OooO0Oo;
        if (o000000Var != null) {
            o000000Var.OooO0Oo();
            C0355o0OOO0o c0355o0OOO0o = this.OooO0Oo.OooOo0;
            if (c0355o0OOO0o != null && c0355o0OOO0o.OooO0O0()) {
                c0355o0OOO0o.OooOO0.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.OooO0oo = false;
        }
        if (!this.OooO0oo) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.OooO0oo = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.OooO0oo = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3 = AbstractC1479oo0O0oOo.OooO00o;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.OooOO0O;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.OooOO0O.getLayoutParams();
            if (z2) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (z2) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.rightMargin;
            }
            if (z2) {
                i7 = paddingLeft - i5;
            } else {
                i7 = paddingLeft + i5;
            }
            int OooO0oO = OooO0oO(this.OooOO0O, i7, paddingTop, paddingTop2, z2) + i7;
            if (z2) {
                i8 = OooO0oO - i6;
            } else {
                i8 = OooO0oO + i6;
            }
            paddingLeft = i8;
        }
        LinearLayout linearLayout = this.OooOOO;
        if (linearLayout != null && this.OooOOO0 == null && linearLayout.getVisibility() != 8) {
            paddingLeft += OooO0oO(this.OooOOO, paddingLeft, paddingTop, paddingTop2, z2);
        }
        View view2 = this.OooOOO0;
        if (view2 != null) {
            OooO0oO(view2, paddingLeft, paddingTop, paddingTop2, z2);
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.OooO0OO;
        if (actionMenuView != null) {
            OooO0oO(actionMenuView, paddingRight, paddingTop, paddingTop2, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.OooO0o0;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.OooOO0O;
        if (view != null) {
            int OooO0o = OooO0o(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.OooOO0O.getLayoutParams();
            paddingLeft = OooO0o - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.OooO0OO;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = OooO0o(this.OooO0OO, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.OooOOO;
        if (linearLayout != null && this.OooOOO0 == null) {
            if (this.OooOOoo) {
                this.OooOOO.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.OooOOO.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.OooOOO.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = OooO0o(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.OooOOO0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.OooOOO0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.OooO0o0 <= 0) {
            int childCount = getChildCount();
            i3 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.OooO0oO = false;
        }
        if (!this.OooO0oO) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.OooO0oO = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.OooO0oO = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.OooO0o0 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.OooOOO0;
        if (view2 != null) {
            removeView(view2);
        }
        this.OooOOO0 = view;
        if (view != null && (linearLayout = this.OooOOO) != null) {
            removeView(linearLayout);
            this.OooOOO = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.OooOO0 = charSequence;
        OooO0Oo();
    }

    public void setTitle(CharSequence charSequence) {
        this.OooO = charSequence;
        OooO0Oo();
        AbstractC1460oo0O00oo.OooOOo0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.OooOOoo) {
            requestLayout();
        }
        this.OooOOoo = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
