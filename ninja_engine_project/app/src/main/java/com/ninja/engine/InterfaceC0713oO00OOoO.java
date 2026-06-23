package com.ninja.engine;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.telephony.TelephonyManager")
/* renamed from: com.ninja.engine.oO00OOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0713oO00OOoO {
    @InterfaceC0166o00OoO00
    Method _check_getSubscriberInfoService();

    @InterfaceC0162o00Oo0oO
    Field _check_sIPhoneSubInfo();

    @InterfaceC0162o00Oo0oO
    Field _check_sServiceHandleCacheEnabled();

    @InterfaceC0563o0oOO
    void _set_sIPhoneSubInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_sServiceHandleCacheEnabled(Object obj);

    Object getSubscriberInfoService();

    @InterfaceC0163o00Oo0oo
    IInterface sIPhoneSubInfo();

    @InterfaceC0163o00Oo0oo
    Boolean sServiceHandleCacheEnabled();
}
