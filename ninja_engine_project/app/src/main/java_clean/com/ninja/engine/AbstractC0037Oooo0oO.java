package com.ninja.engine;

import android.graphics.Insets;
import android.net.NetworkInfo;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
/* renamed from: com.ninja.engine.Oooo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0037Oooo0oO {
    public static /* synthetic */ NetworkInfo OooO0oO() {
        return new NetworkInfo(1, 0, "WIFI", "");
    }

    public static /* synthetic */ NetworkInfo OooO0oo(int i, int i2, String str, String str2) {
        return new NetworkInfo(i, i2, str, str2);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds OooOO0(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation OooOO0O(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation OooOO0o(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void OooOOOO() {
    }

    public static /* synthetic */ NetworkInfo OooOoO() {
        return new NetworkInfo(0, 0, "MOBILE", "");
    }
}


