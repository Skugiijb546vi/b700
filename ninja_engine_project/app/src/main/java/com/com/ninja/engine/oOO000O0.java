package com.ninja.engine;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class oOO000O0 extends C0838oO0o0oo {
    @Override // com.ninja.engine.C0838oO0o0oo
    public final void OooO0OO(Object obj, Object obj2) {
        oOO000OO ooo000oo = (oOO000OO) obj;
        ooo000oo.getClass();
        ArrayDeque arrayDeque = oOO000OO.OooO0Oo;
        synchronized (arrayDeque) {
            arrayDeque.offer(ooo000oo);
        }
    }
}
