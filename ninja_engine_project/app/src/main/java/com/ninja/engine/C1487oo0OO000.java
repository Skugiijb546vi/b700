package com.ninja.engine;

import android.graphics.Matrix;
import android.view.View;
/* renamed from: com.ninja.engine.oo0OO000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1487oo0OO000 extends C1488oo0OO00o {
    @Override // com.ninja.engine.C0919oOO00oOo
    public final float OooO0o0(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // com.ninja.engine.C1483oo0O0ooo, com.ninja.engine.C0919oOO00oOo
    public final void OooOO0o(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.ninja.engine.C0919oOO00oOo
    public final void OooOOO0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.ninja.engine.C1488oo0OO00o, com.ninja.engine.C0919oOO00oOo
    public final void OooOOOO(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.ninja.engine.C0919oOO00oOo
    public final void OooOOOo(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.ninja.engine.C0919oOO00oOo
    public final void OooOOoo(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
