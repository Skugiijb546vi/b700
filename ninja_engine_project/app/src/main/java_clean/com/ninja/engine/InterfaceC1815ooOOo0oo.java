package com.ninja.engine;

import android.content.pm.ProviderInfo;
import android.os.IInterface;
import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("android.app.IActivityManager$ContentProviderHolder")
/* renamed from: com.ninja.engine.ooOOo0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1815ooOOo0oo {
    @InterfaceC0162o00Oo0oO
    Field _check_info();

    @InterfaceC0162o00Oo0oO
    Field _check_noReleaseNeeded();

    @InterfaceC0162o00Oo0oO
    Field _check_provider();

    @InterfaceC0162o00Oo0oO
    Field _check_waitProcessStart();

    @InterfaceC0563o0oOO
    void _set_info(Object obj);

    @InterfaceC0563o0oOO
    void _set_noReleaseNeeded(Object obj);

    @InterfaceC0563o0oOO
    void _set_provider(Object obj);

    @InterfaceC0563o0oOO
    void _set_waitProcessStart(Object obj);

    @InterfaceC0163o00Oo0oo
    ProviderInfo info();

    @InterfaceC0163o00Oo0oo
    Boolean noReleaseNeeded();

    @InterfaceC0163o00Oo0oo
    IInterface provider();

    @InterfaceC0163o00Oo0oo
    Boolean waitProcessStart();
}


