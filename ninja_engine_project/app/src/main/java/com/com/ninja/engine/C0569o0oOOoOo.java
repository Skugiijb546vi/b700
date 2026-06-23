package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oOOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569o0oOOoOo implements InterfaceC0319o0O0o0oo {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0569o0oOOoOo(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.ninja.engine.InterfaceC0319o0O0o0oo
    public final void OooO00o(Object obj) {
        C0571o0oOOoo0 c0571o0oOOoo0 = (C0571o0oOOoo0) obj;
        switch (this.OooO00o) {
            case 0:
                if (c0571o0oOOoo0 == null) {
                    c0571o0oOOoo0 = new C0571o0oOOoo0(-3);
                }
                ((C0415o0Oo0O0O) this.OooO0O0).Oooo0(c0571o0oOOoo0);
                return;
            default:
                synchronized (AbstractC0570o0oOOoo.OooO0OO) {
                    try {
                        C1218oOoOOoo c1218oOoOOoo = AbstractC0570o0oOOoo.OooO0Oo;
                        ArrayList arrayList = (ArrayList) c1218oOoOOoo.get((String) this.OooO0O0);
                        if (arrayList != null) {
                            c1218oOoOOoo.remove((String) this.OooO0O0);
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((InterfaceC0319o0O0o0oo) arrayList.get(i)).OooO00o(c0571o0oOOoo0);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
