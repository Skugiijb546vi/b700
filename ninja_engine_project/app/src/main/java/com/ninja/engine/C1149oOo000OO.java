package com.ninja.engine;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
/* renamed from: com.ninja.engine.oOo000OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149oOo000OO extends C0432o0Oo0ooO {
    public final int OooOOO;
    public final int OooOOO0;
    public InterfaceC0891oO0ooO0O OooOOOO;
    public C0892oO0ooO0o OooOOOo;

    public C1149oOo000OO(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.OooOOO0 = 21;
            this.OooOOO = 22;
            return;
        }
        this.OooOOO0 = 22;
        this.OooOOO = 21;
    }

    @Override // com.ninja.engine.C0432o0Oo0ooO, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0884oO0oo0Oo c0884oO0oo0Oo;
        int i;
        C0892oO0ooO0o c0892oO0ooO0o;
        int pointToPosition;
        int i2;
        if (this.OooOOOO != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0884oO0oo0Oo = (C0884oO0oo0Oo) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0884oO0oo0Oo = (C0884oO0oo0Oo) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0884oO0oo0Oo.getCount()) {
                c0892oO0ooO0o = c0884oO0oo0Oo.getItem(i2);
            } else {
                c0892oO0ooO0o = null;
            }
            C0892oO0ooO0o c0892oO0ooO0o2 = this.OooOOOo;
            if (c0892oO0ooO0o2 != c0892oO0ooO0o) {
                MenuC0887oO0oo0oo menuC0887oO0oo0oo = c0884oO0oo0Oo.OooO00o;
                if (c0892oO0ooO0o2 != null) {
                    this.OooOOOO.OooOo0O(menuC0887oO0oo0oo, c0892oO0ooO0o2);
                }
                this.OooOOOo = c0892oO0ooO0o;
                if (c0892oO0ooO0o != null) {
                    this.OooOOOO.OooOoo0(menuC0887oO0oo0oo, c0892oO0ooO0o);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.OooOOO0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i == this.OooOOO) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0884oO0oo0Oo) adapter).OooO00o.OooO0OO(false);
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setHoverListener(InterfaceC0891oO0ooO0O interfaceC0891oO0ooO0O) {
        this.OooOOOO = interfaceC0891oO0ooO0O;
    }

    @Override // com.ninja.engine.C0432o0Oo0ooO, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
