package com.ninja.engine;

import android.net.wifi.SupplicantState;
import java.net.InetAddress;
@InterfaceC0158o00Oo0O0("android.net.wifi.WifiInfo")
/* renamed from: com.ninja.engine.o0000OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0063o0000OOo {
    @InterfaceC0159o00Oo0Oo
    InterfaceC0063o0000OOo _new();

    @InterfaceC0160o00Oo0o
    String mBSSID();

    @InterfaceC0160o00Oo0o
    int mFrequency();

    @InterfaceC0160o00Oo0o
    InetAddress mIpAddress();

    @InterfaceC0160o00Oo0o
    int mLinkSpeed();

    @InterfaceC0160o00Oo0o
    String mMacAddress();

    @InterfaceC0160o00Oo0o
    int mNetworkId();

    @InterfaceC0160o00Oo0o
    int mRssi();

    @InterfaceC0160o00Oo0o
    String mSSID();

    @InterfaceC0160o00Oo0o
    SupplicantState mSupplicantState();

    @InterfaceC0160o00Oo0o
    Object mWifiSsid();
}
