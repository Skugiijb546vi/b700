package com.ninja.engine;

import android.app.NotificationChannel;
import android.app.job.JobWorkItem;
/* loaded from: classes.dex */
public abstract /* synthetic */ class o0OO0OoO {
    public static /* synthetic */ NotificationChannel OooO0O0() {
        return new NotificationChannel("blackbox_daemon_channel", "BlackBox Daemon Service", 2);
    }

    public static /* synthetic */ NotificationChannel OooO0OO(String str) {
        return new NotificationChannel(str, "black-box-app", 4);
    }

    public static /* bridge */ /* synthetic */ JobWorkItem OooO0Oo(Object obj) {
        return (JobWorkItem) obj;
    }

    public static /* synthetic */ void OooOOOo() {
    }
}


