package com.ninja.engine;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOooo0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1329oOooo0OO {
    public static OnBackInvokedDispatcher OooO00o(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback OooO0O0(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0101o000o0O0(2, runnable);
    }

    public static void OooO0OO(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void OooO0Oo(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
