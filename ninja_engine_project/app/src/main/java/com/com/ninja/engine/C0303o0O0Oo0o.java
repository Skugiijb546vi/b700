package com.ninja.engine;

import android.view.View;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.ninja.engine.o0O0Oo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303o0O0Oo0o {
    public static final C0303o0O0Oo0o OooO0o = new Object();
    public int OooO00o;
    public int OooO0O0;
    public Object OooO0OO;
    public Object OooO0Oo;
    public Object OooO0o0;

    public InterfaceC0353o0OO0ooo OooO00o() {
        if (((InterfaceC0353o0OO0ooo) this.OooO0o0) == null) {
            synchronized (C0303o0O0Oo0o.class) {
                try {
                    if (((InterfaceC0353o0OO0ooo) this.OooO0o0) == null) {
                        this.OooO0o0 = new C0919oOO00oOo(1);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC0353o0OO0ooo) this.OooO0o0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ninja.engine.o0OOOO0o, java.lang.Object] */
    public o0OOOO0o OooO0O0() {
        if (((o0OOOO0o) this.OooO0Oo) == null) {
            synchronized (C0303o0O0Oo0o.class) {
                try {
                    if (((o0OOOO0o) this.OooO0Oo) == null) {
                        this.OooO0Oo = new Object();
                    }
                } finally {
                }
            }
        }
        ((o0OOOO0o) this.OooO0Oo).getClass();
        return new Object();
    }

    public void OooO0OO(C1536oo0OoOoO c1536oo0OoOoO, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1520oo0Oo0OO c1520oo0Oo0OO = (C1520oo0Oo0OO) it.next();
            if ((c1520oo0Oo0OO.OooO00o.OooO0OO() & 8) != 0) {
                ((View) this.OooO0Oo).setTranslationY(o000OO0O.OooO0OO(this.OooO0O0, 0, c1520oo0Oo0OO.OooO00o.OooO0O0()));
                return;
            }
        }
    }
}
