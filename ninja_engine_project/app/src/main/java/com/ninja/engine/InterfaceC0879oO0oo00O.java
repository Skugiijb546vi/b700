package com.ninja.engine;

import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("java.lang.ThreadGroup")
/* renamed from: com.ninja.engine.oO0oo00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0879oO0oo00O {
    @InterfaceC0162o00Oo0oO
    Field _check_groups();

    @InterfaceC0162o00Oo0oO
    Field _check_ngroups();

    @InterfaceC0162o00Oo0oO
    Field _check_parent();

    @InterfaceC0563o0oOO
    void _set_groups(Object obj);

    @InterfaceC0563o0oOO
    void _set_ngroups(Object obj);

    @InterfaceC0563o0oOO
    void _set_parent(Object obj);

    @InterfaceC0163o00Oo0oo
    ThreadGroup[] groups();

    @InterfaceC0163o00Oo0oo
    Integer ngroups();

    @InterfaceC0163o00Oo0oo
    ThreadGroup parent();
}
