package com.app.framework.utils;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public class ReflectionClass {
    public static void print(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Class<? super Object> superclass = cls.getSuperclass();
            Class<?>[] interfaces = cls.getInterfaces();
            String modifier = Modifier.toString(cls.getModifiers());
            if (modifier.length() > 0) {
                System.out.print(modifier);
            }
            if (!cls.isInterface()) {
                System.out.print(" class ");
            }
            printType(cls);
            if (superclass != null && superclass != Object.class) {
                System.out.print(" extends ");
                printType(superclass);
            }
            if (interfaces.length > 0) {
                System.out.print(" implements ");
                for (int i = 0; i < interfaces.length; i++) {
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    printType(interfaces[i]);
                }
            }
            PrintStream printStream = System.out;
            printStream.print(" {\n");
            printConstructors(cls);
            printStream.println();
            printMethods(cls);
            printStream.println();
            printFields(cls);
            printStream.println("}");
            printExtendsChain(cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printConstructors(Class cls) {
        Constructor<?>[] declaredConstructors;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            String name = constructor.getName();
            PrintStream printStream = System.out;
            printStream.print("    ");
            String modifier = Modifier.toString(constructor.getModifiers());
            if (modifier.length() > 0) {
                printStream.print(modifier.concat(" "));
            }
            printStream.print(name.substring(name.lastIndexOf(".") + 1) + " (");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                printType(parameterTypes[i]);
            }
            PrintStream printStream2 = System.out;
            printStream2.print(")");
            Class<?>[] exceptionTypes = constructor.getExceptionTypes();
            if (exceptionTypes.length > 0) {
                printStream2.print(" throws ");
                for (int i2 = 0; i2 < exceptionTypes.length; i2++) {
                    if (i2 > 0) {
                        System.out.print(", ");
                    }
                    printType(exceptionTypes[i2]);
                }
            }
            System.out.println(";");
        }
    }

    public static void printExtendsChain(Class cls) {
        PrintStream printStream = System.out;
        String str = "\n\nExtends chain:\n    ";
        while (true) {
            printStream.print(str);
            printType(cls);
            cls = cls.getSuperclass();
            str = " --> ";
            if (cls == Object.class) {
                System.out.print(" --> ");
                printType(cls);
                return;
            }
            printStream = System.out;
        }
    }

    private static void printFields(Class cls) {
        Field[] declaredFields;
        for (Field field : cls.getDeclaredFields()) {
            Class<?> type = field.getType();
            String name = field.getName();
            PrintStream printStream = System.out;
            printStream.print("    ");
            String modifier = Modifier.toString(field.getModifiers());
            if (modifier.length() > 0) {
                printStream.print(modifier.concat(" "));
            }
            printType(type);
            printStream.println(" " + name + ";");
        }
    }

    private static void printMethods(Class cls) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            Class<?> returnType = method.getReturnType();
            String name = method.getName();
            PrintStream printStream = System.out;
            printStream.print("    ");
            String modifier = Modifier.toString(method.getModifiers());
            if (modifier.length() > 0) {
                printStream.print(modifier.concat(" "));
            }
            printType(returnType);
            printStream.print(" " + name + "(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                printType(parameterTypes[i]);
            }
            PrintStream printStream2 = System.out;
            printStream2.print(")");
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes.length > 0) {
                printStream2.print(" throws ");
                for (int i2 = 0; i2 < exceptionTypes.length; i2++) {
                    if (i2 > 0) {
                        System.out.print(", ");
                    }
                    printType(exceptionTypes[i2]);
                }
            }
            System.out.println(";");
        }
    }

    private static void printType(Class cls) {
        PrintStream printStream;
        String substring;
        PrintStream printStream2;
        String str;
        String name = cls.getName();
        if (name.startsWith("[")) {
            if (name.startsWith("[C")) {
                printStream2 = System.out;
                str = "char[]";
            } else if (name.startsWith("[B")) {
                printStream2 = System.out;
                str = "byte[]";
            } else if (name.startsWith("[S")) {
                printStream2 = System.out;
                str = "short[]";
            } else if (name.startsWith("[I")) {
                printStream2 = System.out;
                str = "int[]";
            } else if (name.startsWith("[J")) {
                printStream2 = System.out;
                str = "long[]";
            } else if (name.startsWith("[F")) {
                printStream2 = System.out;
                str = "float[]";
            } else if (name.startsWith("[D")) {
                printStream2 = System.out;
                str = "double[]";
            } else if (name.startsWith("[Z")) {
                printStream2 = System.out;
                str = "boolean[]";
            } else if (!name.startsWith("[L")) {
                return;
            } else {
                printStream = System.out;
                substring = name.substring(name.lastIndexOf(".") + 1, name.length() - 1) + "[]";
            }
            printStream2.print(str);
            return;
        }
        printStream = System.out;
        substring = name.substring(name.lastIndexOf(".") + 1);
        printStream.print(substring);
    }
}
