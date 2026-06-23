package com.app.bridge.jni;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class JniHook {
    public static final int NATIVE_OFFSET = 0;
    public static final int NATIVE_OFFSET_2 = 0;

    public static final native void nativeOffset();

    public static native void nativeOffset2();

    public static native void setAccessible(Class<?> cls, Field field);

    public static native void setAccessible(Class<?> cls, Method method);
}
