package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.ninja.engine.oOOoooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1139oOOoooOO {
    public static final ThreadLocal OooO00o = new ThreadLocal();
    public static final WeakHashMap OooO0O0 = new WeakHashMap(0);
    public static final Object OooO0OO = new Object();

    public static void OooO00o(C1133oOOooo c1133oOOooo, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (OooO0OO) {
            try {
                WeakHashMap weakHashMap = OooO0O0;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c1133oOOooo);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c1133oOOooo, sparseArray);
                }
                sparseArray.append(i, new C1136oOOooo0o(colorStateList, c1133oOOooo.OooO00o.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface OooO0O0(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return OooO0OO(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface OooO0OO(Context context, int i, TypedValue typedValue, int i2, AbstractC1137oOOoooO abstractC1137oOOoooO, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (!charSequence2.startsWith("res/")) {
                if (abstractC1137oOOoooO != null) {
                    abstractC1137oOOoooO.OooO00o(-3);
                }
            } else {
                int i3 = typedValue.assetCookie;
                C0839oO0o0ooO c0839oO0o0ooO = AbstractC1367oo000OOO.OooO0O0;
                Typeface typeface2 = (Typeface) c0839oO0o0ooO.OooO0o(AbstractC1367oo000OOO.OooO0O0(resources, i, charSequence2, i3, i2));
                if (typeface2 != null) {
                    if (abstractC1137oOOoooO != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0090o000OoOO(abstractC1137oOOoooO, 7, typeface2));
                    }
                    typeface = typeface2;
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            InterfaceC0572o0oOOooO Oooo00o = AbstractC0694o0ooooo0.Oooo00o(resources.getXml(i), resources);
                            if (Oooo00o == null) {
                                if (abstractC1137oOOoooO != null) {
                                    abstractC1137oOOoooO.OooO00o(-3);
                                }
                            } else {
                                typeface = AbstractC1367oo000OOO.OooO00o(context, Oooo00o, resources, i, charSequence2, typedValue.assetCookie, i2, abstractC1137oOOoooO, z);
                            }
                        } else {
                            int i4 = typedValue.assetCookie;
                            Typeface OooO = AbstractC1367oo000OOO.OooO00o.OooO(context, resources, i, charSequence2, i2);
                            if (OooO != null) {
                                c0839oO0o0ooO.OooOO0(AbstractC1367oo000OOO.OooO0O0(resources, i, charSequence2, i4, i2), OooO);
                            }
                            if (abstractC1137oOOoooO != null) {
                                if (OooO != null) {
                                    new Handler(Looper.getMainLooper()).post(new RunnableC0090o000OoOO(abstractC1137oOOoooO, 7, OooO));
                                } else {
                                    abstractC1137oOOoooO.OooO00o(-3);
                                }
                            }
                            typeface = OooO;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (abstractC1137oOOoooO != null) {
                            abstractC1137oOOoooO.OooO00o(-3);
                        }
                    }
                }
            }
            if (typeface == null && abstractC1137oOOoooO == null && !z2) {
                throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
            }
            return typeface;
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
    }
}
