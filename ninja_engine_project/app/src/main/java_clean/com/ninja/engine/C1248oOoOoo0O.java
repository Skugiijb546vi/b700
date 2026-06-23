package com.ninja.engine;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;
/* renamed from: com.ninja.engine.oOoOoo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248oOoOoo0O implements InterfaceC1225oOoOo000 {
    public static final Executor OooO0oO = AsyncTask.SERIAL_EXECUTOR;
    public final Context OooO00o;
    public final InterfaceC0305o0O0OoO0 OooO0O0;
    public final oO00000o OooO0OO;
    public volatile boolean OooO0Oo;
    public final C0105o000o0o0 OooO0o = new C0105o000o0o0(1, this);
    public volatile boolean OooO0o0;

    public C1248oOoOoo0O(Context context, C0325o0O0oOO0 c0325o0O0oOO0, C1221oOoOOooo c1221oOoOOooo) {
        this.OooO00o = context.getApplicationContext();
        this.OooO0OO = c0325o0O0oOO0;
        this.OooO0O0 = c1221oOoOOooo;
    }

    @Override // com.ninja.engine.InterfaceC1225oOoOo000
    public final void OooO00o() {
        OooO0oO.execute(new RunnableC1223oOoOo0(this, 1));
    }

    @Override // com.ninja.engine.InterfaceC1225oOoOo000
    public final boolean OooO0O0() {
        OooO0oO.execute(new RunnableC1223oOoOo0(this, 0));
        return true;
    }

    public final boolean OooO0OO() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.OooO0OO.get()).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }
}


