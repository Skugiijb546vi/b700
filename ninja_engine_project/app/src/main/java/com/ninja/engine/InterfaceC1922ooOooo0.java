package com.ninja.engine;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
@InterfaceC0157o00Oo0O("android.os.ServiceManager")
/* renamed from: com.ninja.engine.ooOooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1922ooOooo0 {
    @InterfaceC0166o00OoO00
    Method _check_addService(String str, IBinder iBinder);

    @InterfaceC0166o00OoO00
    Method _check_checkService();

    @InterfaceC0166o00OoO00
    Method _check_getIServiceManager();

    @InterfaceC0166o00OoO00
    Method _check_getService(String str);

    @InterfaceC0166o00OoO00
    Method _check_listServices();

    @InterfaceC0162o00Oo0oO
    Field _check_sCache();

    @InterfaceC0162o00Oo0oO
    Field _check_sServiceManager();

    @InterfaceC0563o0oOO
    void _set_sCache(Object obj);

    @InterfaceC0563o0oOO
    void _set_sServiceManager(Object obj);

    Void addService(String str, IBinder iBinder);

    IBinder checkService();

    IInterface getIServiceManager();

    IBinder getService(String str);

    String[] listServices();

    @InterfaceC0163o00Oo0oo
    Map<String, IBinder> sCache();

    @InterfaceC0163o00Oo0oo
    IInterface sServiceManager();
}
