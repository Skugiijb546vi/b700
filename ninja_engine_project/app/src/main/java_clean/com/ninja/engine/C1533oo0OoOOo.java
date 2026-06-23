package com.ninja.engine;

import android.os.Build;
import android.view.View;
import java.util.Objects;
/* renamed from: com.ninja.engine.oo0OoOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1533oo0OoOOo {
    public static final C1536oo0OoOoO OooO0O0;
    public final C1536oo0OoOoO OooO00o;

    static {
        AbstractC1513oo0Oo c1523oo0Oo0o0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c1523oo0Oo0o0 = new C1525oo0Oo0oo();
        } else if (i >= 29) {
            c1523oo0Oo0o0 = new C1524oo0Oo0oO();
        } else {
            c1523oo0Oo0o0 = new C1523oo0Oo0o0();
        }
        OooO0O0 = c1523oo0Oo0o0.OooO0O0().OooO00o.OooO00o().OooO00o.OooO0O0().OooO00o.OooO0OO();
    }

    public C1533oo0OoOOo(C1536oo0OoOoO c1536oo0OoOoO) {
        this.OooO00o = c1536oo0OoOoO;
    }

    public C0724oO00OooO OooO() {
        return OooOO0();
    }

    public C1536oo0OoOoO OooO00o() {
        return this.OooO00o;
    }

    public C1536oo0OoOoO OooO0O0() {
        return this.OooO00o;
    }

    public C1536oo0OoOoO OooO0OO() {
        return this.OooO00o;
    }

    public C0724oO00OooO OooO0o(int i) {
        return C0724oO00OooO.OooO0o0;
    }

    public C0410o0Oo00oO OooO0o0() {
        return null;
    }

    public C0724oO00OooO OooO0oO() {
        return OooOO0();
    }

    public C0724oO00OooO OooO0oo() {
        return C0724oO00OooO.OooO0o0;
    }

    public C0724oO00OooO OooOO0() {
        return C0724oO00OooO.OooO0o0;
    }

    public C0724oO00OooO OooOO0O() {
        return OooOO0();
    }

    public C1536oo0OoOoO OooOO0o(int i, int i2, int i3, int i4) {
        return OooO0O0;
    }

    public boolean OooOOO() {
        return false;
    }

    public boolean OooOOO0() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1533oo0OoOOo)) {
            return false;
        }
        C1533oo0OoOOo c1533oo0OoOOo = (C1533oo0OoOOo) obj;
        if (OooOOO() == c1533oo0OoOOo.OooOOO() && OooOOO0() == c1533oo0OoOOo.OooOOO0() && Objects.equals(OooOO0(), c1533oo0OoOOo.OooOO0()) && Objects.equals(OooO0oo(), c1533oo0OoOOo.OooO0oo()) && Objects.equals(OooO0o0(), c1533oo0OoOOo.OooO0o0())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(OooOOO()), Boolean.valueOf(OooOOO0()), OooOO0(), OooO0oo(), OooO0o0());
    }

    public void OooO0Oo(View view) {
    }

    public void OooOOOO(C0724oO00OooO[] c0724oO00OooOArr) {
    }

    public void OooOOOo(C1536oo0OoOoO c1536oo0OoOoO) {
    }

    public void OooOOo0(C0724oO00OooO c0724oO00OooO) {
    }
}


