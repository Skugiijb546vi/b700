package com.app.framework.fake.hook;

import android.os.Build;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.delegate.AppInstrumentation;
import com.app.framework.fake.service.AndroidIdProxy;
import com.app.framework.fake.service.ApkAssetsProxy;
import com.app.framework.fake.service.AudioPermissionProxy;
import com.app.framework.fake.service.AudioRecordProxy;
import com.app.framework.fake.service.AuthenticationProxy;
import com.app.framework.fake.service.ClassLoaderProxy;
import com.app.framework.fake.service.ContentResolverProxy;
import com.app.framework.fake.service.DeviceIdProxy;
import com.app.framework.fake.service.FeatureFlagUtilsProxy;
import com.app.framework.fake.service.FileSystemProxy;
import com.app.framework.fake.service.GmsProxy;
import com.app.framework.fake.service.GoogleAccountManagerProxy;
import com.app.framework.fake.service.HCallbackProxy;
import com.app.framework.fake.service.IAccessibilityManagerProxy;
import com.app.framework.fake.service.IAccountManagerProxy;
import com.app.framework.fake.service.IActivityClientProxy;
import com.app.framework.fake.service.IActivityManagerProxy;
import com.app.framework.fake.service.IActivityTaskManagerProxy;
import com.app.framework.fake.service.IAlarmManagerProxy;
import com.app.framework.fake.service.IAppOpsManagerProxy;
import com.app.framework.fake.service.IAppWidgetManagerProxy;
import com.app.framework.fake.service.IAttributionSourceProxy;
import com.app.framework.fake.service.IAudioServiceProxy;
import com.app.framework.fake.service.IAutofillManagerProxy;
import com.app.framework.fake.service.IConnectivityManagerProxy;
import com.app.framework.fake.service.IContentProviderProxy;
import com.app.framework.fake.service.IContextHubServiceProxy;
import com.app.framework.fake.service.ICredentialManagerProxy;
import com.app.framework.fake.service.IDeviceIdentifiersPolicyProxy;
import com.app.framework.fake.service.IDevicePolicyManagerProxy;
import com.app.framework.fake.service.IDisplayManagerProxy;
import com.app.framework.fake.service.IDnsResolverProxy;
import com.app.framework.fake.service.IFingerprintManagerProxy;
import com.app.framework.fake.service.IGraphicsStatsProxy;
import com.app.framework.fake.service.IJobServiceProxy;
import com.app.framework.fake.service.ILauncherAppsProxy;
import com.app.framework.fake.service.ILocationManagerProxy;
import com.app.framework.fake.service.IMediaRouterServiceProxy;
import com.app.framework.fake.service.IMediaSessionManagerProxy;
import com.app.framework.fake.service.IMiuiSecurityManagerProxy;
import com.app.framework.fake.service.INetworkManagementServiceProxy;
import com.app.framework.fake.service.INotificationManagerProxy;
import com.app.framework.fake.service.IPackageManagerProxy;
import com.app.framework.fake.service.IPermissionManagerProxy;
import com.app.framework.fake.service.IPersistentDataBlockServiceProxy;
import com.app.framework.fake.service.IPhoneSubInfoProxy;
import com.app.framework.fake.service.IPowerManagerProxy;
import com.app.framework.fake.service.ISensorPrivacyManagerProxy;
import com.app.framework.fake.service.ISettingsProviderProxy;
import com.app.framework.fake.service.ISettingsSystemProxy;
import com.app.framework.fake.service.IShortcutManagerProxy;
import com.app.framework.fake.service.IStorageManagerProxy;
import com.app.framework.fake.service.IStorageStatsManagerProxy;
import com.app.framework.fake.service.ISystemSensorManagerProxy;
import com.app.framework.fake.service.ISystemUpdateProxy;
import com.app.framework.fake.service.ITelephonyManagerProxy;
import com.app.framework.fake.service.ITelephonyRegistryProxy;
import com.app.framework.fake.service.IUserManagerProxy;
import com.app.framework.fake.service.IVibratorServiceProxy;
import com.app.framework.fake.service.IVpnManagerProxy;
import com.app.framework.fake.service.IWebViewUpdateServiceProxy;
import com.app.framework.fake.service.IWifiManagerProxy;
import com.app.framework.fake.service.IWifiScannerProxy;
import com.app.framework.fake.service.IWindowManagerProxy;
import com.app.framework.fake.service.IXiaomiAttributionSourceProxy;
import com.app.framework.fake.service.IXiaomiMiuiServicesProxy;
import com.app.framework.fake.service.IXiaomiSettingsProxy;
import com.app.framework.fake.service.LevelDbProxy;
import com.app.framework.fake.service.MediaRecorderClassProxy;
import com.app.framework.fake.service.MediaRecorderProxy;
import com.app.framework.fake.service.ReLinkerProxy;
import com.app.framework.fake.service.ResourcesManagerProxy;
import com.app.framework.fake.service.SQLiteDatabaseProxy;
import com.app.framework.fake.service.SystemLibraryProxy;
import com.app.framework.fake.service.WebViewFactoryProxy;
import com.app.framework.fake.service.WebViewProxy;
import com.app.framework.fake.service.WorkManagerProxy;
import com.app.framework.fake.service.context.ContentServiceStub;
import com.app.framework.fake.service.context.RestrictionsManagerStub;
import com.app.framework.fake.service.libcore.OsStub;
import com.app.framework.utils.compat.BuildCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class HookManager {
    public static final String TAG = "HookManager";
    private static final HookManager sHookManager = new HookManager();
    private final Map<Class<?>, IInjectHook> mInjectors = new HashMap();

    public static HookManager get() {
        return sHookManager;
    }

    private void handleHookError(IInjectHook iInjectHook, Exception exc) {
        String simpleName = iInjectHook.getClass().getSimpleName();
        exc.getMessage();
        if (simpleName.contains("ActivityManager") || simpleName.contains("PackageManager") || simpleName.contains("WebView") || simpleName.contains("ContentProvider")) {
            try {
                if (iInjectHook.isBadEnv()) {
                    iInjectHook.injectHook();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void addInjector(IInjectHook iInjectHook) {
        this.mInjectors.put(iInjectHook.getClass(), iInjectHook);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean areCriticalHooksInstalled() {
        /*
            r6 = this;
            java.lang.String r0 = "WebViewProxy"
            java.lang.String r1 = "IContentProviderProxy"
            java.lang.String r2 = "IActivityManagerProxy"
            java.lang.String r3 = "IPackageManagerProxy"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            r1 = 0
            r2 = 0
        Le:
            r3 = 4
            if (r2 >= r3) goto L37
            r3 = r0[r2]
            java.util.Map<java.lang.Class<?>, com.app.framework.fake.hook.IInjectHook> r4 = r6.mInjectors
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L1d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L36
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.String r5 = r5.getSimpleName()
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L1d
            int r2 = r2 + 1
            goto Le
        L36:
            return r1
        L37:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.hook.HookManager.areCriticalHooksInstalled():boolean");
    }

    public void checkAll() {
        for (Class<?> cls : this.mInjectors.keySet()) {
            IInjectHook iInjectHook = this.mInjectors.get(cls);
            if (iInjectHook != null && iInjectHook.isBadEnv()) {
                cls.getClass();
                iInjectHook.injectHook();
            }
        }
    }

    public void checkEnv(Class<?> cls) {
        IInjectHook iInjectHook = this.mInjectors.get(cls);
        if (iInjectHook == null || !iInjectHook.isBadEnv()) {
            return;
        }
        cls.getClass();
        iInjectHook.injectHook();
    }

    public void init() {
        if (BlackBoxCore.get().isBlackProcess() || BlackBoxCore.get().isServerProcess()) {
            addInjector(new IDisplayManagerProxy());
            addInjector(new OsStub());
            addInjector(new IActivityManagerProxy());
            addInjector(new IPackageManagerProxy());
            addInjector(new ITelephonyManagerProxy());
            addInjector(new HCallbackProxy());
            addInjector(new IAppOpsManagerProxy());
            addInjector(new INotificationManagerProxy());
            addInjector(new IAlarmManagerProxy());
            addInjector(new IAppWidgetManagerProxy());
            addInjector(new ContentServiceStub());
            addInjector(new IWindowManagerProxy());
            addInjector(new IUserManagerProxy());
            addInjector(new RestrictionsManagerStub());
            addInjector(new IMediaSessionManagerProxy());
            addInjector(new IAudioServiceProxy());
            addInjector(new ISensorPrivacyManagerProxy());
            addInjector(new ContentResolverProxy());
            addInjector(new IWebViewUpdateServiceProxy());
            addInjector(new SystemLibraryProxy());
            addInjector(new ReLinkerProxy());
            addInjector(new WebViewProxy());
            addInjector(new WebViewFactoryProxy());
            addInjector(new WorkManagerProxy());
            addInjector(new MediaRecorderProxy());
            addInjector(new AudioRecordProxy());
            addInjector(new IMiuiSecurityManagerProxy());
            addInjector(new ISettingsProviderProxy());
            addInjector(new FeatureFlagUtilsProxy());
            addInjector(new MediaRecorderClassProxy());
            addInjector(new SQLiteDatabaseProxy());
            addInjector(new ClassLoaderProxy());
            addInjector(new FileSystemProxy());
            addInjector(new GmsProxy());
            addInjector(new LevelDbProxy());
            addInjector(new DeviceIdProxy());
            addInjector(new GoogleAccountManagerProxy());
            addInjector(new AuthenticationProxy());
            addInjector(new AndroidIdProxy());
            addInjector(new AudioPermissionProxy());
            addInjector(new ILocationManagerProxy());
            addInjector(new IStorageManagerProxy());
            addInjector(new ILauncherAppsProxy());
            addInjector(new IJobServiceProxy());
            addInjector(new IAccessibilityManagerProxy());
            addInjector(new ITelephonyRegistryProxy());
            addInjector(new IDevicePolicyManagerProxy());
            addInjector(new IAccountManagerProxy());
            addInjector(new IConnectivityManagerProxy());
            addInjector(new IDnsResolverProxy());
            addInjector(new IAttributionSourceProxy());
            addInjector(new IContentProviderProxy());
            addInjector(new ISettingsSystemProxy());
            addInjector(new ISystemSensorManagerProxy());
            addInjector(new IXiaomiAttributionSourceProxy());
            addInjector(new IXiaomiSettingsProxy());
            addInjector(new IXiaomiMiuiServicesProxy());
            addInjector(new IPhoneSubInfoProxy());
            addInjector(new IMediaRouterServiceProxy());
            addInjector(new IPowerManagerProxy());
            addInjector(new IContextHubServiceProxy());
            addInjector(new IVibratorServiceProxy());
            addInjector(new IPersistentDataBlockServiceProxy());
            addInjector(AppInstrumentation.get());
            addInjector(new IWifiManagerProxy());
            addInjector(new IWifiScannerProxy());
            addInjector(new ApkAssetsProxy());
            addInjector(new ResourcesManagerProxy());
            if (Build.VERSION.SDK_INT >= 34) {
                addInjector(new ICredentialManagerProxy());
            }
            if (BuildCompat.isS()) {
                addInjector(new IActivityClientProxy(null));
                addInjector(new IVpnManagerProxy());
            }
            if (BuildCompat.isR()) {
                addInjector(new IPermissionManagerProxy());
            }
            if (BuildCompat.isQ()) {
                addInjector(new IActivityTaskManagerProxy());
            }
            if (BuildCompat.isPie()) {
                addInjector(new ISystemUpdateProxy());
            }
            if (BuildCompat.isOreo()) {
                addInjector(new IAutofillManagerProxy());
                addInjector(new IDeviceIdentifiersPolicyProxy());
                addInjector(new IStorageStatsManagerProxy());
            }
            if (BuildCompat.isN_MR1()) {
                addInjector(new IShortcutManagerProxy());
            }
            if (BuildCompat.isN()) {
                addInjector(new INetworkManagementServiceProxy());
            }
            if (BuildCompat.isM()) {
                addInjector(new IFingerprintManagerProxy());
                addInjector(new IGraphicsStatsProxy());
            }
            if (BuildCompat.isL()) {
                addInjector(new IJobServiceProxy());
            }
        }
        injectAll();
    }

    public void injectAll() {
        for (IInjectHook iInjectHook : this.mInjectors.values()) {
            try {
                Objects.toString(iInjectHook);
                iInjectHook.injectHook();
            } catch (Exception e) {
                Objects.toString(iInjectHook);
                handleHookError(iInjectHook, e);
            }
        }
    }

    public void reinitializeHooks() {
        this.mInjectors.clear();
        init();
    }
}


