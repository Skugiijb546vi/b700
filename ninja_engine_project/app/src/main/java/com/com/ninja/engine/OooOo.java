package com.ninja.engine;
/* loaded from: classes.dex */
public final class OooOo extends AbstractC0809oO0OooOO {
    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final boolean OooO(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, C0024OooOoO0 c0024OooOoO0, C0024OooOoO0 c0024OooOoO02) {
        synchronized (abstractFutureC0023OooOoO) {
            try {
                if (abstractFutureC0023OooOoO.OooO0OO == c0024OooOoO0) {
                    abstractFutureC0023OooOoO.OooO0OO = c0024OooOoO02;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final boolean OooO0oO(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, C0021OooOo0O c0021OooOo0O) {
        C0021OooOo0O c0021OooOo0O2 = C0021OooOo0O.OooO0O0;
        synchronized (abstractFutureC0023OooOoO) {
            try {
                if (abstractFutureC0023OooOoO.OooO0O0 == c0021OooOo0O) {
                    abstractFutureC0023OooOoO.OooO0O0 = c0021OooOo0O2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final boolean OooO0oo(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, Object obj, Object obj2) {
        synchronized (abstractFutureC0023OooOoO) {
            try {
                if (abstractFutureC0023OooOoO.OooO00o == obj) {
                    abstractFutureC0023OooOoO.OooO00o = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void OoooOo0(C0024OooOoO0 c0024OooOoO0, C0024OooOoO0 c0024OooOoO02) {
        c0024OooOoO0.OooO0O0 = c0024OooOoO02;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void OoooOoO(C0024OooOoO0 c0024OooOoO0, Thread thread) {
        c0024OooOoO0.OooO00o = thread;
    }
}
