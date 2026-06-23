package com.ninja.engine;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* renamed from: com.ninja.engine.oo0OooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543oo0OooOO {
    public final AbstractC1137oOOoooO OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public C1543oo0OooOO(Window window, View view) {
        WindowInsetsController insetsController;
        C1537oo0OoOoo c1537oo0OoOoo;
        WindowInsetsController insetsController2;
        o00O o00o = new o00O(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            insetsController2 = window.getInsetsController();
            C1541oo0Ooo0o c1541oo0Ooo0o = new C1541oo0Ooo0o(insetsController2, o00o);
            c1541oo0Ooo0o.OooO0Oo = window;
            c1537oo0OoOoo = c1541oo0Ooo0o;
        } else if (i >= 30) {
            insetsController = window.getInsetsController();
            C1541oo0Ooo0o c1541oo0Ooo0o2 = new C1541oo0Ooo0o(insetsController, o00o);
            c1541oo0Ooo0o2.OooO0Oo = window;
            c1537oo0OoOoo = c1541oo0Ooo0o2;
        } else if (i >= 26) {
            c1537oo0OoOoo = new C1537oo0OoOoo(window, o00o);
        } else if (i >= 23) {
            c1537oo0OoOoo = new C1537oo0OoOoo(window, o00o);
        } else {
            c1537oo0OoOoo = new C1537oo0OoOoo(window, o00o);
        }
        this.OooO00o = c1537oo0OoOoo;
    }

    public C1543oo0OooOO(WindowInsetsController windowInsetsController) {
        this.OooO00o = Build.VERSION.SDK_INT >= 35 ? new C1541oo0Ooo0o(windowInsetsController, new o00O(windowInsetsController)) : new C1541oo0Ooo0o(windowInsetsController, new o00O(windowInsetsController));
    }
}


