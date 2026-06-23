package com.ninja.engine;

import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
/* renamed from: com.ninja.engine.o00O0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0139o00O0oo {
    public static String OooO00o(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager OooO0O0(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static Insets OooO0OO(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void OooO0Oo(Resources.Theme theme) {
        theme.rebase();
    }

    public static void OooO0o(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void OooO0o0(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }
}
