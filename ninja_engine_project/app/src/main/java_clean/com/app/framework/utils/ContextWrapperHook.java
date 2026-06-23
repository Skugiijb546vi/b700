package com.app.framework.utils;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import com.app.framework.BlackBoxCore;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class ContextWrapperHook {
    private static final String TAG = "ContextWrapperHook";

    public static void ensureContextWrapperBase(ContextWrapper contextWrapper) {
        Context context;
        try {
            Field declaredField = ContextWrapper.class.getDeclaredField("mBase");
            declaredField.setAccessible(true);
            if (((Context) declaredField.get(contextWrapper)) != null || (context = BlackBoxCore.getContext()) == null) {
                return;
            }
            declaredField.set(contextWrapper, context);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static void hookContextWrapperGetResources() {
        try {
            ContextWrapper.class.getDeclaredMethod("getResources", null).setAccessible(true);
            ContextWrapperHook.class.getDeclaredMethod("safeGetResources", ContextWrapper.class).setAccessible(true);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void installHook() {
        try {
            hookContextWrapperGetResources();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static Resources safeGetResources(ContextWrapper contextWrapper) {
        try {
            Context baseContext = contextWrapper.getBaseContext();
            if (baseContext != null) {
                return baseContext.getResources();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            Context context = BlackBoxCore.getContext();
            if (context != null) {
                return context.getResources();
            }
            return null;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }
}


