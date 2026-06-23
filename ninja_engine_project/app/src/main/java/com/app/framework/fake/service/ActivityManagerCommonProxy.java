package com.app.framework.fake.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.app.FacebookWebViewActivity;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.provider.FileProviderHandler;
import com.app.framework.utils.ComponentUtils;
import com.app.framework.utils.MethodParameterUtils;
import com.app.framework.utils.compat.BuildCompat;
import com.app.framework.utils.compat.StartActivityCompat;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class ActivityManagerCommonProxy {
    public static final String TAG = "CommonStub";

    @ProxyMethod("activityDestroyed")
    /* loaded from: classes.dex */
    public static class ActivityDestroyed extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BlackBoxCore.getBActivityManager().onActivityDestroyed((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("activityResumed")
    /* loaded from: classes.dex */
    public static class ActivityResumed extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BlackBoxCore.getBActivityManager().onActivityResumed((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("finishActivity")
    /* loaded from: classes.dex */
    public static class FinishActivity extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BlackBoxCore.getBActivityManager().onFinishActivity((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getAppTasks")
    /* loaded from: classes.dex */
    public static class GetAppTasks extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("startActivities")
    /* loaded from: classes.dex */
    public static class StartActivities extends MethodHook {
        public int getIntents() {
            return BuildCompat.isR() ? 3 : 2;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intents = getIntents();
            Intent[] intentArr = (Intent[]) objArr[intents];
            String[] strArr = (String[]) objArr[intents + 1];
            IBinder iBinder = (IBinder) objArr[intents + 2];
            Bundle bundle = (Bundle) objArr[intents + 3];
            if (ComponentUtils.isSelf(intentArr)) {
                for (Intent intent : intentArr) {
                    intent.setExtrasClassLoader(obj.getClass().getClassLoader());
                }
                return Integer.valueOf(BlackBoxCore.getBActivityManager().startActivities(BActivityThread.getUserId(), intentArr, strArr, iBinder, bundle));
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("startActivity")
    /* loaded from: classes.dex */
    public static class StartActivity extends MethodHook {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private Intent getIntent(Object[] objArr) {
            Object obj = objArr[BuildCompat.isR() ? (char) 3 : (char) 2];
            if (obj instanceof Intent) {
                return (Intent) obj;
            }
            for (Object obj2 : objArr) {
                if (obj2 instanceof Intent) {
                    return (Intent) obj2;
                }
            }
            return null;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            Intent intent = getIntent(objArr);
            Objects.toString(intent);
            if (intent.getParcelableExtra("_B_|_target_") != null) {
                return method.invoke(obj, objArr);
            }
            if (ComponentUtils.isRequestInstall(intent)) {
                File convertFile = FileProviderHandler.convertFile(BActivityThread.getApplication(), intent.getData());
                if (convertFile != null && convertFile.exists()) {
                    try {
                        PackageInfo packageArchiveInfo = BlackBoxCore.getPackageManager().getPackageArchiveInfo(convertFile.getAbsolutePath(), 0);
                        if (packageArchiveInfo != null && packageArchiveInfo.packageName.equals(BlackBoxCore.getHostPkg())) {
                            return 0;
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
                if (BlackBoxCore.get().requestInstallPackage(convertFile, BActivityThread.getUserId())) {
                    return 0;
                }
                intent.setData(FileProviderHandler.convertFileUri(BActivityThread.getApplication(), intent.getData()));
                return method.invoke(obj, objArr);
            }
            String dataString = intent.getDataString();
            if (dataString != null) {
                if (dataString.equals("package:" + BActivityThread.getAppPackageName())) {
                    intent.setData(Uri.parse("package:" + BlackBoxCore.getHostPkg()));
                }
            }
            ResolveInfo resolveActivity = BlackBoxCore.getBPackageManager().resolveActivity(intent, 128, StartActivityCompat.getResolvedType(objArr), BActivityThread.getUserId());
            if (resolveActivity == null) {
                String str = intent.getPackage();
                if (intent.getPackage() == null && intent.getComponent() == null) {
                    intent.setPackage(BActivityThread.getAppPackageName());
                } else {
                    str = intent.getPackage();
                }
                ResolveInfo resolveActivity2 = BlackBoxCore.getBPackageManager().resolveActivity(intent, 128, StartActivityCompat.getResolvedType(objArr), BActivityThread.getUserId());
                if (resolveActivity2 == null) {
                    intent.setPackage(str);
                    if ("com.miniclip.eightballpool".equals(BActivityThread.getAppPackageName()) && intent.getData() != null && "com.android.chrome".equals(intent.getPackage())) {
                        String uri = intent.getData().toString();
                        if (uri.contains("facebook.com") && uri.contains("dialog/oauth")) {
                            intent.getData().getQueryParameter("redirect_uri");
                            Intent intent2 = new Intent(BlackBoxCore.getContext(), FacebookWebViewActivity.class);
                            intent2.putExtra(FacebookWebViewActivity.EXTRA_URL, uri);
                            intent2.addFlags(268435456);
                            BlackBoxCore.getContext().startActivity(intent2);
                            return 0;
                        }
                    }
                    return method.invoke(obj, objArr);
                }
                resolveActivity = resolveActivity2;
            }
            intent.setExtrasClassLoader(obj.getClass().getClassLoader());
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            BlackBoxCore.getBActivityManager().startActivityAms(BActivityThread.getUserId(), StartActivityCompat.getIntent(objArr), StartActivityCompat.getResolvedType(objArr), StartActivityCompat.getResultTo(objArr), StartActivityCompat.getResultWho(objArr), StartActivityCompat.getRequestCode(objArr), StartActivityCompat.getFlags(objArr), StartActivityCompat.getOptions(objArr));
            return 0;
        }
    }

    @ProxyMethod("startIntentSenderForResult")
    /* loaded from: classes.dex */
    public static class StartIntentSenderForResult extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getCallingActivity")
    /* loaded from: classes.dex */
    public static class getCallingActivity extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BlackBoxCore.getBActivityManager().getCallingActivity((IBinder) objArr[0], BActivityThread.getUserId());
        }
    }

    @ProxyMethod("getCallingPackage")
    /* loaded from: classes.dex */
    public static class getCallingPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BlackBoxCore.getBActivityManager().getCallingPackage((IBinder) objArr[0], BActivityThread.getUserId());
        }
    }
}
