package com.app.framework.core.system.pm.installer;

import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.JarConfig;
import com.app.framework.core.system.pm.BPackageSettings;
import com.app.framework.entity.pm.InstallOption;
import com.app.framework.utils.FileUtils;
import com.app.framework.utils.NativeUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class CopyExecutor implements Executor {
    private static final String TAG = "CopyExecutor";

    private void copyFile(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[JarConfig.DEFAULT_BUFFER_SIZE];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.app.framework.core.system.pm.installer.Executor
    public int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i) {
        File appLibDir = BEnvironment.getAppLibDir(bPackageSettings.pkg.packageName);
        try {
            if (!installOption.isFlag(1)) {
                NativeUtils.copyNativeLib(new File(bPackageSettings.pkg.baseCodePath), appLibDir);
            }
            if (!installOption.isFlag(2)) {
                installOption.isFlag(1);
                return 0;
            }
            File file = new File(bPackageSettings.pkg.baseCodePath);
            File baseApkDir = BEnvironment.getBaseApkDir(bPackageSettings.pkg.packageName);
            try {
                if (installOption.isFlag(8)) {
                    if (!FileUtils.renameTo(file, baseApkDir)) {
                    }
                    baseApkDir.setReadOnly();
                    bPackageSettings.pkg.baseCodePath = baseApkDir.getAbsolutePath();
                    return 0;
                }
                FileUtils.copyFile(file, baseApkDir);
                baseApkDir.setReadOnly();
                bPackageSettings.pkg.baseCodePath = baseApkDir.getAbsolutePath();
                return 0;
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }
}


