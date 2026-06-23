package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oO0OOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0781oO0OOoO implements InterfaceC1216oOoOOoOO {
    public static final Method OooOoOO;
    public static final Method OooOoo;
    public static final Method OooOoo0;
    public boolean OooO;
    public final Context OooO00o;
    public ListAdapter OooO0O0;
    public C0432o0Oo0ooO OooO0OO;
    public int OooO0o;
    public int OooO0oO;
    public boolean OooOO0;
    public boolean OooOO0O;
    public C0773oO0OOOo OooOOO;
    public View OooOOOO;
    public AdapterView.OnItemClickListener OooOOOo;
    public AdapterView.OnItemSelectedListener OooOOo0;
    public Rect OooOo;
    public final Handler OooOo0O;
    public final C0120o000oooO OooOoO;
    public boolean OooOoO0;
    public final int OooO0Oo = -2;
    public int OooO0o0 = -2;
    public final int OooO0oo = 1002;
    public int OooOO0o = 0;
    public final int OooOOO0 = Integer.MAX_VALUE;
    public final oO0OOOO OooOOo = new oO0OOOO(this, 1);
    public final View$OnTouchListenerC0777oO0OOo OooOOoo = new View$OnTouchListenerC0777oO0OOo(0, this);
    public final C0778oO0OOo0 OooOo00 = new C0778oO0OOo0(this);
    public final oO0OOOO OooOo0 = new oO0OOOO(this, 0);
    public final Rect OooOo0o = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                OooOoOO = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                OooOoo = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                OooOoo0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.PopupWindow, com.ninja.engine.o000oooO] */
    public C0781oO0OOoO(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int resourceId;
        this.OooO00o = context;
        this.OooOo0O = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooOOOO, i, i2);
        this.OooO0o = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.OooO0oO = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.OooO = true;
        }
        obtainStyledAttributes.recycle();
        PopupWindow popupWindow = new PopupWindow(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooOOoo, i, i2);
        if (obtainStyledAttributes2.hasValue(2)) {
            AbstractC0692o0ooooOo.OoooOoo(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = AbstractC0692o0ooooOo.OooOo0(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.OooOoO = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final boolean OooO00o() {
        return this.OooOoO.isShowing();
    }

    public final int OooO0O0() {
        return this.OooO0o;
    }

    public final Drawable OooO0OO() {
        return this.OooOoO.getBackground();
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final void OooO0Oo() {
        int i;
        boolean z;
        int OooO00o;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        C0432o0Oo0ooO c0432o0Oo0ooO;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        C0432o0Oo0ooO c0432o0Oo0ooO2 = this.OooO0OO;
        C0120o000oooO c0120o000oooO = this.OooOoO;
        Context context = this.OooO00o;
        if (c0432o0Oo0ooO2 == null) {
            C0432o0Oo0ooO OooOOOO = OooOOOO(context, !this.OooOoO0);
            this.OooO0OO = OooOOOO;
            OooOOOO.setAdapter(this.OooO0O0);
            this.OooO0OO.setOnItemClickListener(this.OooOOOo);
            this.OooO0OO.setFocusable(true);
            this.OooO0OO.setFocusableInTouchMode(true);
            this.OooO0OO.setOnItemSelectedListener(new oO0OOO(0, this));
            this.OooO0OO.setOnScrollListener(this.OooOo00);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.OooOOo0;
            if (onItemSelectedListener != null) {
                this.OooO0OO.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0120o000oooO.setContentView(this.OooO0OO);
        } else {
            ViewGroup viewGroup = (ViewGroup) c0120o000oooO.getContentView();
        }
        Drawable background = c0120o000oooO.getBackground();
        Rect rect = this.OooOo0o;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i = rect.bottom + i8;
            if (!this.OooO) {
                this.OooO0oO = -i8;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (c0120o000oooO.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.OooOOOO;
        int i9 = this.OooO0oO;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = OooOoo0;
            if (method != null) {
                try {
                    OooO00o = ((Integer) method.invoke(c0120o000oooO, view, Integer.valueOf(i9), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            OooO00o = c0120o000oooO.getMaxAvailableHeight(view, i9);
        } else {
            OooO00o = AbstractC0808oO0OooO0.OooO00o(c0120o000oooO, view, i9, z);
        }
        int i10 = this.OooO0Oo;
        if (i10 == -1) {
            i3 = OooO00o + i;
        } else {
            int i11 = this.OooO0o0;
            if (i11 != -2) {
                if (i11 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int OooO00o2 = this.OooO0OO.OooO00o(makeMeasureSpec, OooO00o);
            if (OooO00o2 > 0) {
                i2 = this.OooO0OO.getPaddingBottom() + this.OooO0OO.getPaddingTop() + i;
            } else {
                i2 = 0;
            }
            i3 = OooO00o2 + i2;
        }
        if (this.OooOoO.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC0692o0ooooOo.Ooooo0o(c0120o000oooO, this.OooO0oo);
        if (c0120o000oooO.isShowing()) {
            if (!this.OooOOOO.isAttachedToWindow()) {
                return;
            }
            int i12 = this.OooO0o0;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = this.OooOOOO.getWidth();
            }
            if (i10 == -1) {
                if (z2) {
                    i10 = i3;
                } else {
                    i10 = -1;
                }
                if (z2) {
                    if (this.OooO0o0 == -1) {
                        i6 = -1;
                    } else {
                        i6 = 0;
                    }
                    c0120o000oooO.setWidth(i6);
                    c0120o000oooO.setHeight(0);
                } else {
                    if (this.OooO0o0 == -1) {
                        i7 = -1;
                    }
                    c0120o000oooO.setWidth(i7);
                    c0120o000oooO.setHeight(-1);
                }
            } else if (i10 == -2) {
                i10 = i3;
            }
            c0120o000oooO.setOutsideTouchable(true);
            View view2 = this.OooOOOO;
            int i13 = this.OooO0o;
            int i14 = this.OooO0oO;
            if (i12 < 0) {
                i4 = -1;
            } else {
                i4 = i12;
            }
            if (i10 < 0) {
                i5 = -1;
            } else {
                i5 = i10;
            }
            c0120o000oooO.update(view2, i13, i14, i4, i5);
            return;
        }
        int i15 = this.OooO0o0;
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = this.OooOOOO.getWidth();
        }
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = i3;
        }
        c0120o000oooO.setWidth(i15);
        c0120o000oooO.setHeight(i10);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = OooOoOO;
            if (method2 != null) {
                try {
                    method2.invoke(c0120o000oooO, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            oO0OOOO0.OooO0O0(c0120o000oooO, true);
        }
        c0120o000oooO.setOutsideTouchable(true);
        c0120o000oooO.setTouchInterceptor(this.OooOOoo);
        if (this.OooOO0O) {
            AbstractC0692o0ooooOo.OoooOoo(c0120o000oooO, this.OooOO0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = OooOoo;
            if (method3 != null) {
                try {
                    method3.invoke(c0120o000oooO, this.OooOo);
                } catch (Exception unused3) {
                }
            }
        } else {
            oO0OOOO0.OooO00o(c0120o000oooO, this.OooOo);
        }
        c0120o000oooO.showAsDropDown(this.OooOOOO, this.OooO0o, this.OooO0oO, this.OooOO0o);
        this.OooO0OO.setSelection(-1);
        if ((!this.OooOoO0 || this.OooO0OO.isInTouchMode()) && (c0432o0Oo0ooO = this.OooO0OO) != null) {
            c0432o0Oo0ooO.setListSelectionHidden(true);
            c0432o0Oo0ooO.requestLayout();
        }
        if (!this.OooOoO0) {
            this.OooOo0O.post(this.OooOo0);
        }
    }

    public final void OooO0o(Drawable drawable) {
        this.OooOoO.setBackgroundDrawable(drawable);
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final C0432o0Oo0ooO OooO0oO() {
        return this.OooO0OO;
    }

    public final void OooO0oo(int i) {
        this.OooO0oO = i;
        this.OooO = true;
    }

    public final void OooOO0(int i) {
        this.OooO0o = i;
    }

    public final int OooOO0o() {
        if (!this.OooO) {
            return 0;
        }
        return this.OooO0oO;
    }

    public void OooOOO(ListAdapter listAdapter) {
        C0773oO0OOOo c0773oO0OOOo = this.OooOOO;
        if (c0773oO0OOOo == null) {
            this.OooOOO = new C0773oO0OOOo(this);
        } else {
            ListAdapter listAdapter2 = this.OooO0O0;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0773oO0OOOo);
            }
        }
        this.OooO0O0 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.OooOOO);
        }
        C0432o0Oo0ooO c0432o0Oo0ooO = this.OooO0OO;
        if (c0432o0Oo0ooO != null) {
            c0432o0Oo0ooO.setAdapter(this.OooO0O0);
        }
    }

    public C0432o0Oo0ooO OooOOOO(Context context, boolean z) {
        return new C0432o0Oo0ooO(context, z);
    }

    public final void OooOOOo(int i) {
        Drawable background = this.OooOoO.getBackground();
        if (background != null) {
            Rect rect = this.OooOo0o;
            background.getPadding(rect);
            this.OooO0o0 = rect.left + rect.right + i;
            return;
        }
        this.OooO0o0 = i;
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final void dismiss() {
        C0120o000oooO c0120o000oooO = this.OooOoO;
        c0120o000oooO.dismiss();
        c0120o000oooO.setContentView(null);
        this.OooO0OO = null;
        this.OooOo0O.removeCallbacks(this.OooOOo);
    }
}



