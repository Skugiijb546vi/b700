package com.ninja.engine;

import android.graphics.Matrix;
import android.view.View;
/* renamed from: com.ninja.engine.oo0O0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1480oo0O0oo {
    public static void OooO00o(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void OooO0O0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void OooO0OO(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
