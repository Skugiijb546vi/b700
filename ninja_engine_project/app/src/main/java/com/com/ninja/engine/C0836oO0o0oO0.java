package com.ninja.engine;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
/* renamed from: com.ninja.engine.oO0o0oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836oO0o0oO0 {
    public final C0415o0Oo0O0O OooO00o = new C0415o0Oo0O0O(21);
    public final C0834oO0o0o0o OooO0O0 = new C0834oO0o0o0o(0);
    public final HashMap OooO0OO = new HashMap();
    public final HashMap OooO0Oo = new HashMap();
    public int OooO0o;
    public final int OooO0o0;

    public C0836oO0o0oO0(int i) {
        this.OooO0o0 = i;
    }

    public final synchronized void OooO(int i) {
        try {
            if (i >= 40) {
                OooO00o();
            } else if (i >= 20 || i == 15) {
                OooO0OO(this.OooO0o0 / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO00o() {
        OooO0OO(0);
    }

    public final void OooO0O0(int i, Class cls) {
        NavigableMap OooO0oO = OooO0oO(cls);
        Integer num = (Integer) OooO0oO.get(Integer.valueOf(i));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i);
            if (intValue == 1) {
                OooO0oO.remove(valueOf);
                return;
            } else {
                OooO0oO.put(valueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void OooO0OO(int i) {
        while (this.OooO0o > i) {
            Object Oooo0oO = this.OooO00o.Oooo0oO();
            AbstractC0694o0ooooo0.OooOO0(Oooo0oO);
            C0567o0oOOo OooO0o0 = OooO0o0(Oooo0oO.getClass());
            this.OooO0o -= OooO0o0.OooO0O0() * OooO0o0.OooO00o(Oooo0oO);
            OooO0O0(OooO0o0.OooO00o(Oooo0oO), Oooo0oO.getClass());
            if (Log.isLoggable(OooO0o0.OooO0OO(), 2)) {
                OooO0o0.OooO00o(Oooo0oO);
            }
        }
    }

    public final synchronized Object OooO0Oo(int i, Class cls) {
        C0833oO0o0o0O c0833oO0o0o0O;
        int i2;
        try {
            Integer num = (Integer) OooO0oO(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.OooO0o) != 0 && this.OooO0o0 / i2 < 2 && num.intValue() > i * 8)) {
                C0834oO0o0o0o c0834oO0o0o0o = this.OooO0O0;
                InterfaceC0994oOOOO00o interfaceC0994oOOOO00o = (InterfaceC0994oOOOO00o) ((ArrayDeque) c0834oO0o0o0o.OooO00o).poll();
                if (interfaceC0994oOOOO00o == null) {
                    interfaceC0994oOOOO00o = c0834oO0o0o0o.OooO0O0();
                }
                c0833oO0o0o0O = (C0833oO0o0o0O) interfaceC0994oOOOO00o;
                c0833oO0o0o0O.OooO0O0 = i;
                c0833oO0o0o0O.OooO0OO = cls;
            }
            C0834oO0o0o0o c0834oO0o0o0o2 = this.OooO0O0;
            int intValue = num.intValue();
            InterfaceC0994oOOOO00o interfaceC0994oOOOO00o2 = (InterfaceC0994oOOOO00o) ((ArrayDeque) c0834oO0o0o0o2.OooO00o).poll();
            if (interfaceC0994oOOOO00o2 == null) {
                interfaceC0994oOOOO00o2 = c0834oO0o0o0o2.OooO0O0();
            }
            c0833oO0o0o0O = (C0833oO0o0o0O) interfaceC0994oOOOO00o2;
            c0833oO0o0o0O.OooO0O0 = intValue;
            c0833oO0o0o0O.OooO0OO = cls;
        } catch (Throwable th) {
            throw th;
        }
        return OooO0o(c0833oO0o0o0O, cls);
    }

    public final Object OooO0o(C0833oO0o0o0O c0833oO0o0o0O, Class cls) {
        C0567o0oOOo OooO0o0 = OooO0o0(cls);
        Object OooOoO = this.OooO00o.OooOoO(c0833oO0o0o0O);
        if (OooOoO != null) {
            this.OooO0o -= OooO0o0.OooO0O0() * OooO0o0.OooO00o(OooOoO);
            OooO0O0(OooO0o0.OooO00o(OooOoO), cls);
        }
        if (OooOoO == null) {
            Log.isLoggable(OooO0o0.OooO0OO(), 2);
            return OooO0o0.OooO0Oo(c0833oO0o0o0O.OooO0O0);
        }
        return OooOoO;
    }

    public final C0567o0oOOo OooO0o0(Class cls) {
        HashMap hashMap = this.OooO0Oo;
        C0567o0oOOo c0567o0oOOo = (C0567o0oOOo) hashMap.get(cls);
        if (c0567o0oOOo == null) {
            if (cls.equals(int[].class)) {
                c0567o0oOOo = new C0567o0oOOo(1);
            } else if (cls.equals(byte[].class)) {
                c0567o0oOOo = new C0567o0oOOo(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, c0567o0oOOo);
        }
        return c0567o0oOOo;
    }

    public final NavigableMap OooO0oO(Class cls) {
        HashMap hashMap = this.OooO0OO;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final synchronized void OooO0oo(Object obj) {
        Class<?> cls = obj.getClass();
        C0567o0oOOo OooO0o0 = OooO0o0(cls);
        int OooO00o = OooO0o0.OooO00o(obj);
        int OooO0O0 = OooO0o0.OooO0O0() * OooO00o;
        if (OooO0O0 <= this.OooO0o0 / 2) {
            C0834oO0o0o0o c0834oO0o0o0o = this.OooO0O0;
            InterfaceC0994oOOOO00o interfaceC0994oOOOO00o = (InterfaceC0994oOOOO00o) ((ArrayDeque) c0834oO0o0o0o.OooO00o).poll();
            if (interfaceC0994oOOOO00o == null) {
                interfaceC0994oOOOO00o = c0834oO0o0o0o.OooO0O0();
            }
            C0833oO0o0o0O c0833oO0o0o0O = (C0833oO0o0o0O) interfaceC0994oOOOO00o;
            c0833oO0o0o0O.OooO0O0 = OooO00o;
            c0833oO0o0o0O.OooO0OO = cls;
            this.OooO00o.Oooo0OO(c0833oO0o0o0O, obj);
            NavigableMap OooO0oO = OooO0oO(cls);
            Integer num = (Integer) OooO0oO.get(Integer.valueOf(c0833oO0o0o0O.OooO0O0));
            Integer valueOf = Integer.valueOf(c0833oO0o0o0O.OooO0O0);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            OooO0oO.put(valueOf, Integer.valueOf(i));
            this.OooO0o += OooO0O0;
            OooO0OO(this.OooO0o0);
        }
    }
}
