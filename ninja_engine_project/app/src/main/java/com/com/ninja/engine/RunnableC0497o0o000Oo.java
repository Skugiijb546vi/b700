package com.ninja.engine;
/* renamed from: com.ninja.engine.o0o000Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0497o0o000Oo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final InterfaceC1124oOOooO0O OooO0O0;
    public final /* synthetic */ C0500o0o000oo OooO0OO;

    public /* synthetic */ RunnableC0497o0o000Oo(C0500o0o000oo c0500o0o000oo, InterfaceC1124oOOooO0O interfaceC1124oOOooO0O, int i) {
        this.OooO00o = i;
        this.OooO0OO = c0500o0o000oo;
        this.OooO0O0 = interfaceC1124oOOooO0O;
    }

    private final void OooO00o() {
        C1220oOoOOooO c1220oOoOOooO = (C1220oOoOOooO) this.OooO0O0;
        c1220oOoOOooO.OooO00o.OooO00o();
        synchronized (c1220oOoOOooO.OooO0O0) {
            synchronized (this.OooO0OO) {
                C0499o0o000oO c0499o0o000oO = this.OooO0OO.OooO00o;
                InterfaceC1124oOOooO0O interfaceC1124oOOooO0O = this.OooO0O0;
                c0499o0o000oO.getClass();
                if (c0499o0o000oO.OooO00o.contains(new C0498o0o000o0(interfaceC1124oOOooO0O, AbstractC0692o0ooooOo.OooOOOO))) {
                    C0500o0o000oo c0500o0o000oo = this.OooO0OO;
                    InterfaceC1124oOOooO0O interfaceC1124oOOooO0O2 = this.OooO0O0;
                    c0500o0o000oo.getClass();
                    try {
                        ((C1220oOoOOooO) interfaceC1124oOOooO0O2).OooO0o0(c0500o0o000oo.OooOo00, 5);
                    } catch (Throwable th) {
                        throw new C0261o00ooO0(th);
                    }
                }
                this.OooO0OO.OooO0Oo();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                OooO00o();
                return;
            default:
                C1220oOoOOooO c1220oOoOOooO = (C1220oOoOOooO) this.OooO0O0;
                c1220oOoOOooO.OooO00o.OooO00o();
                synchronized (c1220oOoOOooO.OooO0O0) {
                    synchronized (this.OooO0OO) {
                        C0499o0o000oO c0499o0o000oO = this.OooO0OO.OooO00o;
                        InterfaceC1124oOOooO0O interfaceC1124oOOooO0O = this.OooO0O0;
                        c0499o0o000oO.getClass();
                        if (c0499o0o000oO.OooO00o.contains(new C0498o0o000o0(interfaceC1124oOOooO0O, AbstractC0692o0ooooOo.OooOOOO))) {
                            this.OooO0OO.OooOo0O.OooO0OO();
                            C0500o0o000oo c0500o0o000oo = this.OooO0OO;
                            InterfaceC1124oOOooO0O interfaceC1124oOOooO0O2 = this.OooO0O0;
                            c0500o0o000oo.getClass();
                            ((C1220oOoOOooO) interfaceC1124oOOooO0O2).OooO0o(c0500o0o000oo.OooOo0O, c0500o0o000oo.OooOOo, c0500o0o000oo.OooOoO0);
                            this.OooO0OO.OooOO0(this.OooO0O0);
                        }
                        this.OooO0OO.OooO0Oo();
                    }
                }
                return;
        }
    }
}
