package com.app.framework.closecode;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.configuration.AppLifecycleCallback;
import com.ninja.engine.AbstractC1230oOoOo0o;
import java.io.File;
/* loaded from: classes.dex */
public class Entry {
    private static final String TAG = "Lib Injection";
    private static final String targetpackagename = "com.whatever";

    public static void attach() {
        BlackBoxCore.get().addAppLifecycleCallback(new AppLifecycleCallback() { // from class: com.app.framework.closecode.Entry.1
            @Override // com.app.framework.app.configuration.AppLifecycleCallback
            public void afterMainActivityOnCreate(Activity activity) {
                if (activity != null && activity.getPackageName().equals(Entry.targetpackagename)) {
                    String OooO0oO = AbstractC1230oOoOo0o.OooO0oO(activity.getFilesDir().getAbsolutePath(), "/inject.so");
                    try {
                        if (new File(OooO0oO).exists()) {
                            System.load(OooO0oO);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }

            @Override // com.app.framework.app.configuration.AppLifecycleCallback
            public void beforeMainApplicationAttach(Application application, Context context) {
                if (application != null && application.getPackageName().equals(Entry.targetpackagename)) {
                    String OooO0oO = AbstractC1230oOoOo0o.OooO0oO(application.getFilesDir().getAbsolutePath(), "/inject.so");
                    try {
                        if (new File(OooO0oO).exists()) {
                            System.load(OooO0oO);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }
}


