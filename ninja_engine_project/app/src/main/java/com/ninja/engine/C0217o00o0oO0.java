package com.ninja.engine;

import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o00o0oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0217o00o0oO0 {
    public static boolean CACHE = false;
    public static boolean DEBUG = false;
    private static final Map<Class<?>, Object> sProxyCache = new HashMap();
    private static final WeakHashMap<Object, Map<Class<?>, Object>> sCallerProxyCache = new WeakHashMap<>();

    /* renamed from: com.ninja.engine.o00o0oO0$OooO00o */
    /* loaded from: classes.dex */
    public static class OooO00o implements InvocationHandler {
        final /* synthetic */ Class val$aClass;
        final /* synthetic */ WeakReference val$weakCaller;
        final /* synthetic */ boolean val$withException;

        public OooO00o(WeakReference weakReference, Class cls, boolean z) {
            this.val$weakCaller = weakReference;
            this.val$aClass = cls;
            this.val$withException = z;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z;
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            try {
                WeakReference weakReference = this.val$weakCaller;
                if (weakReference == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    obj2 = null;
                } else {
                    obj2 = weakReference.get();
                }
                InterfaceC0160o00Oo0o interfaceC0160o00Oo0o = (InterfaceC0160o00Oo0o) method.getAnnotation(InterfaceC0160o00Oo0o.class);
                InterfaceC0163o00Oo0oo interfaceC0163o00Oo0oo = (InterfaceC0163o00Oo0oo) method.getAnnotation(InterfaceC0163o00Oo0oo.class);
                if (interfaceC0160o00Oo0o == null && interfaceC0163o00Oo0oo == null) {
                    if (((InterfaceC0563o0oOO) method.getAnnotation(InterfaceC0563o0oOO.class)) != null) {
                        C1086oOOoOO00 field = C1086oOOoOO00.on(this.val$aClass).field(name.substring(5));
                        if (z) {
                            field.set(objArr[0]);
                        } else if (obj2 == null) {
                            return 0;
                        } else {
                            field.set(obj2, objArr[0]);
                        }
                        return 0;
                    } else if (((InterfaceC0162o00Oo0oO) method.getAnnotation(InterfaceC0162o00Oo0oO.class)) == null) {
                        Class<?>[] paramClass = C0217o00o0oO0.getParamClass(method);
                        if (((InterfaceC0166o00OoO00) method.getAnnotation(InterfaceC0166o00OoO00.class)) != null) {
                            try {
                                return C1086oOOoOO00.on(this.val$aClass).method(name.substring(7), paramClass).getMethod();
                            } catch (Throwable unused) {
                                return null;
                            }
                        }
                        InterfaceC0159o00Oo0Oo interfaceC0159o00Oo0Oo = (InterfaceC0159o00Oo0Oo) method.getAnnotation(InterfaceC0159o00Oo0Oo.class);
                        InterfaceC0161o00Oo0o0 interfaceC0161o00Oo0o0 = (InterfaceC0161o00Oo0o0) method.getAnnotation(InterfaceC0161o00Oo0o0.class);
                        if (interfaceC0159o00Oo0Oo == null && interfaceC0161o00Oo0o0 == null) {
                            C1086oOOoOO00 method2 = C1086oOOoOO00.on(this.val$aClass).method(name, paramClass);
                            if (z) {
                                return method2.call(objArr);
                            }
                            if (obj2 == null) {
                                return C0217o00o0oO0.generateNullValue(returnType);
                            }
                            return method2.callByCaller(obj2, objArr);
                        }
                        return C1086oOOoOO00.on(this.val$aClass).constructor(paramClass).newInstance(objArr);
                    } else {
                        try {
                            return C1086oOOoOO00.on(this.val$aClass).field(name.substring(7)).getField();
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                }
                C1086oOOoOO00 field2 = C1086oOOoOO00.on(this.val$aClass).field(name);
                if (z) {
                    return field2.get();
                }
                if (obj2 == null) {
                    return C0217o00o0oO0.generateNullValue(returnType);
                }
                return field2.get(obj2);
            } catch (Throwable th) {
                if (C0217o00o0oO0.DEBUG) {
                    if (th.getCause() != null) {
                        th.getCause().printStackTrace();
                    } else {
                        th.printStackTrace();
                    }
                }
                if (!(th instanceof C0212o00o0o)) {
                    if (!this.val$withException) {
                        return C0217o00o0oO0.generateNullValue(returnType);
                    }
                    throw th;
                }
                throw new NullPointerException(th.getMessage());
            }
        }
    }

    public static <T> T create(Class<T> cls, Object obj, boolean z) {
        WeakReference weakReference;
        try {
            T t = (T) getProxy(cls, obj, z);
            if (t != null) {
                return t;
            }
            if (obj == null) {
                weakReference = null;
            } else {
                weakReference = new WeakReference(obj);
            }
            T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new OooO00o(weakReference, getClassNameByBlackClass(cls), z));
            if (obj == null) {
                sProxyCache.put(cls, t2);
            } else {
                WeakHashMap<Object, Map<Class<?>, Object>> weakHashMap = sCallerProxyCache;
                Map<Class<?>, Object> map = weakHashMap.get(obj);
                if (map == null) {
                    map = new HashMap<>();
                    weakHashMap.put(obj, map);
                }
                map.put(cls, t2);
            }
            return t2;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object generateNullValue(Class<?> cls) {
        if (cls == Void.TYPE) {
            return 0;
        }
        if (!cls.isPrimitive()) {
            return null;
        }
        throw new C0212o00o0o("value is null!");
    }

    private static Class<?> getClassNameByBlackClass(Class<?> cls) {
        String value;
        InterfaceC0156o00Oo00o interfaceC0156o00Oo00o = (InterfaceC0156o00Oo00o) cls.getAnnotation(InterfaceC0156o00Oo00o.class);
        InterfaceC0158o00Oo0O0 interfaceC0158o00Oo0O0 = (InterfaceC0158o00Oo0O0) cls.getAnnotation(InterfaceC0158o00Oo0O0.class);
        InterfaceC0157o00Oo0O interfaceC0157o00Oo0O = (InterfaceC0157o00Oo0O) cls.getAnnotation(InterfaceC0157o00Oo0O.class);
        if (interfaceC0156o00Oo00o == null && interfaceC0158o00Oo0O0 == null && interfaceC0157o00Oo0O == null) {
            throw new RuntimeException("Not found @BlackClass or @BlackStrClass");
        }
        if (interfaceC0156o00Oo00o != null) {
            return interfaceC0156o00Oo00o.value();
        }
        if (interfaceC0158o00Oo0O0 != null) {
            value = interfaceC0158o00Oo0O0.value();
        } else {
            value = interfaceC0157o00Oo0O.value();
        }
        return Class.forName(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class<?>[] getParamClass(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] clsArr = new Class[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Annotation[] annotationArr = parameterAnnotations[i];
            int length = annotationArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    Annotation annotation = annotationArr[i2];
                    if (annotation instanceof InterfaceC0169o00OoOO0) {
                        clsArr[i] = Class.forName(((InterfaceC0169o00OoOO0) annotation).value());
                        break;
                    } else if (annotation instanceof InterfaceC0164o00OoO) {
                        clsArr[i] = ((InterfaceC0164o00OoO) annotation).value();
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    clsArr[i] = parameterTypes[i];
                    break;
                }
            }
        }
        return clsArr;
    }

    private static <T> T getProxy(Class<T> cls, Object obj, boolean z) {
        T t;
        if (CACHE && !z) {
            try {
                if (obj == null) {
                    T t2 = (T) sProxyCache.get(cls);
                    if (t2 != null) {
                        return t2;
                    }
                } else {
                    Map<Class<?>, Object> map = sCallerProxyCache.get(obj);
                    if (map != null && (t = (T) map.get(cls)) != null) {
                        return t;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
