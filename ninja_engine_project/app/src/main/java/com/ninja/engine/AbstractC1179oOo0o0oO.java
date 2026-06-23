package com.ninja.engine;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.ninja.engine.oOo0o0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1179oOo0o0oO {
    public static final HashMap OooO00o = new HashMap();
    public static final HashMap OooO0O0 = new HashMap();

    public static void OooO00o(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            AbstractC0809oO0OooOO.OooOOOO(newInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC1230oOoOo0o.OooOOO0(newInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static final String OooO0O0(String str) {
        StringBuilder sb = new StringBuilder();
        int OooOoOO = AbstractC1268oOoo0O0O.OooOoOO(0, str, ".", false);
        if (OooOoOO >= 0) {
            int length = str.length();
            if (length >= 0) {
                StringBuilder sb2 = new StringBuilder(length);
                int i = 0;
                do {
                    sb2.append((CharSequence) str, i, OooOoOO);
                    sb2.append("_");
                    i = OooOoOO + 1;
                    if (OooOoOO >= str.length()) {
                        break;
                    }
                    OooOoOO = AbstractC1268oOoo0O0O.OooOoOO(i, str, ".", false);
                } while (OooOoOO > 0);
                sb2.append((CharSequence) str, i, str.length());
                str = sb2.toString();
                AbstractC0809oO0OooOO.OooOOOO(str, "toString(...)");
            } else {
                throw new OutOfMemoryError();
            }
        }
        return AbstractC1230oOoOo0o.OooO(sb, str, "_LifecycleAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int OooO0OO(Class cls) {
        Constructor constructor;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        int i = 1;
        HashMap hashMap = OooO00o;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r4 != null) {
                    str = r4.getName();
                } else {
                    str = "";
                }
                AbstractC0809oO0OooOO.OooOOOO(str, "fullPackage");
                if (str.length() != 0) {
                    AbstractC0809oO0OooOO.OooOOOO(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    AbstractC0809oO0OooOO.OooOOOO(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC0809oO0OooOO.OooOOOO(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String OooO0O02 = OooO0O0(canonicalName);
                if (str.length() != 0) {
                    OooO0O02 = str + '.' + OooO0O02;
                }
                constructor = Class.forName(OooO0O02).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = OooO0O0;
            if (constructor != null) {
                List singletonList = Collections.singletonList(constructor);
                AbstractC0809oO0OooOO.OooOOOO(singletonList, "singletonList(...)");
                hashMap2.put(cls, singletonList);
            } else {
                C0288o0O00OoO c0288o0O00OoO = C0288o0O00OoO.OooO0OO;
                HashMap hashMap3 = c0288o0O00OoO.OooO0O0;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (((InterfaceC0967oOO0oooO) declaredMethods[i2].getAnnotation(InterfaceC0967oOO0oooO.class)) != null) {
                                    c0288o0O00OoO.OooO00o(cls, declaredMethods);
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0757oO0O0Oo.class.isAssignableFrom(superclass)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        AbstractC0809oO0OooOO.OooOOOO(superclass, "superclass");
                        if (OooO0OO(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            AbstractC0809oO0OooOO.OooOO0o(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    AbstractC0809oO0OooOO.OooOOOO(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && InterfaceC0757oO0O0Oo.class.isAssignableFrom(cls2)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                AbstractC0809oO0OooOO.OooOOOO(cls2, "intrface");
                                if (OooO0OO(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                AbstractC0809oO0OooOO.OooOO0o(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
