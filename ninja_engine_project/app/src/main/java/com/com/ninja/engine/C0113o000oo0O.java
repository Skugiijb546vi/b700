package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
/* renamed from: com.ninja.engine.o000oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113o000oo0O {
    public static final PorterDuff.Mode OooO0O0 = PorterDuff.Mode.SRC_IN;
    public static C0113o000oo0O OooO0OO;
    public C1135oOOooo00 OooO00o;

    public static synchronized C0113o000oo0O OooO00o() {
        C0113o000oo0O c0113o000oo0O;
        synchronized (C0113o000oo0O.class) {
            try {
                if (OooO0OO == null) {
                    OooO0Oo();
                }
                c0113o000oo0O = OooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0113o000oo0O;
    }

    public static synchronized PorterDuffColorFilter OooO0OO(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter OooO0oo;
        synchronized (C0113o000oo0O.class) {
            OooO0oo = C1135oOOooo00.OooO0oo(i, mode);
        }
        return OooO0oo;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.ninja.engine.o000oo0O] */
    public static synchronized void OooO0Oo() {
        synchronized (C0113o000oo0O.class) {
            if (OooO0OO == null) {
                ?? obj = new Object();
                OooO0OO = obj;
                obj.OooO00o = C1135oOOooo00.OooO0Oo();
                OooO0OO.OooO00o.OooOO0o(new C0111o000oo0());
            }
        }
    }

    public static void OooO0o0(Drawable drawable, C1324oOooo000 c1324oOooo000, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C1135oOOooo00.OooO0oo;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c1324oOooo000.OooO0Oo;
            if (!z && !c1324oOooo000.OooO0OO) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z) {
                    colorStateList = c1324oOooo000.OooO00o;
                } else {
                    colorStateList = null;
                }
                if (c1324oOooo000.OooO0OO) {
                    mode = c1324oOooo000.OooO0O0;
                } else {
                    mode = C1135oOOooo00.OooO0oo;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = C1135oOOooo00.OooO0oo(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable OooO0O0(Context context, int i) {
        return this.OooO00o.OooO0o(context, i);
    }
}
