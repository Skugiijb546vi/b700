package com.ninja.engine;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.app.Instrumentation")
/* renamed from: com.ninja.engine.oOOO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0979oOOO0Oo {
    @InterfaceC0166o00OoO00
    Method _check_execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, InterfaceC1614oo0oo00o interfaceC1614oo0oo00o, Intent intent, int i, Bundle bundle);

    Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, InterfaceC1614oo0oo00o interfaceC1614oo0oo00o, Intent intent, int i, Bundle bundle);
}


