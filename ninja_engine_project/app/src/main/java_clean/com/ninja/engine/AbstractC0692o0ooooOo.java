package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import android.widget.PopupWindow;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o0ooooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0692o0ooooOo implements oOO0O {
    public static volatile boolean OooOoOO = true;
    public static boolean OooOoo;
    public static Method OooOoo0;
    public static Field OooOooO;
    public static boolean OooOooo;
    public static final int[] OooO00o = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] OooO0O0 = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] OooO0OO = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] OooO0Oo = {16842755, 16843781, 16844062};
    public static final int[] OooO0o0 = {16843161};
    public static final int[] OooO0o = {16842755, 16843213};
    public static final int[] OooO0oO = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    public static final int[] OooO0oo = {16843490};
    public static final int[] OooO = {16843486, 16843487, 16843488, 16843489};
    public static final int[] OooOO0 = {16842788, 16843073, 16843488, 16843992};
    public static final int[] OooOO0O = {16843489, 16843781, 16843892, 16843893};
    public static final Object[] OooOO0o = new Object[0];
    public static final C0455o0OoOo00 OooOOO0 = new C0455o0OoOo00(12);
    public static final ExecutorC0093o000Ooo0 OooOOO = new ExecutorC0093o000Ooo0(1);
    public static final ExecutorC0093o000Ooo0 OooOOOO = new ExecutorC0093o000Ooo0(2);
    public static final int[] OooOOOo = {16842752, R.attr.theme};
    public static final int[] OooOOo0 = {R.attr.materialThemeOverlay};
    public static final byte[] OooOOo = {112, 114, 111, 0};
    public static final byte[] OooOOoo = {112, 114, 109, 0};
    public static final int[] OooOo00 = {16842919};
    public static final int[] OooOo0 = {16842908};
    public static final int[] OooOo0O = {16842913, 16842919};
    public static final int[] OooOo0o = {16842913};
    public static final int[] OooOo = {16842910, 16842919};
    public static final int[] OooOoO0 = {R.attr.colorPrimary};
    public static final int[] OooOoO = {R.attr.colorPrimaryVariant};

    public static String OooO(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    public static InterfaceC1856ooOo0o0o OooO0OO() {
        return (InterfaceC1856ooOo0o0o) C0217o00o0oO0.create(InterfaceC1856ooOo0o0o.class, null, false);
    }

    public static Context OooO0o(Context context) {
        Locale locale;
        String OooOoo02 = OooOoo0(context);
        char c = 65535;
        switch (OooOoo02.hashCode()) {
            case -1883983667:
                if (OooOoo02.equals("Chinese")) {
                    c = 0;
                    break;
                }
                break;
            case -1074763917:
                if (OooOoo02.equals("Russian")) {
                    c = 1;
                    break;
                }
                break;
            case 69730482:
                if (OooOoo02.equals("Hindi")) {
                    c = 2;
                    break;
                }
                break;
            case 699082148:
                if (OooOoo02.equals("Turkish")) {
                    c = 3;
                    break;
                }
                break;
            case 1301275074:
                if (OooOoo02.equals("Kurdish")) {
                    c = 4;
                    break;
                }
                break;
            case 1969163468:
                if (OooOoo02.equals("Arabic")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                locale = Locale.SIMPLIFIED_CHINESE;
                break;
            case 1:
                locale = new Locale("ru");
                break;
            case 2:
                locale = new Locale("hi");
                break;
            case 3:
                locale = new Locale("tr");
                break;
            case 4:
                locale = new Locale("ckb");
                break;
            case 5:
                locale = new Locale("ar");
                break;
            default:
                locale = Locale.ENGLISH;
                break;
        }
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        int i = Build.VERSION.SDK_INT;
        configuration.setLocale(locale);
        if (i >= 24) {
            AbstractC0031Oooo00O.OooOOo();
            AbstractC0031Oooo00O.OooOo00(configuration, AbstractC0031Oooo00O.OooO0oO(new Locale[]{locale}));
        }
        return context.createConfigurationContext(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r9 == 17) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r9 != 66) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        r11 = Oooo00o(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r9 == 17) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r9 == 33) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r9 == 66) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r9 != 130) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean OooO0oO(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = OooO0oo(r9, r10, r11)
            boolean r1 = OooO0oo(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = Oooo00o(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = 1
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0692o0ooooOo.OooO0oO(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean OooO0oo(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static void OooOO0(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.Oooo00o, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                OooOO0o(context, OooOoO, "Theme.MaterialComponents");
            }
        }
        OooOO0o(context, OooOoO0, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooOO0O(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = com.ninja.engine.AbstractC1038oOOOoo0O.Oooo00o
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = 1
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = 0
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0692o0ooooOo.OooOO0O(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void OooOO0o(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0oo("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static long[] OooOOO(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (android.util.Log.isLoggable("DrawableToBitmap", 5) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (android.util.Log.isLoggable("DrawableToBitmap", 5) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C0207o00o0OOo OooOOO0(com.ninja.engine.InterfaceC0206o00o0OOO r6, android.graphics.drawable.Drawable r7, int r8, int r9) {
        /*
            android.graphics.drawable.Drawable r7 = r7.getCurrent()
            boolean r0 = r7 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r0 == 0) goto L10
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            android.graphics.Bitmap r7 = r7.getBitmap()
            goto L75
        L10:
            boolean r0 = r7 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r0 != 0) goto L74
            r0 = 5
            java.lang.String r3 = "DrawableToBitmap"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r4) goto L2d
            int r5 = r7.getIntrinsicWidth()
            if (r5 > 0) goto L2d
            boolean r8 = android.util.Log.isLoggable(r3, r0)
            if (r8 == 0) goto L2b
        L28:
            r7.toString()
        L2b:
            r7 = r2
            goto L6d
        L2d:
            if (r9 != r4) goto L3c
            int r4 = r7.getIntrinsicHeight()
            if (r4 > 0) goto L3c
            boolean r8 = android.util.Log.isLoggable(r3, r0)
            if (r8 == 0) goto L2b
            goto L28
        L3c:
            int r0 = r7.getIntrinsicWidth()
            if (r0 <= 0) goto L46
            int r8 = r7.getIntrinsicWidth()
        L46:
            int r0 = r7.getIntrinsicHeight()
            if (r0 <= 0) goto L50
            int r9 = r7.getIntrinsicHeight()
        L50:
            java.util.concurrent.locks.Lock r0 = com.ninja.engine.AbstractC1354oo0000O0.OooO0Oo
            r0.lock()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = r6.OooO0oo(r8, r9, r3)
            android.graphics.Canvas r4 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L6f
            r7.setBounds(r1, r1, r8, r9)     // Catch: java.lang.Throwable -> L6f
            r7.draw(r4)     // Catch: java.lang.Throwable -> L6f
            r4.setBitmap(r2)     // Catch: java.lang.Throwable -> L6f
            r0.unlock()
            r7 = r3
        L6d:
            r1 = 1
            goto L75
        L6f:
            r6 = move-exception
            r0.unlock()
            throw r6
        L74:
            r7 = r2
        L75:
            if (r1 == 0) goto L78
            goto L7a
        L78:
            com.ninja.engine.o0oOo0o0 r6 = com.ninja.engine.AbstractC0692o0ooooOo.OooOOO0
        L7a:
            com.ninja.engine.o00o0OOo r6 = com.ninja.engine.C0207o00o0OOo.OooO0OO(r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0692o0ooooOo.OooOOO0(com.ninja.engine.o00o0OOO, android.graphics.drawable.Drawable, int, int):com.ninja.engine.o00o0OOo");
    }

    public static byte[] OooOOOO(C0384o0OOo0oO[] c0384o0OOo0oOArr, byte[] bArr) throws Exception {
        int i = 0;
        int i2 = 0;
        for (C0384o0OOo0oO c0384o0OOo0oO : c0384o0OOo0oOArr) {
            i2 += ((((c0384o0OOo0oO.OooO0oO * 2) + 7) & (-8)) / 8) + (c0384o0OOo0oO.OooO0o0 * 2) + OooOOo0(c0384o0OOo0oO.OooO00o, c0384o0OOo0oO.OooO0O0, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0384o0OOo0oO.OooO0o;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, AbstractC0694o0ooooo0.OooO)) {
            int length = c0384o0OOo0oOArr.length;
            while (i < length) {
                C0384o0OOo0oO c0384o0OOo0oO2 = c0384o0OOo0oOArr[i];
                Ooooooo(byteArrayOutputStream, c0384o0OOo0oO2, OooOOo0(c0384o0OOo0oO2.OooO00o, c0384o0OOo0oO2.OooO0O0, bArr));
                OoooooO(byteArrayOutputStream, c0384o0OOo0oO2);
                i++;
            }
        } else {
            for (C0384o0OOo0oO c0384o0OOo0oO3 : c0384o0OOo0oOArr) {
                Ooooooo(byteArrayOutputStream, c0384o0OOo0oO3, OooOOo0(c0384o0OOo0oO3.OooO00o, c0384o0OOo0oO3.OooO0O0, bArr));
            }
            int length2 = c0384o0OOo0oOArr.length;
            while (i < length2) {
                OoooooO(byteArrayOutputStream, c0384o0OOo0oOArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.ninja.engine.o0ooooOo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.ninja.engine.o0ooooOo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ninja.engine.o0ooooOo, java.lang.Object] */
    public static AbstractC0692o0ooooOo OooOOOo(int i) {
        if (i != 0) {
            if (i != 1) {
                return (AbstractC0692o0ooooOo) new C0574o0oOo();
            }
            return (AbstractC0692o0ooooOo) new C0574o0oOo();
        }
        return (AbstractC0692o0ooooOo) new C0574o0oOo();
    }

    public static int OooOOo(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        return o0O0OO0.OooO0Oo(i, Math.min(Color.alpha(i) * 2, 255));
    }

    public static String OooOOo0(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = AbstractC0694o0ooooo0.OooOO0O;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = AbstractC0694o0ooooo0.OooOO0;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = ":";
                }
                return AbstractC1230oOoOo0o.OooO(sb, str3, str2);
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
                return str2;
            }
        }
    }

    public static int OooOo(List list, InputStream inputStream, C0836oO0o0oO0 c0836oO0o0oO0) throws Exception {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1057oOOo00oO(inputStream, c0836oO0o0oO0);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int OooO0OO2 = ((oO00Oo00) list.get(i)).OooO0OO(inputStream, c0836oO0o0oO0);
                if (OooO0OO2 != -1) {
                    return OooO0OO2;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static Drawable OooOo0(Context context, int i) {
        return C1135oOOooo00.OooO0Oo().OooO0o(context, i);
    }

    public static float OooOo00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0450o0OoOOo.OooO0O0(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable OooOo0O(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (OooOoOO) {
                return Oooo00O(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return context2.getDrawable(i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            OooOoOO = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC1139oOOoooOO.OooO00o;
        return resources.getDrawable(i, theme);
    }

    public static Set OooOo0o() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static Intent OooOoO(Context context, ComponentName componentName) {
        String OooOoOO2 = OooOoOO(context, componentName);
        if (OooOoOO2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), OooOoOO2);
        if (OooOoOO(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static Intent OooOoO0(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String OooOoOO2 = OooOoOO(activity, activity.getComponentName());
            if (OooOoOO2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, OooOoOO2);
            try {
                if (OooOoOO(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String OooOoOO(Context context, ComponentName componentName) throws Exception {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else if (i2 >= 24) {
            i = 787072;
        } else {
            i = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static ImageHeaderParser$ImageType OooOoo(List list, InputStream inputStream, C0836oO0o0oO0 c0836oO0o0oO0) throws Exception {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1057oOOo00oO(inputStream, c0836oO0o0oO0);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType OooO0Oo2 = ((oO00Oo00) list.get(i)).OooO0Oo(inputStream);
                inputStream.reset();
                if (OooO0Oo2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return OooO0Oo2;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
        if (r0.equals("ar") == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String OooOoo0(android.content.Context r6) {
        /*
            java.lang.String r0 = "configuration-app"
            r1 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r0, r1)
            java.lang.String r0 = "language_user_set"
            boolean r0 = r6.getBoolean(r0, r1)
            java.lang.String r2 = "language"
            if (r0 == 0) goto L19
            r0 = 0
            java.lang.String r0 = r6.getString(r2, r0)
            if (r0 == 0) goto L19
            return r0
        L19:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            r0.getClass()
            int r3 = r0.hashCode()
            r4 = 3121(0xc31, float:4.373E-42)
            r5 = -1
            if (r3 == r4) goto L8a
            r1 = 3329(0xd01, float:4.665E-42)
            if (r3 == r1) goto L7f
            r1 = 3434(0xd6a, float:4.812E-42)
            if (r3 == r1) goto L74
            r1 = 3651(0xe43, float:5.116E-42)
            if (r3 == r1) goto L69
            r1 = 3710(0xe7e, float:5.199E-42)
            if (r3 == r1) goto L5e
            r1 = 3886(0xf2e, float:5.445E-42)
            if (r3 == r1) goto L53
            r1 = 98554(0x180fa, float:1.38104E-40)
            if (r3 == r1) goto L48
        L46:
            r1 = -1
            goto L93
        L48:
            java.lang.String r1 = "ckb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L51
            goto L46
        L51:
            r1 = 6
            goto L93
        L53:
            java.lang.String r1 = "zh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5c
            goto L46
        L5c:
            r1 = 5
            goto L93
        L5e:
            java.lang.String r1 = "tr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            goto L46
        L67:
            r1 = 4
            goto L93
        L69:
            java.lang.String r1 = "ru"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72
            goto L46
        L72:
            r1 = 3
            goto L93
        L74:
            java.lang.String r1 = "ku"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d
            goto L46
        L7d:
            r1 = 2
            goto L93
        L7f:
            java.lang.String r1 = "hi"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            goto L46
        L88:
            r1 = 1
            goto L93
        L8a:
            java.lang.String r3 = "ar"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L93
            goto L46
        L93:
            java.lang.String r0 = "Kurdish"
            switch(r1) {
                case 0: goto La7;
                case 1: goto La4;
                case 2: goto La9;
                case 3: goto La1;
                case 4: goto L9e;
                case 5: goto L9b;
                case 6: goto La9;
                default: goto L98;
            }
        L98:
            java.lang.String r0 = "English"
            goto La9
        L9b:
            java.lang.String r0 = "Chinese"
            goto La9
        L9e:
            java.lang.String r0 = "Turkish"
            goto La9
        La1:
            java.lang.String r0 = "Russian"
            goto La9
        La4:
            java.lang.String r0 = "Hindi"
            goto La9
        La7:
            java.lang.String r0 = "Arabic"
        La9:
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r6 = r6.putString(r2, r0)
            r6.apply()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0692o0ooooOo.OooOoo0(android.content.Context):java.lang.String");
    }

    public static ImageHeaderParser$ImageType OooOooO(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType OooO00o2 = ((oO00Oo00) list.get(i)).OooO00o(byteBuffer);
                AbstractC0242o00oOoO0.OooO0OO(byteBuffer);
                if (OooO00o2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return OooO00o2;
                }
            } catch (Throwable th) {
                AbstractC0242o00oOoO0.OooO0OO(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean OooOooo(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 >= i3 && rect.bottom > i3) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 >= i5 && rect.right > i5) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if ((i6 <= i7 && rect.top < i7) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if ((i8 <= i9 && rect.left < i9) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static void Oooo(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static int Oooo0(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw new IllegalStateException(AbstractC1230oOoOo0o.OooO0o(i, "Unexpected flag: "));
            }
            return i2;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static boolean Oooo000(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o0O0oo00, android.content.ContextWrapper] */
    public static Drawable Oooo00O(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            o0O0oo00 contextWrapper = new o0O0oo00(context);
            contextWrapper.OooO0O0 = theme;
            contextWrapper.OooO00o(theme.getResources().getConfiguration());
            context = contextWrapper;
        }
        return OooOo0(context, i);
    }

    public static int Oooo00o(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return Math.max(0, i2 - i3);
    }

    public static int Oooo0O0(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i2));
        }
        height = (rect.height() / 2) + rect.top;
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i2));
    }

    public static TypedArray Oooo0OO(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        OooOO0(context, attributeSet, i, i2);
        OooOO0O(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static C0131o00O0o Oooo0o0(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        OooOO0(context, attributeSet, i, i2);
        OooOO0O(context, attributeSet, iArr, i, i2, iArr2);
        return new C0131o00O0o(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static float Oooo0oo(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0450o0OoOOo.OooO0OO(edgeEffect, f, f2);
        }
        AbstractC0451o0OoOOo0.OooO00o(edgeEffect, f, f2);
        return f;
    }

    public static C0384o0OOo0oO[] OoooO(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0384o0OOo0oO[] c0384o0OOo0oOArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new C0384o0OOo0oO[0];
        }
        if (i == c0384o0OOo0oOArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
                String str2 = new String(AbstractC0809oO0OooOO.OoooOoo(byteArrayInputStream, (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long Ooooo0o = AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 4);
                int Ooooo0o2 = (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
                C0384o0OOo0oO c0384o0OOo0oO = null;
                if (c0384o0OOo0oOArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= c0384o0OOo0oOArr.length) {
                            break;
                        } else if (c0384o0OOo0oOArr[i3].OooO0O0.equals(str)) {
                            c0384o0OOo0oO = c0384o0OOo0oOArr[i3];
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (c0384o0OOo0oO != null) {
                    c0384o0OOo0oO.OooO0Oo = Ooooo0o;
                    int[] OoooO00 = OoooO00(byteArrayInputStream, Ooooo0o2);
                    if (Arrays.equals(bArr, AbstractC0694o0ooooo0.OooOO0O)) {
                        c0384o0OOo0oO.OooO0o0 = Ooooo0o2;
                        c0384o0OOo0oO.OooO0oo = OoooO00;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return c0384o0OOo0oOArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C0384o0OOo0oO[] OoooO0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0384o0OOo0oO[] c0384o0OOo0oOArr) throws Exception {
        byte[] bArr3 = AbstractC0694o0ooooo0.OooOO0o;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(AbstractC0694o0ooooo0.OooO0oO, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int Ooooo0o = (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 1);
                    byte[] Ooooo00 = AbstractC0809oO0OooOO.Ooooo00(fileInputStream, (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 4), (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Ooooo00);
                        try {
                            C0384o0OOo0oO[] OoooO0O = OoooO0O(byteArrayInputStream, Ooooo0o, c0384o0OOo0oOArr);
                            byteArrayInputStream.close();
                            return OoooO0O;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, AbstractC0694o0ooooo0.OooOOO0)) {
            int Ooooo0o2 = (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 2);
            byte[] Ooooo002 = AbstractC0809oO0OooOO.Ooooo00(fileInputStream, (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 4), (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Ooooo002);
                try {
                    C0384o0OOo0oO[] OoooO = OoooO(byteArrayInputStream2, bArr2, Ooooo0o2, c0384o0OOo0oOArr);
                    byteArrayInputStream2.close();
                    return OoooO;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static int[] OoooO00(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static C0384o0OOo0oO[] OoooO0O(ByteArrayInputStream byteArrayInputStream, int i, C0384o0OOo0oO[] c0384o0OOo0oOArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0384o0OOo0oO[0];
        }
        if (i == c0384o0OOo0oOArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int Ooooo0o = (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
                iArr[i2] = (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
                strArr[i2] = new String(AbstractC0809oO0OooOO.OoooOoo(byteArrayInputStream, Ooooo0o), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                C0384o0OOo0oO c0384o0OOo0oO = c0384o0OOo0oOArr[i3];
                if (c0384o0OOo0oO.OooO0O0.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    c0384o0OOo0oO.OooO0o0 = i4;
                    c0384o0OOo0oO.OooO0oo = OoooO00(byteArrayInputStream, i4);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c0384o0OOo0oOArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C0384o0OOo0oO[] OoooOO0(FileInputStream fileInputStream, byte[] bArr, String str) throws Exception {
        if (Arrays.equals(bArr, AbstractC0694o0ooooo0.OooO0oo)) {
            int Ooooo0o = (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 1);
            byte[] Ooooo00 = AbstractC0809oO0OooOO.Ooooo00(fileInputStream, (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 4), (int) AbstractC0809oO0OooOO.Ooooo0o(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Ooooo00);
                try {
                    C0384o0OOo0oO[] o000oOoO = o000oOoO(byteArrayInputStream, str, Ooooo0o);
                    byteArrayInputStream.close();
                    return o000oOoO;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static TypedValue OoooOOO(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean OoooOOo(Context context, int i, boolean z) {
        TypedValue OoooOOO = OoooOOO(context, i);
        if (OoooOOO != null && OoooOOO.type == 18) {
            if (OoooOOO.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static TypedValue OoooOo0(Context context, String str, int i) {
        TypedValue OoooOOO = OoooOOO(context, i);
        if (OoooOOO != null) {
            return OoooOOO;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static ColorStateList OoooOoO(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(OooOo, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static void OoooOoo(C0120o000oooO c0120o000oooO, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0121o000oooo.OooOOoo(c0120o000oooO, z);
            return;
        }
        if (!OooOooo) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                OooOooO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            OooOooo = true;
        }
        Field field = OooOooO;
        if (field != null) {
            try {
                field.set(c0120o000oooO, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void Ooooo00(View view, C0875oO0oOooo c0875oO0oOooo) {
        C0453o0OoOo c0453o0OoOo = c0875oO0oOooo.OooO00o.OooO0O0;
        if (c0453o0OoOo != null && c0453o0OoOo.OooO00o) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                f += AbstractC1452oo0O000o.OooO0o0((View) parent);
            }
            C0868oO0oOoO c0868oO0oOoO = c0875oO0oOooo.OooO00o;
            if (c0868oO0oOoO.OooOOO0 != f) {
                c0868oO0oOoO.OooOOO0 = f;
                c0875oO0oOooo.OooOOOO();
            }
        }
    }

    public static void Ooooo0o(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0121o000oooo.OooOo00(popupWindow, i);
            return;
        }
        if (!OooOoo) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                OooOoo0 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            OooOoo = true;
        }
        Method method = OooOoo0;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static boolean OooooO0(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static final Object[] OooooOO(Collection collection) {
        AbstractC0809oO0OooOO.OooOOOo(collection, "collection");
        int size = collection.size();
        Object[] objArr = OooOO0o;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                i3 = 2147483645;
                                if (i2 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i3);
                            AbstractC0809oO0OooOO.OooOOOO(objArr2, "copyOf(...)");
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] OooooOo(Collection collection, Object[] objArr) {
        Object[] objArr2;
        AbstractC0809oO0OooOO.OooOOOo(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            AbstractC0809oO0OooOO.OooOOO0(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                AbstractC0809oO0OooOO.OooOOOO(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                AbstractC0809oO0OooOO.OooOOOO(copyOf, "copyOf(...)");
                return copyOf;
            }
            i = i2;
        }
    }

    public static Context Oooooo(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOOo0, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof o0O0oo00) && ((o0O0oo00) context).OooO00o == resourceId) {
            z = true;
        } else {
            z = false;
        }
        if (resourceId != 0 && !z) {
            o0O0oo00 o0o0oo00 = new o0O0oo00(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, OooOOOo);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                o0o0oo00.getTheme().applyStyle(resourceId2, true);
            }
            return o0o0oo00;
        }
        return context;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean Oooooo0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0384o0OOo0oO[] c0384o0OOo0oOArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = AbstractC0694o0ooooo0.OooO0oO;
        int i = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream2, c0384o0OOo0oOArr.length);
                int i2 = 2;
                int i3 = 2;
                for (C0384o0OOo0oO c0384o0OOo0oO : c0384o0OOo0oOArr) {
                    AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream2, c0384o0OOo0oO.OooO0OO, 4);
                    AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream2, c0384o0OOo0oO.OooO0Oo, 4);
                    AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream2, c0384o0OOo0oO.OooO0oO, 4);
                    String OooOOo02 = OooOOo0(c0384o0OOo0oO.OooO00o, c0384o0OOo0oO.OooO0O0, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = OooOOo02.getBytes(charset).length;
                    AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(OooOOo02.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    C1547oo0OoooO c1547oo0OoooO = new C1547oo0OoooO(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(c1547oo0OoooO);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < c0384o0OOo0oOArr.length) {
                        try {
                            C0384o0OOo0oO c0384o0OOo0oO2 = c0384o0OOo0oOArr[i4];
                            AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream3, i4);
                            AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream3, c0384o0OOo0oO2.OooO0o0);
                            i5 = i5 + 4 + (c0384o0OOo0oO2.OooO0o0 * 2);
                            int[] iArr = c0384o0OOo0oO2.OooO0oo;
                            int length3 = iArr.length;
                            int i6 = 0;
                            while (i < length3) {
                                int i7 = iArr[i];
                                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream3, i7 - i6);
                                i++;
                                i6 = i7;
                            }
                            i4++;
                            i = 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i5 == byteArray2.length) {
                        C1547oo0OoooO c1547oo0OoooO2 = new C1547oo0OoooO(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(c1547oo0OoooO2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < c0384o0OOo0oOArr.length) {
                            try {
                                C0384o0OOo0oO c0384o0OOo0oO3 = c0384o0OOo0oOArr[i8];
                                int i10 = 0;
                                for (Object obj_entry : c0384o0OOo0oO3.OooO.entrySet()) {
                                    Map.Entry entry = (Map.Entry) obj_entry;
                                    i10 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                o0OoOo0(byteArrayOutputStream4, i10, c0384o0OOo0oO3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                ooOO(byteArrayOutputStream5, c0384o0OOo0oO3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream3, i8);
                                int length4 = byteArray3.length + i2 + byteArray4.length;
                                int i11 = i9 + 6;
                                ArrayList arrayList4 = arrayList3;
                                AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream3, length4, 4);
                                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream3, i10);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i9 = i11 + length4;
                                i8++;
                                arrayList3 = arrayList4;
                                i2 = 2;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th2) {
                                    // th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i9 == byteArray5.length) {
                            C1547oo0OoooO c1547oo0OoooO3 = new C1547oo0OoooO(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(c1547oo0OoooO3);
                            long j = 4;
                            long size = j + j + 4 + (arrayList2.size() * 16);
                            int i12 = 4;
                            AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, arrayList2.size(), 4);
                            int i13 = 0;
                            while (i13 < arrayList2.size()) {
                                C1547oo0OoooO c1547oo0OoooO4 = (C1547oo0OoooO) arrayList2.get(i13);
                                AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, AbstractC1230oOoOo0o.OooO0o0(c1547oo0OoooO4.OooO00o), i12);
                                AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, size, i12);
                                boolean z = c1547oo0OoooO4.OooO0OO;
                                byte[] bArr3 = c1547oo0OoooO4.OooO0O0;
                                if (z) {
                                    byte[] OooOo0O2 = AbstractC0809oO0OooOO.OooOo0O(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(OooOo0O2);
                                    AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, OooOo0O2.length, 4);
                                    AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, bArr3.length, 4);
                                    length = OooOo0O2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, bArr3.length, 4);
                                    AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i13++;
                                arrayList5 = arrayList;
                                i12 = 4;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i14));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] bArr4 = AbstractC0694o0ooooo0.OooO0oo;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] OooOOOO2 = OooOOOO(c0384o0OOo0oOArr, bArr4);
            AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oOArr.length, 1);
            AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, OooOOOO2.length, 4);
            byte[] OooOo0O3 = AbstractC0809oO0OooOO.OooOo0O(OooOOOO2);
            AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, OooOo0O3.length, 4);
            byteArrayOutputStream.write(OooOo0O3);
            return true;
        }
        byte[] bArr5 = AbstractC0694o0ooooo0.OooOO0;
        if (Arrays.equals(bArr, bArr5)) {
            AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oOArr.length, 1);
            for (C0384o0OOo0oO c0384o0OOo0oO4 : c0384o0OOo0oOArr) {
                String OooOOo03 = OooOOo0(c0384o0OOo0oO4.OooO00o, c0384o0OOo0oO4.OooO0O0, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, OooOOo03.getBytes(charset2).length);
                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, c0384o0OOo0oO4.OooO0oo.length);
                AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oO4.OooO.size() * 4, 4);
                AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oO4.OooO0OO, 4);
                byteArrayOutputStream.write(OooOOo03.getBytes(charset2));
                for (Object numObj : c0384o0OOo0oO4.OooO.keySet()) {
                    Integer num = (Integer) numObj;
                    AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, num.intValue());
                    AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, 0);
                }
                for (int i15 : c0384o0OOo0oO4.OooO0oo) {
                    AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, i15);
                }
            }
            return true;
        }
        byte[] bArr6 = AbstractC0694o0ooooo0.OooO;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] OooOOOO3 = OooOOOO(c0384o0OOo0oOArr, bArr6);
            AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oOArr.length, 1);
            AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, OooOOOO3.length, 4);
            byte[] OooOo0O4 = AbstractC0809oO0OooOO.OooOo0O(OooOOOO3);
            AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, OooOo0O4.length, 4);
            byteArrayOutputStream.write(OooOo0O4);
            return true;
        }
        byte[] bArr7 = AbstractC0694o0ooooo0.OooOO0O;
        if (Arrays.equals(bArr, bArr7)) {
            AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, c0384o0OOo0oOArr.length);
            for (C0384o0OOo0oO c0384o0OOo0oO5 : c0384o0OOo0oOArr) {
                String OooOOo04 = OooOOo0(c0384o0OOo0oO5.OooO00o, c0384o0OOo0oO5.OooO0O0, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, OooOOo04.getBytes(charset3).length);
                TreeMap treeMap = c0384o0OOo0oO5.OooO;
                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, treeMap.size());
                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, c0384o0OOo0oO5.OooO0oo.length);
                AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oO5.OooO0OO, 4);
                byteArrayOutputStream.write(OooOOo04.getBytes(charset3));
                for (Object num2Obj : treeMap.keySet()) {
                    Integer num2 = (Integer) num2Obj;
                    AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, num2.intValue());
                }
                for (int i16 : c0384o0OOo0oO5.OooO0oo) {
                    AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, i16);
                }
            }
            return true;
        }
        return false;
    }

    public static void OoooooO(ByteArrayOutputStream byteArrayOutputStream, C0384o0OOo0oO c0384o0OOo0oO) throws Exception {
        ooOO(byteArrayOutputStream, c0384o0OOo0oO);
        int[] iArr = c0384o0OOo0oO.OooO0oo;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, i3 - i2);
            i++;
            i2 = i3;
        }
        int i4 = c0384o0OOo0oO.OooO0oO;
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        for (Object obj_entry : c0384o0OOo0oO.OooO.entrySet()) {
            Map.Entry entry = (Map.Entry) obj_entry;
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int Oooo0 = Oooo0(2, intValue, i4);
                int i5 = Oooo0 / 8;
                bArr[i5] = (byte) ((1 << (Oooo0 % 8)) | bArr[i5]);
            }
            if ((intValue2 & 4) != 0) {
                int Oooo02 = Oooo0(4, intValue, i4);
                int i6 = Oooo02 / 8;
                bArr[i6] = (byte) ((1 << (Oooo02 % 8)) | bArr[i6]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Ooooooo(ByteArrayOutputStream byteArrayOutputStream, C0384o0OOo0oO c0384o0OOo0oO, String str) throws Exception {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, c0384o0OOo0oO.OooO0o0);
        AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oO.OooO0o, 4);
        AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oO.OooO0OO, 4);
        AbstractC0809oO0OooOO.o0Oo0oo(byteArrayOutputStream, c0384o0OOo0oO.OooO0oO, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static C0384o0OOo0oO[] o000oOoO(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        TreeMap treeMap;
        int i2;
        if (byteArrayInputStream.available() == 0) {
            return new C0384o0OOo0oO[0];
        }
        C0384o0OOo0oO[] c0384o0OOo0oOArr = new C0384o0OOo0oO[i];
        for (int i3 = 0; i3 < i; i3++) {
            int Ooooo0o = (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
            c0384o0OOo0oOArr[i3] = new C0384o0OOo0oO(str, new String(AbstractC0809oO0OooOO.OoooOoo(byteArrayInputStream, (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2)), StandardCharsets.UTF_8), AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 4), Ooooo0o, (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 4), (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 4), new int[Ooooo0o], new TreeMap());
        }
        for (int i4 = 0; i4 < i; i4++) {
            C0384o0OOo0oO c0384o0OOo0oO = c0384o0OOo0oOArr[i4];
            int available = byteArrayInputStream.available() - c0384o0OOo0oO.OooO0o;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c0384o0OOo0oO.OooO;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int Ooooo0o2 = (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2); Ooooo0o2 > 0; Ooooo0o2--) {
                    AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
                    int Ooooo0o3 = (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 1);
                    if (Ooooo0o3 != 6 && Ooooo0o3 != 7) {
                        while (Ooooo0o3 > 0) {
                            AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 1);
                            for (int Ooooo0o4 = (int) AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 1); Ooooo0o4 > 0; Ooooo0o4--) {
                                AbstractC0809oO0OooOO.Ooooo0o(byteArrayInputStream, 2);
                            }
                            Ooooo0o3--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                c0384o0OOo0oO.OooO0oo = OoooO00(byteArrayInputStream, c0384o0OOo0oO.OooO0o0);
                int i6 = c0384o0OOo0oO.OooO0oO;
                BitSet valueOf = BitSet.valueOf(AbstractC0809oO0OooOO.OoooOoo(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
                for (int i7 = 0; i7 < i6; i7++) {
                    if (valueOf.get(Oooo0(2, i7, i6))) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    if (valueOf.get(Oooo0(4, i7, i6))) {
                        i2 |= 4;
                    }
                    if (i2 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i7), Integer.valueOf(i2 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return c0384o0OOo0oOArr;
    }

    public static void o0OoOo0(ByteArrayOutputStream byteArrayOutputStream, int i, C0384o0OOo0oO c0384o0OOo0oO) throws Exception {
        int bitCount = Integer.bitCount(i & (-2));
        int i2 = c0384o0OOo0oO.OooO0oO;
        byte[] bArr = new byte[(((bitCount * i2) + 7) & (-8)) / 8];
        for (Object obj_entry : c0384o0OOo0oO.OooO.entrySet()) {
            Map.Entry entry = (Map.Entry) obj_entry;
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void ooOO(ByteArrayOutputStream byteArrayOutputStream, C0384o0OOo0oO c0384o0OOo0oO) {
        int i = 0;
        for (Object obj_entry : c0384o0OOo0oO.OooO.entrySet()) {
            Map.Entry entry = (Map.Entry) obj_entry;
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, intValue - i);
                AbstractC0809oO0OooOO.o0OO00O(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public abstract void OooOOoo(C1214oOoOOo0o c1214oOoOOo0o, float f, float f2);

    public abstract View Oooo0o(int i);

    public abstract boolean Oooo0oO();
}




