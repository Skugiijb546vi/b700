package com.ninja.engine;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
/* loaded from: classes.dex */
public abstract /* synthetic */ class Oooo0 {
    public static /* bridge */ /* synthetic */ NotificationChannel OooO0O0(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel OooO0OO(String str) {
        return new NotificationChannel(str, "blackbox_core", 4);
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup OooO0Oo(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* bridge */ /* synthetic */ Path OooO0oo(File file) {
        return file.toPath();
    }

    public static /* bridge */ /* synthetic */ void OooOO0(NotificationChannel notificationChannel) {
        notificationChannel.enableLights(true);
    }

    public static /* bridge */ /* synthetic */ void OooOO0o(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static /* bridge */ /* synthetic */ void OooOOOO(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static /* bridge */ /* synthetic */ void OooOOOo(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static /* bridge */ /* synthetic */ void OooOOo(ApplicationInfo applicationInfo, String[] strArr) {
        applicationInfo.splitNames = strArr;
    }

    public static /* bridge */ /* synthetic */ boolean OooOo(Process process) {
        return process.isAlive();
    }

    public static /* bridge */ /* synthetic */ byte[] OooOoO0(Path path) {
        return Files.readAllBytes(path);
    }

    public static /* bridge */ /* synthetic */ void OooOoOO(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(-65536);
    }

    public static /* bridge */ /* synthetic */ void OooOoo(NotificationChannel notificationChannel) {
        notificationChannel.setShowBadge(true);
    }

    public static /* bridge */ /* synthetic */ void OooOooO(NotificationChannel notificationChannel) {
        notificationChannel.setLockscreenVisibility(1);
    }
}


