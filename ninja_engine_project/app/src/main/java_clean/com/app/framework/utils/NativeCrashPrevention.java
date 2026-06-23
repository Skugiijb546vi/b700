package com.app.framework.utils;

import android.os.Build;
import com.app.framework.fake.service.ClassLoaderProxy;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class NativeCrashPrevention {
    private static final String TAG = "NativeCrashPrevention";
    private static boolean sIsInitialized = false;
    private static final Map<String, PreventionResult> sPreventionCache = new HashMap();
    private static final String[] PROBLEMATIC_LIBS = {"libart.so", "libdvm.so", "libc.so", "libm.so"};

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
            StringBuilder sb = new StringBuilder("Native Prevention ");
            sb.append(this.success ? "successful" : "failed");
            sb.append(" via ");
            sb.append(this.preventionMethod);
            sb.append(": ");
            sb.append(this.details);
            return sb.toString();
        }
    }

    private static boolean attemptNativeCrashRecovery(Thread thread, Throwable th) {
        try {
            if (restartCrashedThread(thread) || clearNativeCaches() || reinitializeNativeLibraries()) {
                return true;
            }
            return performMemoryCleanup();
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static void clearCache() {
        sPreventionCache.clear();
    }

    private static void clearClassCaches() {
        try {
            ClassLoaderProxy.clearClassCache();
            DexFileRecovery.clearCache();
            DexCrashPrevention.clearCache();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void clearCorruptedSystemProperties() {
        try {
            String[] strArr = {"webview.data.dir", "webview.cache.dir", "dex.oat.cache.dir"};
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                try {
                    String property = System.getProperty(str);
                    if (property != null && property.contains("corrupted")) {
                        System.clearProperty(str);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static boolean clearNativeCaches() {
        try {
            System.gc();
            clearReflectionCaches();
            clearClassCaches();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    private static void clearReflectionCaches() {
        try {
            Class.forName("java.lang.reflect.ReflectionFactory");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static Thread.UncaughtExceptionHandler getOriginalExceptionHandler() {
        try {
            Field declaredField = Thread.class.getDeclaredField("defaultUncaughtExceptionHandler");
            declaredField.setAccessible(true);
            return (Thread.UncaughtExceptionHandler) declaredField.get(null);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
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
        return "Native Prevention Stats - Successful: " + i + ", Failed: " + i2 + ", Total Attempts: " + sPreventionCache.size();
    }

    public static String getStatus() {
        return "Native Crash Prevention Status:\nInitialized: " + sIsInitialized + "\nCache Size: " + sPreventionCache.size() + "\nPrevention Stats: " + getPreventionStats() + "\nAndroid Version: " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + ")\n";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleNativeCrash(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler originalExceptionHandler;
        try {
            thread.getName();
            th.getMessage();
            if ((isNativeCrash(th) && attemptNativeCrashRecovery(thread, th)) || (originalExceptionHandler = getOriginalExceptionHandler()) == null) {
                return;
            }
            originalExceptionHandler.uncaughtException(thread, th);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void initialize() {
        if (sIsInitialized) {
            return;
        }
        try {
            installSignalHandlers();
            installNativeLibraryMonitoring();
            installMemoryProtection();
            installThreadProtection();
            sIsInitialized = true;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installMemoryProtection() {
        try {
            setupMemoryMonitoring();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installNativeLibraryMonitoring() {
        try {
            monitorNativeLibraryLoading();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installSignalHandlers() {
        try {
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.app.framework.utils.NativeCrashPrevention.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    NativeCrashPrevention.handleNativeCrash(thread, th);
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installThreadProtection() {
        try {
            setupThreadMonitoring();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static boolean isNativeCrash(Throwable th) {
        String message;
        if (th == null || (message = th.getMessage()) == null) {
            return false;
        }
        String[] strArr = {"SIGSEGV", "SIGABRT", "SIGBUS", "SIGFPE", "SIGILL", "native crash", "art::", "libart.so", "libc.so", "libm.so"};
        for (int i = 0; i < 10; i++) {
            if (message.contains(strArr[i])) {
                return true;
            }
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                if (className != null && (className.contains("art::") || className.contains("native"))) {
                    return true;
                }
                if (methodName != null && methodName.contains("native")) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void monitorNativeLibraryLoading() {
    }

    private static boolean performMemoryCleanup() {
        for (int i = 0; i < 3; i++) {
            try {
                System.gc();
                Thread.sleep(100L);
            } catch (Exception e) {
                e.getMessage();
                return false;
            }
        }
        clearCorruptedSystemProperties();
        return true;
    }

    private static boolean reinitializeNativeLibraries() {
        return false;
    }

    private static boolean restartCrashedThread(Thread thread) {
        try {
            thread.getName();
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    private static void setupMemoryMonitoring() {
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.maxMemory();
            runtime.totalMemory();
            runtime.freeMemory();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void setupThreadMonitoring() {
        try {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            threadGroup.activeCount();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}


