package com.ninja.engine;

import android.graphics.Matrix;
import android.graphics.Path;
/* renamed from: com.ninja.engine.oOoOOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1209oOoOOOoo extends AbstractC1212oOoOOo00 {
    public float OooO0O0;
    public float OooO0OO;

    @Override // com.ninja.engine.AbstractC1212oOoOOo00
    public final void OooO00o(Matrix matrix, Path path) {
        Matrix matrix2 = this.OooO00o;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.OooO0O0, this.OooO0OO);
        path.transform(matrix);
    }
}


