package com.ninja.engine;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
@InterfaceC0158o00Oo0O0("android.app.Activity")
/* renamed from: com.ninja.engine.oo0oo00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1614oo0oo00o {
    @InterfaceC0160o00Oo0o
    ActivityInfo mActivityInfo();

    @InterfaceC0160o00Oo0o
    String mEmbeddedID();

    @InterfaceC0160o00Oo0o
    boolean mFinished();

    @InterfaceC0160o00Oo0o
    Activity mParent();

    @InterfaceC0160o00Oo0o
    int mResultCode();

    @InterfaceC0160o00Oo0o
    Intent mResultData();

    @InterfaceC0160o00Oo0o
    IBinder mToken();

    @InterfaceC0153o00Oo
    void onActivityResult(int i, int i2, Intent intent);
}


