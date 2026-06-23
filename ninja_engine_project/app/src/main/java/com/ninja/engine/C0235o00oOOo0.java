package com.ninja.engine;

import java.util.ArrayDeque;
/* renamed from: com.ninja.engine.o00oOOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235o00oOOo0 {
    public final ArrayDeque OooO00o;

    public C0235o00oOOo0(int i) {
        switch (i) {
            case 1:
                this.OooO00o = new ArrayDeque();
                return;
            default:
                char[] cArr = AbstractC1401oo00OOO0.OooO00o;
                this.OooO00o = new ArrayDeque(0);
                return;
        }
    }

    public C0399o0OOooO OooO00o() {
        C0399o0OOooO c0399o0OOooO;
        synchronized (this.OooO00o) {
            c0399o0OOooO = (C0399o0OOooO) this.OooO00o.poll();
        }
        if (c0399o0OOooO == null) {
            return new C0399o0OOooO();
        }
        return c0399o0OOooO;
    }

    public void OooO0O0(C0399o0OOooO c0399o0OOooO) {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO00o.size() < 10) {
                    this.OooO00o.offer(c0399o0OOooO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void OooO0OO(C0686o0oooo c0686o0oooo) {
        c0686o0oooo.OooO0O0 = null;
        c0686o0oooo.OooO0OO = null;
        this.OooO00o.offer(c0686o0oooo);
    }
}
