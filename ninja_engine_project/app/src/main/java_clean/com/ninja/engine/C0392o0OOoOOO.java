package com.ninja.engine;

import java.util.Iterator;
/* renamed from: com.ninja.engine.o0OOoOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0392o0OOoOOO extends C0379o0OOo0O0 {
    public int OooOOO0;

    public C0392o0OOoOOO(AbstractC1504oo0OOo00 abstractC1504oo0OOo00) {
        super(abstractC1504oo0OOo00);
        int i;
        if (abstractC1504oo0OOo00 instanceof C0758oO0O0OoO) {
            i = 2;
        } else {
            i = 3;
        }
        this.OooO0o0 = i;
    }

    @Override // com.ninja.engine.C0379o0OOo0O0
    public final void OooO0Oo(int i) {
        if (this.OooOO0) {
            return;
        }
        this.OooOO0 = true;
        this.OooO0oO = i;
        Iterator it = this.OooOO0O.iterator();
        while (it.hasNext()) {
            InterfaceC0376o0OOo00O interfaceC0376o0OOo00O = (InterfaceC0376o0OOo00O) it.next();
            interfaceC0376o0OOo00O.OooO00o(interfaceC0376o0OOo00O);
        }
    }
}


