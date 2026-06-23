package com.ninja.engine;

import android.net.ConnectivityManager;
import android.net.Network;
/* renamed from: com.ninja.engine.oOoOo00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226oOoOo00O extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C0067o0000Ooo OooO00o;

    public C1226oOoOo00O(C0067o0000Ooo c0067o0000Ooo) {
        this.OooO00o = c0067o0000Ooo;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC1401oo00OOO0.OooO0o().post(new RunnableC1224oOoOo00(this, true, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC1401oo00OOO0.OooO0o().post(new RunnableC1224oOoOo00(this, false, 0));
    }
}


