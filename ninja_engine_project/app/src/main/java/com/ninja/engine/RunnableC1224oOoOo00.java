package com.ninja.engine;
/* renamed from: com.ninja.engine.oOoOo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1224oOoOo00 implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ boolean OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public /* synthetic */ RunnableC1224oOoOo00(Object obj, boolean z, int i) {
        this.OooO00o = i;
        this.OooO0OO = obj;
        this.OooO0O0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                C1226oOoOo00O c1226oOoOo00O = (C1226oOoOo00O) this.OooO0OO;
                c1226oOoOo00O.getClass();
                AbstractC1401oo00OOO0.OooO00o();
                C0067o0000Ooo c0067o0000Ooo = c1226oOoOo00O.OooO00o;
                boolean z = c0067o0000Ooo.OooO00o;
                boolean z2 = this.OooO0O0;
                c0067o0000Ooo.OooO00o = z2;
                if (z != z2) {
                    ((InterfaceC0305o0O0OoO0) c0067o0000Ooo.OooO0O0).OooO00o(z2);
                    return;
                }
                return;
            default:
                ((C1248oOoOoo0O) this.OooO0OO).OooO0O0.OooO00o(this.OooO0O0);
                return;
        }
    }
}
