package com.ninja.engine;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
@InterfaceC0158o00Oo0O0("android.app.IActivityManager")
/* renamed from: com.ninja.engine.ooOO0o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1767ooOO0o0o {

    @InterfaceC0158o00Oo0O0("android.app.IActivityManager$ContentProviderHolder")
    /* renamed from: com.ninja.engine.ooOO0o0o$OooO00o */
    /* loaded from: classes.dex */
    public interface OooO00o {
        @InterfaceC0160o00Oo0o
        ProviderInfo info();

        @InterfaceC0160o00Oo0o
        boolean noReleaseNeeded();

        @InterfaceC0160o00Oo0o
        IInterface provider();
    }

    @InterfaceC0158o00Oo0O0("android.app.IActivityManager$ContentProviderHolder")
    /* renamed from: com.ninja.engine.ooOO0o0o$OooO0O0 */
    /* loaded from: classes.dex */
    public interface OooO0O0 {
        @InterfaceC0160o00Oo0o
        ProviderInfo info();

        @InterfaceC0160o00Oo0o
        boolean noReleaseNeeded();

        @InterfaceC0160o00Oo0o
        IInterface provider();

        @InterfaceC0160o00Oo0o
        boolean waitProcessStart();
    }

    @InterfaceC0153o00Oo
    Integer getTaskForActivity(IBinder iBinder, boolean z);

    @InterfaceC0153o00Oo
    void overridePendingTransition(IBinder iBinder, String str, int i, int i2);

    @InterfaceC0153o00Oo
    void setRequestedOrientation(IBinder iBinder, int i);

    @InterfaceC0153o00Oo
    Integer startActivities();

    @InterfaceC0153o00Oo
    Integer startActivity(@InterfaceC0169o00OoOO0("android.app.IApplicationThread") Object obj, String str, Intent intent, String str2, IBinder iBinder, String str3, int i, int i2, @InterfaceC0169o00OoOO0("android.app.ProfilerInfo") Object obj2, Bundle bundle);
}
