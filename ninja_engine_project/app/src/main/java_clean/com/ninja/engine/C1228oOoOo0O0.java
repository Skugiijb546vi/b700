package com.ninja.engine;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOoOo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228oOoOo0O0 implements oO00000o {
    public static volatile C1228oOoOo0O0 OooO0o0;
    public final /* synthetic */ int OooO00o;
    public boolean OooO0O0;
    public final Object OooO0OO;
    public final Object OooO0Oo;

    public C1228oOoOo0O0() {
        this.OooO00o = 3;
        this.OooO0OO = Collections.newSetFromMap(new WeakHashMap());
        this.OooO0Oo = new HashSet();
    }

    public static C1228oOoOo0O0 OooO0OO(Context context) {
        if (OooO0o0 == null) {
            synchronized (C1228oOoOo0O0.class) {
                try {
                    if (OooO0o0 == null) {
                        OooO0o0 = new C1228oOoOo0O0(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return OooO0o0;
    }

    public boolean OooO00o(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        boolean z = true;
        if (interfaceC1098oOOoOo00 == null) {
            return true;
        }
        boolean remove = ((Set) this.OooO0OO).remove(interfaceC1098oOOoOo00);
        if (!((HashSet) this.OooO0Oo).remove(interfaceC1098oOOoOo00) && !remove) {
            z = false;
        }
        if (z) {
            interfaceC1098oOOoOo00.clear();
        }
        return z;
    }

    public void OooO0O0() {
        synchronized (this.OooO0OO) {
            try {
                this.OooO0O0 = true;
                Iterator it = ((ArrayList) this.OooO0Oo).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0625o0oo0OOo) it.next()).OooO00o();
                }
                ((ArrayList) this.OooO0Oo).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void OooO0Oo() {
        InterfaceC1192oOoOO0OO interfaceC1192oOoOO0OO = (InterfaceC1192oOoOO0OO) this.OooO0OO;
        androidx.lifecycle.OooO00o OooO0o02 = interfaceC1192oOoOO0OO.OooO0o0();
        if (OooO0o02.OooO0OO == EnumC0759oO0O0o.OooO0O0) {
            OooO0o02.OooO00o(new Recreator(interfaceC1192oOoOO0OO));
            final C0086o000Oo00 c0086o000Oo00 = (C0086o000Oo00) this.OooO0Oo;
            c0086o000Oo00.getClass();
            if (!c0086o000Oo00.OooO0OO) {
                OooO0o02.OooO00o(new InterfaceC1800ooOOOoOo() { // from class: com.ninja.engine.oOoOO0
                    @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
                    public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
                        boolean z;
                        C0086o000Oo00 c0086o000Oo002 = c0086o000Oo00;
                        AbstractC0809oO0OooOO.OooOOOo(c0086o000Oo002, "this$0");
                        if (oo0o0o0o == oO0O0O0o.ON_START) {
                            z = true;
                        } else if (oo0o0o0o == oO0O0O0o.ON_STOP) {
                            z = false;
                        } else {
                            return;
                        }
                        c0086o000Oo002.OooO0o0 = z;
                    }
                });
                c0086o000Oo00.OooO0OO = true;
                this.OooO0O0 = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public void OooO0o(Bundle bundle) {
        AbstractC0809oO0OooOO.OooOOOo(bundle, "outBundle");
        C0086o000Oo00 c0086o000Oo00 = (C0086o000Oo00) this.OooO0Oo;
        c0086o000Oo00.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0086o000Oo00.OooO00o;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1182oOoO c1182oOoO = (C1182oOoO) c0086o000Oo00.OooO0o;
        c1182oOoO.getClass();
        C1184oOoO0ooO c1184oOoO0ooO = new C1184oOoO0ooO(c1182oOoO);
        c1182oOoO.OooO0OO.put(c1184oOoO0ooO, Boolean.FALSE);
        while (c1184oOoO0ooO.hasNext()) {
            Map.Entry entry = (Map.Entry) c1184oOoO0ooO.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC1213oOoOOo0O) entry.getValue()).OooO00o());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public void OooO0o0(Bundle bundle) {
        boolean z;
        Bundle bundle2;
        if (!this.OooO0O0) {
            OooO0Oo();
        }
        androidx.lifecycle.OooO00o OooO0o02 = ((InterfaceC1192oOoOO0OO) this.OooO0OO).OooO0o0();
        if (OooO0o02.OooO0OO.compareTo(EnumC0759oO0O0o.OooO0Oo) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C0086o000Oo00 c0086o000Oo00 = (C0086o000Oo00) this.OooO0Oo;
            if (c0086o000Oo00.OooO0OO) {
                if (!c0086o000Oo00.OooO0Oo) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    c0086o000Oo00.OooO00o = bundle2;
                    c0086o000Oo00.OooO0Oo = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + OooO0o02.OooO0OO).toString());
    }

    public void OooO0oO() {
        Iterator it = AbstractC1401oo00OOO0.OooO0o0((Set) this.OooO0OO).iterator();
        while (it.hasNext()) {
            InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00 = (InterfaceC1098oOOoOo00) it.next();
            if (!interfaceC1098oOOoOo00.OooOO0O() && !interfaceC1098oOOoOo00.OooO0oO()) {
                interfaceC1098oOOoOo00.clear();
                if (!this.OooO0O0) {
                    interfaceC1098oOOoOo00.OooOO0();
                } else {
                    ((HashSet) this.OooO0Oo).add(interfaceC1098oOOoOo00);
                }
            }
        }
    }

    @Override // com.ninja.engine.oO00000o
    public Object get() {
        if (!this.OooO0O0) {
            AbstractC1091oOOoOOOO.OooO00o("Glide registry");
            this.OooO0O0 = true;
            try {
                return AbstractC1091oOOoOOOO.OooO0Oo((com.bumptech.glide.OooO00o) this.OooO0OO, (List) this.OooO0Oo);
            } finally {
                this.OooO0O0 = false;
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }

    public String toString() {
        switch (this.OooO00o) {
            case 3:
                return super.toString() + "{numRequests=" + ((Set) this.OooO0OO).size() + ", isPaused=" + this.OooO0O0 + "}";
            default:
                return super.toString();
        }
    }

    public C1228oOoOo0O0(Context context) {
        this.OooO00o = 0;
        this.OooO0Oo = new HashSet();
        C0325o0O0oOO0 c0325o0O0oOO0 = new C0325o0O0oOO0(new C0394o0OOoOo0(context, 4));
        C1221oOoOOooo c1221oOoOOooo = new C1221oOoOOooo(this);
        this.OooO0OO = Build.VERSION.SDK_INT >= 24 ? new C0067o0000Ooo(c0325o0O0oOO0, c1221oOoOOooo) : new C1248oOoOoo0O(context, c0325o0O0oOO0, c1221oOoOOooo);
    }

    public C1228oOoOo0O0(com.bumptech.glide.OooO00o oooO00o, ArrayList arrayList, AbstractC0694o0ooooo0 abstractC0694o0ooooo0) {
        this.OooO00o = 2;
        this.OooO0OO = oooO00o;
        this.OooO0Oo = arrayList;
    }

    public C1228oOoOo0O0(ExecutorC0478o0OooO0 executorC0478o0OooO0, InterfaceC0625o0oo0OOo o0o0ooo0) {
        this.OooO00o = 1;
        this.OooO0OO = new Object();
        this.OooO0Oo = new ArrayList();
    }

    public C1228oOoOo0O0(InterfaceC1192oOoOO0OO interfaceC1192oOoOO0OO) {
        this.OooO00o = 4;
        this.OooO0OO = interfaceC1192oOoOO0OO;
        this.OooO0Oo = new C0086o000Oo00();
    }
}


