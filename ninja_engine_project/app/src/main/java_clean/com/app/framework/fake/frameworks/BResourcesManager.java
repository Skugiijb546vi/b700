package com.app.framework.fake.frameworks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.IInjectHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class BResourcesManager implements IInjectHook {
    private static final String TAG = "BResourcesManager";

    public static Object createSafeResourceManager(Context context) {
        try {
            Class<?> cls = Class.forName("android.app.ResourcesManager");
            Object newInstance = cls.newInstance();
            try {
                Field declaredField = cls.getDeclaredField("mDisableOverlayLoading");
                declaredField.setAccessible(true);
                declaredField.setBoolean(newInstance, true);
            } catch (Exception e) {
                e.getMessage();
            }
            return newInstance;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    private static Object getPackageManager() {
        try {
            String str = BlackBoxCore.TAG;
            return BlackBoxCore.class.getMethod("getPackageManager", null).invoke(null, null);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private static String getPackageName(Object obj) {
        String packageNameSafely = getPackageNameSafely(obj);
        return packageNameSafely != null ? packageNameSafely : "";
    }

    private static String getPackageNameSafely(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("packageName");
            declaredField.setAccessible(true);
            Object obj2 = (Object) declaredField.get(obj);
            if (obj2 != null) {
                return obj2.toString();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            Object invoke = obj.getClass().getMethod("getPackageName", null).invoke(obj, null);
            if (invoke != null) {
                return invoke.toString();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        try {
            String obj3 = obj.toString();
            if (obj3.contains("packageName=")) {
                int indexOf = obj3.indexOf("packageName=") + 12;
                int indexOf2 = obj3.indexOf(" ", indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = obj3.length();
                }
                return obj3.substring(indexOf, indexOf2);
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
        return null;
    }

    public static boolean isProblematicOverlayPath(String str) {
        return str != null && str.contains("/data/resource-cache/") && str.contains(".frro");
    }

    public static Object safeLoadAppIcon(Object obj) {
        Object packageManager;
        if (obj != null) {
            try {
                Integer num = (Integer) obj.getClass().getMethod("getIcon", null).invoke(obj, null);
                if (num != null && num.intValue() != 0 && (packageManager = getPackageManager()) != null) {
                    try {
                        Object invoke = packageManager.getClass().getMethod("getDrawable", String.class, Integer.TYPE, ApplicationInfo.class).invoke(packageManager, getPackageName(obj), num, obj);
                        if (invoke != null) {
                            return invoke;
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
                Method method = obj.getClass().getMethod("loadIcon", PackageManager.class);
                Object packageManager2 = getPackageManager();
                if (packageManager2 != null) {
                    return method.invoke(obj, packageManager2);
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return null;
    }

    public static String safeLoadAppLabel(Object obj) {
        Integer num;
        Object invoke;
        Object packageManager;
        Object invoke2;
        if (obj == null) {
            return "Unknown App";
        }
        String packageNameSafely = getPackageNameSafely(obj);
        if (packageNameSafely == null || packageNameSafely.isEmpty()) {
            try {
                num = (Integer) obj.getClass().getMethod("getLabelRes", null).invoke(obj, null);
            } catch (Exception e) {
                e.getMessage();
            }
            if (num == null || num.intValue() == 0 || (packageManager = getPackageManager()) == null || (invoke2 = packageManager.getClass().getMethod("getText", String.class, Integer.TYPE, ApplicationInfo.class).invoke(packageManager, packageNameSafely, num, obj)) == null) {
                Method method = obj.getClass().getMethod("loadLabel", PackageManager.class);
                Object packageManager2 = getPackageManager();
                if (packageManager2 != null && (invoke = method.invoke(obj, packageManager2)) != null) {
                    return invoke.toString();
                }
                return "Unknown App";
            }
            return invoke2.toString();
        }
        return packageNameSafely;
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public void injectHook() {
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}



