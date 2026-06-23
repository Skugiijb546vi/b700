package com.app.framework.closecode;

import android.app.Activity;
import android.os.MessageQueue;
import android.os.Process;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class EightBallPoolHook {
    private static final String TAG = "8BallHook";
    private static final String TARGET_PACKAGE = "com.miniclip.eightballpool";
    private static volatile boolean sBypassApplied = false;
    private static Class<?> sChd218 = null;
    private static Field sCurrentActivitiesCount = null;
    private static Field sCurrentActivityField = null;
    private static ClassLoader sGameClassLoader = null;
    private static Class<?> sHnbiw1 = null;
    private static volatile boolean sHooked = false;
    private static Class<?> sI8WqJ1 = null;
    private static volatile boolean sInitialized = false;
    private static Field sIsExitingField = null;
    private static Field sIsRegisterNativesDone = null;
    private static Field sMsgNext = null;
    private static Field sMsgQueueMessages = null;
    private static Field sMsgTarget = null;
    private static Field sMsgWhen = null;
    private static Field sPendingPopupField = null;
    private static Field sRtmAllowCancellationsField = null;
    private static Class<?> sRtmClass = null;
    private static Field sRtmInstanceField = null;
    private static volatile boolean sRtmNeutralized = false;
    private static Field sShouldFinishActivities;

    public static void afterActivityOnCreate(Activity activity) {
        if (sInitialized && sHooked) {
            nullCurrentActivity();
        }
    }

    public static void afterActivityOnResume(Activity activity) {
        if (sInitialized && sHooked) {
            nullCurrentActivity();
        }
    }

    public static void afterActivityOnStart(Activity activity) {
        if (sInitialized && sHooked) {
            nullCurrentActivity();
        }
    }

    public static void applyBypassForActivity(Activity activity) {
        if (sInitialized) {
            if (!sHooked && activity != null) {
                try {
                    ClassLoader classLoader = activity.getClassLoader();
                    if (classLoader != null) {
                        installHooksWithClassLoader(classLoader);
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            if (!sHooked || activity == null) {
                return;
            }
            try {
                Field field = sIsExitingField;
                if (field != null) {
                    field.set(null, Boolean.TRUE);
                }
                Field field2 = sShouldFinishActivities;
                if (field2 != null) {
                    field2.set(null, Boolean.FALSE);
                }
                Field field3 = sPendingPopupField;
                if (field3 != null) {
                    field3.set(null, null);
                }
                sBypassApplied = true;
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    private static void applyPreemptiveBypass() {
        try {
            Field field = sIsExitingField;
            if (field != null) {
                field.set(null, Boolean.TRUE);
            }
            Field field2 = sShouldFinishActivities;
            if (field2 != null) {
                field2.set(null, Boolean.FALSE);
            }
            Field field3 = sCurrentActivitiesCount;
            if (field3 != null) {
                field3.set(null, 999);
            }
            Field field4 = sCurrentActivityField;
            if (field4 != null) {
                field4.set(null, null);
            }
            Field field5 = sPendingPopupField;
            if (field5 != null) {
                field5.set(null, null);
            }
            sBypassApplied = true;
        } catch (Exception unused) {
        }
    }

    public static void beforeActivityOnDestroy(Activity activity) {
        if (sInitialized && sHooked) {
            try {
                Field field = sCurrentActivitiesCount;
                if (field == null) {
                    return;
                }
                field.set(null, 999);
            } catch (Exception unused) {
            }
        }
    }

    public static void beforeOnResume(Activity activity) {
        if (sInitialized && sHooked) {
            try {
                Field field = sIsExitingField;
                if (field != null) {
                    field.set(null, Boolean.TRUE);
                }
                Field field2 = sShouldFinishActivities;
                if (field2 != null) {
                    field2.set(null, Boolean.FALSE);
                }
                Field field3 = sPendingPopupField;
                if (field3 != null) {
                    field3.set(null, null);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private static boolean cacheFields() {
        Field field = getField(sHnbiw1, "q1r2s3t4u5v6w7x8y9z0");
        sCurrentActivityField = field;
        if (field == null) {
            return false;
        }
        Field field2 = getField(sHnbiw1, "g1h2i3j4k5l6m7n8o9p0");
        sIsExitingField = field2;
        if (field2 != null) {
            sPendingPopupField = getField(sHnbiw1, "w1x2y3z4a5b6c7d8e9f0");
            Class<?> cls = sChd218;
            if (cls != null) {
                sShouldFinishActivities = getField(cls, "shouldFinishActivities");
                sCurrentActivitiesCount = getField(sChd218, "currentActivitiesCount");
            }
            Class<?> cls2 = sI8WqJ1;
            if (cls2 != null) {
                sIsRegisterNativesDone = getField(cls2, "isRegisterNativesDone");
            }
            Class<?> cls3 = sRtmClass;
            if (cls3 != null) {
                sRtmInstanceField = getField(cls3, "instance");
                sRtmAllowCancellationsField = getField(sRtmClass, "sAllowCancellations");
            }
            cacheMessageQueueFields();
            return true;
        }
        return false;
    }

    private static void cacheMessageQueueFields() {
        try {
            Field declaredField = MessageQueue.class.getDeclaredField("mMessages");
            sMsgQueueMessages = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.os.Message");
            Field declaredField2 = cls.getDeclaredField("next");
            sMsgNext = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("when");
            sMsgWhen = declaredField3;
            declaredField3.setAccessible(true);
            Field declaredField4 = cls.getDeclaredField("target");
            sMsgTarget = declaredField4;
            declaredField4.setAccessible(true);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static Field getField(Class<?> cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static void initIfNeeded(String str) {
        if (TARGET_PACKAGE.equals(str)) {
            sInitialized = true;
            Process.myPid();
        }
    }

    public static void installHooksWithClassLoader(ClassLoader classLoader) {
        Objects.toString(classLoader);
        if (!sInitialized || sHooked || classLoader == null) {
            return;
        }
        sGameClassLoader = classLoader;
        boolean loadClasses = loadClasses();
        boolean cacheFields = loadClasses ? cacheFields() : false;
        if (loadClasses && cacheFields) {
            sHooked = true;
            applyPreemptiveBypass();
            startProtectionWatchdog();
        }
    }

    public static boolean isBypassApplied() {
        return sBypassApplied;
    }

    public static boolean isHooked() {
        return sHooked;
    }

    public static boolean isInitialized() {
        return sInitialized;
    }

    public static boolean isTargetPackage() {
        return sInitialized;
    }

    private static boolean loadClasses() {
        try {
            sHnbiw1 = Class.forName("i77S72.k19qF1.ezS222.hnbiw1", true, sGameClassLoader);
            try {
                sChd218 = Class.forName("i77S72.k19qF1.ezS222.chd218", true, sGameClassLoader);
            } catch (ClassNotFoundException unused) {
            }
            try {
                sI8WqJ1 = Class.forName("i77S72.k19qF1.ezS222.i8WqJ1", true, sGameClassLoader);
            } catch (ClassNotFoundException unused2) {
            }
            try {
                sRtmClass = Class.forName("com.miniclip.eightballpool.rtm.ResponseTimeMonitor", true, sGameClassLoader);
            } catch (ClassNotFoundException unused3) {
            }
            return true;
        } catch (ClassNotFoundException unused4) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neutralizeRTM() {
        if (sRtmInstanceField == null) {
            return;
        }
        try {
            Field field = sRtmAllowCancellationsField;
            if (field != null) {
                field.set(null, Boolean.TRUE);
            }
            Object obj = sRtmInstanceField.get(null);
            if (obj == null) {
                return;
            }
            Field declaredField = obj.getClass().getDeclaredField("mSupervisorRunnable");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                try {
                    Field declaredField2 = obj2.getClass().getDeclaredField("mCheckInterval");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj2, Integer.MAX_VALUE);
                    Field declaredField3 = obj2.getClass().getDeclaredField("mTimeoutCheck");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj2, Integer.MAX_VALUE);
                } catch (Exception e) {
                    e.getMessage();
                }
                try {
                    Method declaredMethod = obj2.getClass().getDeclaredMethod("stop", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(obj2, null);
                } catch (Exception e2) {
                    e2.getMessage();
                }
                try {
                    Field declaredField4 = obj2.getClass().getDeclaredField("mKillExecutor");
                    declaredField4.setAccessible(true);
                    Object obj3 = declaredField4.get(obj2);
                    if (obj3 != null) {
                        obj3.getClass().getMethod("shutdownNow", null).invoke(obj3, null);
                        declaredField4.set(obj2, Executors.newSingleThreadScheduledExecutor());
                    }
                } catch (Exception e3) {
                    e3.getMessage();
                }
            }
            if (sRtmNeutralized) {
                return;
            }
            sRtmNeutralized = true;
        } catch (Exception e4) {
            if (sRtmNeutralized) {
                return;
            }
            e4.getMessage();
        }
    }

    private static void nullCurrentActivity() {
        try {
            Field field = sCurrentActivityField;
            if (field != null) {
                field.set(null, null);
            }
        } catch (Exception unused) {
        }
    }

    private static void startProtectionWatchdog() {
        Thread thread = new Thread(new Runnable() { // from class: com.app.framework.closecode.EightBallPoolHook.1
            @Override // java.lang.Runnable
            public void run() {
                Integer num;
                Boolean bool;
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Field field = EightBallPoolHook.sIsExitingField;
                        if (field != null) {
                            Boolean bool2 = (Boolean) field.get(null);
                            if (bool2 != null) {
                                if (!bool2.booleanValue()) {
                                }
                            }
                            EightBallPoolHook.sIsExitingField.set(null, Boolean.TRUE);
                        }
                        Field field2 = EightBallPoolHook.sShouldFinishActivities;
                        if (field2 != null && (bool = (Boolean) field2.get(null)) != null && bool.booleanValue()) {
                            EightBallPoolHook.sShouldFinishActivities.set(null, Boolean.FALSE);
                        }
                        Field field3 = EightBallPoolHook.sCurrentActivitiesCount;
                        if (field3 != null && ((num = (Integer) field3.get(null)) == null || num.intValue() < 100)) {
                            EightBallPoolHook.sCurrentActivitiesCount.set(null, 999);
                        }
                        Field field4 = EightBallPoolHook.sCurrentActivityField;
                        if (field4 != null && field4.get(null) != null) {
                            EightBallPoolHook.sCurrentActivityField.set(null, null);
                        }
                        Field field5 = EightBallPoolHook.sPendingPopupField;
                        if (field5 != null && field5.get(null) != null) {
                            EightBallPoolHook.sPendingPopupField.set(null, null);
                        }
                        EightBallPoolHook.neutralizeRTM();
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        return;
                    } catch (Exception unused2) {
                    }
                }
            }
        }, "8BP-ProtectionWatchdog");
        thread.setDaemon(true);
        thread.start();
    }
}
