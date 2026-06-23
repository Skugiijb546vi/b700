package com.ninja.engine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oO0oo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884oO0oo0Oo extends BaseAdapter {
    public final MenuC0887oO0oo0oo OooO00o;
    public int OooO0O0 = -1;
    public boolean OooO0OO;
    public final boolean OooO0Oo;
    public final int OooO0o;
    public final LayoutInflater OooO0o0;

    public C0884oO0oo0Oo(MenuC0887oO0oo0oo menuC0887oO0oo0oo, LayoutInflater layoutInflater, boolean z, int i) {
        this.OooO0Oo = z;
        this.OooO0o0 = layoutInflater;
        this.OooO00o = menuC0887oO0oo0oo;
        this.OooO0o = i;
        OooO00o();
    }

    public final void OooO00o() {
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO00o;
        C0892oO0ooO0o c0892oO0ooO0o = menuC0887oO0oo0oo.OooOo0O;
        if (c0892oO0ooO0o != null) {
            menuC0887oO0oo0oo.OooO();
            ArrayList arrayList = menuC0887oO0oo0oo.OooOO0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0892oO0ooO0o) arrayList.get(i)) == c0892oO0ooO0o) {
                    this.OooO0O0 = i;
                    return;
                }
            }
        }
        this.OooO0O0 = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0 */
    public final C0892oO0ooO0o getItem(int i) {
        ArrayList OooOO0o;
        boolean z = this.OooO0Oo;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO00o;
        if (z) {
            menuC0887oO0oo0oo.OooO();
            OooOO0o = menuC0887oO0oo0oo.OooOO0;
        } else {
            OooOO0o = menuC0887oO0oo0oo.OooOO0o();
        }
        int i2 = this.OooO0O0;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0892oO0ooO0o) OooOO0o.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList OooOO0o;
        boolean z = this.OooO0Oo;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO00o;
        if (z) {
            menuC0887oO0oo0oo.OooO();
            OooOO0o = menuC0887oO0oo0oo.OooOO0;
        } else {
            OooOO0o = menuC0887oO0oo0oo.OooOO0o();
        }
        int i = this.OooO0O0;
        int size = OooOO0o.size();
        if (i < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.OooO0o0.inflate(this.OooO0o, viewGroup, false);
        }
        int i3 = getItem(i).OooO0O0;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).OooO0O0;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.OooO00o.OooOOO0() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0901oO0ooooo interfaceC0901oO0ooooo = (InterfaceC0901oO0ooooo) view;
        if (this.OooO0OO) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0901oO0ooooo.OooO0O0(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO00o();
        super.notifyDataSetChanged();
    }
}
