package com.ninja.engine;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IInterface;
import java.util.HashMap;
@InterfaceC0158o00Oo0O0("android.location.LocationManager")
/* renamed from: com.ninja.engine.oO00o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0727oO00o0O {

    @InterfaceC0158o00Oo0O0("android.location.LocationManager$GnssStatusListenerTransport")
    /* renamed from: com.ninja.engine.oO00o0O$OooO00o */
    /* loaded from: classes.dex */
    public interface OooO00o {
        @InterfaceC0160o00Oo0o
        Object mGpsListener();

        @InterfaceC0160o00Oo0o
        Object mGpsNmeaListener();

        @InterfaceC0153o00Oo
        void onFirstFix(int i);

        @InterfaceC0153o00Oo
        void onGnssStarted();

        @InterfaceC0153o00Oo
        void onNmeaReceived(long j, String str);

        @InterfaceC0160o00Oo0o
        Object this$0();
    }

    @InterfaceC0158o00Oo0O0("android.location.LocationManager$GnssStatusListenerTransport")
    /* renamed from: com.ninja.engine.oO00o0O$OooO0O0 */
    /* loaded from: classes.dex */
    public interface OooO0O0 {
    }

    @InterfaceC0158o00Oo0O0("android.location.LocationManager$GpsStatusListenerTransport")
    /* renamed from: com.ninja.engine.oO00o0O$OooO0OO */
    /* loaded from: classes.dex */
    public interface OooO0OO {
        @InterfaceC0160o00Oo0o
        Object mListener();

        @InterfaceC0160o00Oo0o
        Object mNmeaListener();

        @InterfaceC0153o00Oo
        void onFirstFix(int i);

        @InterfaceC0153o00Oo
        void onGpsStarted();

        @InterfaceC0153o00Oo
        void onNmeaReceived(long j, String str);

        @InterfaceC0160o00Oo0o
        Object this$0();
    }

    @InterfaceC0158o00Oo0O0("android.location.LocationManager$GpsStatusListenerTransport")
    /* renamed from: com.ninja.engine.oO00o0O$OooO0Oo  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC0728OooO0Oo {
    }

    @InterfaceC0158o00Oo0O0("android.location.LocationManager$GnssStatusListenerTransport")
    /* renamed from: com.ninja.engine.oO00o0O$OooO0o */
    /* loaded from: classes.dex */
    public interface OooO0o {
        @InterfaceC0153o00Oo
        void onSvStatusChanged(int i, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, int i2, int i3, int i4, long[] jArr);
    }

    @InterfaceC0158o00Oo0O0("android.location.LocationManager$GpsStatusListenerTransport")
    /* renamed from: com.ninja.engine.oO00o0O$OooO0o0  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC0729OooO0o0 {
    }

    @InterfaceC0158o00Oo0O0("android.location.LocationManager$GnssStatusListenerTransport")
    /* renamed from: com.ninja.engine.oO00o0O$OooO0oO  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC0730OooO0oO {
        @InterfaceC0160o00Oo0o
        LocationListener mListener();

        @InterfaceC0153o00Oo
        void onLocationChanged(Location location);

        @InterfaceC0153o00Oo
        void onProviderDisabled(String str);

        @InterfaceC0153o00Oo
        void onProviderEnabled(String str);

        @InterfaceC0153o00Oo
        void onStatusChanged(String str, int i, Bundle bundle);

        @InterfaceC0160o00Oo0o
        Object this$0();
    }

    @InterfaceC0160o00Oo0o
    HashMap mGnssNmeaListeners();

    @InterfaceC0160o00Oo0o
    HashMap mGnssStatusListeners();

    @InterfaceC0160o00Oo0o
    HashMap mGpsNmeaListeners();

    @InterfaceC0160o00Oo0o
    HashMap mGpsStatusListeners();

    @InterfaceC0160o00Oo0o
    HashMap mListeners();

    @InterfaceC0160o00Oo0o
    HashMap mNmeaListeners();

    @InterfaceC0160o00Oo0o
    IInterface mService();
}


