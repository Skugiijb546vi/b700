package com.ninja.engine;

import java.util.HashMap;
/* renamed from: com.ninja.engine.o0o0O0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536o0o0O0oO extends C1182oOoO {
    public final HashMap OooO0o0 = new HashMap();

    @Override // com.ninja.engine.C1182oOoO
    public final C1183oOoO0oo OooO00o(Object obj) {
        return (C1183oOoO0oo) this.OooO0o0.get(obj);
    }

    @Override // com.ninja.engine.C1182oOoO
    public final Object OooO0O0(Object obj) {
        Object OooO0O0 = super.OooO0O0(obj);
        this.OooO0o0.remove(obj);
        return OooO0O0;
    }

    public final Object OooO0OO(Object obj, Object obj2) {
        C1183oOoO0oo OooO00o = OooO00o(obj);
        if (OooO00o != null) {
            return OooO00o.OooO0O0;
        }
        HashMap hashMap = this.OooO0o0;
        C1183oOoO0oo c1183oOoO0oo = new C1183oOoO0oo(obj, obj2);
        this.OooO0Oo++;
        C1183oOoO0oo c1183oOoO0oo2 = this.OooO0O0;
        if (c1183oOoO0oo2 == null) {
            this.OooO00o = c1183oOoO0oo;
        } else {
            c1183oOoO0oo2.OooO0OO = c1183oOoO0oo;
            c1183oOoO0oo.OooO0Oo = c1183oOoO0oo2;
        }
        this.OooO0O0 = c1183oOoO0oo;
        hashMap.put(obj, c1183oOoO0oo);
        return null;
    }
}


