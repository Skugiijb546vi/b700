package com.ninja.engine;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.location.LocationManager$GpsStatusListenerTransport")
/* renamed from: com.ninja.engine.oOOO0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0980oOOO0OoO {
    @InterfaceC0162o00Oo0oO
    Field _check_mListener();

    @InterfaceC0162o00Oo0oO
    Field _check_mNmeaListener();

    @InterfaceC0166o00OoO00
    Method _check_onFirstFix(int i);

    @InterfaceC0166o00OoO00
    Method _check_onGpsStarted();

    @InterfaceC0166o00OoO00
    Method _check_onNmeaReceived(long j, String str);

    @InterfaceC0162o00Oo0oO
    Field _check_this$0();

    @InterfaceC0563o0oOO
    void _set_mListener(Object obj);

    @InterfaceC0563o0oOO
    void _set_mNmeaListener(Object obj);

    @InterfaceC0563o0oOO
    void _set_this$0(Object obj);

    @InterfaceC0163o00Oo0oo
    Object mListener();

    @InterfaceC0163o00Oo0oo
    Object mNmeaListener();

    Void onFirstFix(int i);

    Void onGpsStarted();

    Void onNmeaReceived(long j, String str);

    @InterfaceC0163o00Oo0oo
    Object this$0();
}


