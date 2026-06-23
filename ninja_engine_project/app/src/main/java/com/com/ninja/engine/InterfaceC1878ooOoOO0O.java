package com.ninja.engine;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.app.IActivityManager")
/* renamed from: com.ninja.engine.ooOoOO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1878ooOoOO0O {
    @InterfaceC0166o00OoO00
    Method _check_getTaskForActivity(IBinder iBinder, boolean z);

    @InterfaceC0166o00OoO00
    Method _check_overridePendingTransition(IBinder iBinder, String str, int i, int i2);

    @InterfaceC0166o00OoO00
    Method _check_setRequestedOrientation(IBinder iBinder, int i);

    @InterfaceC0166o00OoO00
    Method _check_startActivities();

    @InterfaceC0166o00OoO00
    Method _check_startActivity(@InterfaceC0169o00OoOO0("android.app.IApplicationThread") Object obj, String str, Intent intent, String str2, IBinder iBinder, String str3, int i, int i2, @InterfaceC0169o00OoOO0("android.app.ProfilerInfo") Object obj2, Bundle bundle);

    Integer getTaskForActivity(IBinder iBinder, boolean z);

    Void overridePendingTransition(IBinder iBinder, String str, int i, int i2);

    Void setRequestedOrientation(IBinder iBinder, int i);

    Integer startActivities();

    Integer startActivity(@InterfaceC0169o00OoOO0("android.app.IApplicationThread") Object obj, String str, Intent intent, String str2, IBinder iBinder, String str3, int i, int i2, @InterfaceC0169o00OoOO0("android.app.ProfilerInfo") Object obj2, Bundle bundle);
}
