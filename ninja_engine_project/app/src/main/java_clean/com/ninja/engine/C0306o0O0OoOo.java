package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
/* renamed from: com.ninja.engine.o0O0OoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306o0O0OoOo {
    public boolean OooO00o = false;
    public int OooO0O0;
    public int OooO0OO;
    public float OooO0Oo;
    public boolean OooO0o;
    public String OooO0o0;
    public int OooO0oO;

    public C0306o0O0OoOo() {}

    public C0306o0O0OoOo(C0306o0O0OoOo c0306o0O0OoOo, Object obj) {
        c0306o0O0OoOo.getClass();
        this.OooO0O0 = c0306o0O0OoOo.OooO0O0;
        OooO0O0(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ninja.engine.o0O0OoOo, java.lang.Object] */
    public static void OooO00o(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1031oOOOoOOo.OooO0Oo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == 7) {
                    dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                } else if (index == 4) {
                    dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == 5) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == 6) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == 9) {
                    obj = obtainStyledAttributes.getString(index);
                    i = 5;
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                    i = 8;
                }
                obj = Float.valueOf(dimension);
                i = 7;
            }
        }
        if (str != null && obj != null) {
            C0306o0O0OoOo obj2 = new C0306o0O0OoOo();
            obj2.OooO0O0 = i;
            obj2.OooO00o = z;
            obj2.OooO0O0(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void OooO0O0(Object obj) {
        switch (AbstractC1230oOoOo0o.OooOOOo(this.OooO0O0)) {
            case 0:
            case 7:
                this.OooO0OO = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.OooO0Oo = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.OooO0oO = ((Integer) obj).intValue();
                return;
            case 4:
                this.OooO0o0 = (String) obj;
                return;
            case 5:
                this.OooO0o = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}



