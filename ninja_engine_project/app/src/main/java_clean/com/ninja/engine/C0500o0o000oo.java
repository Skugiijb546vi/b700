package com.ninja.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.ninja.engine.o0o000oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500o0o000oo implements InterfaceC0532o0o0O0O0 {
    public static final C0601o0oOooO0 OooOoO = new C0601o0oOooO0(5);
    public final oO00000 OooO;
    public final C0499o0o000oO OooO00o;
    public final C1251oOoOoooo OooO0O0;
    public final InterfaceC0502o0o00O0 OooO0OO;
    public final oOOOO0O0 OooO0Oo;
    public final InterfaceC0491o0o00 OooO0o;
    public final C0601o0oOooO0 OooO0o0;
    public final oO00000 OooO0oO;
    public final oO00000 OooO0oo;
    public final oO00000 OooOO0;
    public final AtomicInteger OooOO0O;
    public InterfaceC0745oO00oOo OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public int OooOOo;
    public InterfaceC1108oOOoo OooOOo0;
    public boolean OooOOoo;
    public volatile boolean OooOo;
    public boolean OooOo0;
    public C0695o0oooooO OooOo00;
    public C0504o0o00O0O OooOo0O;
    public o0OOO0OO OooOo0o;
    public boolean OooOoO0;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.ninja.engine.oOoOoooo, java.lang.Object] */
    public C0500o0o000oo(oO00000 oo00000, oO00000 oo000002, oO00000 oo000003, oO00000 oo000004, InterfaceC0491o0o00 interfaceC0491o0o00, InterfaceC0502o0o00O0 interfaceC0502o0o00O0, C0131o00O0o c0131o00O0o) {
        C0601o0oOooO0 c0601o0oOooO0 = OooOoO;
        this.OooO00o = new C0499o0o000oO(new ArrayList(2));
        this.OooO0O0 = new C1251oOoOoooo();
        this.OooOO0O = new AtomicInteger();
        this.OooO0oO = oo00000;
        this.OooO0oo = oo000002;
        this.OooO = oo000003;
        this.OooOO0 = oo000004;
        this.OooO0o = interfaceC0491o0o00;
        this.OooO0OO = interfaceC0502o0o00O0;
        this.OooO0Oo = c0131o00O0o;
        this.OooO0o0 = c0601o0oOooO0;
    }

    public final synchronized void OooO() {
        if (this.OooOO0o != null) {
            this.OooO00o.OooO00o.clear();
            this.OooOO0o = null;
            this.OooOo0O = null;
            this.OooOOo0 = null;
            this.OooOo0 = false;
            this.OooOo = false;
            this.OooOOoo = false;
            this.OooOoO0 = false;
            this.OooOo0o.OooOOO0();
            this.OooOo0o = null;
            this.OooOo00 = null;
            this.OooOOo = 0;
            this.OooO0Oo.OooO0OO(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void OooO00o(InterfaceC1124oOOooO0O interfaceC1124oOOooO0O, Executor executor) {
        RunnableC0497o0o000Oo runnableC0497o0o000Oo;
        try {
            this.OooO0O0.OooO00o();
            C0499o0o000oO c0499o0o000oO = this.OooO00o;
            c0499o0o000oO.getClass();
            c0499o0o000oO.OooO00o.add(new C0498o0o000o0(interfaceC1124oOOooO0O, executor));
            if (this.OooOOoo) {
                OooO0o0(1);
                runnableC0497o0o000Oo = new RunnableC0497o0o000Oo(this, interfaceC1124oOOooO0O, 1);
            } else if (this.OooOo0) {
                OooO0o0(1);
                runnableC0497o0o000Oo = new RunnableC0497o0o000Oo(this, interfaceC1124oOOooO0O, 0);
            } else {
                AbstractC0694o0ooooo0.OooO0oo("Cannot add callbacks to a cancelled EngineJob", !this.OooOo);
            }
            executor.execute(runnableC0497o0o000Oo);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0O0() {
        Object obj;
        if (OooO0o()) {
            return;
        }
        this.OooOo = true;
        o0OOO0OO o0ooo0oo = this.OooOo0o;
        o0ooo0oo.OooOoOO = true;
        InterfaceC0348o0OO0o0o interfaceC0348o0OO0o0o = o0ooo0oo.OooOoO0;
        if (interfaceC0348o0OO0o0o != null) {
            interfaceC0348o0OO0o0o.cancel();
        }
        InterfaceC0491o0o00 interfaceC0491o0o00 = this.OooO0o;
        InterfaceC0745oO00oOo interfaceC0745oO00oOo = this.OooOO0o;
        C0496o0o000OO c0496o0o000OO = (C0496o0o000OO) interfaceC0491o0o00;
        synchronized (c0496o0o000OO) {
            C0415o0Oo0O0O c0415o0Oo0O0O = c0496o0o000OO.OooO00o;
            c0415o0Oo0O0O.getClass();
            if (this.OooOOOo) {
                obj = c0415o0Oo0O0O.OooO0OO;
            } else {
                obj = c0415o0Oo0O0O.OooO0O0;
            }
            HashMap hashMap = (HashMap) obj;
            if (equals(hashMap.get(interfaceC0745oO00oOo))) {
                hashMap.remove(interfaceC0745oO00oOo);
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC0532o0o0O0O0
    public final C1251oOoOoooo OooO0OO() {
        return this.OooO0O0;
    }

    public final void OooO0Oo() {
        boolean z;
        C0504o0o00O0O c0504o0o00O0O;
        synchronized (this) {
            try {
                this.OooO0O0.OooO00o();
                AbstractC0694o0ooooo0.OooO0oo("Not yet complete!", OooO0o());
                int decrementAndGet = this.OooOO0O.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC0694o0ooooo0.OooO0oo("Can't decrement below 0", z);
                if (decrementAndGet == 0) {
                    c0504o0o00O0O = this.OooOo0O;
                    OooO();
                } else {
                    c0504o0o00O0O = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0504o0o00O0O != null) {
            c0504o0o00O0O.OooO0o0();
        }
    }

    public final boolean OooO0o() {
        if (!this.OooOo0 && !this.OooOOoo && !this.OooOo) {
            return false;
        }
        return true;
    }

    public final synchronized void OooO0o0(int i) {
        C0504o0o00O0O c0504o0o00O0O;
        AbstractC0694o0ooooo0.OooO0oo("Not yet complete!", OooO0o());
        if (this.OooOO0O.getAndAdd(i) == 0 && (c0504o0o00O0O = this.OooOo0O) != null) {
            c0504o0o00O0O.OooO0OO();
        }
    }

    public final void OooO0oO() {
        synchronized (this) {
            try {
                this.OooO0O0.OooO00o();
                if (this.OooOo) {
                    OooO();
                } else if (!this.OooO00o.OooO00o.isEmpty()) {
                    if (!this.OooOo0) {
                        this.OooOo0 = true;
                        InterfaceC0745oO00oOo interfaceC0745oO00oOo = this.OooOO0o;
                        C0499o0o000oO c0499o0o000oO = this.OooO00o;
                        c0499o0o000oO.getClass();
                        ArrayList<C0498o0o000o0> arrayList = new ArrayList(c0499o0o000oO.OooO00o);
                        OooO0o0(arrayList.size() + 1);
                        ((C0496o0o000OO) this.OooO0o).OooO0Oo(this, interfaceC0745oO00oOo, null);
                        for (C0498o0o000o0 c0498o0o000o0 : arrayList) {
                            c0498o0o000o0.OooO0O0.execute(new RunnableC0497o0o000Oo(this, c0498o0o000o0.OooO00o, 0));
                        }
                        OooO0Oo();
                        return;
                    }
                    throw new IllegalStateException("Already failed once");
                } else {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0oo() {
        synchronized (this) {
            try {
                this.OooO0O0.OooO00o();
                if (this.OooOo) {
                    this.OooOOo0.OooO0Oo();
                    OooO();
                } else if (!this.OooO00o.OooO00o.isEmpty()) {
                    if (!this.OooOOoo) {
                        C0601o0oOooO0 c0601o0oOooO0 = this.OooO0o0;
                        InterfaceC1108oOOoo interfaceC1108oOOoo = this.OooOOo0;
                        boolean z = this.OooOOO0;
                        InterfaceC0745oO00oOo interfaceC0745oO00oOo = this.OooOO0o;
                        InterfaceC0502o0o00O0 interfaceC0502o0o00O0 = this.OooO0OO;
                        c0601o0oOooO0.getClass();
                        this.OooOo0O = new C0504o0o00O0O(interfaceC1108oOOoo, z, true, interfaceC0745oO00oOo, interfaceC0502o0o00O0);
                        this.OooOOoo = true;
                        C0499o0o000oO c0499o0o000oO = this.OooO00o;
                        c0499o0o000oO.getClass();
                        ArrayList<C0498o0o000o0> arrayList = new ArrayList(c0499o0o000oO.OooO00o);
                        OooO0o0(arrayList.size() + 1);
                        ((C0496o0o000OO) this.OooO0o).OooO0Oo(this, this.OooOO0o, this.OooOo0O);
                        for (C0498o0o000o0 c0498o0o000o0 : arrayList) {
                            c0498o0o000o0.OooO0O0.execute(new RunnableC0497o0o000Oo(this, c0498o0o000o0.OooO00o, 1));
                        }
                        OooO0Oo();
                        return;
                    }
                    throw new IllegalStateException("Already have resource");
                } else {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void OooOO0(InterfaceC1124oOOooO0O interfaceC1124oOOooO0O) {
        try {
            this.OooO0O0.OooO00o();
            C0499o0o000oO c0499o0o000oO = this.OooO00o;
            c0499o0o000oO.OooO00o.remove(new C0498o0o000o0(interfaceC1124oOOooO0O, AbstractC0692o0ooooOo.OooOOOO));
            if (this.OooO00o.OooO00o.isEmpty()) {
                OooO0O0();
                if (!this.OooOOoo) {
                    if (this.OooOo0) {
                    }
                }
                if (this.OooOO0O.get() == 0) {
                    OooO();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooOO0O(o0OOO0OO o0ooo0oo) {
        oO00000 oo00000;
        this.OooOo0o = o0ooo0oo;
        int OooO = o0ooo0oo.OooO(1);
        if (OooO != 2 && OooO != 3) {
            if (this.OooOOO) {
                oo00000 = this.OooO;
            } else if (this.OooOOOO) {
                oo00000 = this.OooOO0;
            } else {
                oo00000 = this.OooO0oo;
            }
            oo00000.execute(o0ooo0oo);
        }
        oo00000 = this.OooO0oO;
        oo00000.execute(o0ooo0oo);
    }
}


