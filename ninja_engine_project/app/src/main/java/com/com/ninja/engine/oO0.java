package com.ninja.engine;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.location.LocationManager$GnssStatusListenerTransport")
/* loaded from: classes.dex */
public interface oO0 {
    @InterfaceC0162o00Oo0oO
    Field _check_mGpsListener();

    @InterfaceC0162o00Oo0oO
    Field _check_mGpsNmeaListener();

    @InterfaceC0166o00OoO00
    Method _check_onFirstFix(int i);

    @InterfaceC0166o00OoO00
    Method _check_onGnssStarted();

    @InterfaceC0166o00OoO00
    Method _check_onNmeaReceived(long j, String str);

    @InterfaceC0162o00Oo0oO
    Field _check_this$0();

    @InterfaceC0563o0oOO
    void _set_mGpsListener(Object obj);

    @InterfaceC0563o0oOO
    void _set_mGpsNmeaListener(Object obj);

    @InterfaceC0563o0oOO
    void _set_this$0(Object obj);

    @InterfaceC0163o00Oo0oo
    Object mGpsListener();

    @InterfaceC0163o00Oo0oo
    Object mGpsNmeaListener();

    Void onFirstFix(int i);

    Void onGnssStarted();

    Void onNmeaReceived(long j, String str);

    @InterfaceC0163o00Oo0oo
    Object this$0();
}
