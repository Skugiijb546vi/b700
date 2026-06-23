package com.app.framework.utils;

import android.app.Activity;
import android.app.ActivityThread;
import android.content.Intent;
import com.app.framework.BlackBoxCore;
import com.ninja.engine.oO00OOOo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class SystemHookManager {
    private static final String TAG = "SystemHookManager";

    private static void ensureAllActivitiesHaveContext() {
        int i;
        try {
            Object mainThread = BlackBoxCore.mainThread();
            if (mainThread != null) {
                try {
                    Field[] declaredFields = mainThread.getClass().getDeclaredFields();
                    int length = declaredFields.length;
                    while (i < length) {
                        Field field = declaredFields[i];
                        i = (field.getType().getName().contains("ArrayMap") || field.getType().getName().contains("HashMap")) ? 0 : i + 1;
                        field.setAccessible(true);
                        Object obj = (Object) field.get(mainThread);
                        if (obj != null) {
                            try {
                                Object invoke = obj.getClass().getMethod("values", null).invoke(obj, null);
                                if (invoke instanceof Collection) {
                                    for (Object obj2 : (Collection) invoke) {
                                        if (obj2 != null) {
                                            try {
                                                Field declaredField = obj2.getClass().getDeclaredField("activity");
                                                declaredField.setAccessible(true);
                                                Object obj3 = (Object) declaredField.get(obj2);
                                                if (obj3 instanceof Activity) {
                                                    BlackBoxCore.ensureActivityContext((Activity) obj3);
                                                }
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    private static void hookActivityThread() {
        try {
            if (BlackBoxCore.mainThread() != null) {
                try {
                    Class cls = Boolean.TYPE;
                    Method declaredMethod = ActivityThread.class.getDeclaredMethod("handleLaunchActivity", Object.class, Intent.class, Object.class, Object.class, Object.class, String.class, Object.class, Object.class, Object.class, List.class, List.class, cls, cls, Object.class);
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private static void hookClientTransactionListenerController() {
        try {
            Class<?> cls = Class.forName("android.app.servertransaction.ClientTransactionListenerController");
            replaceControllerInstance(cls, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new oO00OOOo(1)), "ClientTransactionListenerController");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void hookConfigurationController() {
        try {
            Class<?> cls = Class.forName("android.app.ConfigurationController");
            replaceControllerInstance(cls, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new oO00OOOo(2)), "ConfigurationController");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void installAllHooks() {
        try {
            hookClientTransactionListenerController();
            hookConfigurationController();
            hookActivityThread();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static /* synthetic */ Object lambda$hookClientTransactionListenerController$0(Object obj, Method method, Object[] objArr) {
        if ("onContextConfigurationPreChanged".equals(method.getName())) {
            try {
                ensureAllActivitiesHaveContext();
                if (objArr == null || objArr.length <= 0) {
                    return null;
                }
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
        return method.invoke(obj, objArr);
    }

    public static /* synthetic */ Object lambda$hookConfigurationController$1(Object obj, Method method, Object[] objArr) {
        if ("handleConfigurationChanged".equals(method.getName())) {
            try {
                ensureAllActivitiesHaveContext();
                if (objArr == null || objArr.length <= 0) {
                    return null;
                }
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
        return method.invoke(obj, objArr);
    }

    private static void replaceControllerInstance(Class<?> cls, Object obj, String str) {
        Field[] declaredFields;
        try {
            Object mainThread = BlackBoxCore.mainThread();
            if (mainThread != null) {
                for (Field field : mainThread.getClass().getDeclaredFields()) {
                    if (field.getType().equals(cls)) {
                        field.setAccessible(true);
                        if (field.get(mainThread) != null) {
                            field.set(mainThread, obj);
                            return;
                        }
                    }
                }
                try {
                    Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                    if (declaredConstructors.length > 0) {
                        declaredConstructors[0].setAccessible(true);
                        declaredConstructors[0].newInstance(null);
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}



