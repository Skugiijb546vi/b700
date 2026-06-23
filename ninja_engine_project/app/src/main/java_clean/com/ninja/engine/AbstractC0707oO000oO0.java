package com.ninja.engine;

import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import sun.misc.Unsafe;
/* renamed from: com.ninja.engine.oO000oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0707oO000oO0 {
    public static final Unsafe OooO00o;
    public static final long OooO0O0;
    public static final long OooO0OO;
    public static final long OooO0Oo;
    public static final long OooO0o0;

    static {
        MethodHandles.Lookup lookup;
        MethodHandle unreflect;
        MethodHandles.Lookup lookup2;
        MethodHandle unreflect2;
        MethodHandles.Lookup lookup3;
        MethodHandle unreflectGetter;
        MethodHandles.Lookup lookup4;
        MethodHandle unreflectGetter2;
        new HashSet();
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            OooO00o = unsafe;
            OooO0O0 = unsafe.objectFieldOffset(C0785oO0OOoo0.class.getDeclaredField("artMethod"));
            unsafe.objectFieldOffset(C0785oO0OOoo0.class.getDeclaredField("declaringClass"));
            long objectFieldOffset = unsafe.objectFieldOffset(C0702oO000Ooo.class.getDeclaredField("artFieldOrMethod"));
            unsafe.objectFieldOffset(oO000o00.class.getDeclaredField("info"));
            long objectFieldOffset2 = unsafe.objectFieldOffset(oO0OO0OO.class.getDeclaredField("methods"));
            OooO0OO = objectFieldOffset2;
            long objectFieldOffset3 = unsafe.objectFieldOffset(oO0OO0OO.class.getDeclaredField("iFields"));
            unsafe.objectFieldOffset(oO0OO0OO.class.getDeclaredField("sFields"));
            unsafe.objectFieldOffset(C0701oO000OoO.class.getDeclaredField("member"));
            Method declaredMethod = C0704oO000o0.class.getDeclaredMethod("a", null);
            Method declaredMethod2 = C0704oO000o0.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            lookup = MethodHandles.lookup();
            unreflect = lookup.unreflect(declaredMethod);
            lookup2 = MethodHandles.lookup();
            unreflect2 = lookup2.unreflect(declaredMethod2);
            long j = unsafe.getLong(unreflect, objectFieldOffset);
            long j2 = unsafe.getLong(unreflect2, objectFieldOffset);
            long j3 = unsafe.getLong(C0704oO000o0.class, objectFieldOffset2);
            long j4 = j2 - j;
            OooO0Oo = j4;
            OooO0o0 = (j - j3) - j4;
            Field declaredField = C0704oO000o0.class.getDeclaredField("i");
            Field declaredField2 = C0704oO000o0.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            lookup3 = MethodHandles.lookup();
            unreflectGetter = lookup3.unreflectGetter(declaredField);
            lookup4 = MethodHandles.lookup();
            unreflectGetter2 = lookup4.unreflectGetter(declaredField2);
            unsafe.getLong(unreflectGetter, objectFieldOffset);
            unsafe.getLong(unreflectGetter2, objectFieldOffset);
            unsafe.getLong(C0704oO000o0.class, objectFieldOffset3);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Object OooO00o(Class cls, Object obj, String str, Object... objArr) {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = C0779oO0OOo0O.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe = OooO00o;
        long j = unsafe.getLong(cls, OooO0OO);
        if (j != 0) {
            int i = unsafe.getInt(j);
            for (int i2 = 0; i2 < i; i2++) {
                OooO00o.putLong(declaredMethod, OooO0O0, (i2 * OooO0Oo) + j + OooO0o0);
                if (str.equals(declaredMethod.getName())) {
                    Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                    if (parameterTypes.length == objArr.length) {
                        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                            if (parameterTypes[i3].isPrimitive()) {
                                Class<?> cls2 = parameterTypes[i3];
                                if (cls2 == Integer.TYPE) {
                                    if (!(objArr[i3] instanceof Integer)) {
                                        break;
                                    }
                                }
                                if (cls2 == Byte.TYPE) {
                                    if (!(objArr[i3] instanceof Byte)) {
                                        break;
                                    }
                                }
                                if (cls2 == Character.TYPE) {
                                    if (!(objArr[i3] instanceof Character)) {
                                        break;
                                    }
                                }
                                if (cls2 == Boolean.TYPE) {
                                    if (!(objArr[i3] instanceof Boolean)) {
                                        break;
                                    }
                                }
                                if (cls2 == Double.TYPE) {
                                    if (!(objArr[i3] instanceof Double)) {
                                        break;
                                    }
                                }
                                if (cls2 == Float.TYPE) {
                                    if (!(objArr[i3] instanceof Float)) {
                                        break;
                                    }
                                }
                                if (cls2 == Long.TYPE) {
                                    if (!(objArr[i3] instanceof Long)) {
                                        break;
                                    }
                                }
                                if (cls2 == Short.TYPE && !(objArr[i3] instanceof Short)) {
                                    break;
                                }
                            } else {
                                Object obj2 = objArr[i3];
                                if (obj2 != null && !parameterTypes[i3].isInstance(obj2)) {
                                    break;
                                }
                            }
                        }
                        return declaredMethod.invoke(obj, objArr);
                    }
                    continue;
                }
            }
            throw new NoSuchMethodException("Cannot find matching method");
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static boolean OooO0O0(String... strArr) {
        try {
            OooO00o(VMRuntime.class, OooO00o(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}


