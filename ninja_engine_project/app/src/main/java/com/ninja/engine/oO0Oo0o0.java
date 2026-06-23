package com.ninja.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class oO0Oo0o0 {
    public final oOOOO0O0 OooO00o;
    public final List OooO0O0;
    public final String OooO0OO;

    public oO0Oo0o0(Class cls, Class cls2, Class cls3, List list, C0131o00O0o c0131o00O0o) {
        this.OooO00o = c0131o00O0o;
        if (!list.isEmpty()) {
            this.OooO0O0 = list;
            this.OooO0OO = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final InterfaceC1108oOOoo OooO00o(int i, int i2, C0073o0000oO0 c0073o0000oO0, o0OO0oO0 o0oo0oo0, C0973oOOO00o c0973oOOO00o) {
        oOOOO0O0 ooooo0o0 = this.OooO00o;
        Object OooO = ooooo0o0.OooO();
        AbstractC0694o0ooooo0.OooOO0O(OooO, "Argument must not be null");
        List list = (List) OooO;
        try {
            List list2 = this.OooO0O0;
            int size = list2.size();
            InterfaceC1108oOOoo interfaceC1108oOOoo = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC1108oOOoo = ((C0354o0OOO0Oo) list2.get(i3)).OooO00o(i, i2, c0073o0000oO0, o0oo0oo0, c0973oOOO00o);
                } catch (C0695o0oooooO e) {
                    list.add(e);
                }
                if (interfaceC1108oOOoo != null) {
                    break;
                }
            }
            if (interfaceC1108oOOoo != null) {
                return interfaceC1108oOOoo;
            }
            throw new C0695o0oooooO(this.OooO0OO, new ArrayList(list));
        } finally {
            ooooo0o0.OooO0OO(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.OooO0O0.toArray()) + '}';
    }
}
