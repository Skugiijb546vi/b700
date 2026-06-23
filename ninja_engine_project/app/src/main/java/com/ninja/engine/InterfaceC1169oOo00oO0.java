package com.ninja.engine;

import java.lang.reflect.Field;
import java.util.List;
@InterfaceC0157o00Oo0O("java.lang.ThreadGroup")
/* renamed from: com.ninja.engine.oOo00oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1169oOo00oO0 {
    @InterfaceC0162o00Oo0oO
    Field _check_groups();

    @InterfaceC0162o00Oo0oO
    Field _check_parent();

    @InterfaceC0563o0oOO
    void _set_groups(Object obj);

    @InterfaceC0563o0oOO
    void _set_parent(Object obj);

    @InterfaceC0163o00Oo0oo
    List<ThreadGroup> groups();

    @InterfaceC0163o00Oo0oo
    ThreadGroup parent();
}
