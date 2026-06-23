package com.ninja.engine;

import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.ninja.engine.o0000Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067o0000Ooo implements InterfaceC1225oOoOo000 {
    public boolean OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;
    public Object OooO0Oo;

    public C0067o0000Ooo() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0059o00000Oo(0));
        this.OooO0O0 = new HashMap();
        this.OooO0OO = new ReferenceQueue();
        this.OooO00o = false;
        newSingleThreadExecutor.execute(new o00000OO(1, this));
    }

    @Override // com.ninja.engine.InterfaceC1225oOoOo000
    public void OooO00o() {
        ((ConnectivityManager) ((oO00000o) this.OooO0OO).get()).unregisterNetworkCallback((C1226oOoOo00O) this.OooO0Oo);
    }

    @Override // com.ninja.engine.InterfaceC1225oOoOo000
    public boolean OooO0O0() {
        Network activeNetwork;
        boolean z;
        oO00000o oo00000o = (oO00000o) this.OooO0OO;
        activeNetwork = ((ConnectivityManager) oo00000o.get()).getActiveNetwork();
        if (activeNetwork != null) {
            z = true;
        } else {
            z = false;
        }
        this.OooO00o = z;
        try {
            ((ConnectivityManager) oo00000o.get()).registerDefaultNetworkCallback((C1226oOoOo00O) this.OooO0Oo);
            return true;
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return false;
        }
    }

    public void OooO0OO() {
        C0403o0OOooo.OooO00o((C0403o0OOooo) this.OooO0Oo, this, false);
    }

    public synchronized void OooO0Oo(InterfaceC0745oO00oOo interfaceC0745oO00oOo, C0504o0o00O0O c0504o0o00O0O) {
        C0060o00000o0 c0060o00000o0 = (C0060o00000o0) ((HashMap) this.OooO0O0).put(interfaceC0745oO00oOo, new C0060o00000o0(interfaceC0745oO00oOo, c0504o0o00O0O, (ReferenceQueue) this.OooO0OO, this.OooO00o));
        if (c0060o00000o0 != null) {
            c0060o00000o0.OooO0OO = null;
            c0060o00000o0.clear();
        }
    }

    public File OooO0o() {
        File file;
        synchronized (((C0403o0OOooo) this.OooO0Oo)) {
            try {
                C0404o0OOooo0 c0404o0OOooo0 = (C0404o0OOooo0) this.OooO0O0;
                if (c0404o0OOooo0.OooO0o == this) {
                    if (!c0404o0OOooo0.OooO0o0) {
                        ((boolean[]) this.OooO0OO)[0] = true;
                    }
                    file = c0404o0OOooo0.OooO0Oo[0];
                    ((C0403o0OOooo) this.OooO0Oo).OooO00o.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public void OooO0o0(C0060o00000o0 c0060o00000o0) {
        InterfaceC1108oOOoo interfaceC1108oOOoo;
        synchronized (this) {
            ((HashMap) this.OooO0O0).remove(c0060o00000o0.OooO00o);
            if (c0060o00000o0.OooO0O0 && (interfaceC1108oOOoo = c0060o00000o0.OooO0OO) != null) {
                ((C0496o0o000OO) ((InterfaceC0502o0o00O0) this.OooO0Oo)).OooO0o0(c0060o00000o0.OooO00o, new C0504o0o00O0O(interfaceC1108oOOoo, true, false, c0060o00000o0.OooO00o, (InterfaceC0502o0o00O0) this.OooO0Oo));
            }
        }
    }

    public C0067o0000Ooo(C0325o0O0oOO0 c0325o0O0oOO0, C1221oOoOOooo c1221oOoOOooo) {
        this.OooO0Oo = new C1226oOoOo00O(this);
        this.OooO0OO = c0325o0O0oOO0;
        this.OooO0O0 = c1221oOoOOooo;
    }

    public C0067o0000Ooo(C0403o0OOooo c0403o0OOooo, C0404o0OOooo0 c0404o0OOooo0) {
        this.OooO0Oo = c0403o0OOooo;
        this.OooO0O0 = c0404o0OOooo0;
        this.OooO0OO = c0404o0OOooo0.OooO0o0 ? null : new boolean[c0403o0OOooo.OooO0oO];
    }
}


