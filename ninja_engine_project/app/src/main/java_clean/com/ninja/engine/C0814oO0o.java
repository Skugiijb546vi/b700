package com.ninja.engine;
/* renamed from: com.ninja.engine.oO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814oO0o extends C0838oO0o0oo {
    public InterfaceC0882oO0oo0O0 OooO0Oo;

    @Override // com.ninja.engine.C0838oO0o0oo
    public final int OooO0O0(Object obj) {
        InterfaceC1108oOOoo interfaceC1108oOOoo = (InterfaceC1108oOOoo) obj;
        if (interfaceC1108oOOoo == null) {
            return 1;
        }
        return interfaceC1108oOOoo.OooO00o();
    }

    @Override // com.ninja.engine.C0838oO0o0oo
    public final void OooO0OO(Object obj, Object obj2) {
        InterfaceC0745oO00oOo interfaceC0745oO00oOo = (InterfaceC0745oO00oOo) obj;
        InterfaceC1108oOOoo interfaceC1108oOOoo = (InterfaceC1108oOOoo) obj2;
        InterfaceC0882oO0oo0O0 interfaceC0882oO0oo0O0 = this.OooO0Oo;
        if (interfaceC0882oO0oo0O0 != null && interfaceC1108oOOoo != null) {
            ((C0496o0o000OO) interfaceC0882oO0oo0O0).OooO0o0.OooO0OO(interfaceC1108oOOoo, true);
        }
    }

    public final void OooO0o(int i) {
        long j;
        if (i >= 40) {
            OooO0o0(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.OooO0O0;
            }
            OooO0o0(j / 2);
        }
    }
}


