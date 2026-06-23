package com.ninja.engine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* renamed from: com.ninja.engine.o000o0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105o000o0o0 extends BroadcastReceiver {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0105o000o0o0(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.OooO00o) {
            case 0:
                ((AbstractC0104o000o0o) this.OooO0O0).OooOO0o();
                return;
            default:
                C1248oOoOoo0O c1248oOoOoo0O = (C1248oOoOoo0O) this.OooO0O0;
                c1248oOoOoo0O.getClass();
                C1248oOoOoo0O.OooO0oO.execute(new RunnableC1223oOoOo0(c1248oOoOoo0O, 2));
                return;
        }
    }
}
