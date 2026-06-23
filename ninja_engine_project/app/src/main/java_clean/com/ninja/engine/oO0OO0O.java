package com.ninja.engine;

import com.android.volley.toolbox.ImageRequest;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class oO0OO0O {
    public static boolean OooOOo0 = false;
    public final C1177oOo0o OooO0Oo;
    public final C0131o00O0o OooOOO0;
    public C0146o00OO0oo OooOOOo;
    public int OooO00o = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    public boolean OooO0O0 = false;
    public int OooO0OO = 0;
    public int OooO0o0 = 32;
    public int OooO0o = 32;
    public boolean OooO0oo = false;
    public boolean[] OooO = new boolean[32];
    public int OooOO0 = 1;
    public int OooOO0O = 0;
    public int OooOO0o = 32;
    public C1232oOoOo0oO[] OooOOO = new C1232oOoOo0oO[ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS];
    public int OooOOOO = 0;
    public C0146o00OO0oo[] OooO0oO = new C0146o00OO0oo[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [com.ninja.engine.o00OO0oo, com.ninja.engine.oOo0o, java.lang.Object] */
    public oO0OO0O() {
        OooOOoo();
        C0131o00O0o c0131o00O0o = new C0131o00O0o(4);
        c0131o00O0o.OooO0O0 = new C0995oOOOO0O();
        c0131o00O0o.OooO0OO = new C0995oOOOO0O();
        c0131o00O0o.OooO0Oo = new C1232oOoOo0oO[32];
        this.OooOOO0 = c0131o00O0o;
        C0146o00OO0oo c0146o00OO0oo = new C0146o00OO0oo(c0131o00O0o);
        c0146o00OO0oo.OooO0o = new C1232oOoOo0oO[128];
        c0146o00OO0oo.OooO0oO = new C1232oOoOo0oO[128];
        c0146o00OO0oo.OooO0oo = 0;
        c0146o00OO0oo.OooO = new C0415o0Oo0O0O(29, (Object) c0146o00OO0oo);
        this.OooO0Oo = c0146o00OO0oo;
        this.OooOOOo = new C0146o00OO0oo(c0131o00O0o);
    }

    public static int OooOOO(C0304o0O0OoO c0304o0O0OoO) {
        C1232oOoOo0oO c1232oOoOo0oO = c0304o0O0OoO.OooO;
        if (c1232oOoOo0oO != null) {
            return (int) (c1232oOoOo0oO.OooO0o0 + 0.5f);
        }
        return 0;
    }

    public final void OooO() {
        for (int i = 0; i < this.OooOO0O; i++) {
            C0146o00OO0oo c0146o00OO0oo = this.OooO0oO[i];
            c0146o00OO0oo.OooO00o.OooO0o0 = c0146o00OO0oo.OooO0O0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C1232oOoOo0oO OooO00o(int i) {
        C0995oOOOO0O c0995oOOOO0O = (C0995oOOOO0O) this.OooOOO0.OooO0OO;
        int i2 = c0995oOOOO0O.OooO0O0;
        C1232oOoOo0oO c1232oOoOo0oO = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] r3 = c0995oOOOO0O.OooO00o;
            C1232oOoOo0oO r4 = (C1232oOoOo0oO) r3[i3];
            r3[i3] = null;
            c0995oOOOO0O.OooO0O0 = i3;
            c1232oOoOo0oO = r4;
        }
        C1232oOoOo0oO c1232oOoOo0oO2 = c1232oOoOo0oO;
        if (c1232oOoOo0oO2 == null) {
            c1232oOoOo0oO2 = new C1232oOoOo0oO(i);
        } else {
            c1232oOoOo0oO2.OooO0OO();
        }
        c1232oOoOo0oO2.OooOO0o = i;
        int i4 = this.OooOOOO;
        int i5 = this.OooO00o;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.OooO00o = i6;
            this.OooOOO = (C1232oOoOo0oO[]) Arrays.copyOf(this.OooOOO, i6);
        }
        C1232oOoOo0oO[] c1232oOoOo0oOArr = this.OooOOO;
        int i7 = this.OooOOOO;
        this.OooOOOO = i7 + 1;
        c1232oOoOo0oOArr[i7] = c1232oOoOo0oO2;
        return c1232oOoOo0oO2;
    }

    public final void OooO0O0(C1232oOoOo0oO c1232oOoOo0oO, C1232oOoOo0oO c1232oOoOo0oO2, int i, float f, C1232oOoOo0oO c1232oOoOo0oO3, C1232oOoOo0oO c1232oOoOo0oO4, int i2, int i3) {
        int i4;
        float f2;
        C0146o00OO0oo OooOO0o = OooOO0o();
        if (c1232oOoOo0oO2 == c1232oOoOo0oO3) {
            OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO, 1.0f);
            OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO4, 1.0f);
            OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO2, -2.0f);
        } else {
            if (f == 0.5f) {
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO, 1.0f);
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO2, -1.0f);
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO3, -1.0f);
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO, -1.0f);
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO4, -1.0f);
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO3, 1.0f);
                i4 = -i2;
                f2 = i4;
            } else {
                float f3 = 1.0f - f;
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO, f3 * 1.0f);
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO2, f3 * (-1.0f));
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO3, (-1.0f) * f);
                OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    OooOO0o.OooO0O0 = (i2 * f) + ((-i) * f3);
                }
            }
            OooOO0o.OooO0O0 = f2;
        }
        if (i3 != 8) {
            OooOO0o.OooO00o(this, i3);
        }
        OooO0OO(OooOO0o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
        if (r4.OooOO0O <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c8, code lost:
        if (r4.OooOO0O <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00df, code lost:
        if (r4.OooOO0O <= 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e1, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e3, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ed, code lost:
        if (r4.OooOO0O <= 1) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ab A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(com.ninja.engine.C0146o00OO0oo r17) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.oO0OO0O.OooO0OO(com.ninja.engine.o00OO0oo):void");
    }

    public final void OooO0Oo(C1232oOoOo0oO c1232oOoOo0oO, int i) {
        C0146o00OO0oo OooOO0o;
        o00OO0 o00oo0;
        float f;
        int i2 = c1232oOoOo0oO.OooO0OO;
        if (i2 == -1) {
            c1232oOoOo0oO.OooO0Oo(this, i);
            for (int i3 = 0; i3 < this.OooO0OO + 1; i3++) {
                C1232oOoOo0oO c1232oOoOo0oO2 = ((C1232oOoOo0oO[]) this.OooOOO0.OooO0Oo)[i3];
            }
            return;
        }
        if (i2 != -1) {
            C0146o00OO0oo c0146o00OO0oo = this.OooO0oO[i2];
            if (!c0146o00OO0oo.OooO0o0) {
                if (c0146o00OO0oo.OooO0Oo.OooO0o() == 0) {
                    c0146o00OO0oo.OooO0o0 = true;
                } else {
                    OooOO0o = OooOO0o();
                    if (i < 0) {
                        OooOO0o.OooO0O0 = i * (-1);
                        o00oo0 = OooOO0o.OooO0Oo;
                        f = 1.0f;
                    } else {
                        OooOO0o.OooO0O0 = i;
                        o00oo0 = OooOO0o.OooO0Oo;
                        f = -1.0f;
                    }
                    o00oo0.OooOO0(c1232oOoOo0oO, f);
                }
            }
            c0146o00OO0oo.OooO0O0 = i;
            return;
        }
        OooOO0o = OooOO0o();
        OooOO0o.OooO00o = c1232oOoOo0oO;
        float f2 = i;
        c1232oOoOo0oO.OooO0o0 = f2;
        OooOO0o.OooO0O0 = f2;
        OooOO0o.OooO0o0 = true;
        OooO0OO(OooOO0o);
    }

    public final void OooO0o(C1232oOoOo0oO c1232oOoOo0oO, C1232oOoOo0oO c1232oOoOo0oO2, int i, int i2) {
        C0146o00OO0oo OooOO0o = OooOO0o();
        C1232oOoOo0oO OooOOO0 = OooOOO0();
        OooOOO0.OooO0Oo = 0;
        OooOO0o.OooO0O0(c1232oOoOo0oO, c1232oOoOo0oO2, OooOOO0, i);
        if (i2 != 8) {
            OooOO0o.OooO0Oo.OooOO0(OooOO0(i2), (int) (OooOO0o.OooO0Oo.OooO0o0(OooOOO0) * (-1.0f)));
        }
        OooO0OO(OooOO0o);
    }

    public final void OooO0o0(C1232oOoOo0oO c1232oOoOo0oO, C1232oOoOo0oO c1232oOoOo0oO2, int i, int i2) {
        if (i2 == 8 && c1232oOoOo0oO2.OooO0o && c1232oOoOo0oO.OooO0OO == -1) {
            c1232oOoOo0oO.OooO0Oo(this, c1232oOoOo0oO2.OooO0o0 + i);
            return;
        }
        C0146o00OO0oo OooOO0o = OooOO0o();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            OooOO0o.OooO0O0 = i;
        }
        if (!z) {
            OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO, -1.0f);
            OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO2, 1.0f);
        } else {
            OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO, 1.0f);
            OooOO0o.OooO0Oo.OooOO0(c1232oOoOo0oO2, -1.0f);
        }
        if (i2 != 8) {
            OooOO0o.OooO00o(this, i2);
        }
        OooO0OO(OooOO0o);
    }

    public final void OooO0oO(C1232oOoOo0oO c1232oOoOo0oO, C1232oOoOo0oO c1232oOoOo0oO2, int i, int i2) {
        C0146o00OO0oo OooOO0o = OooOO0o();
        C1232oOoOo0oO OooOOO0 = OooOOO0();
        OooOOO0.OooO0Oo = 0;
        OooOO0o.OooO0OO(c1232oOoOo0oO, c1232oOoOo0oO2, OooOOO0, i);
        if (i2 != 8) {
            OooOO0o.OooO0Oo.OooOO0(OooOO0(i2), (int) (OooOO0o.OooO0Oo.OooO0o0(OooOOO0) * (-1.0f)));
        }
        OooO0OO(OooOO0o);
    }

    public final void OooO0oo(C0146o00OO0oo c0146o00OO0oo) {
        int i;
        if (c0146o00OO0oo.OooO0o0) {
            c0146o00OO0oo.OooO00o.OooO0Oo(this, c0146o00OO0oo.OooO0O0);
        } else {
            C0146o00OO0oo[] c0146o00OO0ooArr = this.OooO0oO;
            int i2 = this.OooOO0O;
            c0146o00OO0ooArr[i2] = c0146o00OO0oo;
            C1232oOoOo0oO c1232oOoOo0oO = c0146o00OO0oo.OooO00o;
            c1232oOoOo0oO.OooO0OO = i2;
            this.OooOO0O = i2 + 1;
            c1232oOoOo0oO.OooO0o0(this, c0146o00OO0oo);
        }
        if (this.OooO0O0) {
            int i3 = 0;
            while (i3 < this.OooOO0O) {
                if (this.OooO0oO[i3] == null) {
                    System.out.println("WTF");
                }
                C0146o00OO0oo c0146o00OO0oo2 = this.OooO0oO[i3];
                if (c0146o00OO0oo2 != null && c0146o00OO0oo2.OooO0o0) {
                    c0146o00OO0oo2.OooO00o.OooO0Oo(this, c0146o00OO0oo2.OooO0O0);
                    ((C0995oOOOO0O) this.OooOOO0.OooO0O0).OooO00o(c0146o00OO0oo2);
                    this.OooO0oO[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.OooOO0O;
                        if (i4 >= i) {
                            break;
                        }
                        C0146o00OO0oo[] c0146o00OO0ooArr2 = this.OooO0oO;
                        int i6 = i4 - 1;
                        C0146o00OO0oo c0146o00OO0oo3 = c0146o00OO0ooArr2[i4];
                        c0146o00OO0ooArr2[i6] = c0146o00OO0oo3;
                        C1232oOoOo0oO c1232oOoOo0oO2 = c0146o00OO0oo3.OooO00o;
                        if (c1232oOoOo0oO2.OooO0OO == i4) {
                            c1232oOoOo0oO2.OooO0OO = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.OooO0oO[i5] = null;
                    }
                    this.OooOO0O = i - 1;
                    i3--;
                }
                i3++;
            }
            this.OooO0O0 = false;
        }
    }

    public final C1232oOoOo0oO OooOO0(int i) {
        if (this.OooOO0 + 1 >= this.OooO0o) {
            OooOOOO();
        }
        C1232oOoOo0oO OooO00o = OooO00o(4);
        int i2 = this.OooO0OO + 1;
        this.OooO0OO = i2;
        this.OooOO0++;
        OooO00o.OooO0O0 = i2;
        OooO00o.OooO0Oo = i;
        ((C1232oOoOo0oO[]) this.OooOOO0.OooO0Oo)[i2] = OooO00o;
        C1177oOo0o c1177oOo0o = this.OooO0Oo;
        c1177oOo0o.OooO.OooO0O0 = OooO00o;
        float[] fArr = OooO00o.OooO0oo;
        Arrays.fill(fArr, 0.0f);
        fArr[OooO00o.OooO0Oo] = 1.0f;
        c1177oOo0o.OooOO0(OooO00o);
        return OooO00o;
    }

    public final C1232oOoOo0oO OooOO0O(Object obj) {
        C1232oOoOo0oO c1232oOoOo0oO = null;
        if (obj == null) {
            return null;
        }
        if (this.OooOO0 + 1 >= this.OooO0o) {
            OooOOOO();
        }
        if (obj instanceof C0304o0O0OoO) {
            C0304o0O0OoO c0304o0O0OoO = (C0304o0O0OoO) obj;
            c1232oOoOo0oO = c0304o0O0OoO.OooO;
            if (c1232oOoOo0oO == null) {
                c0304o0O0OoO.OooOO0O();
                c1232oOoOo0oO = c0304o0O0OoO.OooO;
            }
            int i = c1232oOoOo0oO.OooO0O0;
            C0131o00O0o c0131o00O0o = this.OooOOO0;
            if (i == -1 || i > this.OooO0OO || ((C1232oOoOo0oO[]) c0131o00O0o.OooO0Oo)[i] == null) {
                if (i != -1) {
                    c1232oOoOo0oO.OooO0OO();
                }
                int i2 = this.OooO0OO + 1;
                this.OooO0OO = i2;
                this.OooOO0++;
                c1232oOoOo0oO.OooO0O0 = i2;
                c1232oOoOo0oO.OooOO0o = 1;
                ((C1232oOoOo0oO[]) c0131o00O0o.OooO0Oo)[i2] = c1232oOoOo0oO;
            }
        }
        return c1232oOoOo0oO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final C0146o00OO0oo OooOO0o() {
        C0146o00OO0oo c0146o00OO0oo;
        C0131o00O0o c0131o00O0o = this.OooOOO0;
        C0995oOOOO0O c0995oOOOO0O = (C0995oOOOO0O) c0131o00O0o.OooO0O0;
        int i = c0995oOOOO0O.OooO0O0;
        if (i > 0) {
            int i2 = i - 1;
            Object[] r4 = c0995oOOOO0O.OooO00o;
            C0146o00OO0oo r5 = (C0146o00OO0oo) r4[i2];
            r4[i2] = null;
            c0995oOOOO0O.OooO0O0 = i2;
            c0146o00OO0oo = r5;
        } else {
            c0146o00OO0oo = null;
        }
        C0146o00OO0oo c0146o00OO0oo2 = c0146o00OO0oo;
        if (c0146o00OO0oo2 == null) {
            return new C0146o00OO0oo(c0131o00O0o);
        }
        c0146o00OO0oo2.OooO00o = null;
        c0146o00OO0oo2.OooO0Oo.OooO0O0();
        c0146o00OO0oo2.OooO0O0 = 0.0f;
        c0146o00OO0oo2.OooO0o0 = false;
        return c0146o00OO0oo2;
    }

    public final C1232oOoOo0oO OooOOO0() {
        if (this.OooOO0 + 1 >= this.OooO0o) {
            OooOOOO();
        }
        C1232oOoOo0oO OooO00o = OooO00o(3);
        int i = this.OooO0OO + 1;
        this.OooO0OO = i;
        this.OooOO0++;
        OooO00o.OooO0O0 = i;
        ((C1232oOoOo0oO[]) this.OooOOO0.OooO0Oo)[i] = OooO00o;
        return OooO00o;
    }

    public final void OooOOOO() {
        int i = this.OooO0o0 * 2;
        this.OooO0o0 = i;
        this.OooO0oO = (C0146o00OO0oo[]) Arrays.copyOf(this.OooO0oO, i);
        C0131o00O0o c0131o00O0o = this.OooOOO0;
        c0131o00O0o.OooO0Oo = (C1232oOoOo0oO[]) Arrays.copyOf((C1232oOoOo0oO[]) c0131o00O0o.OooO0Oo, this.OooO0o0);
        int i2 = this.OooO0o0;
        this.OooO = new boolean[i2];
        this.OooO0o = i2;
        this.OooOO0o = i2;
    }

    public final void OooOOOo() {
        C1177oOo0o c1177oOo0o = this.OooO0Oo;
        if (c1177oOo0o.OooO0o0()) {
            OooO();
            return;
        }
        if (this.OooO0oo) {
            for (int i = 0; i < this.OooOO0O; i++) {
                if (this.OooO0oO[i].OooO0o0) {
                }
            }
            OooO();
            return;
        }
        OooOOo0(c1177oOo0o);
    }

    public final void OooOOo(C0146o00OO0oo c0146o00OO0oo) {
        for (int i = 0; i < this.OooOO0; i++) {
            this.OooO[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.OooOO0 * 2) {
                return;
            }
            C1232oOoOo0oO c1232oOoOo0oO = c0146o00OO0oo.OooO00o;
            if (c1232oOoOo0oO != null) {
                this.OooO[c1232oOoOo0oO.OooO0O0] = true;
            }
            C1232oOoOo0oO OooO0Oo = c0146o00OO0oo.OooO0Oo(this.OooO);
            if (OooO0Oo != null) {
                boolean[] zArr = this.OooO;
                int i3 = OooO0Oo.OooO0O0;
                if (zArr[i3]) {
                    return;
                }
                zArr[i3] = true;
            }
            if (OooO0Oo != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.OooOO0O; i5++) {
                    C0146o00OO0oo c0146o00OO0oo2 = this.OooO0oO[i5];
                    if (c0146o00OO0oo2.OooO00o.OooOO0o != 1 && !c0146o00OO0oo2.OooO0o0 && c0146o00OO0oo2.OooO0Oo.OooO0OO(OooO0Oo)) {
                        float OooO0o0 = c0146o00OO0oo2.OooO0Oo.OooO0o0(OooO0Oo);
                        if (OooO0o0 < 0.0f) {
                            float f2 = (-c0146o00OO0oo2.OooO0O0) / OooO0o0;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0146o00OO0oo c0146o00OO0oo3 = this.OooO0oO[i4];
                    c0146o00OO0oo3.OooO00o.OooO0OO = -1;
                    c0146o00OO0oo3.OooO0oO(OooO0Oo);
                    C1232oOoOo0oO c1232oOoOo0oO2 = c0146o00OO0oo3.OooO00o;
                    c1232oOoOo0oO2.OooO0OO = i4;
                    c1232oOoOo0oO2.OooO0o0(this, c0146o00OO0oo3);
                }
            } else {
                z = true;
            }
        }
    }

    public final void OooOOo0(C1177oOo0o c1177oOo0o) {
        int i = 0;
        while (true) {
            if (i >= this.OooOO0O) {
                break;
            }
            C0146o00OO0oo c0146o00OO0oo = this.OooO0oO[i];
            int i2 = 1;
            if (c0146o00OO0oo.OooO00o.OooOO0o != 1) {
                float f = 0.0f;
                if (c0146o00OO0oo.OooO0O0 < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = 0;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        while (i4 < this.OooOO0O) {
                            C0146o00OO0oo c0146o00OO0oo2 = this.OooO0oO[i4];
                            if (c0146o00OO0oo2.OooO00o.OooOO0o != i2 && !c0146o00OO0oo2.OooO0o0 && c0146o00OO0oo2.OooO0O0 < f) {
                                int OooO0o = c0146o00OO0oo2.OooO0Oo.OooO0o();
                                int i8 = 0;
                                while (i8 < OooO0o) {
                                    C1232oOoOo0oO OooO0oO = c0146o00OO0oo2.OooO0Oo.OooO0oO(i8);
                                    float OooO0o0 = c0146o00OO0oo2.OooO0Oo.OooO0o0(OooO0oO);
                                    if (OooO0o0 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = OooO0oO.OooO0oO[i9] / OooO0o0;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i6 = OooO0oO.OooO0O0;
                                                i5 = i4;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i4++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i5 != -1) {
                            C0146o00OO0oo c0146o00OO0oo3 = this.OooO0oO[i5];
                            c0146o00OO0oo3.OooO00o.OooO0OO = -1;
                            c0146o00OO0oo3.OooO0oO(((C1232oOoOo0oO[]) this.OooOOO0.OooO0Oo)[i6]);
                            C1232oOoOo0oO c1232oOoOo0oO = c0146o00OO0oo3.OooO00o;
                            c1232oOoOo0oO.OooO0OO = i5;
                            c1232oOoOo0oO.OooO0o0(this, c0146o00OO0oo3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.OooOO0 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        OooOOo(c1177oOo0o);
        OooO();
    }

    public final void OooOOoo() {
        for (int i = 0; i < this.OooOO0O; i++) {
            C0146o00OO0oo c0146o00OO0oo = this.OooO0oO[i];
            if (c0146o00OO0oo != null) {
                ((C0995oOOOO0O) this.OooOOO0.OooO0O0).OooO00o(c0146o00OO0oo);
            }
            this.OooO0oO[i] = null;
        }
    }

    public final void OooOo00() {
        C0131o00O0o c0131o00O0o;
        int i = 0;
        while (true) {
            c0131o00O0o = this.OooOOO0;
            C1232oOoOo0oO[] c1232oOoOo0oOArr = (C1232oOoOo0oO[]) c0131o00O0o.OooO0Oo;
            if (i >= c1232oOoOo0oOArr.length) {
                break;
            }
            C1232oOoOo0oO c1232oOoOo0oO = c1232oOoOo0oOArr[i];
            if (c1232oOoOo0oO != null) {
                c1232oOoOo0oO.OooO0OO();
            }
            i++;
        }
        C0995oOOOO0O c0995oOOOO0O = (C0995oOOOO0O) c0131o00O0o.OooO0OO;
        C1232oOoOo0oO[] c1232oOoOo0oOArr2 = this.OooOOO;
        int i2 = this.OooOOOO;
        c0995oOOOO0O.getClass();
        if (i2 > c1232oOoOo0oOArr2.length) {
            i2 = c1232oOoOo0oOArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C1232oOoOo0oO c1232oOoOo0oO2 = c1232oOoOo0oOArr2[i3];
            int i4 = c0995oOOOO0O.OooO0O0;
            Object[] objArr = c0995oOOOO0O.OooO00o;
            if (i4 < objArr.length) {
                objArr[i4] = c1232oOoOo0oO2;
                c0995oOOOO0O.OooO0O0 = i4 + 1;
            }
        }
        this.OooOOOO = 0;
        Arrays.fill((C1232oOoOo0oO[]) c0131o00O0o.OooO0Oo, (Object) null);
        this.OooO0OO = 0;
        C1177oOo0o c1177oOo0o = this.OooO0Oo;
        c1177oOo0o.OooO0oo = 0;
        c1177oOo0o.OooO0O0 = 0.0f;
        this.OooOO0 = 1;
        for (int i5 = 0; i5 < this.OooOO0O; i5++) {
            C0146o00OO0oo c0146o00OO0oo = this.OooO0oO[i5];
        }
        OooOOoo();
        this.OooOO0O = 0;
        this.OooOOOo = new C0146o00OO0oo(c0131o00O0o);
    }
}



