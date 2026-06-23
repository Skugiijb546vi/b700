package androidx.lifecycle;

import com.ninja.engine.C0287o0O00Oo;
import com.ninja.engine.C0288o0O00OoO;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.oO0O0O0o;
import java.util.HashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC1800ooOOOoOo {
    public final Object OooO00o;
    public final C0287o0O00Oo OooO0O0;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.OooO00o = obj;
        C0288o0O00OoO c0288o0O00OoO = C0288o0O00OoO.OooO0OO;
        Class<?> cls = obj.getClass();
        C0287o0O00Oo c0287o0O00Oo = (C0287o0O00Oo) c0288o0O00OoO.OooO00o.get(cls);
        this.OooO0O0 = c0287o0O00Oo == null ? c0288o0O00OoO.OooO00o(cls, null) : c0287o0O00Oo;
    }

    @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
    public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
        HashMap hashMap = this.OooO0O0.OooO00o;
        Object obj = this.OooO00o;
        C0287o0O00Oo.OooO00o((List) hashMap.get(oo0o0o0o), interfaceC0760oO0O0o0O, oo0o0o0o, obj);
        C0287o0O00Oo.OooO00o((List) hashMap.get(oO0O0O0o.ON_ANY), interfaceC0760oO0O0o0O, oo0o0o0o, obj);
    }
}


