package com.app.framework.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
/* loaded from: classes.dex */
public class FacebookRedirectActivity extends Activity {
    private static final String CUSTOM_TAB_REDIRECT_ACTION = "CustomTabActivity.action_customTabRedirect";
    private static final String DESTROY_ACTION = "CustomTabActivity.action_destroy";
    private static final String EXTRA_URL = "CustomTabMainActivity.extra_url";
    private static final String REFRESH_ACTION = "CustomTabMainActivity.action_refresh";
    private static final String TAG = "FacebookRedirect";

    private void bringGameToFront() {
        try {
            Activity findGameActivity = findGameActivity();
            if (findGameActivity != null) {
                int taskId = findGameActivity.getTaskId();
                ActivityManager activityManager = (ActivityManager) getSystemService("activity");
                if (activityManager != null) {
                    activityManager.moveTaskToFront(taskId, 1);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private boolean deliverToCustomTabMainActivity(String str) {
        try {
            Application application = BActivityThread.getApplication();
            if (application == null) {
                return false;
            }
            try {
                Class<?> loadClass = application.getClassLoader().loadClass("androidx.localbroadcastmanager.content.LocalBroadcastManager");
                Object invoke = loadClass.getMethod("getInstance", Context.class).invoke(null, application);
                if (invoke != null) {
                    Intent intent = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
                    intent.putExtra(EXTRA_URL, str);
                    loadClass.getMethod("sendBroadcast", Intent.class).invoke(invoke, intent);
                }
            } catch (Exception e) {
                e.getMessage();
            }
            Activity findActivityByClassName = findActivityByClassName("com.facebook.CustomTabMainActivity");
            if (findActivityByClassName == null) {
                return false;
            }
            Intent intent2 = new Intent();
            intent2.setAction(REFRESH_ACTION);
            intent2.putExtra(EXTRA_URL, str);
            Method declaredMethod = Activity.class.getDeclaredMethod("onNewIntent", Intent.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(findActivityByClassName, intent2);
            return true;
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }

    private Activity findActivityByClassName(String str) {
        Map map;
        try {
            Object invoke = ActivityThread.class.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = ActivityThread.class.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(invoke);
        } catch (Exception e) {
            e.getMessage();
        }
        if (map == null) {
            return null;
        }
        for (Object obj : map.values()) {
            Field declaredField2 = obj.getClass().getDeclaredField("activity");
            declaredField2.setAccessible(true);
            Activity activity = (Activity) declaredField2.get(obj);
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && str.equals(activity.getClass().getName())) {
                return activity;
            }
        }
        return null;
    }

    private Activity findGameActivity() {
        Map map;
        try {
            Object invoke = ActivityThread.class.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = ActivityThread.class.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(invoke);
        } catch (Exception e) {
            e.getMessage();
        }
        if (map == null) {
            return null;
        }
        for (Object obj : map.values()) {
            Field declaredField2 = obj.getClass().getDeclaredField("activity");
            declaredField2.setAccessible(true);
            Activity activity = (Activity) declaredField2.get(obj);
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                String name = activity.getClass().getName();
                if (!name.contains("FacebookRedirectActivity") && !name.contains("CustomTabMainActivity") && !name.contains("FacebookActivity") && !name.contains("FacebookWebViewActivity")) {
                    activity.getTaskId();
                    return activity;
                }
            }
        }
        return null;
    }

    private boolean sendRedirectViaLocalBroadcast(String str) {
        try {
            Application application = BActivityThread.getApplication();
            if (application == null) {
                return false;
            }
            application.getPackageName();
            ClassLoader classLoader = application.getClassLoader();
            if (classLoader == null) {
                return false;
            }
            Class<?> loadClass = classLoader.loadClass("androidx.localbroadcastmanager.content.LocalBroadcastManager");
            Object invoke = loadClass.getMethod("getInstance", Context.class).invoke(null, application);
            if (invoke == null) {
                return false;
            }
            Intent intent = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
            intent.putExtra(EXTRA_URL, str);
            return Boolean.TRUE.equals((Boolean) loadClass.getMethod("sendBroadcast", Intent.class).invoke(invoke, intent));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String uri = (getIntent() == null || getIntent().getData() == null) ? null : getIntent().getData().toString();
        if (uri != null && !deliverToCustomTabMainActivity(uri)) {
            sendRedirectViaLocalBroadcast(uri);
        }
        bringGameToFront();
        finish();
    }
}


