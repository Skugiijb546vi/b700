package com.ninja.engine;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.app.ContextImpl")
/* renamed from: com.ninja.engine.ooO0O0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1680ooO0O0O {
    @InterfaceC0166o00OoO00
    Method _check_getAttributionSource();

    @InterfaceC0166o00OoO00
    Method _check_getPackageManager();

    @InterfaceC0166o00OoO00
    Method _check_getReceiverRestrictedContext();

    @InterfaceC0162o00Oo0oO
    Field _check_mBasePackageName();

    @InterfaceC0162o00Oo0oO
    Field _check_mContentResolver();

    @InterfaceC0162o00Oo0oO
    Field _check_mPackageInfo();

    @InterfaceC0162o00Oo0oO
    Field _check_mPackageManager();

    @InterfaceC0166o00OoO00
    Method _check_setOuterContext(Context context);

    @InterfaceC0563o0oOO
    void _set_mBasePackageName(Object obj);

    @InterfaceC0563o0oOO
    void _set_mContentResolver(Object obj);

    @InterfaceC0563o0oOO
    void _set_mPackageInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_mPackageManager(Object obj);

    Object getAttributionSource();

    PackageManager getPackageManager();

    Context getReceiverRestrictedContext();

    @InterfaceC0163o00Oo0oo
    String mBasePackageName();

    @InterfaceC0163o00Oo0oo
    ContentResolver mContentResolver();

    @InterfaceC0163o00Oo0oo
    Object mPackageInfo();

    @InterfaceC0163o00Oo0oo
    PackageManager mPackageManager();

    Void setOuterContext(Context context);
}


