package com.app.framework.utils;

import android.app.ActivityThread;
import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SocialMediaAppCrashPrevention {
    private static final String TAG = "SocialMediaCrashPrevention";
    private static boolean sIsInitialized = false;
    private static final String[] SOCIAL_MEDIA_PACKAGES = {"com.facebook.katana", "com.facebook.orca", "com.instagram.android", "com.whatsapp", "org.telegram.messenger", "com.twitter.android", "com.zhiliaoapp.musically", "com.snapchat.android", "com.google.android.youtube", "com.linkedin.android", "com.discord", "com.reddit.frontpage", "com.spotify.music", "com.netflix.mediaclient", "com.amazon.avod.thirdpartyclient"};
    private static final Map<String, CrashPreventionStrategy> sCrashPreventionStrategies = new HashMap();

    /* loaded from: classes.dex */
    public interface CrashPreventionStrategy {
        void apply();
    }

    public static void applyCrashPrevention(String str) {
        if (str == null) {
            return;
        }
        try {
            for (String str2 : SOCIAL_MEDIA_PACKAGES) {
                if (str2.equals(str)) {
                    CrashPreventionStrategy crashPreventionStrategy = sCrashPreventionStrategies.get(str);
                    if (crashPreventionStrategy != null) {
                        crashPreventionStrategy.apply();
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static String getCrashPreventionStatus() {
        return "Social Media Crash Prevention Status:\nInitialized: " + sIsInitialized + "\nCurrent App: " + BActivityThread.getAppPackageName() + "\nIs Social Media App: " + isSocialMediaApp() + "\nAndroid Version: " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + ")\n";
    }

    private static void hookWebViewConstructor() {
        try {
            WebView.class.getDeclaredConstructor(Context.class).setAccessible(true);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void hookWebViewDatabase() {
        try {
            Context context = BlackBoxCore.getContext();
            if (context != null) {
                context.getPackageName();
                String str = context.getApplicationInfo().dataDir + "/webview_" + String.valueOf(BActivityThread.getUserId());
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                System.setProperty("webview.data.dir", str);
                System.setProperty("webview.cache.dir", str + "/cache");
                System.setProperty("webview.cookies.dir", str + "/cookies");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void initialize() {
        if (sIsInitialized) {
            return;
        }
        try {
            installWebViewCrashPrevention();
            installAttributionSourceCrashPrevention();
            installContextCrashPrevention();
            installPermissionCrashPrevention();
            installMediaCrashPrevention();
            sIsInitialized = true;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installAttributionSourceCrashPrevention() {
    }

    private static void installContextCrashPrevention() {
        try {
            if (BlackBoxCore.getContext() == null) {
                recoverContext();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void installMediaCrashPrevention() {
    }

    private static void installPermissionCrashPrevention() {
    }

    private static void installWebViewCrashPrevention() {
        try {
            hookWebViewConstructor();
            hookWebViewDatabase();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static boolean isSocialMediaApp() {
        try {
            String appPackageName = BActivityThread.getAppPackageName();
            for (String str : SOCIAL_MEDIA_PACKAGES) {
                if (str.equals(appPackageName)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    private static void recoverContext() {
        try {
            Object invoke = ActivityThread.class.getDeclaredMethod("currentActivityThread", null).invoke(null, null);
            if (invoke != null) {
                Context context = (Context) ActivityThread.class.getDeclaredMethod("getSystemContext", null).invoke(invoke, null);
            }
        } catch (Exception e) {
            try {
                e.getMessage();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }
}


