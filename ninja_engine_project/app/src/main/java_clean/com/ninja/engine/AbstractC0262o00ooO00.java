package com.ninja.engine;

import java.io.Serializable;
/* renamed from: com.ninja.engine.o00ooO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0262o00ooO00 implements InterfaceC0810oO0OooOo, Serializable {
    public transient InterfaceC0810oO0OooOo OooO00o;
    public final Object OooO0O0;
    public final Class OooO0OO;
    public final String OooO0Oo;
    public final boolean OooO0o;
    public final String OooO0o0;

    public AbstractC0262o00ooO00(Object obj, Class cls, String str, String str2, boolean z) {
        this.OooO0O0 = obj;
        this.OooO0OO = cls;
        this.OooO0Oo = str;
        this.OooO0o0 = str2;
        this.OooO0o = z;
    }

    public abstract InterfaceC0810oO0OooOo OooO0OO();

    public final o0O00O OooO0Oo() {
        o0O00O o0o00oo;
        Class cls = this.OooO0OO;
        if (cls == null) {
            return null;
        }
        if (this.OooO0o) {
            AbstractC1079oOOoO.OooO00o.getClass();
            o0o00oo = new C0985oOOO0o0o(cls);
        } else {
            AbstractC1079oOOoO.OooO00o.getClass();
            o0o00oo = new o0O00OO(cls);
        }
        return o0o00oo;
    }
}


