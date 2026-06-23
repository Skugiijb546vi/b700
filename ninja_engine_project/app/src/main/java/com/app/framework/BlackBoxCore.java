package com.app.framework;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.view.WindowManager;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.ImageRequest;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.app.LauncherActivity;
import com.app.framework.app.configuration.AppLifecycleCallback;
import com.app.framework.app.configuration.ClientConfiguration;
import com.app.framework.closecode.Entry;
import com.app.framework.core.GmsCore;
import com.app.framework.core.NativeCore;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.DaemonService;
import com.app.framework.core.system.JarConfig;
import com.app.framework.core.system.ServiceManager;
import com.app.framework.core.system.am.ActivityRecord;
import com.app.framework.core.system.am.ActivityStack;
import com.app.framework.core.system.am.TaskRecord;
import com.app.framework.core.system.user.BUserHandle;
import com.app.framework.core.system.user.BUserInfo;
import com.app.framework.entity.AppConfig;
import com.app.framework.entity.pm.InstallOption;
import com.app.framework.entity.pm.InstallResult;
import com.app.framework.entity.pm.InstalledModule;
import com.app.framework.fake.delegate.ContentProviderDelegate;
import com.app.framework.fake.frameworks.BActivityManager;
import com.app.framework.fake.frameworks.BJobManager;
import com.app.framework.fake.frameworks.BPackageManager;
import com.app.framework.fake.frameworks.BStorageManager;
import com.app.framework.fake.frameworks.BUserManager;
import com.app.framework.fake.frameworks.BXposedManager;
import com.app.framework.fake.hook.HookManager;
import com.app.framework.proxy.ProxyManifest;
import com.app.framework.proxy.ProxyVpnService;
import com.app.framework.utils.CrashMonitor;
import com.app.framework.utils.DexCrashPrevention;
import com.app.framework.utils.NativeCrashPrevention;
import com.app.framework.utils.Reflector;
import com.app.framework.utils.ShellUtils;
import com.app.framework.utils.SimpleCrashFix;
import com.app.framework.utils.SocialMediaAppCrashPrevention;
import com.app.framework.utils.StackTraceFilter;
import com.app.framework.utils.compat.BuildCompat;
import com.app.framework.utils.compat.BundleCompat;
import com.app.framework.utils.compat.XposedParserCompat;
import com.app.framework.utils.provider.ProviderCall;
import com.ninja.engine.AbstractC2033oooOoo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1597oo0oOOo0;
import com.ninja.engine.InterfaceC1662ooO00Ooo;
import com.ninja.engine.Oooo0;
import com.ninja.engine.RunnableC0061o00000oO;
import com.ninja.engine.RunnableC0087o000Oo0O;
import com.ninja.engine.RunnableC0208o00o0Oo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
@SuppressLint({"StaticFieldLeak", "NewApi"})
/* loaded from: classes.dex */
public class BlackBoxCore extends ClientConfiguration {
    private static final long ANR_HEARTBEAT_MS = 1000;
    private static final long ANR_POLL_MS = 2000;
    private static final long ANR_TIMEOUT_MS = 10000;
    private static final long SERVICE_INIT_TIMEOUT_MS = 10000;
    public static final String TAG = "BlackBoxCore";
    private static volatile boolean sAnrWatchdogStarted;
    private static final BlackBoxCore sBlackBoxCore = new BlackBoxCore();
    private static Context sContext;
    private static volatile boolean sCrashHandlerInstalled;
    private static volatile String sLogcatUploadUrl;
    private static volatile boolean sStartupLogcatBootstrapDone;
    private volatile boolean mAnrReported;
    private ClientConfiguration mClientConfiguration;
    private volatile File mCurrentLogcatFile;
    private Thread.UncaughtExceptionHandler mExceptionHandler;
    private volatile Process mLogcatProcess;
    private volatile long mMainThreadHeartbeatMs;
    private ProcessType mProcessType;
    private final Map<String, IBinder> mServices = new HashMap();
    private final List<AppLifecycleCallback> mAppLifecycleCallbacks = new ArrayList();
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final int mHostUid = Process.myUid();
    private final int mHostUserId = ((InterfaceC1662ooO00Ooo) C0217o00o0oO0.create(InterfaceC1662ooO00Ooo.class, null, false)).myUserId().intValue();
    private boolean mServicesInitialized = false;
    private long mLastServiceInitAttempt = 0;
    private final List<Runnable> mServiceAvailableCallbacks = new ArrayList();
    private final Object mServiceCallbackLock = new Object();
    private int mCurrentAppUid = -1;
    private String mCurrentAppPackage = null;
    private boolean mIsSandboxedEnvironment = false;

    /* loaded from: classes.dex */
    public enum ProcessType {
        Server,
        BAppClient,
        Main
    }

    static {
        try {
            SimpleCrashFix.installSimpleFix();
            StackTraceFilter.install();
            SocialMediaAppCrashPrevention.initialize();
            DexCrashPrevention.initialize();
            NativeCrashPrevention.initialize();
            CrashMonitor.initialize();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void appendAnrInfo(File file, long j) {
        StackTraceElement[] stackTrace;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("\n\n=== POTENTIAL ANR DETECTED ===\n");
            fileWriter.write("Time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()) + ShellUtils.COMMAND_LINE_END);
            fileWriter.write("Main thread stalled ms: " + j + ShellUtils.COMMAND_LINE_END);
            Thread thread = Looper.getMainLooper().getThread();
            fileWriter.write("Main thread name: " + thread.getName() + ShellUtils.COMMAND_LINE_END);
            fileWriter.write("Main thread state: " + thread.getState() + ShellUtils.COMMAND_LINE_END);
            fileWriter.write("Main thread stack:\n");
            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                fileWriter.write("    at " + stackTraceElement.toString() + ShellUtils.COMMAND_LINE_END);
            }
            fileWriter.write("==============================\n");
            fileWriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void appendCrashInfo(File file, Throwable th) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("\n\n=== CRASH DETECTED ===\n");
            fileWriter.write("Time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()) + ShellUtils.COMMAND_LINE_END);
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            fileWriter.write(stringWriter.toString());
            fileWriter.write("======================\n");
            fileWriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void bootstrapStartupLogcatCapture(Context context) {
        if (context == null || sStartupLogcatBootstrapDone) {
            return;
        }
        sStartupLogcatBootstrapDone = true;
        new Thread(new RunnableC0208o00o0Oo(this, context, 0), "StartupLogcatBootstrap").start();
    }

    private void cleanStalePendingLogcats(Context context) {
        File[] listFiles;
        try {
            File file = new File(context.getCacheDir(), "logcat_pending");
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (System.currentTimeMillis() - file2.lastModified() > 172800000) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private IBinder createFallbackService(String str) {
        return null;
    }

    public static BActivityThread currentActivityThread() {
        try {
            return BActivityThread.currentActivityThread();
        } catch (Exception unused) {
            return null;
        }
    }

    private void dumpLogcatSnapshot(File file) {
        if (file == null) {
            return;
        }
        try {
            InputStream inputStream = Runtime.getRuntime().exec("logcat -d").getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void ensureActivityContext(Activity activity) {
        try {
            BActivityThread.ensureActivityContext(activity);
        } catch (Exception unused) {
        }
    }

    private static void ensureProperInitialization() {
        try {
            try {
                NativeCore.init(Build.VERSION.SDK_INT);
            } catch (Exception e) {
                e.getMessage();
            }
            try {
                ServiceManager.initVirtualManagers();
            } catch (Exception e2) {
                e2.getMessage();
            }
            try {
                BActivityThread.hookActivityThread();
            } catch (Exception e3) {
                e3.getMessage();
            }
        } catch (Exception unused) {
        }
    }

    public static BlackBoxCore get() {
        return sBlackBoxCore;
    }

    private Context getAlternativeContext() {
        try {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext != null) {
                return applicationContext;
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static AppConfig getAppConfig() {
        try {
            return BActivityThread.getAppConfig();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppPackageName() {
        try {
            return BActivityThread.getAppPackageName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getAppPid() {
        try {
            return BActivityThread.getAppPid();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String getAppProcessName() {
        try {
            return BActivityThread.getAppProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Application getApplication() {
        try {
            return BActivityThread.getApplication();
        } catch (Exception unused) {
            return null;
        }
    }

    public static BActivityManager getBActivityManager() {
        return BActivityManager.get();
    }

    public static BJobManager getBJobManager() {
        return BJobManager.get();
    }

    public static BPackageManager getBPackageManager() {
        return BPackageManager.get();
    }

    public static BStorageManager getBStorageManager() {
        return BStorageManager.get();
    }

    public static int getBUid() {
        try {
            return BActivityThread.getBUid();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int getCallingBUid() {
        try {
            return BActivityThread.getCallingBUid();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Context getContext() {
        return sContext;
    }

    @SuppressLint({"HardwareIds"})
    private String getDeviceId(Context context) {
        try {
            String str = AbstractC2033oooOoo0.OooO00o;
            String str2 = (String) AbstractC2033oooOoo0.class.getMethod("getUID", null).invoke(null, null);
            if (str2 != null) {
                if (!str2.isEmpty()) {
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            return string != null ? !string.isEmpty() ? string : "unknown_device" : "unknown_device";
        } catch (Exception unused2) {
            return "unknown_device";
        }
    }

    public static String getHostPkg() {
        return get().getHostPackageName();
    }

    public static int getHostUid() {
        return get().mHostUid;
    }

    public static int getHostUserId() {
        return get().mHostUserId;
    }

    public static PackageManager getPackageManager() {
        return sContext.getPackageManager();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0052, code lost:
        r1 = r2.processName;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getProcessName(android.content.Context r5) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            java.lang.String r3 = "activity"
            if (r1 < r2) goto L2f
            java.lang.Object r1 = r5.getSystemService(r3)     // Catch: java.lang.Exception -> L2f
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Exception -> L2f
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L2f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L2f
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L2f
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Exception -> L2f
            int r4 = r2.pid     // Catch: java.lang.Exception -> L2f
            if (r4 != r0) goto L1c
            java.lang.String r1 = r2.processName     // Catch: java.lang.Exception -> L2f
            goto L30
        L2f:
            r1 = 0
        L30:
            if (r1 != 0) goto L56
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch: java.lang.Exception -> L55
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Exception -> L55
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch: java.lang.Exception -> L55
            if (r5 == 0) goto L56
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L55
        L42:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L56
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L55
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Exception -> L55
            int r3 = r2.pid     // Catch: java.lang.Exception -> L55
            if (r3 != r0) goto L42
            java.lang.String r1 = r2.processName     // Catch: java.lang.Exception -> L55
            goto L56
        L55:
        L56:
            if (r1 == 0) goto L59
            return r1
        L59:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "processName = null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.BlackBoxCore.getProcessName(android.content.Context):java.lang.String");
    }

    private IBinder getServiceInternal(String str) {
        IBinder iBinder = this.mServices.get(str);
        if (iBinder == null || !iBinder.isBinderAlive()) {
            if (isMainProcess() && !isBlackProcessRunning()) {
                startBlackProcess();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_B_|_server_name_", str);
                try {
                    Bundle callSafely = ProviderCall.callSafely(ProxyManifest.getBindProvider(), "VM", null, bundle);
                    if (callSafely == null) {
                        return createFallbackService(str);
                    }
                    IBinder binder = BundleCompat.getBinder(callSafely, "_B_|_server_");
                    Objects.toString(binder);
                    if (binder != null) {
                        this.mServices.put(str, binder);
                        return binder;
                    }
                    return createFallbackService(str);
                } catch (Exception e) {
                    if (System.currentTimeMillis() - currentTimeMillis > 3000) {
                        return createFallbackService(str);
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e2.getMessage();
                return createFallbackService(str);
            }
        }
        return iBinder;
    }

    public static int getUid() {
        try {
            return BActivityThread.getUid();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int getUserId() {
        try {
            return BActivityThread.getUserId();
        } catch (Exception unused) {
            return -1;
        }
    }

    private void handlePotentialAnr(Context context, long j) {
        try {
            File file = new File(context.getCacheDir(), "logcat_pending");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "anr_" + System.currentTimeMillis() + "_" + Process.myPid() + ".txt");
            appendAnrInfo(file2, j);
            dumpLogcatSnapshot(file2);
            uploadLogcatFile(context, file2);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void handleProcessBadError(int i, int i2) {
        if (i >= i2 - 1) {
            tryAlternativeStartupMethods();
            return;
        }
        try {
            scheduleProcessRecovery(i, i2);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void handleServerProcessBadError(int i, int i2) {
        if (i >= i2 - 1) {
            tryAlternativeServerStartupMethods();
            return;
        }
        try {
            scheduleServerProcessRecovery(i, i2);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void handleServerServiceStartFailure(int i, int i2, Exception exc) {
        if (i < i2 - 1) {
            return;
        }
        exc.getMessage();
        tryAlternativeServerStartupMethods();
    }

    private void handleServiceStartFailure(int i, int i2, Exception exc) {
        if (i < i2 - 1) {
            return;
        }
        exc.getMessage();
        tryAlternativeStartupMethods();
    }

    private void initNotificationManager() {
        NotificationManager notificationManager = (NotificationManager) getContext().getSystemService("notification");
        String str = getContext().getPackageName() + ".blackbox_core";
        if (BuildCompat.isOreo()) {
            NotificationChannel OooO0OO = Oooo0.OooO0OO(str);
            OooO0OO.enableLights(true);
            OooO0OO.setLightColor(-65536);
            OooO0OO.setShowBadge(true);
            OooO0OO.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(OooO0OO);
        }
    }

    private void initVpnService() {
        try {
            new Thread(new Runnable() { // from class: com.app.framework.BlackBoxCore.6
                {
                    BlackBoxCore.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Intent intent = new Intent(BlackBoxCore.getContext(), ProxyVpnService.class);
                        intent.setAction("android.net.VpnService");
                        if (BuildCompat.isOreo()) {
                            BlackBoxCore.getContext().startForegroundService(intent);
                        } else {
                            BlackBoxCore.getContext().startService(intent);
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }, "VPNServiceInit").start();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void installCrashUploadHandler(final Context context) {
        if (context == null || sCrashHandlerInstalled) {
            return;
        }
        synchronized (BlackBoxCore.class) {
            try {
                if (sCrashHandlerInstalled) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ninja.engine.o00o0OoO
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        BlackBoxCore.this.lambda$installCrashUploadHandler$4(context, defaultUncaughtExceptionHandler, thread, th);
                    }
                });
                sCrashHandlerInstalled = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void installSystemHooks() {
        try {
            SimpleCrashFix.installSimpleFix();
        } catch (Exception unused) {
        }
    }

    public static boolean is64Bit() {
        boolean is64Bit;
        if (BuildCompat.isM()) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        return Build.CPU_ABI.equals("arm64-v8a");
    }

    public boolean isBlackProcessRunning() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_B_|_server_name_", "test");
            try {
                if (ProviderCall.callSafely(ProxyManifest.getBindProvider(), "VM", null, bundle) != null) {
                    return true;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            try {
                String bindProvider = ProxyManifest.getBindProvider();
                if (bindProvider != null && !bindProvider.isEmpty()) {
                    if (getContext().getPackageManager().resolveContentProvider(bindProvider, 0) != null) {
                        return false;
                    }
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
            try {
                ActivityManager activityManager = (ActivityManager) getContext().getSystemService("activity");
                if (activityManager != null) {
                    for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
                        if (runningServiceInfo.service.getClassName().contains(DaemonService.TAG)) {
                            return true;
                        }
                    }
                }
            } catch (Exception e3) {
                e3.getMessage();
            }
            return false;
        } catch (Exception e4) {
            e4.getMessage();
            return false;
        }
    }

    private boolean isLogcatEnabledOnServer() {
        if (sLogcatUploadUrl != null && !sLogcatUploadUrl.isEmpty()) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sLogcatUploadUrl).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                boolean z = true;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/x-www-form-urlencoded");
                byte[] bytes = "action=check".getBytes(StandardCharsets.UTF_8);
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(bytes);
                    outputStream.close();
                    if (httpURLConnection.getResponseCode() == 200) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            String sb2 = sb.toString();
                            if (!sb2.contains("\"logcat-enabled\":true")) {
                                if (!sb2.contains("\"logcat-enabled\": true")) {
                                    z = false;
                                }
                            }
                            bufferedReader.close();
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th = th2;
                                th.addSuppressed(th);
                                throw th;
                            }
                            throw th;
                        }
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable th3) {
                    th = th3;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th4) {
                            th = th4;
                            th.addSuppressed(th);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return false;
    }

    public static boolean isRunningApplication(String str, int i) {
        Map map;
        String str2;
        try {
        } catch (Exception e) {
            e.getMessage();
        }
        if (((ActivityManager) getContext().getSystemService("activity")) == null) {
            return false;
        }
        ServiceManager.get();
        ActivityStack activityStack = (ActivityStack) ServiceManager.getService(ServiceManager.ACTIVITY_MANAGER);
        if (activityStack == null || (map = (Map) Reflector.with(activityStack).field("mTasks").get()) == null) {
            return false;
        }
        for (TaskRecord taskRecord : map.values()) {
            if (taskRecord.userId == i && (str2 = taskRecord.taskAffinity) != null && str2.contains(str)) {
                for (ActivityRecord activityRecord : taskRecord.activities) {
                    if (!activityRecord.finished) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public static boolean isThreadInit() {
        try {
            return BActivityThread.isThreadInit();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean isValidProcessState() {
        try {
            if (getContext() != null && isMainProcess()) {
                try {
                    getContext().getPackageName();
                    return true;
                } catch (Exception e) {
                    e.getMessage();
                    return false;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0038 A[Catch: Exception -> 0x0015, TryCatch #4 {Exception -> 0x0015, blocks: (B:67:0x0002, B:72:0x000e, B:80:0x0020, B:83:0x0027, B:85:0x0038, B:86:0x003b, B:115:0x00b6, B:77:0x0018, B:87:0x0069, B:98:0x009a, B:88:0x0081, B:97:0x0097, B:90:0x0088, B:91:0x008a, B:93:0x0091), top: B:123:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0091 A[Catch: all -> 0x0095, LOOP:0: B:91:0x008a->B:93:0x0091, LOOP_END, TRY_LEAVE, TryCatch #6 {Exception -> 0x009e, blocks: (B:87:0x0069, B:98:0x009a, B:88:0x0081, B:97:0x0097, B:90:0x0088, B:91:0x008a, B:93:0x0091), top: B:119:0x0069, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void lambda$bootstrapStartupLogcatCapture$3(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "startup_"
            java.lang.String r1 = r6.safeGetProcessName(r7)     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = r6.getHostPackageName()     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L18
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L15
            if (r3 == 0) goto L1c
            goto L18
        L15:
            r7 = move-exception
            goto Lba
        L18:
            java.lang.String r2 = r7.getPackageName()     // Catch: java.lang.Exception -> L15
        L1c:
            if (r1 == 0) goto L27
            if (r2 == 0) goto L27
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L15
            if (r1 != 0) goto L27
            return
        L27:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L15
            java.io.File r2 = r7.getCacheDir()     // Catch: java.lang.Exception -> L15
            java.lang.String r3 = "logcat_pending"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L15
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L15
            if (r2 != 0) goto L3b
            r1.mkdirs()     // Catch: java.lang.Exception -> L15
        L3b:
            r6.uploadPendingLogcats(r7)     // Catch: java.lang.Exception -> L15
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L15
            r3.<init>(r0)     // Catch: java.lang.Exception -> L15
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L15
            r3.append(r4)     // Catch: java.lang.Exception -> L15
            java.lang.String r0 = "_"
            r3.append(r0)     // Catch: java.lang.Exception -> L15
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L15
            r3.append(r0)     // Catch: java.lang.Exception -> L15
            java.lang.String r0 = ".txt"
            r3.append(r0)     // Catch: java.lang.Exception -> L15
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L15
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L15
            r6.mCurrentLogcatFile = r2     // Catch: java.lang.Exception -> L15
            r6.installCrashUploadHandler(r7)     // Catch: java.lang.Exception -> L15
            java.lang.String r7 = "logcat -c"
            r0 = 0
            com.app.framework.utils.ShellUtils.execCommand(r7, r0)     // Catch: java.lang.Exception -> L9e
            java.lang.Runtime r7 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Exception -> L9e
            java.lang.String r1 = "logcat"
            java.lang.Process r7 = r7.exec(r1)     // Catch: java.lang.Exception -> L9e
            r6.mLogcatProcess = r7     // Catch: java.lang.Exception -> L9e
            java.lang.Process r7 = r6.mLogcatProcess     // Catch: java.lang.Exception -> L9e
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Exception -> L9e
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La0
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L95
        L8a:
            int r3 = r7.read(r2)     // Catch: java.lang.Throwable -> L95
            r4 = -1
            if (r3 == r4) goto L97
            r1.write(r2, r0, r3)     // Catch: java.lang.Throwable -> L95
            goto L8a
        L95:
            r0 = move-exception
            goto La2
        L97:
            r1.close()     // Catch: java.lang.Throwable -> La0
            r7.close()     // Catch: java.lang.Exception -> L9e
            goto Lbd
        L9e:
            r7 = move-exception
            goto Lb6
        La0:
            r0 = move-exception
            goto Lab
        La2:
            r1.close()     // Catch: java.lang.Throwable -> La6
            goto Laa
        La6:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> La0
        Laa:
            throw r0     // Catch: java.lang.Throwable -> La0
        Lab:
            if (r7 == 0) goto Lb5
            r7.close()     // Catch: java.lang.Throwable -> Lb1
            goto Lb5
        Lb1:
            r7 = move-exception
            r0.addSuppressed(r7)     // Catch: java.lang.Exception -> L9e
        Lb5:
            throw r0     // Catch: java.lang.Exception -> L9e
        Lb6:
            r7.getMessage()     // Catch: java.lang.Exception -> L15
            goto Lbd
        Lba:
            r7.getMessage()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.BlackBoxCore.lambda$bootstrapStartupLogcatCapture$3(android.content.Context):void");
    }

    public /* synthetic */ void lambda$installCrashUploadHandler$4(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        try {
            try {
                if (this.mLogcatProcess != null) {
                    this.mLogcatProcess.destroy();
                }
                File file = this.mCurrentLogcatFile;
                if (file == null) {
                    File file2 = new File(context.getCacheDir(), "logcat_pending");
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    File file3 = new File(file2, "crash_" + System.currentTimeMillis() + "_" + Process.myPid() + ".txt");
                    this.mCurrentLogcatFile = file3;
                    dumpLogcatSnapshot(file3);
                    file = file3;
                }
                appendCrashInfo(file, th);
                uploadLogcatFile(context, file);
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } catch (Exception e) {
                e.getMessage();
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
            throw th2;
        }
    }

    public static /* synthetic */ void lambda$setLogcatUploadUrl$0(Context context) {
        try {
            get().uploadPendingLogcats(context);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public /* synthetic */ void lambda$startAnrWatchdog$2(Context context) {
        while (true) {
            try {
                Thread.sleep(ANR_POLL_MS);
                long currentTimeMillis = System.currentTimeMillis() - this.mMainThreadHeartbeatMs;
                if (currentTimeMillis >= 10000) {
                    if (!this.mAnrReported) {
                        this.mAnrReported = true;
                        handlePotentialAnr(context, currentTimeMillis);
                    }
                } else if (currentTimeMillis < JarConfig.MAX_RETRY_DELAY_MS) {
                    this.mAnrReported = false;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public /* synthetic */ void lambda$startLogcat$1() {
        boolean isAlive;
        Context context = getContext();
        startAnrWatchdog(context);
        if (!isLogcatEnabledOnServer()) {
            cleanStalePendingLogcats(context);
            return;
        }
        uploadPendingLogcats(context);
        File file = new File(context.getCacheDir(), "logcat_pending");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "session_" + System.currentTimeMillis() + ".txt");
        this.mCurrentLogcatFile = file2;
        installCrashUploadHandler(context);
        if (this.mLogcatProcess != null) {
            isAlive = this.mLogcatProcess.isAlive();
            if (isAlive) {
                return;
            }
        }
        try {
            ShellUtils.execCommand("logcat -c", false);
            this.mLogcatProcess = Runtime.getRuntime().exec("logcat");
            InputStream inputStream = this.mLogcatProcess.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static Object mainThread() {
        return ((InterfaceC1597oo0oOOo0) C0217o00o0oO0.create(InterfaceC1597oo0oOOo0.class, null, false)).currentActivityThread();
    }

    private void notifyServiceAvailableCallbacks() {
        synchronized (this.mServiceCallbackLock) {
            if (!this.mServiceAvailableCallbacks.isEmpty()) {
                this.mServiceAvailableCallbacks.size();
                for (Runnable runnable : this.mServiceAvailableCallbacks) {
                    try {
                        runnable.run();
                    } catch (Exception unused) {
                    }
                }
                this.mServiceAvailableCallbacks.clear();
            }
        }
    }

    public void refreshProcessContext() {
    }

    public void refreshServerProcessContext() {
    }

    private String safeGetProcessName(Context context) {
        try {
            return getProcessName(context);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private void scheduleDelayedRetry(final Intent intent, int i) {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.app.framework.BlackBoxCore.1
                {
                    BlackBoxCore.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (BuildCompat.isOreo()) {
                            BlackBoxCore.getContext().startForegroundService(intent);
                        } else {
                            BlackBoxCore.getContext().startService(intent);
                        }
                    } catch (Exception e) {
                        e.getMessage();
                        BlackBoxCore.this.tryAlternativeStartupMethods();
                    }
                }
            }, i * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        } catch (Exception e) {
            e.getMessage();
            tryAlternativeStartupMethods();
        }
    }

    private void scheduleDelayedServerRetry(final Intent intent, int i) {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.app.framework.BlackBoxCore.9
                {
                    BlackBoxCore.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (BuildCompat.isOreo()) {
                            BlackBoxCore.getContext().startForegroundService(intent);
                        } else {
                            BlackBoxCore.getContext().startService(intent);
                        }
                    } catch (Exception e) {
                        e.getMessage();
                        BlackBoxCore.this.tryAlternativeServerStartupMethods();
                    }
                }
            }, i * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        } catch (Exception e) {
            e.getMessage();
            tryAlternativeServerStartupMethods();
        }
    }

    private void scheduleDelayedServerServiceStart() {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.app.framework.BlackBoxCore.8
                {
                    BlackBoxCore.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (BlackBoxCore.this.isServerProcess() && BlackBoxCore.this.mClientConfiguration.isEnableDaemonService()) {
                        try {
                            Intent intent = new Intent();
                            intent.setClass(BlackBoxCore.getContext(), DaemonService.class);
                            intent.addFlags(268435456);
                            if (BuildCompat.isOreo()) {
                                BlackBoxCore.getContext().startForegroundService(intent);
                            } else {
                                BlackBoxCore.getContext().startService(intent);
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    }
                }
            }, JarConfig.MAX_RETRY_DELAY_MS);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void scheduleDelayedServiceStart() {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.app.framework.BlackBoxCore.4
                {
                    BlackBoxCore.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (!BlackBoxCore.this.isMainProcess() || BlackBoxCore.this.isBlackProcessRunning()) {
                        return;
                    }
                    BlackBoxCore.this.startBlackProcess();
                }
            }, JarConfig.MAX_RETRY_DELAY_MS);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void scheduleProcessRecovery(int i, int i2) {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.app.framework.BlackBoxCore.3
                {
                    BlackBoxCore.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BlackBoxCore.this.refreshProcessContext();
                        if (!BlackBoxCore.this.isMainProcess() || BlackBoxCore.this.isBlackProcessRunning()) {
                            return;
                        }
                        BlackBoxCore.this.startBlackProcess();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }, 2000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void scheduleProviderCheck() {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.app.framework.BlackBoxCore.2
                {
                    BlackBoxCore.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("_B_|_server_name_", "test");
                        ProviderCall.callSafely(ProxyManifest.getBindProvider(), "VM", null, bundle);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }, 1000L);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void scheduleServerProcessRecovery(int i, int i2) {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.app.framework.BlackBoxCore.7
                {
                    BlackBoxCore.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BlackBoxCore.this.refreshServerProcessContext();
                        if (BlackBoxCore.this.isServerProcess() && BlackBoxCore.this.mClientConfiguration.isEnableDaemonService()) {
                            Intent intent = new Intent();
                            intent.setClass(BlackBoxCore.getContext(), DaemonService.class);
                            intent.addFlags(268435456);
                            if (BuildCompat.isOreo()) {
                                BlackBoxCore.getContext().startForegroundService(intent);
                            } else {
                                BlackBoxCore.getContext().startService(intent);
                            }
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }, 2000);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|(11:36|37|(2:31|32)|(2:8|9)|13|14|15|16|17|18|20)|5|(0)|(0)|13|14|15|16|17|18|20) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0033, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0034, code lost:
        r3.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setEssentialProperties(android.content.Context r3, com.app.framework.app.configuration.ClientConfiguration r4) {
        /*
            r2 = this;
            java.lang.String r0 = "true"
            if (r4 == 0) goto L61
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r4 < r1) goto L19
            java.lang.String r4 = "L"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L15
            boolean r4 = com.ninja.engine.AbstractC0707oO000oO0.OooO0O0(r4)     // Catch: java.lang.Throwable -> L15
            goto L1a
        L15:
            r4 = move-exception
            r4.getMessage()
        L19:
            r4 = 0
        L1a:
            if (r4 != 0) goto L25
            boolean r4 = com.app.framework.core.NativeCore.disableHiddenApi()     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r1 = move-exception
            r1.getMessage()
        L25:
            if (r4 != 0) goto L2f
            me.weishu.reflection.Reflection.OooO00o(r3)     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r3 = move-exception
            r3.getMessage()
        L2f:
            com.app.framework.core.NativeCore.disableResourceLoading()     // Catch: java.lang.Exception -> L33
            goto L37
        L33:
            r3 = move-exception
            r3.getMessage()
        L37:
            java.lang.String r3 = "android.view.WindowManager.IGNORE_WINDOW_LEAKS"
            java.lang.System.setProperty(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.String r3 = "android.app.Activity.IGNORE_WINDOW_LEAKS"
            java.lang.System.setProperty(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.String r3 = "android.view.WindowManager.SUPPRESS_WINDOW_LEAK_WARNINGS"
            java.lang.System.setProperty(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.String r3 = "android.app.ResourcesManager"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r4 = "mDisableOverlayLoading"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Exception -> L57
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L57
            goto L60
        L57:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Exception -> L5c
            goto L60
        L5c:
            r3 = move-exception
            r3.getMessage()
        L60:
            return
        L61:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ClientConfiguration is null!"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.BlackBoxCore.setEssentialProperties(android.content.Context, com.app.framework.app.configuration.ClientConfiguration):void");
    }

    public static void setLogcatUploadUrl(String str) {
        sLogcatUploadUrl = str;
        try {
            Context context = sContext;
            if (context == null || str == null || str.isEmpty()) {
                return;
            }
            new Thread(new RunnableC0087o000Oo0O(context, 1), "PendingLogcatUpload").start();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void startAnrWatchdog(Context context) {
        if (context == null || sAnrWatchdogStarted) {
            return;
        }
        synchronized (BlackBoxCore.class) {
            try {
                if (sAnrWatchdogStarted) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.mMainThreadHeartbeatMs = System.currentTimeMillis();
                this.mAnrReported = false;
                this.mHandler.post(new Runnable() { // from class: com.app.framework.BlackBoxCore.5
                    {
                        BlackBoxCore.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        BlackBoxCore.this.mMainThreadHeartbeatMs = System.currentTimeMillis();
                        BlackBoxCore.this.mHandler.postDelayed(this, 1000L);
                    }
                });
                Thread thread = new Thread(new RunnableC0208o00o0Oo(this, context, 1), "AnrWatchdog");
                thread.setDaemon(true);
                thread.start();
                sAnrWatchdogStarted = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void startBlackProcess() {
        try {
            if (!isValidProcessState()) {
                scheduleDelayedServiceStart();
                return;
            }
            Intent intent = new Intent();
            intent.setClass(getContext(), DaemonService.class);
            intent.addFlags(268435456);
            boolean z = false;
            for (int i = 0; i < 3 && !z; i++) {
                if (i > 0 && i != 1) {
                    scheduleDelayedRetry(intent, i);
                    return;
                }
                try {
                    if (BuildCompat.isOreo()) {
                        getContext().startForegroundService(intent);
                    } else {
                        getContext().startService(intent);
                    }
                } catch (SecurityException e) {
                    if (e.getMessage() != null && e.getMessage().contains("MissingForegroundServiceTypeException")) {
                        try {
                            getContext().startService(intent);
                        } catch (Exception e2) {
                            e2.getMessage();
                            handleServiceStartFailure(i, 3, e);
                        }
                    } else if (e.getMessage() == null || !e.getMessage().contains("process is bad")) {
                        e.getMessage();
                        e = e;
                        handleServiceStartFailure(i, 3, e);
                    } else {
                        handleProcessBadError(i, 3);
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.getMessage();
                    handleServiceStartFailure(i, 3, e);
                }
                z = true;
            }
            if (z) {
                scheduleProviderCheck();
            } else {
                tryAlternativeStartupMethods();
            }
        } catch (Exception unused) {
            scheduleDelayedServiceStart();
        }
    }

    private void startLogcat() {
        new Thread(new RunnableC0061o00000oO(3, this), "LogcatCapture").start();
    }

    public void tryAlternativeServerStartupMethods() {
        try {
            Context alternativeContext = getAlternativeContext();
            if (alternativeContext != null) {
                Intent intent = new Intent();
                intent.setClass(alternativeContext, DaemonService.class);
                alternativeContext.startService(intent);
                return;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext == null || applicationContext == getContext()) {
                return;
            }
            Intent intent2 = new Intent();
            intent2.setClass(applicationContext, DaemonService.class);
            applicationContext.startService(intent2);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void tryAlternativeStartupMethods() {
        try {
            Context alternativeContext = getAlternativeContext();
            if (alternativeContext != null) {
                Intent intent = new Intent();
                intent.setClass(alternativeContext, DaemonService.class);
                alternativeContext.startService(intent);
                return;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext == null || applicationContext == getContext()) {
                return;
            }
            Intent intent2 = new Intent();
            intent2.setClass(applicationContext, DaemonService.class);
            applicationContext.startService(intent2);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void uploadLogcatFile(Context context, File file) {
        String str;
        String str2;
        Path path;
        byte[] readAllBytes;
        String str3 = "unknown";
        if (sLogcatUploadUrl == null || sLogcatUploadUrl.isEmpty() || !file.exists() || file.length() == 0) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("configuration-app", 0);
        String string = sharedPreferences.getString("username-activation", null);
        String string2 = sharedPreferences.getString("password-activation", null);
        if (string == null) {
            string = "";
        }
        if (string2 == null) {
            string2 = "";
        }
        try {
            str = getDeviceId(context);
        } catch (Exception unused) {
            str = "unknown";
        }
        String str4 = Build.MANUFACTURER + " " + Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        try {
            long length = file.length();
            if (length > 5242880) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                randomAccessFile.seek(length - 5242880);
                byte[] bArr = new byte[(int) 5242880];
                randomAccessFile.readFully(bArr);
                str2 = new String(bArr, StandardCharsets.UTF_8);
                randomAccessFile.close();
            } else {
                path = file.toPath();
                readAllBytes = Files.readAllBytes(path);
                str2 = new String(readAllBytes, StandardCharsets.UTF_8);
            }
            try {
                str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception unused2) {
            }
            try {
                System.currentTimeMillis();
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sLogcatUploadUrl).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setConnectTimeout(BUserHandle.AID_APP_START);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/x-www-form-urlencoded");
                byte[] bytes = ("username-activation=" + URLEncoder.encode(string, "UTF-8") + "&password-activation=" + URLEncoder.encode(string2, "UTF-8") + "&user-device-id=" + URLEncoder.encode(str, "UTF-8") + "&device-model=" + URLEncoder.encode(str4, "UTF-8") + "&android-version=" + i + "&app-version=" + URLEncoder.encode(str3, "UTF-8") + "&logcat-data=" + URLEncoder.encode(str2, "UTF-8")).getBytes(StandardCharsets.UTF_8);
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200 || responseCode == 429) {
                    file.delete();
                }
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.getMessage();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void uploadPendingLogcats(Context context) {
        File[] listFiles;
        try {
            File file = new File(context.getCacheDir(), "logcat_pending");
            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (System.currentTimeMillis() - file2.lastModified() > 172800000) {
                        file2.delete();
                        file2.getName();
                    } else {
                        uploadLogcatFile(context, file2);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void addAppLifecycleCallback(AppLifecycleCallback appLifecycleCallback) {
        this.mAppLifecycleCallbacks.add(appLifecycleCallback);
    }

    public void addServiceAvailableCallback(Runnable runnable) {
        synchronized (this.mServiceCallbackLock) {
            try {
                if (this.mServicesInitialized) {
                    runnable.run();
                } else {
                    this.mServiceAvailableCallbacks.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean areServicesAvailable() {
        if (this.mServicesInitialized) {
            return true;
        }
        try {
            if (!isMainProcess() || isBlackProcessRunning()) {
                String[] strArr = {ServiceManager.ACTIVITY_MANAGER, ServiceManager.PACKAGE_MANAGER, ServiceManager.STORAGE_MANAGER, ServiceManager.USER_MANAGER, ServiceManager.JOB_MANAGER, ServiceManager.XPOSED_MANAGER, ServiceManager.ACCOUNT_MANAGER, ServiceManager.LOCATION_MANAGER, ServiceManager.NOTIFICATION_MANAGER};
                for (int i = 0; i < 9; i++) {
                    String str = strArr[i];
                    try {
                        getServiceInternal(str);
                    } catch (Exception unused) {
                        IBinder createFallbackService = createFallbackService(str);
                        if (createFallbackService != null) {
                            this.mServices.put(str, createFallbackService);
                        }
                    }
                }
                this.mServicesInitialized = true;
                notifyServiceAvailableCallbacks();
                return true;
            }
            startBlackProcess();
            String[] strArr2 = {ServiceManager.ACTIVITY_MANAGER, ServiceManager.PACKAGE_MANAGER, ServiceManager.STORAGE_MANAGER, ServiceManager.USER_MANAGER, ServiceManager.JOB_MANAGER, ServiceManager.XPOSED_MANAGER, ServiceManager.ACCOUNT_MANAGER, ServiceManager.LOCATION_MANAGER, ServiceManager.NOTIFICATION_MANAGER};
            for (int i2 = 0; i2 < 9; i2++) {
                String str2 = strArr2[i2];
                try {
                    IBinder createFallbackService2 = createFallbackService(str2);
                    if (createFallbackService2 != null) {
                        this.mServices.put(str2, createFallbackService2);
                    }
                } catch (Exception unused2) {
                }
            }
            this.mServicesInitialized = true;
            notifyServiceAvailableCallbacks();
            return true;
        } catch (Exception e) {
            e.getMessage();
            try {
                String[] strArr3 = {ServiceManager.ACTIVITY_MANAGER, ServiceManager.PACKAGE_MANAGER, ServiceManager.STORAGE_MANAGER, ServiceManager.USER_MANAGER, ServiceManager.JOB_MANAGER, ServiceManager.XPOSED_MANAGER, ServiceManager.ACCOUNT_MANAGER, ServiceManager.LOCATION_MANAGER, ServiceManager.NOTIFICATION_MANAGER};
                for (int i3 = 0; i3 < 9; i3++) {
                    String str3 = strArr3[i3];
                    try {
                        IBinder createFallbackService3 = createFallbackService(str3);
                        if (createFallbackService3 != null) {
                            this.mServices.put(str3, createFallbackService3);
                        }
                    } catch (Exception unused3) {
                    }
                }
                this.mServicesInitialized = true;
                notifyServiceAvailableCallbacks();
                return true;
            } catch (Exception unused4) {
                this.mServicesInitialized = false;
                return false;
            }
        }
    }

    public void clearPackage(String str, int i) {
        BPackageManager.get().clearPackage(str, i);
    }

    public void closeCodeInit() {
        try {
            Entry.class.getDeclaredMethod("attach", null).invoke(null, null);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public BUserInfo createUser(int i) {
        return BUserManager.get().createUser(i);
    }

    public void deleteUser(int i) {
        BUserManager.get().deleteUser(i);
    }

    public void doAttachBaseContext(Context context, ClientConfiguration clientConfiguration) {
        sContext = context;
        this.mClientConfiguration = clientConfiguration;
        bootstrapStartupLogcatCapture(context);
        try {
            setEssentialProperties(context, clientConfiguration);
            try {
                WindowManager.class.getDeclaredField("mIgnoreWindowLeaks").setAccessible(true);
            } catch (Exception e) {
                e.getMessage();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        installSystemHooks();
        initNotificationManager();
        String processName = getProcessName(getContext());
        if (processName.equals(getHostPkg())) {
            this.mProcessType = ProcessType.Main;
            startLogcat();
        } else {
            this.mProcessType = processName.endsWith(getContext().getString(R.string.black_box_service_name)) ? ProcessType.Server : ProcessType.BAppClient;
        }
        if (get().isBlackProcess()) {
            BEnvironment.load();
            processName.endsWith("p0");
        }
        if (isServerProcess() && clientConfiguration.isEnableDaemonService()) {
            try {
                if (!isValidProcessState()) {
                    scheduleDelayedServerServiceStart();
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(getContext(), DaemonService.class);
                intent.addFlags(268435456);
                boolean z = false;
                for (int i = 0; i < 3 && !z; i++) {
                    if (i > 0 && i != 1) {
                        scheduleDelayedServerRetry(intent, i);
                        return;
                    }
                    try {
                        if (BuildCompat.isOreo()) {
                            getContext().startForegroundService(intent);
                        } else {
                            getContext().startService(intent);
                        }
                    } catch (SecurityException e3) {
                        e = e3;
                        if (e.getMessage() != null && e.getMessage().contains("MissingForegroundServiceTypeException")) {
                            try {
                                getContext().startService(intent);
                            } catch (Exception e4) {
                                e = e4;
                                e.getMessage();
                                handleServerServiceStartFailure(i, 3, e);
                            }
                        } else if (e.getMessage() != null && e.getMessage().contains("process is bad")) {
                            handleServerProcessBadError(i, 3);
                        }
                        e.getMessage();
                        handleServerServiceStartFailure(i, 3, e);
                    } catch (Exception e5) {
                        e = e5;
                        e.getMessage();
                        handleServerServiceStartFailure(i, 3, e);
                    }
                    z = true;
                }
                if (!z) {
                    tryAlternativeServerStartupMethods();
                }
            } catch (Exception e6) {
                e6.getMessage();
                scheduleDelayedServerServiceStart();
            }
        }
        HookManager.get().init();
    }

    public void doCreate() {
        installSystemHooks();
        System.currentTimeMillis();
        try {
            ensureBlackProcessInitialized();
            System.currentTimeMillis();
            ensureProperInitialization();
            if (isBlackProcess()) {
                ContentProviderDelegate.init();
            }
            if (!isServerProcess()) {
                try {
                    ServiceManager.initVirtualManagers();
                } catch (Exception e) {
                    e.getMessage();
                }
                getBPackageManager().resetTransactionThrottler();
            }
            System.currentTimeMillis();
        } catch (Exception unused) {
            System.currentTimeMillis();
            try {
                if (isServerProcess()) {
                    return;
                }
                ServiceManager.initVirtualManagers();
            } catch (Exception unused2) {
            }
        }
    }

    public void earlyBootstrap(Context context) {
        if (context == null) {
            return;
        }
        if (sContext == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            sContext = applicationContext;
        }
        installCrashUploadHandler(context);
        bootstrapStartupLogcatCapture(context);
        startAnrWatchdog(context);
    }

    public void ensureBlackProcessInitialized() {
        if (!isMainProcess() || isBlackProcessRunning()) {
            return;
        }
        startBlackProcess();
        for (int i = 0; i < 5 && !isBlackProcessRunning(); i++) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        isBlackProcessRunning();
    }

    public List<AppLifecycleCallback> getAppLifecycleCallbacks() {
        return this.mAppLifecycleCallbacks;
    }

    public String getCurrentAppPackage() {
        String str = this.mCurrentAppPackage;
        return str != null ? str : getHostPackageName();
    }

    public int getCurrentAppUid() {
        int i = this.mCurrentAppUid;
        return i > 0 ? i : this.mHostUid;
    }

    public Thread.UncaughtExceptionHandler getExceptionHandler() {
        return this.mExceptionHandler;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public String getHostPackageName() {
        return this.mClientConfiguration.getHostPackageName();
    }

    public List<ApplicationInfo> getInstalledApplications(int i, int i2) {
        return getBPackageManager().getInstalledApplications(i, i2);
    }

    public List<PackageInfo> getInstalledPackages(int i, int i2) {
        return getBPackageManager().getInstalledPackages(i, i2);
    }

    public List<InstalledModule> getInstalledXPModules() {
        return BXposedManager.get().getInstalledModules();
    }

    public IBinder getService(String str) {
        if (areServicesAvailable()) {
            return getServiceInternal(str);
        }
        return null;
    }

    public List<BUserInfo> getUsers() {
        return BUserManager.get().getUsers();
    }

    public InstallResult installGms(int i) {
        return GmsCore.installGApps(i);
    }

    public InstallResult installPackageAsUser(Uri uri, int i) {
        return getBPackageManager().installPackageAsUser(uri.toString(), InstallOption.installByStorage().makeUriFile(), i);
    }

    public InstallResult installXPModule(Uri uri) {
        return getBPackageManager().installPackageAsUser(uri.toString(), InstallOption.installByStorage().makeXposed().makeUriFile(), -4);
    }

    public boolean isBlackBoxApp(File file) {
        PackageInfo packageArchiveInfo;
        if (file != null) {
            try {
                if (file.exists() && (packageArchiveInfo = getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0)) != null) {
                    return packageArchiveInfo.packageName.equals(getHostPkg());
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return false;
    }

    public boolean isBlackProcess() {
        return this.mProcessType == ProcessType.BAppClient;
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public boolean isHideRoot() {
        return this.mClientConfiguration.isHideRoot();
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public boolean isHideXposed() {
        return this.mClientConfiguration.isHideXposed();
    }

    public boolean isInstallGms(int i) {
        return GmsCore.isInstalledGoogleService(i);
    }

    public boolean isInstalled(String str, int i) {
        return getBPackageManager().isInstalled(str, i);
    }

    public boolean isInstalledXposedModule(String str) {
        return isInstalled(str, -4);
    }

    public boolean isMainProcess() {
        return this.mProcessType == ProcessType.Main;
    }

    public boolean isModuleEnable(String str) {
        return BXposedManager.get().isModuleEnable(str);
    }

    public boolean isSandboxedEnvironment() {
        return this.mIsSandboxedEnvironment;
    }

    public boolean isServerProcess() {
        return this.mProcessType == ProcessType.Server;
    }

    public boolean isServicesAvailable() {
        return this.mServicesInitialized;
    }

    public boolean isSupportGms() {
        return GmsCore.isSupportGms();
    }

    public boolean isXPEnable() {
        return BXposedManager.get().isXPEnable();
    }

    public boolean isXposedModule(File file) {
        return XposedParserCompat.isXPModule(file.getAbsolutePath());
    }

    public boolean launchApk(String str, int i) {
        onBeforeMainLaunchApk(str, i);
        Intent launchIntentForPackage = getBPackageManager().getLaunchIntentForPackage(str, i);
        if (launchIntentForPackage == null) {
            return false;
        }
        startActivity(launchIntentForPackage, i);
        return true;
    }

    public void onAfterMainActivityOnCreate(Activity activity) {
        for (AppLifecycleCallback appLifecycleCallback : get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.afterMainActivityOnCreate(activity);
        }
    }

    public void onAfterMainApplicationAttach(Application application, Context context) {
        for (AppLifecycleCallback appLifecycleCallback : get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.afterMainApplicationAttach(application, context);
        }
    }

    public void onBeforeMainActivityOnCreate(Activity activity) {
        for (AppLifecycleCallback appLifecycleCallback : get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.beforeMainActivityOnCreate(activity);
        }
    }

    public void onBeforeMainApplicationAttach(Application application, Context context) {
        for (AppLifecycleCallback appLifecycleCallback : get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.beforeMainApplicationAttach(application, context);
        }
    }

    public void onBeforeMainLaunchApk(String str, int i) {
        for (AppLifecycleCallback appLifecycleCallback : get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.beforeMainLaunchApk(str, i);
        }
    }

    public void removeAppLifecycleCallback(AppLifecycleCallback appLifecycleCallback) {
        this.mAppLifecycleCallbacks.remove(appLifecycleCallback);
    }

    public void removeServiceAvailableCallback(Runnable runnable) {
        synchronized (this.mServiceCallbackLock) {
            this.mServiceAvailableCallbacks.remove(runnable);
        }
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public boolean requestInstallPackage(File file, int i) {
        return this.mClientConfiguration.requestInstallPackage(file, i);
    }

    public int resolveUidForOperation(int i, String str) {
        if ((i <= 0 || i >= 10000) && i <= 19999) {
            try {
                if (this.mIsSandboxedEnvironment) {
                    int i2 = this.mCurrentAppUid;
                    if (i2 > 0) {
                        return i2;
                    }
                }
                return i;
            } catch (Exception e) {
                e.getMessage();
                return i;
            }
        }
        return i;
    }

    public void setCurrentAppUid(int i, String str) {
        this.mCurrentAppUid = i;
        this.mCurrentAppPackage = str;
        if (i == this.mHostUid || i <= 10000 || i >= 19999) {
            return;
        }
        this.mIsSandboxedEnvironment = true;
    }

    public void setExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.mExceptionHandler = uncaughtExceptionHandler;
    }

    public void setModuleEnable(String str, boolean z) {
        BXposedManager.get().setModuleEnable(str, z);
    }

    public void setXPEnable(boolean z) {
        BXposedManager.get().setXPEnable(z);
    }

    public void startActivity(Intent intent, int i) {
        if (this.mClientConfiguration.isEnableLauncherActivity()) {
            LauncherActivity.launch(intent, i);
        } else {
            getBActivityManager().startActivity(intent, i);
        }
    }

    public void stopPackage(String str, int i) {
        BPackageManager.get().stopPackage(str, i);
    }

    public boolean uninstallGms(int i) {
        GmsCore.uninstallGApps(i);
        return !GmsCore.isInstalledGoogleService(i);
    }

    public void uninstallPackage(String str) {
        getBPackageManager().uninstallPackage(str);
    }

    public void uninstallPackageAsUser(String str, int i) {
        getBPackageManager().uninstallPackageAsUser(str, i);
    }

    public void uninstallXPModule(String str) {
        uninstallPackage(str);
    }

    public boolean waitForServicesAvailable(long j) {
        if (this.mServicesInitialized) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        while (!this.mServicesInitialized && System.currentTimeMillis() - currentTimeMillis < j) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return this.mServicesInitialized;
    }

    public InstallResult installPackageAsUser(File file, int i) {
        try {
            PackageInfo packageArchiveInfo = getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
            if (packageArchiveInfo != null && packageArchiveInfo.packageName.equals(getHostPkg())) {
                return new InstallResult().installError("Cannot clone BlackBox app from within BlackBox. This would create infinite recursion and is not allowed for security reasons.");
            }
        } catch (Exception unused) {
            file.getAbsolutePath();
        }
        return getBPackageManager().installPackageAsUser(file.getAbsolutePath(), InstallOption.installByStorage(), i);
    }

    public InstallResult installXPModule(File file) {
        return getBPackageManager().installPackageAsUser(file.getAbsolutePath(), InstallOption.installByStorage().makeXposed(), -4);
    }

    public boolean isBlackBoxApp(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.equals(getHostPkg());
    }

    public InstallResult installPackageAsUser(String str, int i) {
        try {
            if (str.equals(getHostPkg())) {
                return new InstallResult().installError("Cannot clone BlackBox app from within BlackBox. This would create infinite recursion and is not allowed for security reasons.");
            }
            return getBPackageManager().installPackageAsUser(getPackageManager().getPackageInfo(str, 0).applicationInfo.sourceDir, InstallOption.installBySystem(), i);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return new InstallResult().installError(e.getMessage());
        }
    }

    public InstallResult installXPModule(String str) {
        try {
            return getBPackageManager().installPackageAsUser(getPackageManager().getPackageInfo(str, 0).applicationInfo.sourceDir, InstallOption.installBySystem().makeXposed(), -4);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return new InstallResult().installError(e.getMessage());
        }
    }
}
