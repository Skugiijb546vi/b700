package com.ninja.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.ninja.engine.oOOoOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089oOOoOOO {
    public final C0415o0Oo0O0O OooO00o;
    public final o0o0000 OooO0O0;
    public final C1126oOOooOO OooO0OO;
    public final C0331o0O0oo OooO0Oo;
    public final o0o0000 OooO0o;
    public final o0OO0oO OooO0o0;
    public final o0o0000 OooO0oO;
    public final C0131o00O0o OooOO0;
    public final C0415o0Oo0O0O OooO0oo = new C0415o0Oo0O0O(27);
    public final C0793oO0Oo0o OooO = new C0793oO0Oo0o();

    public C1089oOOoOOO() {
        C0131o00O0o c0131o00O0o = new C0131o00O0o(new C0996oOOOO0Oo(20), new C0601o0oOooO0(11), new C0601o0oOooO0(12));
        this.OooOO0 = c0131o00O0o;
        this.OooO00o = new C0415o0Oo0O0O(c0131o00O0o);
        this.OooO0O0 = new o0o0000(0);
        this.OooO0OO = new C1126oOOooOO(0);
        this.OooO0Oo = new C0331o0O0oo(27);
        this.OooO0o0 = new o0OO0oO(0);
        this.OooO0o = new o0o0000(2);
        this.OooO0oO = new o0o0000(1);
        List<String> asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        C1126oOOooOO c1126oOOooOO = this.OooO0OO;
        synchronized (c1126oOOooOO) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) c1126oOOooOO.OooO0O0);
                ((ArrayList) c1126oOOooOO.OooO0O0).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ArrayList) c1126oOOooOO.OooO0O0).add((String) it.next());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!arrayList.contains(str2)) {
                        ((ArrayList) c1126oOOooOO.OooO0O0).add(str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO(o0OO0o o0oo0o) {
        o0OO0oO o0oo0oo = this.OooO0o0;
        synchronized (o0oo0oo) {
            o0oo0oo.OooO00o.put(o0oo0o.OooO00o(), o0oo0o);
        }
    }

    public final void OooO00o(Class cls, InterfaceC0488o0Ooooo interfaceC0488o0Ooooo) {
        o0o0000 o0o0000Var = this.OooO0O0;
        synchronized (o0o0000Var) {
            o0o0000Var.OooO00o.add(new C0490o0OooooO(cls, interfaceC0488o0Ooooo));
        }
    }

    public final void OooO0O0(Class cls, InterfaceC1128oOOooOOo interfaceC1128oOOooOOo) {
        C0331o0O0oo c0331o0O0oo = this.OooO0Oo;
        synchronized (c0331o0O0oo) {
            ((ArrayList) c0331o0O0oo.OooO0O0).add(new C1130oOOooOo0(cls, interfaceC1128oOOooOOo));
        }
    }

    public final void OooO0OO(Class cls, Class cls2, oOO000o ooo000o) {
        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO00o;
        synchronized (c0415o0Oo0O0O) {
            ((oOO00OOO) c0415o0Oo0O0O.OooO0O0).OooO0oO(cls, cls2, ooo000o);
            ((o0OO0oO) c0415o0Oo0O0O.OooO0OO).OooO00o.clear();
        }
    }

    public final void OooO0Oo(String str, Class cls, Class cls2, InterfaceC1125oOOooO0o interfaceC1125oOOooO0o) {
        C1126oOOooOO c1126oOOooOO = this.OooO0OO;
        synchronized (c1126oOOooOO) {
            c1126oOOooOO.OooO(str).add(new C1121oOOooO(cls, cls2, interfaceC1125oOOooO0o));
        }
    }

    public final ArrayList OooO0o() {
        ArrayList arrayList;
        o0o0000 o0o0000Var = this.OooO0oO;
        synchronized (o0o0000Var) {
            arrayList = o0o0000Var.OooO00o;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new RuntimeException("Failed to find image header parser.");
    }

    public final ArrayList OooO0o0(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.OooO0OO.OooOO0(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.OooO0o.OooO0O0(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                C1126oOOooOO c1126oOOooOO = this.OooO0OO;
                synchronized (c1126oOOooOO) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) c1126oOOooOO.OooO0O0).iterator();
                    while (it3.hasNext()) {
                        List<C1121oOOooO> list = (List) ((HashMap) c1126oOOooOO.OooO0OO).get((String) it3.next());
                        if (list != null) {
                            for (C1121oOOooO c1121oOOooO : list) {
                                if (c1121oOOooO.OooO00o.isAssignableFrom(cls) && cls4.isAssignableFrom(c1121oOOooO.OooO0O0)) {
                                    arrayList.add(c1121oOOooO.OooO0OO);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new C0354o0OOO0Oo(cls, cls4, cls5, arrayList, this.OooO0o.OooO00o(cls4, cls5), this.OooOO0));
            }
        }
        return arrayList2;
    }

    public final List OooO0oO(Object obj) {
        List list;
        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO00o;
        c0415o0Oo0O0O.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c0415o0Oo0O0O) {
            C0905oOO000oO c0905oOO000oO = (C0905oOO000oO) ((o0OO0oO) c0415o0Oo0O0O.OooO0OO).OooO00o.get(cls);
            if (c0905oOO000oO == null) {
                list = null;
            } else {
                list = c0905oOO000oO.OooO00o;
            }
            if (list == null) {
                list = Collections.unmodifiableList(((oOO00OOO) c0415o0Oo0O0O.OooO0O0).OooOO0o(cls));
                if (((C0905oOO000oO) ((o0OO0oO) c0415o0Oo0O0O.OooO0OO).OooO00o.put(cls, new C0905oOO000oO(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                InterfaceC0904oOO000o0 interfaceC0904oOO000o0 = (InterfaceC0904oOO000o0) list.get(i);
                if (interfaceC0904oOO000o0.OooO0O0(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i);
                        z = false;
                    }
                    emptyList.add(interfaceC0904oOO000o0);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new RuntimeException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
        throw new RuntimeException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public final o0OO0oO0 OooO0oo(Object obj) {
        o0OO0oO0 OooO0O0;
        o0OO0oO o0oo0oo = this.OooO0o0;
        synchronized (o0oo0oo) {
            try {
                AbstractC0694o0ooooo0.OooOO0(obj);
                o0OO0o o0oo0o = (o0OO0o) o0oo0oo.OooO00o.get(obj.getClass());
                if (o0oo0o == null) {
                    Iterator it = o0oo0oo.OooO00o.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        o0OO0o o0oo0o2 = (o0OO0o) it.next();
                        if (o0oo0o2.OooO00o().isAssignableFrom(obj.getClass())) {
                            o0oo0o = o0oo0o2;
                            break;
                        }
                    }
                }
                if (o0oo0o == null) {
                    o0oo0o = o0OO0oO.OooO0O0;
                }
                OooO0O0 = o0oo0o.OooO0O0(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return OooO0O0;
    }

    public final void OooOO0(oO00Oo00 oo00oo00) {
        o0o0000 o0o0000Var = this.OooO0oO;
        synchronized (o0o0000Var) {
            o0o0000Var.OooO00o.add(oo00oo00);
        }
    }

    public final void OooOO0O(Class cls, Class cls2, InterfaceC1134oOOooo0 interfaceC1134oOOooo0) {
        o0o0000 o0o0000Var = this.OooO0o;
        synchronized (o0o0000Var) {
            o0o0000Var.OooO00o.add(new C1350oo00000(cls, cls2, interfaceC1134oOOooo0));
        }
    }
}
