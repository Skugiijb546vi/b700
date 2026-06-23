package com.ninja.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oO0oO0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0850oO0oO0oO extends AbstractC0809oO0OooOO {
    public static final void o000000(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0987oOOO0oO0 c0987oOOO0oO0 = (C0987oOOO0oO0) it.next();
            linkedHashMap.put(c0987oOOO0oO0.OooO00o, c0987oOOO0oO0.OooO0O0);
        }
    }

    public static Map o000OOo(ArrayList arrayList) {
        C0486o0OoooOO c0486o0OoooOO = C0486o0OoooOO.OooO00o;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(o0O0O00(arrayList.size()));
                o000000(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            C0987oOOO0oO0 c0987oOOO0oO0 = (C0987oOOO0oO0) arrayList.get(0);
            AbstractC0809oO0OooOO.OooOOOo(c0987oOOO0oO0, "pair");
            Map singletonMap = Collections.singletonMap(c0987oOOO0oO0.OooO00o, c0987oOOO0oO0.OooO0O0);
            AbstractC0809oO0OooOO.OooOOOO(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        return c0486o0OoooOO;
    }

    public static int o0O0O00(int i) {
        if (i >= 0) {
            if (i < 3) {
                return i + 1;
            }
            if (i < 1073741824) {
                return (int) ((i / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }
}


