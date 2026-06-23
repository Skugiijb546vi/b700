package com.ninja.engine;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.ninja.engine.oO0Oo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793oO0Oo0o {
    public static final oO0Oo0o0 OooO0OO = new oO0Oo0o0(Object.class, Object.class, Object.class, Collections.singletonList(new C0354o0OOO0Oo(Object.class, Object.class, Object.class, Collections.emptyList(), new C0455o0OoOo00(6), null)), null);
    public final C0145o00OO0oO OooO00o = new C1218oOoOOoo();
    public final AtomicReference OooO0O0 = new AtomicReference();

    public final void OooO00o(Class cls, Class cls2, Class cls3, oO0Oo0o0 oo0oo0o0) {
        synchronized (this.OooO00o) {
            C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
            C0907oOO00O0o c0907oOO00O0o = new C0907oOO00O0o(cls, cls2, cls3);
            if (oo0oo0o0 == null) {
                oo0oo0o0 = OooO0OO;
            }
            c0145o00OO0oO.put(c0907oOO00O0o, oo0oo0o0);
        }
    }
}


