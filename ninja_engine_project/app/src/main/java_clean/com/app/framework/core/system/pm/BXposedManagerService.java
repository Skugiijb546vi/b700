package com.app.framework.core.system.pm;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.ISystemService;
import com.app.framework.core.system.pm.IBXposedManagerService;
import com.app.framework.entity.pm.InstalledModule;
import com.app.framework.entity.pm.XposedConfig;
import com.app.framework.utils.CloseUtils;
import com.app.framework.utils.FileUtils;
import com.app.framework.utils.compat.XposedParserCompat;
import com.ninja.engine.C0131o00O0o;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class BXposedManagerService extends IBXposedManagerService.Stub implements ISystemService, PackageMonitor {
    private static final BXposedManagerService sService = new BXposedManagerService();
    private BPackageManagerService mPms;
    private XposedConfig mXposedConfig;
    private final Object mLock = new Object();
    private final Map<String, InstalledModule> mCacheModule = new HashMap();

    public static BXposedManagerService get() {
        return sService;
    }

    private void loadModuleStateLr() {
        File xPModuleConf = BEnvironment.getXPModuleConf();
        if (!xPModuleConf.exists()) {
            this.mXposedConfig = new XposedConfig();
            saveModuleStateLw();
            return;
        }
        Parcel parcel = null;
        try {
            try {
                parcel = FileUtils.readToParcel(xPModuleConf);
                this.mXposedConfig = new XposedConfig(parcel);
                if (parcel == null) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (parcel == null) {
                    return;
                }
            }
            parcel.recycle();
        } catch (Throwable th) {
            if (parcel != null) {
                parcel.recycle();
            }
            throw th;
        }
    }

    private void saveModuleStateLw() {
        Parcel obtain = Parcel.obtain();
        C0131o00O0o c0131o00O0o = new C0131o00O0o(BEnvironment.getXPModuleConf(), 2);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                this.mXposedConfig.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                fileOutputStream = c0131o00O0o.Oooo0oO();
                FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                c0131o00O0o.OooOOoo(fileOutputStream);
                obtain.recycle();
                CloseUtils.close(fileOutputStream);
            } catch (Exception unused) {
                c0131o00O0o.OooOOo0(fileOutputStream);
                obtain.recycle();
                CloseUtils.close(fileOutputStream);
            }
        } catch (Throwable th) {
            obtain.recycle();
            CloseUtils.close(fileOutputStream);
            throw th;
        }
    }

    @Override // com.app.framework.core.system.pm.IBXposedManagerService
    public List<InstalledModule> getInstalledModules() {
        ArrayList arrayList;
        InstalledModule parseModule;
        List<ApplicationInfo> installedApplications = this.mPms.getInstalledApplications(128, -4);
        synchronized (this.mCacheModule) {
            try {
                for (ApplicationInfo applicationInfo : installedApplications) {
                    if (!this.mCacheModule.containsKey(applicationInfo.packageName) && (parseModule = XposedParserCompat.parseModule(applicationInfo)) != null) {
                        this.mCacheModule.put(applicationInfo.packageName, parseModule);
                    }
                }
                arrayList = new ArrayList(this.mCacheModule.values());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InstalledModule installedModule = (InstalledModule) it.next();
                    installedModule.enable = isModuleEnable(installedModule.packageName);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.app.framework.core.system.pm.IBXposedManagerService
    public boolean isModuleEnable(String str) {
        boolean z;
        synchronized (this.mLock) {
            try {
                Boolean bool = this.mXposedConfig.moduleState.get(str);
                z = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z;
    }

    @Override // com.app.framework.core.system.pm.IBXposedManagerService
    public boolean isXPEnable() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mXposedConfig.enable;
        }
        return z;
    }

    @Override // com.app.framework.core.system.pm.PackageMonitor
    public void onPackageInstalled(String str, int i) {
        if (i == -4 || i == -1) {
            synchronized (this.mCacheModule) {
                this.mCacheModule.remove(str);
            }
            synchronized (this.mLock) {
                this.mXposedConfig.moduleState.put(str, Boolean.FALSE);
                saveModuleStateLw();
            }
        }
    }

    @Override // com.app.framework.core.system.pm.PackageMonitor
    public void onPackageUninstalled(String str, boolean z, int i) {
        if (i == -4 || i == -1) {
            synchronized (this.mCacheModule) {
                this.mCacheModule.remove(str);
            }
            synchronized (this.mLock) {
                this.mXposedConfig.moduleState.remove(str);
                saveModuleStateLw();
            }
        }
    }

    @Override // com.app.framework.core.system.pm.IBXposedManagerService
    public void setModuleEnable(String str, boolean z) {
        synchronized (this.mLock) {
            try {
                if (this.mPms.isInstalled(str, -4)) {
                    this.mXposedConfig.moduleState.put(str, Boolean.valueOf(z));
                    saveModuleStateLw();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.app.framework.core.system.pm.IBXposedManagerService
    public void setXPEnable(boolean z) {
        synchronized (this.mLock) {
            this.mXposedConfig.enable = z;
            saveModuleStateLw();
        }
    }

    @Override // com.app.framework.core.system.ISystemService
    public void systemReady() {
        loadModuleStateLr();
        BPackageManagerService bPackageManagerService = BPackageManagerService.get();
        this.mPms = bPackageManagerService;
        bPackageManagerService.addPackageMonitor(this);
    }
}


