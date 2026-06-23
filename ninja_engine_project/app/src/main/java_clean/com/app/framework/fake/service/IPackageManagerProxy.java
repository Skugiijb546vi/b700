package com.app.framework.fake.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.GmsCore;
import com.app.framework.core.env.AppSystemEnv;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.service.base.ValueMethodProxy;
import com.app.framework.utils.MethodParameterUtils;
import com.app.framework.utils.Reflector;
import com.app.framework.utils.compat.BuildCompat;
import com.app.framework.utils.compat.ParceledListSliceCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0529o0o0O00O;
import com.ninja.engine.InterfaceC1597oo0oOOo0;
import com.ninja.engine.InterfaceC1680ooO0O0O;
import com.ninja.engine.InterfaceC1941oooO00;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class IPackageManagerProxy extends BinderInvocationStub {
    public static final String TAG = "PackageManagerStub";

    @ProxyMethod("canRequestPackageInstalls")
    /* loaded from: classes.dex */
    public static class CanRequestPackageInstalls extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("checkSelfPermission")
    /* loaded from: classes.dex */
    public static class CheckSelfPermission extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            if (IPackageManagerProxy.isAudioPermission(str) || IPackageManagerProxy.isStorageOrMediaPermission(str) || IPackageManagerProxy.isNotificationOrXiaomiPermission(str) || IPackageManagerProxy.isNetworkPermission(str)) {
                return 0;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getDrawable")
    /* loaded from: classes.dex */
    public static class DisableIconLoading extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    @ProxyMethod("getActivityInfo")
    /* loaded from: classes.dex */
    public static class GetActivityInfo extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            ActivityInfo activityInfo = BlackBoxCore.getBPackageManager().getActivityInfo(componentName, MethodParameterUtils.toInt(objArr[1]), BlackBoxCore.getUserId());
            if (activityInfo != null) {
                return activityInfo;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getApplicationInfo")
    /* loaded from: classes.dex */
    public static class GetApplicationInfo extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            int i = MethodParameterUtils.toInt(objArr[1]);
            if (AppSystemEnv.isGmsPackage(str)) {
                return method.invoke(obj, objArr);
            }
            ApplicationInfo applicationInfo = BlackBoxCore.getBPackageManager().getApplicationInfo(str, i, BlackBoxCore.getUserId());
            if (applicationInfo != null) {
                return applicationInfo;
            }
            if (AppSystemEnv.isOpenPackage(str)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getInstalledApplications")
    /* loaded from: classes.dex */
    public static class GetInstalledApplications extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BlackBoxCore.getBPackageManager().getInstalledApplications(MethodParameterUtils.toInt(objArr[0]), BlackBoxCore.getUserId()));
        }
    }

    @ProxyMethod("getInstalledPackages")
    /* loaded from: classes.dex */
    public static class GetInstalledPackages extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BlackBoxCore.getBPackageManager().getInstalledPackages(MethodParameterUtils.toInt(objArr[0]), BlackBoxCore.getUserId()));
        }
    }

    @ProxyMethod("getInstallerPackageName")
    /* loaded from: classes.dex */
    public static class GetInstallerPackageName extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return GmsCore.VENDING_PKG;
        }
    }

    @ProxyMethod("getPackageInfo")
    /* loaded from: classes.dex */
    public static class GetPackageInfo extends MethodHook {
        private static final String MINICLIP_ORIGINAL_CERT_HEX = "30820265308201cea00302010202044e64cc14300d06092a864886f70d01010505003076310b3009060355040613025054310f300d060355040813066c6973626f6e310f300d060355040713066f65697261733111300f060355040a13086d696e69636c6970311a3018060355040b13116d696e69636c697020706f72747567616c311630140603550403130d656477617264206261726265723020170d3131303930353133313831325a180f33303131303130363133313831325a3076310b3009060355040613025054310f300d060355040813066c6973626f6e310f300d060355040713066f65697261733111300f060355040a13086d696e69636c6970311a3018060355040b13116d696e69636c697020706f72747567616c311630140603550403130d6564776172642062617262657230819f300d06092a864886f70d010101050003818d00308189028181008873719381abaf0ffc7c01b436a066cc22ebe7ae8493a71a3d2bd2d3fba86253aff30ea1683b2ce0dc288b7df833974612e7d39c37cba9c2d8244c93a349c74bd0a04708d763a60906437f2b3d3afb21974610d345d17d8f84899c55f232ff865dbea138648e7280e6d4961bc832483246c2f83d75fddb6133780a626f0444b10203010001300d06092a864886f70d0101050500038181004f0f60ec5c9136ed250cdf139cf13319e2b271f3144ddfb578252f3b732be8c25a880c7eabd688cbdb617dff24540161a5f9ae992163607bab2b28d9e0dfbac083b79d8eaa6f7d61ac2891abd0f8bab16a8590b8f6ca15add991bf536aed1f49abe4333cc491e971dcabcf8030d04522513de4ae826e3626a5031912ffaf7a2e";
        private static Signature sOriginalMiniclipSignature;

        private PackageInfo createFakeGooglePlayServicesPackageInfo() {
            PackageInfo packageInfo = new PackageInfo();
            packageInfo.packageName = GmsCore.VENDING_PKG;
            packageInfo.versionName = "33.8.16-21";
            packageInfo.versionCode = 83381621;
            ApplicationInfo applicationInfo = new ApplicationInfo();
            applicationInfo.packageName = GmsCore.VENDING_PKG;
            applicationInfo.name = "Google Play Store";
            applicationInfo.flags = 1;
            applicationInfo.uid = 10001;
            packageInfo.applicationInfo = applicationInfo;
            return packageInfo;
        }

        private static Signature getOriginalMiniclipSignature() {
            if (sOriginalMiniclipSignature == null) {
                try {
                    sOriginalMiniclipSignature = new Signature(MINICLIP_ORIGINAL_CERT_HEX);
                } catch (Exception unused) {
                }
            }
            return sOriginalMiniclipSignature;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Signature originalMiniclipSignature;
            Signature originalMiniclipSignature2;
            String str = (String) objArr[0];
            int i = MethodParameterUtils.toInt(objArr[1]);
            String appPackageName = BActivityThread.getAppPackageName();
            int i2 = i & 64;
            PackageInfo packageInfo = null;
            if (GmsCore.GMS_PKG.equals(str)) {
                try {
                    packageInfo = (PackageInfo) method.invoke(obj, objArr);
                } catch (Exception e) {
                    e.getMessage();
                }
                if (packageInfo == null) {
                    packageInfo = new PackageInfo();
                    packageInfo.packageName = GmsCore.GMS_PKG;
                }
                if (packageInfo.versionCode < 13000000) {
                    packageInfo.versionCode = 240000000;
                }
                return packageInfo;
            } else if (AppSystemEnv.isGmsPackage(str)) {
                return method.invoke(obj, objArr);
            } else {
                if ("com.miniclip.eightballpool".equals(appPackageName) && BlackBoxCore.getHostPkg().equals(str) && i2 != 0) {
                    try {
                        PackageInfo packageInfo2 = (PackageInfo) method.invoke(obj, objArr);
                        if (packageInfo2 != null && (originalMiniclipSignature2 = getOriginalMiniclipSignature()) != null) {
                            packageInfo2.signatures = new Signature[]{originalMiniclipSignature2};
                            return packageInfo2;
                        }
                    } catch (Exception unused) {
                    }
                }
                PackageInfo packageInfo3 = BlackBoxCore.getBPackageManager().getPackageInfo(str, i, BlackBoxCore.getUserId());
                if (packageInfo3 == null) {
                    if (AppSystemEnv.isOpenPackage(str)) {
                        return method.invoke(obj, objArr);
                    }
                    return null;
                }
                if ("com.miniclip.eightballpool".equals(appPackageName) && i2 != 0) {
                    try {
                        Signature[] signatureArr = packageInfo3.signatures;
                        if (signatureArr != null && signatureArr.length > 0) {
                            byte[] byteArray = signatureArr[0].toByteArray();
                            Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(byteArray), 2);
                            int length = byteArray.length;
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (packageInfo3.requestedPermissions != null && packageInfo3.requestedPermissionsFlags != null) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = packageInfo3.requestedPermissions;
                        if (i3 >= strArr.length) {
                            break;
                        }
                        String str2 = strArr[i3];
                        if (str2 != null && (str2.equals("android.permission.RECORD_AUDIO") || str2.equals("android.permission.FOREGROUND_SERVICE_MICROPHONE") || str2.equals("android.permission.MODIFY_AUDIO_SETTINGS") || str2.equals("android.permission.CAPTURE_AUDIO_OUTPUT"))) {
                            int[] iArr = packageInfo3.requestedPermissionsFlags;
                            iArr[i3] = iArr[i3] | 2;
                        }
                        i3++;
                    }
                }
                if ("com.miniclip.eightballpool".equals(str) && i2 != 0 && (originalMiniclipSignature = getOriginalMiniclipSignature()) != null) {
                    packageInfo3.signatures = new Signature[]{originalMiniclipSignature};
                    try {
                        byte[] byteArray2 = originalMiniclipSignature.toByteArray();
                        byte[] digest = MessageDigest.getInstance("SHA-1").digest(byteArray2);
                        Base64.encodeToString(digest, 11);
                        Base64.encodeToString(digest, 2);
                        int length2 = digest.length;
                        for (int i4 = 0; i4 < length2; i4++) {
                            String.format("%02x", Byte.valueOf(digest[i4]));
                        }
                        int length3 = byteArray2.length;
                    } catch (Exception unused3) {
                    }
                }
                "com.miniclip.eightballpool".equals(str);
                return packageInfo3;
            }
        }
    }

    @ProxyMethod("getPackageUid")
    /* loaded from: classes.dex */
    public static class GetPackageUid extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getPackagesForUid")
    /* loaded from: classes.dex */
    public static class GetPackagesForUid extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == BlackBoxCore.getHostUid()) {
                intValue = BActivityThread.getBUid();
                objArr[0] = Integer.valueOf(intValue);
            }
            String[] packagesForUid = BlackBoxCore.getBPackageManager().getPackagesForUid(intValue);
            Objects.toString(objArr[0]);
            BActivityThread.getAppProcessName();
            Arrays.toString(packagesForUid);
            return (packagesForUid == null || packagesForUid.length == 0) ? method.invoke(obj, objArr) : packagesForUid;
        }
    }

    @ProxyMethod("getProviderInfo")
    /* loaded from: classes.dex */
    public static class GetProviderInfo extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            ProviderInfo providerInfo = BlackBoxCore.getBPackageManager().getProviderInfo(componentName, MethodParameterUtils.toInt(objArr[1]), BlackBoxCore.getUserId());
            if (providerInfo != null) {
                return providerInfo;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getReceiverInfo")
    /* loaded from: classes.dex */
    public static class GetReceiverInfo extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            ActivityInfo receiverInfo = BlackBoxCore.getBPackageManager().getReceiverInfo(componentName, MethodParameterUtils.toInt(objArr[1]), BlackBoxCore.getUserId());
            if (receiverInfo != null) {
                return receiverInfo;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getServiceInfo")
    /* loaded from: classes.dex */
    public static class GetServiceInfo extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            ServiceInfo serviceInfo = BlackBoxCore.getBPackageManager().getServiceInfo(componentName, MethodParameterUtils.toInt(objArr[1]), BlackBoxCore.getUserId());
            if (serviceInfo != null) {
                return serviceInfo;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getSharedLibraries")
    /* loaded from: classes.dex */
    public static class GetSharedLibraries extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(new ArrayList());
        }
    }

    @ProxyMethod("queryIntentReceivers")
    /* loaded from: classes.dex */
    public static class QueryBroadcastReceivers extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            List<ResolveInfo> queryBroadcastReceivers = BlackBoxCore.getBPackageManager().queryBroadcastReceivers((Intent) MethodParameterUtils.getFirstParam(objArr, Intent.class), ((Integer) MethodParameterUtils.getFirstParam(objArr, Integer.class)).intValue(), (String) MethodParameterUtils.getFirstParam(objArr, String.class), BActivityThread.getUserId());
            Objects.toString(queryBroadcastReceivers);
            return BuildCompat.isN() ? ParceledListSliceCompat.create(queryBroadcastReceivers) : queryBroadcastReceivers;
        }
    }

    @ProxyMethod("queryContentProviders")
    /* loaded from: classes.dex */
    public static class QueryContentProviders extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BlackBoxCore.getBPackageManager().queryContentProviders(BlackBoxCore.getAppProcessName(), BlackBoxCore.getBUid(), MethodParameterUtils.toInt(objArr[2]), BlackBoxCore.getUserId()));
        }
    }

    @ProxyMethod("queryIntentActivities")
    /* loaded from: classes.dex */
    public static class QueryIntentActivities extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String scheme;
            Intent intent = (Intent) objArr[0];
            if ("com.miniclip.eightballpool".equals(BActivityThread.getAppPackageName()) && intent != null) {
                ComponentName component = intent.getComponent();
                String packageName = component != null ? component.getPackageName() : intent.getPackage();
                if (packageName != null && (packageName.equals("com.facebook.katana") || packageName.equals("com.facebook.wakizashi") || packageName.equals("com.facebook.orca"))) {
                    return BuildCompat.isN() ? ParceledListSliceCompat.create(new ArrayList()) : new ArrayList();
                }
                Uri data = intent.getData();
                if (data != null && (scheme = data.getScheme()) != null && scheme.equals("fb165073083517174")) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    ActivityInfo activityInfo = new ActivityInfo();
                    resolveInfo.activityInfo = activityInfo;
                    activityInfo.name = "com.facebook.CustomTabActivity";
                    activityInfo.packageName = "com.miniclip.eightballpool";
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(resolveInfo);
                    return BuildCompat.isN() ? ParceledListSliceCompat.create(arrayList) : arrayList;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("requestPermissions")
    /* loaded from: classes.dex */
    public static class RequestPermissions extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String[] strArr = (String[]) objArr[0];
            String str = (String) objArr[1];
            if (strArr != null) {
                Arrays.toString(strArr);
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("resolveContentProvider")
    /* loaded from: classes.dex */
    public static class ResolveContentProvider extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            int i = MethodParameterUtils.toInt(objArr[1]);
            if ("com.miniclip.eightballpool".equals(BActivityThread.getAppPackageName()) && str != null && (str.startsWith("com.facebook.katana.provider.") || str.startsWith("com.facebook.wakizashi.provider.") || str.startsWith("com.facebook.orca.provider."))) {
                return null;
            }
            ProviderInfo resolveContentProvider = BlackBoxCore.getBPackageManager().resolveContentProvider(str, i, BActivityThread.getUserId());
            return resolveContentProvider == null ? method.invoke(obj, objArr) : resolveContentProvider;
        }
    }

    @ProxyMethod("resolveIntent")
    /* loaded from: classes.dex */
    public static class ResolveIntent extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Intent intent = (Intent) objArr[0];
            String str = (String) objArr[1];
            int i = MethodParameterUtils.toInt(objArr[2]);
            if ("com.miniclip.eightballpool".equals(BActivityThread.getAppPackageName())) {
                ComponentName component = intent.getComponent();
                String packageName = component != null ? component.getPackageName() : intent.getPackage();
                if (packageName != null && (packageName.equals("com.facebook.katana") || packageName.equals("com.facebook.wakizashi"))) {
                    return null;
                }
            }
            ResolveInfo resolveIntent = BlackBoxCore.getBPackageManager().resolveIntent(intent, str, i, BlackBoxCore.getUserId());
            return resolveIntent != null ? resolveIntent : method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("resolveService")
    /* loaded from: classes.dex */
    public static class ResolveService extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Intent intent = (Intent) objArr[0];
            String str = (String) objArr[1];
            int i = MethodParameterUtils.toInt(objArr[2]);
            if ("com.miniclip.eightballpool".equals(BActivityThread.getAppPackageName())) {
                ComponentName component = intent.getComponent();
                String packageName = component != null ? component.getPackageName() : intent.getPackage();
                if (packageName != null && (packageName.equals("com.facebook.katana") || packageName.equals("com.facebook.wakizashi"))) {
                    return null;
                }
            }
            ResolveInfo resolveService = BlackBoxCore.getBPackageManager().resolveService(intent, i, str, BlackBoxCore.getUserId());
            return resolveService != null ? resolveService : method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setComponentEnabledSetting")
    /* loaded from: classes.dex */
    public static class SetComponentEnabledSetting extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("setSplashScreenTheme")
    /* loaded from: classes.dex */
    public static class SetSplashScreenTheme extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr.length > 0) {
                String str = (String) objArr[0];
            }
            if (!BuildCompat.isMIUI() && !Build.MANUFACTURER.toLowerCase().contains("xiaomi") && !Build.BRAND.toLowerCase().contains("xiaomi") && !Build.DISPLAY.toLowerCase().contains("hyperos")) {
                try {
                    return method.invoke(obj, objArr);
                } catch (SecurityException e) {
                    e.getMessage();
                } catch (Exception e2) {
                    if (e2.getCause() instanceof SecurityException) {
                        e2.getCause().getMessage();
                        return null;
                    }
                    throw e2;
                }
            }
            return null;
        }
    }

    @ProxyMethod("shouldShowRequestPermissionRationale")
    /* loaded from: classes.dex */
    public static class ShouldShowRequestPermissionRationale extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            if (!IPackageManagerProxy.isAudioPermission(str) && !IPackageManagerProxy.isStorageOrMediaPermission(str) && !IPackageManagerProxy.isNotificationOrXiaomiPermission(str)) {
                return method.invoke(obj, objArr);
            }
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("checkPermission")
    /* loaded from: classes.dex */
    public static class SimpleAudioPermissionHook extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            if (IPackageManagerProxy.isAudioPermission(str) || IPackageManagerProxy.isStorageOrMediaPermission(str) || IPackageManagerProxy.isNotificationOrXiaomiPermission(str) || IPackageManagerProxy.isNetworkPermission(str)) {
                return 0;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class XiaomiSecurityBypass extends MethodHook {
        private static final String[] XIAOMI_SECURITY_METHODS = {"setApplicationEnabledSetting", "setComponentEnabledSetting", "setInstallLocation", "setInstallerPackageName", "setPackageStoppedState", "setSystemAppState", "setApplicationCategoryHint", "setApplicationHiddenSettingAsUser", "setBlockUninstallForUser", "setDefaultBrowserPackageNameAsUser", "setDistractingPackageRestrictionsAsUser", "setPackagesSuspendedAsUser", "setUpdateAvailable", "setRequiredForSystemUser", "setSystemAppHiddenUntilInstalled", "setHarmfulAppWarningEnabled", "setKeepUninstalledPackages", "verifyIntentFilter", "verifyPendingInstall", "extendVerificationTimeout", "setDefaultHomeActivity", "resetApplicationPreferences", "clearApplicationProfileData", "clearApplicationUserData", "deleteApplicationCacheFiles", "deleteApplicationCacheFilesAsUser", "freeStorageAndNotify", "freeStorage", "movePackage", "movePackageToSd", "movePrimaryStorage"};

        @Override // com.app.framework.fake.hook.MethodHook
        public String getMethodName() {
            return null;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            for (String str : XIAOMI_SECURITY_METHODS) {
                if (str.equals(name)) {
                    if (method.getReturnType() == Void.TYPE) {
                        return null;
                    }
                    return method.getReturnType() == Boolean.TYPE ? Boolean.TRUE : method.getReturnType() == Integer.TYPE ? 0 : null;
                }
            }
            try {
                return method.invoke(obj, objArr);
            } catch (SecurityException e) {
                e.getMessage();
                return method.getReturnType() == Boolean.TYPE ? Boolean.FALSE : method.getReturnType() == Integer.TYPE ? -1 : null;
            } catch (Exception e2) {
                if (e2.getCause() instanceof SecurityException) {
                    e2.getCause().getMessage();
                    return method.getReturnType() == Boolean.TYPE ? Boolean.FALSE : method.getReturnType() == Integer.TYPE ? -1 : null;
                }
                throw e2;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public boolean isEnable() {
            return BuildCompat.isMIUI() || Build.MANUFACTURER.toLowerCase().contains("xiaomi") || Build.BRAND.toLowerCase().contains("xiaomi") || Build.DISPLAY.toLowerCase().contains("hyperos");
        }
    }

    @ProxyMethod("getComponentEnabledSetting")
    /* loaded from: classes.dex */
    public static class getComponentEnabledSetting extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            if (BlackBoxCore.getBPackageManager().getApplicationInfo(componentName.getPackageName(), 0, BActivityThread.getUserId()) != null) {
                return 0;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            throw new IllegalArgumentException();
        }
    }

    public IPackageManagerProxy() {
        super(((InterfaceC1597oo0oOOo0) C0217o00o0oO0.create(InterfaceC1597oo0oOOo0.class, null, false)).sPackageManager().asBinder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAudioPermission(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("android.permission.RECORD_AUDIO") || str.equals("android.permission.CAPTURE_AUDIO_OUTPUT") || str.equals("android.permission.MODIFY_AUDIO_SETTINGS") || str.equals("android.permission.FOREGROUND_SERVICE_MICROPHONE") || str.equals("android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION") || str.equals("android.permission.FOREGROUND_SERVICE_CAMERA") || str.equals("android.permission.FOREGROUND_SERVICE_LOCATION") || str.equals("android.permission.FOREGROUND_SERVICE_HEALTH") || str.equals("android.permission.FOREGROUND_SERVICE_DATA_SYNC") || str.equals("android.permission.FOREGROUND_SERVICE_SPECIAL_USE") || str.equals("android.permission.FOREGROUND_SERVICE_SYSTEM_EXEMPTED") || str.equals("android.permission.FOREGROUND_SERVICE_PHONE_CALL") || str.equals("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNetworkPermission(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("android.permission.INTERNET") || str.equals("android.permission.ACCESS_NETWORK_STATE") || str.equals("android.permission.ACCESS_WIFI_STATE") || str.equals("android.permission.CHANGE_NETWORK_STATE") || str.equals("android.permission.CHANGE_WIFI_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNotificationOrXiaomiPermission(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("android.permission.POST_NOTIFICATIONS") || str.equals("miui.permission.USE_INTERNAL_GENERAL_API") || str.equals("miui.permission.OPTIMIZE_POWER") || str.equals("miui.permission.RUN_IN_BACKGROUND") || str.equals("miui.permission.POST_NOTIFICATIONS") || str.equals("miui.permission.AUTO_START") || str.equals("miui.permission.BACKGROUND_POPUP_WINDOW") || str.equals("miui.permission.SHOW_WHEN_LOCKED") || str.equals("miui.permission.TURN_SCREEN_ON");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isStorageOrMediaPermission(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("android.permission.READ_EXTERNAL_STORAGE") || str.equals("android.permission.WRITE_EXTERNAL_STORAGE") || str.equals("android.permission.READ_MEDIA_AUDIO") || str.equals("android.permission.READ_MEDIA_VIDEO") || str.equals("android.permission.READ_MEDIA_IMAGES") || str.equals("android.permission.READ_MEDIA_VISUAL") || str.equals("android.permission.READ_MEDIA_AURAL") || str.equals("android.permission.ACCESS_MEDIA_LOCATION") || str.equals("android.permission.READ_MEDIA_AUDIO_USER_SELECTED") || str.equals("android.permission.READ_MEDIA_VIDEO_USER_SELECTED") || str.equals("android.permission.READ_MEDIA_IMAGES_USER_SELECTED") || str.equals("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") || str.equals("android.permission.READ_MEDIA_AURAL_USER_SELECTED");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1597oo0oOOo0) C0217o00o0oO0.create(InterfaceC1597oo0oOOo0.class, null, false)).sPackageManager();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        ((InterfaceC1597oo0oOOo0) C0217o00o0oO0.create(InterfaceC1597oo0oOOo0.class, null, false))._set_sPackageManager(obj2);
        replaceSystemService("package");
        Object systemContext = ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).getSystemContext();
        ((InterfaceC1680ooO0O0O) C0217o00o0oO0.create(InterfaceC1680ooO0O0O.class, systemContext, false)).getPackageManager();
        PackageManager mPackageManager = ((InterfaceC1680ooO0O0O) C0217o00o0oO0.create(InterfaceC1680ooO0O0O.class, systemContext, false)).mPackageManager();
        if (mPackageManager != null) {
            ((InterfaceC1941oooO00) C0217o00o0oO0.create(InterfaceC1941oooO00.class, null, false)).disableApplicationInfoCache();
            try {
                Reflector.on("android.app.ApplicationPackageManager").field("mPM").set(mPackageManager, obj2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.BinderInvocationStub, com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new ValueMethodProxy("addOnPermissionsChangeListener", 0));
        addMethodHook(new ValueMethodProxy("removeOnPermissionsChangeListener", 0));
        addMethodHook(new SimpleAudioPermissionHook());
        addMethodHook(new CheckSelfPermission());
        addMethodHook(new ShouldShowRequestPermissionRationale());
        addMethodHook(new RequestPermissions());
        addMethodHook(new DisableIconLoading());
        addMethodHook(new SetSplashScreenTheme());
        addMethodHook(new XiaomiSecurityBypass());
        addMethodHook(new QueryIntentActivities());
    }
}


