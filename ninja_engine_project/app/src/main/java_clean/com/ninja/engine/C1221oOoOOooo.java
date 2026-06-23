package com.ninja.engine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oOoOOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221oOoOOooo implements InterfaceC0305o0O0OoO0 {
    public final /* synthetic */ C1228oOoOo0O0 OooO00o;

    public C1221oOoOOooo(C1228oOoOo0O0 c1228oOoOo0O0) {
        this.OooO00o = c1228oOoOo0O0;
    }

    @Override // com.ninja.engine.InterfaceC0305o0O0OoO0
    public final void OooO00o(boolean z) {
        ArrayList arrayList;
        AbstractC1401oo00OOO0.OooO00o();
        synchronized (this.OooO00o) {
            arrayList = new ArrayList((HashSet) this.OooO00o.OooO0Oo);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0305o0O0OoO0) it.next()).OooO00o(z);
        }
    }
}


