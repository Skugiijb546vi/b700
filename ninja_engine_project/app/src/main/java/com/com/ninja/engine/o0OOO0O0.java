package com.ninja.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class o0OOO0O0 {
    public C0973oOOO00o OooO;
    public final ArrayList OooO00o = new ArrayList();
    public final ArrayList OooO0O0 = new ArrayList();
    public C1932ooo0Oo0 OooO0OO;
    public Object OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public Class OooO0oO;
    public C0325o0O0oOO0 OooO0oo;
    public Map OooOO0;
    public Class OooOO0O;
    public boolean OooOO0o;
    public InterfaceC0745oO00oOo OooOOO;
    public boolean OooOOO0;
    public EnumC1000oOOOO0oo OooOOOO;
    public C0395o0OOoo OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;

    public final ArrayList OooO00o() {
        boolean z = this.OooOOO0;
        ArrayList arrayList = this.OooO0O0;
        if (!z) {
            this.OooOOO0 = true;
            arrayList.clear();
            ArrayList OooO0O0 = OooO0O0();
            int size = OooO0O0.size();
            for (int i = 0; i < size; i++) {
                C0903oOO000Oo c0903oOO000Oo = (C0903oOO000Oo) OooO0O0.get(i);
                if (!arrayList.contains(c0903oOO000Oo.OooO00o)) {
                    arrayList.add(c0903oOO000Oo.OooO00o);
                }
                int i2 = 0;
                while (true) {
                    List list = c0903oOO000Oo.OooO0O0;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList OooO0O0() {
        boolean z = this.OooOO0o;
        ArrayList arrayList = this.OooO00o;
        if (!z) {
            this.OooOO0o = true;
            arrayList.clear();
            List OooO0oO = this.OooO0OO.OooO0O0().OooO0oO(this.OooO0Oo);
            int size = OooO0oO.size();
            for (int i = 0; i < size; i++) {
                C0903oOO000Oo OooO00o = ((InterfaceC0904oOO000o0) OooO0oO.get(i)).OooO00o(this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO);
                if (OooO00o != null) {
                    arrayList.add(OooO00o);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final oO0Oo0o0 OooO0OO(Class cls) {
        oO0Oo0o0 oo0oo0o0;
        C1089oOOoOOO OooO0O0 = this.OooO0OO.OooO0O0();
        Class cls2 = this.OooO0oO;
        Class cls3 = this.OooOO0O;
        C0793oO0Oo0o c0793oO0Oo0o = OooO0O0.OooO;
        oO0Oo0o0 oo0oo0o02 = null;
        C0907oOO00O0o c0907oOO00O0o = (C0907oOO00O0o) c0793oO0Oo0o.OooO0O0.getAndSet(null);
        C0907oOO00O0o c0907oOO00O0o2 = c0907oOO00O0o;
        if (c0907oOO00O0o == null) {
            c0907oOO00O0o2 = new Object();
        }
        c0907oOO00O0o2.OooO00o = cls;
        c0907oOO00O0o2.OooO0O0 = cls2;
        c0907oOO00O0o2.OooO0OO = cls3;
        synchronized (c0793oO0Oo0o.OooO00o) {
            oo0oo0o0 = (oO0Oo0o0) c0793oO0Oo0o.OooO00o.get(c0907oOO00O0o2);
        }
        c0793oO0Oo0o.OooO0O0.set(c0907oOO00O0o2);
        OooO0O0.OooO.getClass();
        if (C0793oO0Oo0o.OooO0OO.equals(oo0oo0o0)) {
            return null;
        }
        if (oo0oo0o0 == null) {
            ArrayList OooO0o0 = OooO0O0.OooO0o0(cls, cls2, cls3);
            if (!OooO0o0.isEmpty()) {
                oo0oo0o02 = new oO0Oo0o0(cls, cls2, cls3, OooO0o0, OooO0O0.OooOO0);
            }
            OooO0O0.OooO.OooO00o(cls, cls2, cls3, oo0oo0o02);
            return oo0oo0o02;
        }
        return oo0oo0o0;
    }

    public final List OooO0Oo() {
        List list;
        C1089oOOoOOO OooO0O0 = this.OooO0OO.OooO0O0();
        Class<?> cls = this.OooO0Oo.getClass();
        Class cls2 = this.OooO0oO;
        Class cls3 = this.OooOO0O;
        C0415o0Oo0O0O c0415o0Oo0O0O = OooO0O0.OooO0oo;
        C0907oOO00O0o c0907oOO00O0o = (C0907oOO00O0o) ((AtomicReference) c0415o0Oo0O0O.OooO0O0).getAndSet(null);
        if (c0907oOO00O0o == null) {
            c0907oOO00O0o = new C0907oOO00O0o(cls, cls2, cls3);
        } else {
            c0907oOO00O0o.OooO00o = cls;
            c0907oOO00O0o.OooO0O0 = cls2;
            c0907oOO00O0o.OooO0OO = cls3;
        }
        synchronized (((C0145o00OO0oO) c0415o0Oo0O0O.OooO0OO)) {
            list = (List) ((C0145o00OO0oO) c0415o0Oo0O0O.OooO0OO).get(c0907oOO00O0o);
        }
        ((AtomicReference) c0415o0Oo0O0O.OooO0O0).set(c0907oOO00O0o);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = OooO0O0.OooO00o.OooOoOO(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = OooO0O0.OooO0OO.OooOO0((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!OooO0O0.OooO0o.OooO0O0(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            OooO0O0.OooO0oo.Oooo0o0(cls, cls2, cls3, Collections.unmodifiableList(arrayList2));
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final InterfaceC1351oo00000O OooO0o(Class cls) {
        InterfaceC1351oo00000O interfaceC1351oo00000O = (InterfaceC1351oo00000O) this.OooOO0.get(cls);
        if (interfaceC1351oo00000O == null) {
            Iterator it = this.OooOO0.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC1351oo00000O = (InterfaceC1351oo00000O) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC1351oo00000O == null) {
            if (this.OooOO0.isEmpty() && this.OooOOo0) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return C1392oo00O0o0.OooO0O0;
        }
        return interfaceC1351oo00000O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        r1 = r3.OooO0O0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ninja.engine.InterfaceC0488o0Ooooo OooO0o0(java.lang.Object r6) {
        /*
            r5 = this;
            com.ninja.engine.ooo0Oo0 r0 = r5.OooO0OO
            com.ninja.engine.oOOoOOO r0 = r0.OooO0O0()
            com.ninja.engine.o0o0000 r0 = r0.OooO0O0
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.OooO00o     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            com.ninja.engine.o0OooooO r3 = (com.ninja.engine.C0490o0OooooO) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.OooO00o     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            com.ninja.engine.o0Ooooo r1 = r3.OooO0O0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L4a
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            com.ninja.engine.oOOoOO0O r0 = new com.ninja.engine.oOOoOO0O
            java.lang.Class r6 = r6.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find source encoder for data class: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L4a:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0OOO0O0.OooO0o0(java.lang.Object):com.ninja.engine.o0Ooooo");
    }
}
