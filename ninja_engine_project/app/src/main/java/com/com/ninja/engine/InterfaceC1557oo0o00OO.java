package com.ninja.engine;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.location.LocationManager$GnssStatusListenerTransport")
/* renamed from: com.ninja.engine.oo0o00OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1557oo0o00OO {
    @InterfaceC0162o00Oo0oO
    Field _check_mListener();

    @InterfaceC0166o00OoO00
    Method _check_onLocationChanged(Location location);

    @InterfaceC0166o00OoO00
    Method _check_onProviderDisabled(String str);

    @InterfaceC0166o00OoO00
    Method _check_onProviderEnabled(String str);

    @InterfaceC0166o00OoO00
    Method _check_onStatusChanged(String str, int i, Bundle bundle);

    @InterfaceC0162o00Oo0oO
    Field _check_this$0();

    @InterfaceC0563o0oOO
    void _set_mListener(Object obj);

    @InterfaceC0563o0oOO
    void _set_this$0(Object obj);

    @InterfaceC0163o00Oo0oo
    LocationListener mListener();

    Void onLocationChanged(Location location);

    Void onProviderDisabled(String str);

    Void onProviderEnabled(String str);

    Void onStatusChanged(String str, int i, Bundle bundle);

    @InterfaceC0163o00Oo0oo
    Object this$0();
}
