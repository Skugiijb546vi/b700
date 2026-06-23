package com.app.framework.core;

import android.os.Process;
import com.android.volley.toolbox.ImageRequest;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.JarManager;
import com.app.framework.core.system.pm.Settings;
import com.app.framework.utils.compat.DexFileCompat;
import com.ninja.engine.InterfaceC0746oO00oOo0;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
/* loaded from: classes.dex */
public class NativeCore {
    public static final String TAG = "NativeCore";

    static {
        System.loadLibrary("ninja");
    }

    public static native void addIORule(String str, String str2);

    private static long[] createFallbackEmptyDex() {
        try {
            byte[] createMinimalDexBytes = createMinimalDexBytes();
            File createTempFile = File.createTempFile("fallback_empty", ".dex");
            createTempFile.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(createMinimalDexBytes);
            fileOutputStream.close();
            List<Long> cookies = DexFileCompat.getCookies(new DexFile(createTempFile));
            if (cookies != null && !cookies.isEmpty()) {
                long[] jArr = new long[cookies.size()];
                for (int i = 0; i < cookies.size(); i++) {
                    jArr[i] = cookies.get(i).longValue();
                }
                cookies.size();
                return jArr;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return new long[0];
    }

    private static byte[] createMinimalDexBytes() {
        return new byte[]{100, 101, 120, 10, 48, 51, 53, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 112, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public static native boolean disableHiddenApi();

    public static native boolean disableResourceLoading();

    public static native void enableIO();

    @InterfaceC0746oO00oOo0
    public static int getCallingUid(int i) {
        int i2;
        if ((i <= 0 || i >= 10000) && i <= 19999) {
            try {
                if (i == BlackBoxCore.getHostUid()) {
                    String appPackageName = BlackBoxCore.getAppPackageName();
                    if (appPackageName != null) {
                        appPackageName.equals(GmsCore.GMS_PKG);
                    }
                    if (appPackageName == null || !appPackageName.equals("com.google.android.webview")) {
                        try {
                            int callingBUid = BlackBoxCore.getCallingBUid();
                            if (callingBUid > 0 && callingBUid < 19999) {
                                return callingBUid;
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                        try {
                            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                            int length = stackTrace.length;
                            while (i2 < length) {
                                StackTraceElement stackTraceElement = stackTrace[i2];
                                String className = stackTraceElement.getClassName();
                                String methodName = stackTraceElement.getMethodName();
                                i2 = (className.contains(Settings.TAG) || className.contains("FeatureFlag")) ? 0 : i2 + 1;
                                if (methodName.contains("getString") || methodName.contains("getInt") || methodName.contains("getLong") || methodName.contains("getFloat")) {
                                    return ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                                }
                            }
                        } catch (Exception e2) {
                            e2.getMessage();
                        }
                        return BlackBoxCore.getHostUid();
                    }
                    return Process.myUid();
                }
                return i;
            } catch (Exception e3) {
                e3.getMessage();
                return Process.myUid();
            }
        }
        return i;
    }

    public static native void hideXposed();

    public static native void init(int i);

    @InterfaceC0746oO00oOo0
    public static long[] loadEmptyDex() {
        try {
            File emptyJar = JarManager.getInstance().getEmptyJar();
            if (emptyJar == null) {
                JarManager.getInstance().initializeSync();
                emptyJar = JarManager.getInstance().getEmptyJar();
            }
            if (emptyJar != null && emptyJar.exists()) {
                List<Long> cookies = DexFileCompat.getCookies(new DexFile(emptyJar));
                long[] jArr = new long[cookies.size()];
                for (int i = 0; i < cookies.size(); i++) {
                    jArr[i] = cookies.get(i).longValue();
                }
                cookies.size();
                return jArr;
            }
            return new long[0];
        } catch (Exception unused) {
            return new long[0];
        }
    }

    @InterfaceC0746oO00oOo0
    public static File redirectPath(File file) {
        return IOCore.get().redirectPath(file);
    }

    @InterfaceC0746oO00oOo0
    public static String redirectPath(String str) {
        return IOCore.get().redirectPath(str);
    }
}
