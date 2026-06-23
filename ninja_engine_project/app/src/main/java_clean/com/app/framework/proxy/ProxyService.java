package com.app.framework.proxy;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.dispatcher.AppServiceDispatcher;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.C0930oOO0OOo;
/* loaded from: classes.dex */
public class ProxyService extends Service {
    public static final String TAG = "StubService";

    /* loaded from: classes.dex */
    public static class P0 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P10 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P11 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P12 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P13 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P14 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P15 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P16 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P17 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P18 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P19 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P20 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P21 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P22 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P23 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P24 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P25 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P26 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P27 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P28 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P29 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P30 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P31 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P32 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P33 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P34 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P35 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P36 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P37 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P38 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P39 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P4 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P40 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P41 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P42 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P43 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P44 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P45 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P46 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P47 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P48 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P49 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P5 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P6 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P7 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P8 extends ProxyService {
    }

    /* loaded from: classes.dex */
    public static class P9 extends ProxyService {
    }

    private void showNotification() {
        Context applicationContext = getApplicationContext();
        C0930oOO0OOo c0930oOO0OOo = new C0930oOO0OOo(applicationContext, getPackageName() + ".base_proxy");
        c0930oOO0OOo.OooO0oO = 2;
        if (BuildCompat.isOreo()) {
            startForeground(BlackBoxCore.getHostPkg().hashCode(), c0930oOO0OOo.OooO00o());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return AppServiceDispatcher.get().onBind(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AppServiceDispatcher.get().onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AppServiceDispatcher.get().onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        AppServiceDispatcher.get().onLowMemory();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        AppServiceDispatcher.get().onStartCommand(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        AppServiceDispatcher.get().onTrimMemory(i);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        AppServiceDispatcher.get().onUnbind(intent);
        return false;
    }
}


