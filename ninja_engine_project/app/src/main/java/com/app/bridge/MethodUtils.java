package com.app.bridge;

import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.InterfaceC0746oO00oOo0;
import java.lang.reflect.Method;
@InterfaceC0746oO00oOo0
/* loaded from: classes.dex */
public class MethodUtils {
    public static String getDeclaringClass(Method method) {
        return method.getDeclaringClass().getName().replace(".", "/");
    }

    private static String getDesc(Class<?> cls) {
        if (cls.isPrimitive()) {
            return getPrimitiveLetter(cls);
        }
        if (cls.isArray()) {
            return "[" + getDesc(cls.getComponentType());
        }
        return AbstractC1230oOoOo0o.OooO(new StringBuilder("L"), getType(cls), ";");
    }

    public static String getMethodName(Method method) {
        return method.getName();
    }

    private static String getPrimitiveLetter(Class<?> cls) {
        if (Integer.TYPE.equals(cls)) {
            return "I";
        }
        if (Void.TYPE.equals(cls)) {
            return "V";
        }
        if (Boolean.TYPE.equals(cls)) {
            return "Z";
        }
        if (Character.TYPE.equals(cls)) {
            return "C";
        }
        if (Byte.TYPE.equals(cls)) {
            return "B";
        }
        if (Short.TYPE.equals(cls)) {
            return "S";
        }
        if (Float.TYPE.equals(cls)) {
            return "F";
        }
        if (Long.TYPE.equals(cls)) {
            return "J";
        }
        if (Double.TYPE.equals(cls)) {
            return "D";
        }
        throw new IllegalStateException("Type: " + cls.getCanonicalName() + " is not a primitive type");
    }

    private static String getType(Class<?> cls) {
        if (!cls.isArray()) {
            return !cls.isPrimitive() ? cls.getName().replaceAll("\\.", "/") : getPrimitiveLetter(cls);
        }
        return "[" + getDesc(cls.getComponentType());
    }

    public static String getDesc(Method method) {
        StringBuffer stringBuffer = new StringBuffer("(");
        for (Class<?> cls : method.getParameterTypes()) {
            stringBuffer.append(getDesc(cls));
        }
        stringBuffer.append(")");
        stringBuffer.append(getDesc(method.getReturnType()));
        return stringBuffer.toString();
    }
}
