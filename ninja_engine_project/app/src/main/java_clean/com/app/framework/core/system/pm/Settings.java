package com.app.framework.core.system.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.os.Parcel;
import android.util.ArrayMap;
import android.util.AtomicFile;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.BProcessManagerService;
import com.app.framework.core.system.user.BUserHandle;
import com.app.framework.entity.pm.InstallOption;
import com.app.framework.utils.FileUtils;
import com.app.framework.utils.compat.PackageParserCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Settings {
    public static final String TAG = "Settings";
    private final Map<String, Integer> mAppIds;
    private int mCurrUid;
    final ArrayMap<String, BPackageSettings> mPackages;
    private final Map<String, SharedUserSetting> mSharedUsers;

    public Settings() {
        ArrayMap<String, BPackageSettings> arrayMap = new ArrayMap<>();
        this.mPackages = arrayMap;
        this.mAppIds = new HashMap();
        this.mSharedUsers = SharedUserSetting.sSharedUsers;
        this.mCurrUid = 0;
        synchronized (arrayMap) {
            loadUidLP();
            SharedUserSetting.loadSharedUsers();
        }
    }

    private int acquireAndRegisterNewAppIdLPw(BPackageSettings bPackageSettings) {
        Integer num = this.mAppIds.get(bPackageSettings.pkg.packageName);
        if (num != null) {
            return num.intValue();
        }
        int i = this.mCurrUid;
        if (i >= 19999) {
            return -1;
        }
        int i2 = i + 1;
        this.mCurrUid = i2;
        this.mAppIds.put(bPackageSettings.pkg.packageName, Integer.valueOf(i2));
        return this.mCurrUid + BUserHandle.AID_APP_START;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #3 {all -> 0x003c, blocks: (B:3:0x0005, B:5:0x000f, B:8:0x0013, B:9:0x002c, B:15:0x003b, B:20:0x0042, B:21:0x0049, B:22:0x004d, B:23:0x004e, B:24:0x0053), top: B:35:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadUidLP() {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            java.io.File r2 = com.app.framework.core.env.BEnvironment.getUidConf()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            byte[] r2 = com.app.framework.utils.FileUtils.toByteArray(r2)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            if (r2 == 0) goto L3e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            if (r3 != 0) goto L13
            goto L3e
        L13:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            r0.unmarshall(r2, r1, r3)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            r0.setDataPosition(r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            r5.mCurrUid = r2     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            java.util.HashMap r2 = r0.readHashMap(r2)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.mAppIds     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r5.mAppIds     // Catch: java.lang.Throwable -> L39
            r4.clear()     // Catch: java.lang.Throwable -> L39
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r5.mAppIds     // Catch: java.lang.Throwable -> L39
            r4.putAll(r2)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            goto L54
        L39:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L42
        L3c:
            r1 = move-exception
            goto L5b
        L3e:
            r0.recycle()
            return
        L42:
            java.io.File r2 = com.app.framework.core.env.BEnvironment.getUidConf()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L49
            r2.delete()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L49
        L49:
            r5.mCurrUid = r1     // Catch: java.lang.Throwable -> L3c
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r5.mAppIds     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3c
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r5.mAppIds     // Catch: java.lang.Throwable -> L58
            r2.clear()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
        L54:
            r0.recycle()
            return
        L58:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r2     // Catch: java.lang.Throwable -> L3c
        L5b:
            r0.recycle()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.core.system.pm.Settings.loadUidLP():void");
    }

    private PackageParser.Package parserApk(String str) {
        try {
            PackageParser createParser = PackageParserCompat.createParser(new File(str));
            PackageParser.Package parsePackage = PackageParserCompat.parsePackage(createParser, new File(str), 0);
            PackageParserCompat.collectCertificates(createParser, parsePackage, 0);
            return parsePackage;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private BPackageSettings reInstallBySystem(PackageInfo packageInfo, InstallOption installOption) {
        String str = packageInfo.packageName;
        PackageParser.Package parserApk = parserApk(packageInfo.applicationInfo.sourceDir);
        if (parserApk != null) {
            parserApk.applicationInfo = BlackBoxCore.getPackageManager().getPackageInfo(parserApk.packageName, 0).applicationInfo;
            return getPackageLPw(parserApk.packageName, parserApk, installOption);
        }
        throw new RuntimeException("parser apk error.");
    }

    private void saveUidLP() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(BEnvironment.getUidConf());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Set<String> keySet = this.mPackages.keySet();
                Iterator it = new HashSet(this.mAppIds.keySet()).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!keySet.contains(str)) {
                        this.mAppIds.remove(str);
                    }
                }
                obtain.writeInt(this.mCurrUid);
                obtain.writeMap(this.mAppIds);
                fileOutputStream = atomicFile.startWrite();
                FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
            } catch (Exception e) {
                e.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    private void updatePackageLP(File file) {
        String name = file.getName();
        Parcel obtain = Parcel.obtain();
        try {
            byte[] byteArray = FileUtils.toByteArray(BEnvironment.getPackageConf(name));
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            BPackageSettings bPackageSettings = new BPackageSettings(obtain);
            bPackageSettings.pkg.mExtras = bPackageSettings;
            if (bPackageSettings.installOption.isFlag(1)) {
                PackageInfo packageInfo = BlackBoxCore.getPackageManager().getPackageInfo(name, 128);
                if (!packageInfo.applicationInfo.sourceDir.equals(bPackageSettings.pkg.baseCodePath)) {
                    BProcessManagerService.get().killAllByPackageName(bPackageSettings.pkg.packageName);
                    bPackageSettings.pkg = reInstallBySystem(packageInfo, bPackageSettings.installOption).pkg;
                }
            } else {
                BPackage bPackage = bPackageSettings.pkg;
                bPackage.applicationInfo = PackageManagerCompat.generateApplicationInfo(bPackage, 0, BPackageUserState.create(), 0);
            }
            bPackageSettings.save();
            this.mPackages.put(bPackageSettings.pkg.packageName, bPackageSettings);
        } finally {
            try {
            } finally {
            }
        }
    }

    public BPackageSettings getPackageLPw(String str, PackageParser.Package r4, InstallOption installOption) {
        BPackageSettings bPackageSettings = new BPackageSettings();
        BPackage bPackage = new BPackage(r4);
        bPackageSettings.pkg = bPackage;
        bPackage.installOption = installOption;
        bPackageSettings.installOption = installOption;
        bPackage.mExtras = bPackageSettings;
        bPackage.applicationInfo = PackageManagerCompat.generateApplicationInfo(bPackage, 0, BPackageUserState.create(), 0);
        synchronized (this.mPackages) {
            try {
                BPackageSettings bPackageSettings2 = this.mPackages.get(str);
                if (bPackageSettings2 != null) {
                    bPackageSettings.appId = bPackageSettings2.appId;
                    bPackageSettings.userState = bPackageSettings2.userState;
                } else if (!registerAppIdLPw(bPackageSettings)) {
                    throw new RuntimeException("registerAppIdLPw err.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bPackageSettings;
    }

    public boolean registerAppIdLPw(BPackageSettings bPackageSettings) {
        SharedUserSetting sharedUserSetting;
        String str = bPackageSettings.pkg.mSharedUserId;
        if (str != null) {
            sharedUserSetting = this.mSharedUsers.get(str);
            if (sharedUserSetting == null) {
                sharedUserSetting = new SharedUserSetting(str);
                sharedUserSetting.userId = acquireAndRegisterNewAppIdLPw(bPackageSettings);
                this.mSharedUsers.put(str, sharedUserSetting);
            }
        } else {
            sharedUserSetting = null;
        }
        if (sharedUserSetting != null) {
            bPackageSettings.appId = sharedUserSetting.userId;
            String str2 = bPackageSettings.pkg.packageName;
        }
        if (bPackageSettings.appId == 0) {
            bPackageSettings.appId = acquireAndRegisterNewAppIdLPw(bPackageSettings);
        }
        boolean z = bPackageSettings.appId >= 0;
        saveUidLP();
        SharedUserSetting.saveSharedUsers();
        return z;
    }

    public void removePackage(String str) {
        this.mPackages.remove(str);
    }

    public void scanPackage() {
        File[] listFiles;
        synchronized (this.mPackages) {
            try {
                File appRootDir = BEnvironment.getAppRootDir();
                FileUtils.mkdirs(appRootDir);
                for (File file : appRootDir.listFiles()) {
                    if (file.isDirectory()) {
                        scanPackage(file.getName());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void scanPackage(String str) {
        synchronized (this.mPackages) {
            updatePackageLP(BEnvironment.getAppDir(str));
        }
    }
}


