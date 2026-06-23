package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oO0OO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769oO0OO0Oo extends BaseAdapter {
    public int OooO00o = -1;
    public final /* synthetic */ oO0OOO0 OooO0O0;

    public C0769oO0OO0Oo(oO0OOO0 oo0ooo0) {
        this.OooO0O0 = oo0ooo0;
        OooO00o();
    }

    public final void OooO00o() {
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO0O0.OooO0OO;
        C0892oO0ooO0o c0892oO0ooO0o = menuC0887oO0oo0oo.OooOo0O;
        if (c0892oO0ooO0o != null) {
            menuC0887oO0oo0oo.OooO();
            ArrayList arrayList = menuC0887oO0oo0oo.OooOO0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0892oO0ooO0o) arrayList.get(i)) == c0892oO0ooO0o) {
                    this.OooO00o = i;
                    return;
                }
            }
        }
        this.OooO00o = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0 */
    public final C0892oO0ooO0o getItem(int i) {
        oO0OOO0 oo0ooo0 = this.OooO0O0;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = oo0ooo0.OooO0OO;
        menuC0887oO0oo0oo.OooO();
        ArrayList arrayList = menuC0887oO0oo0oo.OooOO0;
        oo0ooo0.getClass();
        int i2 = this.OooO00o;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0892oO0ooO0o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        oO0OOO0 oo0ooo0 = this.OooO0O0;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = oo0ooo0.OooO0OO;
        menuC0887oO0oo0oo.OooO();
        int size = menuC0887oO0oo0oo.OooOO0.size();
        oo0ooo0.getClass();
        if (this.OooO00o < 0) {
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
        if (view == null) {
            view = this.OooO0O0.OooO0O0.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0901oO0ooooo) view).OooO0O0(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO00o();
        super.notifyDataSetChanged();
    }
}


