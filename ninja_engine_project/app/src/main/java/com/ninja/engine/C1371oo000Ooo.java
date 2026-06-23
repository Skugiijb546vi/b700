package com.ninja.engine;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oo000Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371oo000Ooo extends C1370oo000OoO {
    @Override // com.ninja.engine.C1370oo000OoO
    public final Method Oooo(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // com.ninja.engine.C1370oo000OoO
    public final Typeface Oooo0o0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.OooO0oo, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.OooOOO.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
