package com.ninja.engine;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.ninja.engine.o0ooooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0694o0ooooo0 {
    public static Field OooOOo;
    public static boolean OooOOoo;
    public static final Object OooO00o = new Object();
    public static final int[] OooO0O0 = new int[0];
    public static final Object[] OooO0OO = new Object[0];
    public static final String[] OooO0Oo = {"standard", "accelerate", "decelerate", "linear"};
    public static final C0601o0oOooO0 OooO0o0 = new C0601o0oOooO0(10);
    public static final boolean[] OooO0o = new boolean[3];
    public static final byte[] OooO0oO = {48, 49, 53, 0};
    public static final byte[] OooO0oo = {48, 49, 48, 0};
    public static final byte[] OooO = {48, 48, 57, 0};
    public static final byte[] OooOO0 = {48, 48, 53, 0};
    public static final byte[] OooOO0O = {48, 48, 49, 0};
    public static final byte[] OooOO0o = {48, 48, 49, 0};
    public static final byte[] OooOOO0 = {48, 48, 50, 0};
    public static final C0919oOO00oOo OooOOO = new C0919oOO00oOo(11);
    public static final C0919oOO00oOo OooOOOO = new C0919oOO00oOo(12);
    public static final C0919oOO00oOo OooOOOo = new C0919oOO00oOo(10);
    public static final C0332o0O0oo0 OooOOo0 = new C0332o0O0oo0(3);

    public static void OooO(C0580o0oOo0O0 c0580o0oOo0O0, oO0OO0O oo0oo0o, C0316o0O0o0o c0316o0O0o0o) {
        c0316o0O0o0o.OooOOOO = -1;
        c0316o0O0o0o.OooOOOo = -1;
        int i = c0580o0oOo0O0.o00o0O[0];
        int[] iArr = c0316o0O0o0o.o00o0O;
        if (i != 2 && iArr[0] == 4) {
            C0304o0O0OoO c0304o0O0OoO = c0316o0O0o0o.Oooo0;
            int i2 = c0304o0O0OoO.OooO0oO;
            int OooOOo02 = c0580o0oOo0O0.OooOOo0();
            C0304o0O0OoO c0304o0O0OoO2 = c0316o0O0o0o.Oooo0OO;
            int i3 = OooOOo02 - c0304o0O0OoO2.OooO0oO;
            c0304o0O0OoO.OooO = oo0oo0o.OooOO0O(c0304o0O0OoO);
            c0304o0O0OoO2.OooO = oo0oo0o.OooOO0O(c0304o0O0OoO2);
            oo0oo0o.OooO0Oo(c0304o0O0OoO.OooO, i2);
            oo0oo0o.OooO0Oo(c0304o0O0OoO2.OooO, i3);
            c0316o0O0o0o.OooOOOO = 2;
            c0316o0O0o0o.OoooOo0 = i2;
            int i4 = i3 - i2;
            c0316o0O0o0o.OoooOO0 = i4;
            int i5 = c0316o0O0o0o.Ooooo00;
            if (i4 < i5) {
                c0316o0O0o0o.OoooOO0 = i5;
            }
        }
        if (c0580o0oOo0O0.o00o0O[1] != 2 && iArr[1] == 4) {
            C0304o0O0OoO c0304o0O0OoO3 = c0316o0O0o0o.Oooo0O0;
            int i6 = c0304o0O0OoO3.OooO0oO;
            int OooOO0O2 = c0580o0oOo0O0.OooOO0O();
            C0304o0O0OoO c0304o0O0OoO4 = c0316o0O0o0o.Oooo0o0;
            int i7 = OooOO0O2 - c0304o0O0OoO4.OooO0oO;
            c0304o0O0OoO3.OooO = oo0oo0o.OooOO0O(c0304o0O0OoO3);
            c0304o0O0OoO4.OooO = oo0oo0o.OooOO0O(c0304o0O0OoO4);
            oo0oo0o.OooO0Oo(c0304o0O0OoO3.OooO, i6);
            oo0oo0o.OooO0Oo(c0304o0O0OoO4.OooO, i7);
            if (c0316o0O0o0o.OoooOoo > 0 || c0316o0O0o0o.Oooooo0 == 8) {
                C0304o0O0OoO c0304o0O0OoO5 = c0316o0O0o0o.Oooo0o;
                C1232oOoOo0oO OooOO0O3 = oo0oo0o.OooOO0O(c0304o0O0OoO5);
                c0304o0O0OoO5.OooO = OooOO0O3;
                oo0oo0o.OooO0Oo(OooOO0O3, c0316o0O0o0o.OoooOoo + i6);
            }
            c0316o0O0o0o.OooOOOo = 2;
            c0316o0O0o0o.OoooOoO = i6;
            int i8 = i7 - i6;
            c0316o0O0o0o.o000oOoO = i8;
            int i9 = c0316o0O0o0o.Ooooo0o;
            if (i8 < i9) {
                c0316o0O0o0o.o000oOoO = i9;
            }
        }
    }

    public static InterfaceC0713oO00OOoO OooO00o() {
        return (InterfaceC0713oO00OOoO) C0217o00o0oO0.create(InterfaceC0713oO00OOoO.class, null, false);
    }

    public static InterfaceC1831ooOOooO OooO0O0() {
        return (InterfaceC1831ooOOooO) C0217o00o0oO0.create(InterfaceC1831ooOOooO.class, null, false);
    }

    public static InterfaceC1922ooOooo0 OooO0OO() {
        return (InterfaceC1922ooOooo0) C0217o00o0oO0.create(InterfaceC1922ooOooo0.class, null, false);
    }

    public static final int OooO0Oo(int i, int i2, int[] iArr) {
        AbstractC0809oO0OooOO.OooOOOo(iArr, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static boolean OooO0o(C0989oOOO0oo0[] c0989oOOO0oo0Arr, C0989oOOO0oo0[] c0989oOOO0oo0Arr2) {
        if (c0989oOOO0oo0Arr == null || c0989oOOO0oo0Arr2 == null || c0989oOOO0oo0Arr.length != c0989oOOO0oo0Arr2.length) {
            return false;
        }
        for (int i = 0; i < c0989oOOO0oo0Arr.length; i++) {
            C0989oOOO0oo0 c0989oOOO0oo0 = c0989oOOO0oo0Arr[i];
            char c = c0989oOOO0oo0.OooO00o;
            C0989oOOO0oo0 c0989oOOO0oo02 = c0989oOOO0oo0Arr2[i];
            if (c != c0989oOOO0oo02.OooO00o || c0989oOOO0oo0.OooO0O0.length != c0989oOOO0oo02.OooO0O0.length) {
                return false;
            }
        }
        return true;
    }

    public static final int OooO0o0(long[] jArr, int i, long j) {
        AbstractC0809oO0OooOO.OooOOOo(jArr, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 > 0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return ~i3;
    }

    public static void OooO0oo(String str, boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void OooOO0(Object obj) {
        OooOO0O(obj, "Argument must not be null");
    }

    public static void OooOO0O(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static int OooOO0o(int i, int i2) {
        return o0O0OO0.OooO0Oo(i, (Color.alpha(i) * i2) / 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.ninja.engine.o0oOOoOO, com.ninja.engine.o0OoOoo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C0568o0oOOoOO OooOOO(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            com.ninja.engine.o0OOOOoO r0 = new com.ninja.engine.o0OOOOoO
            r1 = 27
            r0.<init>(r1)
            goto L15
        Le:
            com.ninja.engine.o0OoOo00 r0 = new com.ninja.engine.o0OoOo00
            r1 = 27
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            com.ninja.engine.AbstractC0809oO0OooOO.OooOOO(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r1 = r5
            goto L79
        L4f:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.Signature[] r0 = r0.OooOo0O(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
        L5d:
            if (r3 >= r6) goto L6b
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            com.ninja.engine.o0o0OoOo r1 = new com.ninja.engine.o0o0OoOo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            goto L79
        L77:
            goto L4d
        L79:
            if (r1 != 0) goto L7c
            goto L86
        L7c:
            com.ninja.engine.o0oOOoOO r5 = new com.ninja.engine.o0oOOoOO
            com.ninja.engine.o0o0Ooo0 r0 = new com.ninja.engine.o0o0Ooo0
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0694o0ooooo0.OooOOO(android.content.Context):com.ninja.engine.o0oOOoOO");
    }

    public static float[] OooOOO0(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:44:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C0989oOOO0oo0[] OooOOOO(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0694o0ooooo0.OooOOOO(java.lang.String):com.ninja.engine.oOOO0oo0[]");
    }

    public static Path OooOOOo(String str) {
        Path path = new Path();
        try {
            C0989oOOO0oo0.OooO0O0(OooOOOO(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static C0989oOOO0oo0[] OooOOo(C0989oOOO0oo0[] c0989oOOO0oo0Arr) {
        C0989oOOO0oo0[] c0989oOOO0oo0Arr2 = new C0989oOOO0oo0[c0989oOOO0oo0Arr.length];
        for (int i = 0; i < c0989oOOO0oo0Arr.length; i++) {
            c0989oOOO0oo0Arr2[i] = new C0989oOOO0oo0(c0989oOOO0oo0Arr[i]);
        }
        return c0989oOOO0oo0Arr2;
    }

    public static Drawable OooOOo0(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23) {
            z = true;
        } else {
            z = false;
        }
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = AbstractC0809oO0OooOO.o0ooOoO(drawable).mutate();
            if (mode != null) {
                mutate.setTintMode(mode);
                return mutate;
            }
            return mutate;
        } else if (z) {
            drawable.mutate();
            return drawable;
        } else {
            return drawable;
        }
    }

    public static boolean OooOOoo(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (OooOOoo(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static int OooOo(View view, int i) {
        Context context = view.getContext();
        TypedValue OoooOo0 = AbstractC0692o0ooooOo.OoooOo0(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = OoooOo0.resourceId;
        if (i2 != 0) {
            return AbstractC0809oO0OooOO.OooOoo0(context, i2);
        }
        return OoooOo0.data;
    }

    public static final boolean OooOo0(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public static final void OooOo00(InterfaceC1192oOoOO0OO interfaceC1192oOoOO0OO) {
        InterfaceC1213oOoOOo0O interfaceC1213oOoOOo0O;
        AbstractC0809oO0OooOO.OooOOOo(interfaceC1192oOoOO0OO, "<this>");
        EnumC0759oO0O0o enumC0759oO0O0o = interfaceC1192oOoOO0OO.OooO0o0().OooO0OO;
        if (enumC0759oO0O0o != EnumC0759oO0O0o.OooO0O0 && enumC0759oO0O0o != EnumC0759oO0O0o.OooO0OO) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C0086o000Oo00 OooO00o2 = interfaceC1192oOoOO0OO.OooO00o();
        OooO00o2.getClass();
        Iterator it = ((C1182oOoO) OooO00o2.OooO0o).iterator();
        while (true) {
            C1176oOo0O00o c1176oOo0O00o = (C1176oOo0O00o) it;
            if (c1176oOo0O00o.hasNext()) {
                Map.Entry entry = (Map.Entry) c1176oOo0O00o.next();
                AbstractC0809oO0OooOO.OooOOOO(entry, "components");
                interfaceC1213oOoOOo0O = (InterfaceC1213oOoOOo0O) entry.getValue();
                if (AbstractC0809oO0OooOO.OooO0o0((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    break;
                }
            } else {
                interfaceC1213oOoOOo0O = null;
                break;
            }
        }
        if (interfaceC1213oOoOOo0O == null) {
            C1189oOoOO00O c1189oOoOO00O = new C1189oOoOO00O(interfaceC1192oOoOO0OO.OooO00o(), (InterfaceC1468oo0O0OOo) interfaceC1192oOoOO0OO);
            interfaceC1192oOoOO0OO.OooO00o().OooO0o0("androidx.lifecycle.internal.SavedStateHandlesProvider", c1189oOoOO00O);
            interfaceC1192oOoOO0OO.OooO0o0().OooO00o(new SavedStateHandleAttacher(c1189oOoOO00O));
        }
    }

    public static Drawable OooOo0O(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0121o000oooo.OooO0O0(compoundButton);
        }
        if (!OooOOoo) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                OooOOo = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            OooOOoo = true;
        }
        Field field = OooOOo;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                OooOOo = null;
            }
        }
        return null;
    }

    public static int OooOo0o(Context context, int i, int i2) {
        Integer num;
        int i3;
        TypedValue OoooOOO = AbstractC0692o0ooooOo.OoooOOO(context, i);
        if (OoooOOO != null) {
            int i4 = OoooOOO.resourceId;
            if (i4 != 0) {
                i3 = AbstractC0809oO0OooOO.OooOoo0(context, i4);
            } else {
                i3 = OoooOOO.data;
            }
            num = Integer.valueOf(i3);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i2;
    }

    public static ColorStateList OooOoO0(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && AbstractC0035Oooo0o.OooOo0(drawable)) {
            colorStateList = AbstractC0035Oooo0o.OooO0o0(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static final Class OooOoOO(InterfaceC1173oOo00ooo interfaceC1173oOo00ooo) {
        AbstractC0809oO0OooOO.OooOOOo(interfaceC1173oOo00ooo, "<this>");
        Class OooO00o2 = ((o0O00O) interfaceC1173oOo00ooo).OooO00o();
        if (!OooO00o2.isPrimitive()) {
            return OooO00o2;
        }
        String name = OooO00o2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return OooO00o2;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return OooO00o2;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return OooO00o2;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return OooO00o2;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return OooO00o2;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return OooO00o2;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return OooO00o2;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return OooO00o2;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return OooO00o2;
            default:
                return OooO00o2;
        }
    }

    public static boolean OooOoo(int i) {
        double pow;
        double pow2;
        double pow3;
        if (i != 0) {
            ThreadLocal threadLocal = o0O0OO0.OooO00o;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d = red / 255.0d;
                if (d < 0.04045d) {
                    pow = d / 12.92d;
                } else {
                    pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
                }
                double d2 = green / 255.0d;
                if (d2 < 0.04045d) {
                    pow2 = d2 / 12.92d;
                } else {
                    pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = blue / 255.0d;
                if (d3 < 0.04045d) {
                    pow3 = d3 / 12.92d;
                } else {
                    pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d4;
                double d5 = pow3 * 0.9505d;
                dArr[2] = (d5 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d4 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static ArrayList OooOoo0(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean OooOooO(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static boolean OooOooo(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        AbstractC0809oO0OooOO.OooOOOo(context, "context");
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                String str = runningAppProcessInfo.processName;
                AbstractC0809oO0OooOO.OooOOOO(str, "processName");
                if (!str.endsWith(":webview")) {
                    String str2 = runningAppProcessInfo.processName;
                    AbstractC0809oO0OooOO.OooOOOO(str2, "processName");
                    if (!str2.endsWith(":safe")) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void Oooo0(String str) {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        try {
            try {
                Object newInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (IllegalAccessException e) {
                OoooOO0(cls4, e);
                throw null;
            } catch (InstantiationException e2) {
                OoooOO0(cls3, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                OoooOO0(cls2, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                OoooOO0(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static int Oooo000(int i, int i2, float f) {
        return o0O0OO0.OooO0O0(o0O0OO0.OooO0Oo(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static float Oooo00O(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static InterfaceC0572o0oOOooO Oooo00o(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        boolean z;
        int i2;
        int i3;
        C0557o0o0OoOo c0557o0o0OoOo;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1032oOOOoOo.OooO0O0);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, 500);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        OoooO00(xmlResourceParser);
                    }
                    List Oooo0o0 = Oooo0o0(resources, resourceId);
                    if (string4 != null) {
                        c0557o0o0OoOo = new C0557o0o0OoOo(string, string2, string4, Oooo0o0);
                    } else {
                        c0557o0o0OoOo = null;
                    }
                    return new C0578o0oOo00O(new C0557o0o0OoOo(string, string2, string3, Oooo0o0), c0557o0o0OoOo, integer, integer2, string5);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1032oOOOoOo.OooO0OO);
                            int i4 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i4 = 1;
                            }
                            int i5 = obtainAttributes2.getInt(i4, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i = 6;
                            } else {
                                i = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i, 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i6 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i6 = 3;
                            }
                            if (obtainAttributes2.hasValue(7)) {
                                i2 = 7;
                            } else {
                                i2 = 4;
                            }
                            String string6 = obtainAttributes2.getString(i2);
                            int i7 = obtainAttributes2.getInt(i6, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i3 = 5;
                            } else {
                                i3 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i3, 0);
                            String string7 = obtainAttributes2.getString(i3);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                OoooO00(xmlResourceParser);
                            }
                            arrayList.add(new C0576o0oOo00(i5, i7, resourceId2, string7, string6, z));
                        } else {
                            OoooO00(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new C0573o0oOOooo((C0576o0oOo00[]) arrayList.toArray(new C0576o0oOo00[0]));
                }
            } else {
                OoooO00(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r5 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Oooo0O0(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = com.ninja.engine.AbstractC0694o0ooooo0.OooO00o
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L53
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L51
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L46
        L44:
            goto L4c
        L46:
            if (r5 == 0) goto L4b
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4b
        L4b:
            throw r6     // Catch: java.lang.Throwable -> L12
        L4c:
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0694o0ooooo0.Oooo0O0(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.ninja.engine.oOooO00, com.ninja.engine.oOO0000O] */
    public static oOO0000O Oooo0OO(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    int i3 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j2 = duplicate.getInt() & 4294967295L;
                for (int i4 = 0; i4 < j2; i4++) {
                    int i5 = duplicate.getInt();
                    long j3 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (j3 + j));
                        AbstractC1290oOooO00 abstractC1290oOooO00 = new AbstractC1290oOooO00();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        abstractC1290oOooO00.OooO0Oo = duplicate;
                        abstractC1290oOooO00.OooO00o = position;
                        int i6 = position - duplicate.getInt(position);
                        abstractC1290oOooO00.OooO0O0 = i6;
                        abstractC1290oOooO00.OooO0OO = ((ByteBuffer) abstractC1290oOooO00.OooO0Oo).getShort(i6);
                        return abstractC1290oOooO00;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r5 != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r3.getName().equals("locales") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e A[Catch: all -> 0x004c, TryCatch #5 {, blocks: (B:5:0x0005, B:25:0x0048, B:34:0x0057, B:38:0x0063, B:37:0x005e, B:30:0x0050, B:31:0x0053, B:40:0x0065, B:6:0x000b, B:7:0x0018, B:11:0x0022, B:21:0x0033, B:23:0x003f), top: B:48:0x0005, inners: #1, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String Oooo0o(android.content.Context r8) {
        /*
            java.lang.Object r0 = com.ninja.engine.AbstractC0694o0ooooo0.OooO00o
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L65
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r6 = 1
            if (r5 == r6) goto L46
            r6 = 3
            if (r5 != r6) goto L2d
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            if (r7 <= r4) goto L46
            goto L2d
        L29:
            r8 = move-exception
            goto L4e
        L2b:
            goto L54
        L2d:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L33
            goto L18
        L33:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L46:
            if (r2 == 0) goto L57
        L48:
            r2.close()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L57
            goto L57
        L4c:
            r8 = move-exception
            goto L67
        L4e:
            if (r2 == 0) goto L53
            r2.close()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L53
        L53:
            throw r8     // Catch: java.lang.Throwable -> L4c
        L54:
            if (r2 == 0) goto L57
            goto L48
        L57:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L5e
            goto L63
        L5e:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4c
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return r1
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return r1
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0694o0ooooo0.Oooo0o(android.content.Context):java.lang.String");
    }

    public static List Oooo0o0(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static C0131o00O0o OoooO(int i, InterfaceC0526o0o0O0 interfaceC0526o0o0O0) {
        return new C0131o00O0o(new C0996oOOOO0Oo(i), interfaceC0526o0o0O0, OooO0o0);
    }

    public static void OoooO00(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    public static void OoooOO0(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public boolean OooO0oO() {
        return false;
    }

    public abstract InputFilter[] OooOoO(InputFilter[] inputFilterArr);

    public abstract void Oooo(boolean z);

    public abstract void Oooo0oo(boolean z);

    public abstract void OoooO0();

    public abstract void OoooO0O();

    public void Oooo0oO() {
    }
}

