package com.ninja.engine;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
/* renamed from: com.ninja.engine.o000o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0100o000o0O {
    public static OnBackInvokedDispatcher OooO00o(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback OooO0O0(Object obj, LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo) {
        Objects.requireNonNull(layoutInflater$Factory2C0109o000oOoo);
        C0101o000o0O0 c0101o000o0O0 = new C0101o000o0O0(0, layoutInflater$Factory2C0109o000oOoo);
        AbstractC0036Oooo0o0.OooO0oO(obj).registerOnBackInvokedCallback(1000000, c0101o000o0O0);
        return c0101o000o0O0;
    }

    public static void OooO0OO(Object obj, Object obj2) {
        AbstractC0036Oooo0o0.OooO0oO(obj).unregisterOnBackInvokedCallback(AbstractC0036Oooo0o0.OooO0Oo(obj2));
    }
}
