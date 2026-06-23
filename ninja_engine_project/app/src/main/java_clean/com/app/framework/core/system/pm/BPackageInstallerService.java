package com.app.framework.core.system.pm;

import com.app.framework.core.system.ISystemService;
import com.app.framework.core.system.pm.IBPackageInstallerService;
import com.app.framework.core.system.pm.installer.CopyExecutor;
import com.app.framework.core.system.pm.installer.CreatePackageExecutor;
import com.app.framework.core.system.pm.installer.CreateUserExecutor;
import com.app.framework.core.system.pm.installer.Executor;
import com.app.framework.core.system.pm.installer.RemoveAppExecutor;
import com.app.framework.core.system.pm.installer.RemoveUserExecutor;
import com.app.framework.entity.pm.InstallOption;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class BPackageInstallerService extends IBPackageInstallerService.Stub implements ISystemService {
    public static final String TAG = "BPackageInstallerService";
    private static final BPackageInstallerService sService = new BPackageInstallerService();

    public static BPackageInstallerService get() {
        return sService;
    }

    @Override // com.app.framework.core.system.pm.IBPackageInstallerService
    public int clearPackage(BPackageSettings bPackageSettings, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RemoveUserExecutor());
        arrayList.add(new CreateUserExecutor());
        InstallOption installOption = bPackageSettings.installOption;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int exec = ((Executor) it.next()).exec(bPackageSettings, installOption, i);
            if (exec != 0) {
                return exec;
            }
        }
        return 0;
    }

    @Override // com.app.framework.core.system.pm.IBPackageInstallerService
    public int installPackageAsUser(BPackageSettings bPackageSettings, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CreateUserExecutor());
        arrayList.add(new CreatePackageExecutor());
        arrayList.add(new CopyExecutor());
        InstallOption installOption = bPackageSettings.installOption;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int exec = ((Executor) it.next()).exec(bPackageSettings, installOption, i);
            if (exec != 0) {
                return exec;
            }
        }
        return 0;
    }

    @Override // com.app.framework.core.system.ISystemService
    public void systemReady() {
    }

    @Override // com.app.framework.core.system.pm.IBPackageInstallerService
    public int uninstallPackageAsUser(BPackageSettings bPackageSettings, boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new RemoveAppExecutor());
        }
        arrayList.add(new RemoveUserExecutor());
        InstallOption installOption = bPackageSettings.installOption;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int exec = ((Executor) it.next()).exec(bPackageSettings, installOption, i);
            if (exec != 0) {
                return exec;
            }
        }
        return 0;
    }

    @Override // com.app.framework.core.system.pm.IBPackageInstallerService
    public int updatePackage(BPackageSettings bPackageSettings) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CreatePackageExecutor());
        arrayList.add(new CopyExecutor());
        InstallOption installOption = bPackageSettings.installOption;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int exec = ((Executor) it.next()).exec(bPackageSettings, installOption, -1);
            if (exec != 0) {
                return exec;
            }
        }
        return 0;
    }
}


