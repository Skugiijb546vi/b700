package com.ninja.engine;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOoOo0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233oOoOo0oo implements InterfaceC0348o0OO0o0o, InterfaceC0347o0OO0o0O {
    public final o0OOO0O0 OooO00o;
    public final InterfaceC0347o0OO0o0O OooO0O0;
    public volatile int OooO0OO;
    public volatile C0400o0OOooO0 OooO0Oo;
    public volatile C0903oOO000Oo OooO0o;
    public volatile Object OooO0o0;
    public volatile C0345o0OO0Ooo OooO0oO;

    public C1233oOoOo0oo(o0OOO0O0 o0ooo0o0, InterfaceC0347o0OO0o0O interfaceC0347o0OO0o0O) {
        this.OooO00o = o0ooo0o0;
        this.OooO0O0 = interfaceC0347o0OO0o0O;
    }

    @Override // com.ninja.engine.InterfaceC0347o0OO0o0O
    public final void OooO00o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.ninja.engine.InterfaceC0347o0OO0o0O
    public final void OooO0O0(InterfaceC0745oO00oOo interfaceC0745oO00oOo, Object obj, InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0, int i, InterfaceC0745oO00oOo interfaceC0745oO00oOo2) {
        this.OooO0O0.OooO0O0(interfaceC0745oO00oOo, obj, interfaceC0346o0OO0o0, this.OooO0o.OooO0OO.OooO0o(), interfaceC0745oO00oOo);
    }

    @Override // com.ninja.engine.InterfaceC0348o0OO0o0o
    public final boolean OooO0OO() {
        if (this.OooO0o0 != null) {
            Object obj = this.OooO0o0;
            this.OooO0o0 = null;
            try {
                if (!OooO0o0(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.OooO0Oo != null && this.OooO0Oo.OooO0OO()) {
            return true;
        }
        this.OooO0Oo = null;
        this.OooO0o = null;
        boolean z = false;
        while (!z && this.OooO0OO < this.OooO00o.OooO0O0().size()) {
            ArrayList OooO0O0 = this.OooO00o.OooO0O0();
            int i = this.OooO0OO;
            this.OooO0OO = i + 1;
            this.OooO0o = (C0903oOO000Oo) OooO0O0.get(i);
            if (this.OooO0o != null && (this.OooO00o.OooOOOo.OooO0OO(this.OooO0o.OooO0OO.OooO0o()) || this.OooO00o.OooO0OO(this.OooO0o.OooO0OO.OooO00o()) != null)) {
                this.OooO0o.OooO0OO.OooO0o0(this.OooO00o.OooOOOO, new C1126oOOooOO(this, this.OooO0o));
                z = true;
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC0347o0OO0o0O
    public final void OooO0Oo(InterfaceC0745oO00oOo interfaceC0745oO00oOo, Exception exc, InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0, int i) {
        this.OooO0O0.OooO0Oo(interfaceC0745oO00oOo, exc, interfaceC0346o0OO0o0, this.OooO0o.OooO0OO.OooO0o());
    }

    public final boolean OooO0o0(Object obj) {
        int i = oO0o0000.OooO00o;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            o0OO0oO0 OooO0oo = this.OooO00o.OooO0OO.OooO0O0().OooO0oo(obj);
            Object OooOOOo = OooO0oo.OooOOOo();
            InterfaceC0488o0Ooooo OooO0o0 = this.OooO00o.OooO0o0(OooOOOo);
            C0131o00O0o c0131o00O0o = new C0131o00O0o(OooO0o0, OooOOOo, this.OooO00o.OooO, 6);
            InterfaceC0745oO00oOo interfaceC0745oO00oOo = this.OooO0o.OooO00o;
            o0OOO0O0 o0ooo0o0 = this.OooO00o;
            C0345o0OO0Ooo c0345o0OO0Ooo = new C0345o0OO0Ooo(interfaceC0745oO00oOo, o0ooo0o0.OooOOO);
            InterfaceC0398o0OOoo0o OooO00o = o0ooo0o0.OooO0oo.OooO00o();
            OooO00o.OooO0OO(c0345o0OO0Ooo, c0131o00O0o);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c0345o0OO0Ooo.toString();
                obj.toString();
                OooO0o0.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (OooO00o.OooOOOo(c0345o0OO0Ooo) != null) {
                this.OooO0oO = c0345o0OO0Ooo;
                this.OooO0Oo = new C0400o0OOooO0(Collections.singletonList(this.OooO0o.OooO00o), this.OooO00o, this);
                this.OooO0o.OooO0OO.OooO0OO();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.OooO0oO);
                obj.toString();
            }
            try {
                this.OooO0O0.OooO0O0(this.OooO0o.OooO00o, OooO0oo.OooOOOo(), this.OooO0o.OooO0OO, this.OooO0o.OooO0OO.OooO0o(), this.OooO0o.OooO00o);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.OooO0o.OooO0OO.OooO0OO();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.ninja.engine.InterfaceC0348o0OO0o0o
    public final void cancel() {
        C0903oOO000Oo c0903oOO000Oo = this.OooO0o;
        if (c0903oOO000Oo != null) {
            c0903oOO000Oo.OooO0OO.cancel();
        }
    }
}
