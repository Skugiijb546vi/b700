package com.ninja.engine;

import java.util.concurrent.Executor;
/* renamed from: com.ninja.engine.o0o000o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498o0o000o0 {
    public final InterfaceC1124oOOooO0O OooO00o;
    public final Executor OooO0O0;

    public C0498o0o000o0(InterfaceC1124oOOooO0O interfaceC1124oOOooO0O, Executor executor) {
        this.OooO00o = interfaceC1124oOOooO0O;
        this.OooO0O0 = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0498o0o000o0) {
            return this.OooO00o.equals(((C0498o0o000o0) obj).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }
}
