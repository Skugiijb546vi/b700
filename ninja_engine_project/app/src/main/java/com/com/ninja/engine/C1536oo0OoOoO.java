package com.ninja.engine;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
/* renamed from: com.ninja.engine.oo0OoOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536oo0OoOoO {
    public static final C1536oo0OoOoO OooO0O0;
    public final C1533oo0OoOOo OooO00o;

    static {
        C1536oo0OoOoO c1536oo0OoOoO;
        if (Build.VERSION.SDK_INT >= 30) {
            c1536oo0OoOoO = C1532oo0OoOOO.OooOOo0;
        } else {
            c1536oo0OoOoO = C1533oo0OoOOo.OooO0O0;
        }
        OooO0O0 = c1536oo0OoOoO;
    }

    public C1536oo0OoOoO() {
        this.OooO00o = new C1533oo0OoOOo(this);
    }

    public static C0724oO00OooO OooO0o0(C0724oO00OooO c0724oO00OooO, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c0724oO00OooO.OooO00o - i);
        int max2 = Math.max(0, c0724oO00OooO.OooO0O0 - i2);
        int max3 = Math.max(0, c0724oO00OooO.OooO0OO - i3);
        int max4 = Math.max(0, c0724oO00OooO.OooO0Oo - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return c0724oO00OooO;
        }
        return C0724oO00OooO.OooO0O0(max, max2, max3, max4);
    }

    public static C1536oo0OoOoO OooO0oO(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C1536oo0OoOoO c1536oo0OoOoO = new C1536oo0OoOoO(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            C1536oo0OoOoO OooO0oo = AbstractC1460oo0O00oo.OooO0oo(view);
            C1533oo0OoOOo c1533oo0OoOOo = c1536oo0OoOoO.OooO00o;
            c1533oo0OoOOo.OooOOOo(OooO0oo);
            c1533oo0OoOOo.OooO0Oo(view.getRootView());
        }
        return c1536oo0OoOoO;
    }

    public final int OooO00o() {
        return this.OooO00o.OooOO0().OooO0Oo;
    }

    public final int OooO0O0() {
        return this.OooO00o.OooOO0().OooO00o;
    }

    public final int OooO0OO() {
        return this.OooO00o.OooOO0().OooO0OO;
    }

    public final int OooO0Oo() {
        return this.OooO00o.OooOO0().OooO0O0;
    }

    public final WindowInsets OooO0o() {
        C1533oo0OoOOo c1533oo0OoOOo = this.OooO00o;
        if (c1533oo0OoOOo instanceof AbstractC1528oo0OoO00) {
            return ((AbstractC1528oo0OoO00) c1533oo0OoOOo).OooO0OO;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1536oo0OoOoO)) {
            return false;
        }
        return Objects.equals(this.OooO00o, ((C1536oo0OoOoO) obj).OooO00o);
    }

    public final int hashCode() {
        C1533oo0OoOOo c1533oo0OoOOo = this.OooO00o;
        if (c1533oo0OoOOo == null) {
            return 0;
        }
        return c1533oo0OoOOo.hashCode();
    }

    public C1536oo0OoOoO(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.OooO00o = i >= 30 ? new C1532oo0OoOOO(this, windowInsets) : i >= 29 ? new C1530oo0OoOO(this, windowInsets) : i >= 28 ? new C1529oo0OoO0o(this, windowInsets) : new C1527oo0OoO0(this, windowInsets);
    }
}
