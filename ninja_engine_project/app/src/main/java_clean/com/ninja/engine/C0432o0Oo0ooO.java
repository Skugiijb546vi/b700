package com.ninja.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
/* renamed from: com.ninja.engine.o0Oo0ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0432o0Oo0ooO extends ListView {
    public final boolean OooO;
    public final Rect OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public C0427o0Oo0oO OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public View$OnTouchListenerC0789oO0Oo00 OooOO0O;
    public o00000OO OooOO0o;

    public C0432o0Oo0ooO(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.OooO00o = new Rect();
        this.OooO0O0 = 0;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.OooO = z;
        setCacheColorHint(0);
    }

    public final int OooO00o(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            if (i6 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0O0(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0432o0Oo0ooO.OooO0O0(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.OooO00o;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.OooOO0o != null) {
            return;
        }
        super.drawableStateChanged();
        C0427o0Oo0oO c0427o0Oo0oO = this.OooO0oO;
        if (c0427o0Oo0oO != null) {
            c0427o0Oo0oO.OooO0O0 = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.OooOO0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.OooO && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.OooO && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.OooO && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.OooO && this.OooO0oo) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.OooOO0o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.OooOO0o == null) {
            o00000OO o00000oo = new o00000OO(9, this);
            this.OooOO0o = o00000oo;
            post(o00000oo);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && AbstractC0426o0Oo0o0o.OooO0Oo) {
                        try {
                            AbstractC0426o0Oo0o0o.OooO00o.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0426o0Oo0o0o.OooO0O0.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC0426o0Oo0o0o.OooO0OO.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.OooOO0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.OooO0o = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        o00000OO o00000oo = this.OooOO0o;
        if (o00000oo != null) {
            C0432o0Oo0ooO c0432o0Oo0ooO = (C0432o0Oo0ooO) o00000oo.OooO0O0;
            c0432o0Oo0ooO.OooOO0o = null;
            c0432o0Oo0ooO.removeCallbacks(o00000oo);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.OooO0oo = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0427o0Oo0oO c0427o0Oo0oO;
        if (drawable != null) {
            c0427o0Oo0oO = new C0427o0Oo0oO(drawable);
            c0427o0Oo0oO.OooO0O0 = true;
        } else {
            c0427o0Oo0oO = null;
        }
        this.OooO0oO = c0427o0Oo0oO;
        super.setSelector(c0427o0Oo0oO);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.OooO0O0 = rect.left;
        this.OooO0OO = rect.top;
        this.OooO0Oo = rect.right;
        this.OooO0o0 = rect.bottom;
    }
}


