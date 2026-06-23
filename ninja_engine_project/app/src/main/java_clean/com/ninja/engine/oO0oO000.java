package com.ninja.engine;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.IBinder;
@InterfaceC0158o00Oo0O0("android.content.BroadcastReceiver")
/* loaded from: classes.dex */
public interface oO0oO000 {

    @InterfaceC0158o00Oo0O0("android.content.BroadcastReceiver$PendingResult")
    /* loaded from: classes.dex */
    public interface OooO00o {
        @InterfaceC0159o00Oo0Oo
        BroadcastReceiver.PendingResult _new(int i, String str, Bundle bundle, int i2, boolean z, boolean z2, IBinder iBinder, int i3);

        @InterfaceC0160o00Oo0o
        boolean mAbortBroadcast();

        @InterfaceC0160o00Oo0o
        boolean mFinished();

        @InterfaceC0160o00Oo0o
        boolean mInitialStickyHint();

        @InterfaceC0160o00Oo0o
        boolean mOrderedHint();

        @InterfaceC0160o00Oo0o
        int mResultCode();

        @InterfaceC0160o00Oo0o
        String mResultData();

        @InterfaceC0160o00Oo0o
        Bundle mResultExtras();

        @InterfaceC0160o00Oo0o
        int mSendingUser();

        @InterfaceC0160o00Oo0o
        IBinder mToken();

        @InterfaceC0160o00Oo0o
        int mType();
    }

    @InterfaceC0158o00Oo0O0("android.content.BroadcastReceiver$PendingResult")
    /* loaded from: classes.dex */
    public interface OooO0O0 {
        @InterfaceC0159o00Oo0Oo
        BroadcastReceiver.PendingResult _new(int i, String str, Bundle bundle, int i2, boolean z, boolean z2, IBinder iBinder, int i3, int i4);

        @InterfaceC0160o00Oo0o
        boolean mAbortBroadcast();

        @InterfaceC0160o00Oo0o
        boolean mFinished();

        @InterfaceC0160o00Oo0o
        int mFlags();

        @InterfaceC0160o00Oo0o
        boolean mInitialStickyHint();

        @InterfaceC0160o00Oo0o
        boolean mOrderedHint();

        @InterfaceC0160o00Oo0o
        int mResultCode();

        @InterfaceC0160o00Oo0o
        String mResultData();

        @InterfaceC0160o00Oo0o
        Bundle mResultExtras();

        @InterfaceC0160o00Oo0o
        int mSendingUser();

        @InterfaceC0160o00Oo0o
        IBinder mToken();

        @InterfaceC0160o00Oo0o
        int mType();
    }

    @InterfaceC0153o00Oo
    BroadcastReceiver.PendingResult getPendingResult();

    @InterfaceC0153o00Oo
    void setPendingResult(@InterfaceC0169o00OoOO0("android.content.BroadcastReceiver$PendingResult") Object obj);
}


