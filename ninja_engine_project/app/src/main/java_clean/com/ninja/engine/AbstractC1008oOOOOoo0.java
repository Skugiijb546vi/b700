package com.ninja.engine;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
/* renamed from: com.ninja.engine.oOOOOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1008oOOOOoo0 {
    public static /* synthetic */ Notification.Builder OooO00o(Context context) {
        return new Notification.Builder(context, "BlackBoxVPN");
    }

    public static /* synthetic */ NotificationChannel OooO0O0() {
        return new NotificationChannel("BlackBoxVPN", "BlackBox VPN Service", 2);
    }

    public static /* synthetic */ NotificationChannel OooO0o0() {
        return new NotificationChannel("blackbox_main", "BlackBox Core", 4);
    }

    public static /* synthetic */ NotificationChannel OooO0oO() {
        return new NotificationChannel("blackbox_background", "BlackBox Background", 2);
    }
}


