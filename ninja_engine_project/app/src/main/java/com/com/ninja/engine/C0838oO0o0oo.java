package com.ninja.engine;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oO0o0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0838oO0o0oo {
    public final LinkedHashMap OooO00o = new LinkedHashMap(100, 0.75f, true);
    public final long OooO0O0;
    public long OooO0OO;

    public C0838oO0o0oo(long j) {
        this.OooO0O0 = j;
    }

    public final synchronized Object OooO00o(Object obj) {
        Object obj2;
        C0837oO0o0oOo c0837oO0o0oOo = (C0837oO0o0oOo) this.OooO00o.get(obj);
        if (c0837oO0o0oOo != null) {
            obj2 = c0837oO0o0oOo.OooO00o;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int OooO0O0(Object obj) {
        return 1;
    }

    public final synchronized Object OooO0Oo(Object obj, Object obj2) {
        C0837oO0o0oOo c0837oO0o0oOo;
        int OooO0O0 = OooO0O0(obj2);
        long j = OooO0O0;
        Object obj3 = null;
        if (j >= this.OooO0O0) {
            OooO0OO(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.OooO0OO += j;
        }
        LinkedHashMap linkedHashMap = this.OooO00o;
        if (obj2 == null) {
            c0837oO0o0oOo = null;
        } else {
            c0837oO0o0oOo = new C0837oO0o0oOo(OooO0O0, obj2);
        }
        C0837oO0o0oOo c0837oO0o0oOo2 = (C0837oO0o0oOo) linkedHashMap.put(obj, c0837oO0o0oOo);
        if (c0837oO0o0oOo2 != null) {
            this.OooO0OO -= c0837oO0o0oOo2.OooO0O0;
            if (!c0837oO0o0oOo2.OooO00o.equals(obj2)) {
                OooO0OO(obj, c0837oO0o0oOo2.OooO00o);
            }
        }
        OooO0o0(this.OooO0O0);
        if (c0837oO0o0oOo2 != null) {
            obj3 = c0837oO0o0oOo2.OooO00o;
        }
        return obj3;
    }

    public final synchronized void OooO0o0(long j) {
        while (this.OooO0OO > j) {
            Iterator it = this.OooO00o.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C0837oO0o0oOo c0837oO0o0oOo = (C0837oO0o0oOo) entry.getValue();
            this.OooO0OO -= c0837oO0o0oOo.OooO0O0;
            Object key = entry.getKey();
            it.remove();
            OooO0OO(key, c0837oO0o0oOo.OooO00o);
        }
    }

    public void OooO0OO(Object obj, Object obj2) {
    }
}
