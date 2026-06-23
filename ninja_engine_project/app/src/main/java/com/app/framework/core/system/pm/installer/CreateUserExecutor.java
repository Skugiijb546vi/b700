package com.app.framework.core.system.pm.installer;

import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.pm.BPackageSettings;
import com.app.framework.entity.pm.InstallOption;
import com.app.framework.utils.FileUtils;
/* loaded from: classes.dex */
public class CreateUserExecutor implements Executor {
    @Override // com.app.framework.core.system.pm.installer.Executor
    public int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i) {
        String str = bPackageSettings.pkg.packageName;
        FileUtils.deleteDir(BEnvironment.getDataLibDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDataDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDataCacheDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDataFilesDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDataDatabasesDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDeDataDir(str, i));
        return 0;
    }
}
