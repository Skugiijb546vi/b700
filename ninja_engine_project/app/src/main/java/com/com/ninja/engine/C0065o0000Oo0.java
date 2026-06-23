package com.ninja.engine;

import android.view.View;
import android.widget.AbsListView;
/* renamed from: com.ninja.engine.o0000Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065o0000Oo0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ View OooO00o;
    public final /* synthetic */ View OooO0O0;

    public C0065o0000Oo0(View view, View view2) {
        this.OooO00o = view;
        this.OooO0O0 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0068o0000o.OooO0O0(absListView, this.OooO00o, this.OooO0O0);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
