package com.ninja.engine;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.app.Activity")
/* renamed from: com.ninja.engine.ooO0OoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1705ooO0OoOo {
    @InterfaceC0162o00Oo0oO
    Field _check_mActivityInfo();

    @InterfaceC0162o00Oo0oO
    Field _check_mEmbeddedID();

    @InterfaceC0162o00Oo0oO
    Field _check_mFinished();

    @InterfaceC0162o00Oo0oO
    Field _check_mParent();

    @InterfaceC0162o00Oo0oO
    Field _check_mResultCode();

    @InterfaceC0162o00Oo0oO
    Field _check_mResultData();

    @InterfaceC0162o00Oo0oO
    Field _check_mToken();

    @InterfaceC0166o00OoO00
    Method _check_onActivityResult(int i, int i2, Intent intent);

    @InterfaceC0563o0oOO
    void _set_mActivityInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_mEmbeddedID(Object obj);

    @InterfaceC0563o0oOO
    void _set_mFinished(Object obj);

    @InterfaceC0563o0oOO
    void _set_mParent(Object obj);

    @InterfaceC0563o0oOO
    void _set_mResultCode(Object obj);

    @InterfaceC0563o0oOO
    void _set_mResultData(Object obj);

    @InterfaceC0563o0oOO
    void _set_mToken(Object obj);

    @InterfaceC0163o00Oo0oo
    ActivityInfo mActivityInfo();

    @InterfaceC0163o00Oo0oo
    String mEmbeddedID();

    @InterfaceC0163o00Oo0oo
    Boolean mFinished();

    @InterfaceC0163o00Oo0oo
    Activity mParent();

    @InterfaceC0163o00Oo0oo
    Integer mResultCode();

    @InterfaceC0163o00Oo0oo
    Intent mResultData();

    @InterfaceC0163o00Oo0oo
    IBinder mToken();

    Void onActivityResult(int i, int i2, Intent intent);
}


