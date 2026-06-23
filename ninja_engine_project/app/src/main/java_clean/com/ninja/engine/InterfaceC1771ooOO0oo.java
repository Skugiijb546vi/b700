package com.ninja.engine;

import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.UserManager;
import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("android.content.pm.LauncherApps")
/* renamed from: com.ninja.engine.ooOO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1771ooOO0oo {
    @InterfaceC0162o00Oo0oO
    Field _check_mPm();

    @InterfaceC0162o00Oo0oO
    Field _check_mService();

    @InterfaceC0162o00Oo0oO
    Field _check_mUserManager();

    @InterfaceC0563o0oOO
    void _set_mPm(Object obj);

    @InterfaceC0563o0oOO
    void _set_mService(Object obj);

    @InterfaceC0563o0oOO
    void _set_mUserManager(Object obj);

    @InterfaceC0163o00Oo0oo
    PackageManager mPm();

    @InterfaceC0163o00Oo0oo
    IInterface mService();

    @InterfaceC0163o00Oo0oo
    UserManager mUserManager();
}


