package com.ninja.engine;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class o000000 implements InterfaceC1165oOo00o00 {
    public int OooO;
    public final Context OooO00o;
    public Context OooO0O0;
    public MenuC0887oO0oo0oo OooO0OO;
    public final LayoutInflater OooO0Oo;
    public InterfaceC0899oO0oooo OooO0o0;
    public oO OooO0oo;
    public C1569oo0o0Oo OooOO0;
    public Drawable OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public boolean OooOOo;
    public int OooOOo0;
    public C0355o0OOO0o OooOo0;
    public C0355o0OOO0o OooOo00;
    public o0OO00O OooOo0O;
    public C0430o0Oo0oo OooOo0o;
    public int OooOoO0;
    public final int OooO0o = R.layout.abc_action_menu_layout;
    public final int OooO0oO = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray OooOOoo = new SparseBooleanArray();
    public final o00O OooOo = new o00O(1, this);

    public o000000(Context context) {
        this.OooO00o = context;
        this.OooO0Oo = LayoutInflater.from(context);
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO(boolean z) {
        int i;
        C0892oO0ooO0o c0892oO0ooO0o;
        ViewGroup viewGroup = (ViewGroup) this.OooO0oo;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO0OO;
            if (menuC0887oO0oo0oo != null) {
                menuC0887oO0oo0oo.OooO();
                ArrayList OooOO0o = this.OooO0OO.OooOO0o();
                int size = OooOO0o.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0892oO0ooO0o c0892oO0ooO0o2 = (C0892oO0ooO0o) OooOO0o.get(i2);
                    if (c0892oO0ooO0o2.OooO0o()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof InterfaceC0901oO0ooooo) {
                            c0892oO0ooO0o = ((InterfaceC0901oO0ooooo) childAt).getItemData();
                        } else {
                            c0892oO0ooO0o = null;
                        }
                        View OooO00o = OooO00o(c0892oO0ooO0o2, childAt, viewGroup);
                        if (c0892oO0ooO0o2 != c0892oO0ooO0o) {
                            OooO00o.setPressed(false);
                            OooO00o.jumpDrawablesToCurrentState();
                        }
                        if (OooO00o != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) OooO00o.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(OooO00o);
                            }
                            ((ViewGroup) this.OooO0oo).addView(OooO00o, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.OooOO0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.OooO0oo).requestLayout();
        MenuC0887oO0oo0oo menuC0887oO0oo0oo2 = this.OooO0OO;
        if (menuC0887oO0oo0oo2 != null) {
            menuC0887oO0oo0oo2.OooO();
            ArrayList arrayList2 = menuC0887oO0oo0oo2.OooO;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO = ((C0892oO0ooO0o) arrayList2.get(i3)).OooOoOO;
            }
        }
        MenuC0887oO0oo0oo menuC0887oO0oo0oo3 = this.OooO0OO;
        if (menuC0887oO0oo0oo3 != null) {
            menuC0887oO0oo0oo3.OooO();
            arrayList = menuC0887oO0oo0oo3.OooOO0;
        }
        if (this.OooOOO0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0892oO0ooO0o) arrayList.get(0)).OooOoo;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        C1569oo0o0Oo c1569oo0o0Oo = this.OooOO0;
        if (z2) {
            if (c1569oo0o0Oo == null) {
                this.OooOO0 = new C1569oo0o0Oo(this, this.OooO00o);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.OooOO0.getParent();
            if (viewGroup3 != this.OooO0oo) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.OooOO0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.OooO0oo;
                C1569oo0o0Oo c1569oo0o0Oo2 = this.OooOO0;
                actionMenuView.getClass();
                C0058o000000o OooOO0 = ActionMenuView.OooOO0();
                OooOO0.OooO00o = true;
                actionMenuView.addView(c1569oo0o0Oo2, OooOO0);
            }
        } else if (c1569oo0o0Oo != null) {
            ViewParent parent = c1569oo0o0Oo.getParent();
            oO oOVar = this.OooO0oo;
            if (parent == oOVar) {
                ((ViewGroup) oOVar).removeView(this.OooOO0);
            }
        }
        ((ActionMenuView) this.OooO0oo).setOverflowReserved(this.OooOOO0);
    }

    public final View OooO00o(C0892oO0ooO0o c0892oO0ooO0o, View view, ViewGroup viewGroup) {
        InterfaceC0901oO0ooooo interfaceC0901oO0ooooo;
        View actionView = c0892oO0ooO0o.getActionView();
        int i = 0;
        if (actionView == null || c0892oO0ooO0o.OooO0o0()) {
            if (view instanceof InterfaceC0901oO0ooooo) {
                interfaceC0901oO0ooooo = (InterfaceC0901oO0ooooo) view;
            } else {
                interfaceC0901oO0ooooo = (InterfaceC0901oO0ooooo) this.OooO0Oo.inflate(this.OooO0oO, viewGroup, false);
            }
            interfaceC0901oO0ooooo.OooO0O0(c0892oO0ooO0o);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0901oO0ooooo;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.OooO0oo);
            if (this.OooOo0o == null) {
                this.OooOo0o = new C0430o0Oo0oo(this);
            }
            actionMenuItemView.setPopupCallback(this.OooOo0o);
            actionView = (View) interfaceC0901oO0ooooo;
        }
        if (c0892oO0ooO0o.OooOoo) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0058o000000o)) {
            actionView.setLayoutParams(ActionMenuView.OooOO0O(layoutParams));
        }
        return actionView;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        OooO0Oo();
        C0355o0OOO0o c0355o0OOO0o = this.OooOo0;
        if (c0355o0OOO0o != null && c0355o0OOO0o.OooO0O0()) {
            c0355o0OOO0o.OooOO0.dismiss();
        }
        InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooO0o0;
        if (interfaceC0899oO0oooo != null) {
            interfaceC0899oO0oooo.OooO0O0(menuC0887oO0oo0oo, z);
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0OO(SubMenuC1265oOoo0O subMenuC1265oOoo0O) {
        boolean z;
        if (!subMenuC1265oOoo0O.hasVisibleItems()) {
            return false;
        }
        SubMenuC1265oOoo0O subMenuC1265oOoo0O2 = subMenuC1265oOoo0O;
        while (true) {
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = subMenuC1265oOoo0O2.OooOoO;
            if (menuC0887oO0oo0oo == this.OooO0OO) {
                break;
            }
            subMenuC1265oOoo0O2 = (SubMenuC1265oOoo0O) menuC0887oO0oo0oo;
        }
        ViewGroup viewGroup = (ViewGroup) this.OooO0oo;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0901oO0ooooo) && ((InterfaceC0901oO0ooooo) childAt).getItemData() == subMenuC1265oOoo0O2.OooOoOO) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.OooOoO0 = subMenuC1265oOoo0O.OooOoOO.OooO00o;
        int size = subMenuC1265oOoo0O.OooO0o.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                MenuItem item = subMenuC1265oOoo0O.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        C0355o0OOO0o c0355o0OOO0o = new C0355o0OOO0o(this, this.OooO0O0, subMenuC1265oOoo0O, view);
        this.OooOo0 = c0355o0OOO0o;
        c0355o0OOO0o.OooO0oo = z;
        AbstractC0896oO0oooO0 abstractC0896oO0oooO0 = c0355o0OOO0o.OooOO0;
        if (abstractC0896oO0oooO0 != null) {
            abstractC0896oO0oooO0.OooOOo(z);
        }
        C0355o0OOO0o c0355o0OOO0o2 = this.OooOo0;
        if (!c0355o0OOO0o2.OooO0O0()) {
            if (c0355o0OOO0o2.OooO0o != null) {
                c0355o0OOO0o2.OooO0Oo(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooO0o0;
        if (interfaceC0899oO0oooo != null) {
            interfaceC0899oO0oooo.OooO0o(subMenuC1265oOoo0O);
        }
        return true;
    }

    public final boolean OooO0Oo() {
        oO oOVar;
        o0OO00O o0oo00o = this.OooOo0O;
        if (o0oo00o != null && (oOVar = this.OooO0oo) != null) {
            ((View) oOVar).removeCallbacks(o0oo00o);
            this.OooOo0O = null;
            return true;
        }
        C0355o0OOO0o c0355o0OOO0o = this.OooOo00;
        if (c0355o0OOO0o != null) {
            if (c0355o0OOO0o.OooO0O0()) {
                c0355o0OOO0o.OooOO0.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0084o000OOo) && (i = ((C0084o000OOo) parcelable).OooO00o) > 0 && (findItem = this.OooO0OO.findItem(i)) != null) {
            OooO0OO((SubMenuC1265oOoo0O) findItem.getSubMenu());
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o0(Context context, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        this.OooO0O0 = context;
        LayoutInflater.from(context);
        this.OooO0OO = menuC0887oO0oo0oo;
        Resources resources = context.getResources();
        if (!this.OooOOO) {
            this.OooOOO0 = true;
        }
        int i = 2;
        this.OooOOOO = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.OooOOo0 = i;
        int i4 = this.OooOOOO;
        if (this.OooOOO0) {
            if (this.OooOO0 == null) {
                C1569oo0o0Oo c1569oo0o0Oo = new C1569oo0o0Oo(this, this.OooO00o);
                this.OooOO0 = c1569oo0o0Oo;
                if (this.OooOO0o) {
                    c1569oo0o0Oo.setImageDrawable(this.OooOO0O);
                    this.OooOO0O = null;
                    this.OooOO0o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.OooOO0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.OooOO0.getMeasuredWidth();
        } else {
            this.OooOO0 = null;
        }
        this.OooOOOo = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean OooO0oO() {
        C0355o0OOO0o c0355o0OOO0o = this.OooOo00;
        if (c0355o0OOO0o != null && c0355o0OOO0o.OooO0O0()) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0oo(C0892oO0ooO0o c0892oO0ooO0o) {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final int OooOO0() {
        return this.OooO;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooOO0O() {
        ArrayList arrayList;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO0OO;
        if (menuC0887oO0oo0oo != null) {
            arrayList = menuC0887oO0oo0oo.OooOO0o();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.OooOOo0;
        int i4 = this.OooOOOo;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.OooO0oo;
        int i5 = 0;
        boolean z5 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList.get(i5);
            int i8 = c0892oO0ooO0o.OooOoO0;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z5 = true;
            }
            if (this.OooOOo && c0892oO0ooO0o.OooOoo) {
                i3 = 0;
            }
            i5++;
        }
        if (this.OooOOO0 && (z5 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.OooOOoo;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0892oO0ooO0o c0892oO0ooO0o2 = (C0892oO0ooO0o) arrayList.get(i10);
            int i12 = c0892oO0ooO0o2.OooOoO0;
            if ((i12 & 2) == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i13 = c0892oO0ooO0o2.OooO0O0;
            if (z2) {
                View OooO00o = OooO00o(c0892oO0ooO0o2, null, viewGroup);
                OooO00o.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = OooO00o.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c0892oO0ooO0o2.OooO0oo(z);
            } else if ((i12 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i13);
                if ((i9 > 0 || z6) && i4 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    View OooO00o2 = OooO00o(c0892oO0ooO0o2, null, viewGroup);
                    OooO00o2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = OooO00o2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    if (i4 + i11 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z3 &= z4;
                }
                if (z3 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z6) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C0892oO0ooO0o c0892oO0ooO0o3 = (C0892oO0ooO0o) arrayList.get(i14);
                        if (c0892oO0ooO0o3.OooO0O0 == i13) {
                            if (c0892oO0ooO0o3.OooO0o()) {
                                i9++;
                            }
                            c0892oO0ooO0o3.OooO0oo(false);
                        }
                    }
                }
                if (z3) {
                    i9--;
                }
                c0892oO0ooO0o2.OooO0oo(z3);
            } else {
                c0892oO0ooO0o2.OooO0oo(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, com.ninja.engine.o000OOo] */
    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final Parcelable OooOO0o() {
        Object obj = new Object();
        obj.OooO00o = this.OooOoO0;
        return obj;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooOOO(C0892oO0ooO0o c0892oO0ooO0o) {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooOOO0(InterfaceC0899oO0oooo interfaceC0899oO0oooo) {
        this.OooO0o0 = interfaceC0899oO0oooo;
    }

    public final boolean OooOOOO() {
        MenuC0887oO0oo0oo menuC0887oO0oo0oo;
        if (this.OooOOO0 && !OooO0oO() && (menuC0887oO0oo0oo = this.OooO0OO) != null && this.OooO0oo != null && this.OooOo0O == null) {
            menuC0887oO0oo0oo.OooO();
            if (!menuC0887oO0oo0oo.OooOO0.isEmpty()) {
                o0OO00O o0oo00o = new o0OO00O(this, 0, new C0355o0OOO0o(this, this.OooO0O0, this.OooO0OO, this.OooOO0));
                this.OooOo0O = o0oo00o;
                ((View) this.OooO0oo).post(o0oo00o);
                return true;
            }
            return false;
        }
        return false;
    }
}

