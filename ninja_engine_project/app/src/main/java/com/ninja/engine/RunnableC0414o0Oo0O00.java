package com.ninja.engine;

import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.ninja.engine.o0Oo0O00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0414o0Oo0O00 implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C0413o0Oo0O0 OooO0O0;

    public /* synthetic */ RunnableC0414o0Oo0O00(C0413o0Oo0O0 c0413o0Oo0O0, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0413o0Oo0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                C0413o0Oo0O0 c0413o0Oo0O0 = this.OooO0O0;
                InterfaceC0965oOO0ooo interfaceC0965oOO0ooo = c0413o0Oo0O0.OooOO0O;
                if (interfaceC0965oOO0ooo != null) {
                    interfaceC0965oOO0ooo.OooO00o();
                }
                c0413o0Oo0O0.OooOO0 = null;
                c0413o0Oo0O0.OooOO0O = null;
                ((ConcurrentHashMap) C0415o0Oo0O0O.OooOoo0().OooO0O0).remove(Integer.valueOf(c0413o0Oo0O0.OooOO0o));
                return;
            case 1:
                C0413o0Oo0O0 c0413o0Oo0O02 = this.OooO0O0;
                InterfaceC0965oOO0ooo interfaceC0965oOO0ooo2 = c0413o0Oo0O02.OooOO0O;
                if (interfaceC0965oOO0ooo2 != null) {
                    interfaceC0965oOO0ooo2.OooO0o();
                }
                c0413o0Oo0O02.OooOO0 = null;
                c0413o0Oo0O02.OooOO0O = null;
                ((ConcurrentHashMap) C0415o0Oo0O0O.OooOoo0().OooO0O0).remove(Integer.valueOf(c0413o0Oo0O02.OooOO0o));
                return;
            case 2:
                this.OooO0O0.getClass();
                return;
            default:
                this.OooO0O0.getClass();
                return;
        }
    }

    public RunnableC0414o0Oo0O00(C0413o0Oo0O0 c0413o0Oo0O0, C0601o0oOooO0 c0601o0oOooO0) {
        this.OooO00o = 0;
        this.OooO0O0 = c0413o0Oo0O0;
    }
}
