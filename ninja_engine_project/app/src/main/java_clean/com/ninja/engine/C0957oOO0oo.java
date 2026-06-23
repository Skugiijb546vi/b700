package com.ninja.engine;
/* renamed from: com.ninja.engine.oOO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957oOO0oo implements InterfaceC0266o00ooOO0 {
    public final AbstractC0955oOO0oOoO OooO00o;
    public final /* synthetic */ androidx.activity.OooO0O0 OooO0O0;

    public C0957oOO0oo(androidx.activity.OooO0O0 oooO0O0, AbstractC0955oOO0oOoO abstractC0955oOO0oOoO) {
        this.OooO0O0 = oooO0O0;
        this.OooO00o = abstractC0955oOO0oOoO;
    }

    @Override // com.ninja.engine.InterfaceC0266o00ooOO0
    public final void cancel() {
        androidx.activity.OooO0O0 oooO0O0 = this.OooO0O0;
        C0142o00OO00o c0142o00OO00o = oooO0O0.OooO0O0;
        AbstractC0955oOO0oOoO abstractC0955oOO0oOoO = this.OooO00o;
        c0142o00OO00o.remove(abstractC0955oOO0oOoO);
        if (AbstractC0809oO0OooOO.OooO0o0(oooO0O0.OooO0OO, abstractC0955oOO0oOoO)) {
            abstractC0955oOO0oOoO.getClass();
            oooO0O0.OooO0OO = null;
        }
        abstractC0955oOO0oOoO.getClass();
        abstractC0955oOO0oOoO.OooO0O0.remove(this);
        InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo = abstractC0955oOO0oOoO.OooO0OO;
        if (interfaceC0625o0oo0OOo != null) {
            interfaceC0625o0oo0OOo.OooO00o();
        }
        abstractC0955oOO0oOoO.OooO0OO = null;
    }
}


