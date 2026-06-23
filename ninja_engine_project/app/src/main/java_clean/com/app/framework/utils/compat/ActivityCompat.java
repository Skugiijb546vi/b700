package com.app.framework.utils.compat;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.app.framework.BlackBoxCore;
import com.app.framework.utils.DrawableUtils;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1705ooO0OoOo;
/* loaded from: classes.dex */
public class ActivityCompat {
    public static void fix(Activity activity) {
        Bitmap bitmap;
        ((InterfaceC1705ooO0OoOo) C0217o00o0oO0.create(InterfaceC1705ooO0OoOo.class, activity, false)).mActivityInfo();
        Context baseContext = activity.getBaseContext();
        try {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(AbstractC0694o0ooooo0.OooO0O0().Window());
            if (obtainStyledAttributes != null) {
                if (obtainStyledAttributes.getBoolean(AbstractC0694o0ooooo0.OooO0O0().Window_windowShowWallpaper().intValue(), false)) {
                    activity.getWindow().setBackgroundDrawable(WallpaperManager.getInstance(activity).getDrawable());
                }
                if (obtainStyledAttributes.getBoolean(AbstractC0694o0ooooo0.OooO0O0().Window_windowFullscreen().intValue(), false)) {
                    activity.getWindow().addFlags(1024);
                }
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Intent intent = activity.getIntent();
        ApplicationInfo applicationInfo = baseContext.getApplicationInfo();
        PackageManager packageManager = activity.getPackageManager();
        if (intent == null || !activity.isTaskRoot()) {
            return;
        }
        try {
            String taskDescriptionLabel = TaskDescriptionCompat.getTaskDescriptionLabel(BlackBoxCore.getUserId(), applicationInfo.loadLabel(packageManager));
            Drawable activityIcon = getActivityIcon(activity);
            if (activityIcon != null) {
                int launcherLargeIconSize = ((ActivityManager) baseContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = DrawableUtils.drawableToBitmap(activityIcon, launcherLargeIconSize, launcherLargeIconSize);
            } else {
                bitmap = null;
            }
            activity.setTaskDescription(new ActivityManager.TaskDescription(taskDescriptionLabel, bitmap));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private static Drawable getActivityIcon(Activity activity) {
        PackageManager packageManager = activity.getPackageManager();
        try {
            Drawable activityIcon = packageManager.getActivityIcon(activity.getComponentName());
            if (activityIcon != null) {
                return activityIcon;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return activity.getApplicationInfo().loadIcon(packageManager);
    }
}


