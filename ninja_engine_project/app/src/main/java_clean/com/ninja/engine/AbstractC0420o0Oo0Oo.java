package com.ninja.engine;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* renamed from: com.ninja.engine.o0Oo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0420o0Oo0Oo {
    public static final int[] OooO00o = {16842912};
    public static final int[] OooO0O0 = new int[0];

    static {
        new Rect();
    }

    public static void OooO00o(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = OooO00o;
        int[] iArr2 = OooO0O0;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(iArr2);
            } else {
                drawable.setState(iArr);
            }
            drawable.setState(state);
        } else if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state2 = drawable.getState();
            if (state2 != null && state2.length != 0) {
                drawable.setState(iArr2);
            } else {
                drawable.setState(iArr);
            }
            drawable.setState(state2);
        }
    }

    public static PorterDuff.Mode OooO0O0(int i, PorterDuff.Mode mode) {
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
}


