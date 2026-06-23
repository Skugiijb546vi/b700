package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
/* renamed from: com.ninja.engine.oo0O000o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1452oo0O000o {
    public static boolean OooO(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void OooO00o(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static C1536oo0OoOoO OooO0O0(View view, C1536oo0OoOoO c1536oo0OoOoO, Rect rect) {
        WindowInsets OooO0o = c1536oo0OoOoO.OooO0o();
        if (OooO0o != null) {
            return C1536oo0OoOoO.OooO0oO(view, view.computeSystemWindowInsets(OooO0o, rect));
        }
        rect.setEmpty();
        return c1536oo0OoOoO;
    }

    public static ColorStateList OooO0OO(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode OooO0Oo(View view) {
        return view.getBackgroundTintMode();
    }

    public static C1536oo0OoOoO OooO0o(View view) {
        AbstractC1513oo0Oo c1523oo0Oo0o0;
        if (!AbstractC1521oo0Oo0Oo.OooO0Oo || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC1521oo0Oo0Oo.OooO00o.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC1521oo0Oo0Oo.OooO0O0.get(obj);
            Rect rect2 = (Rect) AbstractC1521oo0Oo0Oo.OooO0OO.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                c1523oo0Oo0o0 = new C1525oo0Oo0oo();
            } else if (i >= 29) {
                c1523oo0Oo0o0 = new C1524oo0Oo0oO();
            } else {
                c1523oo0Oo0o0 = new C1523oo0Oo0o0();
            }
            c1523oo0Oo0o0.OooO0o0(C0724oO00OooO.OooO0O0(rect.left, rect.top, rect.right, rect.bottom));
            c1523oo0Oo0o0.OooO0oO(C0724oO00OooO.OooO0O0(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C1536oo0OoOoO OooO0O0 = c1523oo0Oo0o0.OooO0O0();
            OooO0O0.OooO00o.OooOOOo(OooO0O0);
            OooO0O0.OooO00o.OooO0Oo(view.getRootView());
            return OooO0O0;
        } catch (IllegalAccessException e) {
            e.getMessage();
            return null;
        }
    }

    public static float OooO0o0(View view) {
        return view.getElevation();
    }

    public static String OooO0oO(View view) {
        return view.getTransitionName();
    }

    public static float OooO0oo(View view) {
        return view.getZ();
    }

    public static void OooOO0(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void OooOO0O(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void OooOO0o(View view, float f) {
        view.setElevation(f);
    }

    public static void OooOOO(View view, String str) {
        view.setTransitionName(str);
    }

    public static void OooOOO0(View view, InterfaceC0954oOO0oOo interfaceC0954oOO0oOo) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0954oOO0oOo);
        }
        if (interfaceC0954oOO0oOo == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC1451oo0O000O(view, interfaceC0954oOO0oOo));
        }
    }

    public static void OooOOOO(View view) {
        view.stopNestedScroll();
    }
}


