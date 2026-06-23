package com.ninja.engine;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* renamed from: com.ninja.engine.oOooOooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319oOooOooO extends AbstractC1212oOoOOo00 {
    public static final RectF OooO0oo = new RectF();
    public final float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public float OooO0o;
    public final float OooO0o0;
    public float OooO0oO;

    public C1319oOooOooO(float f, float f2, float f3, float f4) {
        this.OooO0O0 = f;
        this.OooO0OO = f2;
        this.OooO0Oo = f3;
        this.OooO0o0 = f4;
    }

    @Override // com.ninja.engine.AbstractC1212oOoOOo00
    public final void OooO00o(Matrix matrix, Path path) {
        Matrix matrix2 = this.OooO00o;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = OooO0oo;
        rectF.set(this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.OooO0o0);
        path.arcTo(rectF, this.OooO0o, this.OooO0oO, false);
        path.transform(matrix);
    }
}


