package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOOo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1066oOOo0Oo {
    public final boolean OooO;
    public C0131o00O0o OooO00o;
    public RecyclerView OooO0O0;
    public final C1126oOOooOO OooO0OO;
    public final C1126oOOooOO OooO0Oo;
    public boolean OooO0o;
    public oO0OO00 OooO0o0;
    public boolean OooO0oO;
    public final boolean OooO0oo;
    public int OooOO0;
    public boolean OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;

    public AbstractC1066oOOo0Oo() {
        C0331o0O0oo c0331o0O0oo = new C0331o0O0oo(26, this);
        o00O o00o = new o00O(21, this);
        this.OooO0OO = new C1126oOOooOO(c0331o0O0oo);
        this.OooO0Oo = new C1126oOOooOO(o00o);
        this.OooO0o = false;
        this.OooO0oO = false;
        this.OooO0oo = true;
        this.OooO = true;
    }

    public static int OooO0oO(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 == 1073741824) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooOo0o(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1e
            if (r8 < 0) goto L13
        L10:
            r6 = 1073741824(0x40000000, float:2.0)
            goto L32
        L13:
            if (r8 != r1) goto L1b
            if (r6 == r2) goto L23
            if (r6 == 0) goto L1b
            if (r6 == r3) goto L23
        L1b:
            r6 = 0
            r8 = 0
            goto L32
        L1e:
            if (r8 < 0) goto L21
            goto L10
        L21:
            if (r8 != r1) goto L25
        L23:
            r8 = r5
            goto L32
        L25:
            if (r8 != r0) goto L1b
            if (r6 == r2) goto L2f
            if (r6 != r3) goto L2c
            goto L2f
        L2c:
            r8 = r5
            r6 = 0
            goto L32
        L2f:
            r8 = r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L32:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1066oOOo0Oo.OooOo0o(boolean, int, int, int, int):int");
    }

    public static int OooOoO(View view) {
        Rect rect = ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int OooOoOO(View view) {
        Rect rect = ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oOOo0Oo0, java.lang.Object] */
    public static C1067oOOo0Oo0 Oooo0(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1036oOOOoo0.OooO00o, i, i2);
        obj.OooO00o = obtainStyledAttributes.getInt(0, 1);
        obj.OooO0O0 = obtainStyledAttributes.getInt(10, 1);
        obj.OooO0OO = obtainStyledAttributes.getBoolean(9, false);
        obj.OooO0Oo = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static int Oooo00o(View view) {
        return ((C1068oOOo0OoO) view.getLayoutParams()).OooO00o.OooO0Oo();
    }

    public static boolean Oooo0o(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    public static void Oooo0oO(View view, int i, int i2, int i3, int i4) {
        C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
        Rect rect = c1068oOOo0OoO.OooO0O0;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).bottomMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0O0(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1066oOOo0Oo.OooO0O0(android.view.View, int, boolean):void");
    }

    public void OooO0OO(String str) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            recyclerView.OooO(str);
        }
    }

    public abstract boolean OooO0Oo();

    public boolean OooO0o(C1068oOOo0OoO c1068oOOo0OoO) {
        if (c1068oOOo0OoO != null) {
            return true;
        }
        return false;
    }

    public abstract boolean OooO0o0();

    public abstract int OooOO0(C1080oOOoO0O c1080oOOoO0O);

    public abstract int OooOO0O(C1080oOOoO0O c1080oOOoO0O);

    public abstract int OooOO0o(C1080oOOoO0O c1080oOOoO0O);

    public abstract int OooOOO(C1080oOOoO0O c1080oOOoO0O);

    public abstract int OooOOO0(C1080oOOoO0O c1080oOOoO0O);

    public abstract int OooOOOO(C1080oOOoO0O c1080oOOoO0O);

    public final void OooOOOo(C1070oOOo0o c1070oOOo0o) {
        for (int OooOo0O = OooOo0O() - 1; OooOo0O >= 0; OooOo0O--) {
            View OooOo0 = OooOo0(OooOo0O);
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(OooOo0);
            if (!Oooo0.OooOOo()) {
                if (Oooo0.OooO() && !Oooo0.OooOO0O() && !this.OooO0O0.OooOO0o.OooO0O0) {
                    o0OoOo0(OooOo0O);
                    c1070oOOo0o.OooO0oO(Oooo0);
                } else {
                    OooOo0(OooOo0O);
                    this.OooO00o.OooOOO(OooOo0O);
                    c1070oOOo0o.OooO0oo(OooOo0);
                    this.OooO0O0.OooO0o.OooOOo(Oooo0);
                }
            }
        }
    }

    public abstract C1068oOOo0OoO OooOOo();

    public View OooOOo0(int i) {
        int OooOo0O = OooOo0O();
        for (int i2 = 0; i2 < OooOo0O; i2++) {
            View OooOo0 = OooOo0(i2);
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(OooOo0);
            if (Oooo0 != null && Oooo0.OooO0Oo() == i && !Oooo0.OooOOo() && (this.OooO0O0.Ooooo00.OooO0oO || !Oooo0.OooOO0O())) {
                return OooOo0;
            }
        }
        return null;
    }

    public C1068oOOo0OoO OooOOoo(Context context, AttributeSet attributeSet) {
        return new C1068oOOo0OoO(context, attributeSet);
    }

    public int OooOo(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView == null || recyclerView.OooOO0o == null || !OooO0Oo()) {
            return 1;
        }
        return this.OooO0O0.OooOO0o.OooO00o();
    }

    public final View OooOo0(int i) {
        C0131o00O0o c0131o00O0o = this.OooO00o;
        if (c0131o00O0o != null) {
            return c0131o00O0o.OooOo00(i);
        }
        return null;
    }

    public C1068oOOo0OoO OooOo00(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1068oOOo0OoO) {
            return new C1068oOOo0OoO((C1068oOOo0OoO) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1068oOOo0OoO((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1068oOOo0OoO(layoutParams);
    }

    public final int OooOo0O() {
        C0131o00O0o c0131o00O0o = this.OooO00o;
        if (c0131o00O0o != null) {
            return c0131o00O0o.OooOo0();
        }
        return 0;
    }

    public void OooOoO0(View view, Rect rect) {
        int[] iArr = RecyclerView.oo000o;
        C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
        Rect rect2 = c1068oOOo0OoO.OooO0O0;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).bottomMargin);
    }

    public final int OooOoo() {
        RecyclerView recyclerView = this.OooO0O0;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        return recyclerView.getLayoutDirection();
    }

    public final int OooOoo0() {
        AbstractC1061oOOo0O0O abstractC1061oOOo0O0O;
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            abstractC1061oOOo0O0O = recyclerView.getAdapter();
        } else {
            abstractC1061oOOo0O0O = null;
        }
        if (abstractC1061oOOo0O0O != null) {
            return abstractC1061oOOo0O0O.OooO00o();
        }
        return 0;
    }

    public final int OooOooO() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int OooOooo() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public void Oooo(int i) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            int OooOo0 = recyclerView.OooO0o0.OooOo0();
            for (int i2 = 0; i2 < OooOo0; i2++) {
                recyclerView.OooO0o0.OooOo00(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final int Oooo000() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int Oooo00O() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int Oooo0O0(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView == null || recyclerView.OooOO0o == null || !OooO0o0()) {
            return 1;
        }
        return this.OooO0O0.OooOO0o.OooO00o();
    }

    public final void Oooo0OO(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.OooO0O0 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.OooO0O0.OooOO0O;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean Oooo0o0();

    public void Oooo0oo(int i) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            int OooOo0 = recyclerView.OooO0o0.OooOo0();
            for (int i2 = 0; i2 < OooOo0; i2++) {
                recyclerView.OooO0o0.OooOo00(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void OoooO(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.OooO0O0;
        C1070oOOo0o c1070oOOo0o = recyclerView.OooO0O0;
        C1080oOOoO0O c1080oOOoO0O = recyclerView.Ooooo00;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.OooO0O0.canScrollVertically(-1) && !this.OooO0O0.canScrollHorizontally(-1) && !this.OooO0O0.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC1061oOOo0O0O abstractC1061oOOo0O0O = this.OooO0O0.OooOO0o;
            if (abstractC1061oOOo0O0O != null) {
                accessibilityEvent.setItemCount(abstractC1061oOOo0O0O.OooO00o());
            }
        }
    }

    public abstract void OoooO0(RecyclerView recyclerView);

    public abstract View OoooO0O(View view, int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O);

    public final void OoooOO0(View view, C0039OoooO c0039OoooO) {
        AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
        if (Oooo0 != null && !Oooo0.OooOO0O() && !((ArrayList) this.OooO00o.OooO0Oo).contains(Oooo0.OooO00o)) {
            RecyclerView recyclerView = this.OooO0O0;
            o000oOoO(recyclerView.OooO0O0, recyclerView.Ooooo00, view, c0039OoooO);
        }
    }

    public abstract void Ooooo00(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O);

    public abstract void Ooooo0o(C1080oOOoO0O c1080oOOoO0O);

    public Parcelable OooooOO() {
        return null;
    }

    public final void Oooooo(C1070oOOo0o c1070oOOo0o) {
        for (int OooOo0O = OooOo0O() - 1; OooOo0O >= 0; OooOo0O--) {
            if (!RecyclerView.Oooo0(OooOo0(OooOo0O)).OooOOo()) {
                View OooOo0 = OooOo0(OooOo0O);
                o0OoOo0(OooOo0O);
                c1070oOOo0o.OooO0o(OooOo0);
            }
        }
    }

    public void Oooooo0() {
        o00O0O();
    }

    public final void OoooooO(C1070oOOo0o c1070oOOo0o) {
        ArrayList arrayList;
        int size = c1070oOOo0o.OooO00o.size();
        int i = size - 1;
        while (true) {
            arrayList = c1070oOOo0o.OooO00o;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC1083oOOoO0o) arrayList.get(i)).OooO00o;
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
            if (!Oooo0.OooOOo()) {
                Oooo0.OooOOo0(false);
                if (Oooo0.OooOOO0()) {
                    this.OooO0O0.removeDetachedView(view, false);
                }
                AbstractC1064oOOo0OOO abstractC1064oOOo0OOO = this.OooO0O0.Oooo0O0;
                if (abstractC1064oOOo0OOO != null) {
                    abstractC1064oOOo0OOO.OooO0Oo(Oooo0);
                }
                Oooo0.OooOOo0(true);
                AbstractC1083oOOoO0o Oooo02 = RecyclerView.Oooo0(view);
                Oooo02.OooOOO = null;
                Oooo02.OooOOOO = false;
                Oooo02.OooOO0 &= -33;
                c1070oOOo0o.OooO0oO(Oooo02);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c1070oOOo0o.OooO0O0;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.OooO0O0.invalidate();
        }
    }

    public final void Ooooooo(View view, C1070oOOo0o c1070oOOo0o) {
        C0131o00O0o c0131o00O0o = this.OooO00o;
        C1060oOOo0O0 c1060oOOo0O0 = (C1060oOOo0O0) c0131o00O0o.OooO0O0;
        int indexOfChild = c1060oOOo0O0.OooO00o.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((o0O000o0) c0131o00O0o.OooO0OO).OooO0o(indexOfChild)) {
                c0131o00O0o.OoooO0(view);
            }
            c1060oOOo0O0.OooO00o(indexOfChild);
        }
        c1070oOOo0o.OooO0o(view);
    }

    public void o000oOoO(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, View view, C0039OoooO c0039OoooO) {
        int i;
        int i2;
        if (OooO0o0()) {
            i = Oooo00o(view);
        } else {
            i = 0;
        }
        if (OooO0Oo()) {
            i2 = Oooo00o(view);
        } else {
            i2 = 0;
        }
        c0039OoooO.OooO(C0042OoooO0O.OooO00o(false, i, 1, i2, 1));
    }

    public final void o00O0O() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o00Oo0(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O);

    public abstract void o00Ooo(int i);

    public abstract int o00o0O(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O);

    public final void o00oO0O(int i, int i2) {
        int OooOo0O = OooOo0O();
        if (OooOo0O == 0) {
            this.OooO0O0.OooOOO(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < OooOo0O; i7++) {
            View OooOo0 = OooOo0(i7);
            Rect rect = this.OooO0O0.OooO;
            OooOoO0(OooOo0, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.OooO0O0.OooO.set(i5, i6, i3, i4);
        o00oO0o(this.OooO0O0.OooO, i, i2);
    }

    public void o00oO0o(Rect rect, int i, int i2) {
        int Oooo000 = Oooo000() + OooOooo() + rect.width();
        int OooOooO = OooOooO() + Oooo00O() + rect.height();
        RecyclerView recyclerView = this.OooO0O0;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        this.OooO0O0.setMeasuredDimension(OooO0oO(i, Oooo000, recyclerView.getMinimumWidth()), OooO0oO(i2, OooOooO, this.OooO0O0.getMinimumHeight()));
    }

    public final void o00ooo(RecyclerView recyclerView) {
        oo000o(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void o0OO00O(oO0OO00 oo0oo00) {
        oO0OO00 oo0oo002 = this.OooO0o0;
        if (oo0oo002 != null && oo0oo00 != oo0oo002 && oo0oo002.OooO0o0) {
            oo0oo002.OooO();
        }
        this.OooO0o0 = oo0oo00;
        RecyclerView recyclerView = this.OooO0O0;
        RunnableC1082oOOoO0Oo runnableC1082oOOoO0Oo = recyclerView.OoooOo0;
        runnableC1082oOOoO0Oo.OooO0oO.removeCallbacks(runnableC1082oOOoO0Oo);
        runnableC1082oOOoO0Oo.OooO0OO.abortAnimation();
        oo0oo00.OooO0O0 = recyclerView;
        oo0oo00.OooO0OO = this;
        int i = oo0oo00.OooO00o;
        if (i != -1) {
            recyclerView.Ooooo00.OooO00o = i;
            oo0oo00.OooO0o0 = true;
            oo0oo00.OooO0Oo = true;
            oo0oo00.OooO0o = recyclerView.OooOOO0.OooOOo0(i);
            oo0oo00.OooO0O0.OoooOo0.OooO00o();
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final boolean o0OOO0o(View view, int i, int i2, C1068oOOo0OoO c1068oOOo0OoO) {
        if (this.OooO0oo && Oooo0o(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).width) && Oooo0o(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).height)) {
            return false;
        }
        return true;
    }

    public abstract void o0Oo0oo(RecyclerView recyclerView, int i);

    public final void o0OoOo0(int i) {
        if (OooOo0(i) != null) {
            C0131o00O0o c0131o00O0o = this.OooO00o;
            int OooOoo = c0131o00O0o.OooOoo(i);
            C1060oOOo0O0 c1060oOOo0O0 = (C1060oOOo0O0) c0131o00O0o.OooO0O0;
            View childAt = c1060oOOo0O0.OooO00o.getChildAt(OooOoo);
            if (childAt != null) {
                if (((o0O000o0) c0131o00O0o.OooO0OO).OooO0o(OooOoo)) {
                    c0131o00O0o.OoooO0(childAt);
                }
                c1060oOOo0O0.OooO00o(OooOoo);
            }
        }
    }

    public final void o0ooOO0(RecyclerView recyclerView) {
        int height;
        if (recyclerView == null) {
            this.OooO0O0 = null;
            this.OooO00o = null;
            height = 0;
            this.OooOOO = 0;
        } else {
            this.OooO0O0 = recyclerView;
            this.OooO00o = recyclerView.OooO0o0;
            this.OooOOO = recyclerView.getWidth();
            height = recyclerView.getHeight();
        }
        this.OooOOOO = height;
        this.OooOO0o = 1073741824;
        this.OooOOO0 = 1073741824;
    }

    public final boolean o0ooOOo(View view, int i, int i2, C1068oOOo0OoO c1068oOOo0OoO) {
        if (!view.isLayoutRequested() && this.OooO0oo && Oooo0o(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).width) && Oooo0o(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).height)) {
            return false;
        }
        return true;
    }

    public boolean o0ooOoO() {
        return false;
    }

    public final void oo000o(int i, int i2) {
        this.OooOOO = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.OooOO0o = mode;
        if (mode == 0 && !RecyclerView.o00oO0o) {
            this.OooOOO = 0;
        }
        this.OooOOOO = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.OooOOO0 = mode2;
        if (mode2 == 0 && !RecyclerView.o00oO0o) {
            this.OooOOOO = 0;
        }
    }

    public boolean oo0o0Oo() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ooOO(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.OooOooo()
            int r1 = r8.Oooo00O()
            int r2 = r8.OooOOO
            int r3 = r8.Oooo000()
            int r2 = r2 - r3
            int r3 = r8.OooOOOO
            int r4 = r8.OooOooO()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.OooOoo()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.OooOooo()
            int r2 = r8.Oooo00O()
            int r3 = r8.OooOOO
            int r4 = r8.Oooo000()
            int r3 = r3 - r4
            int r4 = r8.OooOOOO
            int r5 = r8.OooOooO()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.OooO0O0
            android.graphics.Rect r5 = r5.OooO
            r8.OooOoO0(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.Ooooo00(r11, r10, r0)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1066oOOo0Oo.ooOO(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void OoooO00(RecyclerView recyclerView) {
    }

    public void OooooO0(Parcelable parcelable) {
    }

    public void OooooOo(int i) {
    }

    public void OoooOOo() {
    }

    public void OooO(int i, C0671o0ooo0O c0671o0ooo0O) {
    }

    public void OoooOOO(int i, int i2) {
    }

    public void OoooOo0(int i, int i2) {
    }

    public void OoooOoO(int i, int i2) {
    }

    public void OoooOoo(int i, int i2) {
    }

    public void OooO0oo(int i, int i2, C1080oOOoO0O c1080oOOoO0O, C0671o0ooo0O c0671o0ooo0O) {
    }
}
