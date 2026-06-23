package com.ninja.engine;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.os.StrictMode")
/* renamed from: com.ninja.engine.ooOo0o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1856ooOo0o0o {
    @InterfaceC0163o00Oo0oo
    Integer DETECT_VM_FILE_URI_EXPOSURE();

    @InterfaceC0163o00Oo0oo
    Integer PENALTY_DEATH_ON_FILE_URI_EXPOSURE();

    @InterfaceC0162o00Oo0oO
    Field _check_DETECT_VM_FILE_URI_EXPOSURE();

    @InterfaceC0162o00Oo0oO
    Field _check_PENALTY_DEATH_ON_FILE_URI_EXPOSURE();

    @InterfaceC0166o00OoO00
    Method _check_disableDeathOnFileUriExposure();

    @InterfaceC0162o00Oo0oO
    Field _check_sVmPolicyMask();

    @InterfaceC0563o0oOO
    void _set_DETECT_VM_FILE_URI_EXPOSURE(Object obj);

    @InterfaceC0563o0oOO
    void _set_PENALTY_DEATH_ON_FILE_URI_EXPOSURE(Object obj);

    @InterfaceC0563o0oOO
    void _set_sVmPolicyMask(Object obj);

    Void disableDeathOnFileUriExposure();

    @InterfaceC0163o00Oo0oo
    Integer sVmPolicyMask();
}


