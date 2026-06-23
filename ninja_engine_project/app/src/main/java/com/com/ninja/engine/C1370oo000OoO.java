package com.ninja.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oo000OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1370oo000OoO extends C1368oo000OOo {
    public final Constructor OooO;
    public final Class OooO0oo;
    public final Method OooOO0;
    public final Method OooOO0O;
    public final Method OooOO0o;
    public final Method OooOOO;
    public final Method OooOOO0;

    public C1370oo000OoO() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = Oooo0oo(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = Oooo(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.OooO0oo = cls;
        this.OooO = constructor;
        this.OooOO0 = method2;
        this.OooOO0O = method3;
        this.OooOO0o = method4;
        this.OooOOO0 = method5;
        this.OooOOO = method;
    }

    public static Method Oooo0oo(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO(Context context, Resources resources, int i, String str, int i2) {
        if (this.OooOO0 != null) {
            Object Oooo0oO = Oooo0oO();
            if (Oooo0oO == null) {
                return null;
            }
            if (!Oooo0OO(context, Oooo0oO, str, 0, -1, -1, null)) {
                Oooo0O0(Oooo0oO);
                return null;
            } else if (!Oooo0o(Oooo0oO)) {
                return null;
            } else {
                return Oooo0o0(Oooo0oO);
            }
        }
        return super.OooO(context, resources, i, str, i2);
    }

    @Override // com.ninja.engine.C1368oo000OOo, com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO0o(Context context, C0575o0oOo0[] c0575o0oOo0Arr, int i) {
        Typeface Oooo0o0;
        boolean z;
        if (c0575o0oOo0Arr.length < 1) {
            return null;
        }
        if (this.OooOO0 != null) {
            HashMap hashMap = new HashMap();
            for (C0575o0oOo0 c0575o0oOo0 : c0575o0oOo0Arr) {
                if (c0575o0oOo0.OooO0o0 == 0) {
                    Uri uri = c0575o0oOo0.OooO00o;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, AbstractC1094oOOoOOo0.OooOOO(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object Oooo0oO = Oooo0oO();
            if (Oooo0oO == null) {
                return null;
            }
            boolean z2 = false;
            for (C0575o0oOo0 c0575o0oOo02 : c0575o0oOo0Arr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0575o0oOo02.OooO00o);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.OooOO0O.invoke(Oooo0oO, byteBuffer, Integer.valueOf(c0575o0oOo02.OooO0O0), null, Integer.valueOf(c0575o0oOo02.OooO0OO), Integer.valueOf(c0575o0oOo02.OooO0Oo ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                        z = false;
                    }
                    if (!z) {
                        Oooo0O0(Oooo0oO);
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                Oooo0O0(Oooo0oO);
                return null;
            } else if (!Oooo0o(Oooo0oO) || (Oooo0o0 = Oooo0o0(Oooo0oO)) == null) {
                return null;
            } else {
                return Typeface.create(Oooo0o0, i);
            }
        }
        C0575o0oOo0 OooOO0o = OooOO0o(c0575o0oOo0Arr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(OooOO0o.OooO00o, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(OooOO0o.OooO0OO).setItalic(OooOO0o.OooO0Oo).build();
            openFileDescriptor.close();
            return build;
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // com.ninja.engine.C1368oo000OOo, com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO0o0(Context context, C0573o0oOOooo c0573o0oOOooo, Resources resources, int i) {
        C0576o0oOo00[] c0576o0oOo00Arr;
        if (this.OooOO0 != null) {
            Object Oooo0oO = Oooo0oO();
            if (Oooo0oO == null) {
                return null;
            }
            for (C0576o0oOo00 c0576o0oOo00 : c0573o0oOOooo.OooO00o) {
                if (!Oooo0OO(context, Oooo0oO, c0576o0oOo00.OooO00o, c0576o0oOo00.OooO0o0, c0576o0oOo00.OooO0O0, c0576o0oOo00.OooO0OO ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0576o0oOo00.OooO0Oo))) {
                    Oooo0O0(Oooo0oO);
                    return null;
                }
            }
            if (!Oooo0o(Oooo0oO)) {
                return null;
            }
            return Oooo0o0(Oooo0oO);
        }
        return super.OooO0o0(context, c0573o0oOOooo, resources, i);
    }

    public Method Oooo(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final void Oooo0O0(Object obj) {
        try {
            this.OooOOO0.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean Oooo0OO(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.OooOO0.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean Oooo0o(Object obj) {
        try {
            return ((Boolean) this.OooOO0o.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface Oooo0o0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.OooO0oo, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.OooOOO.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object Oooo0oO() {
        try {
            return this.OooO.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}
