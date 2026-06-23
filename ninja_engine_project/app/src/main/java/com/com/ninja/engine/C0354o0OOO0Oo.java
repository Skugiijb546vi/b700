package com.ninja.engine;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* renamed from: com.ninja.engine.o0OOO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354o0OOO0Oo {
    public final Class OooO00o;
    public final List OooO0O0;
    public final InterfaceC1134oOOooo0 OooO0OO;
    public final oOOOO0O0 OooO0Oo;
    public final String OooO0o0;

    public C0354o0OOO0Oo(Class cls, Class cls2, Class cls3, List list, InterfaceC1134oOOooo0 interfaceC1134oOOooo0, C0131o00O0o c0131o00O0o) {
        this.OooO00o = cls;
        this.OooO0O0 = list;
        this.OooO0OO = interfaceC1134oOOooo0;
        this.OooO0Oo = c0131o00O0o;
        this.OooO0o0 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final InterfaceC1108oOOoo OooO00o(int i, int i2, C0073o0000oO0 c0073o0000oO0, o0OO0oO0 o0oo0oo0, C0973oOOO00o c0973oOOO00o) {
        C0811oO0Oooo c0811oO0Oooo;
        InterfaceC1351oo00000O interfaceC1351oo00000O;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC0745oO00oOo c0345o0OO0Ooo;
        oOOOO0O0 ooooo0o0 = this.OooO0Oo;
        Object OooO = ooooo0o0.OooO();
        AbstractC0694o0ooooo0.OooOO0O(OooO, "Argument must not be null");
        List list = (List) OooO;
        try {
            InterfaceC1108oOOoo OooO0O0 = OooO0O0(o0oo0oo0, i, i2, c0973oOOO00o, list);
            ooooo0o0.OooO0OO(list);
            o0OOO0OO o0ooo0oo = (o0OOO0OO) c0073o0000oO0.OooO0O0;
            o0ooo0oo.getClass();
            Class<?> cls = OooO0O0.get().getClass();
            int i4 = c0073o0000oO0.OooO00o;
            o0OOO0O0 o0ooo0o0 = o0ooo0oo.OooO00o;
            InterfaceC1128oOOooOOo interfaceC1128oOOooOOo = null;
            if (i4 != 4) {
                InterfaceC1351oo00000O OooO0o = o0ooo0o0.OooO0o(cls);
                c0811oO0Oooo = OooO0o.OooO00o(o0ooo0oo.OooO0oo, OooO0O0, o0ooo0oo.OooOO0o, o0ooo0oo.OooOOO0);
                interfaceC1351oo00000O = OooO0o;
            } else {
                c0811oO0Oooo = OooO0O0;
                interfaceC1351oo00000O = null;
            }
            if (!OooO0O0.equals(c0811oO0Oooo)) {
                OooO0O0.OooO0Oo();
            }
            if (o0ooo0o0.OooO0OO.OooO0O0().OooO0Oo.OooOoO0(c0811oO0Oooo.OooO0O0()) != null) {
                C1089oOOoOOO OooO0O02 = o0ooo0o0.OooO0OO.OooO0O0();
                OooO0O02.getClass();
                interfaceC1128oOOooOOo = OooO0O02.OooO0Oo.OooOoO0(c0811oO0Oooo.OooO0O0());
                if (interfaceC1128oOOooOOo != null) {
                    i3 = interfaceC1128oOOooOOo.OooOoO0(o0ooo0oo.OooOOOO);
                } else {
                    throw new C1087oOOoOO0O(c0811oO0Oooo.OooO0O0());
                }
            } else {
                i3 = 3;
            }
            InterfaceC0745oO00oOo interfaceC0745oO00oOo = o0ooo0oo.OooOo0;
            ArrayList OooO0O03 = o0ooo0o0.OooO0O0();
            int size = OooO0O03.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    if (((C0903oOO000Oo) OooO0O03.get(i5)).OooO00o.equals(interfaceC0745oO00oOo)) {
                        z = true;
                        break;
                    }
                    i5++;
                } else {
                    z = false;
                    break;
                }
            }
            if (o0ooo0oo.OooOOO.OooO0Oo(i4, i3, !z)) {
                if (interfaceC1128oOOooOOo != null) {
                    int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(i3);
                    if (OooOOOo != 0) {
                        if (OooOOOo == 1) {
                            z2 = true;
                            c0345o0OO0Ooo = new C1122oOOooO0(o0ooo0o0.OooO0OO.OooO00o, o0ooo0oo.OooOo0, o0ooo0oo.OooO, o0ooo0oo.OooOO0o, o0ooo0oo.OooOOO0, interfaceC1351oo00000O, cls, o0ooo0oo.OooOOOO);
                            z3 = false;
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: ".concat(AbstractC1230oOoOo0o.OooOo0(i3)));
                        }
                    } else {
                        z2 = true;
                        z3 = false;
                        c0345o0OO0Ooo = new C0345o0OO0Ooo(o0ooo0oo.OooOo0, o0ooo0oo.OooO);
                    }
                    C0811oO0Oooo c0811oO0Oooo2 = (C0811oO0Oooo) C0811oO0Oooo.OooO0o0.OooO();
                    c0811oO0Oooo2.OooO0Oo = z3;
                    c0811oO0Oooo2.OooO0OO = z2;
                    c0811oO0Oooo2.OooO0O0 = c0811oO0Oooo;
                    C0131o00O0o c0131o00O0o = o0ooo0oo.OooO0o;
                    c0131o00O0o.OooO0O0 = c0345o0OO0Ooo;
                    c0131o00O0o.OooO0OO = interfaceC1128oOOooOOo;
                    c0131o00O0o.OooO0Oo = c0811oO0Oooo2;
                    c0811oO0Oooo = c0811oO0Oooo2;
                } else {
                    throw new C1087oOOoOO0O(c0811oO0Oooo.get().getClass());
                }
            }
            return this.OooO0OO.OooOOo(c0811oO0Oooo, c0973oOOO00o);
        } catch (Throwable th) {
            ooooo0o0.OooO0OO(list);
            throw th;
        }
    }

    public final InterfaceC1108oOOoo OooO0O0(o0OO0oO0 o0oo0oo0, int i, int i2, C0973oOOO00o c0973oOOO00o, List list) {
        List list2 = this.OooO0O0;
        int size = list2.size();
        InterfaceC1108oOOoo interfaceC1108oOOoo = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1125oOOooO0o interfaceC1125oOOooO0o = (InterfaceC1125oOOooO0o) list2.get(i3);
            try {
                if (interfaceC1125oOOooO0o.OooO00o(o0oo0oo0.OooOOOo(), c0973oOOO00o)) {
                    interfaceC1108oOOoo = interfaceC1125oOOooO0o.OooO0O0(o0oo0oo0.OooOOOo(), i, i2, c0973oOOO00o);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC1125oOOooO0o);
                }
                list.add(e);
            }
            if (interfaceC1108oOOoo != null) {
                break;
            }
        }
        if (interfaceC1108oOOoo != null) {
            return interfaceC1108oOOoo;
        }
        throw new C0695o0oooooO(this.OooO0o0, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.OooO00o + ", decoders=" + this.OooO0O0 + ", transcoder=" + this.OooO0OO + '}';
    }
}
