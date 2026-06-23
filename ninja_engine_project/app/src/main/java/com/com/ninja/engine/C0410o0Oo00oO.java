package com.ninja.engine;

import android.view.DisplayCutout;
import java.util.Objects;
/* renamed from: com.ninja.engine.o0Oo00oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410o0Oo00oO {
    public final DisplayCutout OooO00o;

    public C0410o0Oo00oO(DisplayCutout displayCutout) {
        this.OooO00o = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0410o0Oo00oO.class == obj.getClass()) {
            return Objects.equals(this.OooO00o, ((C0410o0Oo00oO) obj).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.OooO00o;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.OooO00o + "}";
    }
}
