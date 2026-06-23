package com.ninja.engine;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: com.ninja.engine.OooOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017OooOOo implements InterfaceC0336o0O0ooO0 {
    public final float OooO00o;

    public C0017OooOOo(float f) {
        this.OooO00o = f;
    }

    @Override // com.ninja.engine.InterfaceC0336o0O0ooO0
    public final float OooO00o(RectF rectF) {
        return this.OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0017OooOOo) && this.OooO00o == ((C0017OooOOo) obj).OooO00o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.OooO00o)});
    }
}
