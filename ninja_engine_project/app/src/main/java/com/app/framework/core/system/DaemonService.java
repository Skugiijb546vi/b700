package com.app.framework.core.system;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.app.framework.BlackBoxCore;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.C0930oOO0OOo;
import com.ninja.engine.o0OO0OoO;
/* loaded from: classes.dex */
public class DaemonService extends Service {
    private static final String CHANNEL_DESCRIPTION = "Keeps BlackBox core services running";
    private static final String CHANNEL_ID = "blackbox_daemon_channel";
    private static final String CHANNEL_NAME = "BlackBox Daemon Service";
    private static final int NOTIFY_ID = BlackBoxCore.getHostPkg().hashCode();
    public static final String TAG = "DaemonService";

    /* loaded from: classes.dex */
    public static class DaemonInnerService extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
        }

        @Override // android.app.Service
        public void onDestroy() {
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            try {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(DaemonService.NOTIFY_ID);
                }
                stopSelf();
                return 2;
            } catch (Exception e) {
                e.getMessage();
                stopSelf();
                return 2;
            }
        }
    }

    private Notification createNotification() {
        try {
            C0930oOO0OOo c0930oOO0OOo = new C0930oOO0OOo(this, CHANNEL_ID);
            CharSequence charSequence = "BlackBox Core";
            if ("BlackBox Core".length() > 5120) {
                charSequence = "BlackBox Core".subSequence(0, 5120);
            }
            c0930oOO0OOo.OooO0o0 = charSequence;
            CharSequence charSequence2 = "Core services are running";
            if ("Core services are running".length() > 5120) {
                charSequence2 = "Core services are running".subSequence(0, 5120);
            }
            c0930oOO0OOo.OooO0o = charSequence2;
            Notification notification = c0930oOO0OOo.OooOO0o;
            notification.icon = 17301659;
            c0930oOO0OOo.OooO0oO = -1;
            notification.flags = (notification.flags | 2) & (-17);
            return c0930oOO0OOo.OooO00o();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private void createNotificationChannel() {
        Object systemService;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                o0OO0OoO.OooOOOo();
                NotificationChannel OooO0O0 = o0OO0OoO.OooO0O0();
                OooO0O0.setDescription("Keeps BlackBox core services running");
                OooO0O0.setShowBadge(false);
                OooO0O0.setSound(null, null);
                OooO0O0.enableVibration(false);
                systemService = getSystemService(NotificationManager.class);
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(OooO0O0);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private boolean startForegroundService() {
        try {
            Notification createNotification = createNotification();
            if (createNotification != null) {
                startForeground(NOTIFY_ID, createNotification);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (BuildCompat.isOreo()) {
            createNotificationChannel();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            startService(new Intent(this, DaemonInnerService.class));
            if (BuildCompat.isOreo()) {
                startForegroundService();
                return 1;
            }
            return 1;
        } catch (Exception e) {
            e.getMessage();
            return 1;
        }
    }
}
