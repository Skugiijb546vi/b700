package com.ninja.engine;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
/* renamed from: com.ninja.engine.o00O00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123o00O00o extends C0781oO0OOoO implements InterfaceC1419oo00o {
    public CharSequence OooOooO;
    public ListAdapter OooOooo;
    public final Rect Oooo000;
    public int Oooo00O;
    public final /* synthetic */ AppCompatSpinner Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0123o00O00o(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.Oooo00o = appCompatSpinner;
        this.Oooo000 = new Rect();
        this.OooOOOO = appCompatSpinner;
        this.OooOoO0 = true;
        this.OooOoO.setFocusable(true);
        this.OooOOOo = new C0122o00O00Oo(0, this);
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooO(int i) {
        this.Oooo00O = i;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooO0o0(CharSequence charSequence) {
        this.OooOooO = charSequence;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooOO0O(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0120o000oooO c0120o000oooO = this.OooOoO;
        boolean isShowing = c0120o000oooO.isShowing();
        OooOOo0();
        this.OooOoO.setInputMethodMode(2);
        OooO0Oo();
        C0432o0Oo0ooO c0432o0Oo0ooO = this.OooO0OO;
        c0432o0Oo0ooO.setChoiceMode(1);
        c0432o0Oo0ooO.setTextDirection(i);
        c0432o0Oo0ooO.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.Oooo00o;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C0432o0Oo0ooO c0432o0Oo0ooO2 = this.OooO0OO;
        if (c0120o000oooO.isShowing() && c0432o0Oo0ooO2 != null) {
            c0432o0Oo0ooO2.setListSelectionHidden(false);
            c0432o0Oo0ooO2.setSelection(selectedItemPosition);
            if (c0432o0Oo0ooO2.getChoiceMode() != 0) {
                c0432o0Oo0ooO2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
            o00O00 o00o00 = new o00O00(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(o00o00);
            this.OooOoO.setOnDismissListener(new o00O00o0(this, o00o00));
        }
    }

    @Override // com.ninja.engine.C0781oO0OOoO, com.ninja.engine.InterfaceC1419oo00o
    public final void OooOOO(ListAdapter listAdapter) {
        super.OooOOO(listAdapter);
        this.OooOooo = listAdapter;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final CharSequence OooOOO0() {
        return this.OooOooO;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo0() {
        /*
            r10 = this;
            com.ninja.engine.o000oooO r0 = r10.OooOoO
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            r2 = 1
            androidx.appcompat.widget.AppCompatSpinner r3 = r10.Oooo00o
            if (r1 == 0) goto L21
            android.graphics.Rect r4 = r3.OooO0oo
            r1.getPadding(r4)
            boolean r1 = com.ninja.engine.AbstractC1479oo0O0oOo.OooO00o
            int r1 = r3.getLayoutDirection()
            android.graphics.Rect r4 = r3.OooO0oo
            if (r1 != r2) goto L1d
            int r1 = r4.right
            goto L29
        L1d:
            int r1 = r4.left
            int r1 = -r1
            goto L29
        L21:
            android.graphics.Rect r1 = r3.OooO0oo
            r4 = 0
            r1.right = r4
            r1.left = r4
            r1 = 0
        L29:
            int r4 = r3.getPaddingLeft()
            int r5 = r3.getPaddingRight()
            int r6 = r3.getWidth()
            int r7 = r3.OooO0oO
            r8 = -2
            if (r7 != r8) goto L6a
            android.widget.ListAdapter r7 = r10.OooOooo
            android.widget.SpinnerAdapter r7 = (android.widget.SpinnerAdapter) r7
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            int r0 = r3.OooO00o(r7, r0)
            android.content.Context r7 = r3.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            android.graphics.Rect r8 = r3.OooO0oo
            int r9 = r8.left
            int r7 = r7 - r9
            int r8 = r8.right
            int r7 = r7 - r8
            if (r0 <= r7) goto L5f
            r0 = r7
        L5f:
            int r7 = r6 - r4
            int r7 = r7 - r5
            int r0 = java.lang.Math.max(r0, r7)
        L66:
            r10.OooOOOo(r0)
            goto L74
        L6a:
            r0 = -1
            if (r7 != r0) goto L71
            int r0 = r6 - r4
            int r0 = r0 - r5
            goto L66
        L71:
            r10.OooOOOo(r7)
        L74:
            boolean r0 = com.ninja.engine.AbstractC1479oo0O0oOo.OooO00o
            int r0 = r3.getLayoutDirection()
            if (r0 != r2) goto L85
            int r6 = r6 - r5
            int r0 = r10.OooO0o0
            int r6 = r6 - r0
            int r0 = r10.Oooo00O
            int r6 = r6 - r0
            int r6 = r6 + r1
            goto L8a
        L85:
            int r0 = r10.Oooo00O
            int r4 = r4 + r0
            int r6 = r4 + r1
        L8a:
            r10.OooO0o = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0123o00O00o.OooOOo0():void");
    }
}


