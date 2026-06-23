package com.ninja.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* loaded from: classes.dex */
public final class o0OOO0OO implements InterfaceC0347o0OO0o0O, Runnable, Comparable, InterfaceC0532o0o0O0O0 {
    public InterfaceC0745oO00oOo OooO;
    public final C0325o0O0oOO0 OooO0Oo;
    public final oOOOO0O0 OooO0o0;
    public C1932ooo0Oo0 OooO0oo;
    public EnumC1000oOOOO0oo OooOO0;
    public C0503o0o00O00 OooOO0O;
    public int OooOO0o;
    public C0395o0OOoo OooOOO;
    public int OooOOO0;
    public C0973oOOO00o OooOOOO;
    public C0500o0o000oo OooOOOo;
    public boolean OooOOo;
    public int OooOOo0;
    public Object OooOOoo;
    public InterfaceC0346o0OO0o0 OooOo;
    public InterfaceC0745oO00oOo OooOo0;
    public Thread OooOo00;
    public InterfaceC0745oO00oOo OooOo0O;
    public Object OooOo0o;
    public volatile boolean OooOoO;
    public volatile InterfaceC0348o0OO0o0o OooOoO0;
    public volatile boolean OooOoOO;
    public int OooOoo;
    public boolean OooOoo0;
    public int OooOooO;
    public int OooOooo;
    public final o0OOO0O0 OooO00o = new o0OOO0O0();
    public final ArrayList OooO0O0 = new ArrayList();
    public final C1251oOoOoooo OooO0OO = new Object();
    public final C0131o00O0o OooO0o = new C0131o00O0o(7);
    public final o0OOO0O OooO0oO = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.oOoOoooo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ninja.engine.o0OOO0O] */
    public o0OOO0OO(C0325o0O0oOO0 c0325o0O0oOO0, C0131o00O0o c0131o00O0o) {
        this.OooO0Oo = c0325o0O0oOO0;
        this.OooO0o0 = c0131o00O0o;
    }

    public final int OooO(int i) {
        int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(i);
        if (OooOOOo != 0) {
            if (OooOOOo != 1) {
                if (OooOOOo != 2) {
                    if (OooOOOo == 3 || OooOOOo == 5) {
                        return 6;
                    }
                    throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC1230oOoOo0o.OooOOoo(i)));
                } else if (this.OooOOo) {
                    return 6;
                } else {
                    return 4;
                }
            } else if (this.OooOOO.OooO00o()) {
                return 3;
            } else {
                return OooO(3);
            }
        } else if (this.OooOOO.OooO0O0()) {
            return 2;
        } else {
            return OooO(2);
        }
    }

    @Override // com.ninja.engine.InterfaceC0347o0OO0o0O
    public final void OooO00o() {
        OooOOOO(2);
    }

    @Override // com.ninja.engine.InterfaceC0347o0OO0o0O
    public final void OooO0O0(InterfaceC0745oO00oOo interfaceC0745oO00oOo, Object obj, InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0, int i, InterfaceC0745oO00oOo interfaceC0745oO00oOo2) {
        this.OooOo0 = interfaceC0745oO00oOo;
        this.OooOo0o = obj;
        this.OooOo = interfaceC0346o0OO0o0;
        this.OooOooo = i;
        this.OooOo0O = interfaceC0745oO00oOo2;
        boolean z = false;
        if (interfaceC0745oO00oOo != this.OooO00o.OooO00o().get(0)) {
            z = true;
        }
        this.OooOoo0 = z;
        if (Thread.currentThread() != this.OooOo00) {
            OooOOOO(3);
        } else {
            OooO0oO();
        }
    }

    @Override // com.ninja.engine.InterfaceC0532o0o0O0O0
    public final C1251oOoOoooo OooO0OO() {
        return this.OooO0OO;
    }

    @Override // com.ninja.engine.InterfaceC0347o0OO0o0O
    public final void OooO0Oo(InterfaceC0745oO00oOo interfaceC0745oO00oOo, Exception exc, InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0, int i) {
        interfaceC0346o0OO0o0.OooO0OO();
        C0695o0oooooO c0695o0oooooO = new C0695o0oooooO("Fetching data failed", Collections.singletonList(exc));
        Class OooO00o = interfaceC0346o0OO0o0.OooO00o();
        c0695o0oooooO.OooO0O0 = interfaceC0745oO00oOo;
        c0695o0oooooO.OooO0OO = i;
        c0695o0oooooO.OooO0Oo = OooO00o;
        this.OooO0O0.add(c0695o0oooooO);
        if (Thread.currentThread() != this.OooOo00) {
            OooOOOO(2);
        } else {
            OooOOOo();
        }
    }

    public final InterfaceC1108oOOoo OooO0o(int i, Object obj) {
        boolean z;
        Class<?> cls = obj.getClass();
        o0OOO0O0 o0ooo0o0 = this.OooO00o;
        oO0Oo0o0 OooO0OO = o0ooo0o0.OooO0OO(cls);
        C0973oOOO00o c0973oOOO00o = this.OooOOOO;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i != 4 && !o0ooo0o0.OooOOo) {
                z = false;
            } else {
                z = true;
            }
            oOOO00o0 oooo00o0 = C0577o0oOo000.OooO;
            Boolean bool = (Boolean) c0973oOOO00o.OooO0OO(oooo00o0);
            if (bool == null || (bool.booleanValue() && !z)) {
                c0973oOOO00o = new C0973oOOO00o();
                C0257o00oo0o c0257o00oo0o = this.OooOOOO.OooO0O0;
                C0257o00oo0o c0257o00oo0o2 = c0973oOOO00o.OooO0O0;
                c0257o00oo0o2.OooO0oO(c0257o00oo0o);
                c0257o00oo0o2.put(oooo00o0, Boolean.valueOf(z));
            }
        }
        C0973oOOO00o c0973oOOO00o2 = c0973oOOO00o;
        o0OO0oO0 OooO0oo = this.OooO0oo.OooO0O0().OooO0oo(obj);
        try {
            return OooO0OO.OooO00o(this.OooOO0o, this.OooOOO0, new C0073o0000oO0(i, this), OooO0oo, c0973oOOO00o2);
        } finally {
            OooO0oo.OooO0OO();
        }
    }

    public final InterfaceC1108oOOoo OooO0o0(InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0, Object obj, int i) {
        if (obj == null) {
            interfaceC0346o0OO0o0.OooO0OO();
            return null;
        }
        try {
            int i2 = oO0o0000.OooO00o;
            SystemClock.elapsedRealtimeNanos();
            InterfaceC1108oOOoo OooO0o = OooO0o(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                OooO0o.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.OooOO0O);
                Thread.currentThread().getName();
            }
            return OooO0o;
        } finally {
            interfaceC0346o0OO0o0.OooO0OO();
        }
    }

    public final void OooO0oO() {
        C0811oO0Oooo c0811oO0Oooo;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.OooOo0o + ", cache key: " + this.OooOo0 + ", fetcher: " + this.OooOo;
            int i = oO0o0000.OooO00o;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.OooOO0O);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        C0811oO0Oooo c0811oO0Oooo2 = null;
        try {
            c0811oO0Oooo = OooO0o0(this.OooOo, this.OooOo0o, this.OooOooo);
        } catch (C0695o0oooooO e) {
            InterfaceC0745oO00oOo interfaceC0745oO00oOo = this.OooOo0O;
            int i2 = this.OooOooo;
            e.OooO0O0 = interfaceC0745oO00oOo;
            e.OooO0OO = i2;
            e.OooO0Oo = null;
            this.OooO0O0.add(e);
            c0811oO0Oooo = null;
        }
        if (c0811oO0Oooo != null) {
            int i3 = this.OooOooo;
            boolean z = this.OooOoo0;
            if (c0811oO0Oooo instanceof InterfaceC0719oO00OoO0) {
                ((InterfaceC0719oO00OoO0) c0811oO0Oooo).initialize();
            }
            if (((C0811oO0Oooo) this.OooO0o.OooO0Oo) != null) {
                c0811oO0Oooo2 = (C0811oO0Oooo) C0811oO0Oooo.OooO0o0.OooO();
                c0811oO0Oooo2.OooO0Oo = false;
                c0811oO0Oooo2.OooO0OO = true;
                c0811oO0Oooo2.OooO0O0 = c0811oO0Oooo;
                c0811oO0Oooo = c0811oO0Oooo2;
            }
            OooOOo();
            C0500o0o000oo c0500o0o000oo = this.OooOOOo;
            synchronized (c0500o0o000oo) {
                c0500o0o000oo.OooOOo0 = c0811oO0Oooo;
                c0500o0o000oo.OooOOo = i3;
                c0500o0o000oo.OooOoO0 = z;
            }
            c0500o0o000oo.OooO0oo();
            this.OooOoo = 5;
            try {
                C0131o00O0o c0131o00O0o = this.OooO0o;
                if (((C0811oO0Oooo) c0131o00O0o.OooO0Oo) != null) {
                    C0325o0O0oOO0 c0325o0O0oOO0 = this.OooO0Oo;
                    C0973oOOO00o c0973oOOO00o = this.OooOOOO;
                    c0131o00O0o.getClass();
                    c0325o0O0oOO0.OooO00o().OooO0OO((InterfaceC0745oO00oOo) c0131o00O0o.OooO0O0, new C0131o00O0o((InterfaceC1128oOOooOOo) c0131o00O0o.OooO0OO, (C0811oO0Oooo) c0131o00O0o.OooO0Oo, c0973oOOO00o, 6));
                    ((C0811oO0Oooo) c0131o00O0o.OooO0Oo).OooO0o0();
                }
                OooOO0O();
                return;
            } finally {
                if (c0811oO0Oooo2 != null) {
                    c0811oO0Oooo2.OooO0o0();
                }
            }
        }
        OooOOOo();
    }

    public final InterfaceC0348o0OO0o0o OooO0oo() {
        int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(this.OooOoo);
        o0OOO0O0 o0ooo0o0 = this.OooO00o;
        if (OooOOOo != 1) {
            if (OooOOOo != 2) {
                if (OooOOOo != 3) {
                    if (OooOOOo == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC1230oOoOo0o.OooOOoo(this.OooOoo)));
                }
                return new C1233oOoOo0oo(o0ooo0o0, this);
            }
            return new C0400o0OOooO0(o0ooo0o0.OooO00o(), o0ooo0o0, this);
        }
        return new C1123oOOooO00(o0ooo0o0, this);
    }

    public final void OooOO0() {
        OooOOo();
        C0695o0oooooO c0695o0oooooO = new C0695o0oooooO("Failed to load resource", new ArrayList(this.OooO0O0));
        C0500o0o000oo c0500o0o000oo = this.OooOOOo;
        synchronized (c0500o0o000oo) {
            c0500o0o000oo.OooOo00 = c0695o0oooooO;
        }
        c0500o0o000oo.OooO0oO();
        OooOO0o();
    }

    public final void OooOO0O() {
        boolean OooO00o;
        o0OOO0O o0ooo0o = this.OooO0oO;
        synchronized (o0ooo0o) {
            o0ooo0o.OooO0O0 = true;
            OooO00o = o0ooo0o.OooO00o();
        }
        if (OooO00o) {
            OooOOO();
        }
    }

    public final void OooOO0o() {
        boolean OooO00o;
        o0OOO0O o0ooo0o = this.OooO0oO;
        synchronized (o0ooo0o) {
            o0ooo0o.OooO0OO = true;
            OooO00o = o0ooo0o.OooO00o();
        }
        if (OooO00o) {
            OooOOO();
        }
    }

    public final void OooOOO() {
        o0OOO0O o0ooo0o = this.OooO0oO;
        synchronized (o0ooo0o) {
            o0ooo0o.OooO0O0 = false;
            o0ooo0o.OooO00o = false;
            o0ooo0o.OooO0OO = false;
        }
        C0131o00O0o c0131o00O0o = this.OooO0o;
        c0131o00O0o.OooO0O0 = null;
        c0131o00O0o.OooO0OO = null;
        c0131o00O0o.OooO0Oo = null;
        o0OOO0O0 o0ooo0o0 = this.OooO00o;
        o0ooo0o0.OooO0OO = null;
        o0ooo0o0.OooO0Oo = null;
        o0ooo0o0.OooOOO = null;
        o0ooo0o0.OooO0oO = null;
        o0ooo0o0.OooOO0O = null;
        o0ooo0o0.OooO = null;
        o0ooo0o0.OooOOOO = null;
        o0ooo0o0.OooOO0 = null;
        o0ooo0o0.OooOOOo = null;
        o0ooo0o0.OooO00o.clear();
        o0ooo0o0.OooOO0o = false;
        o0ooo0o0.OooO0O0.clear();
        o0ooo0o0.OooOOO0 = false;
        this.OooOoO = false;
        this.OooO0oo = null;
        this.OooO = null;
        this.OooOOOO = null;
        this.OooOO0 = null;
        this.OooOO0O = null;
        this.OooOOOo = null;
        this.OooOoo = 0;
        this.OooOoO0 = null;
        this.OooOo00 = null;
        this.OooOo0 = null;
        this.OooOo0o = null;
        this.OooOooo = 0;
        this.OooOo = null;
        this.OooOoOO = false;
        this.OooO0O0.clear();
        this.OooO0o0.OooO0OO(this);
    }

    public final void OooOOO0() {
        boolean OooO00o;
        o0OOO0O o0ooo0o = this.OooO0oO;
        synchronized (o0ooo0o) {
            o0ooo0o.OooO00o = true;
            OooO00o = o0ooo0o.OooO00o();
        }
        if (OooO00o) {
            OooOOO();
        }
    }

    public final void OooOOOO(int i) {
        oO00000 oo00000;
        this.OooOooO = i;
        C0500o0o000oo c0500o0o000oo = this.OooOOOo;
        if (c0500o0o000oo.OooOOO) {
            oo00000 = c0500o0o000oo.OooO;
        } else if (c0500o0o000oo.OooOOOO) {
            oo00000 = c0500o0o000oo.OooOO0;
        } else {
            oo00000 = c0500o0o000oo.OooO0oo;
        }
        oo00000.execute(this);
    }

    public final void OooOOOo() {
        this.OooOo00 = Thread.currentThread();
        int i = oO0o0000.OooO00o;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.OooOoOO && this.OooOoO0 != null && !(z = this.OooOoO0.OooO0OO())) {
            this.OooOoo = OooO(this.OooOoo);
            this.OooOoO0 = OooO0oo();
            if (this.OooOoo == 4) {
                OooOOOO(2);
                return;
            }
        }
        if ((this.OooOoo == 6 || this.OooOoOO) && !z) {
            OooOO0();
        }
    }

    public final void OooOOo() {
        Throwable th;
        this.OooO0OO.OooO00o();
        if (this.OooOoO) {
            if (this.OooO0O0.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.OooO0O0;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.OooOoO = true;
    }

    public final void OooOOo0() {
        int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(this.OooOooO);
        if (OooOOOo != 0) {
            if (OooOOOo != 1) {
                if (OooOOOo == 2) {
                    OooO0oO();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: ".concat(AbstractC1230oOoOo0o.OooOOo(this.OooOooO)));
            }
        } else {
            this.OooOoo = OooO(1);
            this.OooOoO0 = OooO0oo();
        }
        OooOOOo();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o0OOO0OO o0ooo0oo = (o0OOO0OO) obj;
        int ordinal = this.OooOO0.ordinal() - o0ooo0oo.OooOO0.ordinal();
        if (ordinal == 0) {
            return this.OooOOo0 - o0ooo0oo.OooOOo0;
        }
        return ordinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0 = this.OooOo;
        try {
            if (this.OooOoOO) {
                OooOO0();
                if (interfaceC0346o0OO0o0 != null) {
                    interfaceC0346o0OO0o0.OooO0OO();
                    return;
                }
                return;
            }
            OooOOo0();
            if (interfaceC0346o0OO0o0 != null) {
                interfaceC0346o0OO0o0.OooO0OO();
            }
        } catch (C0261o00ooO0 e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
