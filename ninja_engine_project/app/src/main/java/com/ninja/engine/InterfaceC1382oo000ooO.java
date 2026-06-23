package com.ninja.engine;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O(IServiceConnection.Stub.DESCRIPTOR)
/* renamed from: com.ninja.engine.oo000ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1382oo000ooO {
    @InterfaceC0166o00OoO00
    Method _check_connected(ComponentName componentName, IBinder iBinder, boolean z);

    Void connected(ComponentName componentName, IBinder iBinder, boolean z);
}
