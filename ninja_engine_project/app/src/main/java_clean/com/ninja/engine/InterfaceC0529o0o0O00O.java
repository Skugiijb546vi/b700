package com.ninja.engine;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
@InterfaceC0157o00Oo0O("android.app.ActivityThread")
/* renamed from: com.ninja.engine.o0o0O00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0529o0o0O00O {
    @InterfaceC0166o00OoO00
    Method _check_getActivityClient(IBinder iBinder);

    @InterfaceC0166o00OoO00
    Method _check_getApplicationThread();

    @InterfaceC0166o00OoO00
    Method _check_getHandler();

    @InterfaceC0166o00OoO00
    Method _check_getLaunchingActivity(IBinder iBinder);

    @InterfaceC0166o00OoO00
    Method _check_getPackageInfo(ApplicationInfo applicationInfo, @InterfaceC0169o00OoOO0("android.content.res.CompatibilityInfo") Object obj, int i);

    @InterfaceC0166o00OoO00
    Method _check_getProcessName();

    @InterfaceC0166o00OoO00
    Method _check_getSystemContext();

    @InterfaceC0162o00Oo0oO
    Field _check_mActivities();

    @InterfaceC0162o00Oo0oO
    Field _check_mAppThread();

    @InterfaceC0162o00Oo0oO
    Field _check_mBoundApplication();

    @InterfaceC0162o00Oo0oO
    Field _check_mH();

    @InterfaceC0162o00Oo0oO
    Field _check_mInitialApplication();

    @InterfaceC0162o00Oo0oO
    Field _check_mInstrumentation();

    @InterfaceC0162o00Oo0oO
    Field _check_mLocalProvidersByName();

    @InterfaceC0162o00Oo0oO
    Field _check_mPackages();

    @InterfaceC0162o00Oo0oO
    Field _check_mProviderMap();

    @InterfaceC0166o00OoO00
    Method _check_performNewIntents(IBinder iBinder, List list);

    @InterfaceC0166o00OoO00
    Method _check_sendActivityResult(IBinder iBinder, String str, int i, int i2, Intent intent);

    @InterfaceC0563o0oOO
    void _set_mActivities(Object obj);

    @InterfaceC0563o0oOO
    void _set_mAppThread(Object obj);

    @InterfaceC0563o0oOO
    void _set_mBoundApplication(Object obj);

    @InterfaceC0563o0oOO
    void _set_mH(Object obj);

    @InterfaceC0563o0oOO
    void _set_mInitialApplication(Object obj);

    @InterfaceC0563o0oOO
    void _set_mInstrumentation(Object obj);

    @InterfaceC0563o0oOO
    void _set_mLocalProvidersByName(Object obj);

    @InterfaceC0563o0oOO
    void _set_mPackages(Object obj);

    @InterfaceC0563o0oOO
    void _set_mProviderMap(Object obj);

    Object getActivityClient(IBinder iBinder);

    IBinder getApplicationThread();

    Handler getHandler();

    Object getLaunchingActivity(IBinder iBinder);

    Object getPackageInfo(ApplicationInfo applicationInfo, @InterfaceC0169o00OoOO0("android.content.res.CompatibilityInfo") Object obj, int i);

    String getProcessName();

    Object getSystemContext();

    @InterfaceC0163o00Oo0oo
    Map<IBinder, Object> mActivities();

    @InterfaceC0163o00Oo0oo
    Object mAppThread();

    @InterfaceC0163o00Oo0oo
    Object mBoundApplication();

    @InterfaceC0163o00Oo0oo
    Handler mH();

    @InterfaceC0163o00Oo0oo
    Application mInitialApplication();

    @InterfaceC0163o00Oo0oo
    Instrumentation mInstrumentation();

    @InterfaceC0163o00Oo0oo
    Map<?, ?> mLocalProvidersByName();

    @InterfaceC0163o00Oo0oo
    Map<String, WeakReference<?>> mPackages();

    @InterfaceC0163o00Oo0oo
    Map<?, ?> mProviderMap();

    Void performNewIntents(IBinder iBinder, List list);

    Void sendActivityResult(IBinder iBinder, String str, int i, int i2, Intent intent);
}


