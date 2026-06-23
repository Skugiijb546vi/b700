package com.app.framework.app;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Service;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.webkit.WebView;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.configuration.AppLifecycleCallback;
import com.app.framework.app.dispatcher.AppServiceDispatcher;
import com.app.framework.core.CrashHandler;
import com.app.framework.core.IBActivityThread;
import com.app.framework.core.IOCore;
import com.app.framework.core.NativeCore;
import com.app.framework.core.env.VirtualRuntime;
import com.app.framework.core.system.JarManager;
import com.app.framework.core.system.user.BUserHandle;
import com.app.framework.entity.AppConfig;
import com.app.framework.entity.am.ReceiverData;
import com.app.framework.entity.pm.InstalledModule;
import com.app.framework.fake.delegate.AppInstrumentation;
import com.app.framework.fake.delegate.ContentProviderDelegate;
import com.app.framework.fake.frameworks.BXposedManager;
import com.app.framework.fake.hook.HookManager;
import com.app.framework.fake.service.HCallbackProxy;
import com.app.framework.utils.Reflector;
import com.app.framework.utils.compat.ActivityManagerCompat;
import com.app.framework.utils.compat.BuildCompat;
import com.app.framework.utils.compat.ContextCompat;
import com.app.framework.utils.compat.StrictModeCompat;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0155o00Oo000;
import com.ninja.engine.InterfaceC0529o0o0O00O;
import com.ninja.engine.InterfaceC0530o0o0O00o;
import com.ninja.engine.InterfaceC0667o0ooo0;
import com.ninja.engine.InterfaceC0935oOO0Oo0O;
import com.ninja.engine.InterfaceC1009oOOOOooO;
import com.ninja.engine.InterfaceC1560oo0o00o0;
import com.ninja.engine.InterfaceC1564oo0o0O00;
import com.ninja.engine.InterfaceC1680ooO0O0O;
import com.ninja.engine.InterfaceC1705ooO0OoOo;
import com.ninja.engine.InterfaceC1853ooOo0o;
import com.ninja.engine.InterfaceC1871ooOoO0o;
import com.ninja.engine.InterfaceC1874ooOoO0oo;
import com.ninja.engine.InterfaceC1899ooOoo0;
import com.ninja.engine.InterfaceC2080ooooO000;
import com.ninja.engine.RunnableC0061o00000oO;
import com.ninja.engine.RunnableC0090o000OoOO;
import com.ninja.engine.o00Oo00;
import com.ninja.engine.o0O00OOO;
import com.ninja.engine.o0OO0O0;
import com.ninja.engine.oO0O000;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class BActivityThread extends IBActivityThread.Stub {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "BActivityThread";
    private static final Object mConfigLock = new Object();
    private static BActivityThread sBActivityThread;
    private AppConfig mAppConfig;
    private AppBindData mBoundApplication;
    private Application mInitialApplication;
    private final List<ProviderInfo> mProviders = new ArrayList();
    private final Handler mH = BlackBoxCore.get().getHandler();

    /* loaded from: classes.dex */
    public static class AppBindData {
        ApplicationInfo appInfo;
        Object info;
        String processName;
        List<ProviderInfo> providers;
    }

    private Application createApplication(ApplicationInfo applicationInfo) {
        try {
            Application application = (Application) getClassLoader(applicationInfo).loadClass(applicationInfo.className).newInstance();
            ensureApplicationBaseContext(application, applicationInfo);
            return application;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private Application createApplicationWithFallback(ApplicationInfo applicationInfo) {
        try {
            Application createApplication = createApplication(applicationInfo);
            if (createApplication != null) {
                String str = applicationInfo.className;
                return createApplication;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            ClassLoader classLoader = getClassLoader(applicationInfo);
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            Application application = (Application) classLoader.loadClass(applicationInfo.className).newInstance();
            ensureApplicationBaseContext(application, applicationInfo);
            return application;
        } catch (Exception e2) {
            e2.getMessage();
            try {
                Application application2 = new Application() { // from class: com.app.framework.app.BActivityThread.4
                    @Override // android.app.Application
                    public void onCreate() {
                        super.onCreate();
                    }
                };
                ensureApplicationBaseContext(application2, applicationInfo);
                return application2;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private Object createBindApplicationData(String str, String str2) {
        try {
            final PackageInfo packageInfo = BlackBoxCore.getBPackageManager().getPackageInfo(str, 8, getUserId());
            final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            return new Object() { // from class: com.app.framework.app.BActivityThread.2
                public ApplicationInfo getInfo() {
                    return applicationInfo;
                }

                public List<ProviderInfo> getProviders() {
                    ProviderInfo[] providerInfoArr = packageInfo.providers;
                    return providerInfoArr != null ? Arrays.asList(providerInfoArr) : new ArrayList();
                }
            };
        } catch (Exception unused) {
            return new Object() { // from class: com.app.framework.app.BActivityThread.3
                public ApplicationInfo getInfo() {
                    return null;
                }

                public List<ProviderInfo> getProviders() {
                    return new ArrayList();
                }
            };
        }
    }

    private Context createFallbackContext(final String str) {
        try {
            final Context context = BlackBoxCore.getContext();
            if (context == null) {
                return null;
            }
            return new ContextWrapper(context) { // from class: com.app.framework.app.BActivityThread.5
                @Override // android.content.ContextWrapper, android.content.Context
                public Context getApplicationContext() {
                    try {
                        return context.getApplicationContext();
                    } catch (Exception e) {
                        e.getMessage();
                        return this;
                    }
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public ClassLoader getClassLoader() {
                    try {
                        return context.getClassLoader();
                    } catch (Exception e) {
                        e.getMessage();
                        try {
                            return ClassLoader.getSystemClassLoader();
                        } catch (Exception e2) {
                            e2.getMessage();
                            return null;
                        }
                    }
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public PackageManager getPackageManager() {
                    try {
                        return context.getPackageManager();
                    } catch (Exception e) {
                        e.getMessage();
                        return null;
                    }
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public String getPackageName() {
                    return str;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public Resources getResources() {
                    try {
                        return context.getResources();
                    } catch (Exception e) {
                        e.getMessage();
                        try {
                            return Resources.getSystem();
                        } catch (Exception e2) {
                            e2.getMessage();
                            return null;
                        }
                    }
                }
            };
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private Application createMinimalApplication(Context context, final String str) {
        try {
            Application application = new Application() { // from class: com.app.framework.app.BActivityThread.7
                @Override // android.content.ContextWrapper, android.content.Context
                public Context getApplicationContext() {
                    return this;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public String getPackageName() {
                    return str;
                }

                @Override // android.app.Application
                public void onCreate() {
                    super.onCreate();
                }
            };
            if (context != null) {
                try {
                    Method declaredMethod = Application.class.getDeclaredMethod("attachBaseContext", Context.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(application, context);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return application;
        } catch (Exception unused) {
            return null;
        }
    }

    private static Context createMinimalPackageContext(ApplicationInfo applicationInfo) {
        try {
            Context context = BlackBoxCore.getContext();
            try {
                Context createPackageContext = context.createPackageContext(applicationInfo.packageName, 0);
                if (createPackageContext != null) {
                    return createPackageContext;
                }
            } catch (Exception e) {
                String str = applicationInfo.packageName;
                e.getMessage();
            }
            try {
                Context createPackageContext2 = context.createPackageContext(applicationInfo.packageName, 2);
                if (createPackageContext2 != null) {
                    return createPackageContext2;
                }
            } catch (Exception e2) {
                String str2 = applicationInfo.packageName;
                e2.getMessage();
            }
            try {
                Context createPackageContext3 = context.createPackageContext(applicationInfo.packageName, 1);
                if (createPackageContext3 != null) {
                    return createPackageContext3;
                }
            } catch (Exception e3) {
                String str3 = applicationInfo.packageName;
                e3.getMessage();
            }
        } catch (Exception e4) {
            String str4 = applicationInfo.packageName;
            e4.getMessage();
        }
        return createWrappedBaseContext(applicationInfo.packageName);
    }

    public static Context createPackageContext(ApplicationInfo applicationInfo) {
        try {
            return BlackBoxCore.getContext().createPackageContext(applicationInfo.packageName, 3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Context createWrappedBaseContext(final String str) {
        try {
            final Context context = BlackBoxCore.getContext();
            return new ContextWrapper(context) { // from class: com.app.framework.app.BActivityThread.6
                @Override // android.content.ContextWrapper, android.content.Context
                public Context getApplicationContext() {
                    return context.getApplicationContext();
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public ClassLoader getClassLoader() {
                    return context.getClassLoader();
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public PackageManager getPackageManager() {
                    return context.getPackageManager();
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public String getPackageName() {
                    return str;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public Resources getResources() {
                    return context.getResources();
                }
            };
        } catch (Exception e) {
            e.getMessage();
            return BlackBoxCore.getContext();
        }
    }

    public static BActivityThread currentActivityThread() {
        if (sBActivityThread == null) {
            synchronized (BActivityThread.class) {
                try {
                    if (sBActivityThread == null) {
                        sBActivityThread = new BActivityThread();
                    }
                } finally {
                }
            }
        }
        return sBActivityThread;
    }

    public static void ensureActivityContext(Activity activity) {
        Context context;
        if (activity == null) {
            return;
        }
        try {
            if (activity.getBaseContext() != null) {
                return;
            }
            try {
                context = getApplication();
                if (context == null) {
                    context = BlackBoxCore.getContext();
                }
            } catch (Exception e) {
                e.getMessage();
                context = BlackBoxCore.getContext();
            }
            if (context != null) {
                try {
                    Context createPackageContext = context.createPackageContext(activity.getPackageName(), 3);
                    Method declaredMethod = Activity.class.getDeclaredMethod("attachBaseContext", Context.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(activity, createPackageContext);
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    private void ensureApplicationBaseContext(Application application, ApplicationInfo applicationInfo) {
        try {
            if (application.getBaseContext() != null) {
                String str = applicationInfo.className;
                return;
            }
            Context createPackageContext = createPackageContext(applicationInfo);
            if (createPackageContext == null) {
                String str2 = applicationInfo.className;
                createPackageContext = createFallbackContext(applicationInfo.packageName);
            }
            if (createPackageContext == null) {
                String str3 = applicationInfo.className;
                return;
            }
            try {
                Method declaredMethod = Application.class.getDeclaredMethod("attachBaseContext", Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(application, createPackageContext);
                String str4 = applicationInfo.className;
            } catch (Exception e) {
                e.getMessage();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static Activity getActivityByToken(IBinder iBinder) {
        return ((InterfaceC0155o00Oo000) C0217o00o0oO0.create(InterfaceC0155o00Oo000.class, ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).mActivities().get(iBinder), false)).activity();
    }

    public static AppConfig getAppConfig() {
        AppConfig appConfig;
        synchronized (mConfigLock) {
            appConfig = currentActivityThread().mAppConfig;
        }
        return appConfig;
    }

    public static String getAppPackageName() {
        if (getAppConfig() != null) {
            return getAppConfig().packageName;
        }
        if (currentActivityThread().mInitialApplication != null) {
            return currentActivityThread().mInitialApplication.getPackageName();
        }
        return null;
    }

    public static int getAppPid() {
        if (getAppConfig() == null) {
            return -1;
        }
        return getAppConfig().bpid;
    }

    public static String getAppProcessName() {
        if (getAppConfig() != null) {
            return getAppConfig().processName;
        }
        if (currentActivityThread().mBoundApplication != null) {
            return currentActivityThread().mBoundApplication.processName;
        }
        return null;
    }

    public static Application getApplication() {
        return currentActivityThread().mInitialApplication;
    }

    private ApplicationInfo getApplicationInfo(Object obj) {
        try {
            if (obj != null) {
                try {
                    ApplicationInfo applicationInfo = (ApplicationInfo) obj.getClass().getMethod("getInfo", null).invoke(obj, null);
                    if (applicationInfo != null) {
                        return applicationInfo;
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            String appPackageName = BlackBoxCore.getAppPackageName();
            if (appPackageName != null) {
                return BlackBoxCore.getBPackageManager().getPackageInfo(appPackageName, 0, getUserId()).applicationInfo;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static int getBAppId() {
        return BUserHandle.getAppId(getBUid());
    }

    public static int getBUid() {
        return getAppConfig() == null ? BUserHandle.AID_APP_START : getAppConfig().buid;
    }

    public static int getCallingBUid() {
        return getAppConfig() == null ? BlackBoxCore.getHostUid() : getAppConfig().callingBUid;
    }

    private ClassLoader getClassLoader(ApplicationInfo applicationInfo) {
        try {
            String str = applicationInfo.sourceDir;
            return str != null ? new PathClassLoader(str, ClassLoader.getSystemClassLoader()) : ClassLoader.getSystemClassLoader();
        } catch (Exception e) {
            e.getMessage();
            return ClassLoader.getSystemClassLoader();
        }
    }

    private List<ProviderInfo> getProviderInfoList(Object obj) {
        try {
            if (obj != null) {
                try {
                    List<ProviderInfo> list = (List) obj.getClass().getMethod("getProviders", null).invoke(obj, null);
                    if (list != null) {
                        return list;
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return new ArrayList();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static List<ProviderInfo> getProviders() {
        return currentActivityThread().mProviders;
    }

    public static int getUid() {
        if (getAppConfig() == null) {
            return -1;
        }
        return getAppConfig().uid;
    }

    public static int getUserId() {
        if (getAppConfig() == null) {
            return 0;
        }
        return getAppConfig().userId;
    }

    private void handleSecurityException(SecurityException securityException, String str, String str2, Context context) {
        try {
            Application createMinimalApplication = createMinimalApplication(context, str);
            if (createMinimalApplication != null) {
                this.mInitialApplication = createMinimalApplication;
                ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false))._set_mInitialApplication(this.mInitialApplication);
                ContextCompat.fix(this.mInitialApplication);
                return;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        throw new RuntimeException("Unable to handle SecurityException", securityException);
    }

    public static void hookActivityThread() {
        Instrumentation mInstrumentation;
        try {
            Object mainThread = BlackBoxCore.mainThread();
            if (mainThread != null && (mInstrumentation = ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, mainThread, false)).mInstrumentation()) != null && !(mInstrumentation instanceof AppInstrumentation)) {
                try {
                    AppInstrumentation.get().injectHook();
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void initializeJarEnvironment() {
        try {
            JarManager jarManager = JarManager.getInstance();
            if (!jarManager.isReady()) {
                jarManager.initializeSync();
            }
            File emptyJar = jarManager.getEmptyJar();
            if (emptyJar == null || !emptyJar.exists()) {
                jarManager.clearCache();
                jarManager.initializeSync();
                emptyJar = jarManager.getEmptyJar();
            }
            if (emptyJar == null || !emptyJar.exists()) {
                return;
            }
            emptyJar.getAbsolutePath();
        } catch (Exception unused) {
        }
    }

    private void installContentProvider(Application application, ProviderInfo providerInfo) {
        try {
            if (application == null) {
                String str = providerInfo.name;
                return;
            }
            ClassLoader classLoader = application.getClassLoader();
            if (classLoader == null) {
                String str2 = providerInfo.name;
                classLoader = ClassLoader.getSystemClassLoader();
            }
            ((ContentProvider) classLoader.loadClass(providerInfo.name).newInstance()).attachInfo(application, providerInfo);
        } catch (Exception unused) {
            String str3 = providerInfo.name;
        }
    }

    private void installContentProvidersWithFallback(Application application, Object obj) {
        ProviderInfo providerInfo;
        try {
            List<ProviderInfo> providerInfoList = getProviderInfoList(obj);
            if (providerInfoList != null && !providerInfoList.isEmpty()) {
                providerInfoList.size();
                for (ProviderInfo providerInfo2 : providerInfoList) {
                    try {
                        installContentProvider(application, providerInfo2);
                        String str = providerInfo2.name;
                    } catch (Exception e) {
                        String str2 = providerInfo.name;
                        e.getMessage();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void installProvider(Object obj, Context context, ProviderInfo providerInfo, Object obj2) {
        Method findMethodByFirstName = Reflector.findMethodByFirstName(obj.getClass(), "installProvider");
        if (findMethodByFirstName != null) {
            findMethodByFirstName.setAccessible(true);
            Boolean bool = Boolean.TRUE;
            findMethodByFirstName.invoke(obj, context, obj2, providerInfo, Boolean.FALSE, bool, bool);
        }
    }

    private void installProviders(Context context, String str, List<ProviderInfo> list) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            context.getPackageName();
            list.size();
            for (ProviderInfo providerInfo : list) {
                if (!str.equals(providerInfo.processName) && !providerInfo.processName.equals(context.getPackageName()) && !providerInfo.multiprocess) {
                }
                installProvider(BlackBoxCore.mainThread(), context, providerInfo, null);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            ContentProviderDelegate.init();
        }
    }

    private void installProvidersWithErrorHandling(Context context, String str, List<ProviderInfo> list) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            for (ProviderInfo providerInfo : list) {
                try {
                } catch (SecurityException e) {
                    String str2 = providerInfo.name;
                    e.getMessage();
                }
                if (!str.equals(providerInfo.processName) && !providerInfo.processName.equals(context.getPackageName()) && !providerInfo.multiprocess) {
                }
                installProvider(BlackBoxCore.mainThread(), context, providerInfo, null);
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            try {
                ContentProviderDelegate.init();
            } catch (Exception e2) {
                e2.getMessage();
            }
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            try {
                ContentProviderDelegate.init();
            } catch (Exception e3) {
                e3.getMessage();
            }
            throw th;
        }
    }

    public static boolean isThreadInit() {
        return sBActivityThread != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindApplication$0(String str, String str2, ConditionVariable conditionVariable) {
        createBindApplicationData(str, str2);
        handleBindApplication(str, str2);
        conditionVariable.open();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$finishActivity$1(IBinder iBinder) {
        Map<IBinder, Object> mActivities = ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).mActivities();
        if (mActivities.isEmpty() || mActivities.get(iBinder) == null) {
            return;
        }
        Activity activityByToken = getActivityByToken(iBinder);
        while (activityByToken.getParent() != null) {
            activityByToken = activityByToken.getParent();
        }
        ActivityManagerCompat.finishActivity(iBinder, ((InterfaceC1705ooO0OoOo) C0217o00o0oO0.create(InterfaceC1705ooO0OoOo.class, activityByToken, false)).mResultCode().intValue(), ((InterfaceC1705ooO0OoOo) C0217o00o0oO0.create(InterfaceC1705ooO0OoOo.class, activityByToken, false)).mResultData());
        ((InterfaceC1705ooO0OoOo) C0217o00o0oO0.create(InterfaceC1705ooO0OoOo.class, activityByToken, false))._set_mFinished(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$handleNewIntent$2(Intent intent, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 22) {
            intent = ((InterfaceC1564oo0o0O00) C0217o00o0oO0.create(InterfaceC1564oo0o0O00.class, null, false))._new(intent, BlackBoxCore.getHostPkg());
        }
        Object mainThread = BlackBoxCore.mainThread();
        if (((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false))._check_performNewIntents(null, null) != null) {
            ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, mainThread, false)).performNewIntents(iBinder, Collections.singletonList(intent));
        } else if (((oO0O000) C0217o00o0oO0.create(oO0O000.class, mainThread, false))._check_performNewIntents(null, null, false) != null) {
            ((oO0O000) C0217o00o0oO0.create(oO0O000.class, mainThread, false)).performNewIntents(iBinder, Collections.singletonList(intent), true);
        } else if (((InterfaceC1560oo0o00o0) C0217o00o0oO0.create(InterfaceC1560oo0o00o0.class, mainThread, false))._check_handleNewIntent(null, null) != null) {
            ((InterfaceC1560oo0o00o0) C0217o00o0oO0.create(InterfaceC1560oo0o00o0.class, mainThread, false)).handleNewIntent(iBinder, Collections.singletonList(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$scheduleReceiver$3(ReceiverData receiverData) {
        Context baseContext;
        BroadcastReceiver broadcastReceiver;
        Intent intent = receiverData.intent;
        ActivityInfo activityInfo = receiverData.activityInfo;
        BroadcastReceiver.PendingResult build = receiverData.data.build();
        BroadcastReceiver broadcastReceiver2 = null;
        try {
            baseContext = this.mInitialApplication.getBaseContext();
            ClassLoader classLoader = baseContext.getClassLoader();
            intent.setExtrasClassLoader(classLoader);
            broadcastReceiver = (BroadcastReceiver) classLoader.loadClass(activityInfo.name).newInstance();
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((InterfaceC2080ooooO000) C0217o00o0oO0.create(InterfaceC2080ooooO000.class, broadcastReceiver, false)).setPendingResult(build);
            broadcastReceiver.onReceive(baseContext, intent);
            BroadcastReceiver.PendingResult pendingResult = ((InterfaceC2080ooooO000) C0217o00o0oO0.create(InterfaceC2080ooooO000.class, broadcastReceiver, false)).getPendingResult();
            if (pendingResult != null) {
                pendingResult.finish();
            }
            BlackBoxCore.getBActivityManager().finishBroadcast(receiverData.data);
        } catch (Throwable th2) {
            th = th2;
            broadcastReceiver2 = broadcastReceiver;
            th.printStackTrace();
            Objects.toString(intent);
            Objects.toString(broadcastReceiver2);
        }
    }

    private void onAfterApplicationOnCreate(String str, String str2, Application application) {
        for (AppLifecycleCallback appLifecycleCallback : BlackBoxCore.get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.afterApplicationOnCreate(str, str2, application, getUserId());
        }
    }

    private void onBeforeApplicationOnCreate(String str, String str2, Application application) {
        Objects.toString(application);
        Objects.toString(application != null ? application.getClassLoader() : "null");
        for (AppLifecycleCallback appLifecycleCallback : BlackBoxCore.get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.beforeApplicationOnCreate(str, str2, application, getUserId());
        }
    }

    private void onBeforeCreateApplication(String str, String str2, Context context) {
        for (AppLifecycleCallback appLifecycleCallback : BlackBoxCore.get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.beforeCreateApplication(str, str2, context, getUserId());
        }
    }

    private void setApplication(Application application) {
        try {
            this.mInitialApplication = application;
            ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false))._set_mInitialApplication(application);
        } catch (Exception unused) {
        }
    }

    @Override // com.app.framework.core.IBActivityThread
    public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
        if (!isInit()) {
            bindApplication(getAppConfig().packageName, getAppConfig().processName);
        }
        for (String str : providerInfo.authority.split(";")) {
            IInterface mContentProvider = ((InterfaceC1009oOOOOooO) C0217o00o0oO0.create(InterfaceC1009oOOOOooO.class, BlackBoxCore.getContext().getContentResolver().acquireContentProviderClient(str), false)).mContentProvider();
            if (mContentProvider != null) {
                return mContentProvider.asBinder();
            }
        }
        return null;
    }

    @Override // com.app.framework.core.IBActivityThread
    public void bindApplication() {
        if (isInit()) {
            return;
        }
        bindApplication(getAppPackageName(), getAppProcessName());
    }

    public JobService createJobService(ServiceInfo serviceInfo) {
        if (!currentActivityThread().isInit()) {
            currentActivityThread().bindApplication(serviceInfo.packageName, serviceInfo.processName);
        }
        try {
            JobService jobService = (JobService) ((InterfaceC1899ooOoo0) C0217o00o0oO0.create(InterfaceC1899ooOoo0.class, this.mBoundApplication.info, false)).getClassLoader().loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = BlackBoxCore.getContext().createPackageContext(serviceInfo.packageName, 3);
                ((InterfaceC1680ooO0O0O) C0217o00o0oO0.create(InterfaceC1680ooO0O0O.class, createPackageContext, false)).setOuterContext(jobService);
                ((InterfaceC1871ooOoO0o) C0217o00o0oO0.create(InterfaceC1871ooOoO0o.class, jobService, false)).attach(createPackageContext, BlackBoxCore.mainThread(), serviceInfo.name, currentActivityThread().getActivityThread(), this.mInitialApplication, AbstractC0809oO0OooOO.OooO00o().getDefault());
                ContextCompat.fix(createPackageContext);
                jobService.onCreate();
                jobService.onBind(null);
                return jobService;
            } catch (Exception e) {
                if (!serviceInfo.name.contains("google.android.gms") && !serviceInfo.name.contains("google.android.location")) {
                    e.getMessage();
                }
                return null;
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
            if (serviceInfo.name.contains("google.android.gms") || serviceInfo.name.contains("google.android.location")) {
                return null;
            }
            e.printStackTrace();
            e.toString();
            return null;
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            String str = serviceInfo.name;
            e.toString();
            return null;
        }
    }

    public Service createService(ServiceInfo serviceInfo, IBinder iBinder) {
        if (!currentActivityThread().isInit()) {
            currentActivityThread().bindApplication(serviceInfo.packageName, serviceInfo.processName);
        }
        try {
            Service service = (Service) ((InterfaceC1899ooOoo0) C0217o00o0oO0.create(InterfaceC1899ooOoo0.class, this.mBoundApplication.info, false)).getClassLoader().loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = BlackBoxCore.getContext().createPackageContext(serviceInfo.packageName, 3);
                ((InterfaceC1680ooO0O0O) C0217o00o0oO0.create(InterfaceC1680ooO0O0O.class, createPackageContext, false)).setOuterContext(service);
                ((InterfaceC1871ooOoO0o) C0217o00o0oO0.create(InterfaceC1871ooOoO0o.class, service, false)).attach(createPackageContext, BlackBoxCore.mainThread(), serviceInfo.name, iBinder, this.mInitialApplication, AbstractC0809oO0OooOO.OooO00o().getDefault());
                ContextCompat.fix(createPackageContext);
                service.onCreate();
                return service;
            } catch (Exception e) {
                if (!serviceInfo.name.contains("google.android.gms") && !serviceInfo.name.contains("google.android.location")) {
                    e.getMessage();
                }
                return null;
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
            if (serviceInfo.name.contains("google.android.gms") || serviceInfo.name.contains("google.android.location")) {
                return null;
            }
            e.printStackTrace();
            e.toString();
            return null;
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            String str = serviceInfo.name;
            e.toString();
            return null;
        }
    }

    @Override // com.app.framework.core.IBActivityThread
    public void finishActivity(IBinder iBinder) {
        this.mH.post(new RunnableC0061o00000oO(2, iBinder));
    }

    @Override // com.app.framework.core.IBActivityThread
    public IBinder getActivityThread() {
        return ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).getApplicationThread();
    }

    public Object getPackageInfo() {
        return this.mBoundApplication.info;
    }

    public synchronized void handleBindApplication(String str, String str2) {
        Application application;
        try {
            if (isInit()) {
                return;
            }
            try {
                CrashHandler.create();
            } catch (Throwable unused) {
            }
            PackageInfo packageInfo = BlackBoxCore.getBPackageManager().getPackageInfo(str, 8, getUserId());
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (packageInfo.providers == null) {
                packageInfo.providers = new ProviderInfo[0];
            }
            this.mProviders.addAll(Arrays.asList(packageInfo.providers));
            Object mBoundApplication = ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).mBoundApplication();
            Context createPackageContext = createPackageContext(applicationInfo);
            Object mPackageInfo = ((InterfaceC1680ooO0O0O) C0217o00o0oO0.create(InterfaceC1680ooO0O0O.class, createPackageContext, false)).mPackageInfo();
            ((InterfaceC1899ooOoo0) C0217o00o0oO0.create(InterfaceC1899ooOoo0.class, mPackageInfo, false))._set_mSecurityViolation(Boolean.FALSE);
            ((InterfaceC1899ooOoo0) C0217o00o0oO0.create(InterfaceC1899ooOoo0.class, mPackageInfo, false))._set_mApplicationInfo(applicationInfo);
            int i = applicationInfo.targetSdkVersion;
            if (i < 9) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24 && i < 24) {
                StrictModeCompat.disableDeathOnFileUriExposure();
            }
            if (i2 >= 28) {
                WebView.setDataDirectorySuffix(getUserId() + ":" + str + ":" + str2);
            }
            VirtualRuntime.setupRuntime(str2, applicationInfo);
            ((InterfaceC1853ooOo0o) C0217o00o0oO0.create(InterfaceC1853ooOo0o.class, ((InterfaceC1874ooOoO0oo) C0217o00o0oO0.create(InterfaceC1874ooOoO0oo.class, null, false)).getRuntime(), false)).setTargetSdkVersion(applicationInfo.targetSdkVersion);
            if (BuildCompat.isS()) {
                ((InterfaceC0935oOO0Oo0O) C0217o00o0oO0.create(InterfaceC0935oOO0Oo0O.class, null, false)).setTargetSdkVersion(applicationInfo.targetSdkVersion);
            }
            NativeCore.init(i2);
            IOCore.get().enableRedirect(createPackageContext);
            AppBindData appBindData = new AppBindData();
            appBindData.appInfo = applicationInfo;
            appBindData.processName = str2;
            appBindData.info = mPackageInfo;
            appBindData.providers = this.mProviders;
            o0OO0O0 o0oo0o0 = (o0OO0O0) C0217o00o0oO0.create(o0OO0O0.class, mBoundApplication, false);
            o0oo0o0._set_instrumentationName(new ComponentName(appBindData.appInfo.packageName, Instrumentation.class.getName()));
            o0oo0o0._set_appInfo(appBindData.appInfo);
            o0oo0o0._set_info(appBindData.info);
            o0oo0o0._set_processName(appBindData.processName);
            o0oo0o0._set_providers(appBindData.providers);
            this.mBoundApplication = appBindData;
            if (o0O00OOO.classReady(InterfaceC0530o0o0O00o.class) != null) {
                Security.removeProvider("AndroidNSSP");
                ((InterfaceC0667o0ooo0) C0217o00o0oO0.create(InterfaceC0667o0ooo0.class, null, false)).install(createPackageContext);
            }
            try {
                onBeforeCreateApplication(str, str2, createPackageContext);
                try {
                    application = ((InterfaceC1899ooOoo0) C0217o00o0oO0.create(InterfaceC1899ooOoo0.class, mPackageInfo, false)).makeApplication(false, null);
                } catch (Exception unused2) {
                    application = null;
                }
                if (application == null) {
                    try {
                        application = ((InterfaceC1899ooOoo0) C0217o00o0oO0.create(InterfaceC1899ooOoo0.class, mPackageInfo, false)).makeApplication(true, null);
                    } catch (Exception unused3) {
                    }
                    if (application == null) {
                        try {
                            application = (Application) createPackageContext;
                            if (application == null) {
                                throw new RuntimeException("Unable to create application context");
                            }
                        } catch (Exception e) {
                            throw new RuntimeException("Unable to makeApplication - all fallback attempts failed", e);
                        }
                    }
                }
                this.mInitialApplication = application;
                ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false))._set_mInitialApplication(this.mInitialApplication);
                ContextCompat.fix((Context) ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).getSystemContext());
                ContextCompat.fix(this.mInitialApplication);
                appBindData.providers.size();
                installProviders(this.mInitialApplication, appBindData.processName, appBindData.providers);
                onBeforeApplicationOnCreate(str, str2, application);
                AppInstrumentation.get().callApplicationOnCreate(application);
                onAfterApplicationOnCreate(str, str2, application);
                HookManager.get().checkEnv(HCallbackProxy.class);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to makeApplication", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.app.framework.core.IBActivityThread
    public void handleNewIntent(IBinder iBinder, Intent intent) {
        this.mH.post(new RunnableC0090o000OoOO(intent, 2, iBinder));
    }

    public void initProcess(AppConfig appConfig) {
        synchronized (mConfigLock) {
            try {
                AppConfig appConfig2 = this.mAppConfig;
                if (appConfig2 != null && !appConfig2.packageName.equals(appConfig.packageName)) {
                    throw new RuntimeException("reject init process: " + appConfig.processName + ", this process is : " + this.mAppConfig.processName);
                }
                this.mAppConfig = appConfig;
                final IBinder asBinder = asBinder();
                try {
                    asBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.app.framework.app.BActivityThread.1
                        @Override // android.os.IBinder.DeathRecipient
                        public void binderDied() {
                            synchronized (BActivityThread.mConfigLock) {
                                try {
                                    asBinder.linkToDeath(this, 0);
                                } catch (RemoteException unused) {
                                }
                                BActivityThread.this.mAppConfig = null;
                            }
                        }
                    }, 0);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isInit() {
        return this.mBoundApplication != null;
    }

    public void loadXposed(Context context) {
        String appPackageName = getAppPackageName();
        String appProcessName = getAppProcessName();
        if (!TextUtils.isEmpty(appPackageName) && !TextUtils.isEmpty(appProcessName) && BXposedManager.get().isXPEnable()) {
            appPackageName.equals(appProcessName);
            for (InstalledModule installedModule : BXposedManager.get().getInstalledModules()) {
                boolean z = installedModule.enable;
            }
        }
        if (BlackBoxCore.get().isHideXposed()) {
            NativeCore.hideXposed();
        }
    }

    @Override // com.app.framework.core.IBActivityThread
    public IBinder peekService(Intent intent) {
        return AppServiceDispatcher.get().peekService(intent);
    }

    @Override // com.app.framework.core.IBActivityThread
    public void restartJobService(String str) {
    }

    @Override // com.app.framework.core.IBActivityThread
    public void scheduleReceiver(ReceiverData receiverData) {
        if (!isInit()) {
            bindApplication();
        }
        this.mH.post(new RunnableC0090o000OoOO(this, 1, receiverData));
    }

    @Override // com.app.framework.core.IBActivityThread
    public void stopService(Intent intent) {
        AppServiceDispatcher.get().stopService(intent);
    }

    public void bindApplication(String str, String str2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            createBindApplicationData(str, str2);
            handleBindApplication(str, str2);
            return;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        BlackBoxCore.get().getHandler().post(new o00Oo00(this, str, str2, conditionVariable, 0));
        conditionVariable.block();
    }
}


