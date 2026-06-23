package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.framework.utils.compat.AccountManagerCompat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.ninja.engine.o0O0o0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317o0O0o0o0 {
    public static final int[] OooO0Oo = {0, 4, 8};
    public static final SparseIntArray OooO0o;
    public static final SparseIntArray OooO0o0;
    public final HashMap OooO00o = new HashMap();
    public final boolean OooO0O0 = true;
    public final HashMap OooO0OO = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooO0o0 = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        OooO0o = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(AccountManagerCompat.ERROR_CODE_MANAGEMENT_DISABLED_FOR_ACCOUNT_TYPE, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(AccountManagerCompat.ERROR_CODE_MANAGEMENT_DISABLED_FOR_ACCOUNT_TYPE, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] OooO0OO(C0182o00OooO0 c0182o00OooO0, String str) {
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = c0182o00OooO0.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = AbstractC1029oOOOoOO0.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c0182o00OooO0.isInEditMode() && (c0182o00OooO0.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0182o00OooO0.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.OooOOO0) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.OooOOO0.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0491, code lost:
        if (r14.indexOf("/") > 0) goto L150;
     */
    /* JADX WARN: Type inference failed for: r14v91, types: [com.ninja.engine.o0O0o00O, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C0312o0O0o00o OooO0Oo(android.content.Context r16, android.util.AttributeSet r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 2594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0317o0O0o0o0.OooO0Oo(android.content.Context, android.util.AttributeSet, boolean):com.ninja.engine.o0O0o00o");
    }

    public static int OooO0o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r8 == (-1)) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0oO(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0317o0O0o0o0.OooO0oO(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void OooO0oo(C0309o0O0OooO c0309o0O0OooO, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c = 65535;
            int i = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c = 1;
                }
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0309o0O0OooO.Oooo00O = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.ninja.engine.o0O0Ooo0, com.ninja.engine.o00OooO0, android.view.View] */
    public final void OooO00o(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.OooO0OO;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else if (this.OooO0O0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0312o0O0o00o c0312o0O0o00o = (C0312o0O0o00o) hashMap.get(Integer.valueOf(id));
                    if (c0312o0O0o00o != null) {
                        if (childAt instanceof C0182o00OooO0) {
                            o0O0o0 o0o0o0 = c0312o0O0o00o.OooO0Oo;
                            o0o0o0.Oooooo = 1;
                            C0182o00OooO0 c0182o00OooO0 = (C0182o00OooO0) childAt;
                            c0182o00OooO0.setId(id);
                            c0182o00OooO0.setType(o0o0o0.OooooOo);
                            c0182o00OooO0.setMargin(o0o0o0.Oooooo0);
                            c0182o00OooO0.setAllowsGoneWidget(o0o0o0.o00Oo0);
                            int[] iArr = o0o0o0.OoooooO;
                            if (iArr != null) {
                                c0182o00OooO0.setReferencedIds(iArr);
                            } else {
                                String str = o0o0o0.Ooooooo;
                                if (str != null) {
                                    int[] OooO0OO = OooO0OO(c0182o00OooO0, str);
                                    o0o0o0.OoooooO = OooO0OO;
                                    c0182o00OooO0.setReferencedIds(OooO0OO);
                                }
                            }
                        }
                        C0309o0O0OooO c0309o0O0OooO = (C0309o0O0OooO) childAt.getLayoutParams();
                        c0309o0O0OooO.OooO00o();
                        c0312o0O0o00o.OooO00o(c0309o0O0OooO);
                        HashMap hashMap2 = c0312o0O0o00o.OooO0o;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : hashMap2.keySet()) {
                            C0306o0O0OoOo c0306o0O0OoOo = (C0306o0O0OoOo) hashMap2.get(str2);
                            if (!c0306o0O0OoOo.OooO00o) {
                                str2 = AbstractC1230oOoOo0o.OooOO0o("set", str2);
                            }
                            try {
                                switch (AbstractC1230oOoOo0o.OooOOOo(c0306o0O0OoOo.OooO0O0)) {
                                    case 0:
                                        Class<?>[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = Integer.TYPE;
                                            cls.getMethod(str2, clsArr).invoke(childAt, Integer.valueOf(c0306o0O0OoOo.OooO0OO));
                                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                                        }
                                    case 1:
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(c0306o0O0OoOo.OooO0Oo));
                                        break;
                                    case 2:
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(c0306o0O0OoOo.OooO0oO));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c0306o0O0OoOo.OooO0oO);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt, c0306o0O0OoOo.OooO0o0);
                                        break;
                                    case 5:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0306o0O0OoOo.OooO0o));
                                        break;
                                    case 6:
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(c0306o0O0OoOo.OooO0Oo));
                                        break;
                                    case 7:
                                        try {
                                            cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(c0306o0O0OoOo.OooO0OO));
                                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                                        }
                                        break;
                                }
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused4) {
                            }
                        }
                        childAt.setLayoutParams(c0309o0O0OooO);
                        C0314o0O0o0OO c0314o0O0o0OO = c0312o0O0o00o.OooO0O0;
                        if (c0314o0O0o0OO.OooO0O0 == 0) {
                            childAt.setVisibility(c0314o0O0o0OO.OooO00o);
                        }
                        childAt.setAlpha(c0314o0O0o0OO.OooO0OO);
                        C0315o0O0o0Oo c0315o0O0o0Oo = c0312o0O0o00o.OooO0o0;
                        childAt.setRotation(c0315o0O0o0Oo.OooO00o);
                        childAt.setRotationX(c0315o0O0o0Oo.OooO0O0);
                        childAt.setRotationY(c0315o0O0o0Oo.OooO0OO);
                        childAt.setScaleX(c0315o0O0o0Oo.OooO0Oo);
                        childAt.setScaleY(c0315o0O0o0Oo.OooO0o0);
                        if (c0315o0O0o0Oo.OooO0oo != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(c0315o0O0o0Oo.OooO0oo);
                            if (findViewById != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(c0315o0O0o0Oo.OooO0o)) {
                                childAt.setPivotX(c0315o0O0o0Oo.OooO0o);
                            }
                            if (!Float.isNaN(c0315o0O0o0Oo.OooO0oO)) {
                                childAt.setPivotY(c0315o0O0o0Oo.OooO0oO);
                            }
                        }
                        childAt.setTranslationX(c0315o0O0o0Oo.OooO);
                        childAt.setTranslationY(c0315o0O0o0Oo.OooOO0);
                        childAt.setTranslationZ(c0315o0O0o0Oo.OooOO0O);
                        if (c0315o0O0o0Oo.OooOO0o) {
                            childAt.setElevation(c0315o0O0o0Oo.OooOOO0);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0312o0O0o00o c0312o0O0o00o2 = (C0312o0O0o00o) hashMap.get(num);
            if (c0312o0O0o00o2 != null) {
                o0O0o0 o0o0o02 = c0312o0O0o00o2.OooO0Oo;
                if (o0o0o02.Oooooo == 1) {
                    Context context = constraintLayout.getContext();
                    View view = new View(context);
                    view.OooO00o = new int[32];
                    view.OooO0oO = new HashMap();
                    view.OooO0OO = context;
                    view.OooO0oO(null);
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = o0o0o02.OoooooO;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str3 = o0o0o02.Ooooooo;
                        if (str3 != null) {
                            int[] OooO0OO2 = OooO0OO(view, str3);
                            o0o0o02.OoooooO = OooO0OO2;
                            view.setReferencedIds(OooO0OO2);
                        }
                    }
                    view.setType(o0o0o02.OooooOo);
                    view.setMargin(o0o0o02.Oooooo0);
                    C0309o0O0OooO OooO0oO = ConstraintLayout.OooO0oO();
                    view.OooO();
                    c0312o0O0o00o2.OooO00o(OooO0oO);
                    constraintLayout.addView((View) view, OooO0oO);
                }
                if (o0o0o02.OooO00o) {
                    C0698oO0000oO c0698oO0000oO = new C0698oO0000oO(constraintLayout.getContext());
                    c0698oO0000oO.setId(num.intValue());
                    C0309o0O0OooO OooO0oO2 = ConstraintLayout.OooO0oO();
                    c0312o0O0o00o2.OooO00o(OooO0oO2);
                    constraintLayout.addView(c0698oO0000oO, OooO0oO2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof AbstractC0308o0O0Ooo0) {
                ((AbstractC0308o0O0Ooo0) childAt2).OooO0o0(constraintLayout);
            }
        }
    }

    public final void OooO0O0(ConstraintLayout constraintLayout) {
        C0317o0O0o0o0 c0317o0O0o0o0 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c0317o0O0o0o0.OooO0OO;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0309o0O0OooO c0309o0O0OooO = (C0309o0O0OooO) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0317o0O0o0o0.OooO0O0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0312o0O0o00o());
            }
            C0312o0O0o00o c0312o0O0o00o = (C0312o0O0o00o) hashMap.get(Integer.valueOf(id));
            if (c0312o0O0o00o != null) {
                HashMap hashMap2 = c0317o0O0o0o0.OooO00o;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0306o0O0OoOo c0306o0O0OoOo = (C0306o0O0OoOo) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0306o0O0OoOo(c0306o0O0OoOo, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0306o0O0OoOo(c0306o0O0OoOo, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                }
                c0312o0O0o00o.OooO0o = hashMap3;
                c0312o0O0o00o.OooO00o = id;
                int i2 = c0309o0O0OooO.OooO0o0;
                o0O0o0 o0o0o0 = c0312o0O0o00o.OooO0Oo;
                o0o0o0.OooO0oo = i2;
                o0o0o0.OooO = c0309o0O0OooO.OooO0o;
                o0o0o0.OooOO0 = c0309o0O0OooO.OooO0oO;
                o0o0o0.OooOO0O = c0309o0O0OooO.OooO0oo;
                o0o0o0.OooOO0o = c0309o0O0OooO.OooO;
                o0o0o0.OooOOO0 = c0309o0O0OooO.OooOO0;
                o0o0o0.OooOOO = c0309o0O0OooO.OooOO0O;
                o0o0o0.OooOOOO = c0309o0O0OooO.OooOO0o;
                o0o0o0.OooOOOo = c0309o0O0OooO.OooOOO0;
                o0o0o0.OooOOo0 = c0309o0O0OooO.OooOOO;
                o0o0o0.OooOOo = c0309o0O0OooO.OooOOOO;
                o0o0o0.OooOOoo = c0309o0O0OooO.OooOOoo;
                o0o0o0.OooOo00 = c0309o0O0OooO.OooOo00;
                o0o0o0.OooOo0 = c0309o0O0OooO.OooOo0;
                o0o0o0.OooOo0O = c0309o0O0OooO.OooOo0O;
                o0o0o0.OooOo0o = c0309o0O0OooO.OooOooo;
                o0o0o0.OooOo = c0309o0O0OooO.Oooo000;
                o0o0o0.OooOoO0 = c0309o0O0OooO.Oooo00O;
                o0o0o0.OooOoO = c0309o0O0OooO.OooOOOo;
                o0o0o0.OooOoOO = c0309o0O0OooO.OooOOo0;
                o0o0o0.OooOoo0 = c0309o0O0OooO.OooOOo;
                o0o0o0.OooOoo = c0309o0O0OooO.OoooO;
                o0o0o0.OooOooO = c0309o0O0OooO.OoooOO0;
                o0o0o0.OooOooo = c0309o0O0OooO.o000oOoO;
                o0o0o0.OooO0o = c0309o0O0OooO.OooO0OO;
                o0o0o0.OooO0Oo = c0309o0O0OooO.OooO00o;
                o0o0o0.OooO0o0 = c0309o0O0OooO.OooO0O0;
                o0o0o0.OooO0O0 = ((ViewGroup.MarginLayoutParams) c0309o0O0OooO).width;
                o0o0o0.OooO0OO = ((ViewGroup.MarginLayoutParams) c0309o0O0OooO).height;
                o0o0o0.Oooo000 = ((ViewGroup.MarginLayoutParams) c0309o0O0OooO).leftMargin;
                o0o0o0.Oooo00O = ((ViewGroup.MarginLayoutParams) c0309o0O0OooO).rightMargin;
                o0o0o0.Oooo00o = ((ViewGroup.MarginLayoutParams) c0309o0O0OooO).topMargin;
                o0o0o0.Oooo0 = ((ViewGroup.MarginLayoutParams) c0309o0O0OooO).bottomMargin;
                o0o0o0.Oooo0o0 = c0309o0O0OooO.OooOooO;
                o0o0o0.OoooO = c0309o0O0OooO.Oooo0;
                o0o0o0.OoooOO0 = c0309o0O0OooO.Oooo00o;
                o0o0o0.OoooOOO = c0309o0O0OooO.Oooo0OO;
                o0o0o0.o000oOoO = c0309o0O0OooO.Oooo0O0;
                o0o0o0.ooOO = c0309o0O0OooO.OoooOOO;
                o0o0o0.o00O0O = c0309o0O0OooO.OoooOOo;
                o0o0o0.OoooOOo = c0309o0O0OooO.Oooo0o0;
                o0o0o0.OoooOo0 = c0309o0O0OooO.Oooo0o;
                o0o0o0.OoooOoO = c0309o0O0OooO.Oooo;
                o0o0o0.OoooOoo = c0309o0O0OooO.OoooO00;
                o0o0o0.Ooooo00 = c0309o0O0OooO.Oooo0oO;
                o0o0o0.Ooooo0o = c0309o0O0OooO.Oooo0oo;
                o0o0o0.OooooO0 = c0309o0O0OooO.OoooO0;
                o0o0o0.OooooOO = c0309o0O0OooO.OoooO0O;
                o0o0o0.o0OoOo0 = c0309o0O0OooO.OoooOo0;
                o0o0o0.Oooo0oO = c0309o0O0OooO.OooOo;
                o0o0o0.Oooo = c0309o0O0OooO.OooOoO;
                o0o0o0.Oooo0o = c0309o0O0OooO.OooOo0o;
                o0o0o0.Oooo0oo = c0309o0O0OooO.OooOoO0;
                o0o0o0.OoooO0 = c0309o0O0OooO.OooOoOO;
                o0o0o0.OoooO00 = c0309o0O0OooO.OooOoo0;
                o0o0o0.OoooO0O = c0309o0O0OooO.OooOoo;
                o0o0o0.o00Ooo = c0309o0O0OooO.OoooOoO;
                o0o0o0.Oooo0O0 = c0309o0O0OooO.getMarginEnd();
                o0o0o0.Oooo0OO = c0309o0O0OooO.getMarginStart();
                int visibility = childAt.getVisibility();
                C0314o0O0o0OO c0314o0O0o0OO = c0312o0O0o00o.OooO0O0;
                c0314o0O0o0OO.OooO00o = visibility;
                c0314o0O0o0OO.OooO0OO = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C0315o0O0o0Oo c0315o0O0o0Oo = c0312o0O0o00o.OooO0o0;
                c0315o0O0o0Oo.OooO00o = rotation;
                c0315o0O0o0Oo.OooO0O0 = childAt.getRotationX();
                c0315o0O0o0Oo.OooO0OO = childAt.getRotationY();
                c0315o0O0o0Oo.OooO0Oo = childAt.getScaleX();
                c0315o0O0o0Oo.OooO0o0 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0315o0O0o0Oo.OooO0o = pivotX;
                    c0315o0O0o0Oo.OooO0oO = pivotY;
                }
                c0315o0O0o0Oo.OooO = childAt.getTranslationX();
                c0315o0O0o0Oo.OooOO0 = childAt.getTranslationY();
                c0315o0O0o0Oo.OooOO0O = childAt.getTranslationZ();
                if (c0315o0O0o0Oo.OooOO0o) {
                    c0315o0O0o0Oo.OooOOO0 = childAt.getElevation();
                }
                if (childAt instanceof C0182o00OooO0) {
                    C0182o00OooO0 c0182o00OooO0 = (C0182o00OooO0) childAt;
                    o0o0o0.o00Oo0 = c0182o00OooO0.getAllowsGoneWidget();
                    o0o0o0.OoooooO = c0182o00OooO0.getReferencedIds();
                    o0o0o0.OooooOo = c0182o00OooO0.getType();
                    o0o0o0.Oooooo0 = c0182o00OooO0.getMargin();
                }
            }
            i++;
            c0317o0O0o0o0 = this;
        }
    }

    public final void OooO0o0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0312o0O0o00o OooO0Oo2 = OooO0Oo(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        OooO0Oo2.OooO0Oo.OooO00o = true;
                    }
                    this.OooO0OO.put(Integer.valueOf(OooO0Oo2.OooO00o), OooO0Oo2);
                    continue;
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}



