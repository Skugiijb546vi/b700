package com.ninja.engine;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0OOo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0379o0OOo0O0 implements InterfaceC0376o0OOo00O {
    public final AbstractC1504oo0OOo00 OooO0Oo;
    public int OooO0o;
    public int OooO0oO;
    public AbstractC1504oo0OOo00 OooO00o = null;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public int OooO0o0 = 1;
    public int OooO0oo = 1;
    public C0392o0OOoOOO OooO = null;
    public boolean OooOO0 = false;
    public final ArrayList OooOO0O = new ArrayList();
    public final ArrayList OooOO0o = new ArrayList();

    public C0379o0OOo0O0(AbstractC1504oo0OOo00 abstractC1504oo0OOo00) {
        this.OooO0Oo = abstractC1504oo0OOo00;
    }

    @Override // com.ninja.engine.InterfaceC0376o0OOo00O
    public final void OooO00o(InterfaceC0376o0OOo00O interfaceC0376o0OOo00O) {
        ArrayList arrayList = this.OooOO0o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0379o0OOo0O0) it.next()).OooOO0) {
                return;
            }
        }
        this.OooO0OO = true;
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00 = this.OooO00o;
        if (abstractC1504oo0OOo00 != null) {
            abstractC1504oo0OOo00.OooO00o(this);
        }
        if (this.OooO0O0) {
            this.OooO0Oo.OooO00o(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0379o0OOo0O0 c0379o0OOo0O0 = null;
        int i = 0;
        while (it2.hasNext()) {
            C0379o0OOo0O0 c0379o0OOo0O02 = (C0379o0OOo0O0) it2.next();
            if (!(c0379o0OOo0O02 instanceof C0392o0OOoOOO)) {
                i++;
                c0379o0OOo0O0 = c0379o0OOo0O02;
            }
        }
        if (c0379o0OOo0O0 != null && i == 1 && c0379o0OOo0O0.OooOO0) {
            C0392o0OOoOOO c0392o0OOoOOO = this.OooO;
            if (c0392o0OOoOOO != null) {
                if (c0392o0OOoOOO.OooOO0) {
                    this.OooO0o = this.OooO0oo * c0392o0OOoOOO.OooO0oO;
                } else {
                    return;
                }
            }
            OooO0Oo(c0379o0OOo0O0.OooO0oO + this.OooO0o);
        }
        AbstractC1504oo0OOo00 abstractC1504oo0OOo002 = this.OooO00o;
        if (abstractC1504oo0OOo002 != null) {
            abstractC1504oo0OOo002.OooO00o(this);
        }
    }

    public final void OooO0O0(InterfaceC0376o0OOo00O interfaceC0376o0OOo00O) {
        this.OooOO0O.add(interfaceC0376o0OOo00O);
        if (this.OooOO0) {
            interfaceC0376o0OOo00O.OooO00o(interfaceC0376o0OOo00O);
        }
    }

    public final void OooO0OO() {
        this.OooOO0o.clear();
        this.OooOO0O.clear();
        this.OooOO0 = false;
        this.OooO0oO = 0;
        this.OooO0OO = false;
        this.OooO0O0 = false;
    }

    public void OooO0Oo(int i) {
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

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.OooO0Oo.OooO0O0.Oooooo);
        sb.append(":");
        sb.append(AbstractC1230oOoOo0o.OooOo00(this.OooO0o0));
        sb.append("(");
        if (this.OooOO0) {
            obj = Integer.valueOf(this.OooO0oO);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.OooOO0o.size());
        sb.append(":d=");
        sb.append(this.OooOO0O.size());
        sb.append(">");
        return sb.toString();
    }
}


