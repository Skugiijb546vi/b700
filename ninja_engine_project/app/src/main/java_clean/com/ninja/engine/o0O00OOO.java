package com.ninja.engine;
/* loaded from: classes.dex */
public class o0O00OOO {
    public static Class<?> classReady(Class<?> cls) {
        String value;
        InterfaceC0157o00Oo0O interfaceC0157o00Oo0O = (InterfaceC0157o00Oo0O) cls.getAnnotation(InterfaceC0157o00Oo0O.class);
        if (interfaceC0157o00Oo0O != null) {
            value = interfaceC0157o00Oo0O.value();
        } else {
            InterfaceC0156o00Oo00o interfaceC0156o00Oo00o = (InterfaceC0156o00Oo00o) cls.getAnnotation(InterfaceC0156o00Oo00o.class);
            if (interfaceC0156o00Oo00o != null) {
                return interfaceC0156o00Oo00o.value();
            }
            InterfaceC0158o00Oo0O0 interfaceC0158o00Oo0O0 = (InterfaceC0158o00Oo0O0) cls.getAnnotation(InterfaceC0158o00Oo0O0.class);
            if (interfaceC0158o00Oo0O0 == null) {
                return null;
            }
            value = interfaceC0158o00Oo0O0.value();
        }
        return classReady(value);
    }

    private static Class<?> classReady(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}


