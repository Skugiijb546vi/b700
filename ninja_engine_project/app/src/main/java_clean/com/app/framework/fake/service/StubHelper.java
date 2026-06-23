package com.app.framework.fake.service;

import android.os.IBinder;
import com.ninja.engine.AbstractC0694o0ooooo0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class StubHelper {
    private static final String TAG = "StubHelper";

    public static Object getServiceInterface(String str, String str2, String str3) {
        Method method;
        try {
            Class<?> cls = Class.forName(str2);
            Object invoke = cls.getMethod("get", null).invoke(null, null);
            try {
                try {
                    method = cls.getMethod("asInterface", IBinder.class);
                } catch (NoSuchMethodException unused) {
                    Method[] methods = cls.getMethods();
                    int length = methods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        Method method2 = methods[i];
                        if (method2.getName().equals("asInterface") && method2.getParameterTypes().length == 1) {
                            method = method2;
                            break;
                        }
                        i++;
                    }
                }
            } catch (NoSuchMethodException unused2) {
                method = cls.getMethod("asInterface", Object.class);
            }
            if (method != null) {
                return method.invoke(invoke, AbstractC0694o0ooooo0.OooO0OO().getService(str));
            }
        } catch (Exception unused3) {
        }
        try {
            return Class.forName(str3).getMethod("asInterface", IBinder.class).invoke(null, AbstractC0694o0ooooo0.OooO0OO().getService(str));
        } catch (Exception unused4) {
            return null;
        }
    }

    public static Object getServiceInterface(String str, String str2, String str3, IBinder iBinder) {
        Method method;
        try {
            Class<?> cls = Class.forName(str2);
            Object invoke = cls.getMethod("get", null).invoke(null, null);
            try {
                try {
                    method = cls.getMethod("asInterface", IBinder.class);
                } catch (NoSuchMethodException unused) {
                    Method[] methods = cls.getMethods();
                    int length = methods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        Method method2 = methods[i];
                        if (method2.getName().equals("asInterface") && method2.getParameterTypes().length == 1) {
                            method = method2;
                            break;
                        }
                        i++;
                    }
                }
            } catch (NoSuchMethodException unused2) {
                method = cls.getMethod("asInterface", Object.class);
            }
            if (method != null) {
                return method.invoke(invoke, iBinder != null ? iBinder : AbstractC0694o0ooooo0.OooO0OO().getService(str));
            }
        } catch (Exception unused3) {
        }
        if (iBinder == null) {
            try {
                iBinder = AbstractC0694o0ooooo0.OooO0OO().getService(str);
            } catch (Exception unused4) {
                return null;
            }
        }
        return Class.forName(str3).getMethod("asInterface", IBinder.class).invoke(null, iBinder);
    }
}


