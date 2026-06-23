package com.ninja.engine;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.accessibility.AccessibilityNodeInfo;
/* renamed from: com.ninja.engine.OoooO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0041OoooO00 {
    public static PackageInfo OooO00o(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static String OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}


