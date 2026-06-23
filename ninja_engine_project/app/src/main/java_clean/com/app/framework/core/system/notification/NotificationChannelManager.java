package com.app.framework.core.system.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import com.app.framework.BlackBoxCore;
import com.ninja.engine.o0OO0OoO;
/* loaded from: classes.dex */
public class NotificationChannelManager {
    public static NotificationChannel APP_CHANNEL;
    private static final NotificationChannelManager sManager = new NotificationChannelManager();

    public NotificationChannelManager() {
        if (Build.VERSION.SDK_INT >= 26) {
            registerAppChannel();
        }
    }

    public static NotificationChannelManager get() {
        return sManager;
    }

    private void registerAppChannel() {
        NotificationChannel OooO0OO = o0OO0OoO.OooO0OO(BlackBoxCore.getContext().getPackageName());
        APP_CHANNEL = OooO0OO;
        OooO0OO.enableLights(true);
        APP_CHANNEL.setLightColor(-65536);
        APP_CHANNEL.setShowBadge(true);
        APP_CHANNEL.setLockscreenVisibility(1);
        ((NotificationManager) BlackBoxCore.getContext().getSystemService("notification")).createNotificationChannel(APP_CHANNEL);
    }
}


