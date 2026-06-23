package com.ninja.engine;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
/* renamed from: com.ninja.engine.oO0OooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0809oO0OooOO {
    public static Method OooOO0 = null;
    public static boolean OooOO0O = false;
    public static boolean OooOOO = false;
    public static Method OooOOO0 = null;
    public static Method OooOOOO = null;
    public static boolean OooOOOo = false;
    public static Method OooOOo = null;
    public static boolean OooOOo0 = false;
    public static boolean OooOOoo = false;
    public static Field OooOo00;
    public static final float[][] OooO00o = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] OooO0O0 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] OooO0OO = {95.047f, 100.0f, 108.883f};
    public static final float[][] OooO0Oo = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final C0189o00o00 OooO0o0 = new C0189o00o00();
    public static final String[] OooO0o = new String[0];
    public static final Object OooO0oO = new Object();
    public static final C0919oOO00oOo OooO0oo = new C0919oOO00oOo(4);
    public static final Object OooO = new Object();
    public static final Object OooOO0o = new Object();

    public static InterfaceC1867ooOoO0O OooO00o() {
        return (InterfaceC1867ooOoO0O) C0217o00o0oO0.create(InterfaceC1867ooOoO0O.class, null, false);
    }

    public static final void OooO0O0(C1446oo0O c1446oo0O, int i) {
        OooOOOo(c1446oo0O, "<this>");
        c1446oo0O.OooO00o = new int[i];
        c1446oo0O.OooO0O0 = new Object[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0282, code lost:
        if (r2.OooO0Oo == r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0108, code lost:
        if (r4.OooO0Oo == r13) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x052d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0581 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0692 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06fa A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0OO(com.ninja.engine.C0580o0oOo0O0 r36, com.ninja.engine.oO0OO0O r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0809oO0OooOO.OooO0OO(com.ninja.engine.o0oOo0O0, com.ninja.engine.oO0OO0O, java.util.ArrayList, int):void");
    }

    public static void OooO0Oo(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = o0ooOoO(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static boolean OooO0o(C0316o0O0o0o c0316o0O0o0o) {
        C0580o0oOo0O0 c0580o0oOo0O0;
        boolean z;
        boolean z2;
        int[] iArr = c0316o0O0o0o.o00o0O;
        int i = iArr[0];
        int i2 = iArr[1];
        C0316o0O0o0o c0316o0O0o0o2 = c0316o0O0o0o.OoooO;
        if (c0316o0O0o0o2 != null) {
            c0580o0oOo0O0 = (C0580o0oOo0O0) c0316o0O0o0o2;
        } else {
            c0580o0oOo0O0 = null;
        }
        if (c0580o0oOo0O0 != null) {
            int i3 = c0580o0oOo0O0.o00o0O[0];
        }
        if (c0580o0oOo0O0 != null) {
            int i4 = c0580o0oOo0O0.o00o0O[1];
        }
        if (i != 1 && !c0316o0O0o0o.OooOoOO() && i != 2 && ((i != 3 || c0316o0O0o0o.OooOOo != 0 || c0316o0O0o0o.OoooOOO != 0.0f || !c0316o0O0o0o.OooOo00(0)) && (i != 3 || c0316o0O0o0o.OooOOo != 1 || !c0316o0O0o0o.OooOo0(0, c0316o0O0o0o.OooOOo0())))) {
            z = false;
        } else {
            z = true;
        }
        if (i2 != 1 && !c0316o0O0o0o.OooOoo0() && i2 != 2 && ((i2 != 3 || c0316o0O0o0o.OooOOoo != 0 || c0316o0O0o0o.OoooOOO != 0.0f || !c0316o0O0o0o.OooOo00(1)) && (i2 != 3 || c0316o0O0o0o.OooOOoo != 1 || !c0316o0O0o0o.OooOo0(1, c0316o0O0o0o.OooOO0O())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c0316o0O0o0o.OoooOOO > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static boolean OooO0o0(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void OooOO0(String str, boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void OooOO0O(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void OooOO0o(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        Oooooo0(nullPointerException, AbstractC0809oO0OooOO.class.getName());
        throw nullPointerException;
    }

    public static void OooOOO(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void OooOOO0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        Oooooo0(nullPointerException, AbstractC0809oO0OooOO.class.getName());
        throw nullPointerException;
    }

    public static void OooOOOO(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        Oooooo0(nullPointerException, AbstractC0809oO0OooOO.class.getName());
        throw nullPointerException;
    }

    public static void OooOOOo(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0809oO0OooOO.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            Oooooo0(nullPointerException, AbstractC0809oO0OooOO.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooOOo(android.content.Context r8, java.lang.String r9) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r8.getPackageName()
            int r0 = r8.checkPermission(r9, r0, r1)
            r3 = -1
            if (r0 != r3) goto L15
            goto L8c
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L20
            java.lang.String r9 = com.ninja.engine.AbstractC0121o000oooo.OooOO0o(r9)
            goto L21
        L20:
            r9 = 0
        L21:
            r5 = 0
            if (r9 != 0) goto L27
        L24:
            r3 = 0
            goto L8c
        L27:
            if (r2 != 0) goto L39
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L8c
            int r6 = r2.length
            if (r6 > 0) goto L37
            goto L8c
        L37:
            r2 = r2[r5]
        L39:
            int r3 = android.os.Process.myUid()
            java.lang.String r6 = r8.getPackageName()
            r7 = 1
            if (r3 != r1) goto L7a
            boolean r3 = java.util.Objects.equals(r6, r2)
            if (r3 == 0) goto L7a
            r3 = 29
            if (r0 < r3) goto L6d
            android.app.AppOpsManager r0 = com.ninja.engine.AbstractC0139o00O0oo.OooO0O0(r8)
            int r3 = android.os.Binder.getCallingUid()
            if (r0 != 0) goto L5a
            r2 = 1
            goto L5e
        L5a:
            int r2 = r0.checkOpNoThrow(r9, r3, r2)
        L5e:
            if (r2 == 0) goto L61
            goto L87
        L61:
            java.lang.String r8 = com.ninja.engine.AbstractC0139o00O0oo.OooO00o(r8)
            if (r0 != 0) goto L68
            goto L86
        L68:
            int r7 = r0.checkOpNoThrow(r9, r1, r8)
            goto L86
        L6d:
            if (r0 < r4) goto L86
            java.lang.Object r8 = com.ninja.engine.AbstractC0121o000oooo.OooO0oO(r8)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = com.ninja.engine.AbstractC0121o000oooo.OooOO0O(r8, r9, r2)
            goto L86
        L7a:
            if (r0 < r4) goto L86
            java.lang.Object r8 = com.ninja.engine.AbstractC0121o000oooo.OooO0oO(r8)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = com.ninja.engine.AbstractC0121o000oooo.OooOO0O(r8, r9, r2)
        L86:
            r2 = r7
        L87:
            if (r2 != 0) goto L8a
            goto L24
        L8a:
            r8 = -2
            r3 = -2
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0809oO0OooOO.OooOOo(android.content.Context, java.lang.String):int");
    }

    public static int OooOOo0(Context context, String str) {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            C0931oOO0OOoO c0931oOO0OOoO = new C0931oOO0OOoO(context);
            if (i >= 24) {
                z = AbstractC0795oO0OoO.OooO00o(c0931oOO0OOoO.OooO00o);
            } else {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i2 = applicationInfo.uid;
                try {
                    Class<?> cls = Class.forName(AppOpsManager.class.getName());
                    Class<?> cls2 = Integer.TYPE;
                    Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                    Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                    num.getClass();
                    if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i2), packageName)).intValue() != 0) {
                        z = false;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                }
            }
            if (z) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static float OooOOoo(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x0397, code lost:
        if (r31 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0399, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x039b, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03aa, code lost:
        if (r3.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03ac, code lost:
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03b8, code lost:
        if (r32 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ba, code lost:
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03be, code lost:
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c1, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator OooOo(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0809oO0OooOO.OooOo(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static void OooOo0(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i < 23) {
            if (drawable instanceof InsetDrawable) {
                OooOo0(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof InterfaceC1544oo0OooOo) {
                OooOo0(((C1546oo0Oooo0) ((InterfaceC1544oo0OooOo) drawable)).OooO0o);
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        OooOo0(child);
                    }
                }
            }
        }
    }

    public static int OooOo00(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static byte[] OooOo0O(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static ImageView.ScaleType OooOo0o(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean OooOoO(com.ninja.engine.oO0OO00O r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L5
            return r1
        L5:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L10
            boolean r7 = r7.OooO0O0(r10)
            return r7
        L10:
            boolean r2 = r9 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L83
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L66
            android.app.ActionBar r8 = r9.getActionBar()
            int r2 = r10.getKeyCode()
            r4 = 82
            if (r2 != r4) goto L66
            if (r8 == 0) goto L66
            boolean r2 = com.ninja.engine.AbstractC0809oO0OooOO.OooOOo0
            if (r2 != 0) goto L4c
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            com.ninja.engine.AbstractC0809oO0OooOO.OooOOo = r2     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            com.ninja.engine.AbstractC0809oO0OooOO.OooOOo0 = r0
        L4c:
            java.lang.reflect.Method r2 = com.ninja.engine.AbstractC0809oO0OooOO.OooOOo
            if (r2 == 0) goto L63
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L62
            r4[r1] = r10     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r2.invoke(r8, r4)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L5b
            goto L63
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L62
            boolean r1 = r8.booleanValue()     // Catch: java.lang.Throwable -> L62
            goto L63
        L62:
        L63:
            if (r1 == 0) goto L66
            goto L82
        L66:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6d
            goto L82
        L6d:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = com.ninja.engine.AbstractC1460oo0O00oo.OooO0O0(r7, r10)
            if (r8 == 0) goto L78
            goto L82
        L78:
            if (r7 == 0) goto L7e
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L7e:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L82:
            return r0
        L83:
            boolean r2 = r9 instanceof android.app.Dialog
            if (r2 == 0) goto Ld7
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = com.ninja.engine.AbstractC0809oO0OooOO.OooOOoo
            if (r7 != 0) goto L9c
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L9a
            com.ninja.engine.AbstractC0809oO0OooOO.OooOo00 = r7     // Catch: java.lang.NoSuchFieldException -> L9a
            r7.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L9a
        L9a:
            com.ninja.engine.AbstractC0809oO0OooOO.OooOOoo = r0
        L9c:
            java.lang.reflect.Field r7 = com.ninja.engine.AbstractC0809oO0OooOO.OooOo00
            if (r7 == 0) goto La8
            java.lang.Object r7 = (Object) r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La7
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La7
            goto La9
        La7:
        La8:
            r7 = r3
        La9:
            if (r7 == 0) goto Lb6
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb6
            goto Ld6
        Lb6:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lc1
            goto Ld6
        Lc1:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = com.ninja.engine.AbstractC1460oo0O00oo.OooO0O0(r7, r10)
            if (r8 == 0) goto Lcc
            goto Ld6
        Lcc:
            if (r7 == 0) goto Ld2
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        Ld2:
            boolean r0 = r10.dispatch(r9, r3, r9)
        Ld6:
            return r0
        Ld7:
            if (r8 == 0) goto Ldf
            boolean r8 = com.ninja.engine.AbstractC1460oo0O00oo.OooO0O0(r8, r10)
            if (r8 != 0) goto Le7
        Ldf:
            boolean r7 = r7.OooO0O0(r10)
            if (r7 == 0) goto Le6
            goto Le7
        Le6:
            r0 = 0
        Le7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0809oO0OooOO.OooOoO(com.ninja.engine.oO0OO00O, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, com.ninja.engine.oo0O00oO] */
    public static boolean OooOoO0(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C1459oo0O00oO.OooO0Oo;
        C1459oo0O00oO c1459oo0O00oO = (C1459oo0O00oO) view.getTag(R.id.tag_unhandled_key_event_manager);
        C1459oo0O00oO c1459oo0O00oO2 = c1459oo0O00oO;
        if (c1459oo0O00oO == null) {
            Object obj = new Object();
            obj.OooO00o = null;
            obj.OooO0O0 = null;
            obj.OooO0OO = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            c1459oo0O00oO2 = (C1459oo0O00oO) obj;
        }
        WeakReference weakReference2 = c1459oo0O00oO2.OooO0OO;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c1459oo0O00oO2.OooO0OO = new WeakReference(keyEvent);
        if (c1459oo0O00oO2.OooO0O0 == null) {
            c1459oo0O00oO2.OooO0O0 = new SparseArray();
        }
        SparseArray sparseArray = c1459oo0O00oO2.OooO0O0;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && view2.isAttachedToWindow() && (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) != null && (size = arrayList.size() - 1) >= 0) {
            AbstractC1230oOoOo0o.OooOO0O(arrayList.get(size));
            throw null;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, com.ninja.engine.oo0OOOoo] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static C1501oo0OOOoo OooOoOO(C0316o0O0o0o c0316o0O0o0o, int i, ArrayList arrayList, C1501oo0OOOoo c1501oo0OOOoo) {
        int i2;
        C0304o0O0OoO c0304o0O0OoO;
        int i3;
        if (i == 0) {
            i2 = c0316o0O0o0o.o00Oo0;
        } else {
            i2 = c0316o0O0o0o.o00Ooo;
        }
        int i4 = 0;
        if (i2 != -1 && (c1501oo0OOOoo == 0 || i2 != c1501oo0OOOoo.OooO0O0)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C1501oo0OOOoo c1501oo0OOOoo2 = (C1501oo0OOOoo) arrayList.get(i5);
                if (c1501oo0OOOoo2.OooO0O0 == i2) {
                    if (c1501oo0OOOoo != 0) {
                        c1501oo0OOOoo.OooO0OO(i, c1501oo0OOOoo2);
                        arrayList.remove(c1501oo0OOOoo);
                    }
                    c1501oo0OOOoo = c1501oo0OOOoo2;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return c1501oo0OOOoo;
        }
        C1501oo0OOOoo c1501oo0OOOoo3 = c1501oo0OOOoo;
        if (c1501oo0OOOoo == null) {
            if (c0316o0O0o0o instanceof AbstractC0705oO000o0o) {
                AbstractC0705oO000o0o abstractC0705oO000o0o = (AbstractC0705oO000o0o) c0316o0O0o0o;
                int i6 = 0;
                while (true) {
                    if (i6 < abstractC0705oO000o0o.oo000o) {
                        C0316o0O0o0o c0316o0O0o0o2 = abstractC0705oO000o0o.o00ooo[i6];
                        if ((i == 0 && (i3 = c0316o0O0o0o2.o00Oo0) != -1) || (i == 1 && (i3 = c0316o0O0o0o2.o00Ooo) != -1)) {
                            break;
                        }
                        i6++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C1501oo0OOOoo c1501oo0OOOoo4 = (C1501oo0OOOoo) arrayList.get(i7);
                        if (c1501oo0OOOoo4.OooO0O0 == i3) {
                            c1501oo0OOOoo = c1501oo0OOOoo4;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (c1501oo0OOOoo == 0) {
                c1501oo0OOOoo = new C1501oo0OOOoo();
                c1501oo0OOOoo.OooO00o = new ArrayList();
                c1501oo0OOOoo.OooO0Oo = null;
                c1501oo0OOOoo.OooO0o0 = -1;
                int i8 = C1501oo0OOOoo.OooO0o;
                C1501oo0OOOoo.OooO0o = i8 + 1;
                c1501oo0OOOoo.OooO0O0 = i8;
                c1501oo0OOOoo.OooO0OO = i;
            }
            arrayList.add(c1501oo0OOOoo);
            c1501oo0OOOoo3 = c1501oo0OOOoo;
        }
        ArrayList arrayList2 = c1501oo0OOOoo3.OooO00o;
        if (!arrayList2.contains(c0316o0O0o0o)) {
            arrayList2.add(c0316o0O0o0o);
            if (c0316o0O0o0o instanceof C0699oO0000oo) {
                C0699oO0000oo c0699oO0000oo = (C0699oO0000oo) c0316o0O0o0o;
                C0304o0O0OoO c0304o0O0OoO2 = c0699oO0000oo.o00oO0O;
                if (c0699oO0000oo.o0ooOO0 == 0) {
                    i4 = 1;
                }
                c0304o0O0OoO2.OooO0OO(i4, c1501oo0OOOoo3, arrayList);
            }
            int i9 = c1501oo0OOOoo3.OooO0O0;
            if (i == 0) {
                c0316o0O0o0o.o00Oo0 = i9;
                c0316o0O0o0o.Oooo0.OooO0OO(i, c1501oo0OOOoo3, arrayList);
                c0304o0O0OoO = c0316o0O0o0o.Oooo0OO;
            } else {
                c0316o0O0o0o.o00Ooo = i9;
                c0316o0O0o0o.Oooo0O0.OooO0OO(i, c1501oo0OOOoo3, arrayList);
                c0316o0O0o0o.Oooo0o.OooO0OO(i, c1501oo0OOOoo3, arrayList);
                c0304o0O0OoO = c0316o0O0o0o.Oooo0o0;
            }
            c0304o0O0OoO.OooO0OO(i, c1501oo0OOOoo3, arrayList);
            c0316o0O0o0o.Oooo.OooO0OO(i, c1501oo0OOOoo3, arrayList);
        }
        return c1501oo0OOOoo3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r5.OooO0OO == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList OooOoo(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            com.ninja.engine.oOOooo r1 = new com.ninja.engine.oOOooo
            r1.<init>(r0, r8)
            java.lang.Object r2 = com.ninja.engine.AbstractC1139oOOoooOO.OooO0OO
            monitor-enter(r2)
            java.util.WeakHashMap r3 = com.ninja.engine.AbstractC1139oOOoooOO.OooO0O0     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = (Object) r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = (Object) r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            com.ninja.engine.oOOooo0o r5 = (com.ninja.engine.C1136oOOooo0o) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.OooO0O0     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.OooO0OO     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L96
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.OooO0OO     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.OooO00o     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            goto L95
        L54:
            java.lang.ThreadLocal r2 = com.ninja.engine.AbstractC1139oOOoooOO.OooO00o
            java.lang.Object r3 = (Object) r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L7f
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = com.ninja.engine.AbstractC0641o0ooO.OooO00o(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L7f
        L7e:
        L7f:
            if (r4 == 0) goto L86
            com.ninja.engine.AbstractC1139oOOoooOO.OooO00o(r1, r9, r4, r8)
            r3 = r4
            goto L95
        L86:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L91
            android.content.res.ColorStateList r3 = com.ninja.engine.AbstractC0121o000oooo.OooO0Oo(r9, r8, r0)
            goto L95
        L91:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r9)
        L95:
            return r3
        L96:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0809oO0OooOO.OooOoo(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static int OooOoo0(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0121o000oooo.OooO0OO(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static ColorStateList OooOooO(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList OooOoo;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (OooOoo = OooOoo(context, resourceId)) != null) {
            return OooOoo;
        }
        return typedArray.getColorStateList(i);
    }

    public static ColorStateList OooOooo(Context context, C0131o00O0o c0131o00O0o, int i) {
        int resourceId;
        ColorStateList OooOoo;
        TypedArray typedArray = (TypedArray) c0131o00O0o.OooO0O0;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (OooOoo = OooOoo(context, resourceId)) != null) {
            return OooOoo;
        }
        return c0131o00O0o.OooOo0O(i);
    }

    public static boolean Oooo(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static float Oooo0(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static int Oooo000(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    public static Drawable Oooo00O(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable OooOo0;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (OooOo0 = AbstractC0692o0ooooOo.OooOo0(context, resourceId)) != null) {
            return OooOo0;
        }
        return typedArray.getDrawable(i);
    }

    public static int Oooo00o(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0121o000oooo.OooO0o(drawable);
        }
        if (!OooOOOo) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                OooOOOO = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            OooOOOo = true;
        }
        Method method = OooOOOO;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception unused2) {
                OooOOOO = null;
                return 0;
            }
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.animation.TypeEvaluator, java.lang.Object] */
    public static PropertyValuesHolder Oooo0O0(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        o00OO00O o00oo00o;
        int i6;
        int i7;
        int i8;
        float f;
        PropertyValuesHolder ofFloat;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            if ((z && Oooo0oo(i4)) || (z2 && Oooo0oo(i5))) {
                i = 3;
            } else {
                i = 0;
            }
        }
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0989oOOO0oo0[] OooOOOO2 = AbstractC0694o0ooooo0.OooOOOO(string);
            C0989oOOO0oo0[] OooOOOO3 = AbstractC0694o0ooooo0.OooOOOO(string2);
            if (OooOOOO2 == null && OooOOOO3 == null) {
                return null;
            }
            if (OooOOOO2 != null) {
                Object obj = new Object();
                if (OooOOOO3 != null) {
                    if (AbstractC0694o0ooooo0.OooO0o(OooOOOO2, OooOOOO3)) {
                        ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, OooOOOO2, OooOOOO3);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, OooOOOO2);
                }
                return ofObject;
            } else if (OooOOOO3 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), OooOOOO3);
            }
        }
        if (i == 3) {
            o00oo00o = o00OO00O.OooO00o;
        } else {
            o00oo00o = null;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i5 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i5 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i4 == 5) {
                i7 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (Oooo0oo(i4)) {
                i7 = typedArray.getColor(i2, 0);
            } else {
                i7 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    i8 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (Oooo0oo(i5)) {
                    i8 = typedArray.getColor(i3, 0);
                } else {
                    i8 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i7, i8);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i7);
            }
        } else if (z2) {
            if (i5 == 5) {
                i6 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (Oooo0oo(i5)) {
                i6 = typedArray.getColor(i3, 0);
            } else {
                i6 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i6);
        }
        if (propertyValuesHolder != null && o00oo00o != null) {
            propertyValuesHolder.setEvaluator(o00oo00o);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public static final int Oooo0o(C1446oo0O c1446oo0O, Object obj, int i) {
        OooOOOo(c1446oo0O, "<this>");
        int i2 = c1446oo0O.OooO0OO;
        if (i2 == 0) {
            return -1;
        }
        try {
            int OooO0Oo2 = AbstractC0694o0ooooo0.OooO0Oo(c1446oo0O.OooO0OO, i, c1446oo0O.OooO00o);
            if (OooO0Oo2 < 0) {
                return OooO0Oo2;
            }
            if (OooO0o0(obj, c1446oo0O.OooO0O0[OooO0Oo2])) {
                return OooO0Oo2;
            }
            int i3 = OooO0Oo2 + 1;
            while (i3 < i2 && c1446oo0O.OooO00o[i3] == i) {
                if (OooO0o0(obj, c1446oo0O.OooO0O0[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = OooO0Oo2 - 1; i4 >= 0 && c1446oo0O.OooO00o[i4] == i; i4--) {
                if (OooO0o0(obj, c1446oo0O.OooO0O0[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [com.ninja.engine.o00o00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.ninja.engine.o00o00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.ninja.engine.o00o00, java.lang.Object] */
    public static void Oooo0o0(int i, o0O0o000 o0o0o000, C0316o0O0o0o c0316o0O0o0o, boolean z) {
        boolean z2;
        C0304o0O0OoO c0304o0O0OoO;
        C0304o0O0OoO c0304o0O0OoO2;
        boolean z3;
        C0304o0O0OoO c0304o0O0OoO3;
        C0304o0O0OoO c0304o0O0OoO4;
        if (c0316o0O0o0o.OooOOO0) {
            return;
        }
        if (!(c0316o0O0o0o instanceof C0580o0oOo0O0) && c0316o0O0o0o.OooOoO() && OooO0o(c0316o0O0o0o)) {
            C0580o0oOo0O0.o000oOoO(c0316o0O0o0o, o0o0o000, new C0189o00o00());
        }
        C0304o0O0OoO OooO2 = c0316o0O0o0o.OooO(2);
        C0304o0O0OoO OooO3 = c0316o0O0o0o.OooO(4);
        int OooO0Oo2 = OooO2.OooO0Oo();
        int OooO0Oo3 = OooO3.OooO0Oo();
        HashSet hashSet = OooO2.OooO00o;
        char c = 0;
        if (hashSet != null && OooO2.OooO0OO) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0304o0O0OoO c0304o0O0OoO5 = (C0304o0O0OoO) it.next();
                C0316o0O0o0o c0316o0O0o0o2 = c0304o0O0OoO5.OooO0Oo;
                int i2 = i + 1;
                boolean OooO0o2 = OooO0o(c0316o0O0o0o2);
                if (c0316o0O0o0o2.OooOoO() && OooO0o2) {
                    C0580o0oOo0O0.o000oOoO(c0316o0O0o0o2, o0o0o000, new C0189o00o00());
                }
                C0304o0O0OoO c0304o0O0OoO6 = c0316o0O0o0o2.Oooo0;
                C0304o0O0OoO c0304o0O0OoO7 = c0316o0O0o0o2.Oooo0OO;
                if ((c0304o0O0OoO5 == c0304o0O0OoO6 && (c0304o0O0OoO4 = c0304o0O0OoO7.OooO0o) != null && c0304o0O0OoO4.OooO0OO) || (c0304o0O0OoO5 == c0304o0O0OoO7 && (c0304o0O0OoO3 = c0304o0O0OoO6.OooO0o) != null && c0304o0O0OoO3.OooO0OO)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i3 = c0316o0O0o0o2.o00o0O[c];
                if (i3 == 3 && !OooO0o2) {
                    if (i3 == 3 && c0316o0O0o0o2.OooOo0O >= 0 && c0316o0O0o0o2.OooOo0 >= 0 && ((c0316o0O0o0o2.Oooooo0 == 8 || (c0316o0O0o0o2.OooOOo == 0 && c0316o0O0o0o2.OoooOOO == 0.0f)) && !c0316o0O0o0o2.OooOo() && !c0316o0O0o0o2.Oooo000 && z3 && !c0316o0O0o0o2.OooOo())) {
                        o00o0O(i2, c0316o0O0o0o, o0o0o000, c0316o0O0o0o2, z);
                    }
                } else if (!c0316o0O0o0o2.OooOoO()) {
                    if (c0304o0O0OoO5 == c0304o0O0OoO6 && c0304o0O0OoO7.OooO0o == null) {
                        int OooO0o02 = c0304o0O0OoO6.OooO0o0() + OooO0Oo2;
                        c0316o0O0o0o2.Oooo0O0(OooO0o02, c0316o0O0o0o2.OooOOo0() + OooO0o02);
                    } else if (c0304o0O0OoO5 == c0304o0O0OoO7 && c0304o0O0OoO6.OooO0o == null) {
                        int OooO0o03 = OooO0Oo2 - c0304o0O0OoO7.OooO0o0();
                        c0316o0O0o0o2.Oooo0O0(OooO0o03 - c0316o0O0o0o2.OooOOo0(), OooO0o03);
                    } else if (z3 && !c0316o0O0o0o2.OooOo()) {
                        o00Ooo(i2, o0o0o000, c0316o0O0o0o2, z);
                    }
                    Oooo0o0(i2, o0o0o000, c0316o0O0o0o2, z);
                }
                c = 0;
            }
        }
        if (c0316o0O0o0o instanceof C0699oO0000oo) {
            return;
        }
        HashSet hashSet2 = OooO3.OooO00o;
        if (hashSet2 != null && OooO3.OooO0OO) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0304o0O0OoO c0304o0O0OoO8 = (C0304o0O0OoO) it2.next();
                C0316o0O0o0o c0316o0O0o0o3 = c0304o0O0OoO8.OooO0Oo;
                int i4 = i + 1;
                boolean OooO0o3 = OooO0o(c0316o0O0o0o3);
                if (c0316o0O0o0o3.OooOoO() && OooO0o3) {
                    C0580o0oOo0O0.o000oOoO(c0316o0O0o0o3, o0o0o000, new C0189o00o00());
                }
                C0304o0O0OoO c0304o0O0OoO9 = c0316o0O0o0o3.Oooo0;
                C0304o0O0OoO c0304o0O0OoO10 = c0316o0O0o0o3.Oooo0OO;
                if ((c0304o0O0OoO8 == c0304o0O0OoO9 && (c0304o0O0OoO2 = c0304o0O0OoO10.OooO0o) != null && c0304o0O0OoO2.OooO0OO) || (c0304o0O0OoO8 == c0304o0O0OoO10 && (c0304o0O0OoO = c0304o0O0OoO9.OooO0o) != null && c0304o0O0OoO.OooO0OO)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i5 = c0316o0O0o0o3.o00o0O[0];
                if (i5 == 3 && !OooO0o3) {
                    if (i5 == 3 && c0316o0O0o0o3.OooOo0O >= 0 && c0316o0O0o0o3.OooOo0 >= 0) {
                        if (c0316o0O0o0o3.Oooooo0 != 8) {
                            if (c0316o0O0o0o3.OooOOo == 0) {
                                if (c0316o0O0o0o3.OoooOOO == 0.0f) {
                                }
                            }
                        }
                        if (!c0316o0O0o0o3.OooOo() && !c0316o0O0o0o3.Oooo000 && z2 && !c0316o0O0o0o3.OooOo()) {
                            o00o0O(i4, c0316o0O0o0o, o0o0o000, c0316o0O0o0o3, z);
                        }
                    }
                } else if (!c0316o0O0o0o3.OooOoO()) {
                    if (c0304o0O0OoO8 == c0304o0O0OoO9 && c0304o0O0OoO10.OooO0o == null) {
                        int OooO0o04 = c0304o0O0OoO9.OooO0o0() + OooO0Oo3;
                        c0316o0O0o0o3.Oooo0O0(OooO0o04, c0316o0O0o0o3.OooOOo0() + OooO0o04);
                    } else if (c0304o0O0OoO8 == c0304o0O0OoO10 && c0304o0O0OoO9.OooO0o == null) {
                        int OooO0o05 = OooO0Oo3 - c0304o0O0OoO10.OooO0o0();
                        c0316o0O0o0o3.Oooo0O0(OooO0o05 - c0316o0O0o0o3.OooOOo0(), OooO0o05);
                    } else if (z2 && !c0316o0O0o0o3.OooOo()) {
                        o00Ooo(i4, o0o0o000, c0316o0O0o0o3, z);
                    }
                    Oooo0o0(i4, o0o0o000, c0316o0O0o0o3, z);
                }
            }
        }
        c0316o0O0o0o.OooOOO0 = true;
    }

    public static int Oooo0oO(float f) {
        float f2;
        boolean z;
        float f3;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f4 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = f / 903.2963f;
        }
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = OooO0OO;
        return o0O0OO0.OooO00o(f3 * fArr[0], f2 * fArr[1], f5 * fArr[2]);
    }

    public static boolean Oooo0oo(int i) {
        if (i >= 28 && i <= 31) {
            return true;
        }
        return false;
    }

    public static void OoooO(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static float OoooO0(int i) {
        float pow;
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static boolean OoooO00(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static ValueAnimator OoooO0O(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        int i = 0;
        int i2 = 1;
        TypedArray OooO2 = AbstractC1137oOOoooO.OooO(resources, theme, attributeSet, AbstractC0692o0ooooOo.OooO0oO);
        TypedArray OooO3 = AbstractC1137oOOoooO.OooO(resources, theme, attributeSet, AbstractC0692o0ooooOo.OooOO0O);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j = AbstractC1137oOOoooO.OooO0oO(xmlResourceParser, "duration") ? OooO2.getInt(1, 300) : 300;
        long j2 = !AbstractC1137oOOoooO.OooO0oO(xmlResourceParser, "startOffset") ? 0 : OooO2.getInt(2, 0);
        int i3 = !AbstractC1137oOOoooO.OooO0oO(xmlResourceParser, "valueType") ? 4 : OooO2.getInt(7, 4);
        if (AbstractC1137oOOoooO.OooO0oO(xmlResourceParser, "valueFrom") && AbstractC1137oOOoooO.OooO0oO(xmlResourceParser, "valueTo")) {
            if (i3 == 4) {
                TypedValue peekValue = OooO2.peekValue(5);
                boolean z = peekValue != null;
                int i4 = z ? peekValue.type : 0;
                TypedValue peekValue2 = OooO2.peekValue(6);
                boolean z2 = peekValue2 != null;
                i3 = ((z && Oooo0oo(i4)) || (z2 && Oooo0oo(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder Oooo0O0 = Oooo0O0(OooO2, i3, 5, 6, "");
            if (Oooo0O0 != null) {
                valueAnimator3.setValues(Oooo0O0);
            }
        }
        valueAnimator3.setDuration(j);
        valueAnimator3.setStartDelay(j2);
        valueAnimator3.setRepeatCount(!AbstractC1137oOOoooO.OooO0oO(xmlResourceParser, "repeatCount") ? 0 : OooO2.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC1137oOOoooO.OooO0oO(xmlResourceParser, "repeatMode") ? 1 : OooO2.getInt(4, 1));
        if (OooO3 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String OooO0o2 = AbstractC1137oOOoooO.OooO0o(OooO3, xmlResourceParser, "pathData", 1);
            if (OooO0o2 != null) {
                String OooO0o3 = AbstractC1137oOOoooO.OooO0o(OooO3, xmlResourceParser, "propertyXName", 2);
                String OooO0o4 = AbstractC1137oOOoooO.OooO0o(OooO3, xmlResourceParser, "propertyYName", 3);
                if (OooO0o3 == null && OooO0o4 == null) {
                    throw new InflateException(OooO3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path OooOOOo2 = AbstractC0694o0ooooo0.OooOOOo(OooO0o2);
                PathMeasure pathMeasure = new PathMeasure(OooOOOo2, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                while (true) {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                    i2 = 1;
                }
                PathMeasure pathMeasure2 = new PathMeasure(OooOOOo2, false);
                int min = Math.min(100, ((int) (f / 0.5f)) + i2);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / (min - 1);
                valueAnimator = valueAnimator3;
                typedArray = OooO2;
                int i5 = 0;
                int i6 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i6 >= min) {
                        break;
                    }
                    int i7 = min;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                    fArr[i6] = fArr3[0];
                    fArr2[i6] = fArr3[1];
                    f3 += f2;
                    int i8 = i5 + 1;
                    if (i8 < arrayList.size() && f3 > ((Float) arrayList.get(i8)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i8;
                    }
                    i6++;
                    min = i7;
                }
                PropertyValuesHolder ofFloat = OooO0o3 != null ? PropertyValuesHolder.ofFloat(OooO0o3, fArr) : null;
                PropertyValuesHolder ofFloat2 = OooO0o4 != null ? PropertyValuesHolder.ofFloat(OooO0o4, fArr2) : null;
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator2.setValues(ofFloat2);
                } else {
                    i = 0;
                    if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = OooO2;
                objectAnimator2.setPropertyName(AbstractC1137oOOoooO.OooO0o(OooO3, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = OooO2;
        }
        if (AbstractC1137oOOoooO.OooO0oO(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        } else {
            typedArray2 = typedArray;
        }
        if (i > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, i));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (OooO3 != null) {
            OooO3.recycle();
        }
        return valueAnimator2;
    }

    public static void OoooOO0(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static byte[] OoooOoo(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(AbstractC1230oOoOo0o.OooO0o(i, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] Ooooo00(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0809oO0OooOO.Ooooo00(java.io.FileInputStream, int, int):byte[]");
    }

    public static long Ooooo0o(InputStream inputStream, int i) {
        byte[] OoooOoo = OoooOoo(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (OoooOoo[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static void OooooO0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = o0ooOoO(drawable).mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static int OooooOO(Context context, int i, int i2) {
        TypedValue OoooOOO = AbstractC0692o0ooooOo.OoooOOO(context, i);
        if (OoooOOO != null && OoooOOO.type == 16) {
            return OoooOOO.data;
        }
        return i2;
    }

    public static TimeInterpolator OooooOo(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!OoooO00(valueOf, "cubic-bezier") && !OoooO00(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (OoooO00(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(Oooo0(split, 0), Oooo0(split, 1), Oooo0(split, 2), Oooo0(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (OoooO00(valueOf, "path")) {
                return new PathInterpolator(AbstractC0694o0ooooo0.OooOOOo(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static void Oooooo(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        z2 = (hasOnClickListeners || z) ? true : true;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static void Oooooo0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static boolean OoooooO(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0121o000oooo.OooOOo(drawable, i);
        }
        if (!OooOOO) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                OooOOO0 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            OooOOO = true;
        }
        Method method = OooOOO0;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                OooOOO0 = null;
            }
        }
        return false;
    }

    public static void Ooooooo(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void o00O0O(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static void o00Ooo(int i, o0O0o000 o0o0o000, C0316o0O0o0o c0316o0O0o0o, boolean z) {
        float f;
        float f2 = c0316o0O0o0o.OooooO0;
        C0304o0O0OoO c0304o0O0OoO = c0316o0O0o0o.Oooo0;
        int OooO0Oo2 = c0304o0O0OoO.OooO0o.OooO0Oo();
        C0304o0O0OoO c0304o0O0OoO2 = c0316o0O0o0o.Oooo0OO;
        int OooO0Oo3 = c0304o0O0OoO2.OooO0o.OooO0Oo();
        int OooO0o02 = c0304o0O0OoO.OooO0o0() + OooO0Oo2;
        int OooO0o03 = OooO0Oo3 - c0304o0O0OoO2.OooO0o0();
        if (OooO0Oo2 == OooO0Oo3) {
            f2 = 0.5f;
        } else {
            OooO0Oo2 = OooO0o02;
            OooO0Oo3 = OooO0o03;
        }
        int OooOOo02 = c0316o0O0o0o.OooOOo0();
        int i2 = (OooO0Oo3 - OooO0Oo2) - OooOOo02;
        if (OooO0Oo2 > OooO0Oo3) {
            i2 = (OooO0Oo2 - OooO0Oo3) - OooOOo02;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = ((int) f) + OooO0Oo2;
        int i4 = i3 + OooOOo02;
        if (OooO0Oo2 > OooO0Oo3) {
            i4 = i3 - OooOOo02;
        }
        c0316o0O0o0o.Oooo0O0(i3, i4);
        Oooo0o0(i + 1, o0o0o000, c0316o0O0o0o, z);
    }

    public static void o00o0O(int i, C0316o0O0o0o c0316o0O0o0o, o0O0o000 o0o0o000, C0316o0O0o0o c0316o0O0o0o2, boolean z) {
        float f = c0316o0O0o0o2.OooooO0;
        C0304o0O0OoO c0304o0O0OoO = c0316o0O0o0o2.Oooo0;
        int OooO0o02 = c0304o0O0OoO.OooO0o0() + c0304o0O0OoO.OooO0o.OooO0Oo();
        C0304o0O0OoO c0304o0O0OoO2 = c0316o0O0o0o2.Oooo0OO;
        int OooO0Oo2 = c0304o0O0OoO2.OooO0o.OooO0Oo() - c0304o0O0OoO2.OooO0o0();
        if (OooO0Oo2 >= OooO0o02) {
            int OooOOo02 = c0316o0O0o0o2.OooOOo0();
            if (c0316o0O0o0o2.Oooooo0 != 8) {
                int i2 = c0316o0O0o0o2.OooOOo;
                if (i2 == 2) {
                    if (!(c0316o0O0o0o instanceof C0580o0oOo0O0)) {
                        c0316o0O0o0o = c0316o0O0o0o.OoooO;
                    }
                    OooOOo02 = (int) (c0316o0O0o0o2.OooooO0 * 0.5f * c0316o0O0o0o.OooOOo0());
                } else if (i2 == 0) {
                    OooOOo02 = OooO0Oo2 - OooO0o02;
                }
                OooOOo02 = Math.max(c0316o0O0o0o2.OooOo0, OooOOo02);
                int i3 = c0316o0O0o0o2.OooOo0O;
                if (i3 > 0) {
                    OooOOo02 = Math.min(i3, OooOOo02);
                }
            }
            int i4 = OooO0o02 + ((int) ((f * ((OooO0Oo2 - OooO0o02) - OooOOo02)) + 0.5f));
            c0316o0O0o0o2.Oooo0O0(i4, OooOOo02 + i4);
            Oooo0o0(i + 1, o0o0o000, c0316o0O0o0o2, z);
        }
    }

    public static int o00oO0O(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void o00oO0o(String str) {
        RuntimeException runtimeException = new RuntimeException(AbstractC1230oOoOo0o.OooO0oo("lateinit property ", str, " has not been initialized"));
        Oooooo0(runtimeException, AbstractC0809oO0OooOO.class.getName());
        throw runtimeException;
    }

    public static void o00ooo(int i, o0O0o000 o0o0o000, C0316o0O0o0o c0316o0O0o0o) {
        float f;
        float f2 = c0316o0O0o0o.OooooOO;
        C0304o0O0OoO c0304o0O0OoO = c0316o0O0o0o.Oooo0O0;
        int OooO0Oo2 = c0304o0O0OoO.OooO0o.OooO0Oo();
        C0304o0O0OoO c0304o0O0OoO2 = c0316o0O0o0o.Oooo0o0;
        int OooO0Oo3 = c0304o0O0OoO2.OooO0o.OooO0Oo();
        int OooO0o02 = c0304o0O0OoO.OooO0o0() + OooO0Oo2;
        int OooO0o03 = OooO0Oo3 - c0304o0O0OoO2.OooO0o0();
        if (OooO0Oo2 == OooO0Oo3) {
            f2 = 0.5f;
        } else {
            OooO0Oo2 = OooO0o02;
            OooO0Oo3 = OooO0o03;
        }
        int OooOO0O2 = c0316o0O0o0o.OooOO0O();
        int i2 = (OooO0Oo3 - OooO0Oo2) - OooOO0O2;
        if (OooO0Oo2 > OooO0Oo3) {
            i2 = (OooO0Oo2 - OooO0Oo3) - OooOO0O2;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = (int) f;
        int i4 = OooO0Oo2 + i3;
        int i5 = i4 + OooOO0O2;
        if (OooO0Oo2 > OooO0Oo3) {
            i4 = OooO0Oo2 - i3;
            i5 = i4 - OooOO0O2;
        }
        c0316o0O0o0o.Oooo0OO(i4, i5);
        o0ooOOo(i + 1, o0o0o000, c0316o0O0o0o);
    }

    public static void o0OO00O(ByteArrayOutputStream byteArrayOutputStream, int i) {
        o0Oo0oo(byteArrayOutputStream, i, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o0OOO0o(android.content.Context r16, java.util.concurrent.Executor r17, com.ninja.engine.InterfaceC1004oOOOOo0o r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0809oO0OooOO.o0OOO0o(android.content.Context, java.util.concurrent.Executor, com.ninja.engine.oOOOOo0o, boolean):void");
    }

    public static void o0Oo0oo(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void o0OoOo0(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static boolean o0ooOO0(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        if (i3 != 1 && i3 != 2 && (i3 != 4 || i == 2)) {
            z = false;
        } else {
            z = true;
        }
        if (i4 != 1 && i4 != 2 && (i4 != 4 || i2 == 2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [com.ninja.engine.o00o00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.ninja.engine.o00o00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.ninja.engine.o00o00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.ninja.engine.o00o00, java.lang.Object] */
    public static void o0ooOOo(int i, o0O0o000 o0o0o000, C0316o0O0o0o c0316o0O0o0o) {
        C0304o0O0OoO c0304o0O0OoO;
        boolean z;
        C0304o0O0OoO c0304o0O0OoO2;
        C0304o0O0OoO c0304o0O0OoO3;
        boolean z2;
        C0304o0O0OoO c0304o0O0OoO4;
        C0304o0O0OoO c0304o0O0OoO5;
        if (c0316o0O0o0o.OooOOO) {
            return;
        }
        if (!(c0316o0O0o0o instanceof C0580o0oOo0O0) && c0316o0O0o0o.OooOoO() && OooO0o(c0316o0O0o0o)) {
            C0580o0oOo0O0.o000oOoO(c0316o0O0o0o, o0o0o000, new C0189o00o00());
        }
        C0304o0O0OoO OooO2 = c0316o0O0o0o.OooO(3);
        C0304o0O0OoO OooO3 = c0316o0O0o0o.OooO(5);
        int OooO0Oo2 = OooO2.OooO0Oo();
        int OooO0Oo3 = OooO3.OooO0Oo();
        HashSet hashSet = OooO2.OooO00o;
        if (hashSet != null && OooO2.OooO0OO) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0304o0O0OoO c0304o0O0OoO6 = (C0304o0O0OoO) it.next();
                C0316o0O0o0o c0316o0O0o0o2 = c0304o0O0OoO6.OooO0Oo;
                int i2 = i + 1;
                boolean OooO0o2 = OooO0o(c0316o0O0o0o2);
                if (c0316o0O0o0o2.OooOoO() && OooO0o2) {
                    C0580o0oOo0O0.o000oOoO(c0316o0O0o0o2, o0o0o000, new C0189o00o00());
                }
                C0304o0O0OoO c0304o0O0OoO7 = c0316o0O0o0o2.Oooo0O0;
                C0304o0O0OoO c0304o0O0OoO8 = c0316o0O0o0o2.Oooo0o0;
                if ((c0304o0O0OoO6 == c0304o0O0OoO7 && (c0304o0O0OoO5 = c0304o0O0OoO8.OooO0o) != null && c0304o0O0OoO5.OooO0OO) || (c0304o0O0OoO6 == c0304o0O0OoO8 && (c0304o0O0OoO4 = c0304o0O0OoO7.OooO0o) != null && c0304o0O0OoO4.OooO0OO)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = c0316o0O0o0o2.o00o0O[1];
                if (i3 == 3 && !OooO0o2) {
                    if (i3 == 3 && c0316o0O0o0o2.OooOoO0 >= 0 && c0316o0O0o0o2.OooOo >= 0 && (c0316o0O0o0o2.Oooooo0 == 8 || (c0316o0O0o0o2.OooOOoo == 0 && c0316o0O0o0o2.OoooOOO == 0.0f))) {
                        if (!c0316o0O0o0o2.OooOoO0() && !c0316o0O0o0o2.Oooo000 && z2 && !c0316o0O0o0o2.OooOoO0()) {
                            oo000o(i2, c0316o0O0o0o, o0o0o000, c0316o0O0o0o2);
                        }
                    }
                } else if (!c0316o0O0o0o2.OooOoO()) {
                    if (c0304o0O0OoO6 == c0304o0O0OoO7 && c0304o0O0OoO8.OooO0o == null) {
                        int OooO0o02 = c0304o0O0OoO7.OooO0o0() + OooO0Oo2;
                        c0316o0O0o0o2.Oooo0OO(OooO0o02, c0316o0O0o0o2.OooOO0O() + OooO0o02);
                    } else if (c0304o0O0OoO6 == c0304o0O0OoO8 && c0304o0O0OoO7.OooO0o == null) {
                        int OooO0o03 = OooO0Oo2 - c0304o0O0OoO8.OooO0o0();
                        c0316o0O0o0o2.Oooo0OO(OooO0o03 - c0316o0O0o0o2.OooOO0O(), OooO0o03);
                    } else if (z2 && !c0316o0O0o0o2.OooOoO0()) {
                        o00ooo(i2, o0o0o000, c0316o0O0o0o2);
                    }
                    o0ooOOo(i2, o0o0o000, c0316o0O0o0o2);
                }
            }
        }
        if (c0316o0O0o0o instanceof C0699oO0000oo) {
            return;
        }
        HashSet hashSet2 = OooO3.OooO00o;
        if (hashSet2 != null && OooO3.OooO0OO) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0304o0O0OoO c0304o0O0OoO9 = (C0304o0O0OoO) it2.next();
                C0316o0O0o0o c0316o0O0o0o3 = c0304o0O0OoO9.OooO0Oo;
                int i4 = i + 1;
                boolean OooO0o3 = OooO0o(c0316o0O0o0o3);
                if (c0316o0O0o0o3.OooOoO() && OooO0o3) {
                    C0580o0oOo0O0.o000oOoO(c0316o0O0o0o3, o0o0o000, new C0189o00o00());
                }
                C0304o0O0OoO c0304o0O0OoO10 = c0316o0O0o0o3.Oooo0O0;
                C0304o0O0OoO c0304o0O0OoO11 = c0316o0O0o0o3.Oooo0o0;
                if ((c0304o0O0OoO9 == c0304o0O0OoO10 && (c0304o0O0OoO3 = c0304o0O0OoO11.OooO0o) != null && c0304o0O0OoO3.OooO0OO) || (c0304o0O0OoO9 == c0304o0O0OoO11 && (c0304o0O0OoO2 = c0304o0O0OoO10.OooO0o) != null && c0304o0O0OoO2.OooO0OO)) {
                    z = true;
                } else {
                    z = false;
                }
                int i5 = c0316o0O0o0o3.o00o0O[1];
                if (i5 == 3 && !OooO0o3) {
                    if (i5 == 3 && c0316o0O0o0o3.OooOoO0 >= 0 && c0316o0O0o0o3.OooOo >= 0) {
                        if (c0316o0O0o0o3.Oooooo0 != 8) {
                            if (c0316o0O0o0o3.OooOOoo == 0) {
                                if (c0316o0O0o0o3.OoooOOO == 0.0f) {
                                }
                            }
                        }
                        if (!c0316o0O0o0o3.OooOoO0() && !c0316o0O0o0o3.Oooo000 && z && !c0316o0O0o0o3.OooOoO0()) {
                            oo000o(i4, c0316o0O0o0o, o0o0o000, c0316o0O0o0o3);
                        }
                    }
                } else if (!c0316o0O0o0o3.OooOoO()) {
                    if (c0304o0O0OoO9 == c0304o0O0OoO10 && c0304o0O0OoO11.OooO0o == null) {
                        int OooO0o04 = c0304o0O0OoO10.OooO0o0() + OooO0Oo3;
                        c0316o0O0o0o3.Oooo0OO(OooO0o04, c0316o0O0o0o3.OooOO0O() + OooO0o04);
                    } else if (c0304o0O0OoO9 == c0304o0O0OoO11 && c0304o0O0OoO10.OooO0o == null) {
                        int OooO0o05 = OooO0Oo3 - c0304o0O0OoO11.OooO0o0();
                        c0316o0O0o0o3.Oooo0OO(OooO0o05 - c0316o0O0o0o3.OooOO0O(), OooO0o05);
                    } else if (z && !c0316o0O0o0o3.OooOoO0()) {
                        o00ooo(i4, o0o0o000, c0316o0O0o0o3);
                    }
                    o0ooOOo(i4, o0o0o000, c0316o0O0o0o3);
                }
            }
        }
        C0304o0O0OoO OooO4 = c0316o0O0o0o.OooO(6);
        if (OooO4.OooO00o != null && OooO4.OooO0OO) {
            int OooO0Oo4 = OooO4.OooO0Oo();
            Iterator it3 = OooO4.OooO00o.iterator();
            while (it3.hasNext()) {
                C0304o0O0OoO c0304o0O0OoO12 = (C0304o0O0OoO) it3.next();
                C0316o0O0o0o c0316o0O0o0o4 = c0304o0O0OoO12.OooO0Oo;
                int i6 = i + 1;
                boolean OooO0o4 = OooO0o(c0316o0O0o0o4);
                if (c0316o0O0o0o4.OooOoO() && OooO0o4) {
                    C0580o0oOo0O0.o000oOoO(c0316o0O0o0o4, o0o0o000, new C0189o00o00());
                }
                if (c0316o0O0o0o4.o00o0O[1] != 3 || OooO0o4) {
                    if (!c0316o0O0o0o4.OooOoO() && c0304o0O0OoO12 == (c0304o0O0OoO = c0316o0O0o0o4.Oooo0o)) {
                        int OooO0o06 = c0304o0O0OoO12.OooO0o0() + OooO0Oo4;
                        if (c0316o0O0o0o4.OooOooo) {
                            int i7 = OooO0o06 - c0316o0O0o0o4.OoooOoo;
                            int i8 = c0316o0O0o0o4.o000oOoO + i7;
                            c0316o0O0o0o4.OoooOoO = i7;
                            c0316o0O0o0o4.Oooo0O0.OooOO0o(i7);
                            c0316o0O0o0o4.Oooo0o0.OooOO0o(i8);
                            c0304o0O0OoO.OooOO0o(OooO0o06);
                            c0316o0O0o0o4.OooOO0o = true;
                        }
                        o0ooOOo(i6, o0o0o000, c0316o0O0o0o4);
                    }
                }
            }
        }
        c0316o0O0o0o.OooOOO = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable, com.ninja.engine.oo0Oooo0] */
    public static Drawable o0ooOoO(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof InterfaceC1317oOooOoo)) {
            Drawable drawable2 = new Drawable() {};
            drawable2.OooO0Oo = drawable2.OooO0O0();
            drawable2.OooO0oO(drawable);
            if (C1546oo0Oooo0.OooO0oo == null) {
                try {
                    C1546oo0Oooo0.OooO0oo = Drawable.class.getDeclaredMethod("isProjected", null);
                } catch (Exception unused) {
                }
            }
            return drawable2;
        }
        return drawable;
    }

    public static void oo000o(int i, C0316o0O0o0o c0316o0O0o0o, o0O0o000 o0o0o000, C0316o0O0o0o c0316o0O0o0o2) {
        float f = c0316o0O0o0o2.OooooOO;
        C0304o0O0OoO c0304o0O0OoO = c0316o0O0o0o2.Oooo0O0;
        int OooO0o02 = c0304o0O0OoO.OooO0o0() + c0304o0O0OoO.OooO0o.OooO0Oo();
        C0304o0O0OoO c0304o0O0OoO2 = c0316o0O0o0o2.Oooo0o0;
        int OooO0Oo2 = c0304o0O0OoO2.OooO0o.OooO0Oo() - c0304o0O0OoO2.OooO0o0();
        if (OooO0Oo2 >= OooO0o02) {
            int OooOO0O2 = c0316o0O0o0o2.OooOO0O();
            if (c0316o0O0o0o2.Oooooo0 != 8) {
                int i2 = c0316o0O0o0o2.OooOOoo;
                if (i2 == 2) {
                    if (!(c0316o0O0o0o instanceof C0580o0oOo0O0)) {
                        c0316o0O0o0o = c0316o0O0o0o.OoooO;
                    }
                    OooOO0O2 = (int) (f * 0.5f * c0316o0O0o0o.OooOO0O());
                } else if (i2 == 0) {
                    OooOO0O2 = OooO0Oo2 - OooO0o02;
                }
                OooOO0O2 = Math.max(c0316o0O0o0o2.OooOo, OooOO0O2);
                int i3 = c0316o0O0o0o2.OooOoO0;
                if (i3 > 0) {
                    OooOO0O2 = Math.min(i3, OooOO0O2);
                }
            }
            int i4 = OooO0o02 + ((int) ((f * ((OooO0Oo2 - OooO0o02) - OooOO0O2)) + 0.5f));
            c0316o0O0o0o2.Oooo0OO(i4, OooOO0O2 + i4);
            o0ooOOo(i + 1, o0o0o000, c0316o0O0o0o2);
        }
    }

    public static float oo0o0Oo() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static void ooOO(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public abstract boolean OooO(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, C0024OooOoO0 c0024OooOoO0, C0024OooOoO0 c0024OooOoO02);

    public abstract boolean OooO0oO(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, C0021OooOo0O c0021OooOo0O);

    public abstract boolean OooO0oo(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, Object obj, Object obj2);

    public abstract float Oooo0OO(Object obj);

    public abstract void OoooOOO(oOO00OOO ooo00ooo);

    public abstract Object OoooOOo(int i, Intent intent);

    public abstract void OoooOo0(C0024OooOoO0 c0024OooOoO0, C0024OooOoO0 c0024OooOoO02);

    public abstract void OoooOoO(C0024OooOoO0 c0024OooOoO0, Thread thread);

    public abstract void o000oOoO(Throwable th);

    public abstract void o00Oo0(Object obj, float f);
}




