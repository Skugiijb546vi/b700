package com.ninja.engine;

import java.lang.reflect.InvocationTargetException;
/* renamed from: com.ninja.engine.o0oOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596o0oOoo {
    public static final C1218oOoOOoo OooO0O0 = new C1218oOoOOoo();
    public final /* synthetic */ C0606o0oOoooO OooO00o;

    public C0596o0oOoo(C0606o0oOoooO c0606o0oOoooO) {
        this.OooO00o = c0606o0oOoooO;
    }

    public static Class OooO0O0(ClassLoader classLoader, String str) {
        C1218oOoOOoo c1218oOoOOoo = OooO0O0;
        C1218oOoOOoo c1218oOoOOoo2 = (C1218oOoOOoo) c1218oOoOOoo.get(classLoader);
        if (c1218oOoOOoo2 == null) {
            c1218oOoOOoo2 = new C1218oOoOOoo();
            c1218oOoOOoo.put(classLoader, c1218oOoOOoo2);
        }
        Class cls = (Class) c1218oOoOOoo2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c1218oOoOOoo2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class OooO0OO(ClassLoader classLoader, String str) {
        try {
            return OooO0O0(classLoader, str);
        } catch (ClassCastException e) {
            throw new RuntimeException(AbstractC1230oOoOo0o.OooO0oo("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(AbstractC1230oOoOo0o.OooO0oo("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final AbstractComponentCallbacksC0593o0oOoOo0 OooO00o(String str) {
        try {
            return (AbstractComponentCallbacksC0593o0oOoOo0) OooO0OO(this.OooO00o.OooOo00.Oooo00O.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AbstractC1230oOoOo0o.OooO0oo("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AbstractC1230oOoOo0o.OooO0oo("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AbstractC1230oOoOo0o.OooO0oo("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AbstractC1230oOoOo0o.OooO0oo("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
