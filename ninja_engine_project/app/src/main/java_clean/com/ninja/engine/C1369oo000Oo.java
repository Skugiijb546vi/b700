package com.ninja.engine;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
/* renamed from: com.ninja.engine.oo000Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369oo000Oo extends AbstractC1091oOOoOOOO {
    @Override public void OooOOOo() {}
    public int OooOOo(androidx.coordinatorlayout.widget.CoordinatorLayout c) { return 0; }
    public boolean Oooo000(android.view.View view, float f) { return false; }
    public int OooOOo0(android.view.View view) { return 0; }
    public void Oooo00O(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {}
    public boolean OooOoO0(float f, float f2) { return false; }
    public void OooOoO(int i) {}
    public boolean OooOo0O(float f) { return false; }
    public int OooOo00() { return 0; }
    public boolean OooOo(android.view.View view) { return false; }
    public void OooOoOO(android.graphics.Typeface typeface, boolean z) {}
    public static final Class OooO0OO;
    public static final Constructor OooO0Oo;
    public static final Method OooO0o;
    public static final Method OooO0o0;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
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

    public static Typeface Oooo0(Object obj) {
        try {
            Object newInstance = Array.newInstance(OooO0OO, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) OooO0o.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean Oooo00o(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) OooO0o0.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO0o(Context context, C0575o0oOo0[] c0575o0oOo0Arr, int i) {
        Object obj;
        try {
            obj = OooO0Oo.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C1218oOoOOoo c1218oOoOOoo = new C1218oOoOOoo(0);
        for (C0575o0oOo0 c0575o0oOo0 : c0575o0oOo0Arr) {
            Uri uri = c0575o0oOo0.OooO00o;
            ByteBuffer byteBuffer = (ByteBuffer) c1218oOoOOoo.get(uri);
            if (byteBuffer == null) {
                byteBuffer = AbstractC1094oOOoOOo0.OooOOO(context, uri);
                c1218oOoOOoo.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!Oooo00o(obj, byteBuffer, c0575o0oOo0.OooO0O0, c0575o0oOo0.OooO0OO, c0575o0oOo0.OooO0Oo)) {
                return null;
            }
        }
        Typeface Oooo0 = Oooo0(obj);
        if (Oooo0 == null) {
            return null;
        }
        return Typeface.create(Oooo0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface OooO0o0(android.content.Context r17, com.ninja.engine.C0573o0oOOooo r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = com.ninja.engine.C1369oo000Oo.OooO0Oo     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto Lb
        L9:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return r1
        Le:
            r0 = r18
            com.ninja.engine.o0oOo00[] r3 = r0.OooO00o
            int r4 = r3.length
            r0 = 0
            r5 = 0
        L15:
            if (r5 >= r4) goto L72
            r6 = r3[r5]
            int r0 = r6.OooO0o
            java.io.File r7 = com.ninja.engine.AbstractC1094oOOoOOo0.OooO0oo(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L5a
        L25:
            r8 = r19
            boolean r0 = com.ninja.engine.AbstractC1094oOOoOOo0.OooO0Oo(r7, r8, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            r9.<init>(r7)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            goto L57
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L55:
            throw r10     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L56:
            r0 = r1
        L57:
            r7.delete()
        L5a:
            if (r0 != 0) goto L5d
            return r1
        L5d:
            int r7 = r6.OooO0O0
            boolean r9 = r6.OooO0OO
            int r6 = r6.OooO0o0
            boolean r0 = Oooo00o(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L6a
            return r1
        L6a:
            int r5 = r5 + 1
            goto L15
        L6d:
            r0 = move-exception
            r7.delete()
            throw r0
        L72:
            android.graphics.Typeface r0 = Oooo0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1369oo000Oo.OooO0o0(android.content.Context, com.ninja.engine.o0oOOooo, android.content.res.Resources, int):android.graphics.Typeface");
    }
}



