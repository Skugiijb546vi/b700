package com.ninja.engine;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.o0Oo0o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0426o0Oo0o0o {
    public static final Method OooO00o;
    public static final Method OooO0O0;
    public static final Method OooO0OO;
    public static final boolean OooO0Oo;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            OooO00o = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            OooO0O0 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            OooO0OO = declaredMethod3;
            declaredMethod3.setAccessible(true);
            OooO0Oo = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
