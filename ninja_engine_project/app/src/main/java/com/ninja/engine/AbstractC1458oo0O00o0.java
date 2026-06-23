package com.ninja.engine;

import android.view.View;
import android.view.WindowInsetsController;
/* renamed from: com.ninja.engine.oo0O00o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1458oo0O00o0 {
    public static CharSequence OooO00o(View view) {
        return view.getStateDescription();
    }

    public static C1543oo0OooOO OooO0O0(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new C1543oo0OooOO(windowInsetsController);
        }
        return null;
    }
}
