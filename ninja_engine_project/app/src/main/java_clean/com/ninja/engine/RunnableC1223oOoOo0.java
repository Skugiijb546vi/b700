package com.ninja.engine;

import android.content.IntentFilter;
import android.util.Log;
/* renamed from: com.ninja.engine.oOoOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1223oOoOo0 implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C1248oOoOoo0O OooO0O0;

    public /* synthetic */ RunnableC1223oOoOo0(C1248oOoOoo0O c1248oOoOoo0O, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c1248oOoOoo0O;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                C1248oOoOoo0O c1248oOoOoo0O = this.OooO0O0;
                c1248oOoOoo0O.OooO0Oo = c1248oOoOoo0O.OooO0OO();
                try {
                    C1248oOoOoo0O c1248oOoOoo0O2 = this.OooO0O0;
                    c1248oOoOoo0O2.OooO00o.registerReceiver(c1248oOoOoo0O2.OooO0o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.OooO0O0.OooO0o0 = true;
                    return;
                } catch (SecurityException unused) {
                    Log.isLoggable("ConnectivityMonitor", 5);
                    this.OooO0O0.OooO0o0 = false;
                    return;
                }
            case 1:
                if (this.OooO0O0.OooO0o0) {
                    this.OooO0O0.OooO0o0 = false;
                    C1248oOoOoo0O c1248oOoOoo0O3 = this.OooO0O0;
                    c1248oOoOoo0O3.OooO00o.unregisterReceiver(c1248oOoOoo0O3.OooO0o);
                    return;
                }
                return;
            default:
                boolean z = this.OooO0O0.OooO0Oo;
                C1248oOoOoo0O c1248oOoOoo0O4 = this.OooO0O0;
                c1248oOoOoo0O4.OooO0Oo = c1248oOoOoo0O4.OooO0OO();
                if (z != this.OooO0O0.OooO0Oo) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        boolean z2 = this.OooO0O0.OooO0Oo;
                    }
                    C1248oOoOoo0O c1248oOoOoo0O5 = this.OooO0O0;
                    AbstractC1401oo00OOO0.OooO0o().post(new RunnableC1224oOoOo00(c1248oOoOoo0O5, c1248oOoOoo0O5.OooO0Oo, 1));
                    return;
                }
                return;
        }
    }
}


