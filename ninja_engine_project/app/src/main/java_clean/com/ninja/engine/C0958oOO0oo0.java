package com.ninja.engine;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
/* renamed from: com.ninja.engine.oOO0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958oOO0oo0 {
    public static final C0958oOO0oo0 OooO00o = new C0958oOO0oo0();

    public final OnBackInvokedCallback OooO00o(InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo) {
        AbstractC0809oO0OooOO.OooOOOo(interfaceC0625o0oo0OOo, "onBackInvoked");
        return new C0101o000o0O0(1, interfaceC0625o0oo0OOo);
    }

    public final void OooO0O0(Object obj, int i, Object obj2) {
        AbstractC0809oO0OooOO.OooOOOo(obj, "dispatcher");
        AbstractC0809oO0OooOO.OooOOOo(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void OooO0OO(Object obj, Object obj2) {
        AbstractC0809oO0OooOO.OooOOOo(obj, "dispatcher");
        AbstractC0809oO0OooOO.OooOOOo(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}


