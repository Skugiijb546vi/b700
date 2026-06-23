package com.ninja.engine;

import android.content.Context;
import java.util.HashSet;
/* renamed from: com.ninja.engine.o0OOO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358o0OOO0oo implements InterfaceC1510oo0OOoo {
    public final Context OooO00o;
    public final InterfaceC0305o0O0OoO0 OooO0O0;

    public C0358o0OOO0oo(Context context, C1104oOOoOoOo c1104oOOoOoOo) {
        this.OooO00o = context.getApplicationContext();
        this.OooO0O0 = c1104oOOoOoOo;
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooO0O0() {
        C1228oOoOo0O0 OooO0OO = C1228oOoOo0O0.OooO0OO(this.OooO00o);
        InterfaceC0305o0O0OoO0 interfaceC0305o0O0OoO0 = this.OooO0O0;
        synchronized (OooO0OO) {
            ((HashSet) OooO0OO.OooO0Oo).remove(interfaceC0305o0O0OoO0);
            if (OooO0OO.OooO0O0 && ((HashSet) OooO0OO.OooO0Oo).isEmpty()) {
                ((InterfaceC1225oOoOo000) OooO0OO.OooO0OO).OooO00o();
                OooO0OO.OooO0O0 = false;
            }
        }
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooOO0() {
        C1228oOoOo0O0 OooO0OO = C1228oOoOo0O0.OooO0OO(this.OooO00o);
        InterfaceC0305o0O0OoO0 interfaceC0305o0O0OoO0 = this.OooO0O0;
        synchronized (OooO0OO) {
            ((HashSet) OooO0OO.OooO0Oo).add(interfaceC0305o0O0OoO0);
            if (!OooO0OO.OooO0O0 && !((HashSet) OooO0OO.OooO0Oo).isEmpty()) {
                OooO0OO.OooO0O0 = ((InterfaceC1225oOoOo000) OooO0OO.OooO0OO).OooO0O0();
            }
        }
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooOO0O() {
    }
}


