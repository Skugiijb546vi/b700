package com.ninja.engine;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oo0O000O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnApplyWindowInsetsListenerC1451oo0O000O implements View.OnApplyWindowInsetsListener {
    public C1536oo0OoOoO OooO00o = null;
    public final /* synthetic */ View OooO0O0;
    public final /* synthetic */ InterfaceC0954oOO0oOo OooO0OO;

    public View$OnApplyWindowInsetsListenerC1451oo0O000O(View view, InterfaceC0954oOO0oOo interfaceC0954oOO0oOo) {
        this.OooO0O0 = view;
        this.OooO0OO = interfaceC0954oOO0oOo;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1536oo0OoOoO OooO0oO = C1536oo0OoOoO.OooO0oO(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0954oOO0oOo interfaceC0954oOO0oOo = this.OooO0OO;
        if (i < 30) {
            AbstractC1452oo0O000o.OooO00o(windowInsets, this.OooO0O0);
            if (OooO0oO.equals(this.OooO00o)) {
                return interfaceC0954oOO0oOo.OooOO0o(view, OooO0oO).OooO0o();
            }
        }
        this.OooO00o = OooO0oO;
        C1536oo0OoOoO OooOO0o = interfaceC0954oOO0oOo.OooOO0o(view, OooO0oO);
        if (i >= 30) {
            return OooOO0o.OooO0o();
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        AbstractC1449oo0O000.OooO0OO(view);
        return OooOO0o.OooO0o();
    }
}


