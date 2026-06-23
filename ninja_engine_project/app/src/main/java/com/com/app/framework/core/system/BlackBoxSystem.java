package com.app.framework.core.system;

import android.content.pm.PackageManager;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.env.AppSystemEnv;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.accounts.BAccountManagerService;
import com.app.framework.core.system.am.BActivityManagerService;
import com.app.framework.core.system.am.BJobManagerService;
import com.app.framework.core.system.location.BLocationManagerService;
import com.app.framework.core.system.notification.BNotificationManagerService;
import com.app.framework.core.system.os.BStorageManagerService;
import com.app.framework.core.system.pm.BPackageInstallerService;
import com.app.framework.core.system.pm.BPackageManagerService;
import com.app.framework.core.system.pm.BXposedManagerService;
import com.app.framework.core.system.user.BUserManagerService;
import com.app.framework.entity.pm.InstallOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class BlackBoxSystem {
    private static final AtomicBoolean isStartup = new AtomicBoolean(false);
    private static BlackBoxSystem sBlackBoxSystem;
    private final List<ISystemService> mServices = new ArrayList();

    public static BlackBoxSystem getSystem() {
        if (sBlackBoxSystem == null) {
            synchronized (BlackBoxSystem.class) {
                try {
                    if (sBlackBoxSystem == null) {
                        sBlackBoxSystem = new BlackBoxSystem();
                    }
                } finally {
                }
            }
        }
        return sBlackBoxSystem;
    }

    public void startup() {
        if (isStartup.getAndSet(true)) {
            return;
        }
        BEnvironment.load();
        this.mServices.add(BPackageManagerService.get());
        this.mServices.add(BUserManagerService.get());
        this.mServices.add(BActivityManagerService.get());
        this.mServices.add(BJobManagerService.get());
        this.mServices.add(BStorageManagerService.get());
        this.mServices.add(BPackageInstallerService.get());
        this.mServices.add(BXposedManagerService.get());
        this.mServices.add(BProcessManagerService.get());
        this.mServices.add(BAccountManagerService.get());
        this.mServices.add(BLocationManagerService.get());
        this.mServices.add(BNotificationManagerService.get());
        for (ISystemService iSystemService : this.mServices) {
            iSystemService.systemReady();
        }
        for (String str : AppSystemEnv.getPreInstallPackages()) {
            try {
                if (!BPackageManagerService.get().isInstalled(str, -1)) {
                    BPackageManagerService.get().installPackageAsUser(BlackBoxCore.getPackageManager().getPackageInfo(str, 0).applicationInfo.sourceDir, InstallOption.installBySystem(), -1);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JarManager.getInstance().initializeAsync();
    }
}
