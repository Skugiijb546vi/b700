package com.app.framework.utils;

import com.app.framework.core.GmsCore;
import java.lang.Thread;
/* loaded from: classes.dex */
public class SimpleCrashFix {
    private static final String TAG = "SimpleCrashFix";
    private static boolean sIsInstalled = false;

    private static void installContextWrapperHook() {
        try {
            ContextWrapperHook.installHook();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installGlobalExceptionHandler() {
        try {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.app.framework.utils.SimpleCrashFix.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    if (SimpleCrashFix.isNullContextCrash(th)) {
                        th.getMessage();
                    } else if (SimpleCrashFix.isGooglePlayServicesCrash(th)) {
                        th.getMessage();
                    } else if (SimpleCrashFix.isWebViewCrash(th)) {
                        th.getMessage();
                    } else if (SimpleCrashFix.isAttributionSourceCrash(th)) {
                        th.getMessage();
                    } else if (SimpleCrashFix.isDeviceConfigCrash(th)) {
                        th.getMessage();
                    } else if (SimpleCrashFix.isSocialMediaAppCrash(th)) {
                        th.getMessage();
                    } else {
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                        if (uncaughtExceptionHandler != null) {
                            uncaughtExceptionHandler.uncaughtException(thread, th);
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void installSimpleFix() {
        if (sIsInstalled) {
            return;
        }
        try {
            installGlobalExceptionHandler();
            installContextWrapperHook();
            sIsInstalled = true;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAttributionSourceCrash(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message != null) {
            return message.contains("AttributionSource") || message.contains("attribution") || message.contains("Calling uid") || message.contains("source uid") || message.contains("UID mismatch");
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                if (className.contains("AttributionSource") || className.contains("ContentProvider") || methodName.contains("enforceCallingUid") || methodName.contains("enforceCallingUidAndPid")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isDeviceConfigCrash(Throwable th) {
        while (true) {
            if (th == null) {
                return false;
            }
            if (th instanceof NullPointerException) {
                String message = th.getMessage();
                if (message == null || !message.contains("entrySet")) {
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    if (stackTrace != null) {
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            String className = stackTraceElement.getClassName();
                            String methodName = stackTraceElement.getMethodName();
                            if ((className.contains("Settings$NameValueCache") && methodName.contains("getStringsForPrefix")) || className.contains("DeviceConfig") || className.contains("TextClassificationConstants")) {
                                return true;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    return true;
                }
            }
            th = th.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isGooglePlayServicesCrash(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message != null) {
            return message.contains("Google Play Services") || message.contains("GooglePlayServicesUtil") || message.contains("GoogleApiAvailability") || message.contains(GmsCore.GMS_PKG);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                if (className.contains(GmsCore.GMS_PKG) || className.contains("GooglePlayServicesUtil") || className.contains("GoogleApiAvailability")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNullContextCrash(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message != null) {
            return message.contains("Context") || message.contains("context") || message.contains("getResources") || message.contains("getPackageManager") || message.contains("getClassLoader");
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                if (className.contains("Context") || className.contains("ContextWrapper") || methodName.contains("getResources") || methodName.contains("getPackageManager") || methodName.contains("getClassLoader")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSocialMediaAppCrash(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message != null) {
            return message.contains("Facebook") || message.contains("Instagram") || message.contains("WhatsApp") || message.contains("Telegram") || message.contains("Twitter") || message.contains("TikTok") || message.contains("Snapchat") || message.contains("YouTube") || message.contains("LinkedIn");
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                if (className.contains("com.facebook") || className.contains("com.instagram") || className.contains("com.whatsapp") || className.contains("org.telegram") || className.contains("com.twitter") || className.contains("com.zhiliaoapp.musically") || className.contains("com.snapchat") || className.contains("com.google.android.youtube") || className.contains("com.linkedin")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWebViewCrash(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message != null) {
            return message.contains("WebView") || message.contains("webview") || message.contains("WebViewDatabase") || message.contains("WebSettings") || message.contains("data directory");
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                if (className.contains("WebView") || className.contains("WebViewDatabase") || className.contains("WebSettings") || methodName.contains("webView") || methodName.contains("WebView")) {
                    return true;
                }
            }
        }
        return false;
    }
}


