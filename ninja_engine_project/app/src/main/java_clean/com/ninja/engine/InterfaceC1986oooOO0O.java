package com.ninja.engine;

import android.os.IBinder;
import java.lang.reflect.Field;
import java.util.List;
@InterfaceC0157o00Oo0O("android.app.servertransaction.ClientTransaction")
/* renamed from: com.ninja.engine.oooOO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1986oooOO0O {
    @InterfaceC0162o00Oo0oO
    Field _check_mActivityCallbacks();

    @InterfaceC0162o00Oo0oO
    Field _check_mActivityToken();

    @InterfaceC0162o00Oo0oO
    Field _check_mLifecycleStateRequest();

    @InterfaceC0563o0oOO
    void _set_mActivityCallbacks(Object obj);

    @InterfaceC0563o0oOO
    void _set_mActivityToken(Object obj);

    @InterfaceC0563o0oOO
    void _set_mLifecycleStateRequest(Object obj);

    @InterfaceC0163o00Oo0oo
    List<Object> mActivityCallbacks();

    @InterfaceC0163o00Oo0oo
    IBinder mActivityToken();

    @InterfaceC0163o00Oo0oo
    Object mLifecycleStateRequest();
}


