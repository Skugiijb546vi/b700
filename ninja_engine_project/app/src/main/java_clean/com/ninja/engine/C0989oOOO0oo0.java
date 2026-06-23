package com.ninja.engine;

import android.graphics.Path;
/* renamed from: com.ninja.engine.oOOO0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989oOOO0oo0 {
    public char OooO00o;
    public final float[] OooO0O0;

    public C0989oOOO0oo0(char c, float[] fArr) {
        this.OooO00o = c;
        this.OooO0O0 = fArr;
    }

    public static void OooO00o(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = f5;
        double d8 = d5 / d7;
        double d9 = f6;
        double d10 = ((d4 * cos) + ((-f) * sin)) / d9;
        double d11 = d4;
        double d12 = f4;
        double d13 = ((d12 * sin) + (f3 * cos)) / d7;
        double d14 = ((d12 * cos) + ((-f3) * sin)) / d9;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            OooO00o(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d15 * sqrt2;
        double d22 = sqrt2 * d16;
        if (z == z2) {
            d = d17 - d22;
            d2 = d18 + d21;
        } else {
            d = d17 + d22;
            d2 = d18 - d21;
        }
        double atan2 = Math.atan2(d10 - d2, d8 - d);
        double atan22 = Math.atan2(d14 - d2, d13 - d) - atan2;
        int i = 0;
        int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z2 != (i2 >= 0)) {
            atan22 = i2 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d * d7;
        double d24 = d2 * d9;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d24 * cos) + (d23 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d7;
        double d28 = d27 * cos2;
        double d29 = d9 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d9 * cos2;
        double d33 = (cos3 * d32) + (sin3 * d31);
        double d34 = atan22 / ceil;
        double d35 = atan2;
        while (i < ceil) {
            double d36 = d35 + d34;
            double sin4 = Math.sin(d36);
            double cos4 = Math.cos(d36);
            double d37 = d34;
            double d38 = (((d7 * cos2) * cos4) + d25) - (d29 * sin4);
            double d39 = d25;
            double d40 = (d32 * sin4) + (d7 * sin2 * cos4) + d26;
            double d41 = (d28 * sin4) - (d29 * cos4);
            double d42 = (cos4 * d32) + (sin4 * d31);
            double d43 = d36 - d35;
            double tan = Math.tan(d43 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * sqrt3) + d6), (float) ((d33 * sqrt3) + d11), (float) (d38 - (sqrt3 * d41)), (float) (d40 - (sqrt3 * d42)), (float) d38, (float) d40);
            i++;
            d32 = d32;
            d31 = d31;
            ceil = ceil;
            cos2 = cos2;
            d35 = d36;
            d7 = d7;
            d33 = d42;
            d30 = d41;
            d6 = d38;
            d11 = d40;
            d34 = d37;
            d25 = d39;
        }
    }

    public static void OooO0O0(C0989oOOO0oo0[] c0989oOOO0oo0Arr, Path path) {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        C0989oOOO0oo0 c0989oOOO0oo0;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        C0989oOOO0oo0[] c0989oOOO0oo0Arr2 = c0989oOOO0oo0Arr;
        float[] fArr = new float[6];
        int length = c0989oOOO0oo0Arr2.length;
        char c2 = 'm';
        int i5 = 0;
        while (i5 < length) {
            C0989oOOO0oo0 c0989oOOO0oo02 = c0989oOOO0oo0Arr2[i5];
            char c3 = c0989oOOO0oo02.OooO00o;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i6 = 0;
            while (true) {
                float[] fArr2 = c0989oOOO0oo02.OooO0O0;
                if (i6 < fArr2.length) {
                    if (c3 != 'A') {
                        if (c3 != 'C') {
                            if (c3 != 'H') {
                                if (c3 != 'Q') {
                                    if (c3 != 'V') {
                                        if (c3 != 'a') {
                                            if (c3 != 'c') {
                                                if (c3 != 'h') {
                                                    if (c3 != 'q') {
                                                        if (c3 != 'v') {
                                                            if (c3 != 'L') {
                                                                if (c3 != 'M') {
                                                                    if (c3 != 'S') {
                                                                        if (c3 != 'T') {
                                                                            if (c3 != 'l') {
                                                                                if (c3 != 'm') {
                                                                                    if (c3 != 's') {
                                                                                        if (c3 != 't') {
                                                                                            i2 = i6;
                                                                                        } else {
                                                                                            if (c2 != 'q' && c2 != 't' && c2 != 'Q' && c2 != 'T') {
                                                                                                f12 = 0.0f;
                                                                                                f11 = 0.0f;
                                                                                            } else {
                                                                                                f11 = f21 - f15;
                                                                                                f12 = f22 - f16;
                                                                                            }
                                                                                            int i7 = i6 + 1;
                                                                                            path.rQuadTo(f11, f12, fArr2[i6], fArr2[i7]);
                                                                                            float f23 = f11 + f21;
                                                                                            float f24 = f12 + f22;
                                                                                            f21 += fArr2[i6];
                                                                                            f22 += fArr2[i7];
                                                                                            f16 = f24;
                                                                                            i2 = i6;
                                                                                            c = c3;
                                                                                            i3 = i5;
                                                                                            i4 = length;
                                                                                            f15 = f23;
                                                                                        }
                                                                                    } else {
                                                                                        if (c2 != 'c' && c2 != 's' && c2 != 'C' && c2 != 'S') {
                                                                                            f9 = 0.0f;
                                                                                            f10 = 0.0f;
                                                                                        } else {
                                                                                            float f25 = f21 - f15;
                                                                                            f9 = f22 - f16;
                                                                                            f10 = f25;
                                                                                        }
                                                                                        int i8 = i6 + 1;
                                                                                        int i9 = i6 + 2;
                                                                                        int i10 = i6 + 3;
                                                                                        i2 = i6;
                                                                                        float f26 = f22;
                                                                                        float f27 = f21;
                                                                                        path.rCubicTo(f10, f9, fArr2[i6], fArr2[i8], fArr2[i9], fArr2[i10]);
                                                                                        f3 = f27 + fArr2[i2];
                                                                                        f4 = f26 + fArr2[i8];
                                                                                        f5 = f27 + fArr2[i9];
                                                                                        f6 = fArr2[i10] + f26;
                                                                                    }
                                                                                } else {
                                                                                    i2 = i6;
                                                                                    float f28 = fArr2[i2];
                                                                                    f21 += f28;
                                                                                    float f29 = fArr2[i2 + 1];
                                                                                    f22 += f29;
                                                                                    if (i2 > 0) {
                                                                                        path.rLineTo(f28, f29);
                                                                                    } else {
                                                                                        path.rMoveTo(f28, f29);
                                                                                        f20 = f22;
                                                                                        f19 = f21;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i2 = i6;
                                                                                int i11 = i2 + 1;
                                                                                path.rLineTo(fArr2[i2], fArr2[i11]);
                                                                                f21 += fArr2[i2];
                                                                                f22 += fArr2[i11];
                                                                            }
                                                                        } else {
                                                                            i2 = i6;
                                                                            float f30 = f22;
                                                                            float f31 = f21;
                                                                            if (c2 != 'q' && c2 != 't' && c2 != 'Q' && c2 != 'T') {
                                                                                f3 = f31;
                                                                                f4 = f30;
                                                                            } else {
                                                                                f3 = (f31 * 2.0f) - f15;
                                                                                f4 = (f30 * 2.0f) - f16;
                                                                            }
                                                                            int i12 = i2 + 1;
                                                                            path.quadTo(f3, f4, fArr2[i2], fArr2[i12]);
                                                                            f5 = fArr2[i2];
                                                                            f6 = fArr2[i12];
                                                                        }
                                                                    } else {
                                                                        i2 = i6;
                                                                        float f32 = f22;
                                                                        float f33 = f21;
                                                                        if (c2 != 'c' && c2 != 's' && c2 != 'C' && c2 != 'S') {
                                                                            f8 = f33;
                                                                            f7 = f32;
                                                                        } else {
                                                                            f7 = (f32 * 2.0f) - f16;
                                                                            f8 = (f33 * 2.0f) - f15;
                                                                        }
                                                                        int i13 = i2 + 1;
                                                                        int i14 = i2 + 2;
                                                                        int i15 = i2 + 3;
                                                                        path.cubicTo(f8, f7, fArr2[i2], fArr2[i13], fArr2[i14], fArr2[i15]);
                                                                        float f34 = fArr2[i2];
                                                                        float f35 = fArr2[i13];
                                                                        f21 = fArr2[i14];
                                                                        f22 = fArr2[i15];
                                                                        f16 = f35;
                                                                        f15 = f34;
                                                                    }
                                                                } else {
                                                                    i2 = i6;
                                                                    f21 = fArr2[i2];
                                                                    f22 = fArr2[i2 + 1];
                                                                    if (i2 > 0) {
                                                                        path.lineTo(f21, f22);
                                                                    } else {
                                                                        path.moveTo(f21, f22);
                                                                        f20 = f22;
                                                                        f19 = f21;
                                                                    }
                                                                }
                                                            } else {
                                                                i2 = i6;
                                                                int i16 = i2 + 1;
                                                                path.lineTo(fArr2[i2], fArr2[i16]);
                                                                f21 = fArr2[i2];
                                                                f22 = fArr2[i16];
                                                            }
                                                        } else {
                                                            i2 = i6;
                                                            path.rLineTo(0.0f, fArr2[i2]);
                                                            f22 += fArr2[i2];
                                                        }
                                                    } else {
                                                        i2 = i6;
                                                        float f36 = f22;
                                                        float f37 = f21;
                                                        int i17 = i2 + 1;
                                                        int i18 = i2 + 2;
                                                        int i19 = i2 + 3;
                                                        path.rQuadTo(fArr2[i2], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                        float f38 = f37 + fArr2[i2];
                                                        float f39 = f37 + fArr2[i18];
                                                        f22 = f36 + fArr2[i19];
                                                        f16 = fArr2[i17] + f36;
                                                        f15 = f38;
                                                        c = c3;
                                                        i3 = i5;
                                                        i4 = length;
                                                        f21 = f39;
                                                    }
                                                    c0989oOOO0oo0 = c0989oOOO0oo02;
                                                } else {
                                                    i2 = i6;
                                                    path.rLineTo(fArr2[i2], 0.0f);
                                                    f21 += fArr2[i2];
                                                }
                                                c = c3;
                                                i3 = i5;
                                                i4 = length;
                                                c0989oOOO0oo0 = c0989oOOO0oo02;
                                            } else {
                                                i2 = i6;
                                                float f40 = f22;
                                                float f41 = f21;
                                                int i20 = i2 + 2;
                                                int i21 = i2 + 3;
                                                int i22 = i2 + 4;
                                                int i23 = i2 + 5;
                                                path.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i20], fArr2[i21], fArr2[i22], fArr2[i23]);
                                                f3 = f41 + fArr2[i20];
                                                f4 = f40 + fArr2[i21];
                                                f5 = f41 + fArr2[i22];
                                                f6 = fArr2[i23] + f40;
                                            }
                                            f16 = f4;
                                            f15 = f3;
                                            c = c3;
                                            i3 = i5;
                                            i4 = length;
                                            f21 = f5;
                                            f22 = f6;
                                            c0989oOOO0oo0 = c0989oOOO0oo02;
                                        } else {
                                            i2 = i6;
                                            float f42 = f22;
                                            float f43 = f21;
                                            int i24 = i2 + 5;
                                            float f44 = fArr2[i24] + f43;
                                            int i25 = i2 + 6;
                                            float f45 = fArr2[i25] + f42;
                                            float f46 = fArr2[i2];
                                            float f47 = fArr2[i2 + 1];
                                            float f48 = fArr2[i2 + 2];
                                            if (fArr2[i2 + 3] != 0.0f) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (fArr2[i2 + 4] != 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            c = c3;
                                            i4 = length;
                                            c0989oOOO0oo0 = c0989oOOO0oo02;
                                            i3 = i5;
                                            OooO00o(path, f43, f42, f44, f45, f46, f47, f48, z3, z4);
                                            f21 = f43 + fArr2[i24];
                                            f22 = f42 + fArr2[i25];
                                        }
                                    } else {
                                        i2 = i6;
                                        c = c3;
                                        i3 = i5;
                                        i4 = length;
                                        c0989oOOO0oo0 = c0989oOOO0oo02;
                                        path.lineTo(f21, fArr2[i2]);
                                        f22 = fArr2[i2];
                                    }
                                } else {
                                    i2 = i6;
                                    c = c3;
                                    i3 = i5;
                                    i4 = length;
                                    c0989oOOO0oo0 = c0989oOOO0oo02;
                                    float f49 = fArr2[i2];
                                    int i26 = i2 + 1;
                                    float f50 = fArr2[i26];
                                    int i27 = i2 + 2;
                                    int i28 = i2 + 3;
                                    path.quadTo(f49, f50, fArr2[i27], fArr2[i28]);
                                    f = fArr2[i2];
                                    f2 = fArr2[i26];
                                    f21 = fArr2[i27];
                                    f22 = fArr2[i28];
                                }
                            } else {
                                i2 = i6;
                                c = c3;
                                i3 = i5;
                                i4 = length;
                                c0989oOOO0oo0 = c0989oOOO0oo02;
                                path.lineTo(fArr2[i2], f22);
                                f21 = fArr2[i2];
                            }
                            i6 = i2 + i;
                            c0989oOOO0oo02 = c0989oOOO0oo0;
                            length = i4;
                            c2 = c;
                            c3 = c2;
                            i5 = i3;
                        } else {
                            i2 = i6;
                            c = c3;
                            i3 = i5;
                            i4 = length;
                            c0989oOOO0oo0 = c0989oOOO0oo02;
                            int i29 = i2 + 2;
                            int i30 = i2 + 3;
                            int i31 = i2 + 4;
                            int i32 = i2 + 5;
                            path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                            f21 = fArr2[i31];
                            f22 = fArr2[i32];
                            f = fArr2[i29];
                            f2 = fArr2[i30];
                        }
                        f15 = f;
                        f16 = f2;
                        i6 = i2 + i;
                        c0989oOOO0oo02 = c0989oOOO0oo0;
                        length = i4;
                        c2 = c;
                        c3 = c2;
                        i5 = i3;
                    } else {
                        i2 = i6;
                        float f51 = f22;
                        float f52 = f21;
                        c = c3;
                        i3 = i5;
                        i4 = length;
                        c0989oOOO0oo0 = c0989oOOO0oo02;
                        int i33 = i2 + 5;
                        float f53 = fArr2[i33];
                        int i34 = i2 + 6;
                        float f54 = fArr2[i34];
                        float f55 = fArr2[i2];
                        float f56 = fArr2[i2 + 1];
                        float f57 = fArr2[i2 + 2];
                        if (fArr2[i2 + 3] != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        OooO00o(path, f52, f51, f53, f54, f55, f56, f57, z, z2);
                        f21 = fArr2[i33];
                        f22 = fArr2[i34];
                    }
                    f16 = f22;
                    f15 = f21;
                    i6 = i2 + i;
                    c0989oOOO0oo02 = c0989oOOO0oo0;
                    length = i4;
                    c2 = c;
                    c3 = c2;
                    i5 = i3;
                }
            }
            fArr[0] = f21;
            fArr[1] = f22;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f19;
            fArr[5] = f20;
            c2 = c0989oOOO0oo02.OooO00o;
            i5++;
            c0989oOOO0oo0Arr2 = c0989oOOO0oo0Arr;
            length = length;
        }
    }

    public C0989oOOO0oo0(C0989oOOO0oo0 c0989oOOO0oo0) {
        this.OooO00o = c0989oOOO0oo0.OooO00o;
        float[] fArr = c0989oOOO0oo0.OooO0O0;
        this.OooO0O0 = AbstractC0694o0ooooo0.OooOOO0(fArr, fArr.length);
    }
}


