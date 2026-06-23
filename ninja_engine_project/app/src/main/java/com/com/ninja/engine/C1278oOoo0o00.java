package com.ninja.engine;

import java.io.Serializable;
/* renamed from: com.ninja.engine.oOoo0o00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278oOoo0o00 implements Serializable {
    public InterfaceC0625o0oo0OOo OooO00o;
    public volatile Object OooO0O0 = C0455o0OoOo00.OooO0Oo;
    public final Object OooO0OO = this;

    public C1278oOoo0o00(InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo) {
        this.OooO00o = interfaceC0625o0oo0OOo;
    }

    public final Object OooO00o() {
        Object obj;
        Object obj2 = this.OooO0O0;
        C0455o0OoOo00 c0455o0OoOo00 = C0455o0OoOo00.OooO0Oo;
        if (obj2 != c0455o0OoOo00) {
            return obj2;
        }
        synchronized (this.OooO0OO) {
            obj = this.OooO0O0;
            if (obj == c0455o0OoOo00) {
                InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo = this.OooO00o;
                AbstractC0809oO0OooOO.OooOO0o(interfaceC0625o0oo0OOo);
                obj = interfaceC0625o0oo0OOo.OooO00o();
                this.OooO0O0 = obj;
                this.OooO00o = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.OooO0O0 != C0455o0OoOo00.OooO0Oo) {
            return String.valueOf(OooO00o());
        }
        return "Lazy value not initialized yet.";
    }
}
