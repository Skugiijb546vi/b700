package com.ninja.engine;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.o0O00OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288o0O00OoO {
    public static final C0288o0O00OoO OooO0OO = new C0288o0O00OoO();
    public final HashMap OooO00o = new HashMap();
    public final HashMap OooO0O0 = new HashMap();

    public static void OooO0O0(HashMap hashMap, C0562o0oO0Ooo c0562o0oO0Ooo, oO0O0O0o oo0o0o0o, Class cls) {
        oO0O0O0o oo0o0o0o2 = (oO0O0O0o) hashMap.get(c0562o0oO0Ooo);
        if (oo0o0o0o2 != null && oo0o0o0o != oo0o0o0o2) {
            Method method = c0562o0oO0Ooo.OooO0O0;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + oo0o0o0o2 + ", new value " + oo0o0o0o);
        } else if (oo0o0o0o2 == null) {
            hashMap.put(c0562o0oO0Ooo, oo0o0o0o);
        }
    }

    public final C0287o0O00Oo OooO00o(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.OooO00o;
        if (superclass != null) {
            C0287o0O00Oo c0287o0O00Oo = (C0287o0O00Oo) hashMap2.get(superclass);
            if (c0287o0O00Oo == null) {
                c0287o0O00Oo = OooO00o(superclass, null);
            }
            hashMap.putAll(c0287o0O00Oo.OooO0O0);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0287o0O00Oo c0287o0O00Oo2 = (C0287o0O00Oo) hashMap2.get(cls2);
            if (c0287o0O00Oo2 == null) {
                c0287o0O00Oo2 = OooO00o(cls2, null);
            }
            for (Object obj : c0287o0O00Oo2.OooO0O0.entrySet()) {
                Map.Entry entry = (Map.Entry) obj;
                OooO0O0(hashMap, (C0562o0oO0Ooo) entry.getKey(), (oO0O0O0o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0967oOO0oooO interfaceC0967oOO0oooO = (InterfaceC0967oOO0oooO) method.getAnnotation(InterfaceC0967oOO0oooO.class);
            if (interfaceC0967oOO0oooO != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC0760oO0O0o0O.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                oO0O0O0o value = interfaceC0967oOO0oooO.value();
                if (parameterTypes.length > 1) {
                    if (oO0O0O0o.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == oO0O0O0o.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    OooO0O0(hashMap, new C0562o0oO0Ooo(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0287o0O00Oo c0287o0O00Oo3 = new C0287o0O00Oo(hashMap);
        hashMap2.put(cls, c0287o0O00Oo3);
        this.OooO0O0.put(cls, Boolean.valueOf(z));
        return c0287o0O00Oo3;
    }
}


