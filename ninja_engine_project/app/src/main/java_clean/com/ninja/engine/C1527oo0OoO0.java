package com.ninja.engine;

import android.view.WindowInsets;
/* renamed from: com.ninja.engine.oo0OoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1527oo0OoO0 extends AbstractC1528oo0OoO00 {
    public C0724oO00OooO OooOOO0;

    public C1527oo0OoO0(C1536oo0OoOoO c1536oo0OoOoO, WindowInsets windowInsets) {
        super(c1536oo0OoOoO, windowInsets);
        this.OooOOO0 = null;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C1536oo0OoOoO OooO0O0() {
        return C1536oo0OoOoO.OooO0oO(null, this.OooO0OO.consumeStableInsets());
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C1536oo0OoOoO OooO0OO() {
        return C1536oo0OoOoO.OooO0oO(null, this.OooO0OO.consumeSystemWindowInsets());
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public final C0724oO00OooO OooO0oo() {
        if (this.OooOOO0 == null) {
            WindowInsets windowInsets = this.OooO0OO;
            this.OooOOO0 = C0724oO00OooO.OooO0O0(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.OooOOO0;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public boolean OooOOO0() {
        return this.OooO0OO.isConsumed();
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public void OooOOo0(C0724oO00OooO c0724oO00OooO) {
        this.OooOOO0 = c0724oO00OooO;
    }
}


