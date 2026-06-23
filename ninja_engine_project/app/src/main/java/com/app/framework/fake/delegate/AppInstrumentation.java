package com.app.framework.fake.delegate;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.ResultReceiver;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.app.GoogleSignInHelper;
import com.app.framework.fake.hook.HookManager;
import com.app.framework.fake.hook.IInjectHook;
import com.app.framework.fake.service.HCallbackProxy;
import com.app.framework.fake.service.IActivityClientProxy;
import com.app.framework.utils.FileUtils;
import com.app.framework.utils.HackAppUtils;
import com.app.framework.utils.compat.ActivityCompat;
import com.app.framework.utils.compat.ActivityManagerCompat;
import com.app.framework.utils.compat.ContextCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0529o0o0O00O;
import com.ninja.engine.InterfaceC1705ooO0OoOo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
/* loaded from: classes.dex */
public final class AppInstrumentation extends BaseInstrumentationDelegate implements IInjectHook {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "AppInstrumentation";
    private static AppInstrumentation sAppInstrumentation = null;
    private static volatile Activity sCreatingActivity = null;
    private static volatile Bundle sCreatingBundle = null;
    private static ClassLoader sGuestClassLoader = null;
    private static boolean sLifecycleHookInstalled = false;
    private static ResultReceiver sPendingResultReceiver;
    private static BroadcastReceiver sPreApiTokenReceiver;

    /* loaded from: classes.dex */
    public static class LifecycleCallbackHookList extends ArrayList<Application.ActivityLifecycleCallbacks> {
        public LifecycleCallbackHookList() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            boolean add = super.add((LifecycleCallbackHookList) activityLifecycleCallbacks);
            Activity activity = AppInstrumentation.sCreatingActivity;
            Bundle bundle = AppInstrumentation.sCreatingBundle;
            if (activity != null && activityLifecycleCallbacks != null) {
                try {
                    activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            return add;
        }

        public LifecycleCallbackHookList(Collection<? extends Application.ActivityLifecycleCallbacks> collection) {
            super(collection);
        }
    }

    private void checkActivity(Activity activity) {
        activity.getClass();
        HackAppUtils.enableQQLogOutput(activity.getPackageName(), activity.getClassLoader());
        checkHCallback();
        HookManager.get().checkEnv(IActivityClientProxy.class);
        ActivityInfo mActivityInfo = ((InterfaceC1705ooO0OoOo) C0217o00o0oO0.create(InterfaceC1705ooO0OoOo.class, activity, false)).mActivityInfo();
        ActivityManagerCompat.setActivityOrientation(activity, mActivityInfo.screenOrientation);
        fixDisplayDimensions(activity, mActivityInfo);
        ContextCompat.fix(activity);
        ActivityCompat.fix(activity);
        if (mActivityInfo.theme != 0) {
            activity.getTheme().applyStyle(mActivityInfo.theme, true);
        }
    }

    private void checkHCallback() {
        HookManager.get().checkEnv(HCallbackProxy.class);
    }

    private boolean checkInstrumentation(Instrumentation instrumentation) {
        Field[] declaredFields;
        if (instrumentation instanceof AppInstrumentation) {
            return true;
        }
        Class<?> cls = instrumentation.getClass();
        if (Instrumentation.class.equals(cls)) {
            return false;
        }
        do {
            for (Field field : cls.getDeclaredFields()) {
                if (Instrumentation.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    try {
                        if (field.get(instrumentation) instanceof AppInstrumentation) {
                            return true;
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (!Instrumentation.class.equals(cls));
        return false;
    }

    private void fixDisplayDimensions(Activity activity, ActivityInfo activityInfo) {
        Display defaultDisplay;
        int min;
        int max;
        int i;
        Resources resources;
        Resources resources2;
        try {
            int i2 = activityInfo.screenOrientation;
            boolean isLandscapeOrientation = isLandscapeOrientation(i2);
            boolean isPortraitOrientation = isPortraitOrientation(i2);
            if ((isLandscapeOrientation || isPortraitOrientation) && (defaultDisplay = activity.getWindowManager().getDefaultDisplay()) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                int i3 = displayMetrics.widthPixels;
                int i4 = displayMetrics.heightPixels;
                if (isLandscapeOrientation) {
                    min = Math.max(i3, i4);
                    max = Math.min(i3, i4);
                    i = 2;
                } else {
                    min = Math.min(i3, i4);
                    max = Math.max(i3, i4);
                    i = 1;
                }
                if (!isLandscapeOrientation || i3 < i4) {
                    if (!isPortraitOrientation || i4 < i3) {
                        Window window = activity.getWindow();
                        if (window != null) {
                            window.addFlags(1024);
                            window.clearFlags(FileUtils.FileMode.MODE_ISUID);
                            window.setLayout(min, max);
                        }
                        float f = displayMetrics.density;
                        fixResourcesDisplayMetrics(activity.getResources(), min, max, i, f);
                        Context baseContext = activity.getBaseContext();
                        if (baseContext != null && (resources2 = baseContext.getResources()) != null && resources2 != activity.getResources()) {
                            fixResourcesDisplayMetrics(resources2, min, max, i, f);
                        }
                        Application application = activity.getApplication();
                        if (application == null || (resources = application.getResources()) == null || resources == activity.getResources()) {
                            return;
                        }
                        fixResourcesDisplayMetrics(resources, min, max, i, f);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void fixResourcesDisplayMetrics(Resources resources, int i, int i2, int i3, float f) {
        if (resources == null) {
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            displayMetrics.widthPixels = i;
            displayMetrics.heightPixels = i2;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.orientation = i3;
        int i4 = (int) (i / f);
        configuration.screenWidthDp = i4;
        int i5 = (int) (i2 / f);
        configuration.screenHeightDp = i5;
        configuration.smallestScreenWidthDp = Math.min(i4, i5);
        resources.updateConfiguration(configuration, displayMetrics);
    }

    public static AppInstrumentation get() {
        if (sAppInstrumentation == null) {
            synchronized (AppInstrumentation.class) {
                try {
                    if (sAppInstrumentation == null) {
                        sAppInstrumentation = new AppInstrumentation();
                    }
                } finally {
                }
            }
        }
        return sAppInstrumentation;
    }

    private static int getActiveUserId() {
        int userId = BlackBoxCore.getUserId();
        if (userId < 0) {
            return 0;
        }
        return userId;
    }

    private Instrumentation getCurrInstrumentation() {
        return ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).mInstrumentation();
    }

    private void handleHiddenActivitySignIn(Activity activity) {
        ResultReceiver resultReceiver;
        try {
            Intent intent = activity.getIntent();
            String stringExtra = intent.getStringExtra("TYPE");
            if (("SIGN_IN_INTENT".equals(stringExtra) || "BEGIN_SIGN_IN".equals(stringExtra)) && (resultReceiver = (ResultReceiver) intent.getParcelableExtra("RESULT_RECEIVER")) != null) {
                ClassLoader classLoader = activity.getClass().getClassLoader();
                int activeUserId = getActiveUserId();
                String cachedIdToken = GoogleSignInHelper.getCachedIdToken(BlackBoxCore.getContext(), activeUserId);
                if (cachedIdToken != null) {
                    GoogleSignInHelper.deliverTokenViaResultReceiver(resultReceiver, cachedIdToken, classLoader);
                    return;
                }
                sPendingResultReceiver = resultReceiver;
                sGuestClassLoader = classLoader;
                registerPreApiTokenReceiver();
                GoogleSignInHelper.launchWebViewSignIn(BlackBoxCore.getContext(), activeUserId);
            }
        } catch (Exception unused) {
        }
    }

    private static void installLifecycleHook(Application application) {
        LifecycleCallbackHookList lifecycleCallbackHookList;
        if (sLifecycleHookInstalled || application == null) {
            return;
        }
        sLifecycleHookInstalled = true;
        try {
            Field declaredField = Application.class.getDeclaredField("mActivityLifecycleCallbacks");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(application);
            if (arrayList != null) {
                synchronized (arrayList) {
                    lifecycleCallbackHookList = new LifecycleCallbackHookList(arrayList);
                    declaredField.set(application, lifecycleCallbackHookList);
                }
            } else {
                lifecycleCallbackHookList = new LifecycleCallbackHookList();
                declaredField.set(application, lifecycleCallbackHookList);
            }
            lifecycleCallbackHookList.size();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean isLandscapeOrientation(int i) {
        return i == 0 || i == 6 || i == 8 || i == 11;
    }

    private boolean isPortraitOrientation(int i) {
        return i == 1 || i == 7 || i == 9 || i == 12;
    }

    private static void registerPreApiTokenReceiver() {
        Context context = BlackBoxCore.getContext();
        BroadcastReceiver broadcastReceiver = sPreApiTokenReceiver;
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused) {
            }
        }
        sPreApiTokenReceiver = new BroadcastReceiver() { // from class: com.app.framework.fake.delegate.AppInstrumentation.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String action = intent.getAction();
                if (GoogleSignInHelper.ACTION_GSI_TOKEN.equals(action)) {
                    String stringExtra = intent.getStringExtra("id_token");
                    if (stringExtra != null && AppInstrumentation.sPendingResultReceiver != null && AppInstrumentation.sGuestClassLoader != null) {
                        try {
                            GoogleSignInHelper.deliverTokenViaResultReceiver(AppInstrumentation.sPendingResultReceiver, stringExtra, AppInstrumentation.sGuestClassLoader);
                        } catch (Exception unused2) {
                        }
                    }
                } else if (GoogleSignInHelper.ACTION_GSI_CANCEL.equals(action) && AppInstrumentation.sPendingResultReceiver != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("FAILURE_RESPONSE", true);
                    bundle.putString("EXCEPTION_TYPE", "GET_CANCELED_TAG");
                    bundle.putString("EXCEPTION_MESSAGE", "User cancelled");
                    AppInstrumentation.sPendingResultReceiver.send(0, bundle);
                }
                AppInstrumentation.sPendingResultReceiver = null;
                AppInstrumentation.sGuestClassLoader = null;
                try {
                    context2.unregisterReceiver(this);
                } catch (Exception unused3) {
                }
                AppInstrumentation.sPreApiTokenReceiver = null;
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(GoogleSignInHelper.ACTION_GSI_TOKEN);
        intentFilter.addAction(GoogleSignInHelper.ACTION_GSI_CANCEL);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(sPreApiTokenReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(sPreApiTokenReceiver, intentFilter);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Bundle, android.app.Activity] */
    @Override // com.app.framework.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        checkActivity(activity);
        activity.getClass();
        try {
            Intent intent = activity.getIntent();
            if (intent == null || intent.getExtras() == null) {
                activity.getIntent();
            } else {
                Bundle extras = intent.getExtras();
                Objects.toString(extras.keySet());
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj != null) {
                        obj.toString();
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        if (activity.getClass().getName().equals("androidx.credentials.playservices.HiddenActivity")) {
            handleHiddenActivitySignIn(activity);
            activity.getIntent().putExtra("TYPE", "BLOCKED");
        }
        try {
            installLifecycleHook(activity.getApplication());
        } catch (Throwable th2) {
            th2.getMessage();
        }
        sCreatingActivity = activity;
        sCreatingBundle = bundle;
        try {
            super.callActivityOnCreate(activity, bundle);
        } finally {
            sCreatingActivity = null;
            sCreatingBundle = null;
        }
    }

    @Override // com.app.framework.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        if (application != null) {
            application.getPackageName();
        }
        checkHCallback();
        super.callApplicationOnCreate(application);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public void injectHook() {
        try {
            Instrumentation currInstrumentation = getCurrInstrumentation();
            if (currInstrumentation != this && !checkInstrumentation(currInstrumentation)) {
                this.mBaseInstrumentation = currInstrumentation;
                ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false))._set_mInstrumentation(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return !checkInstrumentation(getCurrInstrumentation());
    }

    @Override // com.app.framework.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        try {
            return super.newActivity(classLoader, str, intent);
        } catch (ClassNotFoundException unused) {
            return this.mBaseInstrumentation.newActivity(classLoader, str, intent);
        }
    }

    @Override // com.app.framework.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) {
        ContextCompat.fix(context);
        BActivityThread.currentActivityThread().loadXposed(context);
        return super.newApplication(classLoader, str, context);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Bundle, android.app.Activity] */
    @Override // com.app.framework.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        checkActivity(activity);
        activity.getClass();
        try {
            installLifecycleHook(activity.getApplication());
        } catch (Throwable th) {
            th.getMessage();
        }
        sCreatingActivity = activity;
        sCreatingBundle = bundle;
        try {
            super.callActivityOnCreate(activity, bundle, persistableBundle);
        } finally {
            sCreatingActivity = null;
            sCreatingBundle = null;
        }
    }
}
