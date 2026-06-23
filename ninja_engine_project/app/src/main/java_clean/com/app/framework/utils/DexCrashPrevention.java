package com.app.framework.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.app.framework.BlackBoxCore;
import com.app.framework.utils.DexFileRecovery;
import com.ninja.engine.C0165o00OoO0;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class DexCrashPrevention {
    private static final String TAG = "DexCrashPrevention";
    private static boolean sIsInitialized = false;
    private static final Map<String, PreventionResult> sPreventionCache = new HashMap();
    private static final String[] PROBLEMATIC_APK_PATTERNS = {"split_config.xhdpi.apk", "split_config.arm64_v8a.apk", "split_config.armeabi_v7a.apk"};

    /* loaded from: classes.dex */
    public static class PreventionResult {
        public final String details;
        public final String preventionMethod;
        public final boolean success;
        public final long timestamp = System.currentTimeMillis();

        public PreventionResult(String str, boolean z, String str2) {
            this.preventionMethod = str;
            this.success = z;
            this.details = str2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Prevention ");
            sb.append(this.success ? "successful" : "failed");
            sb.append(" via ");
            sb.append(this.preventionMethod);
            sb.append(": ");
            sb.append(this.details);
            return sb.toString();
        }
    }

    private static PreventionResult attemptCorruptionRecovery(String str) {
        try {
            DexFileRecovery.RecoveryResult recoverDexFile = DexFileRecovery.recoverDexFile(str);
            if (recoverDexFile.success) {
                return new PreventionResult("Corruption Recovery", true, "Successfully recovered via " + recoverDexFile.recoveryMethod);
            }
            return new PreventionResult("Corruption Recovery", false, "Recovery failed: " + recoverDexFile.errorMessage);
        } catch (Exception e) {
            return new PreventionResult("Corruption Recovery", false, "Error during recovery: " + e.getMessage());
        }
    }

    public static void clearCache() {
        sPreventionCache.clear();
    }

    private static String findBaseApkPath(File file) {
        File[] listFiles;
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.exists() || (listFiles = parentFile.listFiles(new C0165o00OoO0(1))) == null || listFiles.length <= 0) {
                return null;
            }
            return listFiles[0].getAbsolutePath();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static PreventionResult forcePrevention(String str) {
        sPreventionCache.remove(str);
        return validateAndPreventCorruption(str);
    }

    public static String getPreventionStats() {
        int i = 0;
        int i2 = 0;
        for (PreventionResult preventionResult : sPreventionCache.values()) {
            if (preventionResult.success) {
                i++;
            } else {
                i2++;
            }
        }
        return "Prevention Stats - Successful: " + i + ", Failed: " + i2 + ", Total Attempts: " + sPreventionCache.size();
    }

    public static String getStatus() {
        return "DEX Crash Prevention Status:\nInitialized: " + sIsInitialized + "\nCache Size: " + sPreventionCache.size() + "\nPrevention Stats: " + getPreventionStats() + "\nRecovery Stats: " + DexFileRecovery.getRecoveryStats() + ShellUtils.COMMAND_LINE_END;
    }

    private static String[] getVirtualAppApkFiles() {
        File[] listFiles;
        try {
            String virtualAppDirectory = getVirtualAppDirectory();
            if (virtualAppDirectory != null) {
                File file = new File(virtualAppDirectory);
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new C0165o00OoO0(2))) != null) {
                    String[] strArr = new String[listFiles.length];
                    for (int i = 0; i < listFiles.length; i++) {
                        strArr[i] = listFiles[i].getAbsolutePath();
                    }
                    return strArr;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private static String getVirtualAppDirectory() {
        ApplicationInfo applicationInfo;
        try {
            Context context = BlackBoxCore.getContext();
            if (context == null || (applicationInfo = context.getApplicationInfo()) == null || applicationInfo.sourceDir == null) {
                return null;
            }
            return new File(applicationInfo.sourceDir).getParent();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private static PreventionResult handleProblematicSplitApk(File file) {
        try {
            file.getName();
            String findBaseApkPath = findBaseApkPath(file);
            if (findBaseApkPath == null || !DexFileRecovery.isValidApkFile(new File(findBaseApkPath))) {
                DexFileRecovery.RecoveryResult recoverDexFile = DexFileRecovery.recoverDexFile(file.getAbsolutePath());
                if (recoverDexFile.success) {
                    return new PreventionResult("Split APK Recovery", true, "Recovered split APK via " + recoverDexFile.recoveryMethod);
                }
                return new PreventionResult("Split APK Recovery", false, "Failed to recover split APK: " + recoverDexFile.errorMessage);
            }
            return new PreventionResult("Split APK Handling", true, "Using valid base APK instead of problematic split: ".concat(findBaseApkPath));
        } catch (Exception e) {
            return new PreventionResult("Split APK Handling", false, "Error handling split APK: " + e.getMessage());
        }
    }

    private static void hookDexFileValidation() {
    }

    public static void initialize() {
        if (sIsInitialized) {
            return;
        }
        try {
            installProactivePrevention();
            installDexFileValidation();
            installClassLoaderMonitoring();
            installApkIntegrityChecks();
            sIsInitialized = true;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installApkIntegrityChecks() {
        try {
            setupPeriodicIntegrityChecks();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installClassLoaderMonitoring() {
        try {
            setupClassLoaderMonitoring();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installDexFileValidation() {
        try {
            hookDexFileValidation();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installProactivePrevention() {
        try {
            setupApkFileMonitoring();
            prevalidateCriticalApkFiles();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static boolean isProblematicSplitApk(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : PROBLEMATIC_APK_PATTERNS) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean lambda$findBaseApkPath$0(File file, String str) {
        return str.endsWith(".apk") && !str.contains("split_config");
    }

    public static /* synthetic */ boolean lambda$getVirtualAppApkFiles$1(File file, String str) {
        return str.endsWith(".apk");
    }

    private static void prevalidateCriticalApkFiles() {
        try {
            String[] virtualAppApkFiles = getVirtualAppApkFiles();
            if (virtualAppApkFiles != null) {
                for (String str : virtualAppApkFiles) {
                    if (str != null) {
                        PreventionResult validateAndPreventCorruption = validateAndPreventCorruption(str);
                        boolean z = validateAndPreventCorruption.success;
                        validateAndPreventCorruption.toString();
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void setupApkFileMonitoring() {
        try {
            String virtualAppDirectory = getVirtualAppDirectory();
            if (virtualAppDirectory != null) {
                File file = new File(virtualAppDirectory);
                if (file.exists()) {
                    file.isDirectory();
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void setupClassLoaderMonitoring() {
        try {
            DexCrashPrevention.class.getClassLoader();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void setupPeriodicIntegrityChecks() {
    }

    public static PreventionResult validateAndPreventCorruption(String str) {
        if (str == null) {
            return new PreventionResult("Validation", false, "APK file path is null");
        }
        Map<String, PreventionResult> map = sPreventionCache;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                PreventionResult preventionResult = new PreventionResult("Validation", false, "APK file does not exist");
                map.put(str, preventionResult);
                return preventionResult;
            } else if (isProblematicSplitApk(file.getName())) {
                file.getName();
                PreventionResult handleProblematicSplitApk = handleProblematicSplitApk(file);
                map.put(str, handleProblematicSplitApk);
                return handleProblematicSplitApk;
            } else if (DexFileRecovery.isValidApkFile(file)) {
                PreventionResult preventionResult2 = new PreventionResult("Validation", true, "APK file is valid");
                map.put(str, preventionResult2);
                return preventionResult2;
            } else {
                PreventionResult attemptCorruptionRecovery = attemptCorruptionRecovery(str);
                map.put(str, attemptCorruptionRecovery);
                return attemptCorruptionRecovery;
            }
        } catch (Exception e) {
            PreventionResult preventionResult3 = new PreventionResult("Validation", false, "Error during validation: " + e.getMessage());
            sPreventionCache.put(str, preventionResult3);
            return preventionResult3;
        }
    }
}


