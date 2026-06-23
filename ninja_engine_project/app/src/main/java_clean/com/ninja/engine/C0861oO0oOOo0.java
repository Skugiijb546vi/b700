package com.ninja.engine;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.ninja.engine.oO0oOOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861oO0oOOo0 extends LinearLayoutManager {
    public final /* synthetic */ int OooOooo;
    public final /* synthetic */ C0863oO0oOOoo Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0861oO0oOOo0(C0863oO0oOOoo c0863oO0oOOoo, int i, int i2) {
        super(i);
        this.Oooo000 = c0863oO0oOOoo;
        this.OooOooo = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0O0O00(C1080oOOoO0O c1080oOOoO0O, int[] iArr) {
        int i = this.OooOooo;
        C0863oO0oOOoo c0863oO0oOOoo = this.Oooo000;
        if (i == 0) {
            iArr[0] = c0863oO0oOOoo.Ooooo00.getWidth();
            iArr[1] = c0863oO0oOOoo.Ooooo00.getWidth();
            return;
        }
        iArr[0] = c0863oO0oOOoo.Ooooo00.getHeight();
        iArr[1] = c0863oO0oOOoo.Ooooo00.getHeight();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o0Oo0oo(RecyclerView recyclerView, int i) {
        oO0OO00 oo0oo00 = new oO0OO00(recyclerView.getContext());
        oo0oo00.OooO00o = i;
        o0OO00O(oo0oo00);
    }
}


