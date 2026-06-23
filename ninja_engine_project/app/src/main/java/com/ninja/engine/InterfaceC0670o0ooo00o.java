package com.ninja.engine;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("android.app.ActivityThread$CreateServiceData")
/* renamed from: com.ninja.engine.o0ooo00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0670o0ooo00o {
    @InterfaceC0162o00Oo0oO
    Field _check_compatInfo();

    @InterfaceC0162o00Oo0oO
    Field _check_info();

    @InterfaceC0162o00Oo0oO
    Field _check_intent();

    @InterfaceC0162o00Oo0oO
    Field _check_token();

    @InterfaceC0563o0oOO
    void _set_compatInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_info(Object obj);

    @InterfaceC0563o0oOO
    void _set_intent(Object obj);

    @InterfaceC0563o0oOO
    void _set_token(Object obj);

    @InterfaceC0163o00Oo0oo
    Object compatInfo();

    @InterfaceC0163o00Oo0oo
    ServiceInfo info();

    @InterfaceC0163o00Oo0oo
    Intent intent();

    @InterfaceC0163o00Oo0oo
    IBinder token();
}
