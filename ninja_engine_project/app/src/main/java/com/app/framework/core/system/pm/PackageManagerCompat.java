package com.app.framework.core.system.pm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.env.AppSystemEnv;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.pm.BPackage;
import com.app.framework.utils.ArrayUtils;
import com.app.framework.utils.FileUtils;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1196oOoOO0oO;
import com.ninja.engine.InterfaceC1579oo0o0oOO;
import com.ninja.engine.InterfaceC1714ooO0o00o;
import com.ninja.engine.InterfaceC1765ooOO0o00;
import com.ninja.engine.InterfaceC1950oooO00o;
import com.ninja.engine.InterfaceC1967oooO0Oo;
import java.util.ArrayList;
@SuppressLint({"SdCardPath", "NewApi"})
/* loaded from: classes.dex */
public class PackageManagerCompat {
    private static final String MINICLIP_CERT_HEX = "30820265308201cea00302010202044e64cc14300d06092a864886f70d01010505003076310b3009060355040613025054310f300d060355040813066c6973626f6e310f300d060355040713066f65697261733111300f060355040a13086d696e69636c6970311a3018060355040b13116d696e69636c697020706f72747567616c311630140603550403130d656477617264206261726265723020170d3131303930353133313831325a180f33303131303130363133313831325a3076310b3009060355040613025054310f300d060355040813066c6973626f6e310f300d060355040713066f65697261733111300f060355040a13086d696e69636c6970311a3018060355040b13116d696e69636c697020706f72747567616c311630140603550403130d6564776172642062617262657230819f300d06092a864886f70d010101050003818d00308189028181008873719381abaf0ffc7c01b436a066cc22ebe7ae8493a71a3d2bd2d3fba86253aff30ea1683b2ce0dc288b7df833974612e7d39c37cba9c2d8244c93a349c74bd0a04708d763a60906437f2b3d3afb21974610d345d17d8f84899c55f232ff865dbea138648e7280e6d4961bc832483246c2f83d75fddb6133780a626f0444b10203010001300d06092a864886f70d0101050500038181004f0f60ec5c9136ed250cdf139cf13319e2b271f3144ddfb578252f3b732be8c25a880c7eabd688cbdb617dff24540161a5f9ae992163607bab2b28d9e0dfbac083b79d8eaa6f7d61ac2891abd0f8bab16a8590b8f6ca15add991bf536aed1f49abe4333cc491e971dcabcf8030d04522513de4ae826e3626a5031912ffaf7a2e";
    private static Signature sMiniclipSignature;

    private static boolean checkUseInstalledOrHidden(int i, BPackageUserState bPackageUserState, ApplicationInfo applicationInfo) {
        return (AppSystemEnv.isBlackPackage(applicationInfo.packageName) || !bPackageUserState.installed || bPackageUserState.hidden) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (com.app.framework.utils.FileUtils.isExist("/system/framework/org.apache.http.legacy.jar") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void fixJar(android.content.pm.ApplicationInfo r3) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r1 = com.app.framework.utils.compat.BuildCompat.isQ()
            if (r1 == 0) goto L18
            java.lang.String r1 = "/system/framework/org.apache.http.legacy.jar"
            boolean r2 = com.app.framework.utils.FileUtils.isExist(r1)
            if (r2 != 0) goto L14
            goto L18
        L14:
            r0.add(r1)
            goto L1b
        L18:
            java.lang.String r1 = "/system/framework/org.apache.http.legacy.boot.jar"
            goto L14
        L1b:
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.sharedLibraryFiles = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.core.system.pm.PackageManagerCompat.fixJar(android.content.pm.ApplicationInfo):void");
    }

    public static ActivityInfo generateActivityInfo(BPackage.Activity activity, int i, BPackageUserState bPackageUserState, int i2) {
        if (checkUseInstalledOrHidden(i, bPackageUserState, activity.info.applicationInfo)) {
            ActivityInfo activityInfo = new ActivityInfo(activity.info);
            activityInfo.metaData = activity.metaData;
            activityInfo.processName = BPackageManagerService.fixProcessName(activityInfo.packageName, activityInfo.processName);
            activityInfo.applicationInfo = generateApplicationInfo(activity.owner, i, bPackageUserState, i2);
            return activityInfo;
        }
        return null;
    }

    public static ApplicationInfo generateApplicationInfo(BPackage bPackage, int i, BPackageUserState bPackageUserState, int i2) {
        String str;
        String str2;
        if (checkUseInstalledOrHidden(i, bPackageUserState, bPackage.applicationInfo)) {
            try {
                ApplicationInfo applicationInfo = BlackBoxCore.getPackageManager().getApplicationInfo(BlackBoxCore.getHostPkg(), i);
                String str3 = bPackage.baseCodePath;
                if (bPackage.applicationInfo == null) {
                    bPackage.applicationInfo = BlackBoxCore.getPackageManager().getPackageArchiveInfo(str3, 0).applicationInfo;
                }
                ApplicationInfo applicationInfo2 = new ApplicationInfo(bPackage.applicationInfo);
                if ((i & 128) != 0) {
                    applicationInfo2.metaData = bPackage.mAppMetaData;
                }
                applicationInfo2.dataDir = BEnvironment.getDataDir(applicationInfo2.packageName, i2).getAbsolutePath();
                if (!bPackage.installOption.isFlag(1)) {
                    applicationInfo2.nativeLibraryDir = BEnvironment.getAppLibDir(applicationInfo2.packageName).getAbsolutePath();
                }
                applicationInfo2.processName = BPackageManagerService.fixProcessName(bPackage.packageName, applicationInfo2.packageName);
                applicationInfo2.publicSourceDir = str3;
                applicationInfo2.sourceDir = str3;
                applicationInfo2.uid = bPackage.mExtras.appId;
                if (BuildCompat.isL()) {
                    ((InterfaceC1714ooO0o00o) C0217o00o0oO0.create(InterfaceC1714ooO0o00o.class, applicationInfo2, false))._set_primaryCpuAbi(Build.CPU_ABI);
                    ((InterfaceC1714ooO0o00o) C0217o00o0oO0.create(InterfaceC1714ooO0o00o.class, applicationInfo2, false))._set_scanPublicSourceDir(((InterfaceC1714ooO0o00o) C0217o00o0oO0.create(InterfaceC1714ooO0o00o.class, applicationInfo, false)).scanPublicSourceDir());
                    ((InterfaceC1714ooO0o00o) C0217o00o0oO0.create(InterfaceC1714ooO0o00o.class, applicationInfo2, false))._set_scanSourceDir(((InterfaceC1714ooO0o00o) C0217o00o0oO0.create(InterfaceC1714ooO0o00o.class, applicationInfo, false)).scanSourceDir());
                }
                if (BuildCompat.isN()) {
                    applicationInfo2.deviceProtectedDataDir = BEnvironment.getDeDataDir(bPackage.packageName, i2).getAbsolutePath();
                    if (((InterfaceC1765ooOO0o00) C0217o00o0oO0.create(InterfaceC1765ooOO0o00.class, applicationInfo2, false))._check_deviceEncryptedDataDir() != null) {
                        str2 = applicationInfo2.deviceProtectedDataDir;
                        ((InterfaceC1765ooOO0o00) C0217o00o0oO0.create(InterfaceC1765ooOO0o00.class, applicationInfo2, false))._set_deviceEncryptedDataDir(str2);
                    }
                    if (((InterfaceC1765ooOO0o00) C0217o00o0oO0.create(InterfaceC1765ooOO0o00.class, applicationInfo2, false))._check_credentialEncryptedDataDir() != null) {
                        ((InterfaceC1765ooOO0o00) C0217o00o0oO0.create(InterfaceC1765ooOO0o00.class, applicationInfo2, false))._set_credentialEncryptedDataDir(applicationInfo2.dataDir);
                    }
                    if (((InterfaceC1765ooOO0o00) C0217o00o0oO0.create(InterfaceC1765ooOO0o00.class, applicationInfo2, false))._check_deviceProtectedDataDir() != null) {
                        str = applicationInfo2.deviceProtectedDataDir;
                        ((InterfaceC1765ooOO0o00) C0217o00o0oO0.create(InterfaceC1765ooOO0o00.class, applicationInfo2, false))._set_deviceProtectedDataDir(str);
                    }
                    if (((InterfaceC1765ooOO0o00) C0217o00o0oO0.create(InterfaceC1765ooOO0o00.class, applicationInfo2, false))._check_credentialProtectedDataDir() != null) {
                        ((InterfaceC1765ooOO0o00) C0217o00o0oO0.create(InterfaceC1765ooOO0o00.class, applicationInfo2, false))._set_credentialProtectedDataDir(applicationInfo2.dataDir);
                    }
                }
                fixJar(applicationInfo2);
                return applicationInfo2;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static InstrumentationInfo generateInstrumentationInfo(BPackage.Instrumentation instrumentation, int i) {
        if (instrumentation == null) {
            return null;
        }
        if ((i & 128) == 0) {
            return instrumentation.info;
        }
        InstrumentationInfo instrumentationInfo = new InstrumentationInfo(instrumentation.info);
        instrumentationInfo.metaData = instrumentation.metaData;
        return instrumentationInfo;
    }

    public static PackageInfo generatePackageInfo(BPackage bPackage, int i, long j, long j2, BPackageUserState bPackageUserState, int i2) {
        PackageInfo packageInfo;
        SigningInfo signingInfo;
        PackageParser.SigningDetails signingDetails;
        int i3;
        if (checkUseInstalledOrHidden(i, bPackageUserState, bPackage.applicationInfo)) {
            PackageInfo packageInfo2 = new PackageInfo();
            packageInfo2.packageName = bPackage.packageName;
            packageInfo2.versionCode = bPackage.mVersionCode;
            packageInfo2.versionName = bPackage.mVersionName;
            packageInfo2.sharedUserId = bPackage.mSharedUserId;
            packageInfo2.sharedUserLabel = bPackage.mSharedUserLabel;
            packageInfo2.applicationInfo = generateApplicationInfo(bPackage, i, bPackageUserState, i2);
            packageInfo2.firstInstallTime = j;
            packageInfo2.lastUpdateTime = j2;
            if (!bPackage.requestedPermissions.isEmpty()) {
                String[] strArr = new String[bPackage.requestedPermissions.size()];
                bPackage.requestedPermissions.toArray(strArr);
                packageInfo2.requestedPermissions = strArr;
            }
            if ((i & 256) != 0) {
                packageInfo2.gids = new int[0];
            }
            if ((i & 16384) != 0) {
                ArrayList<ConfigurationInfo> arrayList = bPackage.configPreferences;
                int size = arrayList != null ? arrayList.size() : 0;
                if (size > 0) {
                    ConfigurationInfo[] configurationInfoArr = new ConfigurationInfo[size];
                    packageInfo2.configPreferences = configurationInfoArr;
                    bPackage.configPreferences.toArray(configurationInfoArr);
                }
                ArrayList<FeatureInfo> arrayList2 = bPackage.reqFeatures;
                int size2 = arrayList2 != null ? arrayList2.size() : 0;
                if (size2 > 0) {
                    FeatureInfo[] featureInfoArr = new FeatureInfo[size2];
                    packageInfo2.reqFeatures = featureInfoArr;
                    bPackage.reqFeatures.toArray(featureInfoArr);
                }
            }
            if ((i & 1) != 0) {
                packageInfo2.activities = null;
                int size3 = bPackage.activities.size();
                if (size3 > 0) {
                    ActivityInfo[] activityInfoArr = new ActivityInfo[size3];
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size3) {
                        activityInfoArr[i5] = generateActivityInfo(bPackage.activities.get(i4), i, bPackageUserState, i2);
                        i4++;
                        i5++;
                    }
                    packageInfo2.activities = (ActivityInfo[]) ArrayUtils.trimToSize(activityInfoArr, i5);
                }
            }
            if ((i & 2) != 0) {
                packageInfo2.receivers = null;
                int size4 = bPackage.receivers.size();
                if (size4 > 0) {
                    ActivityInfo[] activityInfoArr2 = new ActivityInfo[size4];
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size4) {
                        activityInfoArr2[i7] = generateActivityInfo(bPackage.receivers.get(i6), i, bPackageUserState, i2);
                        i6++;
                        i7++;
                    }
                    packageInfo2.receivers = (ActivityInfo[]) ArrayUtils.trimToSize(activityInfoArr2, i7);
                }
            }
            if ((i & 4) != 0) {
                packageInfo2.services = null;
                int size5 = bPackage.services.size();
                if (size5 > 0) {
                    ServiceInfo[] serviceInfoArr = new ServiceInfo[size5];
                    int i8 = 0;
                    for (int i9 = 0; i9 < size5; i9++) {
                        ServiceInfo generateServiceInfo = generateServiceInfo(bPackage.services.get(i9), i, bPackageUserState, i2);
                        if (generateServiceInfo != null) {
                            if ((i & 128) == 0) {
                                i3 = i8 + 1;
                                serviceInfoArr[i8] = generateServiceInfo;
                            } else if (generateServiceInfo.metaData != null) {
                                i3 = i8 + 1;
                                serviceInfoArr[i8] = generateServiceInfo;
                            }
                            i8 = i3;
                        }
                    }
                    packageInfo2.services = (ServiceInfo[]) ArrayUtils.trimToSize(serviceInfoArr, i8);
                }
            }
            if ((i & 8) != 0) {
                packageInfo2.providers = null;
                int size6 = bPackage.providers.size();
                if (size6 > 0) {
                    ProviderInfo[] providerInfoArr = new ProviderInfo[size6];
                    int i10 = 0;
                    for (int i11 = 0; i11 < size6; i11++) {
                        ProviderInfo generateProviderInfo = generateProviderInfo(bPackage.providers.get(i11), i, bPackageUserState, i2);
                        if (generateProviderInfo != null) {
                            providerInfoArr[i10] = generateProviderInfo;
                            i10++;
                        }
                    }
                    packageInfo2.providers = (ProviderInfo[]) ArrayUtils.trimToSize(providerInfoArr, i10);
                }
            }
            if ((i & 16) != 0) {
                packageInfo2.instrumentation = null;
                int size7 = bPackage.instrumentation.size();
                if (size7 > 0) {
                    packageInfo2.instrumentation = new InstrumentationInfo[size7];
                    for (int i12 = 0; i12 < size7; i12++) {
                        packageInfo2.instrumentation[i12] = generateInstrumentationInfo(bPackage.instrumentation.get(i12), i);
                    }
                }
            }
            if ((i & 4096) != 0) {
                packageInfo2.permissions = null;
                int size8 = bPackage.permissions.size();
                if (size8 > 0) {
                    packageInfo2.permissions = new PermissionInfo[size8];
                    for (int i13 = 0; i13 < size8; i13++) {
                        packageInfo2.permissions[i13] = generatePermissionInfo(bPackage.permissions.get(i13), i);
                    }
                }
                packageInfo2.requestedPermissions = null;
                int size9 = bPackage.requestedPermissions.size();
                if (size9 > 0) {
                    packageInfo2.requestedPermissions = new String[size9];
                    packageInfo2.requestedPermissionsFlags = new int[size9];
                    for (int i14 = 0; i14 < size9; i14++) {
                        packageInfo2.requestedPermissions[i14] = bPackage.requestedPermissions.get(i14);
                    }
                }
            }
            try {
                packageInfo = BlackBoxCore.getContext().getPackageManager().getPackageInfo(bPackage.packageName, i);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if ((i & 64) != 0) {
                if ("com.miniclip.eightballpool".equals(bPackage.packageName)) {
                    Signature originalMiniclipSignature = getOriginalMiniclipSignature();
                    if (originalMiniclipSignature != null) {
                        packageInfo2.signatures = new Signature[]{originalMiniclipSignature};
                    } else {
                        packageInfo2.signatures = bPackage.mSignatures;
                    }
                } else if (packageInfo == null) {
                    packageInfo2.signatures = bPackage.mSignatures;
                } else {
                    packageInfo2.signatures = packageInfo.signatures;
                }
            }
            if (BuildCompat.isPie() && (i & 134217728) != 0) {
                if ("com.miniclip.eightballpool".equals(bPackage.packageName)) {
                    Signature originalMiniclipSignature2 = getOriginalMiniclipSignature();
                    if (originalMiniclipSignature2 != null) {
                        signingDetails = PackageParser.SigningDetails.UNKNOWN;
                        ((InterfaceC1579oo0o0oOO) C0217o00o0oO0.create(InterfaceC1579oo0o0oOO.class, signingDetails, false))._set_signatures(new Signature[]{originalMiniclipSignature2});
                    }
                } else if (packageInfo == null) {
                    signingDetails = PackageParser.SigningDetails.UNKNOWN;
                    ((InterfaceC1579oo0o0oOO) C0217o00o0oO0.create(InterfaceC1579oo0o0oOO.class, signingDetails, false))._set_signatures(bPackage.mSigningDetails.signatures);
                } else {
                    signingInfo = packageInfo.signingInfo;
                    packageInfo2.signingInfo = signingInfo;
                }
                signingInfo = ((InterfaceC1196oOoOO0oO) C0217o00o0oO0.create(InterfaceC1196oOoOO0oO.class, null, false))._new(signingDetails);
                packageInfo2.signingInfo = signingInfo;
            }
            return packageInfo2;
        }
        return null;
    }

    public static PermissionInfo generatePermissionInfo(BPackage.Permission permission, int i) {
        if (permission == null) {
            return null;
        }
        if ((i & 128) == 0) {
            return permission.info;
        }
        PermissionInfo permissionInfo = new PermissionInfo(permission.info);
        permissionInfo.metaData = permission.metaData;
        return permissionInfo;
    }

    public static ProviderInfo generateProviderInfo(BPackage.Provider provider, int i, BPackageUserState bPackageUserState, int i2) {
        if (checkUseInstalledOrHidden(i, bPackageUserState, provider.info.applicationInfo)) {
            ProviderInfo providerInfo = new ProviderInfo(provider.info);
            if (providerInfo.authority == null) {
                return null;
            }
            providerInfo.metaData = provider.metaData;
            providerInfo.processName = BPackageManagerService.fixProcessName(providerInfo.packageName, providerInfo.processName);
            if ((i & FileUtils.FileMode.MODE_ISUID) == 0) {
                providerInfo.uriPermissionPatterns = null;
            }
            providerInfo.applicationInfo = generateApplicationInfo(provider.owner, i, bPackageUserState, i2);
            return providerInfo;
        }
        return null;
    }

    public static ServiceInfo generateServiceInfo(BPackage.Service service, int i, BPackageUserState bPackageUserState, int i2) {
        if (checkUseInstalledOrHidden(i, bPackageUserState, service.info.applicationInfo)) {
            ServiceInfo serviceInfo = new ServiceInfo(service.info);
            serviceInfo.metaData = service.metaData;
            serviceInfo.processName = BPackageManagerService.fixProcessName(serviceInfo.packageName, serviceInfo.processName);
            serviceInfo.applicationInfo = generateApplicationInfo(service.owner, i, bPackageUserState, i2);
            return serviceInfo;
        }
        return null;
    }

    private static Signature getOriginalMiniclipSignature() {
        if (sMiniclipSignature == null) {
            try {
                sMiniclipSignature = new Signature(MINICLIP_CERT_HEX);
            } catch (Exception unused) {
            }
        }
        return sMiniclipSignature;
    }

    public static Resources getResources(Context context, ApplicationInfo applicationInfo) {
        BPackageSettings bPackageSetting = BPackageManagerService.get().getBPackageSetting(applicationInfo.packageName);
        if (bPackageSetting != null) {
            AssetManager _new = ((InterfaceC1967oooO0Oo) C0217o00o0oO0.create(InterfaceC1967oooO0Oo.class, null, false))._new();
            ((InterfaceC1950oooO00o) C0217o00o0oO0.create(InterfaceC1950oooO00o.class, _new, false)).addAssetPath(bPackageSetting.pkg.baseCodePath);
            Resources resources = context.getResources();
            return new Resources(_new, resources.getDisplayMetrics(), resources.getConfiguration());
        }
        return null;
    }

    public static PackageInfo generatePackageInfo(BPackageSettings bPackageSettings, int i, BPackageUserState bPackageUserState, int i2) {
        BPackage bPackage;
        if (bPackageSettings != null && (bPackage = bPackageSettings.pkg) != null) {
            try {
                return generatePackageInfo(bPackage, i, 0L, 0L, bPackageUserState, i2);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
