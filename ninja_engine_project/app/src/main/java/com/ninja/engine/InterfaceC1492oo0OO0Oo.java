package com.ninja.engine;

import android.content.pm.ProviderInfo;
import android.os.IInterface;
import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("android.app.ContentProviderHolder")
/* renamed from: com.ninja.engine.oo0OO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1492oo0OO0Oo {
    @InterfaceC0162o00Oo0oO
    Field _check_info();

    @InterfaceC0162o00Oo0oO
    Field _check_noReleaseNeeded();

    @InterfaceC0162o00Oo0oO
    Field _check_provider();

    @InterfaceC0563o0oOO
    void _set_info(Object obj);

    @InterfaceC0563o0oOO
    void _set_noReleaseNeeded(Object obj);

    @InterfaceC0563o0oOO
    void _set_provider(Object obj);

    @InterfaceC0163o00Oo0oo
    ProviderInfo info();

    @InterfaceC0163o00Oo0oo
    Boolean noReleaseNeeded();

    @InterfaceC0163o00Oo0oo
    IInterface provider();
}
