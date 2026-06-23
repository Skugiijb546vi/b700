package androidx.lifecycle;

import android.os.Looper;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1179oOo0o0oO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C0536o0o0O0oO;
import com.ninja.engine.C0762oO0O0oO0;
import com.ninja.engine.C1183oOoO0oo;
import com.ninja.engine.C1799ooOOOoO0;
import com.ninja.engine.EnumC0759oO0O0o;
import com.ninja.engine.InterfaceC0363o0OOOo;
import com.ninja.engine.InterfaceC0678o0oooO0O;
import com.ninja.engine.InterfaceC0757oO0O0Oo;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.o00OO000;
import com.ninja.engine.oO0O0O0o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class OooO00o {
    public final boolean OooO00o;
    public C0536o0o0O0oO OooO0O0;
    public EnumC0759oO0O0o OooO0OO;
    public final WeakReference OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0;
    public boolean OooO0oO;
    public final ArrayList OooO0oo;

    public OooO00o(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O) {
        AbstractC0809oO0OooOO.OooOOOo(interfaceC0760oO0O0o0O, "provider");
        new AtomicReference();
        this.OooO00o = true;
        this.OooO0O0 = new C0536o0o0O0oO();
        this.OooO0OO = EnumC0759oO0O0o.OooO0O0;
        this.OooO0oo = new ArrayList();
        this.OooO0Oo = new WeakReference(interfaceC0760oO0O0o0O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.ninja.engine.oO0O0oO0] */
    public final void OooO00o(InterfaceC0757oO0O0Oo interfaceC0757oO0O0Oo) {
        InterfaceC1800ooOOOoOo reflectiveGenericLifecycleObserver;
        InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O;
        ArrayList arrayList = this.OooO0oo;
        AbstractC0809oO0OooOO.OooOOOo(interfaceC0757oO0O0Oo, "observer");
        OooO0OO("addObserver");
        EnumC0759oO0O0o enumC0759oO0O0o = this.OooO0OO;
        EnumC0759oO0O0o enumC0759oO0O0o2 = EnumC0759oO0O0o.OooO00o;
        if (enumC0759oO0O0o != enumC0759oO0O0o2) {
            enumC0759oO0O0o2 = EnumC0759oO0O0o.OooO0O0;
        }
        Object obj = new Object();
        HashMap hashMap = AbstractC1179oOo0o0oO.OooO00o;
        boolean z = interfaceC0757oO0O0Oo instanceof InterfaceC1800ooOOOoOo;
        boolean z2 = interfaceC0757oO0O0Oo instanceof InterfaceC0363o0OOOo;
        boolean z3 = false;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0363o0OOOo) interfaceC0757oO0O0Oo, (InterfaceC1800ooOOOoOo) interfaceC0757oO0O0Oo);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0363o0OOOo) interfaceC0757oO0O0Oo, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC1800ooOOOoOo) interfaceC0757oO0O0Oo;
        } else {
            Class<?> cls = interfaceC0757oO0O0Oo.getClass();
            if (AbstractC1179oOo0o0oO.OooO0OO(cls) == 2) {
                Object obj2 = AbstractC1179oOo0o0oO.OooO0O0.get(cls);
                AbstractC0809oO0OooOO.OooOO0o(obj2);
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC0678o0oooO0O[] interfaceC0678o0oooO0OArr = new InterfaceC0678o0oooO0O[size];
                    if (size <= 0) {
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0678o0oooO0OArr);
                    } else {
                        AbstractC1179oOo0o0oO.OooO00o((Constructor) list.get(0), interfaceC0757oO0O0Oo);
                        throw null;
                    }
                } else {
                    AbstractC1179oOo0o0oO.OooO00o((Constructor) list.get(0), interfaceC0757oO0O0Oo);
                    throw null;
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0757oO0O0Oo);
            }
        }
        obj.OooO0O0 = reflectiveGenericLifecycleObserver;
        obj.OooO00o = enumC0759oO0O0o2;
        if (((C0762oO0O0oO0) this.OooO0O0.OooO0OO(interfaceC0757oO0O0Oo, obj)) != null || (interfaceC0760oO0O0o0O = (InterfaceC0760oO0O0o0O) this.OooO0Oo.get()) == null) {
            return;
        }
        z3 = (this.OooO0o0 != 0 || this.OooO0o) ? true : true;
        EnumC0759oO0O0o OooO0O0 = OooO0O0(interfaceC0757oO0O0Oo);
        this.OooO0o0++;
        while (obj.OooO00o.compareTo(OooO0O0) < 0 && this.OooO0O0.OooO0o0.containsKey(interfaceC0757oO0O0Oo)) {
            arrayList.add(obj.OooO00o);
            C1799ooOOOoO0 c1799ooOOOoO0 = oO0O0O0o.Companion;
            EnumC0759oO0O0o enumC0759oO0O0o3 = obj.OooO00o;
            c1799ooOOOoO0.getClass();
            oO0O0O0o OooO00o = C1799ooOOOoO0.OooO00o(enumC0759oO0O0o3);
            if (OooO00o != null) {
                obj.OooO00o(interfaceC0760oO0O0o0O, OooO00o);
                arrayList.remove(arrayList.size() - 1);
                OooO0O0 = OooO0O0(interfaceC0757oO0O0Oo);
            } else {
                throw new IllegalStateException("no event up from " + obj.OooO00o);
            }
        }
        if (!z3) {
            OooO0oo();
        }
        this.OooO0o0--;
    }

    public final EnumC0759oO0O0o OooO0O0(InterfaceC0757oO0O0Oo interfaceC0757oO0O0Oo) {
        C1183oOoO0oo c1183oOoO0oo;
        EnumC0759oO0O0o enumC0759oO0O0o;
        C0762oO0O0oO0 c0762oO0O0oO0;
        HashMap hashMap = this.OooO0O0.OooO0o0;
        EnumC0759oO0O0o enumC0759oO0O0o2 = null;
        if (hashMap.containsKey(interfaceC0757oO0O0Oo)) {
            c1183oOoO0oo = ((C1183oOoO0oo) hashMap.get(interfaceC0757oO0O0Oo)).OooO0Oo;
        } else {
            c1183oOoO0oo = null;
        }
        if (c1183oOoO0oo != null && (c0762oO0O0oO0 = (C0762oO0O0oO0) c1183oOoO0oo.OooO0O0) != null) {
            enumC0759oO0O0o = c0762oO0O0oO0.OooO00o;
        } else {
            enumC0759oO0O0o = null;
        }
        ArrayList arrayList = this.OooO0oo;
        if (!arrayList.isEmpty()) {
            enumC0759oO0O0o2 = (EnumC0759oO0O0o) arrayList.get(arrayList.size() - 1);
        }
        EnumC0759oO0O0o enumC0759oO0O0o3 = this.OooO0OO;
        AbstractC0809oO0OooOO.OooOOOo(enumC0759oO0O0o3, "state1");
        if (enumC0759oO0O0o == null || enumC0759oO0O0o.compareTo(enumC0759oO0O0o3) >= 0) {
            enumC0759oO0O0o = enumC0759oO0O0o3;
        }
        if (enumC0759oO0O0o2 == null || enumC0759oO0O0o2.compareTo(enumC0759oO0O0o) >= 0) {
            return enumC0759oO0O0o;
        }
        return enumC0759oO0O0o2;
    }

    public final void OooO0OO(String str) {
        if (this.OooO00o) {
            ((o00OO000) o00OO000.OooOOo().OooO0O0).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1230oOoOo0o.OooO0oo("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void OooO0Oo(oO0O0O0o oo0o0o0o) {
        AbstractC0809oO0OooOO.OooOOOo(oo0o0o0o, "event");
        OooO0OO("handleLifecycleEvent");
        OooO0o0(oo0o0o0o.OooO00o());
    }

    public final void OooO0o(InterfaceC0757oO0O0Oo interfaceC0757oO0O0Oo) {
        AbstractC0809oO0OooOO.OooOOOo(interfaceC0757oO0O0Oo, "observer");
        OooO0OO("removeObserver");
        this.OooO0O0.OooO0O0(interfaceC0757oO0O0Oo);
    }

    public final void OooO0o0(EnumC0759oO0O0o enumC0759oO0O0o) {
        EnumC0759oO0O0o enumC0759oO0O0o2 = this.OooO0OO;
        if (enumC0759oO0O0o2 == enumC0759oO0O0o) {
            return;
        }
        EnumC0759oO0O0o enumC0759oO0O0o3 = EnumC0759oO0O0o.OooO0O0;
        EnumC0759oO0O0o enumC0759oO0O0o4 = EnumC0759oO0O0o.OooO00o;
        if (enumC0759oO0O0o2 == enumC0759oO0O0o3 && enumC0759oO0O0o == enumC0759oO0O0o4) {
            throw new IllegalStateException(("no event down from " + this.OooO0OO + " in component " + this.OooO0Oo.get()).toString());
        }
        this.OooO0OO = enumC0759oO0O0o;
        if (!this.OooO0o && this.OooO0o0 == 0) {
            this.OooO0o = true;
            OooO0oo();
            this.OooO0o = false;
            if (this.OooO0OO == enumC0759oO0O0o4) {
                this.OooO0O0 = new C0536o0o0O0oO();
                return;
            }
            return;
        }
        this.OooO0oO = true;
    }

    public final void OooO0oO() {
        EnumC0759oO0O0o enumC0759oO0O0o = EnumC0759oO0O0o.OooO0OO;
        OooO0OO("setCurrentState");
        OooO0o0(enumC0759oO0O0o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        r7.OooO0oO = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oo() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.OooO00o.OooO0oo():void");
    }
}
