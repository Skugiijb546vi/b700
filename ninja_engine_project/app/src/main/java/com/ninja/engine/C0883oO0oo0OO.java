package com.ninja.engine;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* renamed from: com.ninja.engine.oO0oo0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883oO0oo0OO {
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;

    public C0883oO0oo0OO(C0881oO0oo0O c0881oO0oo0O) {
        int i;
        float f;
        Context context = c0881oO0oo0O.OooO00o;
        ActivityManager activityManager = c0881oO0oo0O.OooO0O0;
        if (activityManager.isLowRamDevice()) {
            i = 2097152;
        } else {
            i = 4194304;
        }
        this.OooO0OO = i;
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (isLowRamDevice) {
            f = 0.33f;
        } else {
            f = 0.4f;
        }
        int round = Math.round(memoryClass * f);
        DisplayMetrics displayMetrics = (DisplayMetrics) c0881oO0oo0O.OooO0OO.OooO0O0;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f3 = c0881oO0oo0O.OooO0Oo;
        int round2 = Math.round(f2 * f3);
        int round3 = Math.round(f2 * 2.0f);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.OooO0O0 = round3;
            this.OooO00o = round2;
        } else {
            float f4 = i2 / (f3 + 2.0f);
            this.OooO0O0 = Math.round(2.0f * f4);
            this.OooO00o = Math.round(f4 * f3);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.OooO0O0);
            Formatter.formatFileSize(context, this.OooO00o);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, round);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
