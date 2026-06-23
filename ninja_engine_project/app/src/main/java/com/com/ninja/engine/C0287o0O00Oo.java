package com.ninja.engine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.ninja.engine.o0O00Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287o0O00Oo {
    public final HashMap OooO00o = new HashMap();
    public final Map OooO0O0;

    public C0287o0O00Oo(HashMap hashMap) {
        this.OooO0O0 = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            oO0O0O0o oo0o0o0o = (oO0O0O0o) entry.getValue();
            List list = (List) this.OooO00o.get(oo0o0o0o);
            if (list == null) {
                list = new ArrayList();
                this.OooO00o.put(oo0o0o0o, list);
            }
            list.add((C0562o0oO0Ooo) entry.getKey());
        }
    }

    public static void OooO00o(List list, InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0562o0oO0Ooo c0562o0oO0Ooo = (C0562o0oO0Ooo) list.get(size);
                c0562o0oO0Ooo.getClass();
                try {
                    int i = c0562o0oO0Ooo.OooO00o;
                    Method method = c0562o0oO0Ooo.OooO0O0;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(obj, interfaceC0760oO0O0o0O, oo0o0o0o);
                            }
                        } else {
                            method.invoke(obj, interfaceC0760oO0O0o0O);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
