package com.ninja.engine;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.List;
@InterfaceC0157o00Oo0O("android.app.IApplicationThread")
/* renamed from: com.ninja.engine.oOo00Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1161oOo00Oo {
    @InterfaceC0166o00OoO00
    Method _check_scheduleBindService(IBinder iBinder, Intent intent, boolean z);

    @InterfaceC0166o00OoO00
    Method _check_scheduleCreateService(IBinder iBinder, ServiceInfo serviceInfo);

    @InterfaceC0166o00OoO00
    Method _check_scheduleNewIntent(List list, IBinder iBinder);

    @InterfaceC0166o00OoO00
    Method _check_scheduleServiceArgs(IBinder iBinder, int i, int i2, Intent intent);

    @InterfaceC0166o00OoO00
    Method _check_scheduleStopService(IBinder iBinder);

    @InterfaceC0166o00OoO00
    Method _check_scheduleUnbindService(IBinder iBinder, Intent intent);

    Void scheduleBindService(IBinder iBinder, Intent intent, boolean z);

    Void scheduleCreateService(IBinder iBinder, ServiceInfo serviceInfo);

    Void scheduleNewIntent(List list, IBinder iBinder);

    Void scheduleServiceArgs(IBinder iBinder, int i, int i2, Intent intent);

    Void scheduleStopService(IBinder iBinder);

    Void scheduleUnbindService(IBinder iBinder, Intent intent);
}


