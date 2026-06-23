package com.app.framework.proxy;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.app.framework.core.system.JarConfig;
import com.ninja.engine.AbstractC1008oOOOOoo0;
/* loaded from: classes.dex */
public class ProxyVpnService extends VpnService {
    private static final String CHANNEL_ID = "BlackBoxVPN";
    private static final int NOTIFICATION_ID = 1001;
    private static final String TAG = "ProxyVpnService";
    private ParcelFileDescriptor mVpnInterface = null;
    private boolean mIsEstablished = false;
    private Thread mNetworkThread = null;

    private Notification createNotification() {
        return (Build.VERSION.SDK_INT >= 26 ? AbstractC1008oOOOOoo0.OooO00o(this) : new Notification.Builder(this)).setContentTitle("BlackBox VPN Active").setContentText("Managing network access for sandboxed apps").setSmallIcon(17301659).setOngoing(true).setPriority(-1).build();
    }

    private void createNotificationChannel() {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel OooO0O0 = AbstractC1008oOOOOoo0.OooO0O0();
            OooO0O0.setDescription("VPN service for BlackBox network access");
            OooO0O0.setShowBadge(false);
            systemService = getSystemService(NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(OooO0O0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reestablishVpn() {
        try {
            stopVpn();
            Thread.sleep(1000L);
            establishVpn();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void startNetworkHandling() {
        Thread thread = this.mNetworkThread;
        if (thread != null && thread.isAlive()) {
            this.mNetworkThread.interrupt();
        }
        Thread thread2 = new Thread(new Runnable() { // from class: com.app.framework.proxy.ProxyVpnService.2
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        ProxyVpnService proxyVpnService = ProxyVpnService.this;
                        if (!proxyVpnService.mIsEstablished || proxyVpnService.mVpnInterface == null || Thread.interrupted()) {
                            return;
                        }
                        Thread.sleep(10000L);
                        ParcelFileDescriptor parcelFileDescriptor = ProxyVpnService.this.mVpnInterface;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.getFd();
                            } catch (Exception unused) {
                                ProxyVpnService.this.reestablishVpn();
                                return;
                            }
                        }
                    } catch (Exception e) {
                        e.getMessage();
                        return;
                    }
                }
            }
        }, "BlackBoxNetworkHandler");
        this.mNetworkThread = thread2;
        thread2.start();
    }

    private void stopVpn() {
        this.mIsEstablished = false;
        Thread thread = this.mNetworkThread;
        if (thread != null) {
            thread.interrupt();
            this.mNetworkThread = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.mVpnInterface;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
                this.mVpnInterface = null;
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void establishVpn() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            this.mIsEstablished = false;
        }
        if (System.currentTimeMillis() - currentTimeMillis > JarConfig.MAX_RETRY_DELAY_MS) {
            return;
        }
        VpnService.Builder builder = new VpnService.Builder(this);
        builder.setSession("BlackBox VPN");
        builder.addAddress("10.0.0.2", 32);
        builder.addRoute("0.0.0.0", 0);
        builder.addDnsServer("8.8.8.8");
        builder.addDnsServer("8.8.4.4");
        builder.addAllowedApplication(getPackageName());
        builder.setSession("BlackBox Internet Access");
        if (System.currentTimeMillis() - currentTimeMillis > JarConfig.MAX_RETRY_DELAY_MS) {
            return;
        }
        ParcelFileDescriptor establish = builder.establish();
        this.mVpnInterface = establish;
        if (establish != null) {
            this.mIsEstablished = true;
            startNetworkHandling();
        }
        if (System.currentTimeMillis() - currentTimeMillis > JarConfig.MAX_RETRY_DELAY_MS) {
            System.currentTimeMillis();
        }
    }

    public ParcelFileDescriptor getVpnInterface() {
        return this.mVpnInterface;
    }

    public boolean isEstablished() {
        return this.mIsEstablished && this.mVpnInterface != null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopVpn();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        super.onRevoke();
        stopVpn();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(1001, createNotification(), 1073741824);
            } else {
                startForeground(NOTIFICATION_ID, createNotification());
            }
            new Thread(new Runnable() { // from class: com.app.framework.proxy.ProxyVpnService.1
                @Override // java.lang.Runnable
                public void run() {
                    ProxyVpnService.this.establishVpn();
                }
            }, "VPNEstablishment").start();
            return 1;
        } catch (Exception e) {
            e.getMessage();
            stopSelf();
            return 2;
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }
}



