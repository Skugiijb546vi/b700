package com.ninja.engine;

import android.os.Build;
import android.util.Log;
import com.app.framework.core.system.user.BUserHandle;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.ninja.engine.oO0OO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771oO0OO0oo {
    public static final boolean OooO0o;
    public static final boolean OooO0o0;
    public static final File OooO0oO;
    public static volatile C0771oO0OO0oo OooO0oo;
    public int OooO0O0;
    public boolean OooO0OO = true;
    public final AtomicBoolean OooO0Oo = new AtomicBoolean(false);
    public final int OooO00o = BUserHandle.AID_CACHE_GID_START;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        OooO0o0 = z;
        if (i >= 28) {
            z2 = true;
        }
        OooO0o = z2;
        OooO0oO = new File("/proc/self/fd");
    }

    public static C0771oO0OO0oo OooO00o() {
        if (OooO0oo == null) {
            synchronized (C0771oO0OO0oo.class) {
                try {
                    if (OooO0oo == null) {
                        OooO0oo = new C0771oO0OO0oo();
                    }
                } finally {
                }
            }
        }
        return OooO0oo;
    }

    public final int OooO0O0() {
        if (Build.VERSION.SDK_INT == 28) {
            for (String str : Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013")) {
                if (Build.MODEL.startsWith(str)) {
                    return 500;
                }
            }
        }
        return this.OooO00o;
    }

    public final boolean OooO0OO(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!OooO0o) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (OooO0o0 && !this.OooO0Oo.get()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (i >= 0 && i2 >= 0) {
            synchronized (this) {
                try {
                    int i3 = this.OooO0O0 + 1;
                    this.OooO0O0 = i3;
                    if (i3 >= 50) {
                        this.OooO0O0 = 0;
                        if (OooO0oO.list().length < OooO0O0()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.OooO0OO = z4;
                        if (!z4) {
                            Log.isLoggable("Downsampler", 5);
                        }
                    }
                    z3 = this.OooO0OO;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                return true;
            }
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
    }
}


