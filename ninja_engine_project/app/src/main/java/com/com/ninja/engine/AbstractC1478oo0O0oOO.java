package com.ninja.engine;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
/* renamed from: com.ninja.engine.oo0O0oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1478oo0O0oOO {
    public static final C0919oOO00oOo OooO00o;
    public static final o0O0000O OooO0O0;

    static {
        C0919oOO00oOo c0919oOO00oOo;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c0919oOO00oOo = new C0919oOO00oOo(26);
        } else if (i >= 23) {
            c0919oOO00oOo = new C0919oOO00oOo(26);
        } else if (i >= 22) {
            c0919oOO00oOo = new C0919oOO00oOo(26);
        } else {
            c0919oOO00oOo = new C0919oOO00oOo(26);
        }
        OooO00o = c0919oOO00oOo;
        OooO0O0 = new o0O0000O(Float.class, "translationAlpha", 8);
        new o0O0000O(Rect.class, "clipBounds", 9);
    }

    public static void OooO00o(View view, int i, int i2, int i3, int i4) {
        OooO00o.OooOO0o(view, i, i2, i3, i4);
    }

    public static void OooO0O0(View view, int i) {
        OooO00o.OooOOOO(view, i);
    }
}
