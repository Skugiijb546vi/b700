package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
/* renamed from: com.ninja.engine.oo0Oo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515oo0Oo00 extends AbstractC1519oo0Oo0O0 {
    public static final PathInterpolator OooO0o0 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final C0534o0o0O0o OooO0o = new C0534o0o0O0o(0);
    public static final DecelerateInterpolator OooO0oO = new DecelerateInterpolator();

    public static WindowInsets OooO(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void OooO0o(View view, WindowInsets windowInsets, boolean z) {
        C0303o0O0Oo0o OooOO0 = OooOO0(view);
        if (OooOO0 != null) {
            OooOO0.OooO0OO = windowInsets;
            if (!z) {
                int[] iArr = (int[]) OooOO0.OooO0o0;
                ((View) OooOO0.OooO0Oo).getLocationOnScreen(iArr);
                z = true;
                OooOO0.OooO00o = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void OooO0o0(View view) {
        C0303o0O0Oo0o OooOO0 = OooOO0(view);
        if (OooOO0 != null) {
            ((View) OooOO0.OooO0Oo).setTranslationY(0.0f);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o0(viewGroup.getChildAt(i));
            }
        }
    }

    public static void OooO0oO(View view, C1536oo0OoOoO c1536oo0OoOoO, List list) {
        C0303o0O0Oo0o OooOO0 = OooOO0(view);
        if (OooOO0 != null) {
            OooOO0.OooO0OO(c1536oo0OoOoO, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0oO(viewGroup.getChildAt(i), c1536oo0OoOoO, list);
            }
        }
    }

    public static void OooO0oo(View view, C1126oOOooOO c1126oOOooOO) {
        C0303o0O0Oo0o OooOO0 = OooOO0(view);
        if (OooOO0 != null) {
            View view2 = (View) OooOO0.OooO0Oo;
            int[] iArr = (int[]) OooOO0.OooO0o0;
            view2.getLocationOnScreen(iArr);
            int i = OooOO0.OooO00o - iArr[1];
            OooOO0.OooO0O0 = i;
            view2.setTranslationY(i);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                OooO0oo(viewGroup.getChildAt(i2), c1126oOOooOO);
            }
        }
    }

    public static C0303o0O0Oo0o OooOO0(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof View$OnApplyWindowInsetsListenerC1516oo0Oo000) {
            return ((View$OnApplyWindowInsetsListenerC1516oo0Oo000) tag).OooO00o;
        }
        return null;
    }
}
