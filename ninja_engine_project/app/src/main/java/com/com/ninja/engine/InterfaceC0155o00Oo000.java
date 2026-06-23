package com.ninja.engine;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.app.ActivityThread$ActivityClientRecord")
/* renamed from: com.ninja.engine.o00Oo000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0155o00Oo000 {
    @InterfaceC0162o00Oo0oO
    Field _check_activity();

    @InterfaceC0162o00Oo0oO
    Field _check_activityInfo();

    @InterfaceC0162o00Oo0oO
    Field _check_intent();

    @InterfaceC0162o00Oo0oO
    Field _check_isTopResumedActivity();

    @InterfaceC0162o00Oo0oO
    Field _check_mPreserveWindow();

    @InterfaceC0162o00Oo0oO
    Field _check_packageInfo();

    @InterfaceC0166o00OoO00
    Method _check_toString();

    @InterfaceC0162o00Oo0oO
    Field _check_token();

    @InterfaceC0162o00Oo0oO
    Field _check_window();

    @InterfaceC0563o0oOO
    void _set_activity(Object obj);

    @InterfaceC0563o0oOO
    void _set_activityInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_intent(Object obj);

    @InterfaceC0563o0oOO
    void _set_isTopResumedActivity(Object obj);

    @InterfaceC0563o0oOO
    void _set_mPreserveWindow(Object obj);

    @InterfaceC0563o0oOO
    void _set_packageInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_token(Object obj);

    @InterfaceC0563o0oOO
    void _set_window(Object obj);

    @InterfaceC0163o00Oo0oo
    Activity activity();

    @InterfaceC0163o00Oo0oo
    ActivityInfo activityInfo();

    @InterfaceC0163o00Oo0oo
    Intent intent();

    @InterfaceC0163o00Oo0oo
    Boolean isTopResumedActivity();

    @InterfaceC0163o00Oo0oo
    Boolean mPreserveWindow();

    @InterfaceC0163o00Oo0oo
    Object packageInfo();

    String toString();

    @InterfaceC0163o00Oo0oo
    IBinder token();

    @InterfaceC0163o00Oo0oo
    Window window();
}
