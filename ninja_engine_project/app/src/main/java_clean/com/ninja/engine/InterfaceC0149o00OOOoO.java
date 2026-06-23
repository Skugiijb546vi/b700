package com.ninja.engine;


import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
@InterfaceC0158o00Oo0O0("android.location.ILocationListener")
/* renamed from: com.ninja.engine.o00OOOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0149o00OOOoO {

    @InterfaceC0158o00Oo0O0("android.location.ILocationListener$Stub")
    /* renamed from: com.ninja.engine.o00OOOoO$OooO00o */
    /* loaded from: classes.dex */
    public interface OooO00o {
        @InterfaceC0170o00OoOOO
        IInterface asInterface(IBinder iBinder);
    }

    @InterfaceC0153o00Oo
    void onLocationChanged(Location location);
}


