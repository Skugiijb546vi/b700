package com.ninja.engine;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
/* loaded from: classes.dex */
public final class oO0OOO0 implements InterfaceC1165oOo00o00, AdapterView.OnItemClickListener {
    public Context OooO00o;
    public LayoutInflater OooO0O0;
    public MenuC0887oO0oo0oo OooO0OO;
    public ExpandedMenuView OooO0Oo;
    public C0769oO0OO0Oo OooO0o;
    public InterfaceC0899oO0oooo OooO0o0;

    public oO0OOO0(Context context) {
        this.OooO00o = context;
        this.OooO0O0 = LayoutInflater.from(context);
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO(boolean z) {
        C0769oO0OO0Oo c0769oO0OO0Oo = this.OooO0o;
        if (c0769oO0OO0Oo != null) {
            c0769oO0OO0Oo.notifyDataSetChanged();
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooO0o0;
        if (interfaceC0899oO0oooo != null) {
            interfaceC0899oO0oooo.OooO0O0(menuC0887oO0oo0oo, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, com.ninja.engine.oO0oo, android.content.DialogInterface$OnKeyListener, java.lang.Object, com.ninja.engine.oO0oooo, android.content.DialogInterface$OnDismissListener] */
    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0OO(SubMenuC1265oOoo0O subMenuC1265oOoo0O) {
        if (!subMenuC1265oOoo0O.hasVisibleItems()) {
            return false;
        }
        Object obj = new Object();
        obj.OooO00o = subMenuC1265oOoo0O;
        Context context = subMenuC1265oOoo0O.OooO00o;
        C0073o0000oO0 c0073o0000oO0 = new C0073o0000oO0(context);
        C0069o0000o0 c0069o0000o0 = (C0069o0000o0) c0073o0000oO0.OooO0O0;
        oO0OOO0 oo0ooo0 = new oO0OOO0(c0069o0000o0.OooO00o);
        obj.OooO0OO = oo0ooo0;
        oo0ooo0.OooO0o0 = obj;
        subMenuC1265oOoo0O.OooO0O0(oo0ooo0, context);
        oO0OOO0 oo0ooo02 = obj.OooO0OO;
        if (oo0ooo02.OooO0o == null) {
            oo0ooo02.OooO0o = new C0769oO0OO0Oo(oo0ooo02);
        }
        c0069o0000o0.OooO0oO = oo0ooo02.OooO0o;
        c0069o0000o0.OooO0oo = obj;
        View view = subMenuC1265oOoo0O.OooOOOO;
        if (view != null) {
            c0069o0000o0.OooO0o0 = view;
        } else {
            c0069o0000o0.OooO0OO = subMenuC1265oOoo0O.OooOOO;
            c0069o0000o0.OooO0Oo = subMenuC1265oOoo0O.OooOOO0;
        }
        c0069o0000o0.OooO0o = obj;
        DialogInterfaceC0074o0000oOO OooO00o = c0073o0000oO0.OooO00o();
        obj.OooO0O0 = OooO00o;
        OooO00o.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.OooO0O0.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.OooO0O0.show();
        InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooO0o0;
        if (interfaceC0899oO0oooo != null) {
            interfaceC0899oO0oooo.OooO0o(subMenuC1265oOoo0O);
            return true;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.OooO0Oo.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o0(Context context, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        if (this.OooO00o != null) {
            this.OooO00o = context;
            if (this.OooO0O0 == null) {
                this.OooO0O0 = LayoutInflater.from(context);
            }
        }
        this.OooO0OO = menuC0887oO0oo0oo;
        C0769oO0OO0Oo c0769oO0OO0Oo = this.OooO0o;
        if (c0769oO0OO0Oo != null) {
            c0769oO0OO0Oo.notifyDataSetChanged();
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0oo(C0892oO0ooO0o c0892oO0ooO0o) {
        return false;
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
        if (this.OooO0Oo == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.OooO0Oo;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooOOO(C0892oO0ooO0o c0892oO0ooO0o) {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooOOO0(InterfaceC0899oO0oooo interfaceC0899oO0oooo) {
        this.OooO0o0 = interfaceC0899oO0oooo;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.OooO0OO.OooOOo0(this.OooO0o.getItem(i), this, 0);
    }
}



