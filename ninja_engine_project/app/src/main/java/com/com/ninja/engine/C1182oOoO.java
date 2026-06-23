package com.ninja.engine;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1182oOoO implements Iterable {
    public C1183oOoO0oo OooO00o;
    public C1183oOoO0oo OooO0O0;
    public final WeakHashMap OooO0OO = new WeakHashMap();
    public int OooO0Oo = 0;

    public C1183oOoO0oo OooO00o(Object obj) {
        C1183oOoO0oo c1183oOoO0oo = this.OooO00o;
        while (c1183oOoO0oo != null && !c1183oOoO0oo.OooO00o.equals(obj)) {
            c1183oOoO0oo = c1183oOoO0oo.OooO0OO;
        }
        return c1183oOoO0oo;
    }

    public Object OooO0O0(Object obj) {
        C1183oOoO0oo OooO00o = OooO00o(obj);
        if (OooO00o == null) {
            return null;
        }
        this.OooO0Oo--;
        WeakHashMap weakHashMap = this.OooO0OO;
        if (!weakHashMap.isEmpty()) {
            for (AbstractC1185oOoO0ooo abstractC1185oOoO0ooo : weakHashMap.keySet()) {
                abstractC1185oOoO0ooo.OooO00o(OooO00o);
            }
        }
        C1183oOoO0oo c1183oOoO0oo = OooO00o.OooO0Oo;
        C1183oOoO0oo c1183oOoO0oo2 = OooO00o.OooO0OO;
        if (c1183oOoO0oo != null) {
            c1183oOoO0oo.OooO0OO = c1183oOoO0oo2;
        } else {
            this.OooO00o = c1183oOoO0oo2;
        }
        C1183oOoO0oo c1183oOoO0oo3 = OooO00o.OooO0OO;
        if (c1183oOoO0oo3 != null) {
            c1183oOoO0oo3.OooO0Oo = c1183oOoO0oo;
        } else {
            this.OooO0O0 = c1183oOoO0oo;
        }
        OooO00o.OooO0OO = null;
        OooO00o.OooO0Oo = null;
        return OooO00o.OooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((com.ninja.engine.C1176oOo0O00o) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.ninja.engine.C1182oOoO
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.ninja.engine.oOoO r7 = (com.ninja.engine.C1182oOoO) r7
            int r1 = r6.OooO0Oo
            int r3 = r7.OooO0Oo
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            com.ninja.engine.oOo0O00o r3 = (com.ninja.engine.C1176oOo0O00o) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            com.ninja.engine.oOo0O00o r4 = (com.ninja.engine.C1176oOo0O00o) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            com.ninja.engine.oOo0O00o r7 = (com.ninja.engine.C1176oOo0O00o) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1182oOoO.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C1176oOo0O00o c1176oOo0O00o = (C1176oOo0O00o) it;
            if (c1176oOo0O00o.hasNext()) {
                i += ((Map.Entry) c1176oOo0O00o.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1176oOo0O00o c1176oOo0O00o = new C1176oOo0O00o(this.OooO00o, this.OooO0O0, 0);
        this.OooO0OO.put(c1176oOo0O00o, Boolean.FALSE);
        return c1176oOo0O00o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1176oOo0O00o c1176oOo0O00o = (C1176oOo0O00o) it;
            if (c1176oOo0O00o.hasNext()) {
                sb.append(((Map.Entry) c1176oOo0O00o.next()).toString());
                if (c1176oOo0O00o.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
