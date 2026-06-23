package com.ninja.engine;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oOooo0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332oOooo0o0 implements InterfaceC1165oOo00o00 {
    public MenuC0887oO0oo0oo OooO00o;
    public C0892oO0ooO0o OooO0O0;
    public final /* synthetic */ Toolbar OooO0OO;

    public C1332oOooo0o0(Toolbar toolbar) {
        this.OooO0OO = toolbar;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO(boolean z) {
        if (this.OooO0O0 != null) {
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO00o;
            if (menuC0887oO0oo0oo != null) {
                int size = menuC0887oO0oo0oo.OooO0o.size();
                for (int i = 0; i < size; i++) {
                    if (this.OooO00o.getItem(i) == this.OooO0O0) {
                        return;
                    }
                }
            }
            OooOOO(this.OooO0O0);
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0OO(SubMenuC1265oOoo0O subMenuC1265oOoo0O) {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o0(Context context, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        C0892oO0ooO0o c0892oO0ooO0o;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo2 = this.OooO00o;
        if (menuC0887oO0oo0oo2 != null && (c0892oO0ooO0o = this.OooO0O0) != null) {
            menuC0887oO0oo0oo2.OooO0Oo(c0892oO0ooO0o);
        }
        this.OooO00o = menuC0887oO0oo0oo;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0oo(C0892oO0ooO0o c0892oO0ooO0o) {
        Toolbar toolbar = this.OooO0OO;
        toolbar.OooO0OO();
        ViewParent parent = toolbar.OooO0oo.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.OooO0oo);
            }
            toolbar.addView(toolbar.OooO0oo);
        }
        View actionView = c0892oO0ooO0o.getActionView();
        toolbar.OooO = actionView;
        this.OooO0O0 = c0892oO0ooO0o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.OooO);
            }
            C1336oOoooO00 OooO0oo = Toolbar.OooO0oo();
            OooO0oo.OooO00o = (toolbar.OooOOO & 112) | 8388611;
            OooO0oo.OooO0O0 = 2;
            toolbar.OooO.setLayoutParams(OooO0oo);
            toolbar.addView(toolbar.OooO);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1336oOoooO00) childAt.getLayoutParams()).OooO0O0 != 2 && childAt != toolbar.OooO00o) {
                toolbar.removeViewAt(childCount);
                toolbar.OooOooo.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0892oO0ooO0o.OooOoo = true;
        c0892oO0ooO0o.OooOOO.OooOOOo(false);
        View view = toolbar.OooO;
        if (view instanceof o0O00oO0) {
            ((C0894oO0ooOO0) ((o0O00oO0) view)).OooO00o.onActionViewExpanded();
        }
        toolbar.OooOo0();
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final int OooOO0() {
        return 0;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooOO0O() {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final Parcelable OooOO0o() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooOOO(C0892oO0ooO0o c0892oO0ooO0o) {
        Toolbar toolbar = this.OooO0OO;
        View view = toolbar.OooO;
        if (view instanceof o0O00oO0) {
            ((C0894oO0ooOO0) ((o0O00oO0) view)).OooO00o.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.OooO);
        toolbar.removeView(toolbar.OooO0oo);
        toolbar.OooO = null;
        ArrayList arrayList = toolbar.OooOooo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.OooO0O0 = null;
        toolbar.requestLayout();
        c0892oO0ooO0o.OooOoo = false;
        c0892oO0ooO0o.OooOOO.OooOOOo(false);
        toolbar.OooOo0();
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o(Parcelable parcelable) {
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
    }
}
