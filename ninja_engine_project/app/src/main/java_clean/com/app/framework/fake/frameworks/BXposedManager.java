package com.app.framework.fake.frameworks;

import android.os.RemoteException;
import com.app.framework.core.system.ServiceManager;
import com.app.framework.core.system.pm.IBXposedManagerService;
import com.app.framework.entity.pm.InstalledModule;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class BXposedManager extends VirtualServiceManager<IBXposedManagerService> {
    private static final BXposedManager sXposedManager = new BXposedManager();

    public static BXposedManager get() {
        return sXposedManager;
    }

    public List<InstalledModule> getInstalledModules() {
        try {
            return getService().getInstalledModules();
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    @Override // com.app.framework.fake.frameworks.VirtualServiceManager
    public String getServiceName() {
        return ServiceManager.XPOSED_MANAGER;
    }

    public boolean isModuleEnable(String str) {
        try {
            return getService().isModuleEnable(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isXPEnable() {
        try {
            return getService().isXPEnable();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setModuleEnable(String str, boolean z) {
        try {
            getService().setModuleEnable(str, z);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setXPEnable(boolean z) {
        try {
            getService().setXPEnable(z);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}


