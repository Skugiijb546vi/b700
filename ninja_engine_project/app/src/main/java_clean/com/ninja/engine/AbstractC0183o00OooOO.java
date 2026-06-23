package com.ninja.engine;

import java.util.ArrayDeque;
/* renamed from: com.ninja.engine.o00OooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0183o00OooOO implements oOO000o {
    public final Object OooO00o;

    public AbstractC0183o00OooOO() {
        char[] cArr = AbstractC1401oo00OOO0.OooO00o;
        this.OooO00o = new ArrayDeque(20);
    }

    public void OooO00o(InterfaceC0994oOOOO00o interfaceC0994oOOOO00o) {
        ArrayDeque arrayDeque = (ArrayDeque) this.OooO00o;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC0994oOOOO00o);
        }
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        return new C0230o00oOO(2, (C0601o0oOooO0) this.OooO00o);
    }

    public AbstractC0183o00OooOO(C0601o0oOooO0 c0601o0oOooO0) {
        this.OooO00o = c0601o0oOooO0;
    }
}


