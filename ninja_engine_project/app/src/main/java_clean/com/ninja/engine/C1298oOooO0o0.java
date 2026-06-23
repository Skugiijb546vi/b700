package com.ninja.engine;

import android.graphics.Typeface;
/* renamed from: com.ninja.engine.oOooO0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1298oOooO0o0 extends AbstractC1137oOOoooO {
    public void OooOOOo() {}
    public final /* synthetic */ AbstractC1091oOOoOOOO OooO0O0;
    public final /* synthetic */ C1299oOooO0oO OooO0OO;

    public C1298oOooO0o0(C1299oOooO0oO c1299oOooO0oO, AbstractC1091oOOoOOOO abstractC1091oOOoOOOO) {
        this.OooO0OO = c1299oOooO0oO;
        this.OooO0O0 = abstractC1091oOOoOOOO;
    }

    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOO0(int i) {
        this.OooO0OO.OooOOO0 = true;
        this.OooO0O0.OooOoO(i);
    }

    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOO0O(Typeface typeface) {
        C1299oOooO0oO c1299oOooO0oO = this.OooO0OO;
        c1299oOooO0oO.OooOOO = Typeface.create(typeface, c1299oOooO0oO.OooO0OO);
        c1299oOooO0oO.OooOOO0 = true;
        this.OooO0O0.OooOoOO(c1299oOooO0oO.OooOOO, false);
    }
}


