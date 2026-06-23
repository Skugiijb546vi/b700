package com.ninja.engine;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* renamed from: com.ninja.engine.oO0oooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0896oO0oooO0 implements InterfaceC1216oOoOOoOO, InterfaceC1165oOo00o00, AdapterView.OnItemClickListener {
    public Rect OooO00o;

    public static int OooOOOo(C0884oO0oo0Oo c0884oO0oo0Oo, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c0884oO0oo0Oo.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c0884oO0oo0Oo.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c0884oO0oo0Oo.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean OooOo(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        int size = menuC0887oO0oo0oo.OooO0o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC0887oO0oo0oo.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
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
    public final boolean OooOOO(C0892oO0ooO0o c0892oO0ooO0o) {
        return false;
    }

    public abstract void OooOOOO(MenuC0887oO0oo0oo menuC0887oO0oo0oo);

    public abstract void OooOOo(boolean z);

    public abstract void OooOOo0(View view);

    public abstract void OooOOoo(int i);

    public abstract void OooOo0(PopupWindow.OnDismissListener onDismissListener);

    public abstract void OooOo00(int i);

    public abstract void OooOo0O(boolean z);

    public abstract void OooOo0o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0884oO0oo0Oo c0884oO0oo0Oo;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c0884oO0oo0Oo = (C0884oO0oo0Oo) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c0884oO0oo0Oo = (C0884oO0oo0Oo) listAdapter;
        }
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = c0884oO0oo0Oo.OooO00o;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof View$OnKeyListenerC0276o00ooo0o)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        menuC0887oO0oo0oo.OooOOo0(menuItem, this, i2);
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o0(Context context, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
    }
}
