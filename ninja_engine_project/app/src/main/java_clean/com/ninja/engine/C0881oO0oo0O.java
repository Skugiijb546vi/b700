package com.ninja.engine;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
/* renamed from: com.ninja.engine.oO0oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881oO0oo0O {
    public static final int OooO0o0;
    public final Context OooO00o;
    public final ActivityManager OooO0O0;
    public final C0331o0O0oo OooO0OO;
    public final float OooO0Oo;

    static {
        int i;
        if (Build.VERSION.SDK_INT < 26) {
            i = 4;
        } else {
            i = 1;
        }
        OooO0o0 = i;
    }

    public C0881oO0oo0O(Context context) {
        this.OooO0Oo = OooO0o0;
        this.OooO00o = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.OooO0O0 = activityManager;
        this.OooO0OO = new C0331o0O0oo(21, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.OooO0Oo = 0.0f;
        }
    }
}


