package com.ninja.engine;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* renamed from: com.ninja.engine.oOOoOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100oOOoOo0o extends AbstractC0186o00Ooooo {
    public final Context OooOoOO;
    public final Class OooOoo;
    public final ComponentCallbacks2C1106oOOoOoo0 OooOoo0;
    public final C1932ooo0Oo0 OooOooO;
    public C0675o0oooO OooOooo;
    public C1100oOOoOo0o Oooo0;
    public Object Oooo000;
    public ArrayList Oooo00O;
    public C1100oOOoOo0o Oooo00o;
    public final boolean Oooo0O0 = true;
    public boolean Oooo0OO;
    public boolean Oooo0o0;

    static {
        C1105oOOoOoo c1105oOOoOoo = (C1105oOOoOoo) ((C1105oOOoOoo) ((C1105oOOoOoo) new AbstractC0186o00Ooooo() {}.OooO0Oo(C0395o0OOoo.OooO0Oo)).OooO()).OooOOO0();
    }

    public C1100oOOoOo0o(com.bumptech.glide.OooO00o oooO00o, ComponentCallbacks2C1106oOOoOoo0 componentCallbacks2C1106oOOoOoo0, Class cls, Context context) {
        C1105oOOoOoo c1105oOOoOoo;
        this.OooOoo0 = componentCallbacks2C1106oOOoOoo0;
        this.OooOoo = cls;
        this.OooOoOO = context;
        Map map = componentCallbacks2C1106oOOoOoo0.OooO00o.OooO0OO.OooO0o;
        C0675o0oooO c0675o0oooO = (C0675o0oooO) map.get(cls);
        if (c0675o0oooO == null) {
            for (java.util.Map.Entry) map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c0675o0oooO = (C0675o0oooO) entry.getValue();
                }
            }
        }
        this.OooOooo = c0675o0oooO == null ? C1932ooo0Oo0.OooOO0O : c0675o0oooO;
        this.OooOooO = oooO00o.OooO0OO;
        Iterator it = componentCallbacks2C1106oOOoOoo0.OooO.iterator();
        while (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            OooOOo0();
        }
        synchronized (componentCallbacks2C1106oOOoOoo0) {
            c1105oOOoOoo = componentCallbacks2C1106oOOoOoo0.OooOO0;
        }
        OooO00o(c1105oOOoOoo);
    }

    @Override // com.ninja.engine.AbstractC0186o00Ooooo
    /* renamed from: OooOOo */
    public final C1100oOOoOo0o OooO00o(AbstractC0186o00Ooooo abstractC0186o00Ooooo) {
        AbstractC0694o0ooooo0.OooOO0(abstractC0186o00Ooooo);
        return (C1100oOOoOo0o) super.OooO00o(abstractC0186o00Ooooo);
    }

    public final C1100oOOoOo0o OooOOo0() {
        if (this.OooOo0O) {
            return clone().OooOOo0();
        }
        OooOO0();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1098oOOoOo00 OooOOoo(Object obj, InterfaceC1292oOooO00O interfaceC1292oOooO00O, InterfaceC1097oOOoOo interfaceC1097oOOoOo, C0675o0oooO c0675o0oooO, EnumC1000oOOOO0oo enumC1000oOOOO0oo, int i, int i2, AbstractC0186o00Ooooo abstractC0186o00Ooooo) {
        C0505o0o00O0o c0505o0o00O0o;
        InterfaceC1097oOOoOo c0505o0o00O0o2;
        C0505o0o00O0o c0505o0o00O0o3;
        InterfaceC1098oOOoOo00 c1220oOoOOooO;
        int i3;
        int i4;
        EnumC1000oOOOO0oo enumC1000oOOOO0oo2;
        int i5;
        int i6;
        if (this.Oooo0 != null) {
            C0505o0o00O0o c0505o0o00O0o4 = new C0505o0o00O0o(obj, interfaceC1097oOOoOo);
            c0505o0o00O0o = c0505o0o00O0o4;
            c0505o0o00O0o2 = c0505o0o00O0o4;
        } else {
            c0505o0o00O0o = null;
            c0505o0o00O0o2 = interfaceC1097oOOoOo;
        }
        C1100oOOoOo0o c1100oOOoOo0o = this.Oooo00o;
        if (c1100oOOoOo0o == null) {
            c0505o0o00O0o3 = c0505o0o00O0o;
            Object obj2 = this.Oooo000;
            ArrayList arrayList = this.Oooo00O;
            C1932ooo0Oo0 c1932ooo0Oo0 = this.OooOooO;
            c1220oOoOOooO = new C1220oOoOOooO(this.OooOoOO, c1932ooo0Oo0, obj, obj2, this.OooOoo, abstractC0186o00Ooooo, i, i2, enumC1000oOOOO0oo, interfaceC1292oOooO00O, arrayList, c0505o0o00O0o2, c1932ooo0Oo0.OooO0oO, c0675o0oooO.OooO00o);
        } else if (!this.Oooo0o0) {
            C0675o0oooO c0675o0oooO2 = c1100oOOoOo0o.Oooo0O0 ? c0675o0oooO : c1100oOOoOo0o.OooOooo;
            if (AbstractC0186o00Ooooo.OooO0o(c1100oOOoOo0o.OooO00o, 8)) {
                enumC1000oOOOO0oo2 = this.Oooo00o.OooO0Oo;
            } else {
                int ordinal = enumC1000oOOOO0oo.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    enumC1000oOOOO0oo2 = EnumC1000oOOOO0oo.OooO00o;
                } else if (ordinal == 2) {
                    enumC1000oOOOO0oo2 = EnumC1000oOOOO0oo.OooO0O0;
                } else if (ordinal != 3) {
                    throw new IllegalArgumentException("unknown priority: " + this.OooO0Oo);
                } else {
                    enumC1000oOOOO0oo2 = EnumC1000oOOOO0oo.OooO0OO;
                }
            }
            EnumC1000oOOOO0oo enumC1000oOOOO0oo3 = enumC1000oOOOO0oo2;
            C1100oOOoOo0o c1100oOOoOo0o2 = this.Oooo00o;
            int i7 = c1100oOOoOo0o2.OooOO0O;
            int i8 = c1100oOOoOo0o2.OooOO0;
            if (AbstractC1401oo00OOO0.OooO(i, i2)) {
                C1100oOOoOo0o c1100oOOoOo0o3 = this.Oooo00o;
                if (!AbstractC1401oo00OOO0.OooO(c1100oOOoOo0o3.OooOO0O, c1100oOOoOo0o3.OooOO0)) {
                    i6 = abstractC0186o00Ooooo.OooOO0O;
                    i5 = abstractC0186o00Ooooo.OooOO0;
                    C1316oOooOoOo c1316oOooOoOo = new C1316oOooOoOo(obj, c0505o0o00O0o2);
                    Object obj3 = this.Oooo000;
                    ArrayList arrayList2 = this.Oooo00O;
                    C1932ooo0Oo0 c1932ooo0Oo02 = this.OooOooO;
                    c0505o0o00O0o3 = c0505o0o00O0o;
                    C1220oOoOOooO c1220oOoOOooO2 = new C1220oOoOOooO(this.OooOoOO, c1932ooo0Oo02, obj, obj3, this.OooOoo, abstractC0186o00Ooooo, i, i2, enumC1000oOOOO0oo, interfaceC1292oOooO00O, arrayList2, c1316oOooOoOo, c1932ooo0Oo02.OooO0oO, c0675o0oooO.OooO00o);
                    this.Oooo0o0 = true;
                    C1100oOOoOo0o c1100oOOoOo0o4 = this.Oooo00o;
                    InterfaceC1098oOOoOo00 OooOOoo = c1100oOOoOo0o4.OooOOoo(obj, interfaceC1292oOooO00O, c1316oOooOoOo, c0675o0oooO2, enumC1000oOOOO0oo3, i6, i5, c1100oOOoOo0o4);
                    this.Oooo0o0 = false;
                    c1316oOooOoOo.OooO0OO = c1220oOoOOooO2;
                    c1316oOooOoOo.OooO0Oo = OooOOoo;
                    c1220oOoOOooO = c1316oOooOoOo;
                }
            }
            i5 = i8;
            i6 = i7;
            C1316oOooOoOo c1316oOooOoOo2 = new C1316oOooOoOo(obj, c0505o0o00O0o2);
            Object obj32 = this.Oooo000;
            ArrayList arrayList22 = this.Oooo00O;
            C1932ooo0Oo0 c1932ooo0Oo022 = this.OooOooO;
            c0505o0o00O0o3 = c0505o0o00O0o;
            C1220oOoOOooO c1220oOoOOooO22 = new C1220oOoOOooO(this.OooOoOO, c1932ooo0Oo022, obj, obj32, this.OooOoo, abstractC0186o00Ooooo, i, i2, enumC1000oOOOO0oo, interfaceC1292oOooO00O, arrayList22, c1316oOooOoOo2, c1932ooo0Oo022.OooO0oO, c0675o0oooO.OooO00o);
            this.Oooo0o0 = true;
            C1100oOOoOo0o c1100oOOoOo0o42 = this.Oooo00o;
            InterfaceC1098oOOoOo00 OooOOoo2 = c1100oOOoOo0o42.OooOOoo(obj, interfaceC1292oOooO00O, c1316oOooOoOo2, c0675o0oooO2, enumC1000oOOOO0oo3, i6, i5, c1100oOOoOo0o42);
            this.Oooo0o0 = false;
            c1316oOooOoOo2.OooO0OO = c1220oOoOOooO22;
            c1316oOooOoOo2.OooO0Oo = OooOOoo2;
            c1220oOoOOooO = c1316oOooOoOo2;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        C0505o0o00O0o c0505o0o00O0o5 = c0505o0o00O0o3;
        if (c0505o0o00O0o5 == null) {
            return c1220oOoOOooO;
        }
        C1100oOOoOo0o c1100oOOoOo0o5 = this.Oooo0;
        int i9 = c1100oOOoOo0o5.OooOO0O;
        int i10 = c1100oOOoOo0o5.OooOO0;
        if (AbstractC1401oo00OOO0.OooO(i, i2)) {
            C1100oOOoOo0o c1100oOOoOo0o6 = this.Oooo0;
            if (!AbstractC1401oo00OOO0.OooO(c1100oOOoOo0o6.OooOO0O, c1100oOOoOo0o6.OooOO0)) {
                i4 = abstractC0186o00Ooooo.OooOO0O;
                i3 = abstractC0186o00Ooooo.OooOO0;
                C1100oOOoOo0o c1100oOOoOo0o7 = this.Oooo0;
                InterfaceC1098oOOoOo00 OooOOoo3 = c1100oOOoOo0o7.OooOOoo(obj, interfaceC1292oOooO00O, c0505o0o00O0o5, c1100oOOoOo0o7.OooOooo, c1100oOOoOo0o7.OooO0Oo, i4, i3, c1100oOOoOo0o7);
                c0505o0o00O0o5.OooO0OO = c1220oOoOOooO;
                c0505o0o00O0o5.OooO0Oo = OooOOoo3;
                return c0505o0o00O0o5;
            }
        }
        i3 = i10;
        i4 = i9;
        C1100oOOoOo0o c1100oOOoOo0o72 = this.Oooo0;
        InterfaceC1098oOOoOo00 OooOOoo32 = c1100oOOoOo0o72.OooOOoo(obj, interfaceC1292oOooO00O, c0505o0o00O0o5, c1100oOOoOo0o72.OooOooo, c1100oOOoOo0o72.OooO0Oo, i4, i3, c1100oOOoOo0o72);
        c0505o0o00O0o5.OooO0OO = c1220oOoOOooO;
        c0505o0o00O0o5.OooO0Oo = OooOOoo32;
        return c0505o0o00O0o5;
    }

    public final void OooOo0(InterfaceC1292oOooO00O interfaceC1292oOooO00O, AbstractC0186o00Ooooo abstractC0186o00Ooooo) {
        AbstractC0694o0ooooo0.OooOO0(interfaceC1292oOooO00O);
        if (this.Oooo0OO) {
            InterfaceC1098oOOoOo00 OooOOoo = OooOOoo(new Object(), interfaceC1292oOooO00O, null, this.OooOooo, abstractC0186o00Ooooo.OooO0Oo, abstractC0186o00Ooooo.OooOO0O, abstractC0186o00Ooooo.OooOO0, abstractC0186o00Ooooo);
            InterfaceC1098oOOoOo00 OooO0o = interfaceC1292oOooO00O.OooO0o();
            if (OooOOoo.OooO0OO(OooO0o) && (abstractC0186o00Ooooo.OooO || !OooO0o.OooOO0O())) {
                AbstractC0694o0ooooo0.OooOO0O(OooO0o, "Argument must not be null");
                if (!OooO0o.isRunning()) {
                    OooO0o.OooOO0();
                    return;
                }
                return;
            }
            this.OooOoo0.OooOO0o(interfaceC1292oOooO00O);
            interfaceC1292oOooO00O.OooO0OO(OooOOoo);
            ComponentCallbacks2C1106oOOoOoo0 componentCallbacks2C1106oOOoOoo0 = this.OooOoo0;
            synchronized (componentCallbacks2C1106oOOoOoo0) {
                componentCallbacks2C1106oOOoOoo0.OooO0o.OooO00o.add(interfaceC1292oOooO00O);
                C1228oOoOo0O0 c1228oOoOo0O0 = componentCallbacks2C1106oOOoOoo0.OooO0Oo;
                ((Set) c1228oOoOo0O0.OooO0OO).add(OooOOoo);
                if (!c1228oOoOo0O0.OooO0O0) {
                    OooOOoo.OooOO0();
                } else {
                    OooOOoo.clear();
                    Log.isLoggable("RequestTracker", 2);
                    ((HashSet) c1228oOoOo0O0.OooO0Oo).add(OooOOoo);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @Override // com.ninja.engine.AbstractC0186o00Ooooo
    /* renamed from: OooOo00 */
    public final C1100oOOoOo0o clone() {
        C1100oOOoOo0o c1100oOOoOo0o = (C1100oOOoOo0o) super.clone();
        c1100oOOoOo0o.OooOooo = c1100oOOoOo0o.OooOooo.clone();
        if (c1100oOOoOo0o.Oooo00O != null) {
            c1100oOOoOo0o.Oooo00O = new ArrayList(c1100oOOoOo0o.Oooo00O);
        }
        C1100oOOoOo0o c1100oOOoOo0o2 = c1100oOOoOo0o.Oooo00o;
        if (c1100oOOoOo0o2 != null) {
            c1100oOOoOo0o.Oooo00o = c1100oOOoOo0o2.clone();
        }
        C1100oOOoOo0o c1100oOOoOo0o3 = c1100oOOoOo0o.Oooo0;
        if (c1100oOOoOo0o3 != null) {
            c1100oOOoOo0o.Oooo0 = c1100oOOoOo0o3.clone();
        }
        return c1100oOOoOo0o;
    }

    public final C1100oOOoOo0o OooOo0O(Object obj) {
        if (this.OooOo0O) {
            return clone().OooOo0O(obj);
        }
        this.Oooo000 = obj;
        this.Oooo0OO = true;
        OooOO0();
        return this;
    }

    @Override // com.ninja.engine.AbstractC0186o00Ooooo
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1100oOOoOo0o)) {
            return false;
        }
        C1100oOOoOo0o c1100oOOoOo0o = (C1100oOOoOo0o) obj;
        if (!super.equals(c1100oOOoOo0o)) {
            return false;
        }
        if (!Objects.equals(this.OooOoo, c1100oOOoOo0o.OooOoo) || !this.OooOooo.equals(c1100oOOoOo0o.OooOooo) || !Objects.equals(this.Oooo000, c1100oOOoOo0o.Oooo000) || !Objects.equals(this.Oooo00O, c1100oOOoOo0o.Oooo00O) || !Objects.equals(this.Oooo00o, c1100oOOoOo0o.Oooo00o) || !Objects.equals(this.Oooo0, c1100oOOoOo0o.Oooo0) || this.Oooo0O0 != c1100oOOoOo0o.Oooo0O0 || this.Oooo0OO != c1100oOOoOo0o.Oooo0OO) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.AbstractC0186o00Ooooo
    public final int hashCode() {
        return AbstractC1401oo00OOO0.OooO0oO(this.Oooo0OO ? 1 : 0, AbstractC1401oo00OOO0.OooO0oO(this.Oooo0O0 ? 1 : 0, AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(super.hashCode(), this.OooOoo), this.OooOooo), this.Oooo000), this.Oooo00O), this.Oooo00o), this.Oooo0), null)));
    }
}



