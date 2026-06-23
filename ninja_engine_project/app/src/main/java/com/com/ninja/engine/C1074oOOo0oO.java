package com.ninja.engine;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOOo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074oOOo0oO {
    public final /* synthetic */ RecyclerView OooO00o;

    public C1074oOOo0oO(RecyclerView recyclerView) {
        this.OooO00o = recyclerView;
    }

    public final void OooO00o() {
        boolean z = RecyclerView.o00oO0O;
        RecyclerView recyclerView = this.OooO00o;
        if (z && recyclerView.OooOOo && recyclerView.OooOOo0) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            recyclerView.postOnAnimation(recyclerView.OooO0oo);
            return;
        }
        recyclerView.OooOoO0 = true;
        recyclerView.requestLayout();
    }
}
