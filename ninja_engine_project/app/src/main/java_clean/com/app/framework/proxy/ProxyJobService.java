package com.app.framework.proxy;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.content.res.Configuration;
import com.app.framework.app.dispatcher.AppJobServiceDispatcher;
/* loaded from: classes.dex */
public class ProxyJobService extends JobService {
    public static final String TAG = "StubJobService";

    /* loaded from: classes.dex */
    public static class P0 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P10 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P11 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P12 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P13 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P14 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P15 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P16 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P17 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P18 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P19 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P20 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P21 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P22 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P23 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P24 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P25 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P26 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P27 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P28 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P29 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P30 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P31 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P32 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P33 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P34 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P35 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P36 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P37 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P38 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P39 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P4 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P40 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P41 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P42 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P43 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P44 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P45 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P46 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P47 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P48 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P49 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P5 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P6 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P7 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P8 extends ProxyJobService {
    }

    /* loaded from: classes.dex */
    public static class P9 extends ProxyJobService {
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AppJobServiceDispatcher.get().onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AppJobServiceDispatcher.get().onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        AppJobServiceDispatcher.get().onLowMemory();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        return AppJobServiceDispatcher.get().onStartJob(jobParameters);
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return AppJobServiceDispatcher.get().onStopJob(jobParameters);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        AppJobServiceDispatcher.get().onTrimMemory(i);
    }
}


