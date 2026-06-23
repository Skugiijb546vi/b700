package com.ninja.engine;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("android.app.servertransaction.LaunchActivityItem")
/* renamed from: com.ninja.engine.ooO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1709ooO0o {
    @InterfaceC0162o00Oo0oO
    Field _check_mCurConfig();

    @InterfaceC0162o00Oo0oO
    Field _check_mInfo();

    @InterfaceC0162o00Oo0oO
    Field _check_mIntent();

    @InterfaceC0162o00Oo0oO
    Field _check_mOverrideConfig();

    @InterfaceC0563o0oOO
    void _set_mCurConfig(Object obj);

    @InterfaceC0563o0oOO
    void _set_mInfo(Object obj);

    @InterfaceC0563o0oOO
    void _set_mIntent(Object obj);

    @InterfaceC0563o0oOO
    void _set_mOverrideConfig(Object obj);

    @InterfaceC0163o00Oo0oo
    Configuration mCurConfig();

    @InterfaceC0163o00Oo0oo
    ActivityInfo mInfo();

    @InterfaceC0163o00Oo0oo
    Intent mIntent();

    @InterfaceC0163o00Oo0oo
    Configuration mOverrideConfig();
}
