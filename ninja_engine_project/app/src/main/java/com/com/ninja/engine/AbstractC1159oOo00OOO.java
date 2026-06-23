package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
/* renamed from: com.ninja.engine.oOo00OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1159oOo00OOO extends ViewGroup {
    public int[] OooO;
    public boolean OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public float OooO0oO;
    public boolean OooO0oo;
    public int[] OooOO0;
    public Drawable OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;

    public AbstractC1159oOo00OOO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.OooO00o = true;
        this.OooO0O0 = -1;
        this.OooO0OO = 0;
        this.OooO0o0 = 8388659;
        int[] iArr = AbstractC1039oOOOoo0o.OooOOO;
        C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(context, attributeSet, iArr, 0, 0);
        AbstractC1460oo0O00oo.OooOOOO(this, context, iArr, attributeSet, (TypedArray) Oooo0O0.OooO0O0, 0);
        TypedArray typedArray = (TypedArray) Oooo0O0.OooO0O0;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.OooO0oO = typedArray.getFloat(4, -1.0f);
        this.OooO0O0 = typedArray.getInt(3, -1);
        this.OooO0oo = typedArray.getBoolean(7, false);
        setDividerDrawable(Oooo0O0.OooOo0o(5));
        this.OooOOO = typedArray.getInt(8, 0);
        this.OooOOOO = typedArray.getDimensionPixelSize(6, 0);
        Oooo0O0.Oooo0o0();
    }

    public final boolean OooO(int i) {
        if (i == 0) {
            if ((this.OooOOO & 1) == 0) {
                return false;
            }
            return true;
        } else if (i == getChildCount()) {
            if ((this.OooOOO & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.OooOOO & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void OooO0Oo(Canvas canvas, int i) {
        this.OooOO0O.setBounds(getPaddingLeft() + this.OooOOOO, i, (getWidth() - getPaddingRight()) - this.OooOOOO, this.OooOOO0 + i);
        this.OooOO0O.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, com.ninja.engine.oO0O0oo0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, com.ninja.engine.oO0O0oo0] */
    @Override // android.view.ViewGroup
    /* renamed from: OooO0o */
    public C0765oO0O0oo0 generateDefaultLayoutParams() {
        int i = this.OooO0Oo;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    public final void OooO0o0(Canvas canvas, int i) {
        this.OooOO0O.setBounds(i, getPaddingTop() + this.OooOOOO, this.OooOO0o + i, (getHeight() - getPaddingBottom()) - this.OooOOOO);
        this.OooOO0O.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, com.ninja.engine.oO0O0oo0] */
    @Override // android.view.ViewGroup
    /* renamed from: OooO0oO */
    public C0765oO0O0oo0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, com.ninja.engine.oO0O0oo0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, com.ninja.engine.oO0O0oo0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, com.ninja.engine.oO0O0oo0] */
    @Override // android.view.ViewGroup
    /* renamed from: OooO0oo */
    public C0765oO0O0oo0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0765oO0O0oo0) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) ((C0765oO0O0oo0) layoutParams));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0765oO0O0oo0;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.OooO0O0 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.OooO0O0;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.OooO0O0 == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.OooO0OO;
            if (this.OooO0Oo == 1 && (i = this.OooO0o0 & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.OooO0o;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.OooO0o) / 2;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((C0765oO0O0oo0) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.OooO0O0;
    }

    public Drawable getDividerDrawable() {
        return this.OooOO0O;
    }

    public int getDividerPadding() {
        return this.OooOOOO;
    }

    public int getDividerWidth() {
        return this.OooOO0o;
    }

    public int getGravity() {
        return this.OooO0o0;
    }

    public int getOrientation() {
        return this.OooO0Oo;
    }

    public int getShowDividers() {
        return this.OooOOO;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.OooO0oO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.OooOO0O == null) {
            return;
        }
        int i2 = 0;
        if (this.OooO0Oo == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && OooO(i2)) {
                    OooO0Oo(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0765oO0O0oo0) childAt.getLayoutParams())).topMargin) - this.OooOOO0);
                }
                i2++;
            }
            if (OooO(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.OooOOO0;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0765oO0O0oo0) childAt2.getLayoutParams())).bottomMargin;
                }
                OooO0Oo(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = AbstractC1479oo0O0oOo.OooO00o;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && OooO(i2)) {
                C0765oO0O0oo0 c0765oO0O0oo0 = (C0765oO0O0oo0) childAt3.getLayoutParams();
                if (z) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) c0765oO0O0oo0).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0765oO0O0oo0).leftMargin) - this.OooOO0o;
                }
                OooO0o0(canvas, left2);
            }
            i2++;
        }
        if (OooO(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (z) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i = getPaddingRight();
                    right = (left - i) - this.OooOO0o;
                }
            } else {
                C0765oO0O0oo0 c0765oO0O0oo02 = (C0765oO0O0oo0) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft();
                    i = ((LinearLayout.LayoutParams) c0765oO0O0oo02).leftMargin;
                    right = (left - i) - this.OooOO0o;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0765oO0O0oo02).rightMargin;
                }
            }
            OooO0o0(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1159oOo00OOO.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x029c, code lost:
        if (r15 > 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029f, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a0, code lost:
        r9.measure(r11, android.view.View.MeasureSpec.makeMeasureSpec(r15, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b0, code lost:
        if (r15 < 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b3, code lost:
        r12 = android.view.View.combineMeasuredStates(r12, r9.getMeasuredState() & (-256));
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d8, code lost:
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06fc, code lost:
        if (r9 > 0) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06ff, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0700, code lost:
        r15.measure(android.view.View.MeasureSpec.makeMeasureSpec(r9, r7), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0710, code lost:
        if (r9 < 0) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0713, code lost:
        r12 = android.view.View.combineMeasuredStates(r12, r15.getMeasuredState() & (-16777216));
        r1 = r1;
        r7 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1159oOo00OOO.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.OooO00o = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.OooO0O0 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.OooOO0O) {
            return;
        }
        this.OooOO0O = drawable;
        boolean z = false;
        if (drawable != null) {
            this.OooOO0o = drawable.getIntrinsicWidth();
            this.OooOOO0 = drawable.getIntrinsicHeight();
        } else {
            this.OooOO0o = 0;
            this.OooOOO0 = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.OooOOOO = i;
    }

    public void setGravity(int i) {
        if (this.OooO0o0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.OooO0o0 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.OooO0o0;
        if ((8388615 & i3) != i2) {
            this.OooO0o0 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.OooO0oo = z;
    }

    public void setOrientation(int i) {
        if (this.OooO0Oo != i) {
            this.OooO0Oo = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.OooOOO) {
            requestLayout();
        }
        this.OooOOO = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.OooO0o0;
        if ((i3 & 112) != i2) {
            this.OooO0o0 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.OooO0oO = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
