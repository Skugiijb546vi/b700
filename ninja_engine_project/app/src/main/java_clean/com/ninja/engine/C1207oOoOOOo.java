package com.ninja.engine;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* renamed from: com.ninja.engine.oOoOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207oOoOOOo extends AbstractC1211oOoOOo0 {
    public final C1319oOooOooO OooO0OO;

    public C1207oOoOOOo(C1319oOooOooO c1319oOooOooO) {
        this.OooO0OO = c1319oOooOooO;
    }

    @Override // com.ninja.engine.AbstractC1211oOoOOo0
    public final void OooO00o(Matrix matrix, C1202oOoOOO0o c1202oOoOOO0o, int i, Canvas canvas) {
        boolean z;
        C1319oOooOooO c1319oOooOooO = this.OooO0OO;
        float f = c1319oOooOooO.OooO0o;
        float f2 = c1319oOooOooO.OooO0oO;
        RectF rectF = new RectF(c1319oOooOooO.OooO0O0, c1319oOooOooO.OooO0OO, c1319oOooOooO.OooO0Oo, c1319oOooOooO.OooO0o0);
        c1202oOoOOO0o.getClass();
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = c1202oOoOOO0o.OooO0oO;
        int[] iArr = C1202oOoOOO0o.OooOO0O;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c1202oOoOOO0o.OooO0o;
            iArr[2] = c1202oOoOOO0o.OooO0o0;
            iArr[3] = c1202oOoOOO0o.OooO0Oo;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c1202oOoOOO0o.OooO0Oo;
            iArr[2] = c1202oOoOOO0o.OooO0o0;
            iArr[3] = c1202oOoOOO0o.OooO0o;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (i / width);
            float[] fArr = C1202oOoOOO0o.OooOO0o;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = c1202oOoOOO0o.OooO0O0;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c1202oOoOOO0o.OooO0oo);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}


