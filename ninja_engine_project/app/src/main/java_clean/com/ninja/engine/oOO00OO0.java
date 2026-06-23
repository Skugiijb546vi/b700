package com.ninja.engine;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class oOO00OO0 implements InterfaceC0346o0OO0o0, o0OO0o00 {
    public final List<InterfaceC0346o0OO0o0> OooO00o;
    public final oOOOO0O0 OooO0O0;
    public int OooO0OO;
    public EnumC1000oOOOO0oo OooO0Oo;
    public List OooO0o;
    public o0OO0o00 OooO0o0;
    public boolean OooO0oO;

    public oOO00OO0(ArrayList arrayList, oOOOO0O0 ooooo0o0) {
        this.OooO0O0 = ooooo0o0;
        if (!arrayList.isEmpty()) {
            this.OooO00o = arrayList;
            this.OooO0OO = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        return ((InterfaceC0346o0OO0o0) this.OooO00o.get(0)).OooO00o();
    }

    @Override // com.ninja.engine.o0OO0o00
    public final void OooO0O0(Exception exc) {
        List list = this.OooO0o;
        AbstractC0694o0ooooo0.OooOO0O(list, "Argument must not be null");
        list.add(exc);
        OooO0oO();
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0OO() {
        List list = this.OooO0o;
        if (list != null) {
            this.OooO0O0.OooO0OO(list);
        }
        this.OooO0o = null;
        for (InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0 : this.OooO00o) {
            interfaceC0346o0OO0o0.OooO0OO();
        }
    }

    @Override // com.ninja.engine.o0OO0o00
    public final void OooO0Oo(Object obj) {
        if (obj != null) {
            this.OooO0o0.OooO0Oo(obj);
        } else {
            OooO0oO();
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final int OooO0o() {
        return ((InterfaceC0346o0OO0o0) this.OooO00o.get(0)).OooO0o();
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0o0(EnumC1000oOOOO0oo enumC1000oOOOO0oo, o0OO0o00 o0oo0o00) {
        this.OooO0Oo = enumC1000oOOOO0oo;
        this.OooO0o0 = o0oo0o00;
        this.OooO0o = (List) this.OooO0O0.OooO();
        ((InterfaceC0346o0OO0o0) this.OooO00o.get(this.OooO0OO)).OooO0o0(enumC1000oOOOO0oo, this);
        if (this.OooO0oO) {
            cancel();
        }
    }

    public final void OooO0oO() {
        if (this.OooO0oO) {
            return;
        }
        if (this.OooO0OO < this.OooO00o.size() - 1) {
            this.OooO0OO++;
            OooO0o0(this.OooO0Oo, this.OooO0o0);
            return;
        }
        AbstractC0694o0ooooo0.OooOO0(this.OooO0o);
        this.OooO0o0.OooO0O0(new C0695o0oooooO("Fetch failed", new ArrayList(this.OooO0o)));
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void cancel() {
        this.OooO0oO = true;
        for (InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0 : this.OooO00o) {
            interfaceC0346o0OO0o0.cancel();
        }
    }
}


