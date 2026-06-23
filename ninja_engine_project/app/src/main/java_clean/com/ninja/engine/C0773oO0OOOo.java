package com.ninja.engine;

import android.database.DataSetObserver;
/* renamed from: com.ninja.engine.oO0OOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773oO0OOOo extends DataSetObserver {
    public final /* synthetic */ C0781oO0OOoO OooO00o;

    public C0773oO0OOOo(C0781oO0OOoO c0781oO0OOoO) {
        this.OooO00o = c0781oO0OOoO;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0781oO0OOoO c0781oO0OOoO = this.OooO00o;
        if (c0781oO0OOoO.OooOoO.isShowing()) {
            c0781oO0OOoO.OooO0Oo();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.OooO00o.dismiss();
    }
}


