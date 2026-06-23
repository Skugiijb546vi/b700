package com.app.framework.utils;

import android.os.Process;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
/* loaded from: classes.dex */
public class AttributionSourceUtils {
    private static final String TAG = "AttributionSourceUtils";

    public static Object createSafeAttributionSource() {
        try {
            Class<?> cls = Class.forName("android.content.AttributionSource");
            try {
                try {
                    Constructor<?> declaredConstructor = cls.getDeclaredConstructor(Integer.TYPE, String.class);
                    declaredConstructor.setAccessible(true);
                    return declaredConstructor.newInstance(Integer.valueOf(resolveRealCallingUid()), resolveRealCallingPackage());
                } catch (Exception unused) {
                    Constructor<?> declaredConstructor2 = cls.getDeclaredConstructor(null);
                    declaredConstructor2.setAccessible(true);
                    Object newInstance = declaredConstructor2.newInstance(null);
                    fixAttributionSourceUid(newInstance);
                    return newInstance;
                }
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    public static void fixAttributionSourceInArgs(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        for (Object obj : objArr) {
            if (obj != null && obj.getClass().getName().contains("AttributionSource")) {
                try {
                    fixAttributionSourceUid(obj);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
        for (Object obj2 : objArr) {
            if (obj2 != null && obj2.getClass().getName().contains("Bundle")) {
                try {
                    fixAttributionSourceInBundle(obj2);
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }
    }

    public static void fixAttributionSourceInBundle(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            for (String str : (Set) obj.getClass().getMethod("keySet", null).invoke(obj, null)) {
                try {
                    Object invoke = obj.getClass().getMethod("get", String.class).invoke(obj, str);
                    if (invoke != null && invoke.getClass().getName().contains("AttributionSource")) {
                        fixAttributionSourceUid(invoke);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void fixAttributionSourceUid(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            int resolveRealCallingUid = resolveRealCallingUid();
            String resolveRealCallingPackage = resolveRealCallingPackage();
            Class<?> cls = obj.getClass();
            String[] strArr = {"mUid", "uid", "mCallingUid", "callingUid", "mSourceUid", "sourceUid"};
            for (int i = 0; i < 6; i++) {
                try {
                    Field declaredField = cls.getDeclaredField(strArr[i]);
                    declaredField.setAccessible(true);
                    declaredField.set(obj, Integer.valueOf(resolveRealCallingUid));
                } catch (NoSuchFieldException unused) {
                }
            }
            try {
                Method declaredMethod = cls.getDeclaredMethod("setUid", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, Integer.valueOf(resolveRealCallingUid));
            } catch (Exception unused2) {
            }
            String[] strArr2 = {"mPackageName", "packageName", "mSourcePackage", "sourcePackage"};
            for (int i2 = 0; i2 < 4; i2++) {
                try {
                    Field declaredField2 = cls.getDeclaredField(strArr2[i2]);
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, resolveRealCallingPackage);
                    return;
                } catch (NoSuchFieldException unused3) {
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static String resolveRealCallingPackage() {
        String packageName;
        try {
            if (BlackBoxCore.getContext() != null && (packageName = BlackBoxCore.getContext().getPackageName()) != null) {
                if (!packageName.isEmpty()) {
                    return packageName;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            String hostPkg = BlackBoxCore.getHostPkg();
            return hostPkg != null ? !hostPkg.isEmpty() ? hostPkg : "unknown" : "unknown";
        } catch (Throwable unused2) {
            return "unknown";
        }
    }

    private static int resolveRealCallingUid() {
        try {
            return Process.myUid();
        } catch (Throwable unused) {
            return BActivityThread.getBUid();
        }
    }

    public static boolean validateAttributionSource(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Class<?> cls = obj.getClass();
            String[] strArr = {"mUid", "uid", "mCallingUid", "callingUid", "mSourceUid", "sourceUid"};
            int resolveRealCallingUid = resolveRealCallingUid();
            for (int i = 0; i < 6; i++) {
                try {
                    Field declaredField = cls.getDeclaredField(strArr[i]);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if ((obj2 instanceof Integer) && ((Integer) obj2).intValue() == resolveRealCallingUid) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            fixAttributionSourceUid(obj);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
