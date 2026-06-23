package com.ninja.engine;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
@InterfaceC0158o00Oo0O0("android.app.ActivityThread")
/* loaded from: classes.dex */
public interface OooO00o {

    @InterfaceC0158o00Oo0O0("android.app.ActivityThread$ActivityClientRecord")
    /* renamed from: com.ninja.engine.OooO00o$OooO00o  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0003OooO00o {
        @InterfaceC0160o00Oo0o
        Activity activity();

        @InterfaceC0160o00Oo0o
        ActivityInfo activityInfo();

        @InterfaceC0160o00Oo0o
        Intent intent();

        @InterfaceC0160o00Oo0o
        Boolean isTopResumedActivity();

        @InterfaceC0160o00Oo0o
        boolean mPreserveWindow();

        @InterfaceC0160o00Oo0o
        Object packageInfo();

        @InterfaceC0153o00Oo
        String toString();

        @InterfaceC0160o00Oo0o
        IBinder token();

        @InterfaceC0160o00Oo0o
        Window window();
    }

    @InterfaceC0158o00Oo0O0("android.app.ActivityThread$AppBindData")
    /* loaded from: classes.dex */
    public interface OooO0O0 {
        @InterfaceC0160o00Oo0o
        ApplicationInfo appInfo();

        @InterfaceC0160o00Oo0o
        Object info();

        @InterfaceC0160o00Oo0o
        ComponentName instrumentationName();

        @InterfaceC0160o00Oo0o
        String processName();

        @InterfaceC0160o00Oo0o
        List<ProviderInfo> providers();
    }

    @InterfaceC0158o00Oo0O0("android.app.ActivityThread$CreateServiceData")
    /* loaded from: classes.dex */
    public interface OooO0OO {
        @InterfaceC0160o00Oo0o
        Object compatInfo();

        @InterfaceC0160o00Oo0o
        ServiceInfo info();

        @InterfaceC0160o00Oo0o
        Intent intent();

        @InterfaceC0160o00Oo0o
        IBinder token();
    }

    @InterfaceC0158o00Oo0O0("android.app.ActivityThread$H")
    /* renamed from: com.ninja.engine.OooO00o$OooO0Oo  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC0007OooO0Oo {
        @InterfaceC0168o00OoOO
        int CREATE_SERVICE();

        @InterfaceC0168o00OoOO
        int EXECUTE_TRANSACTION();

        @InterfaceC0168o00OoOO
        int LAUNCH_ACTIVITY();

        @InterfaceC0168o00OoOO
        int SCHEDULE_CRASH();
    }

    @InterfaceC0158o00Oo0O0("android.app.ActivityThread$ProviderClientRecord")
    /* loaded from: classes.dex */
    public interface OooO0o {
        @InterfaceC0160o00Oo0o
        Object mHolder();

        @InterfaceC0160o00Oo0o
        IInterface mProvider();
    }

    @InterfaceC0158o00Oo0O0("android.app.ActivityThread$ProviderClientRecord")
    /* renamed from: com.ninja.engine.OooO00o$OooO0o0  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC0008OooO0o0 {
        @InterfaceC0159o00Oo0Oo
        InterfaceC0008OooO0o0 _new();

        @InterfaceC0160o00Oo0o
        String mName();

        @InterfaceC0160o00Oo0o
        IInterface mProvider();
    }

    @InterfaceC0158o00Oo0O0("android.app.ActivityThread$ProviderClientRecord")
    /* renamed from: com.ninja.engine.OooO00o$OooO0oO  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC0009OooO0oO {
        @InterfaceC0159o00Oo0Oo
        InterfaceC0009OooO0oO _new();

        @InterfaceC0160o00Oo0o
        String[] mNames();

        @InterfaceC0160o00Oo0o
        IInterface mProvider();
    }

    @InterfaceC0158o00Oo0O0("android.app.ActivityThread$ProviderKey")
    /* renamed from: com.ninja.engine.OooO00o$OooO0oo  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC0010OooO0oo {
        @InterfaceC0159o00Oo0Oo
        InterfaceC0010OooO0oo _new(String str, int i);
    }

    @InterfaceC0170o00OoOOO
    Object currentActivityThread();

    @InterfaceC0170o00OoOOO
    Application currentApplication();

    @InterfaceC0170o00OoOOO
    String currentPackageName();

    @InterfaceC0153o00Oo
    Object getActivityClient(IBinder iBinder);

    @InterfaceC0153o00Oo
    IBinder getApplicationThread();

    @InterfaceC0153o00Oo
    Handler getHandler();

    @InterfaceC0153o00Oo
    Object getLaunchingActivity(IBinder iBinder);

    @InterfaceC0153o00Oo
    Object getPackageInfo(ApplicationInfo applicationInfo, @InterfaceC0169o00OoOO0("android.content.res.CompatibilityInfo") Object obj, int i);

    @InterfaceC0153o00Oo
    String getProcessName();

    @InterfaceC0153o00Oo
    Object getSystemContext();

    @InterfaceC0160o00Oo0o
    Map<IBinder, Object> mActivities();

    @InterfaceC0160o00Oo0o
    Object mAppThread();

    @InterfaceC0160o00Oo0o
    Object mBoundApplication();

    @InterfaceC0160o00Oo0o
    Handler mH();

    @InterfaceC0160o00Oo0o
    Application mInitialApplication();

    @InterfaceC0160o00Oo0o
    Instrumentation mInstrumentation();

    @InterfaceC0160o00Oo0o
    Map<?, ?> mLocalProvidersByName();

    @InterfaceC0160o00Oo0o
    Map<String, WeakReference<?>> mPackages();

    @InterfaceC0160o00Oo0o
    Map<?, ?> mProviderMap();

    @InterfaceC0153o00Oo
    void performNewIntents(IBinder iBinder, List list);

    @InterfaceC0168o00OoOO
    IInterface sPackageManager();

    @InterfaceC0168o00OoOO
    IInterface sPermissionManager();

    @InterfaceC0153o00Oo
    void sendActivityResult(IBinder iBinder, String str, int i, int i2, Intent intent);
}


