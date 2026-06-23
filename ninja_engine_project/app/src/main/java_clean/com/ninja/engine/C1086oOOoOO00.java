package com.ninja.engine;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* renamed from: com.ninja.engine.oOOoOO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1086oOOoOO00 {
    public static final String LOG_TAG = "Reflector";
    protected Object mCaller;
    protected Constructor<?> mConstructor;
    protected Field mField;
    protected Method mMethod;
    protected Class<?> mType;

    /* renamed from: com.ninja.engine.oOOoOO00$OooO00o */
    /* loaded from: classes.dex */
    public static class OooO00o extends C1086oOOoOO00 {
        protected Throwable mIgnored;

        public static OooO00o on(Class<?> cls) {
            return on(cls, cls == null ? new Exception("Type was null!") : null);
        }

        public static OooO00o with(Object obj) {
            if (obj == null) {
                return on((Class<?>) null);
            }
            return on(obj.getClass()).bind(obj);
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public OooO00o bind(Object obj) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.bind(obj);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public <R> R call(Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.call(objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public <R> R callByCaller(Object obj, Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.callByCaller(obj, objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public OooO00o constructor(Class<?>... clsArr) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.constructor(clsArr);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public OooO00o field(String str) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.field(str);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public <R> R get() {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get();
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        public Throwable getIgnored() {
            return this.mIgnored;
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public OooO00o method(String str, Class<?>... clsArr) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.method(str, clsArr);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public <R> R newInstance(Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.newInstance(objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public OooO00o set(Object obj) {
            if (skip()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.set(obj);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        public boolean skip() {
            if (!skipAlways() && this.mIgnored == null) {
                return false;
            }
            return true;
        }

        public boolean skipAlways() {
            if (this.mType == null) {
                return true;
            }
            return false;
        }

        @Override // com.ninja.engine.C1086oOOoOO00
        public OooO00o unbind() {
            super.unbind();
            return this;
        }

        private static OooO00o on(Class<?> cls, Throwable th) {
            OooO00o oooO00o = new OooO00o();
            oooO00o.mType = cls;
            oooO00o.mIgnored = th;
            return oooO00o;
        }


        @Override // com.ninja.engine.C1086oOOoOO00
        public <R> R get(Object obj) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get(obj);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }


        @Override // com.ninja.engine.C1086oOOoOO00
        public OooO00o set(Object obj, Object obj2) {
            if (skip()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.set(obj, obj2);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        public static OooO00o on(String str) {
            return on(str, true, OooO00o.class.getClassLoader());
        }

        public static OooO00o on(String str, boolean z) {
            return on(str, z, OooO00o.class.getClassLoader());
        }

        public static OooO00o on(String str, boolean z, ClassLoader classLoader) {
            try {
                return on(Class.forName(str, z, classLoader), (Throwable) null);
            } catch (Throwable th) {
                return on((Class<?>) null, th);
            }
        }
    }

    public static C1086oOOoOO00 on(Class<?> cls) {
        C1086oOOoOO00 c1086oOOoOO00 = new C1086oOOoOO00();
        c1086oOOoOO00.mType = cls;
        return c1086oOOoOO00;
    }

    public static C1086oOOoOO00 with(Object obj) {
        return on(obj.getClass()).bind(obj);
    }

    public C1086oOOoOO00 bind(Object obj) {
        this.mCaller = checked(obj);
        return this;
    }

    public <R> R call(Object... objArr) {
        return (R) callByCaller(this.mCaller, objArr);
    }

    public <R> R callByCaller(Object obj, Object... objArr) {
        check(obj, this.mMethod, "Method");
        try {
            return (R) this.mMethod.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw new Exception("Oops!", e.getTargetException());
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public void check(Object obj, Member member, String str) {
        if (member != null) {
            if (obj == null && !Modifier.isStatic(member.getModifiers())) {
                throw new Exception("Need a caller!");
            }
            checked(obj);
            return;
        }
        throw new Exception(AbstractC1230oOoOo0o.OooO0oO(str, " was null!"));
    }

    public Object checked(Object obj) {
        if (obj != null && !this.mType.isInstance(obj)) {
            throw new Exception("Caller [" + obj + "] is not a instance of type [" + this.mType + "]!");
        }
        return obj;
    }

    public C1086oOOoOO00 constructor(Class<?>... clsArr) {
        try {
            Constructor<?> declaredConstructor = this.mType.getDeclaredConstructor(clsArr);
            this.mConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            this.mField = null;
            this.mMethod = null;
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public C1086oOOoOO00 field(String str) {
        try {
            Field findField = findField(str);
            this.mField = findField;
            findField.setAccessible(true);
            this.mConstructor = null;
            this.mMethod = null;
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public Field findField(String str) {
        try {
            return this.mType.getField(str);
        } catch (NoSuchFieldException e) {
            for (Class<?> cls = this.mType; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e;
        }
    }

    public Method findMethod(String str, Class<?>... clsArr) {
        try {
            return this.mType.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            for (Class<?> cls = this.mType; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
            }
            throw e;
        }
    }

    public <R> R get() {
        return (R) get(this.mCaller);
    }

    public Field getField() {
        return this.mField;
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public C1086oOOoOO00 method(String str, Class<?>... clsArr) {
        try {
            Method findMethod = findMethod(str, clsArr);
            this.mMethod = findMethod;
            findMethod.setAccessible(true);
            this.mConstructor = null;
            this.mField = null;
            return this;
        } catch (NoSuchMethodException e) {
            throw new Exception("Oops!", e);
        }
    }

    public <R> R newInstance(Object... objArr) {
        Constructor<?> constructor = this.mConstructor;
        if (constructor != null) {
            try {
                return (R) constructor.newInstance(objArr);
            } catch (InvocationTargetException e) {
                throw new Exception("Oops!", e.getTargetException());
            } catch (Throwable th) {
                throw new Exception("Oops!", th);
            }
        }
        throw new Exception("Constructor was null!");
    }

    public C1086oOOoOO00 set(Object obj) {
        return set(this.mCaller, obj);
    }

    public C1086oOOoOO00 unbind() {
        this.mCaller = null;
        return this;
    }

    public static C1086oOOoOO00 on(String str) {
        return on(str, true, C1086oOOoOO00.class.getClassLoader());
    }

    public <R> R get(Object obj) {
        check(obj, this.mField, "Field");
        try {
            return (R) this.mField.get(obj);
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public C1086oOOoOO00 set(Object obj, Object obj2) {
        check(obj, this.mField, "Field");
        try {
            this.mField.set(obj, obj2);
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public static C1086oOOoOO00 on(String str, boolean z) {
        return on(str, z, C1086oOOoOO00.class.getClassLoader());
    }

    public static C1086oOOoOO00 on(String str, boolean z, ClassLoader classLoader) {
        try {
            return on(Class.forName(str, z, classLoader));
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }
}



