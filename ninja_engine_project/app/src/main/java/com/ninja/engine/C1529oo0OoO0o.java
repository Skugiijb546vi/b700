package com.ninja.engine;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* renamed from: com.ninja.engine.oo0OoO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1529oo0OoO0o extends C1527oo0OoO0 {
    public C1529oo0OoO0o(C1536oo0OoOoO c1536oo0OoOoO, WindowInsets windowInsets) {
        super(c1536oo0OoOoO, windowInsets);
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C1536oo0OoOoO OooO00o() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.OooO0OO.consumeDisplayCutout();
        return C1536oo0OoOoO.OooO0oO(null, consumeDisplayCutout);
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C0410o0Oo00oO OooO0o0() {
        DisplayCutout displayCutout;
        displayCutout = this.OooO0OO.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0410o0Oo00oO(displayCutout);
    }

    @Override // com.ninja.engine.AbstractC1528oo0OoO00, com.ninja.engine.C1533oo0OoOOo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1529oo0OoO0o)) {
            return false;
        }
        C1529oo0OoO0o c1529oo0OoO0o = (C1529oo0OoO0o) obj;
        if (Objects.equals(this.OooO0OO, c1529oo0OoO0o.OooO0OO) && Objects.equals(this.OooO0oO, c1529oo0OoO0o.OooO0oO)) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public int hashCode() {
        return this.OooO0OO.hashCode();
    }
}
