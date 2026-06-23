package com.ninja.engine;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
/* renamed from: com.ninja.engine.oo0OoOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532oo0OoOOO extends C1530oo0OoOO {
    public static final C1536oo0OoOoO OooOOo0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        OooOOo0 = C1536oo0OoOoO.OooO0oO(null, windowInsets);
    }

    public C1532oo0OoOOO(C1536oo0OoOoO c1536oo0OoOoO, WindowInsets windowInsets) {
        super(c1536oo0OoOoO, windowInsets);
    }

    @Override // com.ninja.engine.AbstractC1528oo0OoO00, com.ninja.engine.C1533oo0OoOOo
    public C0724oO00OooO OooO0o(int i) {
        Insets insets;
        insets = this.OooO0OO.getInsets(AbstractC1534oo0OoOo.OooO00o(i));
        return C0724oO00OooO.OooO0OO(insets);
    }

    @Override // com.ninja.engine.AbstractC1528oo0OoO00, com.ninja.engine.C1533oo0OoOOo
    public final void OooO0Oo(View view) {
    }
}


