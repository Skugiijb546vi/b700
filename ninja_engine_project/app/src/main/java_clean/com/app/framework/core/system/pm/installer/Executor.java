package com.app.framework.core.system.pm.installer;

import com.app.framework.core.system.pm.BPackageSettings;
import com.app.framework.entity.pm.InstallOption;
/* loaded from: classes.dex */
public interface Executor {
    public static final String TAG = "InstallExecutor";

    int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i);
}


