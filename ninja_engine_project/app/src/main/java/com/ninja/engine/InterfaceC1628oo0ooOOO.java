package com.ninja.engine;

import android.os.IBinder;
import android.os.PersistableBundle;
import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("android.app.job.JobParameters")
/* renamed from: com.ninja.engine.oo0ooOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1628oo0ooOOO {
    @InterfaceC0162o00Oo0oO
    Field _check_callback();

    @InterfaceC0162o00Oo0oO
    Field _check_extras();

    @InterfaceC0162o00Oo0oO
    Field _check_jobId();

    @InterfaceC0563o0oOO
    void _set_callback(Object obj);

    @InterfaceC0563o0oOO
    void _set_extras(Object obj);

    @InterfaceC0563o0oOO
    void _set_jobId(Object obj);

    @InterfaceC0163o00Oo0oo
    IBinder callback();

    @InterfaceC0163o00Oo0oo
    PersistableBundle extras();

    @InterfaceC0163o00Oo0oo
    Integer jobId();
}
