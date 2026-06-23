package com.ninja.engine;

import android.app.Application;
import android.app.IServiceConnection;
import android.app.Instrumentation;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.app.LoadedApk")
/* renamed from: com.ninja.engine.ooOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1899ooOoo0 {
    @InterfaceC0166o00OoO00
    Method _check_forgetServiceDispatcher(Context context, ServiceConnection serviceConnection);

    @InterfaceC0166o00OoO00
    Method _check_getClassLoader();

    @InterfaceC0166o00OoO00
    Method _check_getResources();

    @InterfaceC0166o00OoO00
    Method _check_getServiceDispatcher(ServiceConnection serviceConnection, Context context, Handler handler, int i);

    @InterfaceC0162o00Oo0oO
    Field _check_mApplication();

    @InterfaceC0162o00Oo0oO
    Field _check_mApplicationInfo();

    @InterfaceC0162o00Oo0oO
    Field _check_mCredentialProtectedDataDirFile();

    @InterfaceC0162o00Oo0oO
    Field _check_mDataDir();

    @InterfaceC0162o00Oo0oO
    Field _check_mDataDirFile();

    @InterfaceC0162o00Oo0oO
    Field _check_mDeviceProtectedDataDirFile();

    @InterfaceC0162o00Oo0oO
    Field _check_mLibDir();

    @InterfaceC0162o00Oo0oO
    Field _check_mPackageName();

    @InterfaceC0162o00Oo0oO
    Field _check_mSecurityViolation();

    @InterfaceC0166o00OoO00
    Method _check_makeApplication(boolean z, Instrumentation instrumentation);

    @InterfaceC0563o0oOO
    void _set_mApplication(Object obj);

    @InterfaceC0563o0oOO
    void _set_mApplicationInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_mCredentialProtectedDataDirFile(Object obj);

    @InterfaceC0563o0oOO
    void _set_mDataDir(Object obj);

    @InterfaceC0563o0oOO
    void _set_mDataDirFile(Object obj);

    @InterfaceC0563o0oOO
    void _set_mDeviceProtectedDataDirFile(Object obj);

    @InterfaceC0563o0oOO
    void _set_mLibDir(Object obj);

    @InterfaceC0563o0oOO
    void _set_mPackageName(Object obj);

    @InterfaceC0563o0oOO
    void _set_mSecurityViolation(Object obj);

    IServiceConnection forgetServiceDispatcher(Context context, ServiceConnection serviceConnection);

    ClassLoader getClassLoader();

    Object getResources();

    IServiceConnection getServiceDispatcher(ServiceConnection serviceConnection, Context context, Handler handler, int i);

    @InterfaceC0163o00Oo0oo
    Application mApplication();

    @InterfaceC0163o00Oo0oo
    ApplicationInfo mApplicationInfo();

    @InterfaceC0163o00Oo0oo
    File mCredentialProtectedDataDirFile();

    @InterfaceC0163o00Oo0oo
    String mDataDir();

    @InterfaceC0163o00Oo0oo
    File mDataDirFile();

    @InterfaceC0163o00Oo0oo
    File mDeviceProtectedDataDirFile();

    @InterfaceC0163o00Oo0oo
    String mLibDir();

    @InterfaceC0163o00Oo0oo
    Boolean mPackageName();

    @InterfaceC0163o00Oo0oo
    Boolean mSecurityViolation();

    Application makeApplication(boolean z, Instrumentation instrumentation);
}


