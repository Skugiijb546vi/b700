package com.ninja.engine;

import android.accounts.Account;
import android.os.Bundle;
import java.lang.reflect.Field;
@InterfaceC0157o00Oo0O("android.content.SyncRequest")
/* renamed from: com.ninja.engine.o00o00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0196o00o00o {
    @InterfaceC0162o00Oo0oO
    Field _check_mAccountToSync();

    @InterfaceC0162o00Oo0oO
    Field _check_mAuthority();

    @InterfaceC0162o00Oo0oO
    Field _check_mExtras();

    @InterfaceC0162o00Oo0oO
    Field _check_mIsPeriodic();

    @InterfaceC0162o00Oo0oO
    Field _check_mSyncFlexTimeSecs();

    @InterfaceC0162o00Oo0oO
    Field _check_mSyncRunTimeSecs();

    @InterfaceC0563o0oOO
    void _set_mAccountToSync(Object obj);

    @InterfaceC0563o0oOO
    void _set_mAuthority(Object obj);

    @InterfaceC0563o0oOO
    void _set_mExtras(Object obj);

    @InterfaceC0563o0oOO
    void _set_mIsPeriodic(Object obj);

    @InterfaceC0563o0oOO
    void _set_mSyncFlexTimeSecs(Object obj);

    @InterfaceC0563o0oOO
    void _set_mSyncRunTimeSecs(Object obj);

    @InterfaceC0163o00Oo0oo
    Account mAccountToSync();

    @InterfaceC0163o00Oo0oo
    String mAuthority();

    @InterfaceC0163o00Oo0oo
    Bundle mExtras();

    @InterfaceC0163o00Oo0oo
    Boolean mIsPeriodic();

    @InterfaceC0163o00Oo0oo
    Long mSyncFlexTimeSecs();

    @InterfaceC0163o00Oo0oo
    Long mSyncRunTimeSecs();
}


