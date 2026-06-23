package com.ninja.engine;

import android.view.View;
import android.view.WindowInsets;
/* renamed from: com.ninja.engine.oo0O00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1448oo0O00 {
    public static C1536oo0OoOoO OooO00o(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1536oo0OoOoO OooO0oO = C1536oo0OoOoO.OooO0oO(null, rootWindowInsets);
        C1533oo0OoOOo c1533oo0OoOOo = OooO0oO.OooO00o;
        c1533oo0OoOOo.OooOOOo(OooO0oO);
        c1533oo0OoOOo.OooO0Oo(view.getRootView());
        return OooO0oO;
    }

    public static void OooO0O0(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
