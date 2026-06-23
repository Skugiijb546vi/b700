package com.app.framework.fake.frameworks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.system.ServiceManager;
import com.app.framework.core.system.pm.IBPackageManagerService;
import com.app.framework.entity.pm.InstallOption;
import com.app.framework.entity.pm.InstallResult;
import com.app.framework.entity.pm.InstalledPackage;
import com.app.framework.fake.frameworks.BPackageManager;
import com.app.framework.utils.TransactionThrottler;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C0165o00OoO0;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class BPackageManager extends VirtualServiceManager<IBPackageManagerService> {
    private final TransactionThrottler transactionThrottler = new TransactionThrottler();
    private static final BPackageManager sPackageManager = new BPackageManager();
    private static volatile boolean sIsFindingApkPath = false;

    private void crash(Throwable th) {
        th.printStackTrace();
    }

    private ApplicationInfo createFallbackApplicationInfo(String str, int i, int i2) {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.packageName = str;
        applicationInfo.flags = i;
        applicationInfo.uid = 0;
        String findActualApkPath = findActualApkPath(str);
        if (findActualApkPath == null) {
            findActualApkPath = null;
        }
        applicationInfo.sourceDir = findActualApkPath;
        applicationInfo.publicSourceDir = findActualApkPath;
        applicationInfo.dataDir = AbstractC1230oOoOo0o.OooOO0o("/data/data/", str);
        applicationInfo.nativeLibraryDir = AbstractC1230oOoOo0o.OooOO0o("/data/app-lib/", str);
        applicationInfo.metaData = new Bundle();
        applicationInfo.splitNames = new String[0];
        applicationInfo.flags |= 4227072;
        return applicationInfo;
    }

    private Intent createFallbackLaunchIntent(String str) {
        try {
            Intent launchIntentForPackage = BlackBoxCore.getContext().getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268435456);
                return launchIntentForPackage;
            }
        } catch (Exception unused) {
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        intent.setFlags(268435456);
        return intent;
    }

    private PackageInfo createFallbackPackageInfo(String str, int i, int i2) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = str;
        packageInfo.versionCode = 1;
        packageInfo.versionName = "1.0";
        packageInfo.applicationInfo = createFallbackApplicationInfo(str, i, i2);
        packageInfo.firstInstallTime = System.currentTimeMillis();
        packageInfo.lastUpdateTime = System.currentTimeMillis();
        packageInfo.installLocation = 0;
        packageInfo.gids = new int[0];
        packageInfo.splitNames = new String[0];
        packageInfo.signatures = new Signature[0];
        return packageInfo;
    }

    private String findActualApkPath(String str) {
        if (sIsFindingApkPath) {
            return null;
        }
        sIsFindingApkPath = true;
        try {
            String[] strArr = {"/data/app/~~*/" + str + "-*/base.apk", "/data/app/~~*/" + str + "*/base.apk", "/data/app/" + str + "-1/base.apk", "/data/app/" + str + "-2/base.apk", "/data/app/" + str + "/base.apk", "/system/app/" + str + ".apk", "/system/priv-app/" + str + ".apk", "/system_ext/app/" + str + ".apk", "/product/app/" + str + ".apk", "/vendor/app/" + str + ".apk"};
            for (int i = 0; i < 10; i++) {
                String str2 = strArr[i];
                try {
                    if (isValidApkPath(str2)) {
                        sIsFindingApkPath = false;
                        return str2;
                    }
                } catch (Throwable th) {
                    th = th;
                    sIsFindingApkPath = false;
                    throw th;
                }
            }
            String findHashBasedApkPath = findHashBasedApkPath(str);
            sIsFindingApkPath = false;
            if (findHashBasedApkPath != null) {
                return findHashBasedApkPath;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String findHashBasedApkPath(final String str) {
        File file;
        File[] listFiles;
        File[] listFiles2;
        try {
            file = new File("/data/app");
        } catch (Exception e) {
            e.getMessage();
        }
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new C0165o00OoO0(0))) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && (listFiles2 = file2.listFiles(new FilenameFilter() { // from class: com.ninja.engine.o00OoO0o
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file3, String str2) {
                        boolean lambda$findHashBasedApkPath$1;
                        lambda$findHashBasedApkPath$1 = BPackageManager.lambda$findHashBasedApkPath$1(str, file3, str2);
                        return lambda$findHashBasedApkPath$1;
                    }
                })) != null) {
                    for (File file3 : listFiles2) {
                        if (file3.isDirectory()) {
                            File file4 = new File(file3, "base.apk");
                            if (isValidApkPath(file4.getAbsolutePath())) {
                                return file4.getAbsolutePath();
                            }
                        }
                    }
                    continue;
                }
            }
            return null;
        }
        return null;
    }

    public static BPackageManager get() {
        return sPackageManager;
    }

    private boolean isInstalledFallback(String str) {
        try {
            BlackBoxCore.getContext().getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return str != null && (str.equals("com.media.bestrecorder.audiorecorder") || str.startsWith("com.app.framework"));
        }
    }

    private boolean isValidApkPath(String str) {
        try {
            if (str.contains("*")) {
                return false;
            }
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                return file.length() >= 1024;
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static /* synthetic */ boolean lambda$findHashBasedApkPath$0(File file, String str) {
        return str.startsWith("~~") && str.endsWith("==");
    }

    public static /* synthetic */ boolean lambda$findHashBasedApkPath$1(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private boolean shouldUseFallbackMode() {
        return this.transactionThrottler.getFailureCount() >= 2 || !isServiceHealthy();
    }

    public void clearPackage(String str, int i) {
        try {
            getService().clearPackage(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void forceReinitialize() {
        clearServiceCache();
        resetTransactionThrottler();
        try {
            getService();
        } catch (Exception unused) {
        }
    }

    public ActivityInfo getActivityInfo(ComponentName componentName, int i, int i2) {
        try {
            IBPackageManagerService service = getService();
            if (service == null) {
                return null;
            }
            return service.getActivityInfo(componentName, i, i2);
        } catch (RemoteException unused) {
            Objects.toString(componentName);
            return null;
        } catch (Exception unused2) {
            Objects.toString(componentName);
            return null;
        }
    }

    public ApplicationInfo getApplicationInfo(String str, int i, int i2) {
        try {
            IBPackageManagerService serviceWithFallback = getServiceWithFallback();
            return serviceWithFallback == null ? createFallbackApplicationInfo(str, i, i2) : serviceWithFallback.getApplicationInfo(str, i, i2);
        } catch (RemoteException unused) {
            return createFallbackApplicationInfo(str, i, i2);
        } catch (Exception unused2) {
            return createFallbackApplicationInfo(str, i, i2);
        }
    }

    public List<ApplicationInfo> getInstalledApplications(int i, int i2) {
        try {
            return getService().getInstalledApplications(i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<PackageInfo> getInstalledPackages(int i, int i2) {
        try {
            return getService().getInstalledPackages(i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<InstalledPackage> getInstalledPackagesAsUser(int i) {
        try {
            return getService().getInstalledPackagesAsUser(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Intent getLaunchIntentForPackage(String str, int i) {
        if (shouldUseFallbackMode()) {
            return createFallbackLaunchIntent(str);
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = queryIntentActivities(intent, 0, intent.resolveTypeIfNeeded(BlackBoxCore.getContext().getContentResolver()), i);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            queryIntentActivities = queryIntentActivities(intent, 0, intent.resolveTypeIfNeeded(BlackBoxCore.getContext().getContentResolver()), i);
        }
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        Intent intent2 = new Intent(intent);
        intent2.setFlags(268435456);
        intent2.setClassName(queryIntentActivities.get(0).activityInfo.packageName, queryIntentActivities.get(0).activityInfo.name);
        return intent2;
    }

    public PackageInfo getPackageInfo(String str, int i, int i2) {
        try {
            IBPackageManagerService serviceWithFallback = getServiceWithFallback();
            return serviceWithFallback == null ? createFallbackPackageInfo(str, i, i2) : serviceWithFallback.getPackageInfo(str, i, i2);
        } catch (RemoteException unused) {
            return createFallbackPackageInfo(str, i, i2);
        } catch (Exception unused2) {
            return createFallbackPackageInfo(str, i, i2);
        }
    }

    public String[] getPackagesForUid(int i) {
        try {
            return getService().getPackagesForUid(i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public ProviderInfo getProviderInfo(ComponentName componentName, int i, int i2) {
        try {
            IBPackageManagerService service = getService();
            if (service == null) {
                return null;
            }
            return service.getProviderInfo(componentName, i, i2);
        } catch (RemoteException unused) {
            Objects.toString(componentName);
            return null;
        } catch (Exception unused2) {
            Objects.toString(componentName);
            return null;
        }
    }

    public ActivityInfo getReceiverInfo(ComponentName componentName, int i, int i2) {
        try {
            IBPackageManagerService service = getService();
            if (service == null) {
                return null;
            }
            return service.getReceiverInfo(componentName, i, i2);
        } catch (RemoteException unused) {
            Objects.toString(componentName);
            return null;
        } catch (Exception unused2) {
            Objects.toString(componentName);
            return null;
        }
    }

    public ServiceInfo getServiceInfo(ComponentName componentName, int i, int i2) {
        try {
            IBPackageManagerService service = getService();
            if (service == null) {
                return null;
            }
            return service.getServiceInfo(componentName, i, i2);
        } catch (RemoteException unused) {
            Objects.toString(componentName);
            return null;
        } catch (Exception unused2) {
            Objects.toString(componentName);
            return null;
        }
    }

    @Override // com.app.framework.fake.frameworks.VirtualServiceManager
    public String getServiceName() {
        return ServiceManager.PACKAGE_MANAGER;
    }

    public IBPackageManagerService getServiceWithFallback() {
        IBPackageManagerService service = getService();
        if (service == null) {
            forceReinitialize();
            return getService();
        }
        return service;
    }

    public InstallResult installPackageAsUser(String str, InstallOption installOption, int i) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    try {
                        PackageInfo packageArchiveInfo = BlackBoxCore.getPackageManager().getPackageArchiveInfo(str, 0);
                        if (packageArchiveInfo != null && packageArchiveInfo.packageName.equals(BlackBoxCore.getHostPkg())) {
                            return new InstallResult().installError("Cannot clone BlackBox app from within BlackBox. This would create infinite recursion and is not allowed for security reasons.");
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (RemoteException e) {
                crash(e);
                return null;
            }
        }
        return getService().installPackageAsUser(str, installOption, i);
    }

    public boolean isInstalled(String str, int i) {
        try {
            if (shouldUseFallbackMode()) {
                return isInstalledFallback(str);
            }
            try {
                IBPackageManagerService service = getService();
                if (service != null) {
                    boolean isInstalled = service.isInstalled(str, i);
                    this.transactionThrottler.reset();
                    return isInstalled;
                }
                return false;
            } catch (DeadObjectException unused) {
                this.transactionThrottler.recordFailure();
                clearServiceCache();
                IBPackageManagerService service2 = getService();
                if (service2 != null) {
                    boolean isInstalled2 = service2.isInstalled(str, i);
                    this.transactionThrottler.reset();
                    return isInstalled2;
                }
                return false;
            }
        } catch (Exception unused2) {
            this.transactionThrottler.recordFailure();
            return false;
        }
    }

    public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i, String str, int i2) {
        try {
            IBPackageManagerService service = getService();
            return service != null ? service.queryBroadcastReceivers(intent, i, str, i2) : Collections.emptyList();
        } catch (DeadObjectException unused) {
            clearServiceCache();
            try {
                IBPackageManagerService service2 = getService();
                if (service2 != null) {
                    return service2.queryBroadcastReceivers(intent, i, str, i2);
                }
            } catch (Exception unused2) {
            }
            return Collections.emptyList();
        } catch (RemoteException e) {
            crash(e);
            return Collections.emptyList();
        }
    }

    public List<ProviderInfo> queryContentProviders(String str, int i, int i2, int i3) {
        try {
            IBPackageManagerService service = getService();
            return service != null ? service.queryContentProviders(str, i, i2, i3) : Collections.emptyList();
        } catch (DeadObjectException unused) {
            clearServiceCache();
            try {
                IBPackageManagerService service2 = getService();
                if (service2 != null) {
                    return service2.queryContentProviders(str, i, i2, i3);
                }
            } catch (Exception unused2) {
            }
            return Collections.emptyList();
        } catch (RemoteException e) {
            crash(e);
            return Collections.emptyList();
        }
    }

    public List<ResolveInfo> queryIntentActivities(Intent intent, int i, String str, int i2) {
        if (!this.transactionThrottler.shouldThrottle() && this.transactionThrottler.getFailureCount() < 2) {
            try {
                IBPackageManagerService service = getService();
                if (service != null) {
                    List<ResolveInfo> queryIntentActivities = service.queryIntentActivities(intent, i, str, i2);
                    this.transactionThrottler.reset();
                    return queryIntentActivities;
                }
                return Collections.emptyList();
            } catch (DeadObjectException unused) {
                this.transactionThrottler.recordFailure();
                clearServiceCache();
                if (this.transactionThrottler.getFailureCount() < 3) {
                    try {
                        IBPackageManagerService service2 = getService();
                        if (service2 != null) {
                            List<ResolveInfo> queryIntentActivities2 = service2.queryIntentActivities(intent, i, str, i2);
                            this.transactionThrottler.reset();
                            return queryIntentActivities2;
                        }
                    } catch (Exception unused2) {
                        this.transactionThrottler.recordFailure();
                    }
                }
                return Collections.emptyList();
            } catch (RemoteException e) {
                this.transactionThrottler.recordFailure();
                crash(e);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }

    public void resetTransactionThrottler() {
        this.transactionThrottler.reset();
    }

    public ResolveInfo resolveActivity(Intent intent, int i, String str, int i2) {
        if (this.transactionThrottler.shouldThrottle()) {
            return null;
        }
        try {
            try {
                IBPackageManagerService service = getService();
                if (service != null) {
                    ResolveInfo resolveActivity = service.resolveActivity(intent, i, str, i2);
                    this.transactionThrottler.reset();
                    return resolveActivity;
                }
            } catch (DeadObjectException unused) {
                this.transactionThrottler.recordFailure();
                clearServiceCache();
                IBPackageManagerService service2 = getService();
                if (service2 != null) {
                    ResolveInfo resolveActivity2 = service2.resolveActivity(intent, i, str, i2);
                    this.transactionThrottler.reset();
                    return resolveActivity2;
                }
            }
        } catch (Exception unused2) {
            this.transactionThrottler.recordFailure();
        }
        return null;
    }

    public ProviderInfo resolveContentProvider(String str, int i, int i2) {
        if (this.transactionThrottler.shouldThrottle()) {
            return null;
        }
        try {
            try {
                IBPackageManagerService service = getService();
                if (service != null) {
                    ProviderInfo resolveContentProvider = service.resolveContentProvider(str, i, i2);
                    this.transactionThrottler.reset();
                    return resolveContentProvider;
                }
            } catch (DeadObjectException unused) {
                this.transactionThrottler.recordFailure();
                clearServiceCache();
                IBPackageManagerService service2 = getService();
                if (service2 != null) {
                    ProviderInfo resolveContentProvider2 = service2.resolveContentProvider(str, i, i2);
                    this.transactionThrottler.reset();
                    return resolveContentProvider2;
                }
            }
        } catch (Exception unused2) {
            this.transactionThrottler.recordFailure();
        }
        return null;
    }

    public ResolveInfo resolveIntent(Intent intent, String str, int i, int i2) {
        try {
            return getService().resolveIntent(intent, str, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public ResolveInfo resolveService(Intent intent, int i, String str, int i2) {
        if (this.transactionThrottler.shouldThrottle()) {
            return null;
        }
        try {
            try {
                IBPackageManagerService service = getService();
                if (service != null) {
                    ResolveInfo resolveService = service.resolveService(intent, i, str, i2);
                    this.transactionThrottler.reset();
                    return resolveService;
                }
            } catch (DeadObjectException unused) {
                this.transactionThrottler.recordFailure();
                clearServiceCache();
                IBPackageManagerService service2 = getService();
                if (service2 != null) {
                    ResolveInfo resolveService2 = service2.resolveService(intent, i, str, i2);
                    this.transactionThrottler.reset();
                    return resolveService2;
                }
            }
        } catch (Exception unused2) {
            this.transactionThrottler.recordFailure();
        }
        return null;
    }

    public void stopPackage(String str, int i) {
        try {
            getService().stopPackage(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void uninstallPackage(String str) {
        try {
            getService().uninstallPackage(str);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void uninstallPackageAsUser(String str, int i) {
        try {
            getService().uninstallPackageAsUser(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}



