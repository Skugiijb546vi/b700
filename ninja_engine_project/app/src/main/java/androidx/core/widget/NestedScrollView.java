package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.android.volley.toolbox.ImageRequest;
import com.ninja.engine.AbstractC0228o00oO0O0;
import com.ninja.engine.AbstractC0450o0OoOOo;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC0927oOO0O0oo;
import com.ninja.engine.AbstractC1452oo0O000o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0391o0OOoOO;
import com.ninja.engine.C0858oO0oOOOO;
import com.ninja.engine.R;
import com.ninja.engine.o00O;
import com.ninja.engine.oOO0O;
import com.ninja.engine.oOO0OO;
import com.ninja.engine.oOO0OO0;
import com.ninja.engine.oOO0OO0O;
import com.ninja.engine.oOO0OOO;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements oOO0OO {
    public boolean OooO;
    public final float OooO00o;
    public long OooO0O0;
    public final Rect OooO0OO;
    public final OverScroller OooO0Oo;
    public final EdgeEffect OooO0o;
    public final EdgeEffect OooO0o0;
    public int OooO0oO;
    public boolean OooO0oo;
    public View OooOO0;
    public boolean OooOO0O;
    public VelocityTracker OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public final int OooOOOO;
    public final int OooOOOo;
    public int OooOOo;
    public final int OooOOo0;
    public final int[] OooOOoo;
    public final oOO0OOO OooOo;
    public int OooOo0;
    public final int[] OooOo00;
    public int OooOo0O;
    public oOO0OO0 OooOo0o;
    public float OooOoO;
    public final oOO0OO0O OooOoO0;
    public final C0391o0OOoOO OooOoOO;
    public static final float OooOoo0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final C0858oO0oOOOO OooOoo = new C0858oO0oOOOO(3);
    public static final int[] OooOooO = {16843130};

    /* JADX WARN: Type inference failed for: r7v2, types: [com.ninja.engine.oOO0OOO, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.OooO0OO = new Rect();
        this.OooO0oo = true;
        this.OooO = false;
        this.OooOO0 = null;
        this.OooOO0O = false;
        this.OooOOO = true;
        this.OooOOo = -1;
        this.OooOOoo = new int[2];
        this.OooOo00 = new int[2];
        this.OooOoOO = new C0391o0OOoOO(getContext(), new o00O(18, this));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            edgeEffect = AbstractC0450o0OoOOo.OooO00o(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.OooO0o0 = edgeEffect;
        if (i >= 31) {
            edgeEffect2 = AbstractC0450o0OoOOo.OooO00o(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.OooO0o = edgeEffect2;
        this.OooO00o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.OooO0Oo = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.OooOOOO = viewConfiguration.getScaledTouchSlop();
        this.OooOOOo = viewConfiguration.getScaledMinimumFlingVelocity();
        this.OooOOo0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOooO, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.OooOo = new Object();
        this.OooOoO0 = new oOO0OO0O(this);
        setNestedScrollingEnabled(true);
        AbstractC1460oo0O00oo.OooOOOo(this, OooOoo);
    }

    public static boolean OooOO0o(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && OooOO0o((View) parent, view2);
    }

    public final boolean OooO(KeyEvent keyEvent) {
        this.OooO0OO.setEmpty();
        int i = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            if (keyCode != 92) {
                                if (keyCode != 93) {
                                    if (keyCode != 122) {
                                        if (keyCode != 123) {
                                            return false;
                                        }
                                    } else {
                                        OooOOo0(33);
                                        return false;
                                    }
                                }
                            }
                        } else if (keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        OooOOo0(i);
                        return false;
                    } else if (!keyEvent.isAltPressed()) {
                        return OooO0oO(130);
                    }
                    return OooOO0O(130);
                } else if (!keyEvent.isAltPressed()) {
                    return OooO0oO(33);
                }
                return OooOO0O(33);
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO00o(View view, View view2, int i, int i2) {
        oOO0OOO ooo0ooo = this.OooOo;
        if (i2 == 1) {
            ooo0ooo.OooO0O0 = i;
        } else {
            ooo0ooo.OooO00o = i;
        }
        this.OooOoO0.OooO0oo(2, i2);
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0O0(View view, int i) {
        oOO0OOO ooo0ooo = this.OooOo;
        if (i == 1) {
            ooo0ooo.OooO0O0 = 0;
        } else {
            ooo0ooo.OooO00o = 0;
        }
        OooOo0o(i);
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0OO(View view, int i, int i2, int[] iArr, int i3) {
        this.OooOoO0.OooO0OO(i, i2, i3, iArr, null);
    }

    @Override // com.ninja.engine.oOO0OO
    public final void OooO0Oo(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OooOOO(i4, i5, iArr);
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final boolean OooO0o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0o0(View view, int i, int i2, int i3, int i4, int i5) {
        OooOOO(i4, i5, null);
    }

    public final boolean OooO0oO(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && OooOOO0(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.OooO0OO;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            OooOOoo(OooO0oo(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            OooOOoo(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!OooOOO0(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int OooO0oo(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final void OooOO0(int i) {
        if (getChildCount() > 0) {
            this.OooO0Oo.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.OooOoO0.OooO0oo(2, 1);
            this.OooOo0O = getScrollY();
            postInvalidateOnAnimation();
            if (AbstractC0228o00oO0O0.OooO00o()) {
                AbstractC0927oOO0O0oo.OooO00o(this, Math.abs(this.OooO0Oo.getCurrVelocity()));
            }
        }
    }

    public final boolean OooOO0O(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.OooO0OO;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return OooOOo(i, rect.top, rect.bottom);
    }

    public final void OooOOO(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.OooOoO0.OooO0Oo(scrollY2, i - scrollY2, i2, iArr);
    }

    public final boolean OooOOO0(View view, int i, int i2) {
        Rect rect = this.OooO0OO;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void OooOOOO(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.OooOOo) {
            int i = actionIndex == 0 ? 1 : 0;
            this.OooO0oO = (int) motionEvent.getY(i);
            this.OooOOo = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.OooOO0o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean OooOOOo(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 > 0 || i2 < 0) {
            i2 = 0;
            z = true;
        } else {
            z = false;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !this.OooOoO0.OooO0oO(1)) {
            this.OooO0Oo.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i4);
        if (z || z2) {
            return true;
        }
        return false;
    }

    public final boolean OooOOo(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                if (i2 < top && bottom < i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view == null) {
                    view = view2;
                    z5 = z3;
                } else {
                    if ((z && top < view.getTop()) || (!z && bottom > view.getBottom())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 >= scrollY && i3 <= i5) {
            z2 = false;
        } else {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            OooOOoo(i4, 0, 1, true);
            z2 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r0 < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo0(int r6) {
        /*
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.OooO0OO
            if (r0 == 0) goto L3c
            int r0 = r5.getScrollY()
            int r0 = r0 + r3
            r4.top = r0
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L47
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r4.top
            int r0 = r0 + r3
            if (r0 <= r1) goto L47
            int r1 = r1 - r3
            goto L45
        L3c:
            int r0 = r5.getScrollY()
            int r0 = r0 - r3
            r4.top = r0
            if (r0 >= 0) goto L47
        L45:
            r4.top = r1
        L47:
            int r0 = r4.top
            int r3 = r3 + r0
            r4.bottom = r3
            r5.OooOOo(r6, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.OooOOo0(int):void");
    }

    public final int OooOOoo(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        VelocityTracker velocityTracker;
        oOO0OO0O ooo0oo0o = this.OooOoO0;
        if (i3 == 1) {
            ooo0oo0o.OooO0oo(2, i3);
        }
        boolean OooO0OO = this.OooOoO0.OooO0OO(0, i, i3, this.OooOo00, this.OooOOoo);
        int[] iArr = this.OooOo00;
        int[] iArr2 = this.OooOOoo;
        if (OooO0OO) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (OooOOOo(i4, 0, scrollY, scrollRange) && !ooo0oo0o.OooO0oO(i3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.OooOoO0.OooO0o0(0, scrollY2, 0, i4 - scrollY2, this.OooOOoo, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.OooO0o;
        EdgeEffect edgeEffect2 = this.OooO0o0;
        if (i8 < 0) {
            if (z2) {
                AbstractC0692o0ooooOo.Oooo0oo(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z2) {
            AbstractC0692o0ooooOo.Oooo0oo(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z4 = z3;
        } else {
            postInvalidateOnAnimation();
            z4 = false;
        }
        if (z4 && i3 == 0 && (velocityTracker = this.OooOO0o) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            OooOo0o(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    public final void OooOo0(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.OooO0O0 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.OooO0Oo;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z) {
                this.OooOoO0.OooO0oo(2, 1);
            } else {
                OooOo0o(1);
            }
            this.OooOo0O = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.OooO0Oo.isFinished()) {
                this.OooO0Oo.abortAnimation();
                OooOo0o(1);
            }
            scrollBy(i, i2);
        }
        this.OooO0O0 = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean OooOo00(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float OooOo00 = AbstractC0692o0ooooOo.OooOo00(edgeEffect) * getHeight();
        float f = this.OooO00o * 0.015f;
        double log = Math.log((Math.abs(-i) * 0.35f) / f);
        double d = OooOoo0;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < OooOo00) {
            return true;
        }
        return false;
    }

    public final boolean OooOo0O(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.OooO0o0;
        if (AbstractC0692o0ooooOo.OooOo00(edgeEffect) != 0.0f) {
            AbstractC0692o0ooooOo.Oooo0oo(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.OooO0o;
        if (AbstractC0692o0ooooOo.OooOo00(edgeEffect2) != 0.0f) {
            AbstractC0692o0ooooOo.Oooo0oo(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    public final void OooOo0o(int i) {
        this.OooOoO0.OooO(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || OooO(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.OooOoO0.OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.OooOoO0.OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.OooOoO0.OooO0OO(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.OooOoO0.OooO0o0(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.OooO0o0;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.OooO0o;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        oOO0OOO ooo0ooo = this.OooOo;
        return ooo0ooo.OooO0O0 | ooo0ooo.OooO00o;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.OooOoO == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.OooOoO = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.OooOoO;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.OooOoO0.OooO0oO(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.OooOoO0.OooO0Oo;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.OooO = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
        if (r7 >= 0) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r29) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.OooOO0O) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            OooOOOO(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.OooOOo;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.OooO0oO) > this.OooOOOO && (2 & getNestedScrollAxes()) == 0) {
                            this.OooOO0O = true;
                            this.OooO0oO = y;
                            if (this.OooOO0o == null) {
                                this.OooOO0o = VelocityTracker.obtain();
                            }
                            this.OooOO0o.addMovement(motionEvent);
                            this.OooOo0 = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
            }
            this.OooOO0O = false;
            this.OooOOo = -1;
            VelocityTracker velocityTracker = this.OooOO0o;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.OooOO0o = null;
            }
            if (this.OooO0Oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            OooOo0o(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.OooO0oO = y2;
                    this.OooOOo = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.OooOO0o;
                    if (velocityTracker2 == null) {
                        this.OooOO0o = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.OooOO0o.addMovement(motionEvent);
                    this.OooO0Oo.computeScrollOffset();
                    if (!OooOo0O(motionEvent) && this.OooO0Oo.isFinished()) {
                        z = false;
                    }
                    this.OooOO0O = z;
                    this.OooOoO0.OooO0oo(2, 0);
                }
            }
            if (!OooOo0O(motionEvent) && this.OooO0Oo.isFinished()) {
                z = false;
            }
            this.OooOO0O = z;
            VelocityTracker velocityTracker3 = this.OooOO0o;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.OooOO0o = null;
            }
        }
        return this.OooOO0O;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.OooO0oo = false;
        View view = this.OooOO0;
        if (view != null && OooOO0o(view, this)) {
            View view2 = this.OooOO0;
            Rect rect = this.OooO0OO;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int OooO0oo = OooO0oo(rect);
            if (OooO0oo != 0) {
                scrollBy(0, OooO0oo);
            }
        }
        this.OooOO0 = null;
        if (!this.OooO) {
            if (this.OooOo0o != null) {
                scrollTo(getScrollX(), this.OooOo0o.OooO00o);
                this.OooOo0o = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.OooO = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.OooOOO0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        OooOO0((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.OooOoO0.OooO0O0(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.OooOoO0.OooO0OO(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooOOO(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        OooO00o(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (true ^ OooOOO0(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oOO0OO0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oOO0OO0 ooo0oo0 = (oOO0OO0) parcelable;
        super.onRestoreInstanceState(ooo0oo0.getSuperState());
        this.OooOo0o = ooo0oo0;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, com.ninja.engine.oOO0OO0, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        View.BaseSavedState baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.OooO00o = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && OooOOO0(findFocus, 0, i4)) {
            Rect rect = this.OooO0OO;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int OooO0oo = OooO0oo(rect);
            if (OooO0oo != 0) {
                if (this.OooOOO) {
                    OooOo0(0, OooO0oo, false);
                } else {
                    scrollBy(0, OooO0oo);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return OooO0o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        OooO0O0(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int i;
        if (this.OooOO0o == null) {
            this.OooOO0o = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.OooOo0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.OooOo0);
        oOO0OO0O ooo0oo0o = this.OooOoO0;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.OooO0o;
            EdgeEffect edgeEffect2 = this.OooO0o0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                OooOOOO(motionEvent);
                                this.OooO0oO = (int) motionEvent.getY(motionEvent.findPointerIndex(this.OooOOo));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.OooO0oO = (int) motionEvent.getY(actionIndex);
                            this.OooOOo = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.OooOO0O && getChildCount() > 0 && this.OooO0Oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        this.OooOOo = -1;
                        this.OooOO0O = false;
                        VelocityTracker velocityTracker = this.OooOO0o;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.OooOO0o = null;
                        }
                        OooOo0o(0);
                        this.OooO0o0.onRelease();
                        this.OooO0o.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.OooOOo);
                    if (findPointerIndex != -1) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        int i2 = this.OooO0oO - y;
                        float x = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i2 / getHeight();
                        if (AbstractC0692o0ooooOo.OooOo00(edgeEffect2) != 0.0f) {
                            float f2 = -AbstractC0692o0ooooOo.Oooo0oo(edgeEffect2, -height, x);
                            if (AbstractC0692o0ooooOo.OooOo00(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                            f = f2;
                        } else if (AbstractC0692o0ooooOo.OooOo00(edgeEffect) != 0.0f) {
                            float Oooo0oo = AbstractC0692o0ooooOo.Oooo0oo(edgeEffect, height, 1.0f - x);
                            if (AbstractC0692o0ooooOo.OooOo00(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                            f = Oooo0oo;
                        }
                        int round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i3 = i2 - round;
                        if (!this.OooOO0O && Math.abs(i3) > this.OooOOOO) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.OooOO0O = true;
                            int i4 = this.OooOOOO;
                            i3 = i3 > 0 ? i3 - i4 : i3 + i4;
                        }
                        if (this.OooOO0O) {
                            int OooOOoo = OooOOoo(i3, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.OooO0oO = y - OooOOoo;
                            this.OooOo0 += OooOOoo;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.OooOO0o;
                velocityTracker2.computeCurrentVelocity(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.OooOOo0);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.OooOOo);
                if (Math.abs(yVelocity) >= this.OooOOOo) {
                    if (AbstractC0692o0ooooOo.OooOo00(edgeEffect2) != 0.0f) {
                        if (OooOo00(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i = -yVelocity;
                            OooOO0(i);
                        }
                    } else if (AbstractC0692o0ooooOo.OooOo00(edgeEffect) != 0.0f) {
                        i = -yVelocity;
                        if (OooOo00(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        }
                        OooOO0(i);
                    } else {
                        int i5 = -yVelocity;
                        float f3 = i5;
                        if (!ooo0oo0o.OooO0O0(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            OooOO0(i5);
                        }
                    }
                } else if (this.OooO0Oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.OooOOo = -1;
                this.OooOO0O = false;
                VelocityTracker velocityTracker3 = this.OooOO0o;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.OooOO0o = null;
                }
                OooOo0o(0);
                this.OooO0o0.onRelease();
                this.OooO0o.onRelease();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.OooOO0O && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.OooO0Oo.isFinished()) {
                this.OooO0Oo.abortAnimation();
                OooOo0o(1);
            }
            int pointerId = motionEvent.getPointerId(0);
            this.OooO0oO = (int) motionEvent.getY();
            this.OooOOo = pointerId;
            ooo0oo0o.OooO0oo(2, 0);
        }
        VelocityTracker velocityTracker4 = this.OooOO0o;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.OooO0oo) {
            Rect rect = this.OooO0OO;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int OooO0oo = OooO0oo(rect);
            if (OooO0oo != 0) {
                scrollBy(0, OooO0oo);
            }
        } else {
            this.OooOO0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int OooO0oo = OooO0oo(rect);
        if (OooO0oo != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, OooO0oo);
            } else {
                OooOo0(0, OooO0oo, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.OooOO0o) != null) {
            velocityTracker.recycle();
            this.OooOO0o = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.OooO0oo = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i >= 0) {
                if (width + i > width2) {
                    i = width2 - width;
                }
            } else {
                i = 0;
            }
            if (height < height2 && i2 >= 0) {
                if (height + i2 > height2) {
                    i2 = height2 - height;
                }
            } else {
                i2 = 0;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.OooOOO0) {
            this.OooOOO0 = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        oOO0OO0O ooo0oo0o = this.OooOoO0;
        if (ooo0oo0o.OooO0Oo) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            AbstractC1452oo0O000o.OooOOOO(ooo0oo0o.OooO0OO);
        }
        ooo0oo0o.OooO0Oo = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.OooOOO = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.OooOoO0.OooO0oo(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        OooOo0o(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public void setOnScrollChangeListener(oOO0O ooo0o) {
    }
}
