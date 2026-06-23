package com.app.framework.core.system;

import android.os.IBinder;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.accounts.BAccountManagerService;
import com.app.framework.core.system.am.BActivityManagerService;
import com.app.framework.core.system.am.BJobManagerService;
import com.app.framework.core.system.location.BLocationManagerService;
import com.app.framework.core.system.notification.BNotificationManagerService;
import com.app.framework.core.system.os.BStorageManagerService;
import com.app.framework.core.system.pm.BPackageManagerService;
import com.app.framework.core.system.pm.BXposedManagerService;
import com.app.framework.core.system.user.BUserManagerService;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ServiceManager {
    public static final String ACCOUNT_MANAGER = "account_manager";
    public static final String ACTIVITY_MANAGER = "activity_manager";
    public static final String JOB_MANAGER = "job_manager";
    public static final String LOCATION_MANAGER = "location_manager";
    public static final String NOTIFICATION_MANAGER = "notification_manager";
    public static final String PACKAGE_MANAGER = "package_manager";
    public static final String STORAGE_MANAGER = "storage_manager";
    public static final String USER_MANAGER = "user_manager";
    public static final String XPOSED_MANAGER = "xposed_manager";
    private static ServiceManager sServiceManager;
    private final Map<String, IBinder> mCaches;

    private ServiceManager() {
        HashMap hashMap = new HashMap();
        this.mCaches = hashMap;
        hashMap.put(ACTIVITY_MANAGER, BActivityManagerService.get());
        hashMap.put(JOB_MANAGER, BJobManagerService.get());
        hashMap.put(PACKAGE_MANAGER, BPackageManagerService.get());
        hashMap.put(STORAGE_MANAGER, BStorageManagerService.get());
        hashMap.put(USER_MANAGER, BUserManagerService.get());
        hashMap.put(XPOSED_MANAGER, BXposedManagerService.get());
        hashMap.put(ACCOUNT_MANAGER, BAccountManagerService.get());
        hashMap.put(LOCATION_MANAGER, BLocationManagerService.get());
        hashMap.put(NOTIFICATION_MANAGER, BNotificationManagerService.get());
    }

    public static ServiceManager get() {
        if (sServiceManager == null) {
            synchronized (ServiceManager.class) {
                try {
                    if (sServiceManager == null) {
                        sServiceManager = new ServiceManager();
                    }
                } finally {
                }
            }
        }
        return sServiceManager;
    }

    public static IBinder getService(String str) {
        return get().getServiceInternal(str);
    }

    public static void initVirtualManagers() {
        BlackBoxCore.get().getService(ACTIVITY_MANAGER);
        BlackBoxCore.get().getService(JOB_MANAGER);
        BlackBoxCore.get().getService(PACKAGE_MANAGER);
        BlackBoxCore.get().getService(STORAGE_MANAGER);
        BlackBoxCore.get().getService(USER_MANAGER);
        BlackBoxCore.get().getService(XPOSED_MANAGER);
        BlackBoxCore.get().getService(ACCOUNT_MANAGER);
        BlackBoxCore.get().getService(LOCATION_MANAGER);
        BlackBoxCore.get().getService(NOTIFICATION_MANAGER);
    }

    public IBinder getServiceInternal(String str) {
        return this.mCaches.get(str);
    }
}
