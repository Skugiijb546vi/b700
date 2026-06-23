package com.ninja.engine;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: com.ninja.engine.oOOoOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092oOOoOOOo implements InterfaceC0336o0O0ooO0 {
    public final float OooO00o;

    public C1092oOOoOOOo(float f) {
        this.OooO00o = f;
    }

    @Override // com.ninja.engine.InterfaceC0336o0O0ooO0
    public final float OooO00o(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1092oOOoOOOo) && this.OooO00o == ((C1092oOOoOOOo) obj).OooO00o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.OooO00o)});
    }
}
