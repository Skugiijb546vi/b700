package com.app.framework.core.system.pm;
/* loaded from: classes.dex */
public interface PackageMonitor {
    void onPackageInstalled(String str, int i);

    void onPackageUninstalled(String str, boolean z, int i);
}


