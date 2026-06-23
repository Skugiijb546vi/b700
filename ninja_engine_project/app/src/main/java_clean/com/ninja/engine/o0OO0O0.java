package com.ninja.engine;

import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import java.lang.reflect.Field;
import java.util.List;
@InterfaceC0157o00Oo0O("android.app.ActivityThread$AppBindData")
/* loaded from: classes.dex */
public interface o0OO0O0 {
    @InterfaceC0162o00Oo0oO
    Field _check_appInfo();

    @InterfaceC0162o00Oo0oO
    Field _check_info();

    @InterfaceC0162o00Oo0oO
    Field _check_instrumentationName();

    @InterfaceC0162o00Oo0oO
    Field _check_processName();

    @InterfaceC0162o00Oo0oO
    Field _check_providers();

    @InterfaceC0563o0oOO
    void _set_appInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_info(Object obj);

    @InterfaceC0563o0oOO
    void _set_instrumentationName(Object obj);

    @InterfaceC0563o0oOO
    void _set_processName(Object obj);

    @InterfaceC0563o0oOO
    void _set_providers(Object obj);

    @InterfaceC0163o00Oo0oo
    ApplicationInfo appInfo();

    @InterfaceC0163o00Oo0oo
    Object info();

    @InterfaceC0163o00Oo0oo
    ComponentName instrumentationName();

    @InterfaceC0163o00Oo0oo
    String processName();

    @InterfaceC0163o00Oo0oo
    List<ProviderInfo> providers();
}


