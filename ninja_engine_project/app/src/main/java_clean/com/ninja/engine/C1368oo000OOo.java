package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oo000OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1368oo000OOo extends AbstractC1091oOOoOOOO {
    @Override public void OooOOOo() {}
    public int OooOOo(androidx.coordinatorlayout.widget.CoordinatorLayout c) { return 0; }
    public boolean Oooo000(android.view.View view, float f) { return false; }
    public int OooOOo0(android.view.View view) { return 0; }
    public void Oooo00O(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {}
    public boolean OooOoO0(float f, float f2) { return false; }
    public void OooOoO(int i) {}
    public int OooOo00() { return 0; }
    public boolean OooOo(android.view.View view) { return false; }
    public boolean OooOo0O(float f) { return false; }
    public void OooOoOO(android.graphics.Typeface typeface, boolean z) {}
    public static Class OooO0OO = null;
    public static Constructor OooO0Oo = null;
    public static Method OooO0o = null;
    public static Method OooO0o0 = null;
    public static boolean OooO0oO = false;

    public static void Oooo0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (OooO0oO) {
            return;
        }
        OooO0oO = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        OooO0Oo = constructor;
        OooO0OO = cls;
        OooO0o0 = method2;
        OooO0o = method;
    }

    public static boolean Oooo00o(Object obj, String str, int i, boolean z) {
        Oooo0();
        try {
            return ((Boolean) OooO0o0.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public Typeface OooO0o(Context context, C0575o0oOo0[] c0575o0oOo0Arr, int i) {
        File file;
        String readlink;
        if (c0575o0oOo0Arr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(OooOO0o(c0575o0oOo0Arr, i).OooO00o, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface OooO0oo = OooO0oo(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return OooO0oo;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface OooO0oo2 = OooO0oo(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return OooO0oo2;
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public Typeface OooO0o0(Context context, C0573o0oOOooo c0573o0oOOooo, Resources resources, int i) {
        C0576o0oOo00[] c0576o0oOo00Arr;
        Oooo0();
        try {
            Object newInstance = OooO0Oo.newInstance(null);
            for (C0576o0oOo00 c0576o0oOo00 : c0573o0oOOooo.OooO00o) {
                File OooO0oo = AbstractC1094oOOoOOo0.OooO0oo(context);
                if (OooO0oo == null) {
                    return null;
                }
                try {
                    if (!AbstractC1094oOOoOOo0.OooO0Oo(OooO0oo, resources, c0576o0oOo00.OooO0o)) {
                        return null;
                    }
                    if (!Oooo00o(newInstance, OooO0oo.getPath(), c0576o0oOo00.OooO0O0, c0576o0oOo00.OooO0OO)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    OooO0oo.delete();
                }
            }
            Oooo0();
            try {
                Object newInstance2 = Array.newInstance(OooO0OO, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) OooO0o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}



