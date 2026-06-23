package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.o00OO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0146o00OO0oo {
    public final o00OO0 OooO0Oo;
    public C1232oOoOo0oO OooO00o = null;
    public float OooO0O0 = 0.0f;
    public final ArrayList OooO0OO = new ArrayList();
    public boolean OooO0o0 = false;

    public C0146o00OO0oo(C0131o00O0o c0131o00O0o) {
        this.OooO0Oo = new o00OO0(this, c0131o00O0o);
    }

    public void OooO(oO0OO0O oo0oo0o, C0146o00OO0oo c0146o00OO0oo, boolean z) {
        float OooOO0o = this.OooO0Oo.OooOO0o(c0146o00OO0oo, z);
        this.OooO0O0 = (c0146o00OO0oo.OooO0O0 * OooOO0o) + this.OooO0O0;
        if (z) {
            c0146o00OO0oo.OooO00o.OooO0O0(this);
        }
        if (this.OooO00o != null && this.OooO0Oo.OooO0o() == 0) {
            this.OooO0o0 = true;
            oo0oo0o.OooO0O0 = true;
        }
    }

    public final void OooO00o(oO0OO0O oo0oo0o, int i) {
        this.OooO0Oo.OooOO0(oo0oo0o.OooOO0(i), 1.0f);
        this.OooO0Oo.OooOO0(oo0oo0o.OooOO0(i), -1.0f);
    }

    public final void OooO0O0(C1232oOoOo0oO c1232oOoOo0oO, C1232oOoOo0oO c1232oOoOo0oO2, C1232oOoOo0oO c1232oOoOo0oO3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.OooO0O0 = i;
        }
        if (!z) {
            this.OooO0Oo.OooOO0(c1232oOoOo0oO, -1.0f);
            this.OooO0Oo.OooOO0(c1232oOoOo0oO2, 1.0f);
            this.OooO0Oo.OooOO0(c1232oOoOo0oO3, 1.0f);
            return;
        }
        this.OooO0Oo.OooOO0(c1232oOoOo0oO, 1.0f);
        this.OooO0Oo.OooOO0(c1232oOoOo0oO2, -1.0f);
        this.OooO0Oo.OooOO0(c1232oOoOo0oO3, -1.0f);
    }

    public final void OooO0OO(C1232oOoOo0oO c1232oOoOo0oO, C1232oOoOo0oO c1232oOoOo0oO2, C1232oOoOo0oO c1232oOoOo0oO3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.OooO0O0 = i;
        }
        if (!z) {
            this.OooO0Oo.OooOO0(c1232oOoOo0oO, -1.0f);
            this.OooO0Oo.OooOO0(c1232oOoOo0oO2, 1.0f);
            this.OooO0Oo.OooOO0(c1232oOoOo0oO3, -1.0f);
            return;
        }
        this.OooO0Oo.OooOO0(c1232oOoOo0oO, 1.0f);
        this.OooO0Oo.OooOO0(c1232oOoOo0oO2, -1.0f);
        this.OooO0Oo.OooOO0(c1232oOoOo0oO3, 1.0f);
    }

    public C1232oOoOo0oO OooO0Oo(boolean[] zArr) {
        return OooO0o(zArr, null);
    }

    public final C1232oOoOo0oO OooO0o(boolean[] zArr, C1232oOoOo0oO c1232oOoOo0oO) {
        int i;
        int OooO0o = this.OooO0Oo.OooO0o();
        C1232oOoOo0oO c1232oOoOo0oO2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < OooO0o; i2++) {
            float OooO0oo = this.OooO0Oo.OooO0oo(i2);
            if (OooO0oo < 0.0f) {
                C1232oOoOo0oO OooO0oO = this.OooO0Oo.OooO0oO(i2);
                if ((zArr == null || !zArr[OooO0oO.OooO0O0]) && OooO0oO != c1232oOoOo0oO && (((i = OooO0oO.OooOO0o) == 3 || i == 4) && OooO0oo < f)) {
                    f = OooO0oo;
                    c1232oOoOo0oO2 = OooO0oO;
                }
            }
        }
        return c1232oOoOo0oO2;
    }

    public boolean OooO0o0() {
        if (this.OooO00o == null && this.OooO0O0 == 0.0f && this.OooO0Oo.OooO0o() == 0) {
            return true;
        }
        return false;
    }

    public final void OooO0oO(C1232oOoOo0oO c1232oOoOo0oO) {
        C1232oOoOo0oO c1232oOoOo0oO2 = this.OooO00o;
        if (c1232oOoOo0oO2 != null) {
            this.OooO0Oo.OooOO0(c1232oOoOo0oO2, -1.0f);
            this.OooO00o.OooO0OO = -1;
            this.OooO00o = null;
        }
        float OooOO0O = this.OooO0Oo.OooOO0O(c1232oOoOo0oO, true) * (-1.0f);
        this.OooO00o = c1232oOoOo0oO;
        if (OooOO0O == 1.0f) {
            return;
        }
        this.OooO0O0 /= OooOO0O;
        this.OooO0Oo.OooO0Oo(OooOO0O);
    }

    public final void OooO0oo(oO0OO0O oo0oo0o, C1232oOoOo0oO c1232oOoOo0oO, boolean z) {
        if (c1232oOoOo0oO != null && c1232oOoOo0oO.OooO0o) {
            float OooO0o0 = this.OooO0Oo.OooO0o0(c1232oOoOo0oO);
            this.OooO0O0 = (c1232oOoOo0oO.OooO0o0 * OooO0o0) + this.OooO0O0;
            this.OooO0Oo.OooOO0O(c1232oOoOo0oO, z);
            if (z) {
                c1232oOoOo0oO.OooO0O0(this);
            }
            if (this.OooO0Oo.OooO0o() == 0) {
                this.OooO0o0 = true;
                oo0oo0o.OooO0O0 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            com.ninja.engine.oOoOo0oO r0 = r10.OooO00o
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            com.ninja.engine.oOoOo0oO r1 = r10.OooO00o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.ninja.engine.AbstractC1230oOoOo0o.OooO0oO(r0, r1)
            float r1 = r10.OooO0O0
            r2 = 1
            r3 = 0
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.OooO0O0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L3a
        L39:
            r1 = 0
        L3a:
            com.ninja.engine.o00OO0 r5 = r10.OooO0Oo
            int r5 = r5.OooO0o()
        L40:
            if (r3 >= r5) goto L9d
            com.ninja.engine.o00OO0 r6 = r10.OooO0Oo
            com.ninja.engine.oOoOo0oO r6 = r6.OooO0oO(r3)
            if (r6 != 0) goto L4b
            goto L9a
        L4b:
            com.ninja.engine.o00OO0 r7 = r10.OooO0Oo
            float r7 = r7.OooO0oo(r3)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9a
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6b
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L77
            java.lang.String r1 = "- "
        L64:
            java.lang.String r0 = com.ninja.engine.AbstractC1230oOoOo0o.OooO0oO(r0, r1)
            float r7 = r7 * r9
            goto L77
        L6b:
            if (r8 <= 0) goto L74
            java.lang.String r1 = " + "
            java.lang.String r0 = com.ninja.engine.AbstractC1230oOoOo0o.OooO0oO(r0, r1)
            goto L77
        L74:
            java.lang.String r1 = " - "
            goto L64
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L82
            java.lang.String r0 = com.ninja.engine.AbstractC1230oOoOo0o.OooO0oO(r0, r6)
            goto L99
        L82:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L99:
            r1 = 1
        L9a:
            int r3 = r3 + 1
            goto L40
        L9d:
            if (r1 != 0) goto La5
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.ninja.engine.AbstractC1230oOoOo0o.OooO0oO(r0, r1)
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0146o00OO0oo.toString():java.lang.String");
    }
}


