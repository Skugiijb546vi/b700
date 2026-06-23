package com.app.framework.core.system.permission;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import com.app.framework.BlackBoxCore;
import com.app.framework.utils.ShellUtils;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1008oOOOOoo0;
import com.ninja.engine.o0OO0OoO;
/* loaded from: classes.dex */
public class XiaomiPermissionManager {
    private static final String POST_NOTIFICATIONS = "android.permission.POST_NOTIFICATIONS";
    private static final String TAG = "XiaomiPermissionManager";
    private static final String XIAOMI_AUTOSTART_PERMISSION = "miui.permission.USE_INTERNAL_GENERAL_API";
    private static final String XIAOMI_AUTOSTART_SETTINGS = "miui.intent.action.OP_AUTO_START";
    private static final String XIAOMI_BACKGROUND_RUNNING = "miui.permission.RUN_IN_BACKGROUND";
    private static final String XIAOMI_BATTERY_OPTIMIZATION = "miui.permission.OPTIMIZE_POWER";
    private static final String XIAOMI_BATTERY_SETTINGS = "miui.intent.action.POWER_HIDE_MODE_APP_LIST";
    private static final String XIAOMI_NOTIFICATION_PERMISSION = "miui.permission.POST_NOTIFICATIONS";
    private static final String XIAOMI_NOTIFICATION_SETTINGS = "miui.intent.action.NOTIFICATION_SETTINGS";
    private static final XiaomiPermissionManager sInstance = new XiaomiPermissionManager();

    private XiaomiPermissionManager() {
    }

    private void createNotificationChannels() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) BlackBoxCore.getContext().getSystemService("notification")) != null) {
            try {
                o0OO0OoO.OooOOOo();
                NotificationChannel OooO0o0 = AbstractC1008oOOOOoo0.OooO0o0();
                OooO0o0.setDescription("Core BlackBox functionality notifications");
                OooO0o0.enableLights(true);
                OooO0o0.enableVibration(true);
                OooO0o0.setShowBadge(true);
                notificationManager.createNotificationChannel(OooO0o0);
                o0OO0OoO.OooOOOo();
                NotificationChannel OooO0oO = AbstractC1008oOOOOoo0.OooO0oO();
                OooO0oO.setDescription("Background service notifications");
                OooO0oO.enableLights(false);
                OooO0oO.enableVibration(false);
                OooO0oO.setShowBadge(false);
                notificationManager.createNotificationChannel(OooO0oO);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private void disableBatteryOptimization() {
        boolean isIgnoringBatteryOptimizations;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        Context context = BlackBoxCore.getContext();
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager == null) {
                return;
            }
            String packageName = context.getPackageName();
            isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
            if (!isIgnoringBatteryOptimizations) {
                try {
                    PowerManager.class.getMethod("setIgnoreBatteryOptimizations", String.class, Boolean.TYPE).invoke(powerManager, packageName, Boolean.TRUE);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static XiaomiPermissionManager get() {
        return sInstance;
    }

    private void grantPermissionThroughReflection(String str) {
        try {
            Context context = BlackBoxCore.getContext();
            PackageManager.class.getMethod("grantRuntimePermission", String.class, String.class, Integer.TYPE).invoke(context.getPackageManager(), context.getPackageName(), str, Integer.valueOf(Process.myUserHandle().hashCode()));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public boolean areAllPermissionsGranted() {
        return isNotificationPermissionGranted() && isXiaomiBackgroundPermissionGranted();
    }

    public String getPermissionStatusSummary() {
        StringBuilder sb = new StringBuilder("Permission Status Summary:\n");
        if (Build.VERSION.SDK_INT >= 33) {
            sb.append("â€¢ POST_NOTIFICATIONS: ");
            sb.append(isNotificationPermissionGranted() ? "GRANTED" : "DENIED");
            sb.append(ShellUtils.COMMAND_LINE_END);
        } else {
            sb.append("â€¢ POST_NOTIFICATIONS: NOT_REQUIRED (Android < 12)\n");
        }
        if (isXiaomiDevice()) {
            sb.append("â€¢ Xiaomi Autostart: ");
            sb.append(isXiaomiBackgroundPermissionGranted() ? "GRANTED" : "DENIED");
            sb.append("\nâ€¢ Xiaomi Battery Optimization: ");
            sb.append(isXiaomiBackgroundPermissionGranted() ? "DISABLED" : "ENABLED");
            sb.append("\nâ€¢ Xiaomi Background Running: ");
            sb.append(isXiaomiBackgroundPermissionGranted() ? "ALLOWED" : "RESTRICTED");
            sb.append(ShellUtils.COMMAND_LINE_END);
        } else {
            sb.append("â€¢ Xiaomi Permissions: NOT_APPLICABLE\n");
        }
        return sb.toString();
    }

    public void grantAllRequiredPermissions() {
        grantNotificationPermission();
        grantXiaomiBackgroundPermissions();
        createNotificationChannels();
    }

    public void grantNotificationPermission() {
        if (Build.VERSION.SDK_INT >= 33 && !isNotificationPermissionGranted()) {
            try {
                grantPermissionThroughReflection(POST_NOTIFICATIONS);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void grantXiaomiBackgroundPermissions() {
        if (isXiaomiDevice() && !isXiaomiBackgroundPermissionGranted()) {
            try {
                grantPermissionThroughReflection(XIAOMI_AUTOSTART_PERMISSION);
                grantPermissionThroughReflection(XIAOMI_BATTERY_OPTIMIZATION);
                grantPermissionThroughReflection(XIAOMI_BACKGROUND_RUNNING);
                grantPermissionThroughReflection(XIAOMI_NOTIFICATION_PERMISSION);
                disableBatteryOptimization();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public boolean isNotificationPermissionGranted() {
        return Build.VERSION.SDK_INT < 33 || AbstractC0809oO0OooOO.OooOOo0(BlackBoxCore.getContext(), POST_NOTIFICATIONS) == 0;
    }

    public boolean isXiaomiBackgroundPermissionGranted() {
        if (isXiaomiDevice()) {
            Context context = BlackBoxCore.getContext();
            try {
                if (AbstractC0809oO0OooOO.OooOOo0(context, XIAOMI_AUTOSTART_PERMISSION) == 0 && AbstractC0809oO0OooOO.OooOOo0(context, XIAOMI_BATTERY_OPTIMIZATION) == 0 && AbstractC0809oO0OooOO.OooOOo0(context, XIAOMI_BACKGROUND_RUNNING) == 0) {
                    return AbstractC0809oO0OooOO.OooOOo0(context, XIAOMI_NOTIFICATION_PERMISSION) == 0;
                }
                return false;
            } catch (Exception e) {
                e.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean isXiaomiDevice() {
        return BuildCompat.isMIUI() || Build.MANUFACTURER.toLowerCase().contains("xiaomi") || Build.BRAND.toLowerCase().contains("xiaomi") || Build.DISPLAY.toLowerCase().contains("hyperos");
    }

    public void openNotificationSettings() {
        Context context = BlackBoxCore.getContext();
        try {
            Intent intent = new Intent();
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            } else {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void openXiaomiPermissionSettings() {
        if (isXiaomiDevice()) {
            Context context = BlackBoxCore.getContext();
            try {
                Intent intent = new Intent(XIAOMI_AUTOSTART_SETTINGS);
                intent.setFlags(268435456);
                context.startActivity(intent);
            } catch (Exception e) {
                e.getMessage();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                    intent2.setFlags(268435456);
                    context.startActivity(intent2);
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }
    }
}


