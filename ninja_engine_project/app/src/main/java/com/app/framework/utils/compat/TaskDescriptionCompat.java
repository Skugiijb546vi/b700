package com.app.framework.utils.compat;

import android.app.ActivityManager;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.app.framework.BlackBoxCore;
import com.ninja.engine.AbstractC0036Oooo0o0;
/* loaded from: classes.dex */
public class TaskDescriptionCompat {
    private static final String TAG = "TaskDescriptionCompat";

    public static ActivityManager.TaskDescription fix(ActivityManager.TaskDescription taskDescription) {
        ActivityManager.TaskDescription build;
        if (taskDescription == null) {
            return null;
        }
        try {
            String label = taskDescription.getLabel();
            Bitmap icon = taskDescription.getIcon();
            if (label == null || icon == null) {
                String taskDescriptionLabel = getTaskDescriptionLabel(BlackBoxCore.getUserId(), getApplicationLabel());
                int i = Build.VERSION.SDK_INT;
                if (i >= 31 && i >= 33) {
                    AbstractC0036Oooo0o0.OooO0oo();
                    ActivityManager.TaskDescription.Builder OooO00o = AbstractC0036Oooo0o0.OooO00o();
                    OooO00o.setLabel(taskDescriptionLabel);
                    OooO00o.setPrimaryColor(taskDescription.getPrimaryColor());
                    build = OooO00o.build();
                    return build;
                }
                return new ActivityManager.TaskDescription(taskDescriptionLabel, (Bitmap) null, taskDescription.getPrimaryColor());
            }
            return taskDescription;
        } catch (Throwable th) {
            th.getMessage();
            return taskDescription;
        }
    }

    private static Drawable getApplicationIcon() {
        return null;
    }

    private static CharSequence getApplicationLabel() {
        try {
            PackageManager packageManager = BlackBoxCore.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(BlackBoxCore.getAppPackageName(), 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String getTaskDescriptionLabel(int i, CharSequence charSequence) {
        return charSequence != null ? charSequence.toString() : "8 Ball Pool";
    }
}
