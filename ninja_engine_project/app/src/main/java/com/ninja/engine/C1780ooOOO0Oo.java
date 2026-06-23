package com.ninja.engine;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* renamed from: com.ninja.engine.ooOOO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1780ooOOO0Oo extends AbstractC0424o0Oo0o00 {
    public float OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public boolean OooO0o0;

    @Override // com.ninja.engine.AbstractC0424o0Oo0o00
    public final void OooO00o(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        OooO0OO(canvas, paint, f, f2, AbstractC0694o0ooooo0.OooOO0o(i, i2), i3, i3);
    }

    public final void OooO0OO(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        Paint.Cap cap;
        float OooOOoo = AbstractC0809oO0OooOO.OooOOoo(f, 0.0f, 1.0f);
        float OooOOoo2 = AbstractC0809oO0OooOO.OooOOoo(f2, 0.0f, 1.0f);
        float Oooo00O = AbstractC0694o0ooooo0.Oooo00O(1.0f - this.OooO0o, 1.0f, OooOOoo);
        float Oooo00O2 = AbstractC0694o0ooooo0.Oooo00O(1.0f - this.OooO0o, 1.0f, OooOOoo2);
        float OooOOoo3 = 1.0f - AbstractC0809oO0OooOO.OooOOoo(Oooo00O2, 0.99f, 1.0f);
        float f3 = this.OooO0O0;
        int OooOOoo4 = (int) ((Oooo00O * f3) + ((int) ((AbstractC0809oO0OooOO.OooOOoo(Oooo00O, 0.0f, 0.01f) * i2) / 0.01f)));
        int i4 = (int) ((Oooo00O2 * f3) - ((int) ((OooOOoo3 * i3) / 0.01f)));
        float f4 = (-f3) / 2.0f;
        if (OooOOoo4 <= i4) {
            float f5 = this.OooO0Oo;
            float f6 = OooOOoo4 + f5;
            float f7 = i4 - f5;
            float f8 = f5 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.OooO0OO);
            if (f6 >= f7) {
                OooO0Oo(canvas, paint, new PointF(f6 + f4, 0.0f), new PointF(f7 + f4, 0.0f), f8, this.OooO0OO);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (this.OooO0o0) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f9 = f6 + f4;
            float f10 = f7 + f4;
            canvas.drawLine(f9, 0.0f, f10, 0.0f, paint);
            if (!this.OooO0o0 && this.OooO0Oo > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                if (f6 > 0.0f) {
                    OooO0Oo(canvas, paint, new PointF(f9, 0.0f), null, f8, this.OooO0OO);
                }
                if (f7 < this.OooO0O0) {
                    OooO0Oo(canvas, paint, new PointF(f10, 0.0f), null, f8, this.OooO0OO);
                }
            }
        }
    }

    public final void OooO0Oo(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f, float f2) {
        float min = Math.min(f2, this.OooO0OO);
        float f3 = f / 2.0f;
        float min2 = Math.min(f3, (this.OooO0Oo * min) / this.OooO0OO);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f3, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
