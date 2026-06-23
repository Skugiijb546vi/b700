package com.ninja.engine;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class o0000OO implements InterfaceC0336o0O0ooO0 {
    public final InterfaceC0336o0O0ooO0 OooO00o;
    public final float OooO0O0;

    public o0000OO(float f, InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0) {
        while (interfaceC0336o0O0ooO0 instanceof o0000OO) {
            interfaceC0336o0O0ooO0 = ((o0000OO) interfaceC0336o0O0ooO0).OooO00o;
            f += ((o0000OO) interfaceC0336o0O0ooO0).OooO0O0;
        }
        this.OooO00o = interfaceC0336o0O0ooO0;
        this.OooO0O0 = f;
    }

    @Override // com.ninja.engine.InterfaceC0336o0O0ooO0
    public final float OooO00o(RectF rectF) {
        return Math.max(0.0f, this.OooO00o.OooO00o(rectF) + this.OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000OO)) {
            return false;
        }
        o0000OO o0000oo = (o0000OO) obj;
        if (this.OooO00o.equals(o0000oo.OooO00o) && this.OooO0O0 == o0000oo.OooO0O0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO00o, Float.valueOf(this.OooO0O0)});
    }
}


