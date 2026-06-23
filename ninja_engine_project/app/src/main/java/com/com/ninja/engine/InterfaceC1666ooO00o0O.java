package com.ninja.engine;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
@InterfaceC0158o00Oo0O0("android.app.ContextImpl")
/* renamed from: com.ninja.engine.ooO00o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1666ooO00o0O {
    @InterfaceC0170o00OoOOO
    Object createAppContext();

    @InterfaceC0153o00Oo
    Object getAttributionSource();

    @InterfaceC0153o00Oo
    PackageManager getPackageManager();

    @InterfaceC0153o00Oo
    Context getReceiverRestrictedContext();

    @InterfaceC0160o00Oo0o
    String mBasePackageName();

    @InterfaceC0160o00Oo0o
    ContentResolver mContentResolver();

    @InterfaceC0160o00Oo0o
    Object mPackageInfo();

    @InterfaceC0160o00Oo0o
    PackageManager mPackageManager();

    @InterfaceC0153o00Oo
    void setOuterContext(Context context);
}
