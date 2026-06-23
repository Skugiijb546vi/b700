package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oo0OO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0623o0oo0OO0 extends AbstractC0621o0oo0O0o {
    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO(Object obj, Object obj2, ArrayList arrayList) {
        ((AbstractC1358oo0000o0) obj).OooO00o(new C0618o0oo0O(this, obj2, arrayList));
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO00o(View view, Object obj) {
        ((AbstractC1358oo0000o0) obj).OooO0O0(view);
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO0O0(Object obj, ArrayList arrayList) {
        AbstractC1358oo0000o0 abstractC1358oo0000o0;
        AbstractC1358oo0000o0 abstractC1358oo0000o02 = (AbstractC1358oo0000o0) obj;
        if (abstractC1358oo0000o02 == null) {
            return;
        }
        int i = 0;
        if (abstractC1358oo0000o02 instanceof C1363oo000O0O) {
            C1363oo000O0O c1363oo000O0O = (C1363oo000O0O) abstractC1358oo0000o02;
            int size = c1363oo000O0O.OooOoOO.size();
            while (i < size) {
                if (i >= 0 && i < c1363oo000O0O.OooOoOO.size()) {
                    abstractC1358oo0000o0 = (AbstractC1358oo0000o0) c1363oo000O0O.OooOoOO.get(i);
                } else {
                    abstractC1358oo0000o0 = null;
                }
                OooO0O0(abstractC1358oo0000o0, arrayList);
                i++;
            }
        } else if (AbstractC0621o0oo0O0o.OooO0o0(abstractC1358oo0000o02.OooO0o0) && AbstractC0621o0oo0O0o.OooO0o0(null) && AbstractC0621o0oo0O0o.OooO0o0(null) && AbstractC0621o0oo0O0o.OooO0o0(abstractC1358oo0000o02.OooO0o)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC1358oo0000o02.OooO0O0((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO0OO(ViewGroup viewGroup, Object obj) {
        AbstractC1349oo000.OooO00o(viewGroup, (AbstractC1358oo0000o0) obj);
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final Object OooO0Oo() {
        return null;
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final Object OooO0o(Object obj, Object obj2) {
        AbstractC1358oo0000o0 abstractC1358oo0000o0 = (AbstractC1358oo0000o0) obj;
        AbstractC1358oo0000o0 abstractC1358oo0000o02 = (AbstractC1358oo0000o0) obj2;
        if (abstractC1358oo0000o0 != null && abstractC1358oo0000o02 != null) {
            C1363oo000O0O c1363oo000O0O = new C1363oo000O0O();
            c1363oo000O0O.Oooo0OO(abstractC1358oo0000o0);
            c1363oo000O0O.Oooo0OO(abstractC1358oo0000o02);
            c1363oo000O0O.Oooo0oO(1);
            return c1363oo000O0O;
        } else if (abstractC1358oo0000o0 == null) {
            if (abstractC1358oo0000o02 != null) {
                return abstractC1358oo0000o02;
            }
            return null;
        } else {
            return abstractC1358oo0000o0;
        }
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final Object OooO0oO(Object obj, Object obj2) {
        C1363oo000O0O c1363oo000O0O = new C1363oo000O0O();
        if (obj != null) {
            c1363oo000O0O.Oooo0OO((AbstractC1358oo0000o0) obj);
        }
        c1363oo000O0O.Oooo0OO((AbstractC1358oo0000o0) obj2);
        return c1363oo000O0O;
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO0oo(Object obj, View view, ArrayList arrayList) {
        ((AbstractC1358oo0000o0) obj).OooO00o(new C0629o0oo0o(view, arrayList));
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooOO0(Object obj) {
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooOO0O(ArrayList arrayList, ArrayList arrayList2) {
    }

    public final void OooOO0o(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        AbstractC1358oo0000o0 abstractC1358oo0000o0;
        AbstractC1358oo0000o0 abstractC1358oo0000o02 = (AbstractC1358oo0000o0) obj;
        int i = 0;
        if (abstractC1358oo0000o02 instanceof C1363oo000O0O) {
            C1363oo000O0O c1363oo000O0O = (C1363oo000O0O) abstractC1358oo0000o02;
            int size2 = c1363oo000O0O.OooOoOO.size();
            while (i < size2) {
                if (i >= 0 && i < c1363oo000O0O.OooOoOO.size()) {
                    abstractC1358oo0000o0 = (AbstractC1358oo0000o0) c1363oo000O0O.OooOoOO.get(i);
                } else {
                    abstractC1358oo0000o0 = null;
                }
                OooOO0o(abstractC1358oo0000o0, arrayList, arrayList2);
                i++;
            }
        } else if (AbstractC0621o0oo0O0o.OooO0o0(abstractC1358oo0000o02.OooO0o0) && AbstractC0621o0oo0O0o.OooO0o0(null) && AbstractC0621o0oo0O0o.OooO0o0(null)) {
            ArrayList arrayList3 = abstractC1358oo0000o02.OooO0o;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    abstractC1358oo0000o02.OooO0O0((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC1358oo0000o02.OooOoO((View) arrayList.get(size3));
                }
            }
        }
    }
}


