package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604o0oOooo implements InterfaceC0605o0oOooo0 {
    public final int OooO00o;
    public final int OooO0O0 = 1;
    public final /* synthetic */ C0606o0oOoooO OooO0OO;

    public C0604o0oOooo(C0606o0oOoooO c0606o0oOoooO, int i) {
        this.OooO0OO = c0606o0oOoooO;
        this.OooO00o = i;
    }

    @Override // com.ninja.engine.InterfaceC0605o0oOooo0
    public final boolean OooO00o(ArrayList arrayList, ArrayList arrayList2) {
        C0606o0oOoooO c0606o0oOoooO = this.OooO0OO;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = c0606o0oOoooO.OooOo0o;
        int i = this.OooO00o;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null && i < 0 && abstractComponentCallbacksC0593o0oOoOo0.OooO0oo().Oooo0o(-1, 0)) {
            return false;
        }
        return c0606o0oOoooO.Oooo0oO(arrayList, arrayList2, i, this.OooO0O0);
    }
}


