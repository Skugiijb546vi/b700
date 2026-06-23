package com.app.framework.fake.frameworks;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.app.framework.core.system.ServiceManager;
import com.app.framework.core.system.user.BUserInfo;
import com.app.framework.core.system.user.IBUserManagerService;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class BUserManager extends VirtualServiceManager<IBUserManagerService> {
    private static final String TAG = "BUserManager";
    private static final BUserManager sUserManager = new BUserManager();

    public static BUserManager get() {
        return sUserManager;
    }

    public BUserInfo createUser(int i) {
        try {
            try {
                IBUserManagerService service = getService();
                if (service != null) {
                    return service.createUser(i);
                }
                return null;
            } catch (DeadObjectException unused) {
                clearServiceCache();
                Thread.sleep(100L);
                IBUserManagerService service2 = getService();
                if (service2 != null) {
                    return service2.createUser(i);
                }
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public void deleteUser(int i) {
        try {
            try {
                IBUserManagerService service = getService();
                if (service != null) {
                    service.deleteUser(i);
                }
            } catch (DeadObjectException unused) {
                clearServiceCache();
                Thread.sleep(100L);
                IBUserManagerService service2 = getService();
                if (service2 != null) {
                    service2.deleteUser(i);
                }
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.app.framework.fake.frameworks.VirtualServiceManager
    public String getServiceName() {
        return ServiceManager.USER_MANAGER;
    }

    public List<BUserInfo> getUsers() {
        try {
            try {
                IBUserManagerService service = getService();
                if (service != null) {
                    return service.getUsers();
                }
            } catch (DeadObjectException unused) {
                clearServiceCache();
                Thread.sleep(100L);
                IBUserManagerService service2 = getService();
                if (service2 != null) {
                    return service2.getUsers();
                }
            }
        } catch (Exception unused2) {
        }
        return Collections.emptyList();
    }
}



