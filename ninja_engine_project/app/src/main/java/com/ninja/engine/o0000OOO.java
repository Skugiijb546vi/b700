package com.ninja.engine;

import android.accounts.Account;
import android.os.Bundle;
@InterfaceC0158o00Oo0O0("android.content.SyncRequest")
/* loaded from: classes.dex */
public interface o0000OOO {
    @InterfaceC0160o00Oo0o
    Account mAccountToSync();

    @InterfaceC0160o00Oo0o
    String mAuthority();

    @InterfaceC0160o00Oo0o
    Bundle mExtras();

    @InterfaceC0160o00Oo0o
    boolean mIsPeriodic();

    @InterfaceC0160o00Oo0o
    long mSyncFlexTimeSecs();

    @InterfaceC0160o00Oo0o
    long mSyncRunTimeSecs();
}
