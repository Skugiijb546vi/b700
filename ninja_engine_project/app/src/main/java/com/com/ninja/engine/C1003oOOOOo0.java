package com.ninja.engine;

import android.os.Handler;
/* renamed from: com.ninja.engine.oOOOOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003oOOOOo0 implements InterfaceC0760oO0O0o0O {
    public static final C1003oOOOOo0 OooO = new C1003oOOOOo0();
    public int OooO00o;
    public int OooO0O0;
    public Handler OooO0o0;
    public boolean OooO0OO = true;
    public boolean OooO0Oo = true;
    public final androidx.lifecycle.OooO00o OooO0o = new androidx.lifecycle.OooO00o(this);
    public final RunnableC0061o00000oO OooO0oO = new RunnableC0061o00000oO(14, this);
    public final C0331o0O0oo OooO0oo = new C0331o0O0oo(25, this);

    public final void OooO0O0() {
        int i = this.OooO0O0 + 1;
        this.OooO0O0 = i;
        if (i == 1) {
            if (this.OooO0OO) {
                this.OooO0o.OooO0Oo(oO0O0O0o.ON_RESUME);
                this.OooO0OO = false;
                return;
            }
            Handler handler = this.OooO0o0;
            AbstractC0809oO0OooOO.OooOO0o(handler);
            handler.removeCallbacks(this.OooO0oO);
        }
    }

    @Override // com.ninja.engine.InterfaceC0760oO0O0o0O
    public final androidx.lifecycle.OooO00o OooO0o0() {
        return this.OooO0o;
    }
}
