package com.ninja.engine;

import android.os.Build;
/* renamed from: com.ninja.engine.oo000O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1361oo000O {
    public static final boolean OooO00o;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        OooO00o = z;
    }
}


