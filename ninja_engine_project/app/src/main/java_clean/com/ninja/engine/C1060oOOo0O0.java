package com.ninja.engine;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.ninja.engine.oOOo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1060oOOo0O0 {
    public final /* synthetic */ RecyclerView OooO00o;

    public void OooO00o(int i) {
        RecyclerView recyclerView = this.OooO00o;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.Oooo0(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}


