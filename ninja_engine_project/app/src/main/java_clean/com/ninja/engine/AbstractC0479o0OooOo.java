package com.ninja.engine;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
/* renamed from: com.ninja.engine.o0OooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0479o0OooOo {
    public static final ThreadLocal OooO00o = new ThreadLocal();
    public static final ThreadLocal OooO0O0 = new ThreadLocal();

    public static void OooO00o(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            OooO00o(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}


