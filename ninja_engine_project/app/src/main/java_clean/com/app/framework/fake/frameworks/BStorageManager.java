package com.app.framework.fake.frameworks;

import android.net.Uri;
import android.os.RemoteException;
import android.os.storage.StorageVolume;
import com.app.framework.core.system.ServiceManager;
import com.app.framework.core.system.os.IBStorageManagerService;
/* loaded from: classes.dex */
public class BStorageManager extends VirtualServiceManager<IBStorageManagerService> {
    private static final BStorageManager sStorageManager = new BStorageManager();

    public static BStorageManager get() {
        return sStorageManager;
    }

    @Override // com.app.framework.fake.frameworks.VirtualServiceManager
    public String getServiceName() {
        return ServiceManager.STORAGE_MANAGER;
    }

    public Uri getUriForFile(String str) {
        try {
            return getService().getUriForFile(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public StorageVolume[] getVolumeList(int i, String str, int i2, int i3) {
        try {
            return getService().getVolumeList(i, str, i2, i3);
        } catch (RemoteException e) {
            e.printStackTrace();
            return new StorageVolume[0];
        }
    }
}


