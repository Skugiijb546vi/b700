package com.ninja.engine;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: com.ninja.engine.o0OoooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486o0OoooOO implements Map, Serializable {
    public static final C0486o0OoooOO OooO00o = new C0486o0OoooOO();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        AbstractC0809oO0OooOO.OooOOOo((Void) obj, "value");
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return C0487o0OoooOo.OooO00o;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return C0487o0OoooOo.OooO00o;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C0484o0OoooO.OooO00o;
    }
}


