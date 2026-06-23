package com.app.framework.core.system.pm.installer;

import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.pm.BPackageSettings;
import com.app.framework.entity.pm.InstallOption;
import com.app.framework.utils.FileUtils;
/* loaded from: classes.dex */
public class RemoveUserExecutor implements Executor {
    @Override // com.app.framework.core.system.pm.installer.Executor
    public int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i) {
        String str = bPackageSettings.pkg.packageName;
        FileUtils.deleteDir(BEnvironment.getDataDir(str, i));
        FileUtils.deleteDir(BEnvironment.getDeDataDir(str, i));
        FileUtils.deleteDir(BEnvironment.getExternalDataDir(str, i));
        return 0;
    }
}
