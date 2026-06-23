package com.ninja.engine;

import android.view.View;
import java.lang.reflect.Field;
/* renamed from: com.ninja.engine.oo0Oo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1521oo0Oo0Oo {
    public static final Field OooO00o;
    public static final Field OooO0O0;
    public static final Field OooO0OO;
    public static final boolean OooO0Oo;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            OooO00o = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            OooO0O0 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            OooO0OO = declaredField3;
            declaredField3.setAccessible(true);
            OooO0Oo = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }
}


