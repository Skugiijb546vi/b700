package com.ninja.engine;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
/* renamed from: com.ninja.engine.o0o000OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496o0o000OO implements InterfaceC0491o0o00, InterfaceC0882oO0oo0O0, InterfaceC0502o0o00O0 {
    public static final boolean OooO0oo = Log.isLoggable("Engine", 2);
    public final C0415o0Oo0O0O OooO00o;
    public final C0601o0oOooO0 OooO0O0;
    public final C0814oO0o OooO0OO;
    public final C1344oOooooOo OooO0Oo;
    public final o0O0OO OooO0o;
    public final C0224o00oO000 OooO0o0;
    public final C0067o0000Ooo OooO0oO;

    public C0496o0o000OO(C0814oO0o c0814oO0o, C0331o0O0oo c0331o0O0oo, oO00000 oo00000, oO00000 oo000002, oO00000 oo000003, oO00000 oo000004) {
        this.OooO0OO = c0814oO0o;
        C0325o0O0oOO0 c0325o0O0oOO0 = new C0325o0O0oOO0(c0331o0O0oo);
        C0067o0000Ooo c0067o0000Ooo = new C0067o0000Ooo();
        this.OooO0oO = c0067o0000Ooo;
        synchronized (this) {
            synchronized (c0067o0000Ooo) {
                c0067o0000Ooo.OooO0Oo = this;
            }
        }
        this.OooO0O0 = new C0601o0oOooO0(6);
        this.OooO00o = new C0415o0Oo0O0O(23);
        this.OooO0Oo = new C1344oOooooOo(oo00000, oo000002, oo000003, oo000004, this, this);
        this.OooO0o = new o0O0OO(c0325o0O0oOO0);
        this.OooO0o0 = new C0224o00oO000();
        c0814oO0o.OooO0Oo = this;
    }

    public static void OooO0o(InterfaceC1108oOOoo interfaceC1108oOOoo) {
        if (interfaceC1108oOOoo instanceof C0504o0o00O0O) {
            ((C0504o0o00O0O) interfaceC1108oOOoo).OooO0o0();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final C0131o00O0o OooO00o(C1932ooo0Oo0 c1932ooo0Oo0, Object obj, InterfaceC0745oO00oOo interfaceC0745oO00oOo, int i, int i2, Class cls, Class cls2, EnumC1000oOOOO0oo enumC1000oOOOO0oo, C0395o0OOoo c0395o0OOoo, C0257o00oo0o c0257o00oo0o, boolean z, boolean z2, C0973oOOO00o c0973oOOO00o, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC1124oOOooO0O interfaceC1124oOOooO0O, Executor executor) {
        long j;
        if (OooO0oo) {
            int i3 = oO0o0000.OooO00o;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j2 = j;
        this.OooO0O0.getClass();
        C0503o0o00O00 c0503o0o00O00 = new C0503o0o00O00(obj, interfaceC0745oO00oOo, i, i2, c0257o00oo0o, cls, cls2, c0973oOOO00o);
        synchronized (this) {
            try {
                C0504o0o00O0O OooO0OO = OooO0OO(c0503o0o00O00, z3, j2);
                if (OooO0OO == null) {
                    return OooO0oO(c1932ooo0Oo0, obj, interfaceC0745oO00oOo, i, i2, cls, cls2, enumC1000oOOOO0oo, c0395o0OOoo, c0257o00oo0o, z, z2, c0973oOOO00o, z3, z4, z5, z6, interfaceC1124oOOooO0O, executor, c0503o0o00O00, j2);
                }
                ((C1220oOoOOooO) interfaceC1124oOOooO0O).OooO0o(OooO0OO, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0504o0o00O0O OooO0O0(InterfaceC0745oO00oOo interfaceC0745oO00oOo) {
        C0504o0o00O0O c0504o0o00O0O;
        Object obj;
        C0814oO0o c0814oO0o = this.OooO0OO;
        synchronized (c0814oO0o) {
            C0837oO0o0oOo c0837oO0o0oOo = (C0837oO0o0oOo) c0814oO0o.OooO00o.remove(interfaceC0745oO00oOo);
            c0504o0o00O0O = null;
            if (c0837oO0o0oOo == null) {
                obj = null;
            } else {
                c0814oO0o.OooO0OO -= c0837oO0o0oOo.OooO0O0;
                obj = c0837oO0o0oOo.OooO00o;
            }
        }
        InterfaceC1108oOOoo interfaceC1108oOOoo = (InterfaceC1108oOOoo) obj;
        if (interfaceC1108oOOoo != null) {
            if (interfaceC1108oOOoo instanceof C0504o0o00O0O) {
                c0504o0o00O0O = (C0504o0o00O0O) interfaceC1108oOOoo;
            } else {
                c0504o0o00O0O = new C0504o0o00O0O(interfaceC1108oOOoo, true, true, interfaceC0745oO00oOo, this);
            }
        }
        if (c0504o0o00O0O != null) {
            c0504o0o00O0O.OooO0OO();
            this.OooO0oO.OooO0Oo(interfaceC0745oO00oOo, c0504o0o00O0O);
        }
        return c0504o0o00O0O;
    }

    public final C0504o0o00O0O OooO0OO(C0503o0o00O00 c0503o0o00O00, boolean z, long j) {
        C0504o0o00O0O c0504o0o00O0O;
        if (!z) {
            return null;
        }
        C0067o0000Ooo c0067o0000Ooo = this.OooO0oO;
        synchronized (c0067o0000Ooo) {
            C0060o00000o0 c0060o00000o0 = (C0060o00000o0) ((HashMap) c0067o0000Ooo.OooO0O0).get(c0503o0o00O00);
            if (c0060o00000o0 == null) {
                c0504o0o00O0O = null;
            } else {
                c0504o0o00O0O = (C0504o0o00O0O) c0060o00000o0.get();
                if (c0504o0o00O0O == null) {
                    c0067o0000Ooo.OooO0o0(c0060o00000o0);
                }
            }
        }
        if (c0504o0o00O0O != null) {
            c0504o0o00O0O.OooO0OO();
        }
        if (c0504o0o00O0O != null) {
            if (OooO0oo) {
                int i = oO0o0000.OooO00o;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c0503o0o00O00);
            }
            return c0504o0o00O0O;
        }
        C0504o0o00O0O OooO0O0 = OooO0O0(c0503o0o00O00);
        if (OooO0O0 == null) {
            return null;
        }
        if (OooO0oo) {
            int i2 = oO0o0000.OooO00o;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c0503o0o00O00);
        }
        return OooO0O0;
    }

    public final synchronized void OooO0Oo(C0500o0o000oo c0500o0o000oo, InterfaceC0745oO00oOo interfaceC0745oO00oOo, C0504o0o00O0O c0504o0o00O0O) {
        Object obj;
        if (c0504o0o00O0O != null) {
            try {
                if (c0504o0o00O0O.OooO00o) {
                    this.OooO0oO.OooO0Oo(interfaceC0745oO00oOo, c0504o0o00O0O);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO00o;
        c0415o0Oo0O0O.getClass();
        if (c0500o0o000oo.OooOOOo) {
            obj = c0415o0Oo0O0O.OooO0OO;
        } else {
            obj = c0415o0Oo0O0O.OooO0O0;
        }
        HashMap hashMap = (HashMap) obj;
        if (c0500o0o000oo.equals(hashMap.get(interfaceC0745oO00oOo))) {
            hashMap.remove(interfaceC0745oO00oOo);
        }
    }

    public final void OooO0o0(InterfaceC0745oO00oOo interfaceC0745oO00oOo, C0504o0o00O0O c0504o0o00O0O) {
        C0067o0000Ooo c0067o0000Ooo = this.OooO0oO;
        synchronized (c0067o0000Ooo) {
            C0060o00000o0 c0060o00000o0 = (C0060o00000o0) ((HashMap) c0067o0000Ooo.OooO0O0).remove(interfaceC0745oO00oOo);
            if (c0060o00000o0 != null) {
                c0060o00000o0.OooO0OO = null;
                c0060o00000o0.clear();
            }
        }
        if (c0504o0o00O0O.OooO00o) {
            InterfaceC1108oOOoo interfaceC1108oOOoo = (InterfaceC1108oOOoo) this.OooO0OO.OooO0Oo(interfaceC0745oO00oOo, c0504o0o00O0O);
        } else {
            this.OooO0o0.OooO0OO(c0504o0o00O0O, false);
        }
    }

    public final C0131o00O0o OooO0oO(C1932ooo0Oo0 c1932ooo0Oo0, Object obj, InterfaceC0745oO00oOo interfaceC0745oO00oOo, int i, int i2, Class cls, Class cls2, EnumC1000oOOOO0oo enumC1000oOOOO0oo, C0395o0OOoo c0395o0OOoo, C0257o00oo0o c0257o00oo0o, boolean z, boolean z2, C0973oOOO00o c0973oOOO00o, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC1124oOOooO0O interfaceC1124oOOooO0O, Executor executor, C0503o0o00O00 c0503o0o00O00, long j) {
        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO00o;
        C0500o0o000oo c0500o0o000oo = (C0500o0o000oo) ((HashMap) (z6 ? c0415o0Oo0O0O.OooO0OO : c0415o0Oo0O0O.OooO0O0)).get(c0503o0o00O00);
        if (c0500o0o000oo != null) {
            c0500o0o000oo.OooO00o(interfaceC1124oOOooO0O, executor);
            if (OooO0oo) {
                int i3 = oO0o0000.OooO00o;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c0503o0o00O00);
            }
            return new C0131o00O0o(this, interfaceC1124oOOooO0O, c0500o0o000oo);
        }
        C0500o0o000oo c0500o0o000oo2 = (C0500o0o000oo) ((C0131o00O0o) this.OooO0Oo.OooO0oO).OooO();
        synchronized (c0500o0o000oo2) {
            c0500o0o000oo2.OooOO0o = c0503o0o00O00;
            c0500o0o000oo2.OooOOO0 = z3;
            c0500o0o000oo2.OooOOO = z4;
            c0500o0o000oo2.OooOOOO = z5;
            c0500o0o000oo2.OooOOOo = z6;
        }
        o0O0OO o0o0oo = this.OooO0o;
        o0OOO0OO o0ooo0oo = (o0OOO0OO) ((C0131o00O0o) o0o0oo.OooO0OO).OooO();
        int i4 = o0o0oo.OooO00o;
        o0o0oo.OooO00o = i4 + 1;
        o0OOO0O0 o0ooo0o0 = o0ooo0oo.OooO00o;
        o0ooo0o0.OooO0OO = c1932ooo0Oo0;
        o0ooo0o0.OooO0Oo = obj;
        o0ooo0o0.OooOOO = interfaceC0745oO00oOo;
        o0ooo0o0.OooO0o0 = i;
        o0ooo0o0.OooO0o = i2;
        o0ooo0o0.OooOOOo = c0395o0OOoo;
        o0ooo0o0.OooO0oO = cls;
        o0ooo0o0.OooO0oo = o0ooo0oo.OooO0Oo;
        o0ooo0o0.OooOO0O = cls2;
        o0ooo0o0.OooOOOO = enumC1000oOOOO0oo;
        o0ooo0o0.OooO = c0973oOOO00o;
        o0ooo0o0.OooOO0 = c0257o00oo0o;
        o0ooo0o0.OooOOo0 = z;
        o0ooo0o0.OooOOo = z2;
        o0ooo0oo.OooO0oo = c1932ooo0Oo0;
        o0ooo0oo.OooO = interfaceC0745oO00oOo;
        o0ooo0oo.OooOO0 = enumC1000oOOOO0oo;
        o0ooo0oo.OooOO0O = c0503o0o00O00;
        o0ooo0oo.OooOO0o = i;
        o0ooo0oo.OooOOO0 = i2;
        o0ooo0oo.OooOOO = c0395o0OOoo;
        o0ooo0oo.OooOOo = z6;
        o0ooo0oo.OooOOOO = c0973oOOO00o;
        o0ooo0oo.OooOOOo = c0500o0o000oo2;
        o0ooo0oo.OooOOo0 = i4;
        o0ooo0oo.OooOooO = 1;
        o0ooo0oo.OooOOoo = obj;
        C0415o0Oo0O0O c0415o0Oo0O0O2 = this.OooO00o;
        c0415o0Oo0O0O2.getClass();
        ((HashMap) (c0500o0o000oo2.OooOOOo ? c0415o0Oo0O0O2.OooO0OO : c0415o0Oo0O0O2.OooO0O0)).put(c0503o0o00O00, c0500o0o000oo2);
        c0500o0o000oo2.OooO00o(interfaceC1124oOOooO0O, executor);
        c0500o0o000oo2.OooOO0O(o0ooo0oo);
        if (OooO0oo) {
            int i5 = oO0o0000.OooO00o;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c0503o0o00O00);
        }
        return new C0131o00O0o(this, interfaceC1124oOOooO0O, c0500o0o000oo2);
    }
}


