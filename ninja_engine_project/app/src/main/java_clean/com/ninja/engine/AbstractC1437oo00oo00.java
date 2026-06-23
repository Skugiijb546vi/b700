package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oo00oo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1437oo00oo00 {
    public final C0145o00OO0oO OooO00o;
    public final C0145o00OO0oO OooO0O0;
    public final C0145o00OO0oO OooO0OO;

    public AbstractC1437oo00oo00(C0145o00OO0oO c0145o00OO0oO, C0145o00OO0oO c0145o00OO0oO2, C0145o00OO0oO c0145o00OO0oO3) {
        this.OooO00o = c0145o00OO0oO;
        this.OooO0O0 = c0145o00OO0oO2;
        this.OooO0OO = c0145o00OO0oO3;
    }

    public final void OooO(InterfaceC1438oo00oo0O interfaceC1438oo00oo0O) {
        if (interfaceC1438oo00oo0O == null) {
            this.OooO0o0.writeString(null);
            return;
        }
        try {
            this.OooO0o0.writeString(OooO0O0(interfaceC1438oo00oo0O.getClass()).getName());
            C1436oo00oo0 OooO00o = OooO00o();
            try {
                OooO0Oo(interfaceC1438oo00oo0O.getClass()).invoke(null, interfaceC1438oo00oo0O, OooO00o);
                int i = OooO00o.OooO;
                if (i >= 0) {
                    int i2 = OooO00o.OooO0Oo.get(i);
                    Parcel parcel = OooO00o.OooO0o0;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC1438oo00oo0O.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract C1436oo00oo0 OooO00o();

    public final Class OooO0O0(Class cls) {
        String name = cls.getName();
        C0145o00OO0oO c0145o00OO0oO = this.OooO0OO;
        Class cls2 = (Class) c0145o00OO0oO.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            c0145o00OO0oO.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method OooO0OO(String str) {
        C0145o00OO0oO c0145o00OO0oO = this.OooO00o;
        Method method = (Method) c0145o00OO0oO.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC1437oo00oo00.class.getClassLoader()).getDeclaredMethod("read", AbstractC1437oo00oo00.class);
            c0145o00OO0oO.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method OooO0Oo(Class cls) {
        String name = cls.getName();
        C0145o00OO0oO c0145o00OO0oO = this.OooO0O0;
        Method method = (Method) c0145o00OO0oO.get(name);
        if (method == null) {
            Class OooO0O0 = OooO0O0(cls);
            System.currentTimeMillis();
            Method declaredMethod = OooO0O0.getDeclaredMethod("write", cls, AbstractC1437oo00oo00.class);
            c0145o00OO0oO.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Parcelable OooO0o(Parcelable parcelable, int i) {
        if (!OooO0o0(i)) {
            return parcelable;
        }
        return this.OooO0o0.readParcelable(C1436oo00oo0.class.getClassLoader());
    }

    public abstract boolean OooO0o0(int i);

    public final InterfaceC1438oo00oo0O OooO0oO() {
        String readString = this.OooO0o0.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1438oo00oo0O) OooO0OO(readString).invoke(null, OooO00o());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void OooO0oo(int i);
}



