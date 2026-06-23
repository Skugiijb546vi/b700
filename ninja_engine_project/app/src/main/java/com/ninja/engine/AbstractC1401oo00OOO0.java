package com.ninja.engine;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;
/* renamed from: com.ninja.engine.oo00OOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1401oo00OOO0 {
    public static final char[] OooO00o = "0123456789abcdef".toCharArray();
    public static final char[] OooO0O0 = new char[64];
    public static volatile Handler OooO0OO;

    public static boolean OooO(int i, int i2) {
        return (i > 0 || i == Integer.MIN_VALUE) && (i2 > 0 || i2 == Integer.MIN_VALUE);
    }

    public static void OooO00o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public static boolean OooO0O0(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int OooO0OO(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int OooO0Oo(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AbstractC1395oo00OO.OooO00o[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    public static Handler OooO0o() {
        if (OooO0OO == null) {
            synchronized (AbstractC1401oo00OOO0.class) {
                try {
                    if (OooO0OO == null) {
                        OooO0OO = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return OooO0OO;
    }

    public static ArrayList OooO0o0(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int OooO0oO(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int OooO0oo(int i, Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return OooO0oO(hashCode, i);
    }
}
