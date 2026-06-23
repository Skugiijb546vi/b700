package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.ninja.engine.AbstractC0033Oooo0O0;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.C0124o00O00oO;
import com.ninja.engine.InterfaceC1419oo00o;
import com.ninja.engine.o0000OO0;
import com.ninja.engine.o00O00;
import com.ninja.engine.o00O000o;
import com.ninja.engine.o00O00O;
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] OooO = {16843505};
    public final o0000OO0 OooO00o;
    public final Context OooO0O0;
    public final o00O000o OooO0OO;
    public SpinnerAdapter OooO0Oo;
    public final InterfaceC1419oo00o OooO0o;
    public final boolean OooO0o0;
    public int OooO0oO;
    public final Rect OooO0oo;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r7 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130969654(0x7f040436, float:1.7547996E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.OooO0oo = r1
            android.content.Context r1 = r12.getContext()
            com.ninja.engine.AbstractC1313oOooOo0.OooO00o(r12, r1)
            int[] r1 = com.ninja.engine.AbstractC1039oOOOoo0o.OooOo0
            r2 = 0
            com.ninja.engine.o00O0o r3 = com.ninja.engine.C0131o00O0o.Oooo0O0(r13, r14, r1, r0, r2)
            com.ninja.engine.o0000OO0 r4 = new com.ninja.engine.o0000OO0
            r4.<init>(r12)
            r12.OooO00o = r4
            java.lang.Object r4 = r3.OooO0O0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r5 = 4
            int r5 = r4.getResourceId(r5, r2)
            if (r5 == 0) goto L35
            com.ninja.engine.o0O0oo00 r6 = new com.ninja.engine.o0O0oo00
            r6.<init>(r13, r5)
            r12.OooO0O0 = r6
            goto L37
        L35:
            r12.OooO0O0 = r13
        L37:
            r5 = -1
            r6 = 0
            int[] r7 = androidx.appcompat.widget.AppCompatSpinner.OooO     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r8 = r7.hasValue(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            if (r8 == 0) goto L4f
            int r5 = r7.getInt(r2, r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            goto L4f
        L4a:
            r13 = move-exception
            r6 = r7
            goto L58
        L4d:
            goto L5e
        L4f:
            r7.recycle()
            goto L61
        L53:
            r13 = move-exception
            goto L58
        L55:
            r7 = r6
            goto L5e
        L58:
            if (r6 == 0) goto L5d
            r6.recycle()
        L5d:
            throw r13
        L5e:
            if (r7 == 0) goto L61
            goto L4f
        L61:
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L9b
            if (r5 == r8) goto L68
            goto La8
        L68:
            com.ninja.engine.o00O00o r5 = new com.ninja.engine.o00O00o
            android.content.Context r9 = r12.OooO0O0
            r5.<init>(r12, r9, r14)
            android.content.Context r9 = r12.OooO0O0
            com.ninja.engine.o00O0o r1 = com.ninja.engine.C0131o00O0o.Oooo0O0(r9, r14, r1, r0, r2)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.OooO0O0
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.OooO0oO = r9
            android.graphics.drawable.Drawable r9 = r1.OooOo0o(r8)
            r5.OooO0o(r9)
            java.lang.String r7 = r4.getString(r7)
            r5.OooOooO = r7
            r1.Oooo0o0()
            r12.OooO0o = r5
            com.ninja.engine.o00O000o r1 = new com.ninja.engine.o00O000o
            r1.<init>(r12, r12, r5)
            r12.OooO0OO = r1
            goto La8
        L9b:
            com.ninja.engine.oOO00O r1 = new com.ninja.engine.oOO00O
            r1.<init>(r12)
            r12.OooO0o = r1
            java.lang.String r5 = r4.getString(r7)
            r1.OooO0OO = r5
        La8:
            java.lang.CharSequence[] r1 = r4.getTextArray(r2)
            if (r1 == 0) goto Lbf
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r13, r4, r1)
            r13 = 2131492992(0x7f0c0080, float:1.8609452E38)
            r2.setDropDownViewResource(r13)
            r12.setAdapter(r2)
        Lbf:
            r3.Oooo0o0()
            r12.OooO0o0 = r8
            android.widget.SpinnerAdapter r13 = r12.OooO0Oo
            if (r13 == 0) goto Lcd
            r12.setAdapter(r13)
            r12.OooO0Oo = r6
        Lcd:
            com.ninja.engine.o0000OO0 r13 = r12.OooO00o
            r13.OooOO0O(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int OooO00o(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.OooO0oo;
            drawable.getPadding(rect);
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooO00o();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        return interfaceC1419oo00o != null ? interfaceC1419oo00o.OooO0O0() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        return interfaceC1419oo00o != null ? interfaceC1419oo00o.OooOO0o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.OooO0o != null ? this.OooO0oO : super.getDropDownWidth();
    }

    public final InterfaceC1419oo00o getInternalPopup() {
        return this.OooO0o;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        return interfaceC1419oo00o != null ? interfaceC1419oo00o.OooO0OO() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.OooO0O0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        return interfaceC1419oo00o != null ? interfaceC1419oo00o.OooOOO0() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            return o0000oo0.OooO0oo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            return o0000oo0.OooO();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        if (interfaceC1419oo00o == null || !interfaceC1419oo00o.OooO00o()) {
            return;
        }
        interfaceC1419oo00o.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.OooO0o == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), OooO00o(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0124o00O00oO c0124o00O00oO = (C0124o00O00oO) parcelable;
        super.onRestoreInstanceState(c0124o00O00oO.getSuperState());
        if (!c0124o00O00oO.OooO00o || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new o00O00(0, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.ninja.engine.o00O00oO] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        View.BaseSavedState baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        if (interfaceC1419oo00o != null && interfaceC1419oo00o.OooO00o()) {
            z = true;
        } else {
            z = false;
        }
        baseSavedState.OooO00o = z;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o00O000o o00o000o = this.OooO0OO;
        if (o00o000o == null || !o00o000o.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        if (interfaceC1419oo00o != null) {
            if (!interfaceC1419oo00o.OooO00o()) {
                this.OooO0o.OooOO0O(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        if (interfaceC1419oo00o == null) {
            super.setDropDownHorizontalOffset(i);
            return;
        }
        interfaceC1419oo00o.OooO(i);
        interfaceC1419oo00o.OooOO0(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        if (interfaceC1419oo00o != null) {
            interfaceC1419oo00o.OooO0oo(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.OooO0o != null) {
            this.OooO0oO = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        if (interfaceC1419oo00o != null) {
            interfaceC1419oo00o.OooO0o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC0692o0ooooOo.OooOo0(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        if (interfaceC1419oo00o != null) {
            interfaceC1419oo00o.OooO0o0(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOo00(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOo0(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, com.ninja.engine.o00O00OO, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.OooO0o0) {
            this.OooO0Oo = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1419oo00o interfaceC1419oo00o = this.OooO0o;
        if (interfaceC1419oo00o != 0) {
            Context context = this.OooO0O0;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            Object obj = new Object();
            obj.OooO00o = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.OooO0O0 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && AbstractC0033Oooo0O0.OooOo(spinnerAdapter)) {
                o00O00O.OooO00o(AbstractC0033Oooo0O0.OooO0oO(spinnerAdapter), theme);
            }
            interfaceC1419oo00o.OooOOO(obj);
        }
    }
}


