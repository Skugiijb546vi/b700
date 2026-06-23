package com.ninja.engine;

import java.util.concurrent.Callable;
/* renamed from: com.ninja.engine.o0OOooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0401o0OOooOO implements Callable {
    public final /* synthetic */ C0403o0OOooo OooO00o;

    public CallableC0401o0OOooOO(C0403o0OOooo c0403o0OOooo) {
        this.OooO00o = c0403o0OOooo;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.OooO00o) {
            try {
                C0403o0OOooo c0403o0OOooo = this.OooO00o;
                if (c0403o0OOooo.OooO != null) {
                    c0403o0OOooo.OooOOO();
                    if (this.OooO00o.OooO0oO()) {
                        this.OooO00o.OooOO0o();
                        this.OooO00o.OooOO0O = 0;
                    }
                }
            } finally {
            }
        }
        return null;
    }
}
