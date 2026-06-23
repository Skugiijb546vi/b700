package com.ninja.engine;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Map;
@InterfaceC0158o00Oo0O0("android.os.ServiceManager")
/* renamed from: com.ninja.engine.ooOoOo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1890ooOoOo0O {
    @InterfaceC0170o00OoOOO
    void addService(String str, IBinder iBinder);

    @InterfaceC0170o00OoOOO
    IBinder checkService();

    @InterfaceC0170o00OoOOO
    IInterface getIServiceManager();

    @InterfaceC0170o00OoOOO
    IBinder getService(String str);

    @InterfaceC0170o00OoOOO
    String[] listServices();

    @InterfaceC0168o00OoOO
    Map<String, IBinder> sCache();

    @InterfaceC0168o00OoOO
    IInterface sServiceManager();
}
