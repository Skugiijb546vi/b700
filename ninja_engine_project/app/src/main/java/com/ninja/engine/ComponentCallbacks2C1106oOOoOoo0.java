package com.ninja.engine;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.ninja.engine.oOOoOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1106oOOoOoo0 implements ComponentCallbacks2, oO0O0Oo0 {
    public static final C1105oOOoOoo OooOO0O;
    public final CopyOnWriteArrayList OooO;
    public final com.bumptech.glide.OooO00o OooO00o;
    public final Context OooO0O0;
    public final oO0O0O OooO0OO;
    public final C1228oOoOo0O0 OooO0Oo;
    public final C1293oOooO00o OooO0o;
    public final C0601o0oOooO0 OooO0o0;
    public final o00000OO OooO0oO;
    public final InterfaceC1510oo0OOoo OooO0oo;
    public C1105oOOoOoo OooOO0;

    static {
        C1105oOOoOoo c1105oOOoOoo = (C1105oOOoOoo) new AbstractC0186o00Ooooo().OooO0OO(Bitmap.class);
        c1105oOOoOoo.OooOo00 = true;
        OooOO0O = c1105oOOoOoo;
        ((C1105oOOoOoo) new AbstractC0186o00Ooooo().OooO0OO(C0680o0oooOO.class)).OooOo00 = true;
        C1105oOOoOoo c1105oOOoOoo2 = (C1105oOOoOoo) ((C1105oOOoOoo) ((C1105oOOoOoo) new AbstractC0186o00Ooooo().OooO0Oo(C0395o0OOoo.OooO0Oo)).OooO()).OooOOO0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.ninja.engine.oO0O0Oo0, com.ninja.engine.oo0OOoo] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.ninja.engine.oO0O0O] */
    public ComponentCallbacks2C1106oOOoOoo0(com.bumptech.glide.OooO00o oooO00o, oO0O0O oo0o0o, C0601o0oOooO0 c0601o0oOooO0, Context context) {
        boolean z;
        C0358o0OOO0oo c0358o0OOO0oo;
        C1228oOoOo0O0 c1228oOoOo0O0 = new C1228oOoOo0O0();
        C0455o0OoOo00 c0455o0OoOo00 = oooO00o.OooO0o;
        this.OooO0o = new C1293oOooO00o();
        o00000OO o00000oo = new o00000OO(12, this);
        this.OooO0oO = o00000oo;
        this.OooO00o = oooO00o;
        this.OooO0OO = oo0o0o;
        this.OooO0o0 = c0601o0oOooO0;
        this.OooO0Oo = c1228oOoOo0O0;
        this.OooO0O0 = context;
        Context applicationContext = context.getApplicationContext();
        C1104oOOoOoOo c1104oOOoOoOo = new C1104oOOoOoOo(this, c1228oOoOo0O0);
        c0455o0OoOo00.getClass();
        if (AbstractC0809oO0OooOO.OooOOo0(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        Log.isLoggable("ConnectivityMonitor", 3);
        if (z) {
            c0358o0OOO0oo = new C0358o0OOO0oo(applicationContext, c1104oOOoOoOo);
        } else {
            c0358o0OOO0oo = new Object();
        }
        this.OooO0oo = c0358o0OOO0oo;
        synchronized (oooO00o.OooO0oO) {
            if (!oooO00o.OooO0oO.contains(this)) {
                oooO00o.OooO0oO.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        char[] cArr = AbstractC1401oo00OOO0.OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            AbstractC1401oo00OOO0.OooO0o().post(o00000oo);
        } else {
            oo0o0o.OooOO0o(this);
        }
        oo0o0o.OooOO0o(c0358o0OOO0oo);
        this.OooO = new CopyOnWriteArrayList(oooO00o.OooO0OO.OooO0o0);
        OooOOOo(oooO00o.OooO0OO.OooO00o());
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final synchronized void OooO0O0() {
        this.OooO0o.OooO0O0();
        OooOOO();
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final synchronized void OooOO0() {
        OooOOOO();
        this.OooO0o.OooOO0();
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final synchronized void OooOO0O() {
        this.OooO0o.OooOO0O();
        OooOOO0();
        C1228oOoOo0O0 c1228oOoOo0O0 = this.OooO0Oo;
        Iterator it = AbstractC1401oo00OOO0.OooO0o0((Set) c1228oOoOo0O0.OooO0OO).iterator();
        while (it.hasNext()) {
            c1228oOoOo0O0.OooO00o((InterfaceC1098oOOoOo00) it.next());
        }
        ((HashSet) c1228oOoOo0O0.OooO0Oo).clear();
        this.OooO0OO.OooOOO0(this);
        this.OooO0OO.OooOOO0(this.OooO0oo);
        AbstractC1401oo00OOO0.OooO0o().removeCallbacks(this.OooO0oO);
        this.OooO00o.OooO0OO(this);
    }

    public final void OooOO0o(InterfaceC1292oOooO00O interfaceC1292oOooO00O) {
        if (interfaceC1292oOooO00O == null) {
            return;
        }
        boolean OooOOo0 = OooOOo0(interfaceC1292oOooO00O);
        InterfaceC1098oOOoOo00 OooO0o = interfaceC1292oOooO00O.OooO0o();
        if (!OooOOo0) {
            com.bumptech.glide.OooO00o oooO00o = this.OooO00o;
            synchronized (oooO00o.OooO0oO) {
                try {
                    Iterator it = oooO00o.OooO0oO.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ComponentCallbacks2C1106oOOoOoo0) it.next()).OooOOo0(interfaceC1292oOooO00O)) {
                            }
                        } else if (OooO0o != null) {
                            interfaceC1292oOooO00O.OooO0OO(null);
                            OooO0o.clear();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void OooOOO() {
        C1228oOoOo0O0 c1228oOoOo0O0 = this.OooO0Oo;
        c1228oOoOo0O0.OooO0O0 = true;
        Iterator it = AbstractC1401oo00OOO0.OooO0o0((Set) c1228oOoOo0O0.OooO0OO).iterator();
        while (it.hasNext()) {
            InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00 = (InterfaceC1098oOOoOo00) it.next();
            if (interfaceC1098oOOoOo00.isRunning()) {
                interfaceC1098oOOoOo00.OooO();
                ((HashSet) c1228oOoOo0O0.OooO0Oo).add(interfaceC1098oOOoOo00);
            }
        }
    }

    public final synchronized void OooOOO0() {
        try {
            Iterator it = AbstractC1401oo00OOO0.OooO0o0(this.OooO0o.OooO00o).iterator();
            while (it.hasNext()) {
                OooOO0o((InterfaceC1292oOooO00O) it.next());
            }
            this.OooO0o.OooO00o.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooOOOO() {
        C1228oOoOo0O0 c1228oOoOo0O0 = this.OooO0Oo;
        c1228oOoOo0O0.OooO0O0 = false;
        Iterator it = AbstractC1401oo00OOO0.OooO0o0((Set) c1228oOoOo0O0.OooO0OO).iterator();
        while (it.hasNext()) {
            InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00 = (InterfaceC1098oOOoOo00) it.next();
            if (!interfaceC1098oOOoOo00.OooOO0O() && !interfaceC1098oOOoOo00.isRunning()) {
                interfaceC1098oOOoOo00.OooOO0();
            }
        }
        ((HashSet) c1228oOoOo0O0.OooO0Oo).clear();
    }

    public final synchronized void OooOOOo(C1105oOOoOoo c1105oOOoOoo) {
        C1105oOOoOoo c1105oOOoOoo2 = (C1105oOOoOoo) c1105oOOoOoo.clone();
        if (c1105oOOoOoo2.OooOo00 && !c1105oOOoOoo2.OooOo0O) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        c1105oOOoOoo2.OooOo0O = true;
        c1105oOOoOoo2.OooOo00 = true;
        this.OooOO0 = c1105oOOoOoo2;
    }

    public final synchronized boolean OooOOo0(InterfaceC1292oOooO00O interfaceC1292oOooO00O) {
        InterfaceC1098oOOoOo00 OooO0o = interfaceC1292oOooO00O.OooO0o();
        if (OooO0o == null) {
            return true;
        }
        if (this.OooO0Oo.OooO00o(OooO0o)) {
            this.OooO0o.OooO00o.remove(interfaceC1292oOooO00O);
            interfaceC1292oOooO00O.OooO0OO(null);
            return true;
        }
        return false;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.OooO0Oo + ", treeNode=" + this.OooO0o0 + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
