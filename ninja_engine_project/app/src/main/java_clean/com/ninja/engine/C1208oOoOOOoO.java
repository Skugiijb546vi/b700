package com.ninja.engine;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
/* renamed from: com.ninja.engine.oOoOOOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208oOoOOOoO extends AbstractC1211oOoOOo0 {
    public final C1209oOoOOOoo OooO0OO;
    public final float OooO0Oo;
    public final float OooO0o0;

    public C1208oOoOOOoO(C1209oOoOOOoo c1209oOoOOOoo, float f, float f2) {
        this.OooO0OO = c1209oOoOOOoo;
        this.OooO0Oo = f;
        this.OooO0o0 = f2;
    }

    @Override // com.ninja.engine.AbstractC1211oOoOOo0
    public final void OooO00o(Matrix matrix, C1202oOoOOO0o c1202oOoOOO0o, int i, Canvas canvas) {
        C1209oOoOOOoo c1209oOoOOOoo = this.OooO0OO;
        float f = c1209oOoOOOoo.OooO0OO;
        float f2 = this.OooO0o0;
        float f3 = c1209oOoOOOoo.OooO0O0;
        float f4 = this.OooO0Oo;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.OooO00o;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(OooO0O0());
        c1202oOoOOO0o.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C1202oOoOOO0o.OooO;
        iArr[0] = c1202oOoOOO0o.OooO0o;
        iArr[1] = c1202oOoOOO0o.OooO0o0;
        iArr[2] = c1202oOoOOO0o.OooO0Oo;
        Paint paint = c1202oOoOOO0o.OooO0OO;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C1202oOoOOO0o.OooOO0, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float OooO0O0() {
        C1209oOoOOOoo c1209oOoOOOoo = this.OooO0OO;
        return (float) Math.toDegrees(Math.atan((c1209oOoOOOoo.OooO0OO - this.OooO0o0) / (c1209oOoOOOoo.OooO0O0 - this.OooO0Oo)));
    }
}


