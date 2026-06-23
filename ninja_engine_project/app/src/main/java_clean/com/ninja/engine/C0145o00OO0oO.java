package com.ninja.engine;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: com.ninja.engine.o00OO0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0145o00OO0oO extends C1218oOoOOoo implements Map {
    public o00OO0O0 OooO0Oo;
    public C0143o00OO0o OooO0o;
    public o00OO0OO OooO0o0;

    public C0145o00OO0oO(C0145o00OO0oO c0145o00OO0oO) {
        super(0);
        if (c0145o00OO0oO != null) {
            OooO0oO(c0145o00OO0oO);
        }
    }

    public final boolean OooOO0O(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooOO0o(Collection collection) {
        int i = this.OooO0OO;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i != this.OooO0OO) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.C1218oOoOOoo, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.ninja.engine.C1218oOoOOoo, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        o00OO0O0 o00oo0o0 = this.OooO0Oo;
        if (o00oo0o0 == null) {
            o00OO0O0 o00oo0o02 = new o00OO0O0(this);
            this.OooO0Oo = o00oo0o02;
            return o00oo0o02;
        }
        return o00oo0o0;
    }

    @Override // com.ninja.engine.C1218oOoOOoo, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public final Set keySet() {
        o00OO0OO o00oo0oo = this.OooO0o0;
        if (o00oo0oo == null) {
            o00OO0OO o00oo0oo2 = new o00OO0OO(this);
            this.OooO0o0 = o00oo0oo2;
            return o00oo0oo2;
        }
        return o00oo0oo;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        OooO0O0(map.size() + this.OooO0OO);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.ninja.engine.C1218oOoOOoo, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public final Collection values() {
        C0143o00OO0o c0143o00OO0o = this.OooO0o;
        if (c0143o00OO0o == null) {
            C0143o00OO0o c0143o00OO0o2 = new C0143o00OO0o(this);
            this.OooO0o = c0143o00OO0o2;
            return c0143o00OO0o2;
        }
        return c0143o00OO0o;
    }
}


