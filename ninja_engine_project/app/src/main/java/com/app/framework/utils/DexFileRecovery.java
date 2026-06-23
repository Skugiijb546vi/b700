package com.app.framework.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.JarConfig;
import com.app.framework.utils.DexFileRecovery;
import com.ninja.engine.C0382o0OOo0o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
public class DexFileRecovery {
    private static final int MAX_RECOVERY_ATTEMPTS = 3;
    private static final String TAG = "DexFileRecovery";
    private static final Map<String, RecoveryResult> sRecoveryCache = new HashMap();
    private static final List<RecoveryStrategy> sRecoveryStrategies = new ArrayList();

    /* loaded from: classes.dex */
    public static class AlternativeApkStrategy implements RecoveryStrategy {
        private AlternativeApkStrategy() {
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public RecoveryResult attemptRecovery(String str) {
            File[] listFiles;
            try {
                File parentFile = new File(str).getParentFile();
                if (parentFile != null && parentFile.exists() && (listFiles = parentFile.listFiles()) != null) {
                    for (File file : listFiles) {
                        if (file.getName().endsWith(".apk") && file.length() > 1000000 && !file.getAbsolutePath().equals(str) && DexFileRecovery.isValidApkFile(file)) {
                            file.getAbsolutePath();
                            return new RecoveryResult(file.getAbsolutePath(), getName());
                        }
                    }
                }
                return new RecoveryResult("No valid alternative APK files found");
            } catch (Exception e) {
                return new RecoveryResult("Error in alternative APK strategy: " + e.getMessage());
            }
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public String getName() {
            return "Alternative APK";
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public int getPriority() {
            return 100;
        }

        public /* synthetic */ AlternativeApkStrategy(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class BackupRestoreStrategy implements RecoveryStrategy {
        private BackupRestoreStrategy() {
        }

        private String findBackupFile(String str) {
            File[] listFiles;
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                final String replaceFirst = file.getName().replaceFirst("[.][^.]+$", "");
                if (parentFile == null || !parentFile.exists() || (listFiles = parentFile.listFiles(new FilenameFilter() { // from class: com.app.framework.utils.OooO00o
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str2) {
                        boolean lambda$findBackupFile$0;
                        lambda$findBackupFile$0 = DexFileRecovery.BackupRestoreStrategy.lambda$findBackupFile$0(replaceFirst, file2, str2);
                        return lambda$findBackupFile$0;
                    }
                })) == null || listFiles.length <= 0) {
                    return null;
                }
                File file2 = listFiles[0];
                for (File file3 : listFiles) {
                    if (file3.lastModified() > file2.lastModified()) {
                        file2 = file3;
                    }
                }
                return file2.getAbsolutePath();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public static /* synthetic */ boolean lambda$findBackupFile$0(String str, File file, String str2) {
            return str2.startsWith(str) && (str2.endsWith(".bak") || str2.endsWith(".backup") || str2.endsWith(".old"));
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public RecoveryResult attemptRecovery(String str) {
            try {
                String findBackupFile = findBackupFile(str);
                return (findBackupFile == null || !DexFileRecovery.isValidApkFile(new File(findBackupFile))) ? new RecoveryResult("No valid backup files found") : new RecoveryResult(findBackupFile, getName());
            } catch (Exception e) {
                return new RecoveryResult("Error in backup restore strategy: " + e.getMessage());
            }
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public String getName() {
            return "Backup Restore";
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public int getPriority() {
            return 20;
        }

        public /* synthetic */ BackupRestoreStrategy(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class DexExtractionStrategy implements RecoveryStrategy {
        private DexExtractionStrategy() {
        }

        private String extractDexFromApk(File file) {
            try {
                ZipFile zipFile = new ZipFile(file);
                ZipEntry entry = zipFile.getEntry("classes.dex");
                if (entry == null) {
                    zipFile.close();
                    return null;
                }
                File file2 = new File(BlackBoxCore.getContext().getCacheDir(), "dex_recovery");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                File file3 = new File(file2, "classes_" + System.currentTimeMillis() + ".dex");
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    byte[] bArr = new byte[JarConfig.DEFAULT_BUFFER_SIZE];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            fileOutputStream.close();
                            inputStream.close();
                            file3.getAbsolutePath();
                            String absolutePath = file3.getAbsolutePath();
                            zipFile.close();
                            return absolutePath;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public RecoveryResult attemptRecovery(String str) {
            try {
                File file = new File(str);
                if (file.exists() && file.getName().endsWith(".apk")) {
                    String extractDexFromApk = extractDexFromApk(file);
                    return extractDexFromApk != null ? new RecoveryResult(extractDexFromApk, getName()) : new RecoveryResult("Failed to extract DEX from corrupted APK");
                }
                return new RecoveryResult("Not an APK file or file doesn't exist");
            } catch (Exception e) {
                return new RecoveryResult("Error in DEX extraction strategy: " + e.getMessage());
            }
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public String getName() {
            return "DEX Extraction";
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public int getPriority() {
            return 40;
        }

        public /* synthetic */ DexExtractionStrategy(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class HostAppApkStrategy implements RecoveryStrategy {
        private HostAppApkStrategy() {
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public RecoveryResult attemptRecovery(String str) {
            ApplicationInfo applicationInfo;
            try {
                Context context = BlackBoxCore.getContext();
                if (context != null && (applicationInfo = context.getApplicationInfo()) != null && applicationInfo.sourceDir != null) {
                    File file = new File(applicationInfo.sourceDir);
                    if (file.exists() && DexFileRecovery.isValidApkFile(file)) {
                        return new RecoveryResult(applicationInfo.sourceDir, getName());
                    }
                }
                return new RecoveryResult("Host app APK not available or invalid");
            } catch (Exception e) {
                return new RecoveryResult("Error in host app APK strategy: " + e.getMessage());
            }
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public String getName() {
            return "Host App APK";
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public int getPriority() {
            return 80;
        }

        public /* synthetic */ HostAppApkStrategy(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class RecoveryResult {
        public final String errorMessage;
        public final String recoveredFilePath;
        public final String recoveryMethod;
        public final boolean success;

        public RecoveryResult(String str) {
            this.recoveredFilePath = null;
            this.recoveryMethod = null;
            this.success = false;
            this.errorMessage = str;
        }

        public String toString() {
            StringBuilder sb;
            String str;
            if (this.success) {
                sb = new StringBuilder("Recovery successful via ");
                sb.append(this.recoveryMethod);
                sb.append(": ");
                str = this.recoveredFilePath;
            } else {
                sb = new StringBuilder("Recovery failed: ");
                str = this.errorMessage;
            }
            sb.append(str);
            return sb.toString();
        }

        public RecoveryResult(String str, String str2) {
            this.recoveredFilePath = str;
            this.recoveryMethod = str2;
            this.success = str != null;
            this.errorMessage = null;
        }
    }

    /* loaded from: classes.dex */
    public interface RecoveryStrategy {
        RecoveryResult attemptRecovery(String str);

        String getName();

        int getPriority();
    }

    /* loaded from: classes.dex */
    public static class SystemApkStrategy implements RecoveryStrategy {
        private SystemApkStrategy() {
        }

        public static /* synthetic */ boolean lambda$attemptRecovery$0(File file, String str) {
            return str.endsWith(".apk");
        }

        /* JADX WARN: Type inference failed for: r6v1, types: [java.io.FilenameFilter, java.lang.Object] */
        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public RecoveryResult attemptRecovery(String str) {
            File[] listFiles;
            File[] listFiles2;
            try {
                String[] strArr = {"/system/app", "/system/priv-app", "/vendor/app", "/product/app"};
                for (int i = 0; i < 4; i++) {
                    File file = new File(strArr[i]);
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory() && (listFiles2 = file2.listFiles((FilenameFilter) new Object())) != null && listFiles2.length > 0) {
                                File file3 = listFiles2[0];
                                if (DexFileRecovery.isValidApkFile(file3)) {
                                    file3.getAbsolutePath();
                                    return new RecoveryResult(file3.getAbsolutePath(), getName());
                                }
                            }
                        }
                        continue;
                    }
                }
                return new RecoveryResult("No valid system APK files found");
            } catch (Exception e) {
                return new RecoveryResult("Error in system APK strategy: " + e.getMessage());
            }
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public String getName() {
            return "System APK";
        }

        @Override // com.app.framework.utils.DexFileRecovery.RecoveryStrategy
        public int getPriority() {
            return 60;
        }

        public /* synthetic */ SystemApkStrategy(int i) {
            this();
        }
    }

    static {
        initializeRecoveryStrategies();
    }

    public static void clearCache() {
        sRecoveryCache.clear();
    }

    public static RecoveryResult forceRecovery(String str) {
        sRecoveryCache.remove(str);
        return recoverDexFile(str);
    }

    public static String getRecoveryStats() {
        int i = 0;
        int i2 = 0;
        for (RecoveryResult recoveryResult : sRecoveryCache.values()) {
            if (recoveryResult.success) {
                i++;
            } else {
                i2++;
            }
        }
        return "Recovery Stats - Successful: " + i + ", Failed: " + i2 + ", Total Attempts: " + sRecoveryCache.size();
    }

    private static void initializeRecoveryStrategies() {
        List<RecoveryStrategy> list = sRecoveryStrategies;
        list.add(new AlternativeApkStrategy(0));
        list.add(new HostAppApkStrategy(0));
        list.add(new SystemApkStrategy(0));
        list.add(new DexExtractionStrategy(0));
        list.add(new BackupRestoreStrategy(0));
        list.sort(new C0382o0OOo0o(0));
        list.size();
    }

    public static boolean isValidApkFile(File file) {
        if (file != null && file.exists()) {
            try {
                if (file.length() < 1000000) {
                    return false;
                }
                try {
                    ZipFile zipFile = new ZipFile(file);
                    ZipEntry entry = zipFile.getEntry("classes.dex");
                    boolean z = entry != null && entry.getSize() > 0;
                    zipFile.close();
                    return z;
                } catch (Exception e) {
                    file.getAbsolutePath();
                    e.getMessage();
                    return false;
                }
            } catch (Exception e2) {
                file.getAbsolutePath();
                e2.getMessage();
            }
        }
        return false;
    }

    public static /* synthetic */ int lambda$initializeRecoveryStrategies$0(RecoveryStrategy recoveryStrategy, RecoveryStrategy recoveryStrategy2) {
        return Integer.compare(recoveryStrategy2.getPriority(), recoveryStrategy.getPriority());
    }

    public static RecoveryResult recoverDexFile(String str) {
        RecoveryResult attemptRecovery;
        if (str == null) {
            return new RecoveryResult("Corrupted file path is null");
        }
        Map<String, RecoveryResult> map = sRecoveryCache;
        if (map.containsKey(str)) {
            RecoveryResult recoveryResult = map.get(str);
            Objects.toString(recoveryResult);
            return recoveryResult;
        }
        for (RecoveryStrategy recoveryStrategy : sRecoveryStrategies) {
            try {
                recoveryStrategy.getName();
                attemptRecovery = recoveryStrategy.attemptRecovery(str);
            } catch (Exception e) {
                recoveryStrategy.getName();
                e.getMessage();
            }
            if (attemptRecovery.success) {
                recoveryStrategy.getName();
                sRecoveryCache.put(str, attemptRecovery);
                return attemptRecovery;
            }
            recoveryStrategy.getName();
        }
        RecoveryResult recoveryResult2 = new RecoveryResult("All recovery strategies failed for ".concat(str));
        sRecoveryCache.put(str, recoveryResult2);
        return recoveryResult2;
    }
}
