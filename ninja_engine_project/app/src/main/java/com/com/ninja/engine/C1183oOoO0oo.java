package com.ninja.engine;

import java.util.Map;
/* renamed from: com.ninja.engine.oOoO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183oOoO0oo implements Map.Entry {
    public final Object OooO00o;
    public final Object OooO0O0;
    public C1183oOoO0oo OooO0OO;
    public C1183oOoO0oo OooO0Oo;

    public C1183oOoO0oo(Object obj, Object obj2) {
        this.OooO00o = obj;
        this.OooO0O0 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1183oOoO0oo)) {
            return false;
        }
        C1183oOoO0oo c1183oOoO0oo = (C1183oOoO0oo) obj;
        if (this.OooO00o.equals(c1183oOoO0oo.OooO00o) && this.OooO0O0.equals(c1183oOoO0oo.OooO0O0)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.OooO00o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.OooO0O0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.OooO00o.hashCode() ^ this.OooO0O0.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.OooO00o + "=" + this.OooO0O0;
    }
}
