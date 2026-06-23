package com.ninja.engine;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.List;
@InterfaceC0158o00Oo0O0("android.app.IApplicationThread")
/* renamed from: com.ninja.engine.oOOOooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1042oOOOooOO {
    @InterfaceC0153o00Oo
    void scheduleBindService(IBinder iBinder, Intent intent, boolean z);

    @InterfaceC0153o00Oo
    void scheduleCreateService(IBinder iBinder, ServiceInfo serviceInfo);

    @InterfaceC0153o00Oo
    void scheduleNewIntent(List list, IBinder iBinder);

    @InterfaceC0153o00Oo
    void scheduleServiceArgs(IBinder iBinder, int i, int i2, Intent intent);

    @InterfaceC0153o00Oo
    void scheduleStopService(IBinder iBinder);

    @InterfaceC0153o00Oo
    void scheduleUnbindService(IBinder iBinder, Intent intent);
}


