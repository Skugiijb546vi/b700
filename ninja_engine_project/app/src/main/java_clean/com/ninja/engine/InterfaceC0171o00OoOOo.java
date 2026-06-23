package com.ninja.engine;

import android.net.NetworkInfo;
@InterfaceC0158o00Oo0O0("android.net.NetworkInfo")
/* renamed from: com.ninja.engine.o00OoOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0171o00OoOOo {
    @InterfaceC0159o00Oo0Oo
    InterfaceC0171o00OoOOo _new(int i);

    @InterfaceC0159o00Oo0Oo
    InterfaceC0171o00OoOOo _new(int i, int i2, String str, String str2);

    @InterfaceC0160o00Oo0o
    NetworkInfo.DetailedState mDetailedState();

    @InterfaceC0160o00Oo0o
    boolean mIsAvailable();

    @InterfaceC0160o00Oo0o
    int mNetworkType();

    @InterfaceC0160o00Oo0o
    NetworkInfo.State mState();

    @InterfaceC0160o00Oo0o
    String mTypeName();
}


