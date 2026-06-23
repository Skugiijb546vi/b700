package com.app.framework.fake.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.DexFileRecovery;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class ClassLoaderProxy extends ClassInvocationStub {
    private static final String TAG = "ClassLoaderProxy";
    private static final Map<String, Class<?>> sClassCache = new HashMap();
    private static final Map<String, Boolean> sDexFileCache = new HashMap();
    private static final List<ClassLoader> sFallbackClassLoaders = new ArrayList();

    @ProxyMethod("findClass")
    /* loaded from: classes.dex */
    public static class FindClass extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            Map map = ClassLoaderProxy.sClassCache;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            if (ClassLoaderProxy.isProblematicClass(str)) {
                return null;
            }
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    map.put(str, (Class) invoke);
                    return invoke;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            Class tryFallbackClassLoaders = ClassLoaderProxy.tryFallbackClassLoaders(str);
            if (tryFallbackClassLoaders != null) {
                ClassLoaderProxy.sClassCache.put(str, tryFallbackClassLoaders);
                return tryFallbackClassLoaders;
            }
            return null;
        }
    }

    @ProxyMethod("forName")
    /* loaded from: classes.dex */
    public static class ForName extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            Map map = ClassLoaderProxy.sClassCache;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            if (ClassLoaderProxy.isProblematicClass(str)) {
                return null;
            }
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    map.put(str, (Class) invoke);
                    return invoke;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            Class tryFallbackClassLoaders = ClassLoaderProxy.tryFallbackClassLoaders(str);
            if (tryFallbackClassLoaders != null) {
                ClassLoaderProxy.sClassCache.put(str, tryFallbackClassLoaders);
                return tryFallbackClassLoaders;
            }
            return null;
        }
    }

    @ProxyMethod("loadClass")
    /* loaded from: classes.dex */
    public static class LoadClass extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            if (objArr.length > 1) {
                ((Boolean) objArr[1]).getClass();
            }
            Map map = ClassLoaderProxy.sClassCache;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            if (ClassLoaderProxy.isProblematicClass(str)) {
                return null;
            }
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    map.put(str, (Class) invoke);
                    return invoke;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            Class tryFallbackClassLoaders = ClassLoaderProxy.tryFallbackClassLoaders(str);
            if (tryFallbackClassLoaders != null) {
                ClassLoaderProxy.sClassCache.put(str, tryFallbackClassLoaders);
                return tryFallbackClassLoaders;
            }
            return null;
        }
    }

    @ProxyMethod("loadDexFile")
    /* loaded from: classes.dex */
    public static class LoadDexFile extends MethodHook {
        private String extractCorruptedFilePathFromError(Exception exc, Object obj) {
            int indexOf;
            try {
                String message = exc.getMessage();
                if (message != null && message.contains("/data/app/") && (indexOf = message.indexOf("/data/app/")) >= 0) {
                    int indexOf2 = message.indexOf(" ", indexOf);
                    if (indexOf2 < 0) {
                        indexOf2 = message.length();
                    }
                    return message.substring(indexOf, indexOf2);
                }
                try {
                    Field declaredField = obj.getClass().getDeclaredField("pathList");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        Field declaredField2 = obj2.getClass().getDeclaredField("dexElements");
                        declaredField2.setAccessible(true);
                        Object[] objArr = (Object[]) declaredField2.get(obj2);
                        if (objArr == null || objArr.length <= 0) {
                            return null;
                        }
                        Field declaredField3 = objArr[0].getClass().getDeclaredField("path");
                        declaredField3.setAccessible(true);
                        return (String) declaredField3.get(objArr[0]);
                    }
                    return null;
                } catch (Exception e) {
                    e.getMessage();
                    return null;
                }
            } catch (Exception e2) {
                e2.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String extractCorruptedFilePathFromError;
            Object createFallbackDexPathList;
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("classes.dex") && message.contains("Entry not found") && (extractCorruptedFilePathFromError = extractCorruptedFilePathFromError(e, obj)) != null) {
                    DexFileRecovery.RecoveryResult recoverDexFile = DexFileRecovery.recoverDexFile(extractCorruptedFilePathFromError);
                    if (recoverDexFile.success && (createFallbackDexPathList = ClassLoaderProxy.createFallbackDexPathList(obj, recoverDexFile.recoveredFilePath)) != null) {
                        return createFallbackDexPathList;
                    }
                }
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("openDexFile")
    /* loaded from: classes.dex */
    public static class OpenDexFile extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            if (!ClassLoaderProxy.isValidDexFile(str)) {
                String recoverDexFile = ClassLoaderProxy.recoverDexFile(str);
                if (recoverDexFile == null) {
                    return null;
                }
                objArr[0] = recoverDexFile;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    public ClassLoaderProxy() {
        initializeFallbackClassLoaders();
    }

    public static void clearClassCache() {
        sClassCache.clear();
        sDexFileCache.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object createFallbackDexPathList(Object obj, String str) {
        return null;
    }

    private static String findAlternativeApkFile(String str) {
        File[] listFiles;
        try {
            File parentFile = new File(str).getParentFile();
            if (parentFile == null || !parentFile.exists() || (listFiles = parentFile.listFiles()) == null) {
                return null;
            }
            for (File file : listFiles) {
                if (file.getName().endsWith(".apk") && file.length() > 1000000) {
                    file.getAbsolutePath();
                    return file.getAbsolutePath();
                }
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static String getCacheStats() {
        return "Class Cache: " + sClassCache.size() + " entries, DEX Cache: " + sDexFileCache.size() + " entries";
    }

    private void initializeFallbackClassLoaders() {
        ClassLoader classLoader;
        try {
            Context context = BlackBoxCore.getContext();
            if (context != null && (classLoader = context.getClassLoader()) != null) {
                sFallbackClassLoaders.add(classLoader);
            }
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (systemClassLoader != null) {
                sFallbackClassLoaders.add(systemClassLoader);
            }
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (classLoader2 != null) {
                sFallbackClassLoaders.add(classLoader2);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isProblematicClass(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("kotlinx.coroutines.test") || str.contains("com.mediatek.perfservice") || str.contains("com.mediatek.powerhalmgr") || str.contains("androidx.datastore.preferences.protobuf") || str.contains("NewInstanceSchemaFull") || str.contains("ExtensionSchemaFull") || str.contains("org.robolectric") || str.contains("Robolectric") || str.contains("TestMainDispatcherFactory") || str.contains("PerfServiceWrapper") || str.contains("PowerHalMgrFactory");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidDexFile(String str) {
        if (str == null) {
            return false;
        }
        Map<String, Boolean> map = sDexFileCache;
        if (map.containsKey(str)) {
            return map.get(str).booleanValue();
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                map.put(str, Boolean.FALSE);
                return false;
            }
            if (!str.endsWith(".apk") && !str.endsWith(".zip")) {
                map.put(str, Boolean.TRUE);
                return true;
            }
            boolean validateApkFile = validateApkFile(file);
            map.put(str, Boolean.valueOf(validateApkFile));
            return validateApkFile;
        } catch (Exception e) {
            e.getMessage();
            sDexFileCache.put(str, Boolean.FALSE);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String recoverDexFile(String str) {
        ApplicationInfo applicationInfo;
        try {
            String findAlternativeApkFile = findAlternativeApkFile(str);
            if (findAlternativeApkFile != null) {
                return findAlternativeApkFile;
            }
            Context context = BlackBoxCore.getContext();
            if (context == null || (applicationInfo = context.getApplicationInfo()) == null) {
                return null;
            }
            String str2 = applicationInfo.sourceDir;
            if (str2 != null) {
                return str2;
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private static Object recoverDexPathList(Object obj, Object[] objArr) {
        ApplicationInfo applicationInfo;
        String str;
        try {
            Context context = BlackBoxCore.getContext();
            if (context == null || (applicationInfo = context.getApplicationInfo()) == null || (str = applicationInfo.sourceDir) == null) {
                return null;
            }
            return createFallbackDexPathList(obj, str);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class<?> tryFallbackClassLoaders(String str) {
        Class<?> loadClass;
        for (ClassLoader classLoader : sFallbackClassLoaders) {
            try {
                loadClass = classLoader.loadClass(str);
            } catch (Exception unused) {
            }
            if (loadClass != null) {
                return loadClass;
            }
        }
        return null;
    }

    private static boolean validateApkFile(File file) {
        try {
            return file.length() > 1000;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
