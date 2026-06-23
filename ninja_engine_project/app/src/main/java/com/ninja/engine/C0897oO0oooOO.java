package com.ninja.engine;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
/* renamed from: com.ninja.engine.oO0oooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0897oO0oooOO {
    public InterfaceC0899oO0oooo OooO;
    public final Context OooO00o;
    public final MenuC0887oO0oo0oo OooO0O0;
    public final boolean OooO0OO;
    public final int OooO0Oo;
    public View OooO0o;
    public final int OooO0o0;
    public boolean OooO0oo;
    public AbstractC0896oO0oooO0 OooOO0;
    public PopupWindow.OnDismissListener OooOO0O;
    public int OooO0oO = 8388611;
    public final C0895oO0oooO OooOO0o = new C0895oO0oooO(this);

    public C0897oO0oooOO(int i, int i2, Context context, View view, MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        this.OooO00o = context;
        this.OooO0O0 = menuC0887oO0oo0oo;
        this.OooO0o = view;
        this.OooO0OO = z;
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
    }

    public final AbstractC0896oO0oooO0 OooO00o() {
        AbstractC0896oO0oooO0 view$OnKeyListenerC1346oOooooo0;
        if (this.OooOO0 == null) {
            Context context = this.OooO00o;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                view$OnKeyListenerC1346oOooooo0 = new View$OnKeyListenerC0276o00ooo0o(this.OooO00o, this.OooO0o, this.OooO0Oo, this.OooO0o0, this.OooO0OO);
            } else {
                View view = this.OooO0o;
                int i = this.OooO0o0;
                boolean z = this.OooO0OO;
                view$OnKeyListenerC1346oOooooo0 = new View$OnKeyListenerC1346oOooooo0(this.OooO0Oo, i, this.OooO00o, view, this.OooO0O0, z);
            }
            view$OnKeyListenerC1346oOooooo0.OooOOOO(this.OooO0O0);
            view$OnKeyListenerC1346oOooooo0.OooOo0(this.OooOO0o);
            view$OnKeyListenerC1346oOooooo0.OooOOo0(this.OooO0o);
            view$OnKeyListenerC1346oOooooo0.OooOOO0(this.OooO);
            view$OnKeyListenerC1346oOooooo0.OooOOo(this.OooO0oo);
            view$OnKeyListenerC1346oOooooo0.OooOOoo(this.OooO0oO);
            this.OooOO0 = view$OnKeyListenerC1346oOooooo0;
        }
        return this.OooOO0;
    }

    public final boolean OooO0O0() {
        AbstractC0896oO0oooO0 abstractC0896oO0oooO0 = this.OooOO0;
        if (abstractC0896oO0oooO0 != null && abstractC0896oO0oooO0.OooO00o()) {
            return true;
        }
        return false;
    }

    public void OooO0OO() {
        this.OooOO0 = null;
        PopupWindow.OnDismissListener onDismissListener = this.OooOO0O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void OooO0Oo(int i, int i2, boolean z, boolean z2) {
        AbstractC0896oO0oooO0 OooO00o = OooO00o();
        OooO00o.OooOo0O(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.OooO0oO, this.OooO0o.getLayoutDirection()) & 7) == 5) {
                i -= this.OooO0o.getWidth();
            }
            OooO00o.OooOo00(i);
            OooO00o.OooOo0o(i2);
            int i3 = (int) ((this.OooO00o.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            OooO00o.OooO00o = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        OooO00o.OooO0Oo();
    }
}
