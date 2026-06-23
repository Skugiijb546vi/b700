package com.ninja.engine;

import android.content.Intent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.app.job.JobWorkItem")
/* renamed from: com.ninja.engine.ooO00oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1671ooO00oo {
    @InterfaceC0166o00OoO00
    Method _check_getIntent();

    @InterfaceC0162o00Oo0oO
    Field _check_mDeliveryCount();

    @InterfaceC0162o00Oo0oO
    Field _check_mGrants();

    @InterfaceC0162o00Oo0oO
    Field _check_mWorkId();

    @InterfaceC0563o0oOO
    void _set_mDeliveryCount(Object obj);

    @InterfaceC0563o0oOO
    void _set_mGrants(Object obj);

    @InterfaceC0563o0oOO
    void _set_mWorkId(Object obj);

    Intent getIntent();

    @InterfaceC0163o00Oo0oo
    Integer mDeliveryCount();

    @InterfaceC0163o00Oo0oo
    Object mGrants();

    @InterfaceC0163o00Oo0oo
    Integer mWorkId();
}
