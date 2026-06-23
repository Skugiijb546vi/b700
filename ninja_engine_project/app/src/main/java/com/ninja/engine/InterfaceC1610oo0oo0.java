package com.ninja.engine;

import android.util.ArrayMap;
import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("android.location.LocationManager")
/* renamed from: com.ninja.engine.oo0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1610oo0oo0 {
    @InterfaceC0162o00Oo0oO
    Field _check_mGnssNmeaListeners();

    @InterfaceC0162o00Oo0oO
    Field _check_mGnssStatusListeners();

    @InterfaceC0162o00Oo0oO
    Field _check_mGpsNmeaListeners();

    @InterfaceC0162o00Oo0oO
    Field _check_mGpsStatusListeners();

    @InterfaceC0162o00Oo0oO
    Field _check_mListeners();

    @InterfaceC0563o0oOO
    void _set_mGnssNmeaListeners(Object obj);

    @InterfaceC0563o0oOO
    void _set_mGnssStatusListeners(Object obj);

    @InterfaceC0563o0oOO
    void _set_mGpsNmeaListeners(Object obj);

    @InterfaceC0563o0oOO
    void _set_mGpsStatusListeners(Object obj);

    @InterfaceC0563o0oOO
    void _set_mListeners(Object obj);

    @InterfaceC0163o00Oo0oo
    ArrayMap mGnssNmeaListeners();

    @InterfaceC0163o00Oo0oo
    ArrayMap mGnssStatusListeners();

    @InterfaceC0163o00Oo0oo
    ArrayMap mGpsNmeaListeners();

    @InterfaceC0163o00Oo0oo
    ArrayMap mGpsStatusListeners();

    @InterfaceC0163o00Oo0oo
    ArrayMap mListeners();
}
