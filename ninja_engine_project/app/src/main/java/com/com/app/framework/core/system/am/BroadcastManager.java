package com.app.framework.core.system.am;

import android.content.BroadcastReceiver;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.pm.BPackage;
import com.app.framework.core.system.pm.BPackageManagerService;
import com.app.framework.core.system.pm.BPackageSettings;
import com.app.framework.core.system.pm.PackageMonitor;
import com.app.framework.entity.am.PendingResultData;
import com.app.framework.proxy.ProxyBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class BroadcastManager implements PackageMonitor {
    public static final int MSG_TIME_OUT = 1;
    public static final String TAG = "BroadcastManager";
    public static final int TIMEOUT = 9000;
    private static BroadcastManager sBroadcastManager;
    private final BActivityManagerService mAms;
    private final BPackageManagerService mPms;
    private final Map<String, List<BroadcastReceiver>> mReceivers = new HashMap();
    private final Map<String, PendingResultData> mReceiversData = new HashMap();
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.app.framework.core.system.am.BroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    PendingResultData pendingResultData = (PendingResultData) message.obj;
                    pendingResultData.build().finish();
                    pendingResultData.toString();
                } catch (Throwable unused) {
                }
            }
        }
    };

    public BroadcastManager(BActivityManagerService bActivityManagerService, BPackageManagerService bPackageManagerService) {
        this.mAms = bActivityManagerService;
        this.mPms = bPackageManagerService;
    }

    private void addReceiver(String str, BroadcastReceiver broadcastReceiver) {
        List<BroadcastReceiver> list = this.mReceivers.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.mReceivers.put(str, list);
        }
        list.add(broadcastReceiver);
    }

    private void registerPackage(BPackage bPackage) {
        synchronized (this.mReceivers) {
            try {
                String str = bPackage.packageName;
                bPackage.receivers.size();
                Iterator<BPackage.Activity> it = bPackage.receivers.iterator();
                while (it.hasNext()) {
                    for (BPackage.ActivityIntentInfo activityIntentInfo : it.next().intents) {
                        ProxyBroadcastReceiver proxyBroadcastReceiver = new ProxyBroadcastReceiver();
                        if (Build.VERSION.SDK_INT >= 26) {
                            BlackBoxCore.getContext().registerReceiver(proxyBroadcastReceiver, activityIntentInfo.intentFilter, 2);
                        } else {
                            BlackBoxCore.getContext().registerReceiver(proxyBroadcastReceiver, activityIntentInfo.intentFilter);
                        }
                        addReceiver(bPackage.packageName, proxyBroadcastReceiver);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static BroadcastManager startSystem(BActivityManagerService bActivityManagerService, BPackageManagerService bPackageManagerService) {
        if (sBroadcastManager == null) {
            synchronized (BroadcastManager.class) {
                try {
                    if (sBroadcastManager == null) {
                        sBroadcastManager = new BroadcastManager(bActivityManagerService, bPackageManagerService);
                    }
                } finally {
                }
            }
        }
        return sBroadcastManager;
    }

    public void finishBroadcast(PendingResultData pendingResultData) {
        synchronized (this.mReceiversData) {
            this.mHandler.removeMessages(1, this.mReceiversData.get(pendingResultData.mBToken));
        }
    }

    @Override // com.app.framework.core.system.pm.PackageMonitor
    public void onPackageInstalled(String str, int i) {
        synchronized (this.mReceivers) {
            try {
                this.mReceivers.remove(str);
                BPackageSettings bPackageSetting = this.mPms.getBPackageSetting(str);
                if (bPackageSetting != null) {
                    registerPackage(bPackageSetting.pkg);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.app.framework.core.system.pm.PackageMonitor
    public void onPackageUninstalled(String str, boolean z, int i) {
        if (z) {
            synchronized (this.mReceivers) {
                List<BroadcastReceiver> list = this.mReceivers.get(str);
                if (list != null) {
                    list.size();
                    for (BroadcastReceiver broadcastReceiver : list) {
                        try {
                            BlackBoxCore.getContext().unregisterReceiver(broadcastReceiver);
                        } catch (Throwable unused) {
                        }
                    }
                }
                this.mReceivers.remove(str);
            }
        }
    }

    public void sendBroadcast(PendingResultData pendingResultData) {
        synchronized (this.mReceiversData) {
            this.mReceiversData.put(pendingResultData.mBToken, pendingResultData);
            this.mHandler.sendMessageDelayed(Message.obtain(this.mHandler, 1, pendingResultData), 9000L);
        }
    }

    public void startup() {
        this.mPms.addPackageMonitor(this);
        for (BPackageSettings bPackageSettings : this.mPms.getBPackageSettings()) {
            registerPackage(bPackageSettings.pkg);
        }
    }
}
