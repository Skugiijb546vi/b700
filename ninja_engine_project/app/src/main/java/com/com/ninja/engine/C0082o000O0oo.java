package com.ninja.engine;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* renamed from: com.ninja.engine.o000O0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082o000O0oo implements InterfaceC1213oOoOOo0O {
    public final /* synthetic */ int OooO00o = 0;
    public final Object OooO0O0;

    public C0082o000O0oo(o000OO00 o000oo00) {
        this.OooO0O0 = o000oo00;
    }

    @Override // com.ninja.engine.InterfaceC1213oOoOOo0O
    public final Bundle OooO00o() {
        switch (this.OooO00o) {
            case 0:
                Bundle bundle = new Bundle();
                ((o000OO00) this.OooO0O0).OooOOoo().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.OooO0O0));
                return bundle2;
        }
    }

    public C0082o000O0oo(C0086o000Oo00 c0086o000Oo00) {
        AbstractC0809oO0OooOO.OooOOOo(c0086o000Oo00, "registry");
        this.OooO0O0 = new LinkedHashSet();
        c0086o000Oo00.OooO0o0("androidx.savedstate.Restarter", this);
    }
}
