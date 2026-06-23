package com.ninja.engine;

import java.lang.reflect.Field;
import java.util.List;
@InterfaceC0157o00Oo0O("com.android.internal.net.VpnConfig")
/* renamed from: com.ninja.engine.ooOoo0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1910ooOoo0oo {
    @InterfaceC0162o00Oo0oO
    Field _check_allowedApplications();

    @InterfaceC0162o00Oo0oO
    Field _check_disallowedApplications();

    @InterfaceC0162o00Oo0oO
    Field _check_user();

    @InterfaceC0563o0oOO
    void _set_allowedApplications(Object obj);

    @InterfaceC0563o0oOO
    void _set_disallowedApplications(Object obj);

    @InterfaceC0563o0oOO
    void _set_user(Object obj);

    @InterfaceC0163o00Oo0oo
    List<String> allowedApplications();

    @InterfaceC0163o00Oo0oo
    List<String> disallowedApplications();

    @InterfaceC0163o00Oo0oo
    String user();
}
