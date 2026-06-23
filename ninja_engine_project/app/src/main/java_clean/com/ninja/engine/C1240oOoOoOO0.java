package com.ninja.engine;

import android.os.Handler;
/* renamed from: com.ninja.engine.oOoOoOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1240oOoOoOO0 implements InterfaceC2035oooOoo0O {
    public final /* synthetic */ C1241oOoOoOOo OooO00o;
    public final /* synthetic */ long OooO0O0;
    public final /* synthetic */ Handler OooO0OO;

    public /* synthetic */ C1240oOoOoOO0(C1241oOoOoOOo c1241oOoOoOOo, long j, Handler handler) {
        this.OooO00o = c1241oOoOoOOo;
        this.OooO0O0 = j;
        this.OooO0OO = handler;
    }

    @Override // com.ninja.engine.InterfaceC2035oooOoo0O
    public final void OooO00o(int i) {
        C1241oOoOoOOo c1241oOoOoOOo = this.OooO00o;
        c1241oOoOoOOo.getClass();
        long max = Math.max(0L, 2500 - (System.currentTimeMillis() - this.OooO0O0));
        this.OooO0OO.postDelayed(new RunnableC1138oOOoooO0(i, 2, c1241oOoOoOOo), max);
    }
}


