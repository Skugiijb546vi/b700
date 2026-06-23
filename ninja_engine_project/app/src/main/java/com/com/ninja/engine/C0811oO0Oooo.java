package com.ninja.engine;
/* renamed from: com.ninja.engine.oO0Oooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811oO0Oooo implements InterfaceC1108oOOoo, InterfaceC0532o0o0O0O0 {
    public static final C0131o00O0o OooO0o0 = AbstractC0694o0ooooo0.OoooO(20, new C0601o0oOooO0(27));
    public final C1251oOoOoooo OooO00o = new Object();
    public InterfaceC1108oOOoo OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final int OooO00o() {
        return this.OooO0O0.OooO00o();
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Class OooO0O0() {
        return this.OooO0O0.OooO0O0();
    }

    @Override // com.ninja.engine.InterfaceC0532o0o0O0O0
    public final C1251oOoOoooo OooO0OO() {
        return this.OooO00o;
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final synchronized void OooO0Oo() {
        this.OooO00o.OooO00o();
        this.OooO0Oo = true;
        if (!this.OooO0OO) {
            this.OooO0O0.OooO0Oo();
            this.OooO0O0 = null;
            OooO0o0.OooO0OO(this);
        }
    }

    public final synchronized void OooO0o0() {
        this.OooO00o.OooO00o();
        if (this.OooO0OO) {
            this.OooO0OO = false;
            if (this.OooO0Oo) {
                OooO0Oo();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Object get() {
        return this.OooO0O0.get();
    }
}
