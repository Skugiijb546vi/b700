package com.ninja.engine;

import android.os.Build;
import java.util.Set;
/* renamed from: com.ninja.engine.o0OoOoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459o0OoOoO0 extends AbstractC0809oO0OooOO {
    public final /* synthetic */ C0463o0OoOoo0 OooOo0;

    public C0459o0OoOoO0(C0463o0OoOoo0 c0463o0OoOoo0) {
        this.OooOo0 = c0463o0OoOoo0;
    }
    public void o00Oo0(Object obj, float f) {}
    public Object OoooOOo(int i, android.content.Intent intent) { return null; }
    public float Oooo0OO(Object obj) { return 0.0f; }
    public void OoooOoO(C0024OooOoO0 c, Thread t) {}
    public void OoooOo0(C0024OooOoO0 c1, C0024OooOoO0 c2) {}

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void OoooOOO(oOO00OOO ooo00ooo) {
        Set<int[]> OooOo0o;
        C0463o0OoOoo0 c0463o0OoOoo0 = this.OooOo0;
        c0463o0OoOoo0.OooO0OO = ooo00ooo;
        oOO00OOO ooo00ooo2 = c0463o0OoOoo0.OooO0OO;
        C0469o0Ooo00O c0469o0Ooo00O = c0463o0OoOoo0.OooO00o;
        C0601o0oOooO0 c0601o0oOooO0 = c0469o0Ooo00O.OooO0oO;
        o0OOOO0 o0oooo0 = c0469o0Ooo00O.OooO;
        if (Build.VERSION.SDK_INT >= 34) {
            OooOo0o = AbstractC0472o0Ooo0O0.OooO00o();
        } else {
            OooOo0o = AbstractC0692o0ooooOo.OooOo0o();
        }
        c0463o0OoOoo0.OooO0O0 = new C0131o00O0o(ooo00ooo2, c0601o0oOooO0, o0oooo0, OooOo0o);
        c0463o0OoOoo0.OooO00o.OooO0o0();
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void o000oOoO(Throwable th) {
        this.OooOo0.OooO00o.OooO0Oo(th);
    }
}


