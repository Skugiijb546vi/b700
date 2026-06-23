package com.ninja.engine;

import android.view.WindowInsets;
/* renamed from: com.ninja.engine.oo0Oo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1524oo0Oo0oO extends AbstractC1513oo0Oo {
    public final WindowInsets.Builder OooO0OO;

    public C1524oo0Oo0oO() {
        this.OooO0OO = AbstractC1522oo0Oo0o.OooO0O0();
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public C1536oo0OoOoO OooO0O0() {
        WindowInsets build;
        OooO00o();
        build = this.OooO0OO.build();
        C1536oo0OoOoO OooO0oO = C1536oo0OoOoO.OooO0oO(null, build);
        OooO0oO.OooO00o.OooOOOO(this.OooO0O0);
        return OooO0oO;
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public void OooO0Oo(C0724oO00OooO c0724oO00OooO) {
        this.OooO0OO.setMandatorySystemGestureInsets(c0724oO00OooO.OooO0Oo());
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public void OooO0o(C0724oO00OooO c0724oO00OooO) {
        this.OooO0OO.setSystemGestureInsets(c0724oO00OooO.OooO0Oo());
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public void OooO0o0(C0724oO00OooO c0724oO00OooO) {
        this.OooO0OO.setStableInsets(c0724oO00OooO.OooO0Oo());
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public void OooO0oO(C0724oO00OooO c0724oO00OooO) {
        this.OooO0OO.setSystemWindowInsets(c0724oO00OooO.OooO0Oo());
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public void OooO0oo(C0724oO00OooO c0724oO00OooO) {
        this.OooO0OO.setTappableElementInsets(c0724oO00OooO.OooO0Oo());
    }

    public C1524oo0Oo0oO(C1536oo0OoOoO c1536oo0OoOoO) {
        super(c1536oo0OoOoO);
        WindowInsets OooO0o = c1536oo0OoOoO.OooO0o();
        this.OooO0OO = OooO0o != null ? AbstractC1522oo0Oo0o.OooO0OO(OooO0o) : AbstractC1522oo0Oo0o.OooO0O0();
    }
}


