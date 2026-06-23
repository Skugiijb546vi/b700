package com.app.framework.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class CrashMonitor {
    private static final String TAG = "CrashMonitor";
    private static boolean sIsInitialized = false;
    private static Handler sMainHandler;
    private static final AtomicInteger sTotalCrashes = new AtomicInteger(0);
    private static final AtomicInteger sJavaCrashes = new AtomicInteger(0);
    private static final AtomicInteger sNativeCrashes = new AtomicInteger(0);
    private static final AtomicInteger sRecoveredCrashes = new AtomicInteger(0);
    private static final Map<String, CrashInfo> sCrashHistory = new HashMap();
    private static final Map<String, RecoveryStrategy> sRecoveryStrategies = new HashMap();
    private static boolean sIsMonitoring = false;

    /* loaded from: classes.dex */
    public static class CrashInfo {
        public final String crashType;
        public final String errorMessage;
        public final String packageName;
        public final String stackTrace;
        public final long timestamp = System.currentTimeMillis();
        public final boolean wasRecovered;

        public CrashInfo(String str, String str2, String str3, String str4, boolean z) {
            this.crashType = str;
            this.packageName = str2;
            this.errorMessage = str3;
            this.stackTrace = str4;
            this.wasRecovered = z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Crash[");
            sb.append(this.crashType);
            sb.append("] ");
            sb.append(this.packageName);
            sb.append(" - ");
            sb.append(this.wasRecovered ? "RECOVERED" : "FAILED");
            sb.append(" at ");
            sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(this.timestamp)));
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class DexCorruptionRecovery implements RecoveryStrategy {
        private DexCorruptionRecovery() {
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean attemptRecovery(CrashInfo crashInfo) {
            return true;
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean canHandle(String str, String str2) {
            return str2 != null && (str2.contains("classes.dex") || str2.contains("ClassNotFoundException"));
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public String getName() {
            return "DEX Corruption Recovery";
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public int getPriority() {
            return 80;
        }

        public /* synthetic */ DexCorruptionRecovery(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class JavaExceptionRecovery implements RecoveryStrategy {
        private JavaExceptionRecovery() {
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean attemptRecovery(CrashInfo crashInfo) {
            return true;
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean canHandle(String str, String str2) {
            return str.equals("JavaException");
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public String getName() {
            return "Java Exception Recovery";
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public int getPriority() {
            return 100;
        }

        public /* synthetic */ JavaExceptionRecovery(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class MemoryCrashRecovery implements RecoveryStrategy {
        private MemoryCrashRecovery() {
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean attemptRecovery(CrashInfo crashInfo) {
            try {
                System.gc();
                return true;
            } catch (Exception e) {
                e.getMessage();
                return false;
            }
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean canHandle(String str, String str2) {
            return str2 != null && (str2.contains("OutOfMemoryError") || str2.contains("Memory") || str2.contains("SIGSEGV"));
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public String getName() {
            return "Memory Crash Recovery";
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public int getPriority() {
            return 60;
        }

        public /* synthetic */ MemoryCrashRecovery(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class NativeCrashRecovery implements RecoveryStrategy {
        private NativeCrashRecovery() {
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean attemptRecovery(CrashInfo crashInfo) {
            return true;
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean canHandle(String str, String str2) {
            return str.equals("NativeCrash");
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public String getName() {
            return "Native Crash Recovery";
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public int getPriority() {
            return 90;
        }

        public /* synthetic */ NativeCrashRecovery(int i) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface RecoveryStrategy {
        boolean attemptRecovery(CrashInfo crashInfo);

        boolean canHandle(String str, String str2);

        String getName();

        int getPriority();
    }

    /* loaded from: classes.dex */
    public static class WebViewCrashRecovery implements RecoveryStrategy {
        private WebViewCrashRecovery() {
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean attemptRecovery(CrashInfo crashInfo) {
            return true;
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public boolean canHandle(String str, String str2) {
            return str2 != null && (str2.contains("WebView") || str2.contains("webview"));
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public String getName() {
            return "WebView Crash Recovery";
        }

        @Override // com.app.framework.utils.CrashMonitor.RecoveryStrategy
        public int getPriority() {
            return 70;
        }

        public /* synthetic */ WebViewCrashRecovery(int i) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void analyzeCrashPatterns() {
        Object orDefault;
        Object orDefault2;
        try {
            Map<String, CrashInfo> map = sCrashHistory;
            if (map.isEmpty()) {
                return;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (CrashInfo crashInfo : map.values()) {
                String str = crashInfo.crashType;
                orDefault = hashMap.getOrDefault(str, 0);
                hashMap.put(str, Integer.valueOf(((Integer) orDefault).intValue() + 1));
                String str2 = crashInfo.packageName;
                orDefault2 = hashMap2.getOrDefault(str2, 0);
                hashMap2.put(str2, Integer.valueOf(((Integer) orDefault2).intValue() + 1));
            }
            hashMap.toString();
            hashMap2.toString();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 5) {
                    String str3 = (String) entry.getKey();
                    Objects.toString(entry.getValue());
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static boolean attemptCrashRecovery(CrashInfo crashInfo) {
        try {
            String str = crashInfo.crashType;
            for (RecoveryStrategy recoveryStrategy : sRecoveryStrategies.values()) {
                if (recoveryStrategy.canHandle(crashInfo.crashType, crashInfo.errorMessage)) {
                    recoveryStrategy.getName();
                    if (recoveryStrategy.attemptRecovery(crashInfo)) {
                        recoveryStrategy.getName();
                        return true;
                    }
                    recoveryStrategy.getName();
                }
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static void clearCrashHistory() {
        sCrashHistory.clear();
        sTotalCrashes.set(0);
        sJavaCrashes.set(0);
        sNativeCrashes.set(0);
        sRecoveredCrashes.set(0);
    }

    private static CrashInfo createCrashInfo(String str, Thread thread, Throwable th) {
        try {
            return new CrashInfo(str, getCurrentPackageName(), th != null ? th.getMessage() : "Unknown error", getStackTrace(th), false);
        } catch (Exception e) {
            e.getMessage();
            return new CrashInfo(str, "unknown", "Error creating crash info", "", false);
        }
    }

    public static String getCrashStats() {
        StringBuilder sb = new StringBuilder("Crash Statistics:\nTotal Crashes: ");
        AtomicInteger atomicInteger = sTotalCrashes;
        sb.append(atomicInteger.get());
        sb.append("\nJava Crashes: ");
        sb.append(sJavaCrashes.get());
        sb.append("\nNative Crashes: ");
        sb.append(sNativeCrashes.get());
        sb.append("\nRecovered Crashes: ");
        AtomicInteger atomicInteger2 = sRecoveredCrashes;
        sb.append(atomicInteger2.get());
        sb.append("\nRecovery Rate: ");
        sb.append(String.format("%.1f%%", Double.valueOf(atomicInteger.get() > 0 ? (atomicInteger2.get() / atomicInteger.get()) * 100.0d : 0.0d)));
        return sb.toString();
    }

    private static String getCurrentPackageName() {
        try {
            try {
                return BActivityThread.getAppPackageName();
            } catch (Exception unused) {
                return "unknown";
            }
        } catch (Exception unused2) {
            Context context = BlackBoxCore.getContext();
            return context != null ? context.getPackageName() : "unknown";
        }
    }

    private static String getStackTrace(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (Exception e) {
            return "Error getting stack trace: " + e.getMessage();
        }
    }

    public static String getStatus() {
        return "Crash Monitoring Status:\nInitialized: " + sIsInitialized + "\nMonitoring: " + sIsMonitoring + "\nRecovery Strategies: " + sRecoveryStrategies.size() + "\nCrash History Size: " + sCrashHistory.size() + "\n\n" + getCrashStats();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: Exception -> 0x0010, TryCatch #0 {Exception -> 0x0010, blocks: (B:2:0x0000, B:4:0x000d, B:10:0x001c, B:11:0x001f, B:13:0x0049, B:14:0x0061, B:7:0x0012, B:9:0x001a), top: B:18:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void handleCrash(java.lang.String r7, java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            java.util.concurrent.atomic.AtomicInteger r0 = com.app.framework.utils.CrashMonitor.sTotalCrashes     // Catch: java.lang.Exception -> L10
            r0.incrementAndGet()     // Catch: java.lang.Exception -> L10
            java.lang.String r0 = "JavaException"
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L12
            java.util.concurrent.atomic.AtomicInteger r0 = com.app.framework.utils.CrashMonitor.sJavaCrashes     // Catch: java.lang.Exception -> L10
            goto L1c
        L10:
            r7 = move-exception
            goto L65
        L12:
            java.lang.String r0 = "NativeCrash"
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L1f
            java.util.concurrent.atomic.AtomicInteger r0 = com.app.framework.utils.CrashMonitor.sNativeCrashes     // Catch: java.lang.Exception -> L10
        L1c:
            r0.incrementAndGet()     // Catch: java.lang.Exception -> L10
        L1f:
            com.app.framework.utils.CrashMonitor$CrashInfo r8 = createCrashInfo(r7, r8, r9)     // Catch: java.lang.Exception -> L10
            java.util.Objects.toString(r8)     // Catch: java.lang.Exception -> L10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10
            r9.<init>()     // Catch: java.lang.Exception -> L10
            r9.append(r7)     // Catch: java.lang.Exception -> L10
            java.lang.String r7 = "_"
            r9.append(r7)     // Catch: java.lang.Exception -> L10
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L10
            r9.append(r0)     // Catch: java.lang.Exception -> L10
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Exception -> L10
            java.util.Map<java.lang.String, com.app.framework.utils.CrashMonitor$CrashInfo> r9 = com.app.framework.utils.CrashMonitor.sCrashHistory     // Catch: java.lang.Exception -> L10
            r9.put(r7, r8)     // Catch: java.lang.Exception -> L10
            boolean r0 = attemptCrashRecovery(r8)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L61
            java.util.concurrent.atomic.AtomicInteger r0 = com.app.framework.utils.CrashMonitor.sRecoveredCrashes     // Catch: java.lang.Exception -> L10
            r0.incrementAndGet()     // Catch: java.lang.Exception -> L10
            com.app.framework.utils.CrashMonitor$CrashInfo r0 = new com.app.framework.utils.CrashMonitor$CrashInfo     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r8.crashType     // Catch: java.lang.Exception -> L10
            java.lang.String r3 = r8.packageName     // Catch: java.lang.Exception -> L10
            java.lang.String r4 = r8.errorMessage     // Catch: java.lang.Exception -> L10
            java.lang.String r5 = r8.stackTrace     // Catch: java.lang.Exception -> L10
            r6 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L10
            r9.put(r7, r0)     // Catch: java.lang.Exception -> L10
            r8 = r0
        L61:
            writeCrashLog(r8)     // Catch: java.lang.Exception -> L10
            goto L68
        L65:
            r7.getMessage()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.utils.CrashMonitor.handleCrash(java.lang.String, java.lang.Thread, java.lang.Throwable):void");
    }

    public static void initialize() {
        if (sIsInitialized) {
            return;
        }
        try {
            sMainHandler = new Handler(Looper.getMainLooper());
            registerRecoveryStrategies();
            installGlobalCrashHandlers();
            startMonitoring();
            sIsInitialized = true;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installGlobalCrashHandlers() {
        try {
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.app.framework.utils.CrashMonitor.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    CrashMonitor.handleCrash("JavaException", thread, th);
                }
            });
            installSystemErrorHandler();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installSystemErrorHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void performHealthCheck() {
        try {
            Runtime runtime = Runtime.getRuntime();
            double freeMemory = ((runtime.totalMemory() - runtime.freeMemory()) / runtime.maxMemory()) * 100.0d;
            if (freeMemory > 80.0d) {
                String.format("%.1f%%", Double.valueOf(freeMemory));
                System.gc();
            }
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            threadGroup.activeCount();
            String.format("%.1f%%", Double.valueOf(freeMemory));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void registerRecoveryStrategies() {
        try {
            Map<String, RecoveryStrategy> map = sRecoveryStrategies;
            map.put("JavaException", new JavaExceptionRecovery(0));
            map.put("NativeCrash", new NativeCrashRecovery(0));
            map.put("DexCorruption", new DexCorruptionRecovery(0));
            map.put("WebViewCrash", new WebViewCrashRecovery(0));
            map.put("MemoryCrash", new MemoryCrashRecovery(0));
            map.size();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void startCrashPatternAnalysis() {
        Handler handler = sMainHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.app.framework.utils.CrashMonitor.3
                @Override // java.lang.Runnable
                public void run() {
                    CrashMonitor.analyzeCrashPatterns();
                    CrashMonitor.sMainHandler.postDelayed(this, 60000L);
                }
            }, 60000L);
        }
    }

    private static void startMonitoring() {
        if (sIsMonitoring) {
            return;
        }
        try {
            sIsMonitoring = true;
            startPeriodicHealthChecks();
            startCrashPatternAnalysis();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void startPeriodicHealthChecks() {
        Handler handler = sMainHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.app.framework.utils.CrashMonitor.2
                @Override // java.lang.Runnable
                public void run() {
                    CrashMonitor.performHealthCheck();
                    CrashMonitor.sMainHandler.postDelayed(this, 30000L);
                }
            }, 30000L);
        }
    }

    private static void writeCrashLog(CrashInfo crashInfo) {
        try {
            Context context = BlackBoxCore.getContext();
            if (context == null) {
                return;
            }
            File file = new File(context.getFilesDir(), "crash_logs");
            if (!file.exists()) {
                file.mkdirs();
            }
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(crashInfo.timestamp));
            File file2 = new File(file, "crash_" + format + ".log");
            PrintWriter printWriter = new PrintWriter(new FileWriter(file2));
            printWriter.println("=== CRASH LOG ===");
            printWriter.println("Timestamp: " + new Date(crashInfo.timestamp));
            printWriter.println("Crash Type: " + crashInfo.crashType);
            printWriter.println("Package: " + crashInfo.packageName);
            printWriter.println("Error: " + crashInfo.errorMessage);
            printWriter.println("Recovered: " + crashInfo.wasRecovered);
            printWriter.println("=== STACK TRACE ===");
            printWriter.println(crashInfo.stackTrace);
            printWriter.println("=== END ===");
            printWriter.close();
            file2.getAbsolutePath();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
