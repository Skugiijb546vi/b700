package com.app.framework.core.system.os;

import android.net.Uri;
import android.os.Process;
import android.os.storage.StorageVolume;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.ISystemService;
import com.app.framework.core.system.os.IBStorageManagerService;
import com.app.framework.core.system.user.BUserHandle;
import com.app.framework.fake.provider.FileProvider;
import com.app.framework.proxy.ProxyManifest;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1677ooO0O00;
import com.ninja.engine.InterfaceC1761ooOO0OoO;
import java.io.File;
/* loaded from: classes.dex */
public class BStorageManagerService extends IBStorageManagerService.Stub implements ISystemService {
    private static final BStorageManagerService sService = new BStorageManagerService();

    public static BStorageManagerService get() {
        return sService;
    }

    @Override // com.app.framework.core.system.os.IBStorageManagerService
    public Uri getUriForFile(String str) {
        return FileProvider.getUriForFile(BlackBoxCore.getContext(), ProxyManifest.getProxyFileProvider(), new File(str));
    }

    @Override // com.app.framework.core.system.os.IBStorageManagerService
    public StorageVolume[] getVolumeList(int i, String str, int i2, int i3) {
        if (((InterfaceC1677ooO0O00) C0217o00o0oO0.create(InterfaceC1677ooO0O00.class, null, false)).getVolumeList(0, 0) == null) {
            return null;
        }
        try {
            StorageVolume[] volumeList = ((InterfaceC1677ooO0O00) C0217o00o0oO0.create(InterfaceC1677ooO0O00.class, null, false)).getVolumeList(BUserHandle.getUserId(Process.myUid()), 0);
            if (volumeList == null) {
                return null;
            }
            for (StorageVolume storageVolume : volumeList) {
                ((InterfaceC1761ooOO0OoO) C0217o00o0oO0.create(InterfaceC1761ooOO0OoO.class, storageVolume, false))._set_mPath(BEnvironment.getExternalUserDir(i3));
                if (BuildCompat.isPie()) {
                    ((InterfaceC1761ooOO0OoO) C0217o00o0oO0.create(InterfaceC1761ooOO0OoO.class, storageVolume, false))._set_mInternalPath(BEnvironment.getExternalUserDir(i3));
                }
            }
            return volumeList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.app.framework.core.system.ISystemService
    public void systemReady() {
    }
}
