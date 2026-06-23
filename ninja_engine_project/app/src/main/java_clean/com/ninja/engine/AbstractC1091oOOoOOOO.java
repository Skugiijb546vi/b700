package com.ninja.engine;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.ninja.engine.oOOoOOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1091oOOoOOOO {
    public static long OooO00o;
    public static Method OooO0O0;

    public AbstractC1091oOOoOOOO() {
        new ConcurrentHashMap();
    }

    public static void OooO00o(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [com.ninja.engine.oO00Oo00, java.lang.Object] */
    public static C1089oOOoOOO OooO0Oo(com.bumptech.glide.OooO00o oooO00o, List list) {
        InterfaceC1125oOOooO0o c0231o00oOOO0;
        InterfaceC1125oOOooO0o c0202o00o0O00;
        int i;
        Resources resources;
        C1442oo00ooOo c1442oo00ooOo;
        Class cls;
        InterfaceC0206o00o0OOO interfaceC0206o00o0OOO = oooO00o.OooO00o;
        C1932ooo0Oo0 c1932ooo0Oo0 = oooO00o.OooO0OO;
        Context applicationContext = c1932ooo0Oo0.getApplicationContext();
        o00O o00o = c1932ooo0Oo0.OooO0oo;
        C1089oOOoOOO c1089oOOoOOO = new C1089oOOoOOO();
        Object obj = new Object();
        o0o0000 o0o0000Var = c1089oOOoOOO.OooO0oO;
        synchronized (o0o0000Var) {
            o0o0000Var.OooO00o.add(obj);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            c1089oOOoOOO.OooOO0(new oO00Oo00() {});
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList OooO0o = c1089oOOoOOO.OooO0o();
        C0836oO0o0oO0 c0836oO0o0oO0 = oooO00o.OooO0Oo;
        C0236o00oOOoO c0236o00oOOoO = new C0236o00oOOoO(applicationContext, OooO0o, interfaceC0206o00o0OOO, c0836oO0o0oO0);
        C1442oo00ooOo c1442oo00ooOo2 = new C1442oo00ooOo(interfaceC0206o00o0OOO, new C0919oOO00oOo(25));
        C0577o0oOo000 c0577o0oOo000 = new C0577o0oOo000(c1089oOOoOOO.OooO0o(), resources2.getDisplayMetrics(), interfaceC0206o00o0OOO, c0836oO0o0oO0);
        if (i2 >= 28 && ((Map) o00o.OooO0O0).containsKey(AbstractC0692o0ooooOo.class)) {
            c0202o00o0O00 = new C0232o00oOOOO(1);
            c0231o00oOOO0 = new C0232o00oOOOO(0);
        } else {
            c0231o00oOOO0 = new C0231o00oOOO0(c0577o0oOo000, 0);
            c0202o00o0O00 = new C0202o00o0O00(c0577o0oOo000, 2, c0836oO0o0oO0);
        }
        if (i2 >= 28) {
            i = i2;
            resources = resources2;
            c1442oo00ooOo = c1442oo00ooOo2;
            c1089oOOoOOO.OooO0Oo("Animation", InputStream.class, Drawable.class, new C0078o0000ooO(new C0415o0Oo0O0O(OooO0o, c0836oO0o0oO0, 3, false), 1));
            c1089oOOoOOO.OooO0Oo("Animation", ByteBuffer.class, Drawable.class, new C0078o0000ooO(new C0415o0Oo0O0O(OooO0o, c0836oO0o0oO0, 3, false), 0));
        } else {
            i = i2;
            resources = resources2;
            c1442oo00ooOo = c1442oo00ooOo2;
        }
        C1127oOOooOOO c1127oOOooOOO = new C1127oOOooOOO(applicationContext);
        C0203o00o0O0O c0203o00o0O0O = new C0203o00o0O0O(c0836oO0o0oO0);
        C0073o0000oO0 c0073o0000oO0 = new C0073o0000oO0(1);
        C0601o0oOooO0 c0601o0oOooO0 = new C0601o0oOooO0(19);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c1089oOOoOOO.OooO00o(ByteBuffer.class, new C0455o0OoOo00(19));
        c1089oOOoOOO.OooO00o(InputStream.class, new o00O(23, c0836oO0o0oO0));
        c1089oOOoOOO.OooO0Oo("Bitmap", ByteBuffer.class, Bitmap.class, c0231o00oOOO0);
        c1089oOOoOOO.OooO0Oo("Bitmap", InputStream.class, Bitmap.class, c0202o00o0O00);
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            cls = Drawable.class;
            c1089oOOoOOO.OooO0Oo("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0231o00oOOO0(c0577o0oOo000, 1));
        } else {
            cls = Drawable.class;
        }
        c1089oOOoOOO.OooO0Oo("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C1442oo00ooOo(interfaceC0206o00o0OOO, new C0919oOO00oOo(22)));
        C1442oo00ooOo c1442oo00ooOo3 = c1442oo00ooOo;
        c1089oOOoOOO.OooO0Oo("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c1442oo00ooOo3);
        C0455o0OoOo00 c0455o0OoOo00 = C0455o0OoOo00.OooO0o;
        c1089oOOoOOO.OooO0OO(Bitmap.class, Bitmap.class, c0455o0OoOo00);
        c1089oOOoOOO.OooO0Oo("Bitmap", Bitmap.class, Bitmap.class, new C0541o0o0OO0o(1));
        c1089oOOoOOO.OooO0O0(Bitmap.class, c0203o00o0O0O);
        Resources resources3 = resources;
        c1089oOOoOOO.OooO0Oo("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0202o00o0O00(resources3, c0231o00oOOO0));
        c1089oOOoOOO.OooO0Oo("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0202o00o0O00(resources3, c0202o00o0O00));
        c1089oOOoOOO.OooO0Oo("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0202o00o0O00(resources3, c1442oo00ooOo3));
        c1089oOOoOOO.OooO0O0(BitmapDrawable.class, new C0415o0Oo0O0O(interfaceC0206o00o0OOO, c0203o00o0O0O, 7, false));
        c1089oOOoOOO.OooO0Oo("Animation", InputStream.class, C0680o0oooOO.class, new C1258oOoo000o(OooO0o, c0236o00oOOoO, c0836oO0o0oO0));
        c1089oOOoOOO.OooO0Oo("Animation", ByteBuffer.class, C0680o0oooOO.class, c0236o00oOOoO);
        c1089oOOoOOO.OooO0O0(C0680o0oooOO.class, new C0601o0oOooO0(20));
        c1089oOOoOOO.OooO0OO(C1245oOoOoo.class, C1245oOoOoo.class, c0455o0OoOo00);
        c1089oOOoOOO.OooO0Oo("Bitmap", C1245oOoOoo.class, Bitmap.class, new C0205o00o0OO0(interfaceC0206o00o0OOO));
        Class cls2 = cls;
        c1089oOOoOOO.OooO0Oo("legacy_append", Uri.class, cls2, c1127oOOooOOO);
        c1089oOOoOOO.OooO0Oo("legacy_append", Uri.class, Bitmap.class, new C0202o00o0O00(c1127oOOooOOO, 1, interfaceC0206o00o0OOO));
        c1089oOOoOOO.OooO(new C0238o00oOo00(0));
        c1089oOOoOOO.OooO0OO(File.class, ByteBuffer.class, new C0455o0OoOo00(20));
        c1089oOOoOOO.OooO0OO(File.class, InputStream.class, new AbstractC0183o00OooOO(new C0601o0oOooO0(14) {}));
        c1089oOOoOOO.OooO0Oo("legacy_append", File.class, File.class, new C0541o0o0OO0o(0));
        c1089oOOoOOO.OooO0OO(File.class, ParcelFileDescriptor.class, new AbstractC0183o00OooOO(new C0601o0oOooO0(13) {}));
        c1089oOOoOOO.OooO0OO(File.class, File.class, c0455o0OoOo00);
        c1089oOOoOOO.OooO(new C0723oO00Ooo0(c0836oO0o0oO0));
        if (!"robolectric".equals(str)) {
            c1089oOOoOOO.OooO(new C0238o00oOo00(2));
        }
        C0394o0OOoOo0 c0394o0OOoOo0 = new C0394o0OOoOo0(applicationContext, 1);
        C0394o0OOoOo0 c0394o0OOoOo02 = new C0394o0OOoOo0(applicationContext, 0);
        C0393o0OOoOo c0393o0OOoOo = new C0393o0OOoOo(applicationContext, 0);
        Class cls3 = Integer.TYPE;
        c1089oOOoOOO.OooO0OO(cls3, InputStream.class, c0394o0OOoOo0);
        c1089oOOoOOO.OooO0OO(Integer.class, InputStream.class, c0394o0OOoOo0);
        c1089oOOoOOO.OooO0OO(cls3, AssetFileDescriptor.class, c0394o0OOoOo02);
        c1089oOOoOOO.OooO0OO(Integer.class, AssetFileDescriptor.class, c0394o0OOoOo02);
        c1089oOOoOOO.OooO0OO(cls3, cls2, c0393o0OOoOo);
        c1089oOOoOOO.OooO0OO(Integer.class, cls2, c0393o0OOoOo);
        c1089oOOoOOO.OooO0OO(Uri.class, InputStream.class, new C0393o0OOoOo(applicationContext, 4));
        c1089oOOoOOO.OooO0OO(Uri.class, AssetFileDescriptor.class, new C0394o0OOoOo0(applicationContext, 3));
        C1129oOOooOo c1129oOOooOo = new C1129oOOooOo(resources3, 1);
        C1129oOOooOo c1129oOOooOo2 = new C1129oOOooOo(resources3, 0);
        C0201o00o0O0 c0201o00o0O0 = new C0201o00o0O0(resources3);
        c1089oOOoOOO.OooO0OO(Integer.class, Uri.class, c1129oOOooOo);
        c1089oOOoOOO.OooO0OO(cls3, Uri.class, c1129oOOooOo);
        c1089oOOoOOO.OooO0OO(Integer.class, AssetFileDescriptor.class, c1129oOOooOo2);
        c1089oOOoOOO.OooO0OO(cls3, AssetFileDescriptor.class, c1129oOOooOo2);
        c1089oOOoOOO.OooO0OO(Integer.class, InputStream.class, c0201o00o0O0);
        c1089oOOoOOO.OooO0OO(cls3, InputStream.class, c0201o00o0O0);
        c1089oOOoOOO.OooO0OO(String.class, InputStream.class, new o00O(8));
        c1089oOOoOOO.OooO0OO(Uri.class, InputStream.class, new o00O(8));
        c1089oOOoOOO.OooO0OO(String.class, InputStream.class, new C0919oOO00oOo(15));
        c1089oOOoOOO.OooO0OO(String.class, ParcelFileDescriptor.class, new C0919oOO00oOo(14));
        c1089oOOoOOO.OooO0OO(String.class, AssetFileDescriptor.class, new C0919oOO00oOo(13));
        c1089oOOoOOO.OooO0OO(Uri.class, InputStream.class, new o00O(4, applicationContext.getAssets()));
        c1089oOOoOOO.OooO0OO(Uri.class, AssetFileDescriptor.class, new C0331o0O0oo(4, applicationContext.getAssets()));
        c1089oOOoOOO.OooO0OO(Uri.class, InputStream.class, new C0394o0OOoOo0(applicationContext, 2));
        c1089oOOoOOO.OooO0OO(Uri.class, InputStream.class, new C0393o0OOoOo(applicationContext, 3));
        int i3 = i;
        if (i3 >= 29) {
            c1089oOOoOOO.OooO0OO(Uri.class, InputStream.class, new AbstractC0104o000o0o(applicationContext, InputStream.class) {});
            c1089oOOoOOO.OooO0OO(Uri.class, ParcelFileDescriptor.class, new AbstractC0104o000o0o(applicationContext, ParcelFileDescriptor.class) {});
        }
        c1089oOOoOOO.OooO0OO(Uri.class, InputStream.class, new C1314oOooOoO(contentResolver, 2));
        c1089oOOoOOO.OooO0OO(Uri.class, ParcelFileDescriptor.class, new C1312oOooOo(contentResolver));
        c1089oOOoOOO.OooO0OO(Uri.class, AssetFileDescriptor.class, new C1314oOooOoO(contentResolver, 1));
        c1089oOOoOOO.OooO0OO(Uri.class, InputStream.class, new C0919oOO00oOo(20));
        c1089oOOoOOO.OooO0OO(URL.class, InputStream.class, new C0919oOO00oOo(19));
        c1089oOOoOOO.OooO0OO(Uri.class, File.class, new C0393o0OOoOo(applicationContext, 2));
        c1089oOOoOOO.OooO0OO(oO0000O.class, InputStream.class, new C0331o0O0oo(16));
        c1089oOOoOOO.OooO0OO(byte[].class, ByteBuffer.class, new C0455o0OoOo00(16));
        c1089oOOoOOO.OooO0OO(byte[].class, InputStream.class, new C0455o0OoOo00(18));
        c1089oOOoOOO.OooO0OO(Uri.class, Uri.class, c0455o0OoOo00);
        c1089oOOoOOO.OooO0OO(cls2, cls2, c0455o0OoOo00);
        c1089oOOoOOO.OooO0Oo("legacy_append", cls2, cls2, new C0541o0o0OO0o(2));
        c1089oOOoOOO.OooOO0O(Bitmap.class, BitmapDrawable.class, new C0201o00o0O0(resources3));
        c1089oOOoOOO.OooOO0O(Bitmap.class, byte[].class, c0073o0000oO0);
        c1089oOOoOOO.OooOO0O(cls2, byte[].class, new C0131o00O0o(interfaceC0206o00o0OOO, c0073o0000oO0, c0601o0oOooO0, 8));
        c1089oOOoOOO.OooOO0O(C0680o0oooOO.class, byte[].class, c0601o0oOooO0);
        if (i3 >= 23) {
            C1442oo00ooOo c1442oo00ooOo4 = new C1442oo00ooOo(interfaceC0206o00o0OOO, new C0919oOO00oOo(23));
            c1089oOOoOOO.OooO0Oo("legacy_append", ByteBuffer.class, Bitmap.class, c1442oo00ooOo4);
            c1089oOOoOOO.OooO0Oo("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0202o00o0O00(resources3, c1442oo00ooOo4));
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return c1089oOOoOOO;
        }
        AbstractC1230oOoOo0o.OooOO0O(it.next());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oo0oOOoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void OooOO0(View view, InterfaceC1933ooo0OoO interfaceC1933ooo0OoO) {
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        Object obj = new Object();
        obj.OooO00o = paddingStart;
        obj.OooO0O0 = paddingTop;
        obj.OooO0OO = paddingEnd;
        obj.OooO0Oo = paddingBottom;
        AbstractC1452oo0O000o.OooOOO0(view, new C1126oOOooOO(interfaceC1933ooo0OoO, 7, obj));
        if (view.isAttachedToWindow()) {
            AbstractC1449oo0O000.OooO0OO(view);
        } else {
            view.addOnAttachStateChangeListener(new OnAttachStateChangeListener());
        }
    }

    public static Object OooOO0O(Object[] objArr, int i, C0919oOO00oOo c0919oOO00oOo) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        int i4 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(c0919oOO00oOo.OooO0o(obj2) - i2) * 2;
            if (c0919oOO00oOo.OooO(obj2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (obj == null || i4 > i5) {
                obj = obj2;
                i4 = i5;
            }
        }
        return obj;
    }

    public static o0OOOO0o OooOOoo(o0OOOO0o o0oooo0o, C0413o0Oo0O0 c0413o0Oo0O0) {
        int OooO0O02 = o0oooo0o.OooO0O0();
        String headerField = o0oooo0o.OooO00o.getHeaderField("Location");
        int i = 0;
        do {
            if (OooO0O02 != 301 && OooO0O02 != 302 && OooO0O02 != 303 && OooO0O02 != 300 && OooO0O02 != 307 && OooO0O02 != 308) {
                return o0oooo0o;
            }
            if (headerField != null) {
                c0413o0Oo0O0.OooO00o = headerField;
                o0oooo0o = C0303o0O0Oo0o.OooO0o.OooO0O0();
                o0oooo0o.OooO00o(c0413o0Oo0O0);
                OooO0O02 = o0oooo0o.OooO0O0();
                headerField = o0oooo0o.OooO00o.getHeaderField("Location");
                i++;
            } else {
                throw new IllegalAccessException("Location is null");
            }
        } while (i < 10);
        throw new IllegalAccessException("Max redirection done");
    }

    public static boolean OooOo0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1345oOooooo.OooO00o();
        }
        try {
            if (OooO0O0 == null) {
                OooO00o = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                OooO0O0 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) OooO0O0.invoke(null, Long.valueOf(OooO00o))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean OooOo0o(View view) {
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static void OooOoo(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            AbstractC0139o00O0oo.OooO0Oo(theme);
        } else if (i >= 23) {
            synchronized (AbstractC0809oO0OooOO.OooO) {
                if (!AbstractC0809oO0OooOO.OooOO0O) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                        AbstractC0809oO0OooOO.OooOO0 = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    AbstractC0809oO0OooOO.OooOO0O = true;
                }
                Method method = AbstractC0809oO0OooOO.OooOO0;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        AbstractC0809oO0OooOO.OooOO0 = null;
                    }
                }
            }
        }
    }

    public static PorterDuff.Mode OooOoo0(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void OooOooO(String str, String str2) {
        File file = new File(str);
        try {
            File file2 = new File(str2);
            if (file2.exists() && !file2.delete()) {
                throw new IOException("Deletion Failed");
            }
            if (file.renameTo(file2)) {
                if (file.exists()) {
                    file.delete();
                    return;
                }
                return;
            }
            throw new IOException("Rename Failed");
        } catch (Throwable th) {
            if (file.exists()) {
                file.delete();
            }
            throw th;
        }
    }

    public static final void OooOooo(View view, InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O) {
        AbstractC0809oO0OooOO.OooOOOo(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0760oO0O0o0O);
    }

    public Typeface OooO(Context context, Resources resources, int i, String str, int i2) {
        File OooO0oo = AbstractC1094oOOoOOo0.OooO0oo(context);
        if (OooO0oo == null) {
            return null;
        }
        try {
            if (!AbstractC1094oOOoOOo0.OooO0Oo(OooO0oo, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(OooO0oo.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            OooO0oo.delete();
        }
    }

    public abstract int OooO0O0(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float OooO0OO(int i);

    public abstract Typeface OooO0o(Context context, C0575o0oOo0[] c0575o0oOo0Arr, int i);

    public abstract Typeface OooO0o0(Context context, C0573o0oOOooo c0573o0oOOooo, Resources resources, int i);

    public Typeface OooO0oO(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface OooO0oo(Context context, InputStream inputStream) {
        File OooO0oo = AbstractC1094oOOoOOo0.OooO0oo(context);
        if (OooO0oo == null) {
            return null;
        }
        try {
            if (!AbstractC1094oOOoOOo0.OooO0o0(inputStream, OooO0oo)) {
                return null;
            }
            return Typeface.createFromFile(OooO0oo.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            OooO0oo.delete();
        }
    }

    public C0575o0oOo0 OooOO0o(C0575o0oOo0[] c0575o0oOo0Arr, int i) {
        return (C0575o0oOo0) OooOO0O(c0575o0oOo0Arr, i, new C0919oOO00oOo(17));
    }

    public abstract int OooOOO();

    public abstract int OooOOO0();

    public abstract int OooOOOO();

    public abstract int OooOOOo();

    public abstract int OooOOo(CoordinatorLayout coordinatorLayout);

    public abstract int OooOOo0(View view);

    public abstract boolean OooOo(View view);

    public abstract int OooOo00();

    public abstract boolean OooOo0O(float f);

    public abstract void OooOoO(int i);

    public abstract boolean OooOoO0(float f, float f2);

    public abstract void OooOoOO(Typeface typeface, boolean z);

    public abstract boolean Oooo000(View view, float f);

    public abstract void Oooo00O(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);
}



