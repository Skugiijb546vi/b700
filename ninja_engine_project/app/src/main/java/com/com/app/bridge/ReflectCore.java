package com.app.bridge;

import com.app.bridge.jni.JniHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ReflectCore {
    public static void set(Class<?> cls) {
        try {
            Field declaredField = Class.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            declaredField.set(cls, Integer.valueOf(1 | ((Integer) declaredField.get(cls)).intValue()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        for (Method method : cls.getDeclaredMethods()) {
            JniHook.setAccessible(cls, method);
        }
        for (Field field : cls.getDeclaredFields()) {
            JniHook.setAccessible(cls, field);
        }
        for (Class<?> cls2 : cls.getDeclaredClasses()) {
            set(cls2);
        }
    }
}
