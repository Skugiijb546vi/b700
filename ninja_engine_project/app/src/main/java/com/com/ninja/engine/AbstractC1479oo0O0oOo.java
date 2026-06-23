package com.ninja.engine;

import android.os.Build;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oo0O0oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1479oo0O0oOo {
    public static boolean OooO00o;
    public static Method OooO0O0;
    public static final boolean OooO0OO;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        OooO0OO = z;
    }
}
