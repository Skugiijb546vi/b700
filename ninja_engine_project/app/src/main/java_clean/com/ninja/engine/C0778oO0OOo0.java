package com.ninja.engine;

import android.os.Handler;
import android.widget.AbsListView;
/* renamed from: com.ninja.engine.oO0OOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778oO0OOo0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ C0781oO0OOoO OooO00o;

    public C0778oO0OOo0(C0781oO0OOoO c0781oO0OOoO) {
        this.OooO00o = c0781oO0OOoO;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C0781oO0OOoO c0781oO0OOoO = this.OooO00o;
            if (c0781oO0OOoO.OooOoO.getInputMethodMode() != 2 && c0781oO0OOoO.OooOoO.getContentView() != null) {
                Handler handler = c0781oO0OOoO.OooOo0O;
                oO0OOOO oo0oooo = c0781oO0OOoO.OooOOo;
                handler.removeCallbacks(oo0oooo);
                oo0oooo.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}


