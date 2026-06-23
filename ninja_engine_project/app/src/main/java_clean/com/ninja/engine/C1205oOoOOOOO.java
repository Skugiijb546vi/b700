package com.ninja.engine;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
/* renamed from: com.ninja.engine.oOoOOOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205oOoOOOOO {
    public final C1214oOoOOo0o[] OooO00o = new C1214oOoOOo0o[4];
    public final Matrix[] OooO0O0 = new Matrix[4];
    public final Matrix[] OooO0OO = new Matrix[4];
    public final PointF OooO0Oo = new PointF();
    public final Path OooO0o0 = new Path();
    public final Path OooO0o = new Path();
    public final C1214oOoOOo0o OooO0oO = new C1214oOoOOo0o();
    public final float[] OooO0oo = new float[2];
    public final float[] OooO = new float[2];
    public final Path OooOO0 = new Path();
    public final Path OooOO0O = new Path();
    public final boolean OooOO0o = true;

    public C1205oOoOOOOO() {
        for (int i = 0; i < 4; i++) {
            this.OooO00o[i] = new C1214oOoOOo0o();
            this.OooO0O0[i] = new Matrix();
            this.OooO0OO[i] = new Matrix();
        }
    }

    public final void OooO00o(C1204oOoOOOO0 c1204oOoOOOO0, float f, RectF rectF, C0331o0O0oo c0331o0O0oo, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C1214oOoOOo0o[] c1214oOoOOo0oArr;
        float centerX;
        float f2;
        C0455o0OoOo00 c0455o0OoOo00;
        InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0;
        AbstractC0692o0ooooOo abstractC0692o0ooooOo;
        int i2;
        float f3;
        float f4;
        C1205oOoOOOOO c1205oOoOOOOO = this;
        path.rewind();
        Path path2 = c1205oOoOOOOO.OooO0o0;
        path2.rewind();
        Path path3 = c1205oOoOOOOO.OooO0o;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            i = 4;
            matrixArr = c1205oOoOOOOO.OooO0OO;
            fArr = c1205oOoOOOOO.OooO0oo;
            matrixArr2 = c1205oOoOOOOO.OooO0O0;
            c1214oOoOOo0oArr = c1205oOoOOOOO.OooO00o;
            if (i3 >= 4) {
                break;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        interfaceC0336o0O0ooO0 = c1204oOoOOOO0.OooO0o;
                    } else {
                        interfaceC0336o0O0ooO0 = c1204oOoOOOO0.OooO0o0;
                    }
                } else {
                    interfaceC0336o0O0ooO0 = c1204oOoOOOO0.OooO0oo;
                }
            } else {
                interfaceC0336o0O0ooO0 = c1204oOoOOOO0.OooO0oO;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        abstractC0692o0ooooOo = c1204oOoOOOO0.OooO0O0;
                    } else {
                        abstractC0692o0ooooOo = c1204oOoOOOO0.OooO00o;
                    }
                } else {
                    abstractC0692o0ooooOo = c1204oOoOOOO0.OooO0Oo;
                }
            } else {
                abstractC0692o0ooooOo = c1204oOoOOOO0.OooO0OO;
            }
            C1214oOoOOo0o c1214oOoOOo0o = c1214oOoOOo0oArr[i3];
            abstractC0692o0ooooOo.getClass();
            abstractC0692o0ooooOo.OooOOoo(c1214oOoOOo0o, f, interfaceC0336o0O0ooO0.OooO00o(rectF));
            int i4 = i3 + 1;
            float f5 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = c1205oOoOOOOO.OooO0Oo;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        f3 = rectF.right;
                        i2 = i4;
                    } else {
                        i2 = i4;
                        f3 = rectF.left;
                    }
                    f4 = rectF.top;
                    pointF.set(f3, f4);
                    matrixArr2[i3].setTranslate(pointF.x, pointF.y);
                    matrixArr2[i3].preRotate(f5);
                    C1214oOoOOo0o c1214oOoOOo0o2 = c1214oOoOOo0oArr[i3];
                    fArr[0] = c1214oOoOOo0o2.OooO0OO;
                    fArr[1] = c1214oOoOOo0o2.OooO0Oo;
                    matrixArr2[i3].mapPoints(fArr);
                    matrixArr[i3].reset();
                    matrixArr[i3].setTranslate(fArr[0], fArr[1]);
                    matrixArr[i3].preRotate(f5);
                    i3 = i2;
                } else {
                    i2 = i4;
                    f3 = rectF.left;
                }
            } else {
                i2 = i4;
                f3 = rectF.right;
            }
            f4 = rectF.bottom;
            pointF.set(f3, f4);
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f5);
            C1214oOoOOo0o c1214oOoOOo0o22 = c1214oOoOOo0oArr[i3];
            fArr[0] = c1214oOoOOo0o22.OooO0OO;
            fArr[1] = c1214oOoOOo0o22.OooO0Oo;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f5);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            C1214oOoOOo0o c1214oOoOOo0o3 = c1214oOoOOo0oArr[i5];
            fArr[0] = c1214oOoOOo0o3.OooO00o;
            fArr[1] = c1214oOoOOo0o3.OooO0O0;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c1214oOoOOo0oArr[i5].OooO0O0(matrixArr2[i5], path);
            if (c0331o0O0oo != null) {
                C1214oOoOOo0o c1214oOoOOo0o4 = c1214oOoOOo0oArr[i5];
                Matrix matrix = matrixArr2[i5];
                C0875oO0oOooo c0875oO0oOooo = (C0875oO0oOooo) c0331o0O0oo.OooO0O0;
                BitSet bitSet = c0875oO0oOooo.OooO0Oo;
                c1214oOoOOo0o4.getClass();
                bitSet.set(i5, false);
                c1214oOoOOo0o4.OooO00o(c1214oOoOOo0o4.OooO0o);
                c0875oO0oOooo.OooO0O0[i5] = new C1206oOoOOOOo(new ArrayList(c1214oOoOOo0o4.OooO0oo), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C1214oOoOOo0o c1214oOoOOo0o5 = c1214oOoOOo0oArr[i5];
            fArr[0] = c1214oOoOOo0o5.OooO0OO;
            fArr[1] = c1214oOoOOo0o5.OooO0Oo;
            matrixArr2[i5].mapPoints(fArr);
            C1214oOoOOo0o c1214oOoOOo0o6 = c1214oOoOOo0oArr[i7];
            float f6 = c1214oOoOOo0o6.OooO00o;
            float[] fArr2 = c1205oOoOOOOO.OooO;
            fArr2[0] = f6;
            fArr2[1] = c1214oOoOOo0o6.OooO0O0;
            matrixArr2[i7].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C1214oOoOOo0o c1214oOoOOo0o7 = c1214oOoOOo0oArr[i5];
            fArr[0] = c1214oOoOOo0o7.OooO0OO;
            fArr[1] = c1214oOoOOo0o7.OooO0Oo;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 != 1 && i5 != 3) {
                centerX = rectF.centerY();
                f2 = fArr[1];
            } else {
                centerX = rectF.centerX();
                f2 = fArr[0];
            }
            Math.abs(centerX - f2);
            C1214oOoOOo0o c1214oOoOOo0o8 = c1205oOoOOOOO.OooO0oO;
            c1214oOoOOo0o8.OooO0Oo(0.0f, 270.0f, 0.0f);
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        c0455o0OoOo00 = c1204oOoOOOO0.OooOO0;
                    } else {
                        c0455o0OoOo00 = c1204oOoOOOO0.OooO;
                    }
                } else {
                    c0455o0OoOo00 = c1204oOoOOOO0.OooOO0o;
                }
            } else {
                c0455o0OoOo00 = c1204oOoOOOO0.OooOO0O;
            }
            c0455o0OoOo00.getClass();
            c1214oOoOOo0o8.OooO0OO(max, 0.0f);
            Path path4 = c1205oOoOOOOO.OooOO0;
            path4.reset();
            c1214oOoOOo0o8.OooO0O0(matrixArr[i5], path4);
            if (c1205oOoOOOOO.OooOO0o && (c1205oOoOOOOO.OooO0O0(path4, i5) || c1205oOoOOOOO.OooO0O0(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = c1214oOoOOo0o8.OooO00o;
                fArr[1] = c1214oOoOOo0o8.OooO0O0;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c1214oOoOOo0o8.OooO0O0(matrixArr[i5], path2);
            } else {
                c1214oOoOOo0o8.OooO0O0(matrixArr[i5], path);
            }
            if (c0331o0O0oo != null) {
                Matrix matrix2 = matrixArr[i5];
                C0875oO0oOooo c0875oO0oOooo2 = (C0875oO0oOooo) c0331o0O0oo.OooO0O0;
                c0875oO0oOooo2.OooO0Oo.set(i5 + 4, false);
                c1214oOoOOo0o8.OooO00o(c1214oOoOOo0o8.OooO0o);
                c0875oO0oOooo2.OooO0OO[i5] = new C1206oOoOOOOo(new ArrayList(c1214oOoOOo0o8.OooO0oo), new Matrix(matrix2));
            }
            i = 4;
            c1205oOoOOOOO = this;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean OooO0O0(Path path, int i) {
        Path path2 = this.OooOO0O;
        path2.reset();
        this.OooO00o[i].OooO0O0(this.OooO0O0[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}


