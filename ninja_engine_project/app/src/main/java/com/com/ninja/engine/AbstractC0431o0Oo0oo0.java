package com.ninja.engine;

import android.widget.AbsListView;
import java.lang.reflect.Field;
/* renamed from: com.ninja.engine.o0Oo0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0431o0Oo0oo0 {
    public static final Field OooO00o;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        OooO00o = field;
    }
}
