package com.ninja.engine;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public abstract class MainActivity {
    public static SharedPreferences OooO00o;

    static {
        System.loadLibrary("native-lib");
    }

    public static native String generateTokenKey();

    public static native String getApplicationInfo(int i);

    public static native String getURL(int i);
}
