package com.ninja.engine;

import android.content.ComponentName;
import android.content.IntentFilter;
import java.lang.reflect.Field;
import java.util.List;
@InterfaceC0157o00Oo0O("android.content.pm.PackageParser$Component")
/* renamed from: com.ninja.engine.oooOOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2015oooOOooo {
    @InterfaceC0162o00Oo0oO
    Field _check_className();

    @InterfaceC0162o00Oo0oO
    Field _check_componentName();

    @InterfaceC0162o00Oo0oO
    Field _check_intents();

    @InterfaceC0563o0oOO
    void _set_className(Object obj);

    @InterfaceC0563o0oOO
    void _set_componentName(Object obj);

    @InterfaceC0563o0oOO
    void _set_intents(Object obj);

    @InterfaceC0163o00Oo0oo
    String className();

    @InterfaceC0163o00Oo0oo
    ComponentName componentName();

    @InterfaceC0163o00Oo0oo
    List<IntentFilter> intents();
}
