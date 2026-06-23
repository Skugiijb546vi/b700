package com.app.framework.core.system.pm.installer;

import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.pm.BPackageSettings;
import com.app.framework.entity.pm.InstallOption;
import com.app.framework.utils.FileUtils;
/* loaded from: classes.dex */
public class CreatePackageExecutor implements Executor {
    @Override // com.app.framework.core.system.pm.installer.Executor
    public int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i) {
        FileUtils.deleteDir(BEnvironment.getAppDir(bPackageSettings.pkg.packageName));
        FileUtils.mkdirs(BEnvironment.getAppDir(bPackageSettings.pkg.packageName));
        FileUtils.mkdirs(BEnvironment.getAppLibDir(bPackageSettings.pkg.packageName));
        return 0;
    }
}
