package com.ninja.engine;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.app.framework.core.system.JarConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.ninja.engine.o0oOoooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606o0oOoooO {
    public boolean OooO0O0;
    public ArrayList OooO0Oo;
    public ArrayList OooO0o0;
    public androidx.activity.OooO0O0 OooO0oO;
    public final C0415o0Oo0O0O OooOO0o;
    public final C0592o0oOoOo OooOOO;
    public final CopyOnWriteArrayList OooOOO0;
    public final C0592o0oOoOo OooOOOO;
    public final C0592o0oOoOo OooOOOo;
    public final C0599o0oOoo0O OooOOo;
    public final C0592o0oOoOo OooOOo0;
    public int OooOOoo;
    public final C0596o0oOoo OooOo;
    public AbstractC0692o0ooooOo OooOo0;
    public C0589o0oOoOO0 OooOo00;
    public AbstractComponentCallbacksC0593o0oOoOo0 OooOo0O;
    public AbstractComponentCallbacksC0593o0oOoOo0 OooOo0o;
    public C0415o0Oo0O0O OooOoO;
    public final C0601o0oOooO0 OooOoO0;
    public C0415o0Oo0O0O OooOoOO;
    public ArrayDeque OooOoo;
    public C0415o0Oo0O0O OooOoo0;
    public boolean OooOooO;
    public boolean OooOooo;
    public ArrayList Oooo0;
    public boolean Oooo000;
    public boolean Oooo00O;
    public boolean Oooo00o;
    public ArrayList Oooo0O0;
    public ArrayList Oooo0OO;
    public final o00000OO Oooo0o;
    public o0oo0000 Oooo0o0;
    public final ArrayList OooO00o = new ArrayList();
    public final oOO00OOO OooO0OO = new oOO00OOO(4);
    public final LayoutInflater$Factory2C0591o0oOoOOo OooO0o = new LayoutInflater$Factory2C0591o0oOoOOo(this);
    public final C0597o0oOoo0 OooO0oo = new C0597o0oOoo0(this);
    public final AtomicInteger OooO = new AtomicInteger();
    public final Map OooOO0 = Collections.synchronizedMap(new HashMap());
    public final Map OooOO0O = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ninja.engine.o0oOoOo] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.ninja.engine.o0oOoOo] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.ninja.engine.o0oOoOo] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.ninja.engine.o0oOoOo] */
    public C0606o0oOoooO() {
        Collections.synchronizedMap(new HashMap());
        this.OooOO0o = new C0415o0Oo0O0O(this);
        this.OooOOO0 = new CopyOnWriteArrayList();
        this.OooOOO = new C0592o0oOoOo() {
            @Override // com.ninja.engine.InterfaceC0319o0O0o0oo
            public final void OooO00o(Object obj) {
                Configuration configuration = (Configuration) obj;
                if (C0606o0oOoooO.this.Oooo00O()) {
                    C0606o0oOoooO.this.OooO0oo(false);
                }
            }
        };
        this.OooOOOO = new C0592o0oOoOo() {
            @Override // com.ninja.engine.InterfaceC0319o0O0o0oo
            public final void OooO00o(Object obj) {
                Integer num = (Integer) obj;
                if (C0606o0oOoooO.this.Oooo00O() && num.intValue() == 80) {
                    C0606o0oOoooO.this.OooOO0o(false);
                }
            }
        };
        this.OooOOOo = new C0592o0oOoOo() {
            @Override // com.ninja.engine.InterfaceC0319o0O0o0oo
            public final void OooO00o(Object obj) {
                C0908oOO00OOo c0908oOO00OOo = (C0908oOO00OOo) obj;
                if (C0606o0oOoooO.this.Oooo00O()) {
                    C0606o0oOoooO.this.OooOOO0(c0908oOO00OOo.OooO00o, false);
                }
            }
        };
        this.OooOOo0 = new C0592o0oOoOo() {
            @Override // com.ninja.engine.InterfaceC0319o0O0o0oo
            public final void OooO00o(Object obj) {
                C1037oOOOoo00 c1037oOOOoo00 = (C1037oOOOoo00) obj;
                if (C0606o0oOoooO.this.Oooo00O()) {
                    C0606o0oOoooO.this.OooOOo(c1037oOOOoo00.OooO00o, false);
                }
            }
        };
        this.OooOOo = new C0599o0oOoo0O(this);
        this.OooOOoo = -1;
        this.OooOo = new C0596o0oOoo(this);
        this.OooOoO0 = new C0601o0oOooO0(17);
        this.OooOoo = new ArrayDeque();
        this.Oooo0o = new o00000OO(11, this);
    }

    public static boolean Oooo0(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (abstractComponentCallbacksC0593o0oOoOo0 == null) {
            return true;
        }
        C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOOo;
        if (abstractComponentCallbacksC0593o0oOoOo0.equals(c0606o0oOoooO.OooOo0o) && Oooo0(c0606o0oOoooO.OooOo0O)) {
            return true;
        }
        return false;
    }

    public static boolean Oooo000(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        Iterator it = abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooO0OO.OooOOo().iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = (AbstractComponentCallbacksC0593o0oOoOo0) it.next();
            if (abstractComponentCallbacksC0593o0oOoOo02 != null) {
                z = Oooo000(abstractComponentCallbacksC0593o0oOoOo02);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean Oooo00o(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (abstractComponentCallbacksC0593o0oOoOo0 == null) {
            return true;
        }
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo0 && (abstractComponentCallbacksC0593o0oOoOo0.OooOOo == null || Oooo00o(abstractComponentCallbacksC0593o0oOoOo0.OooOo0))) {
            return true;
        }
        return false;
    }

    public final boolean OooO() {
        boolean z;
        if (this.OooOOoo < 1) {
            return false;
        }
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                if (!abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
                    z = abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooO();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.fragment.app.OooO00o OooO00o(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        String str = abstractComponentCallbacksC0593o0oOoOo0.Oooo0o0;
        if (str != null) {
            AbstractC0615o0oo00o0.OooO0O0(abstractComponentCallbacksC0593o0oOoOo0, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0593o0oOoOo0.toString();
        }
        androidx.fragment.app.OooO00o OooO0o = OooO0o(abstractComponentCallbacksC0593o0oOoOo0);
        abstractComponentCallbacksC0593o0oOoOo0.OooOOo = this;
        oOO00OOO ooo00ooo = this.OooO0OO;
        ooo00ooo.OooOo0(OooO0o);
        if (!abstractComponentCallbacksC0593o0oOoOo0.OooOoO) {
            ooo00ooo.OooO0o0(abstractComponentCallbacksC0593o0oOoOo0);
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0o = false;
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo == null) {
                abstractComponentCallbacksC0593o0oOoOo0.Oooo0 = false;
            }
            if (Oooo000(abstractComponentCallbacksC0593o0oOoOo0)) {
                this.OooOooO = true;
            }
        }
        return OooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(C0589o0oOoOO0 c0589o0oOoOO0, AbstractC0692o0ooooOo abstractC0692o0ooooOo, AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        o0oo0000 o0oo0000Var;
        String str;
        InterfaceC0760oO0O0o0O c0589o0oOoOO02;
        if (this.OooOo00 == null) {
            this.OooOo00 = c0589o0oOoOO0;
            this.OooOo0 = abstractC0692o0ooooOo;
            this.OooOo0O = abstractComponentCallbacksC0593o0oOoOo0;
            CopyOnWriteArrayList copyOnWriteArrayList = this.OooOOO0;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                copyOnWriteArrayList.add(new C0600o0oOooO(abstractComponentCallbacksC0593o0oOoOo0));
            } else if (c0589o0oOoOO0 instanceof InterfaceC0609o0oo000O) {
                copyOnWriteArrayList.add(c0589o0oOoOO0);
            }
            if (this.OooOo0O != null) {
                OoooOoO();
            }
            if (c0589o0oOoOO0 instanceof InterfaceC0963oOO0ooOO) {
                androidx.activity.OooO0O0 OooOOO0 = c0589o0oOoOO0.Oooo0O0.OooOOO0();
                this.OooO0oO = OooOOO0;
                if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                    c0589o0oOoOO02 = abstractComponentCallbacksC0593o0oOoOo0;
                } else {
                    c0589o0oOoOO02 = c0589o0oOoOO0;
                }
                OooOOO0.OooO00o(c0589o0oOoOO02, this.OooO0oo);
            }
            boolean z = false;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                o0oo0000 o0oo0000Var2 = abstractComponentCallbacksC0593o0oOoOo0.OooOOo.Oooo0o0;
                HashMap hashMap = o0oo0000Var2.OooO0Oo;
                o0oo0000 o0oo0000Var3 = (o0oo0000) hashMap.get(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0);
                if (o0oo0000Var3 == null) {
                    o0oo0000Var3 = new o0oo0000(o0oo0000Var2.OooO0o);
                    hashMap.put(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0, o0oo0000Var3);
                }
                this.Oooo0o0 = o0oo0000Var3;
            } else if (c0589o0oOoOO0 instanceof InterfaceC1468oo0O0OOo) {
                C1467oo0O0OOO OooO0Oo = c0589o0oOoOO0.Oooo0O0.OooO0Oo();
                AbstractC0809oO0OooOO.OooOOOo(OooO0Oo, "store");
                C0337o0O0ooOO c0337o0O0ooOO = C0337o0O0ooOO.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(c0337o0O0ooOO, "defaultCreationExtras");
                String canonicalName = o0oo0000.class.getCanonicalName();
                if (canonicalName != null) {
                    String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
                    AbstractC0809oO0OooOO.OooOOOo(concat, "key");
                    LinkedHashMap linkedHashMap = OooO0Oo.OooO00o;
                    AbstractC1466oo0O0OO0 abstractC1466oo0O0OO0 = (AbstractC1466oo0O0OO0) linkedHashMap.get(concat);
                    if (o0oo0000.class.isInstance(abstractC1466oo0O0OO0)) {
                        AbstractC0809oO0OooOO.OooOOO0(abstractC1466oo0O0OO0, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(c0337o0O0ooOO.OooO00o);
                        linkedHashMap2.put(C0455o0OoOo00.OooO, concat);
                        try {
                            o0oo0000Var = new o0oo0000(true);
                        } catch (AbstractMethodError unused) {
                            o0oo0000Var = new o0oo0000(true);
                        }
                        abstractC1466oo0O0OO0 = o0oo0000Var;
                        AbstractC1466oo0O0OO0 abstractC1466oo0O0OO02 = (AbstractC1466oo0O0OO0) linkedHashMap.put(concat, abstractC1466oo0O0OO0);
                        if (abstractC1466oo0O0OO02 != null) {
                            abstractC1466oo0O0OO02.OooO00o();
                        }
                    }
                    this.Oooo0o0 = (o0oo0000) abstractC1466oo0O0OO0;
                } else {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
            } else {
                this.Oooo0o0 = new o0oo0000(false);
            }
            o0oo0000 o0oo0000Var4 = this.Oooo0o0;
            o0oo0000Var4.OooO0oo = (this.OooOooo || this.Oooo000) ? true : true;
            this.OooO0OO.OooO0Oo = o0oo0000Var4;
            C0589o0oOoOO0 c0589o0oOoOO03 = this.OooOo00;
            if ((c0589o0oOoOO03 instanceof InterfaceC1192oOoOO0OO) && abstractComponentCallbacksC0593o0oOoOo0 == null) {
                C0086o000Oo00 OooO00o = c0589o0oOoOO03.OooO00o();
                OooO00o.OooO0o0("android:support:fragments", new o0O0OOO(2, this));
                Bundle OooO0OO = OooO00o.OooO0OO("android:support:fragments");
                if (OooO0OO != null) {
                    OoooO00(OooO0OO);
                }
            }
            C0589o0oOoOO0 c0589o0oOoOO04 = this.OooOo00;
            if (c0589o0oOoOO04 instanceof o0000O0O) {
                C0297o0O0OOo c0297o0O0OOo = c0589o0oOoOO04.Oooo0O0.OooOO0;
                if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                    str = AbstractC1230oOoOo0o.OooO(new StringBuilder(), abstractComponentCallbacksC0593o0oOoOo0.OooO0o0, ":");
                } else {
                    str = "";
                }
                String OooOO0o = AbstractC1230oOoOo0o.OooOO0o("FragmentManager:", str);
                this.OooOoO = c0297o0O0OOo.OooO0O0(AbstractC1230oOoOo0o.OooO0oO(OooOO0o, "StartActivityForResult"), new C0072o0000oO(1), new C0331o0O0oo(14, this));
                this.OooOoOO = c0297o0O0OOo.OooO0O0(AbstractC1230oOoOo0o.OooO0oO(OooOO0o, "StartIntentSenderForResult"), new C0072o0000oO(2), new C0594o0oOoOoO(this, 1));
                this.OooOoo0 = c0297o0O0OOo.OooO0O0(AbstractC1230oOoOo0o.OooO0oO(OooOO0o, "RequestPermissions"), new C0072o0000oO(0), new C0594o0oOoOoO(this, 0));
            }
            C0589o0oOoOO0 c0589o0oOoOO05 = this.OooOo00;
            if (c0589o0oOoOO05 instanceof InterfaceC0964oOO0ooOo) {
                c0589o0oOoOO05.o00Oo0(this.OooOOO);
            }
            C0589o0oOoOO0 c0589o0oOoOO06 = this.OooOo00;
            if (c0589o0oOoOO06 instanceof InterfaceC1024oOOOoO) {
                c0589o0oOoOO06.o00ooo(this.OooOOOO);
            }
            C0589o0oOoOO0 c0589o0oOoOO07 = this.OooOo00;
            if (c0589o0oOoOO07 instanceof InterfaceC0968oOO0oooo) {
                c0589o0oOoOO07.o00Ooo(this.OooOOOo);
            }
            C0589o0oOoOO0 c0589o0oOoOO08 = this.OooOo00;
            if (c0589o0oOoOO08 instanceof oOO) {
                c0589o0oOoOO08.o00o0O(this.OooOOo0);
            }
            C0589o0oOoOO0 c0589o0oOoOO09 = this.OooOo00;
            if ((c0589o0oOoOO09 instanceof InterfaceC0890oO0ooO00) && abstractComponentCallbacksC0593o0oOoOo0 == null) {
                c0589o0oOoOO09.o00O0O(this.OooOOo);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void OooO0OO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoO) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOoO = false;
            if (!abstractComponentCallbacksC0593o0oOoOo0.OooOO0O) {
                this.OooO0OO.OooO0o0(abstractComponentCallbacksC0593o0oOoOo0);
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0593o0oOoOo0.toString();
                }
                if (Oooo000(abstractComponentCallbacksC0593o0oOoOo0)) {
                    this.OooOooO = true;
                }
            }
        }
    }

    public final void OooO0Oo() {
        this.OooO0O0 = false;
        this.Oooo0O0.clear();
        this.Oooo0.clear();
    }

    public final androidx.fragment.app.OooO00o OooO0o(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        String str = abstractComponentCallbacksC0593o0oOoOo0.OooO0o0;
        oOO00OOO ooo00ooo = this.OooO0OO;
        androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) ((HashMap) ooo00ooo.OooO0O0).get(str);
        if (oooO00o != null) {
            return oooO00o;
        }
        androidx.fragment.app.OooO00o oooO00o2 = new androidx.fragment.app.OooO00o(this.OooOO0o, ooo00ooo, abstractComponentCallbacksC0593o0oOoOo0);
        oooO00o2.OooOOO0(this.OooOo00.Oooo00O.getClassLoader());
        oooO00o2.OooO0o0 = this.OooOOoo;
        return oooO00o2;
    }

    public final HashSet OooO0o0() {
        HashSet hashSet = new HashSet();
        Iterator it = this.OooO0OO.OooOOo0().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((androidx.fragment.app.OooO00o) it.next()).OooO0OO.OooOooO;
            if (viewGroup != null) {
                hashSet.add(o0OOo000.OooO0oO(viewGroup, OooOooO()));
            }
        }
        return hashSet;
    }

    public final void OooO0oO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        if (!abstractComponentCallbacksC0593o0oOoOo0.OooOoO) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOoO = true;
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOO0O) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0593o0oOoOo0.toString();
                }
                oOO00OOO ooo00ooo = this.OooO0OO;
                synchronized (((ArrayList) ooo00ooo.OooO00o)) {
                    ((ArrayList) ooo00ooo.OooO00o).remove(abstractComponentCallbacksC0593o0oOoOo0);
                }
                abstractComponentCallbacksC0593o0oOoOo0.OooOO0O = false;
                if (Oooo000(abstractComponentCallbacksC0593o0oOoOo0)) {
                    this.OooOooO = true;
                }
                OoooOOO(abstractComponentCallbacksC0593o0oOoOo0);
            }
        }
    }

    public final void OooO0oo(boolean z) {
        if (z && (this.OooOo00 instanceof InterfaceC0964oOO0ooOo)) {
            OoooOo0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOoo = true;
                if (z) {
                    abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooO0oo(true);
                }
            }
        }
    }

    public final boolean OooOO0() {
        boolean z;
        if (this.OooOOoo < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null && Oooo00o(abstractComponentCallbacksC0593o0oOoOo0)) {
                if (!abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
                    z = abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOO0();
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0593o0oOoOo0);
                    z2 = true;
                }
            }
        }
        if (this.OooO0o0 != null) {
            for (int i = 0; i < this.OooO0o0.size(); i++) {
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = (AbstractComponentCallbacksC0593o0oOoOo0) this.OooO0o0.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0593o0oOoOo02)) {
                    abstractComponentCallbacksC0593o0oOoOo02.getClass();
                }
            }
        }
        this.OooO0o0 = arrayList;
        return z2;
    }

    public final void OooOO0O() {
        Integer num;
        Integer num2;
        Integer num3;
        boolean z = true;
        this.Oooo00O = true;
        OooOo(true);
        Iterator it = OooO0o0().iterator();
        while (it.hasNext()) {
            ((o0OOo000) it.next()).OooO0o();
        }
        C0589o0oOoOO0 c0589o0oOoOO0 = this.OooOo00;
        boolean z2 = c0589o0oOoOO0 instanceof InterfaceC1468oo0O0OOo;
        oOO00OOO ooo00ooo = this.OooO0OO;
        if (z2) {
            z = ((o0oo0000) ooo00ooo.OooO0Oo).OooO0oO;
        } else {
            Context context = c0589o0oOoOO0.Oooo00O;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            for (Object obj_c0178o00Ooo00 : this.OooOO0.values()) {
                C0178o00Ooo00 c0178o00Ooo00 = (C0178o00Ooo00) obj_c0178o00Ooo00;
                for (Object obj_str : c0178o00Ooo00.OooO00o) {
                    String str = (String) obj_str;
                    o0oo0000 o0oo0000Var = (o0oo0000) ooo00ooo.OooO0Oo;
                    o0oo0000Var.getClass();
                    Log.isLoggable("FragmentManager", 3);
                    o0oo0000Var.OooO0O0(str);
                }
            }
        }
        OooOo00(-1);
        C0589o0oOoOO0 c0589o0oOoOO02 = this.OooOo00;
        if (c0589o0oOoOO02 instanceof InterfaceC1024oOOOoO) {
            c0589o0oOoOO02.o0ooOOo(this.OooOOOO);
        }
        C0589o0oOoOO0 c0589o0oOoOO03 = this.OooOo00;
        if (c0589o0oOoOO03 instanceof InterfaceC0964oOO0ooOo) {
            c0589o0oOoOO03.o00oO0o(this.OooOOO);
        }
        C0589o0oOoOO0 c0589o0oOoOO04 = this.OooOo00;
        if (c0589o0oOoOO04 instanceof InterfaceC0968oOO0oooo) {
            c0589o0oOoOO04.o00oO0O(this.OooOOOo);
        }
        C0589o0oOoOO0 c0589o0oOoOO05 = this.OooOo00;
        if (c0589o0oOoOO05 instanceof oOO) {
            c0589o0oOoOO05.o0ooOO0(this.OooOOo0);
        }
        C0589o0oOoOO0 c0589o0oOoOO06 = this.OooOo00;
        if (c0589o0oOoOO06 instanceof InterfaceC0890oO0ooO00) {
            c0589o0oOoOO06.oo000o(this.OooOOo);
        }
        this.OooOo00 = null;
        this.OooOo0 = null;
        this.OooOo0O = null;
        if (this.OooO0oO != null) {
            Iterator it2 = this.OooO0oo.OooO0O0.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0266o00ooOO0) it2.next()).cancel();
            }
            this.OooO0oO = null;
        }
        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooOoO;
        if (c0415o0Oo0O0O != null) {
            C0297o0O0OOo c0297o0O0OOo = (C0297o0O0OOo) c0415o0Oo0O0O.OooO0OO;
            ArrayList arrayList = c0297o0O0OOo.OooO0Oo;
            String str2 = (String) c0415o0Oo0O0O.OooO0O0;
            if (!arrayList.contains(str2) && (num3 = (Integer) c0297o0O0OOo.OooO0O0.remove(str2)) != null) {
                c0297o0O0OOo.OooO00o.remove(num3);
            }
            c0297o0O0OOo.OooO0o0.remove(str2);
            HashMap hashMap = c0297o0O0OOo.OooO0o;
            if (hashMap.containsKey(str2)) {
                Objects.toString(hashMap.get(str2));
                hashMap.remove(str2);
            }
            Bundle bundle = c0297o0O0OOo.OooO0oO;
            if (bundle.containsKey(str2)) {
                Objects.toString(bundle.getParcelable(str2));
                bundle.remove(str2);
            }
            AbstractC1230oOoOo0o.OooOO0O(c0297o0O0OOo.OooO0OO.get(str2));
            C0415o0Oo0O0O c0415o0Oo0O0O2 = this.OooOoOO;
            C0297o0O0OOo c0297o0O0OOo2 = (C0297o0O0OOo) c0415o0Oo0O0O2.OooO0OO;
            ArrayList arrayList2 = c0297o0O0OOo2.OooO0Oo;
            String str3 = (String) c0415o0Oo0O0O2.OooO0O0;
            if (!arrayList2.contains(str3) && (num2 = (Integer) c0297o0O0OOo2.OooO0O0.remove(str3)) != null) {
                c0297o0O0OOo2.OooO00o.remove(num2);
            }
            c0297o0O0OOo2.OooO0o0.remove(str3);
            HashMap hashMap2 = c0297o0O0OOo2.OooO0o;
            if (hashMap2.containsKey(str3)) {
                Objects.toString(hashMap2.get(str3));
                hashMap2.remove(str3);
            }
            Bundle bundle2 = c0297o0O0OOo2.OooO0oO;
            if (bundle2.containsKey(str3)) {
                Objects.toString(bundle2.getParcelable(str3));
                bundle2.remove(str3);
            }
            AbstractC1230oOoOo0o.OooOO0O(c0297o0O0OOo2.OooO0OO.get(str3));
            C0415o0Oo0O0O c0415o0Oo0O0O3 = this.OooOoo0;
            C0297o0O0OOo c0297o0O0OOo3 = (C0297o0O0OOo) c0415o0Oo0O0O3.OooO0OO;
            ArrayList arrayList3 = c0297o0O0OOo3.OooO0Oo;
            String str4 = (String) c0415o0Oo0O0O3.OooO0O0;
            if (!arrayList3.contains(str4) && (num = (Integer) c0297o0O0OOo3.OooO0O0.remove(str4)) != null) {
                c0297o0O0OOo3.OooO00o.remove(num);
            }
            c0297o0O0OOo3.OooO0o0.remove(str4);
            HashMap hashMap3 = c0297o0O0OOo3.OooO0o;
            if (hashMap3.containsKey(str4)) {
                Objects.toString(hashMap3.get(str4));
                hashMap3.remove(str4);
            }
            Bundle bundle3 = c0297o0O0OOo3.OooO0oO;
            if (bundle3.containsKey(str4)) {
                Objects.toString(bundle3.getParcelable(str4));
                bundle3.remove(str4);
            }
            AbstractC1230oOoOo0o.OooOO0O(c0297o0O0OOo3.OooO0OO.get(str4));
        }
    }

    public final void OooOO0o(boolean z) {
        if (z && (this.OooOo00 instanceof InterfaceC1024oOOOoO)) {
            OoooOo0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOoo = true;
                if (z) {
                    abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOO0o(true);
                }
            }
        }
    }

    public final void OooOOO() {
        Iterator it = this.OooO0OO.OooOOo().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = (AbstractComponentCallbacksC0593o0oOoOo0) it.next();
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOOo0();
                abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOOO();
            }
        }
    }

    public final void OooOOO0(boolean z, boolean z2) {
        if (z2 && (this.OooOo00 instanceof InterfaceC0968oOO0oooo)) {
            OoooOo0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null && z2) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOOO0(z, true);
            }
        }
    }

    public final boolean OooOOOO() {
        boolean z;
        if (this.OooOOoo < 1) {
            return false;
        }
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                if (!abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
                    z = abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOOOO();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooOOOo() {
        if (this.OooOOoo < 1) {
            return;
        }
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null && !abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOOOo();
            }
        }
    }

    public final void OooOOo(boolean z, boolean z2) {
        if (z2 && (this.OooOo00 instanceof oOO)) {
            OoooOo0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null && z2) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOOo(z, true);
            }
        }
    }

    public final void OooOOo0(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            if (abstractComponentCallbacksC0593o0oOoOo0.equals(this.OooO0OO.OooOOO(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0))) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOOo.getClass();
                boolean Oooo0 = Oooo0(abstractComponentCallbacksC0593o0oOoOo0);
                Boolean bool = abstractComponentCallbacksC0593o0oOoOo0.OooOO0;
                if (bool == null || bool.booleanValue() != Oooo0) {
                    abstractComponentCallbacksC0593o0oOoOo0.OooOO0 = Boolean.valueOf(Oooo0);
                    C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOo00;
                    c0606o0oOoooO.OoooOoO();
                    c0606o0oOoooO.OooOOo0(c0606o0oOoooO.OooOo0o);
                }
            }
        }
    }

    public final boolean OooOOoo() {
        boolean z;
        if (this.OooOOoo < 1) {
            return false;
        }
        boolean z2 = false;
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null && Oooo00o(abstractComponentCallbacksC0593o0oOoOo0)) {
                if (!abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
                    z = abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOOoo();
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final boolean OooOo(boolean z) {
        boolean z2;
        OooOo0o(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.Oooo0;
            ArrayList arrayList2 = this.Oooo0O0;
            synchronized (this.OooO00o) {
                if (this.OooO00o.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.OooO00o.size();
                    z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((InterfaceC0605o0oOooo0) this.OooO00o.get(i)).OooO00o(arrayList, arrayList2);
                    }
                    this.OooO00o.clear();
                    this.OooOo00.Oooo00o.removeCallbacks(this.Oooo0o);
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.OooO0O0 = true;
            try {
                Oooo(this.Oooo0, this.Oooo0O0);
            } finally {
                OooO0Oo();
            }
        }
        OoooOoO();
        if (this.Oooo00o) {
            this.Oooo00o = false;
            OoooOOo();
        }
        ((HashMap) this.OooO0OO.OooO0O0).values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void OooOo0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String OooO0oO = AbstractC1230oOoOo0o.OooO0oO(str, "    ");
        oOO00OOO ooo00ooo = this.OooO0OO;
        ooo00ooo.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) ooo00ooo.OooO0O0;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Object obj_ : hashMap.values()) { androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) obj_;
                printWriter.print(str);
                if (oooO00o != null) {
                    AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
                    printWriter.println(abstractComponentCallbacksC0593o0oOoOo0);
                    abstractComponentCallbacksC0593o0oOoOo0.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0593o0oOoOo0.OooOo0O));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0593o0oOoOo0.OooOo0o));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooOo);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooO00o);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooOOo0);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooOO0O);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooOO0o);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooOOO0);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooOOO);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooOoO0);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooOoO);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooOoo0);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0593o0oOoOo0.OooOoOO);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.Oooo00O);
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooOOo != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooOOo);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooOOoo != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooOOoo);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooOo0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooOo0);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooO0o != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooO0o);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooO0O0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooO0O0);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooO0OO != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooO0OO);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo);
                    }
                    Object obj = abstractComponentCallbacksC0593o0oOoOo0.OooO0oO;
                    if (obj == null) {
                        C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOOo;
                        obj = (c0606o0oOoooO == null || (str2 = abstractComponentCallbacksC0593o0oOoOo0.OooO0oo) == null) ? null : c0606o0oOoooO.OooO0OO.OooOOO(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooO);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0586o0oOoO0 c0586o0oOoO0 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                    printWriter.println(c0586o0oOoO0 == null ? false : c0586o0oOoO0.OooO00o);
                    C0586o0oOoO0 c0586o0oOoO02 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                    if ((c0586o0oOoO02 == null ? 0 : c0586o0oOoO02.OooO0O0) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0586o0oOoO0 c0586o0oOoO03 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                        printWriter.println(c0586o0oOoO03 == null ? 0 : c0586o0oOoO03.OooO0O0);
                    }
                    C0586o0oOoO0 c0586o0oOoO04 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                    if ((c0586o0oOoO04 == null ? 0 : c0586o0oOoO04.OooO0OO) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0586o0oOoO0 c0586o0oOoO05 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                        printWriter.println(c0586o0oOoO05 == null ? 0 : c0586o0oOoO05.OooO0OO);
                    }
                    C0586o0oOoO0 c0586o0oOoO06 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                    if ((c0586o0oOoO06 == null ? 0 : c0586o0oOoO06.OooO0Oo) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0586o0oOoO0 c0586o0oOoO07 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                        printWriter.println(c0586o0oOoO07 == null ? 0 : c0586o0oOoO07.OooO0Oo);
                    }
                    C0586o0oOoO0 c0586o0oOoO08 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                    if ((c0586o0oOoO08 == null ? 0 : c0586o0oOoO08.OooO0o0) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0586o0oOoO0 c0586o0oOoO09 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                        printWriter.println(c0586o0oOoO09 == null ? 0 : c0586o0oOoO09.OooO0o0);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooOooO != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooOooO);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0593o0oOoOo0.OooOooo);
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooO() != null) {
                        C0415o0Oo0O0O.OooOoo(abstractComponentCallbacksC0593o0oOoOo0).OooOo(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0593o0oOoOo0.OooOo00 + ":");
                    abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOo0(AbstractC1230oOoOo0o.OooO0oO(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) ooo00ooo.OooO00o;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((AbstractComponentCallbacksC0593o0oOoOo0) arrayList.get(i)).toString());
            }
        }
        ArrayList arrayList2 = this.OooO0o0;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((AbstractComponentCallbacksC0593o0oOoOo0) this.OooO0o0.get(i2)).toString());
            }
        }
        ArrayList arrayList3 = this.OooO0Oo;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0172o00OoOo c0172o00OoOo = (C0172o00OoOo) this.OooO0Oo.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0172o00OoOo.toString());
                c0172o00OoOo.OooO0o(OooO0oO, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.OooO.get());
        synchronized (this.OooO00o) {
            try {
                int size4 = this.OooO00o.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println((InterfaceC0605o0oOooo0) this.OooO00o.get(i4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.OooOo00);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.OooOo0);
        if (this.OooOo0O != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.OooOo0O);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.OooOOoo);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.OooOooo);
        printWriter.print(" mStopped=");
        printWriter.print(this.Oooo000);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.Oooo00O);
        if (this.OooOooO) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.OooOooO);
        }
    }

    public final void OooOo00(int i) {
        try {
            this.OooO0O0 = true;
            for (Object obj_ : ((HashMap) this.OooO0OO.OooO0O0).values()) { androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) obj_;
                if (oooO00o != null) {
                    oooO00o.OooO0o0 = i;
                }
            }
            Oooo0O0(i, false);
            Iterator it = OooO0o0().iterator();
            while (it.hasNext()) {
                ((o0OOo000) it.next()).OooO0o();
            }
            this.OooO0O0 = false;
            OooOo(true);
        } catch (Throwable th) {
            this.OooO0O0 = false;
            throw th;
        }
    }

    public final void OooOo0O(InterfaceC0605o0oOooo0 interfaceC0605o0oOooo0, boolean z) {
        if (!z) {
            if (this.OooOo00 == null) {
                if (this.Oooo00O) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (this.OooOooo || this.Oooo000) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.OooO00o) {
            try {
                if (this.OooOo00 == null) {
                    if (z) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.OooO00o.add(interfaceC0605o0oOooo0);
                OoooO0O();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOo0o(boolean z) {
        if (!this.OooO0O0) {
            if (this.OooOo00 == null) {
                if (this.Oooo00O) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.OooOo00.Oooo00o.getLooper()) {
                if (!z && (this.OooOooo || this.Oooo000)) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.Oooo0 == null) {
                    this.Oooo0 = new ArrayList();
                    this.Oooo0O0 = new ArrayList();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final void OooOoO(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        ArrayList arrayList3;
        oOO00OOO ooo00ooo;
        oOO00OOO ooo00ooo2;
        oOO00OOO ooo00ooo3;
        int i3;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0;
        int i4;
        int i5;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        boolean z = ((C0172o00OoOo) arrayList4.get(i)).OooOOOO;
        ArrayList arrayList6 = this.Oooo0OO;
        if (arrayList6 == null) {
            this.Oooo0OO = new ArrayList();
        } else {
            arrayList6.clear();
        }
        ArrayList arrayList7 = this.Oooo0OO;
        oOO00OOO ooo00ooo4 = this.OooO0OO;
        arrayList7.addAll(ooo00ooo4.OooOo00());
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = this.OooOo0o;
        int i6 = i;
        boolean z2 = false;
        while (true) {
            int i7 = 1;
            if (i6 < i2) {
                C0172o00OoOo c0172o00OoOo = (C0172o00OoOo) arrayList4.get(i6);
                if (((Boolean) arrayList5.get(i6)).booleanValue()) {
                    ooo00ooo2 = ooo00ooo4;
                    int i8 = 1;
                    ArrayList arrayList8 = this.Oooo0OO;
                    ArrayList arrayList9 = c0172o00OoOo.OooO00o;
                    int size = arrayList9.size() - 1;
                    while (size >= 0) {
                        C0614o0oo00o c0614o0oo00o = (C0614o0oo00o) arrayList9.get(size);
                        int i9 = c0614o0oo00o.OooO00o;
                        if (i9 != i8) {
                            if (i9 != 3) {
                                switch (i9) {
                                    case 8:
                                        abstractComponentCallbacksC0593o0oOoOo02 = null;
                                        break;
                                    case 9:
                                        abstractComponentCallbacksC0593o0oOoOo02 = c0614o0oo00o.OooO0O0;
                                        break;
                                    case JarConfig.MAX_CACHE_SIZE /* 10 */:
                                        c0614o0oo00o.OooO = c0614o0oo00o.OooO0oo;
                                        break;
                                }
                                size--;
                                i8 = 1;
                            }
                            arrayList8.add(c0614o0oo00o.OooO0O0);
                            size--;
                            i8 = 1;
                        }
                        arrayList8.remove(c0614o0oo00o.OooO0O0);
                        size--;
                        i8 = 1;
                    }
                } else {
                    ArrayList arrayList10 = this.Oooo0OO;
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList11 = c0172o00OoOo.OooO00o;
                        if (i10 < arrayList11.size()) {
                            C0614o0oo00o c0614o0oo00o2 = (C0614o0oo00o) arrayList11.get(i10);
                            int i11 = c0614o0oo00o2.OooO00o;
                            if (i11 != i7) {
                                if (i11 != 2) {
                                    if (i11 == 3 || i11 == 6) {
                                        arrayList10.remove(c0614o0oo00o2.OooO0O0);
                                        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo03 = c0614o0oo00o2.OooO0O0;
                                        if (abstractComponentCallbacksC0593o0oOoOo03 == abstractComponentCallbacksC0593o0oOoOo02) {
                                            arrayList11.add(i10, new C0614o0oo00o(9, abstractComponentCallbacksC0593o0oOoOo03));
                                            i10++;
                                            ooo00ooo3 = ooo00ooo4;
                                            i3 = 1;
                                            abstractComponentCallbacksC0593o0oOoOo02 = null;
                                        }
                                    } else if (i11 != 7) {
                                        if (i11 == 8) {
                                            arrayList11.add(i10, new C0614o0oo00o(9, abstractComponentCallbacksC0593o0oOoOo02, 0));
                                            c0614o0oo00o2.OooO0OO = true;
                                            i10++;
                                            abstractComponentCallbacksC0593o0oOoOo02 = c0614o0oo00o2.OooO0O0;
                                        }
                                    }
                                    ooo00ooo3 = ooo00ooo4;
                                    i3 = 1;
                                } else {
                                    abstractComponentCallbacksC0593o0oOoOo0 = c0614o0oo00o2.OooO0O0;
                                    int i12 = abstractComponentCallbacksC0593o0oOoOo0.OooOo0o;
                                    int size2 = arrayList10.size() - 1;
                                    boolean z3 = false;
                                    while (size2 >= 0) {
                                        oOO00OOO ooo00ooo5 = ooo00ooo4;
                                        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo04 = (AbstractComponentCallbacksC0593o0oOoOo0) arrayList10.get(size2);
                                        if (abstractComponentCallbacksC0593o0oOoOo04.OooOo0o != i12) {
                                            i4 = i12;
                                        } else if (abstractComponentCallbacksC0593o0oOoOo04 == abstractComponentCallbacksC0593o0oOoOo0) {
                                            i4 = i12;
                                            z3 = true;
                                        } else {
                                            if (abstractComponentCallbacksC0593o0oOoOo04 == abstractComponentCallbacksC0593o0oOoOo02) {
                                                i4 = i12;
                                                arrayList11.add(i10, new C0614o0oo00o(9, abstractComponentCallbacksC0593o0oOoOo04, 0));
                                                i10++;
                                                i5 = 0;
                                                abstractComponentCallbacksC0593o0oOoOo02 = null;
                                            } else {
                                                i4 = i12;
                                                i5 = 0;
                                            }
                                            C0614o0oo00o c0614o0oo00o3 = new C0614o0oo00o(3, abstractComponentCallbacksC0593o0oOoOo04, i5);
                                            c0614o0oo00o3.OooO0Oo = c0614o0oo00o2.OooO0Oo;
                                            c0614o0oo00o3.OooO0o = c0614o0oo00o2.OooO0o;
                                            c0614o0oo00o3.OooO0o0 = c0614o0oo00o2.OooO0o0;
                                            c0614o0oo00o3.OooO0oO = c0614o0oo00o2.OooO0oO;
                                            arrayList11.add(i10, c0614o0oo00o3);
                                            arrayList10.remove(abstractComponentCallbacksC0593o0oOoOo04);
                                            i10++;
                                            abstractComponentCallbacksC0593o0oOoOo02 = abstractComponentCallbacksC0593o0oOoOo02;
                                        }
                                        size2--;
                                        i12 = i4;
                                        ooo00ooo4 = ooo00ooo5;
                                    }
                                    ooo00ooo3 = ooo00ooo4;
                                    i3 = 1;
                                    if (z3) {
                                        arrayList11.remove(i10);
                                        i10--;
                                    } else {
                                        c0614o0oo00o2.OooO00o = 1;
                                        c0614o0oo00o2.OooO0OO = true;
                                        arrayList10.add(abstractComponentCallbacksC0593o0oOoOo0);
                                    }
                                }
                                i10 += i3;
                                ooo00ooo4 = ooo00ooo3;
                                i7 = 1;
                            }
                            ooo00ooo3 = ooo00ooo4;
                            i3 = 1;
                            abstractComponentCallbacksC0593o0oOoOo0 = c0614o0oo00o2.OooO0O0;
                            arrayList10.add(abstractComponentCallbacksC0593o0oOoOo0);
                            i10 += i3;
                            ooo00ooo4 = ooo00ooo3;
                            i7 = 1;
                        } else {
                            ooo00ooo2 = ooo00ooo4;
                        }
                    }
                }
                z2 = z2 || c0172o00OoOo.OooO0oO;
                i6++;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                ooo00ooo4 = ooo00ooo2;
            } else {
                oOO00OOO ooo00ooo6 = ooo00ooo4;
                this.Oooo0OO.clear();
                if (!z && this.OooOOoo >= 1) {
                    for (int i13 = i; i13 < i2; i13++) {
                        Iterator it = ((C0172o00OoOo) arrayList.get(i13)).OooO00o.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo05 = ((C0614o0oo00o) it.next()).OooO0O0;
                            if (abstractComponentCallbacksC0593o0oOoOo05 == null || abstractComponentCallbacksC0593o0oOoOo05.OooOOo == null) {
                                ooo00ooo = ooo00ooo6;
                            } else {
                                ooo00ooo = ooo00ooo6;
                                ooo00ooo.OooOo0(OooO0o(abstractComponentCallbacksC0593o0oOoOo05));
                            }
                            ooo00ooo6 = ooo00ooo;
                        }
                    }
                }
                for (int i14 = i; i14 < i2; i14++) {
                    C0172o00OoOo c0172o00OoOo2 = (C0172o00OoOo) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        c0172o00OoOo2.OooO0OO(-1);
                        ArrayList arrayList12 = c0172o00OoOo2.OooO00o;
                        boolean z4 = true;
                        for (int size3 = arrayList12.size() - 1; size3 >= 0; size3--) {
                            C0614o0oo00o c0614o0oo00o4 = (C0614o0oo00o) arrayList12.get(size3);
                            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo06 = c0614o0oo00o4.OooO0O0;
                            if (abstractComponentCallbacksC0593o0oOoOo06 != null) {
                                if (abstractComponentCallbacksC0593o0oOoOo06.Oooo00o != null) {
                                    abstractComponentCallbacksC0593o0oOoOo06.OooO0o().OooO00o = z4;
                                }
                                int i15 = c0172o00OoOo2.OooO0o;
                                int i16 = 8194;
                                if (i15 != 4097) {
                                    if (i15 != 8194) {
                                        i16 = 4100;
                                        if (i15 != 8197) {
                                            i16 = i15 != 4099 ? i15 != 4100 ? 0 : 8197 : 4099;
                                        }
                                    } else {
                                        i16 = 4097;
                                    }
                                }
                                if (abstractComponentCallbacksC0593o0oOoOo06.Oooo00o != null || i16 != 0) {
                                    abstractComponentCallbacksC0593o0oOoOo06.OooO0o();
                                    abstractComponentCallbacksC0593o0oOoOo06.Oooo00o.OooO0o = i16;
                                }
                                abstractComponentCallbacksC0593o0oOoOo06.OooO0o();
                                abstractComponentCallbacksC0593o0oOoOo06.Oooo00o.getClass();
                            }
                            int i17 = c0614o0oo00o4.OooO00o;
                            C0606o0oOoooO c0606o0oOoooO = c0172o00OoOo2.OooOOOo;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0593o0oOoOo06.Oooo0O0(c0614o0oo00o4.OooO0Oo, c0614o0oo00o4.OooO0o0, c0614o0oo00o4.OooO0o, c0614o0oo00o4.OooO0oO);
                                    z4 = true;
                                    c0606o0oOoooO.OoooO(abstractComponentCallbacksC0593o0oOoOo06, true);
                                    c0606o0oOoooO.Oooo0oo(abstractComponentCallbacksC0593o0oOoOo06);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0614o0oo00o4.OooO00o);
                                case 3:
                                    abstractComponentCallbacksC0593o0oOoOo06.Oooo0O0(c0614o0oo00o4.OooO0Oo, c0614o0oo00o4.OooO0o0, c0614o0oo00o4.OooO0o, c0614o0oo00o4.OooO0oO);
                                    c0606o0oOoooO.OooO00o(abstractComponentCallbacksC0593o0oOoOo06);
                                    z4 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0593o0oOoOo06.Oooo0O0(c0614o0oo00o4.OooO0Oo, c0614o0oo00o4.OooO0o0, c0614o0oo00o4.OooO0o, c0614o0oo00o4.OooO0oO);
                                    c0606o0oOoooO.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(abstractComponentCallbacksC0593o0oOoOo06);
                                    }
                                    if (abstractComponentCallbacksC0593o0oOoOo06.OooOoO0) {
                                        abstractComponentCallbacksC0593o0oOoOo06.OooOoO0 = false;
                                        abstractComponentCallbacksC0593o0oOoOo06.Oooo0 = !abstractComponentCallbacksC0593o0oOoOo06.Oooo0;
                                    }
                                    z4 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0593o0oOoOo06.Oooo0O0(c0614o0oo00o4.OooO0Oo, c0614o0oo00o4.OooO0o0, c0614o0oo00o4.OooO0o, c0614o0oo00o4.OooO0oO);
                                    c0606o0oOoooO.OoooO(abstractComponentCallbacksC0593o0oOoOo06, true);
                                    c0606o0oOoooO.OooOooo(abstractComponentCallbacksC0593o0oOoOo06);
                                    z4 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0593o0oOoOo06.Oooo0O0(c0614o0oo00o4.OooO0Oo, c0614o0oo00o4.OooO0o0, c0614o0oo00o4.OooO0o, c0614o0oo00o4.OooO0oO);
                                    c0606o0oOoooO.OooO0OO(abstractComponentCallbacksC0593o0oOoOo06);
                                    z4 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0593o0oOoOo06.Oooo0O0(c0614o0oo00o4.OooO0Oo, c0614o0oo00o4.OooO0o0, c0614o0oo00o4.OooO0o, c0614o0oo00o4.OooO0oO);
                                    c0606o0oOoooO.OoooO(abstractComponentCallbacksC0593o0oOoOo06, true);
                                    c0606o0oOoooO.OooO0oO(abstractComponentCallbacksC0593o0oOoOo06);
                                    z4 = true;
                                    break;
                                case 8:
                                    c0606o0oOoooO.o000oOoO(null);
                                    z4 = true;
                                    break;
                                case 9:
                                    c0606o0oOoooO.o000oOoO(abstractComponentCallbacksC0593o0oOoOo06);
                                    z4 = true;
                                    break;
                                case JarConfig.MAX_CACHE_SIZE /* 10 */:
                                    c0606o0oOoooO.OoooOO0(abstractComponentCallbacksC0593o0oOoOo06, c0614o0oo00o4.OooO0oo);
                                    z4 = true;
                                    break;
                            }
                        }
                    } else {
                        c0172o00OoOo2.OooO0OO(1);
                        ArrayList arrayList13 = c0172o00OoOo2.OooO00o;
                        int size4 = arrayList13.size();
                        int i18 = 0;
                        while (i18 < size4) {
                            C0614o0oo00o c0614o0oo00o5 = (C0614o0oo00o) arrayList13.get(i18);
                            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo07 = c0614o0oo00o5.OooO0O0;
                            if (abstractComponentCallbacksC0593o0oOoOo07 != null) {
                                if (abstractComponentCallbacksC0593o0oOoOo07.Oooo00o != null) {
                                    abstractComponentCallbacksC0593o0oOoOo07.OooO0o().OooO00o = false;
                                }
                                int i19 = c0172o00OoOo2.OooO0o;
                                if (abstractComponentCallbacksC0593o0oOoOo07.Oooo00o != null || i19 != 0) {
                                    abstractComponentCallbacksC0593o0oOoOo07.OooO0o();
                                    abstractComponentCallbacksC0593o0oOoOo07.Oooo00o.OooO0o = i19;
                                }
                                abstractComponentCallbacksC0593o0oOoOo07.OooO0o();
                                abstractComponentCallbacksC0593o0oOoOo07.Oooo00o.getClass();
                            }
                            int i20 = c0614o0oo00o5.OooO00o;
                            C0606o0oOoooO c0606o0oOoooO2 = c0172o00OoOo2.OooOOOo;
                            switch (i20) {
                                case 1:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC0593o0oOoOo07.Oooo0O0(c0614o0oo00o5.OooO0Oo, c0614o0oo00o5.OooO0o0, c0614o0oo00o5.OooO0o, c0614o0oo00o5.OooO0oO);
                                    c0606o0oOoooO2.OoooO(abstractComponentCallbacksC0593o0oOoOo07, false);
                                    c0606o0oOoooO2.OooO00o(abstractComponentCallbacksC0593o0oOoOo07);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0614o0oo00o5.OooO00o);
                                case 3:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC0593o0oOoOo07.Oooo0O0(c0614o0oo00o5.OooO0Oo, c0614o0oo00o5.OooO0o0, c0614o0oo00o5.OooO0o, c0614o0oo00o5.OooO0oO);
                                    c0606o0oOoooO2.Oooo0oo(abstractComponentCallbacksC0593o0oOoOo07);
                                    break;
                                case 4:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC0593o0oOoOo07.Oooo0O0(c0614o0oo00o5.OooO0Oo, c0614o0oo00o5.OooO0o0, c0614o0oo00o5.OooO0o, c0614o0oo00o5.OooO0oO);
                                    c0606o0oOoooO2.OooOooo(abstractComponentCallbacksC0593o0oOoOo07);
                                    break;
                                case 5:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC0593o0oOoOo07.Oooo0O0(c0614o0oo00o5.OooO0Oo, c0614o0oo00o5.OooO0o0, c0614o0oo00o5.OooO0o, c0614o0oo00o5.OooO0oO);
                                    c0606o0oOoooO2.OoooO(abstractComponentCallbacksC0593o0oOoOo07, false);
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(abstractComponentCallbacksC0593o0oOoOo07);
                                    }
                                    if (abstractComponentCallbacksC0593o0oOoOo07.OooOoO0) {
                                        abstractComponentCallbacksC0593o0oOoOo07.OooOoO0 = false;
                                        abstractComponentCallbacksC0593o0oOoOo07.Oooo0 = !abstractComponentCallbacksC0593o0oOoOo07.Oooo0;
                                    }
                                    break;
                                case 6:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC0593o0oOoOo07.Oooo0O0(c0614o0oo00o5.OooO0Oo, c0614o0oo00o5.OooO0o0, c0614o0oo00o5.OooO0o, c0614o0oo00o5.OooO0oO);
                                    c0606o0oOoooO2.OooO0oO(abstractComponentCallbacksC0593o0oOoOo07);
                                    break;
                                case 7:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC0593o0oOoOo07.Oooo0O0(c0614o0oo00o5.OooO0Oo, c0614o0oo00o5.OooO0o0, c0614o0oo00o5.OooO0o, c0614o0oo00o5.OooO0oO);
                                    c0606o0oOoooO2.OoooO(abstractComponentCallbacksC0593o0oOoOo07, false);
                                    c0606o0oOoooO2.OooO0OO(abstractComponentCallbacksC0593o0oOoOo07);
                                    break;
                                case 8:
                                    c0606o0oOoooO2.o000oOoO(abstractComponentCallbacksC0593o0oOoOo07);
                                    arrayList3 = arrayList13;
                                    break;
                                case 9:
                                    c0606o0oOoooO2.o000oOoO(null);
                                    arrayList3 = arrayList13;
                                    break;
                                case JarConfig.MAX_CACHE_SIZE /* 10 */:
                                    c0606o0oOoooO2.OoooOO0(abstractComponentCallbacksC0593o0oOoOo07, c0614o0oo00o5.OooO);
                                    arrayList3 = arrayList13;
                                    break;
                            }
                            i18++;
                            arrayList13 = arrayList3;
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i21 = i; i21 < i2; i21++) {
                    C0172o00OoOo c0172o00OoOo3 = (C0172o00OoOo) arrayList.get(i21);
                    if (booleanValue) {
                        for (int size5 = c0172o00OoOo3.OooO00o.size() - 1; size5 >= 0; size5--) {
                            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo08 = ((C0614o0oo00o) c0172o00OoOo3.OooO00o.get(size5)).OooO0O0;
                            if (abstractComponentCallbacksC0593o0oOoOo08 != null) {
                                OooO0o(abstractComponentCallbacksC0593o0oOoOo08).OooOO0O();
                            }
                        }
                    } else {
                        Iterator it2 = c0172o00OoOo3.OooO00o.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo09 = ((C0614o0oo00o) it2.next()).OooO0O0;
                            if (abstractComponentCallbacksC0593o0oOoOo09 != null) {
                                OooO0o(abstractComponentCallbacksC0593o0oOoOo09).OooOO0O();
                            }
                        }
                    }
                }
                Oooo0O0(this.OooOOoo, true);
                HashSet hashSet = new HashSet();
                for (int i22 = i; i22 < i2; i22++) {
                    Iterator it3 = ((C0172o00OoOo) arrayList.get(i22)).OooO00o.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo010 = ((C0614o0oo00o) it3.next()).OooO0O0;
                        if (abstractComponentCallbacksC0593o0oOoOo010 != null && (viewGroup = abstractComponentCallbacksC0593o0oOoOo010.OooOooO) != null) {
                            hashSet.add(o0OOo000.OooO0oO(viewGroup, OooOooO()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    o0OOo000 o0ooo000 = (o0OOo000) it4.next();
                    o0ooo000.OooO0Oo = booleanValue;
                    o0ooo000.OooO0oo();
                    o0ooo000.OooO0Oo();
                }
                for (int i23 = i; i23 < i2; i23++) {
                    C0172o00OoOo c0172o00OoOo4 = (C0172o00OoOo) arrayList.get(i23);
                    if (((Boolean) arrayList2.get(i23)).booleanValue() && c0172o00OoOo4.OooOOo >= 0) {
                        c0172o00OoOo4.OooOOo = -1;
                    }
                    c0172o00OoOo4.getClass();
                }
                return;
            }
        }
    }

    public final void OooOoO0(InterfaceC0605o0oOooo0 interfaceC0605o0oOooo0, boolean z) {
        if (z && (this.OooOo00 == null || this.Oooo00O)) {
            return;
        }
        OooOo0o(z);
        if (interfaceC0605o0oOooo0.OooO00o(this.Oooo0, this.Oooo0O0)) {
            this.OooO0O0 = true;
            try {
                Oooo(this.Oooo0, this.Oooo0O0);
            } finally {
                OooO0Oo();
            }
        }
        OoooOoO();
        if (this.Oooo00o) {
            this.Oooo00o = false;
            OoooOOo();
        }
        ((HashMap) this.OooO0OO.OooO0O0).values().removeAll(Collections.singleton(null));
    }

    public final AbstractComponentCallbacksC0593o0oOoOo0 OooOoOO(int i) {
        oOO00OOO ooo00ooo = this.OooO0OO;
        ArrayList arrayList = (ArrayList) ooo00ooo.OooO00o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = (AbstractComponentCallbacksC0593o0oOoOo0) arrayList.get(size);
            if (abstractComponentCallbacksC0593o0oOoOo0 != null && abstractComponentCallbacksC0593o0oOoOo0.OooOo0O == i) {
                return abstractComponentCallbacksC0593o0oOoOo0;
            }
        }
        for (Object obj_ : ((HashMap) ooo00ooo.OooO0O0).values()) { androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) obj_;
            if (oooO00o != null) {
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = oooO00o.OooO0OO;
                if (abstractComponentCallbacksC0593o0oOoOo02.OooOo0O == i) {
                    return abstractComponentCallbacksC0593o0oOoOo02;
                }
            }
        }
        return null;
    }

    public final C0596o0oOoo OooOoo() {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            return abstractComponentCallbacksC0593o0oOoOo0.OooOOo.OooOoo();
        }
        return this.OooOo;
    }

    public final ViewGroup OooOoo0(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        ViewGroup viewGroup = abstractComponentCallbacksC0593o0oOoOo0.OooOooO;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOo0o > 0 && this.OooOo0.Oooo0oO()) {
            View Oooo0o = this.OooOo0.Oooo0o(abstractComponentCallbacksC0593o0oOoOo0.OooOo0o);
            if (Oooo0o instanceof ViewGroup) {
                return (ViewGroup) Oooo0o;
            }
        }
        return null;
    }

    public final C0601o0oOooO0 OooOooO() {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            return abstractComponentCallbacksC0593o0oOoOo0.OooOOo.OooOooO();
        }
        return this.OooOoO0;
    }

    public final void OooOooo(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        if (!abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOoO0 = true;
            abstractComponentCallbacksC0593o0oOoOo0.Oooo0 = true ^ abstractComponentCallbacksC0593o0oOoOo0.Oooo0;
            OoooOOO(abstractComponentCallbacksC0593o0oOoOo0);
        }
    }

    public final void Oooo(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0172o00OoOo) arrayList.get(i)).OooOOOO) {
                    if (i2 != i) {
                        OooOoO(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0172o00OoOo) arrayList.get(i2)).OooOOOO) {
                            i2++;
                        }
                    }
                    OooOoO(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                OooOoO(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final boolean Oooo00O() {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 == null) {
            return true;
        }
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOOOo() && this.OooOo0O.OooOO0O().Oooo00O()) {
            return true;
        }
        return false;
    }

    public final void Oooo0O0(int i, boolean z) {
        HashMap hashMap;
        C0589o0oOoOO0 c0589o0oOoOO0;
        if (this.OooOo00 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i == this.OooOOoo) {
            return;
        }
        this.OooOOoo = i;
        oOO00OOO ooo00ooo = this.OooO0OO;
        Iterator it = ((ArrayList) ooo00ooo.OooO00o).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = (HashMap) ooo00ooo.OooO0O0;
            if (!hasNext) {
                break;
            }
            androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) hashMap.get(((AbstractComponentCallbacksC0593o0oOoOo0) it.next()).OooO0o0);
            if (oooO00o != null) {
                oooO00o.OooOO0O();
            }
        }
        for (Object obj_ : hashMap.values()) { androidx.fragment.app.OooO00o oooO00o2 = (androidx.fragment.app.OooO00o) obj_;
            if (oooO00o2 != null) {
                oooO00o2.OooOO0O();
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o2.OooO0OO;
                if (abstractComponentCallbacksC0593o0oOoOo0.OooOO0o && !abstractComponentCallbacksC0593o0oOoOo0.OooOOo()) {
                    ooo00ooo.OooOo0O(oooO00o2);
                }
            }
        }
        OoooOOo();
        if (this.OooOooO && (c0589o0oOoOO0 = this.OooOo00) != null && this.OooOOoo == 7) {
            c0589o0oOoOO0.Oooo0O0.invalidateOptionsMenu();
            this.OooOooO = false;
        }
    }

    public final void Oooo0OO() {
        if (this.OooOo00 == null) {
            return;
        }
        this.OooOooo = false;
        this.Oooo000 = false;
        this.Oooo0o0.OooO0oo = false;
        for (Object obj_ :  this.OooO0OO.OooOo00()) { AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0  = (AbstractComponentCallbacksC0593o0oOoOo0) obj_;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOo00.Oooo0OO();
            }
        }
    }

    public final boolean Oooo0o(int i, int i2) {
        OooOo(false);
        OooOo0o(true);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooOo0o;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null && i < 0 && abstractComponentCallbacksC0593o0oOoOo0.OooO0oo().Oooo0o0()) {
            return true;
        }
        boolean Oooo0oO = Oooo0oO(this.Oooo0, this.Oooo0O0, i, i2);
        if (Oooo0oO) {
            this.OooO0O0 = true;
            try {
                Oooo(this.Oooo0, this.Oooo0O0);
            } finally {
                OooO0Oo();
            }
        }
        OoooOoO();
        if (this.Oooo00o) {
            this.Oooo00o = false;
            OoooOOo();
        }
        ((HashMap) this.OooO0OO.OooO0O0).values().removeAll(Collections.singleton(null));
        return Oooo0oO;
    }

    public final boolean Oooo0o0() {
        return Oooo0o(-1, 0);
    }

    public final boolean Oooo0oO(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList3 = this.OooO0Oo;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.OooO0Oo.size() - 1;
            } else {
                int size = this.OooO0Oo.size() - 1;
                while (size >= 0) {
                    C0172o00OoOo c0172o00OoOo = (C0172o00OoOo) this.OooO0Oo.get(size);
                    if (i >= 0 && i == c0172o00OoOo.OooOOo) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z) {
                        while (size > 0) {
                            C0172o00OoOo c0172o00OoOo2 = (C0172o00OoOo) this.OooO0Oo.get(size - 1);
                            if (i < 0 || i != c0172o00OoOo2.OooOOo) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.OooO0Oo.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.OooO0Oo.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C0172o00OoOo) this.OooO0Oo.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Oooo0oo(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        boolean z = !abstractComponentCallbacksC0593o0oOoOo0.OooOOo();
        if (!abstractComponentCallbacksC0593o0oOoOo0.OooOoO || z) {
            oOO00OOO ooo00ooo = this.OooO0OO;
            synchronized (((ArrayList) ooo00ooo.OooO00o)) {
                ((ArrayList) ooo00ooo.OooO00o).remove(abstractComponentCallbacksC0593o0oOoOo0);
            }
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O = false;
            if (Oooo000(abstractComponentCallbacksC0593o0oOoOo0)) {
                this.OooOooO = true;
            }
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0o = true;
            OoooOOO(abstractComponentCallbacksC0593o0oOoOo0);
        }
    }

    public final void OoooO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, boolean z) {
        ViewGroup OooOoo0 = OooOoo0(abstractComponentCallbacksC0593o0oOoOo0);
        if (OooOoo0 != null && (OooOoo0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) OooOoo0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.ninja.engine.o0oOoooo, android.os.Parcelable, java.lang.Object] */
    public final Bundle OoooO0() {
        int i;
        ArrayList arrayList;
        C0175o00OoOoo[] c0175o00OoOooArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = OooO0o0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o0OOo000 o0ooo000 = (o0OOo000) it.next();
            if (o0ooo000.OooO0o0) {
                Log.isLoggable("FragmentManager", 2);
                o0ooo000.OooO0o0 = false;
                o0ooo000.OooO0Oo();
            }
        }
        Iterator it2 = OooO0o0().iterator();
        while (it2.hasNext()) {
            ((o0OOo000) it2.next()).OooO0o();
        }
        OooOo(true);
        this.OooOooo = true;
        this.Oooo0o0.OooO0oo = true;
        oOO00OOO ooo00ooo = this.OooO0OO;
        ooo00ooo.getClass();
        HashMap hashMap = (HashMap) ooo00ooo.OooO0O0;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (Object obj_ : hashMap.values()) { androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) obj_;
            if (oooO00o != null) {
                oooO00o.OooOOOO();
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
                arrayList2.add(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0);
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0593o0oOoOo0.toString();
                    Objects.toString(abstractComponentCallbacksC0593o0oOoOo0.OooO0O0);
                }
            }
        }
        oOO00OOO ooo00ooo2 = this.OooO0OO;
        ooo00ooo2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) ooo00ooo2.OooO0OO).values());
        if (arrayList3.isEmpty()) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            oOO00OOO ooo00ooo3 = this.OooO0OO;
            synchronized (((ArrayList) ooo00ooo3.OooO00o)) {
                try {
                    if (((ArrayList) ooo00ooo3.OooO00o).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) ooo00ooo3.OooO00o).size());
                        Iterator it3 = ((ArrayList) ooo00ooo3.OooO00o).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = (AbstractComponentCallbacksC0593o0oOoOo0) it3.next();
                            arrayList.add(abstractComponentCallbacksC0593o0oOoOo02.OooO0o0);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                abstractComponentCallbacksC0593o0oOoOo02.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.OooO0Oo;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                c0175o00OoOooArr = new C0175o00OoOoo[size];
                for (i = 0; i < size; i++) {
                    c0175o00OoOooArr[i] = new C0175o00OoOoo((C0172o00OoOo) this.OooO0Oo.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.OooO0Oo.get(i));
                    }
                }
            } else {
                c0175o00OoOooArr = null;
            }
            C0607o0oOoooo obj = new C0607o0oOoooo();
            obj.OooO0o0 = null;
            ArrayList arrayList5 = new ArrayList();
            obj.OooO0o = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            obj.OooO0oO = arrayList6;
            obj.OooO00o = arrayList2;
            obj.OooO0O0 = arrayList;
            obj.OooO0OO = c0175o00OoOooArr;
            obj.OooO0Oo = this.OooO.get();
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo03 = this.OooOo0o;
            if (abstractComponentCallbacksC0593o0oOoOo03 != null) {
                obj.OooO0o0 = abstractComponentCallbacksC0593o0oOoOo03.OooO0o0;
            }
            arrayList5.addAll(this.OooOO0.keySet());
            arrayList6.addAll(this.OooOO0.values());
            obj.OooO0oo = new ArrayList(this.OooOoo);
            bundle.putParcelable("state", obj);
            for (Object obj_str : this.OooOO0O.keySet()) {
                String str = (String) obj_str;
                bundle.putBundle(AbstractC1230oOoOo0o.OooOO0o("result_", str), (Bundle) this.OooOO0O.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C0610o0oo00O c0610o0oo00O = (C0610o0oo00O) it4.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", c0610o0oo00O);
                bundle.putBundle("fragment_" + c0610o0oo00O.OooO0O0, bundle2);
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.ninja.engine.o0oo00o, java.lang.Object] */
    public final void OoooO00(Parcelable parcelable) {
        C0415o0Oo0O0O c0415o0Oo0O0O;
        androidx.fragment.app.OooO00o oooO00o;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.OooOo00.Oooo00O.getClassLoader());
                this.OooOO0O.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.OooOo00.Oooo00O.getClassLoader());
                arrayList.add((C0610o0oo00O) bundle.getParcelable("state"));
            }
        }
        oOO00OOO ooo00ooo = this.OooO0OO;
        HashMap hashMap = (HashMap) ooo00ooo.OooO0OO;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0610o0oo00O c0610o0oo00O = (C0610o0oo00O) it.next();
            hashMap.put(c0610o0oo00O.OooO0O0, c0610o0oo00O);
        }
        C0607o0oOoooo c0607o0oOoooo = (C0607o0oOoooo) bundle3.getParcelable("state");
        if (c0607o0oOoooo == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) ooo00ooo.OooO0O0;
        hashMap2.clear();
        Iterator it2 = c0607o0oOoooo.OooO00o.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            c0415o0Oo0O0O = this.OooOO0o;
            if (!hasNext) {
                break;
            }
            C0610o0oo00O c0610o0oo00O2 = (C0610o0oo00O) ((HashMap) ooo00ooo.OooO0OO).remove((String) it2.next());
            if (c0610o0oo00O2 != null) {
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = (AbstractComponentCallbacksC0593o0oOoOo0) this.Oooo0o0.OooO0OO.get(c0610o0oo00O2.OooO0O0);
                if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        abstractComponentCallbacksC0593o0oOoOo0.toString();
                    }
                    oooO00o = new androidx.fragment.app.OooO00o(c0415o0Oo0O0O, ooo00ooo, abstractComponentCallbacksC0593o0oOoOo0, c0610o0oo00O2);
                } else {
                    oooO00o = new androidx.fragment.app.OooO00o(this.OooOO0o, this.OooO0OO, this.OooOo00.Oooo00O.getClassLoader(), OooOoo(), c0610o0oo00O2);
                }
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = oooO00o.OooO0OO;
                abstractComponentCallbacksC0593o0oOoOo02.OooOOo = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0593o0oOoOo02.toString();
                }
                oooO00o.OooOOO0(this.OooOo00.Oooo00O.getClassLoader());
                ooo00ooo.OooOo0(oooO00o);
                oooO00o.OooO0o0 = this.OooOOoo;
            }
        }
        o0oo0000 o0oo0000Var = this.Oooo0o0;
        o0oo0000Var.getClass();
        Iterator it3 = new ArrayList(o0oo0000Var.OooO0OO.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo03 = (AbstractComponentCallbacksC0593o0oOoOo0) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0593o0oOoOo03.OooO0o0) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0593o0oOoOo03.toString();
                    Objects.toString(c0607o0oOoooo.OooO00o);
                }
                this.Oooo0o0.OooO0OO(abstractComponentCallbacksC0593o0oOoOo03);
                abstractComponentCallbacksC0593o0oOoOo03.OooOOo = this;
                androidx.fragment.app.OooO00o oooO00o2 = new androidx.fragment.app.OooO00o(c0415o0Oo0O0O, ooo00ooo, abstractComponentCallbacksC0593o0oOoOo03);
                oooO00o2.OooO0o0 = 1;
                oooO00o2.OooOO0O();
                abstractComponentCallbacksC0593o0oOoOo03.OooOO0o = true;
                oooO00o2.OooOO0O();
            }
        }
        ArrayList<String> arrayList2 = c0607o0oOoooo.OooO0O0;
        ((ArrayList) ooo00ooo.OooO00o).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0593o0oOoOo0 OooOOO = ooo00ooo.OooOOO(str3);
                if (OooOOO != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        OooOOO.toString();
                    }
                    ooo00ooo.OooO0o0(OooOOO);
                } else {
                    throw new IllegalStateException(AbstractC1230oOoOo0o.OooO0oo("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (c0607o0oOoooo.OooO0OO != null) {
            this.OooO0Oo = new ArrayList(c0607o0oOoooo.OooO0OO.length);
            int i = 0;
            while (true) {
                C0175o00OoOoo[] c0175o00OoOooArr = c0607o0oOoooo.OooO0OO;
                if (i >= c0175o00OoOooArr.length) {
                    break;
                }
                C0175o00OoOoo c0175o00OoOoo = c0175o00OoOooArr[i];
                c0175o00OoOoo.getClass();
                C0172o00OoOo c0172o00OoOo = new C0172o00OoOo(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = c0175o00OoOoo.OooO00o;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    C0614o0oo00o obj = new C0614o0oo00o();
                    int i4 = i2 + 1;
                    obj.OooO00o = iArr[i2];
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(c0172o00OoOo);
                        int i5 = iArr[i4];
                    }
                    obj.OooO0oo = EnumC0759oO0O0o.values()[c0175o00OoOoo.OooO0OO[i3]];
                    obj.OooO = EnumC0759oO0O0o.values()[c0175o00OoOoo.OooO0Oo[i3]];
                    int i6 = i2 + 2;
                    obj.OooO0OO = iArr[i4] != 0;
                    int i7 = iArr[i6];
                    obj.OooO0Oo = i7;
                    int i8 = iArr[i2 + 3];
                    obj.OooO0o0 = i8;
                    int i9 = i2 + 5;
                    int i10 = iArr[i2 + 4];
                    obj.OooO0o = i10;
                    i2 += 6;
                    int i11 = iArr[i9];
                    obj.OooO0oO = i11;
                    c0172o00OoOo.OooO0O0 = i7;
                    c0172o00OoOo.OooO0OO = i8;
                    c0172o00OoOo.OooO0Oo = i10;
                    c0172o00OoOo.OooO0o0 = i11;
                    c0172o00OoOo.OooO0O0(obj);
                    i3++;
                }
                c0172o00OoOo.OooO0o = c0175o00OoOoo.OooO0o0;
                c0172o00OoOo.OooO0oo = c0175o00OoOoo.OooO0o;
                c0172o00OoOo.OooO0oO = true;
                c0172o00OoOo.OooO = c0175o00OoOoo.OooO0oo;
                c0172o00OoOo.OooOO0 = c0175o00OoOoo.OooO;
                c0172o00OoOo.OooOO0O = c0175o00OoOoo.OooOO0;
                c0172o00OoOo.OooOO0o = c0175o00OoOoo.OooOO0O;
                c0172o00OoOo.OooOOO0 = c0175o00OoOoo.OooOO0o;
                c0172o00OoOo.OooOOO = c0175o00OoOoo.OooOOO0;
                c0172o00OoOo.OooOOOO = c0175o00OoOoo.OooOOO;
                c0172o00OoOo.OooOOo = c0175o00OoOoo.OooO0oO;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = c0175o00OoOoo.OooO0O0;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i12);
                    if (str4 != null) {
                        ((C0614o0oo00o) c0172o00OoOo.OooO00o.get(i12)).OooO0O0 = ooo00ooo.OooOOO(str4);
                    }
                    i12++;
                }
                c0172o00OoOo.OooO0OO(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    c0172o00OoOo.toString();
                    PrintWriter printWriter = new PrintWriter(new C0815oO0o000());
                    c0172o00OoOo.OooO0o("  ", printWriter, false);
                    printWriter.close();
                }
                this.OooO0Oo.add(c0172o00OoOo);
                i++;
            }
        } else {
            this.OooO0Oo = null;
        }
        this.OooO.set(c0607o0oOoooo.OooO0Oo);
        String str5 = c0607o0oOoooo.OooO0o0;
        if (str5 != null) {
            AbstractComponentCallbacksC0593o0oOoOo0 OooOOO2 = ooo00ooo.OooOOO(str5);
            this.OooOo0o = OooOOO2;
            OooOOo0(OooOOO2);
        }
        ArrayList arrayList4 = c0607o0oOoooo.OooO0o;
        if (arrayList4 != null) {
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                this.OooOO0.put((String) arrayList4.get(i13), (C0178o00Ooo00) c0607o0oOoooo.OooO0oO.get(i13));
            }
        }
        this.OooOoo = new ArrayDeque(c0607o0oOoooo.OooO0oo);
    }

    public final void OoooO0O() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO00o.size() == 1) {
                    this.OooOo00.Oooo00o.removeCallbacks(this.Oooo0o);
                    this.OooOo00.Oooo00o.post(this.Oooo0o);
                    OoooOoO();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OoooOO0(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, EnumC0759oO0O0o enumC0759oO0O0o) {
        if (abstractComponentCallbacksC0593o0oOoOo0.equals(this.OooO0OO.OooOOO(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0)) && (abstractComponentCallbacksC0593o0oOoOo0.OooOOoo == null || abstractComponentCallbacksC0593o0oOoOo0.OooOOo == this)) {
            abstractComponentCallbacksC0593o0oOoOo0.Oooo0o = enumC0759oO0O0o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " is not an active fragment of FragmentManager " + this);
    }

    public final void OoooOOO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup OooOoo0 = OooOoo0(abstractComponentCallbacksC0593o0oOoOo0);
        if (OooOoo0 != null) {
            C0586o0oOoO0 c0586o0oOoO0 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
            boolean z = false;
            if (c0586o0oOoO0 == null) {
                i = 0;
            } else {
                i = c0586o0oOoO0.OooO0O0;
            }
            if (c0586o0oOoO0 == null) {
                i2 = 0;
            } else {
                i2 = c0586o0oOoO0.OooO0OO;
            }
            int i5 = i2 + i;
            if (c0586o0oOoO0 == null) {
                i3 = 0;
            } else {
                i3 = c0586o0oOoO0.OooO0Oo;
            }
            int i6 = i3 + i5;
            if (c0586o0oOoO0 == null) {
                i4 = 0;
            } else {
                i4 = c0586o0oOoO0.OooO0o0;
            }
            if (i4 + i6 > 0) {
                if (OooOoo0.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    OooOoo0.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0593o0oOoOo0);
                }
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = (AbstractComponentCallbacksC0593o0oOoOo0) OooOoo0.getTag(R.id.visible_removing_fragment_view_tag);
                C0586o0oOoO0 c0586o0oOoO02 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
                if (c0586o0oOoO02 != null) {
                    z = c0586o0oOoO02.OooO00o;
                }
                if (abstractComponentCallbacksC0593o0oOoOo02.Oooo00o != null) {
                    abstractComponentCallbacksC0593o0oOoOo02.OooO0o().OooO00o = z;
                }
            }
        }
    }

    public final void OoooOOo() {
        Iterator it = this.OooO0OO.OooOOo0().iterator();
        while (it.hasNext()) {
            androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) it.next();
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
            if (abstractComponentCallbacksC0593o0oOoOo0.Oooo000) {
                if (this.OooO0O0) {
                    this.Oooo00o = true;
                } else {
                    abstractComponentCallbacksC0593o0oOoOo0.Oooo000 = false;
                    oooO00o.OooOO0O();
                }
            }
        }
    }

    public final void OoooOo0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C0815oO0o000());
        C0589o0oOoOO0 c0589o0oOoOO0 = this.OooOo00;
        try {
            if (c0589o0oOoOO0 != null) {
                c0589o0oOoOO0.Oooo0O0.dump("  ", null, printWriter, new String[0]);
            } else {
                OooOo0("  ", null, printWriter, new String[0]);
            }
        } catch (Exception unused) {
        }
        throw illegalStateException;
    }

    public final void OoooOoO() {
        int i;
        synchronized (this.OooO00o) {
            try {
                boolean z = true;
                if (!this.OooO00o.isEmpty()) {
                    C0597o0oOoo0 c0597o0oOoo0 = this.OooO0oo;
                    c0597o0oOoo0.OooO00o = true;
                    InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo = c0597o0oOoo0.OooO0OO;
                    if (interfaceC0625o0oo0OOo != null) {
                        interfaceC0625o0oo0OOo.OooO00o();
                    }
                    return;
                }
                C0597o0oOoo0 c0597o0oOoo02 = this.OooO0oo;
                ArrayList arrayList = this.OooO0Oo;
                if (arrayList != null) {
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                c0597o0oOoo02.OooO00o = (i <= 0 || !Oooo0(this.OooOo0O)) ? false : false;
                InterfaceC0625o0oo0OOo interfaceC0625o0oo0OOo2 = c0597o0oOoo02.OooO0OO;
                if (interfaceC0625o0oo0OOo2 != null) {
                    interfaceC0625o0oo0OOo2.OooO00o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o000oOoO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            if (!abstractComponentCallbacksC0593o0oOoOo0.equals(this.OooO0OO.OooOOO(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0)) || (abstractComponentCallbacksC0593o0oOoOo0.OooOOoo != null && abstractComponentCallbacksC0593o0oOoOo0.OooOOo != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = this.OooOo0o;
        this.OooOo0o = abstractComponentCallbacksC0593o0oOoOo0;
        OooOOo0(abstractComponentCallbacksC0593o0oOoOo02);
        OooOOo0(this.OooOo0o);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            sb.append(abstractComponentCallbacksC0593o0oOoOo0.getClass().getSimpleName());
            sb.append("{");
            obj = this.OooOo0O;
        } else {
            C0589o0oOoOO0 c0589o0oOoOO0 = this.OooOo00;
            if (c0589o0oOoOO0 != null) {
                sb.append(c0589o0oOoOO0.getClass().getSimpleName());
                sb.append("{");
                obj = this.OooOo00;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }
}





