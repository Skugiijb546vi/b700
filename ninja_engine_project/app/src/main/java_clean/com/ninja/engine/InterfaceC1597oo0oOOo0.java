package com.ninja.engine;

import android.app.Application;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.app.ActivityThread")
/* renamed from: com.ninja.engine.oo0oOOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1597oo0oOOo0 {
    @InterfaceC0166o00OoO00
    Method _check_currentActivityThread();

    @InterfaceC0166o00OoO00
    Method _check_currentApplication();

    @InterfaceC0166o00OoO00
    Method _check_currentPackageName();

    @InterfaceC0162o00Oo0oO
    Field _check_sPackageManager();

    @InterfaceC0162o00Oo0oO
    Field _check_sPermissionManager();

    @InterfaceC0563o0oOO
    void _set_sPackageManager(Object obj);

    @InterfaceC0563o0oOO
    void _set_sPermissionManager(Object obj);

    Object currentActivityThread();

    Application currentApplication();

    String currentPackageName();

    @InterfaceC0163o00Oo0oo
    IInterface sPackageManager();

    @InterfaceC0163o00Oo0oo
    IInterface sPermissionManager();
}


