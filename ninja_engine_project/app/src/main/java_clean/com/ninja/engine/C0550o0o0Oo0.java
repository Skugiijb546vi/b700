package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0o0Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550o0o0Oo0 extends AbstractC0705oO000o0o {
    public int o0000;
    public int o00000;
    public int o000000;
    public int o000000O;
    public int o000000o;
    public int o00000O;
    public int o00000O0;
    public float o00000OO;
    public float o00000Oo;
    public float o00000o0;
    public float o00000oO;
    public float o00000oo;
    public ArrayList o0000O;
    public int o0000O0;
    public int o0000O00;
    public int o0000O0O;
    public C0316o0O0o0o[] o0000OO;
    public C0316o0O0o0o[] o0000OO0;
    public int[] o0000OOO;
    public C0316o0O0o0o[] o0000OOo;
    public int o0000Oo0;
    public float o0000Ooo;
    public int o0000oO;
    public int o0000oo;
    public int o000OO;
    public o0O0o000 o000OOo;
    public int o00oO0O;
    public int o00oO0o;
    public C0189o00o00 o0O0O00;
    public int o0OO00O;
    public int o0OOO0o;
    public boolean o0Oo0oo;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;
    public int oo0o0Oo;

    @Override // com.ninja.engine.C0316o0O0o0o
    public final void OooO0O0(oO0OO0O oo0oo0o, boolean z) {
        boolean z2;
        boolean z3;
        C0316o0O0o0o c0316o0O0o0o;
        float f;
        int i;
        boolean z4;
        super.OooO0O0(oo0oo0o, z);
        C0316o0O0o0o c0316o0O0o0o2 = this.OoooO;
        if (c0316o0O0o0o2 != null && ((C0580o0oOo0O0) c0316o0O0o0o2).o0ooOOo) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.o0000O0;
        ArrayList arrayList = this.o0000O;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            C0548o0o0OOoo c0548o0o0OOoo = (C0548o0o0OOoo) arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c0548o0o0OOoo.OooO0O0(i3, z2, z4);
                        }
                    }
                } else if (this.o0000OOO != null && this.o0000OO != null && this.o0000OO0 != null) {
                    for (int i4 = 0; i4 < this.o0000Oo0; i4++) {
                        this.o0000OOo[i4].OooOooO();
                    }
                    int[] iArr = this.o0000OOO;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.o00000OO;
                    C0316o0O0o0o c0316o0O0o0o3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.o00000OO;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        C0316o0O0o0o c0316o0O0o0o4 = this.o0000OO[i];
                        if (c0316o0O0o0o4 != null && c0316o0O0o0o4.Oooooo0 != 8) {
                            C0304o0O0OoO c0304o0O0OoO = c0316o0O0o0o4.Oooo0;
                            if (i7 == 0) {
                                c0316o0O0o0o4.OooO0o(c0304o0O0OoO, this.Oooo0, this.o0ooOoO);
                                c0316o0O0o0o4.OoooooO = this.o000000;
                                c0316o0O0o0o4.OooooO0 = f;
                            }
                            if (i7 == i5 - 1) {
                                c0316o0O0o0o4.OooO0o(c0316o0O0o0o4.Oooo0OO, this.Oooo0OO, this.o0OOO0o);
                            }
                            if (i7 > 0 && c0316o0O0o0o3 != null) {
                                int i8 = this.o0000;
                                C0304o0O0OoO c0304o0O0OoO2 = c0316o0O0o0o3.Oooo0OO;
                                c0316o0O0o0o4.OooO0o(c0304o0O0OoO, c0304o0O0OoO2, i8);
                                c0316o0O0o0o3.OooO0o(c0304o0O0OoO2, c0304o0O0OoO, 0);
                            }
                            c0316o0O0o0o3 = c0316o0O0o0o4;
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i9 = 0; i9 < i6; i9++) {
                        C0316o0O0o0o c0316o0O0o0o5 = this.o0000OO0[i9];
                        if (c0316o0O0o0o5 != null && c0316o0O0o0o5.Oooooo0 != 8) {
                            C0304o0O0OoO c0304o0O0OoO3 = c0316o0O0o0o5.Oooo0O0;
                            if (i9 == 0) {
                                c0316o0O0o0o5.OooO0o(c0304o0O0OoO3, this.Oooo0O0, this.o00oO0o);
                                c0316o0O0o0o5.Ooooooo = this.o000000O;
                                c0316o0O0o0o5.OooooOO = this.o00000Oo;
                            }
                            if (i9 == i6 - 1) {
                                c0316o0O0o0o5.OooO0o(c0316o0O0o0o5.Oooo0o0, this.Oooo0o0, this.o00oO0O);
                            }
                            if (i9 > 0 && c0316o0O0o0o3 != null) {
                                int i10 = this.o0000O00;
                                C0304o0O0OoO c0304o0O0OoO4 = c0316o0O0o0o3.Oooo0o0;
                                c0316o0O0o0o5.OooO0o(c0304o0O0OoO3, c0304o0O0OoO4, i10);
                                c0316o0O0o0o3.OooO0o(c0304o0O0OoO4, c0304o0O0OoO3, 0);
                            }
                            c0316o0O0o0o3 = c0316o0O0o0o5;
                        }
                    }
                    for (int i11 = 0; i11 < i5; i11++) {
                        for (int i12 = 0; i12 < i6; i12++) {
                            int i13 = (i12 * i5) + i11;
                            if (this.o000OO == 1) {
                                i13 = (i11 * i6) + i12;
                            }
                            C0316o0O0o0o[] c0316o0O0o0oArr = this.o0000OOo;
                            if (i13 < c0316o0O0o0oArr.length && (c0316o0O0o0o = c0316o0O0o0oArr[i13]) != null && c0316o0O0o0o.Oooooo0 != 8) {
                                C0316o0O0o0o c0316o0O0o0o6 = this.o0000OO[i11];
                                C0316o0O0o0o c0316o0O0o0o7 = this.o0000OO0[i12];
                                if (c0316o0O0o0o != c0316o0O0o0o6) {
                                    c0316o0O0o0o.OooO0o(c0316o0O0o0o.Oooo0, c0316o0O0o0o6.Oooo0, 0);
                                    c0316o0O0o0o.OooO0o(c0316o0O0o0o.Oooo0OO, c0316o0O0o0o6.Oooo0OO, 0);
                                }
                                if (c0316o0O0o0o != c0316o0O0o0o7) {
                                    c0316o0O0o0o.OooO0o(c0316o0O0o0o.Oooo0O0, c0316o0O0o0o7.Oooo0O0, 0);
                                    c0316o0O0o0o.OooO0o(c0316o0O0o0o.Oooo0o0, c0316o0O0o0o7.Oooo0o0, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    C0548o0o0OOoo c0548o0o0OOoo2 = (C0548o0o0OOoo) arrayList.get(i14);
                    if (i14 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0548o0o0OOoo2.OooO0O0(i14, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            ((C0548o0o0OOoo) arrayList.get(0)).OooO0O0(0, z2, true);
        }
        this.o0Oo0oo = false;
    }

    public final int OoooO(C0316o0O0o0o c0316o0O0o0o, int i) {
        if (c0316o0O0o0o == null) {
            return 0;
        }
        int[] iArr = c0316o0O0o0o.o00o0O;
        if (iArr[1] == 3) {
            int i2 = c0316o0O0o0o.OooOOoo;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0316o0O0o0o.OooOoO * i);
                if (i3 != c0316o0O0o0o.OooOO0O()) {
                    c0316o0O0o0o.OooO0oO = true;
                    OoooOOO(iArr[0], c0316o0O0o0o.OooOOo0(), 1, i3, c0316o0O0o0o);
                }
                return i3;
            } else if (i2 == 1) {
                return c0316o0O0o0o.OooOO0O();
            } else {
                if (i2 == 3) {
                    return (int) ((c0316o0O0o0o.OooOOo0() * c0316o0O0o0o.OoooOOO) + 0.5f);
                }
            }
        }
        return c0316o0O0o0o.OooOO0O();
    }

    @Override // com.ninja.engine.AbstractC0705oO000o0o
    public final void OoooO0O() {
        for (int i = 0; i < this.oo000o; i++) {
            C0316o0O0o0o c0316o0O0o0o = this.o00ooo[i];
            if (c0316o0O0o0o != null) {
                c0316o0O0o0o.Oooo000 = true;
            }
        }
    }

    public final int OoooOO0(C0316o0O0o0o c0316o0O0o0o, int i) {
        if (c0316o0O0o0o == null) {
            return 0;
        }
        int[] iArr = c0316o0O0o0o.o00o0O;
        if (iArr[0] == 3) {
            int i2 = c0316o0O0o0o.OooOOo;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0316o0O0o0o.OooOo0o * i);
                if (i3 != c0316o0O0o0o.OooOOo0()) {
                    c0316o0O0o0o.OooO0oO = true;
                    OoooOOO(1, i3, iArr[1], c0316o0O0o0o.OooOO0O(), c0316o0O0o0o);
                }
                return i3;
            } else if (i2 == 1) {
                return c0316o0O0o0o.OooOOo0();
            } else {
                if (i2 == 3) {
                    return (int) ((c0316o0O0o0o.OooOO0O() * c0316o0O0o0o.OoooOOO) + 0.5f);
                }
            }
        }
        return c0316o0O0o0o.OooOOo0();
    }

    public final void OoooOOO(int i, int i2, int i3, int i4, C0316o0O0o0o c0316o0O0o0o) {
        o0O0o000 o0o0o000;
        C0316o0O0o0o c0316o0O0o0o2;
        while (true) {
            o0o0o000 = this.o000OOo;
            if (o0o0o000 != null || (c0316o0O0o0o2 = this.OoooO) == null) {
                break;
            }
            this.o000OOo = ((C0580o0oOo0O0) c0316o0O0o0o2).o0ooOO0;
        }
        C0189o00o00 c0189o00o00 = this.o0O0O00;
        c0189o00o00.OooO00o = i;
        c0189o00o00.OooO0O0 = i3;
        c0189o00o00.OooO0OO = i2;
        c0189o00o00.OooO0Oo = i4;
        o0o0o000.OooO0O0(c0316o0O0o0o, c0189o00o00);
        c0316o0O0o0o.Oooo0oo(c0189o00o00.OooO0o0);
        c0316o0O0o0o.Oooo0o0(c0189o00o00.OooO0o);
        c0316o0O0o0o.OooOooo = c0189o00o00.OooO0oo;
        c0316o0O0o0o.Oooo0(c0189o00o00.OooO0oO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0185, code lost:
        if (r2 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0187, code lost:
        r24 = r11;
        r37 = r5;
        r10 = r6;
        r9 = r7;
        r4 = new com.ninja.engine.C0548o0o0OOoo(r39, r7, r39.Oooo0, r39.Oooo0O0, r39.Oooo0OO, r39.Oooo0o0, r37);
        r4.OooOOO = r9;
        r14.add(r4);
        r0 = r4;
        r3 = r16;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b8, code lost:
        r37 = r5;
        r10 = r6;
        r9 = r7;
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
        if (r9 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
        r3 = (r39.o0000 + r16) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c7, code lost:
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c9, code lost:
        r0.OooO00o(r10);
        r7 = r9 + 1;
        r2 = r24;
        r30 = r37;
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d9, code lost:
        r11 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01dd, code lost:
        r37 = r30;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e3, code lost:
        if (r9 >= r15) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e5, code lost:
        r7 = r1 + 1;
        r10 = r13[r9];
        r11 = r37;
        r16 = OoooO(r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f5, code lost:
        if (r10.o00o0O[1] != 3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f7, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
        if (r3 == r11) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0202, code lost:
        if (((r39.o0000O00 + r3) + r16) <= r11) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0206, code lost:
        if (r0.OooO0O0 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0208, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x020a, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x020b, code lost:
        if (r1 != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x020d, code lost:
        if (r9 <= 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x020f, code lost:
        r2 = r39.o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0211, code lost:
        if (r2 <= 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0213, code lost:
        if (r7 <= r2) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0215, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0216, code lost:
        if (r1 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0218, code lost:
        r37 = r13;
        r7 = new com.ninja.engine.C0548o0o0OOoo(r39, r7, r39.Oooo0, r39.Oooo0O0, r39.Oooo0OO, r39.Oooo0o0, r11);
        r7.OooOOO = r9;
        r14.add(r7);
        r0 = r7;
        r3 = r16;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0238, code lost:
        r37 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023a, code lost:
        if (r9 <= 0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x023c, code lost:
        r3 = (r39.o0000O00 + r16) + r3;
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0244, code lost:
        r1 = r7;
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0247, code lost:
        r0.OooO00o(r10);
        r9 = r9 + 1;
        r2 = r21;
        r13 = r37;
        r37 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0253, code lost:
        r11 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0255, code lost:
        r0 = r14.size();
        r1 = r39.o0ooOoO;
        r3 = r39.o00oO0o;
        r4 = r39.o0OOO0o;
        r5 = r39.o00oO0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0265, code lost:
        if (r12[0] == 2) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026a, code lost:
        if (r12[1] != 2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026d, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x026f, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0270, code lost:
        if (r2 <= 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0272, code lost:
        if (r7 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0274, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0275, code lost:
        if (r2 >= r0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0277, code lost:
        r6 = (com.ninja.engine.C0548o0o0OOoo) r14.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x027d, code lost:
        if (r7 != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x027f, code lost:
        r7 = r6.OooO0Oo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0283, code lost:
        r6.OooO0o0(r11 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0289, code lost:
        r7 = r6.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028e, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0291, code lost:
        r6 = r3;
        r2 = r7;
        r13 = r12;
        r12 = r12;
        r7 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029e, code lost:
        if (r7 >= r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a0, code lost:
        r15 = (com.ninja.engine.C0548o0o0OOoo) r14.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a6, code lost:
        if (r7 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02aa, code lost:
        if (r7 >= (r0 - 1)) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ac, code lost:
        r12 = ((com.ninja.engine.C0548o0o0OOoo) r14.get(r7 + 1)).OooO0O0.Oooo0O0;
        r38 = r14;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02bd, code lost:
        r5 = r39.o00oO0O;
        r38 = r14;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c3, code lost:
        r14 = r15.OooO0O0.Oooo0o0;
        r15.OooO0o(r7, r1, r2, r13, r12, r3, r6, r4, r5, r11);
        r2 = java.lang.Math.max(r9, r15.OooO0Oo());
        r6 = r15.OooO0OO() + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ed, code lost:
        if (r7 <= 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ef, code lost:
        r6 = r6 + r39.o0000O00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02f2, code lost:
        r16 = r0;
        r9 = r2;
        r10 = r6;
        r0 = r13;
        r2 = r14;
        r13 = r38;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02fc, code lost:
        r38 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0300, code lost:
        if (r7 >= (r0 - 1)) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0302, code lost:
        r13 = r38;
        r4 = ((com.ninja.engine.C0548o0o0OOoo) r13.get(r7 + 1)).OooO0O0.Oooo0;
        r16 = r0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0314, code lost:
        r13 = r38;
        r16 = r0;
        r14 = r39.o0OOO0o;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x031d, code lost:
        r0 = r15.OooO0O0.Oooo0OO;
        r15.OooO0o(r7, r1, r2, r4, r12, r3, r6, r14, r5, r11);
        r1 = r15.OooO0Oo() + r9;
        r3 = java.lang.Math.max(r10, r15.OooO0OO());
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0347, code lost:
        if (r7 <= 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0349, code lost:
        r1 = r1 + r39.o0000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x034c, code lost:
        r9 = r1;
        r10 = r3;
        r3 = 0;
        r1 = r0;
        r0 = r4;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0352, code lost:
        r7 = r7 + 1;
        r14 = r13;
        r13 = r0;
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x035a, code lost:
        r31[0] = r9;
        r31[1] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0362, code lost:
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r37 = r13;
        r0 = r39.o000OO;
        r1 = r39.o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0374, code lost:
        if (r0 != 0) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0376, code lost:
        if (r1 > 0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0378, code lost:
        r1 = 0;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x037b, code lost:
        if (r1 >= r15) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x037d, code lost:
        if (r1 <= 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x037f, code lost:
        r2 = r2 + r39.o0000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0382, code lost:
        r4 = r37[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0384, code lost:
        if (r4 != null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0387, code lost:
        r4 = OoooOO0(r4, r20) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038c, code lost:
        if (r4 <= r20) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x038f, code lost:
        r3 = r3 + 1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0392, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0395, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0397, code lost:
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0399, code lost:
        if (r1 > 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x039b, code lost:
        r1 = 0;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x039e, code lost:
        if (r1 >= r15) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a0, code lost:
        if (r1 <= 0) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a2, code lost:
        r2 = r2 + r39.o0000O00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03a5, code lost:
        r4 = r37[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03a7, code lost:
        if (r4 != null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03aa, code lost:
        r4 = OoooO(r4, r20) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03af, code lost:
        if (r4 <= r20) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03b2, code lost:
        r3 = r3 + 1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03b5, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b8, code lost:
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b9, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03bc, code lost:
        if (r39.o0000OOO != null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03be, code lost:
        r39.o0000OOO = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c3, code lost:
        if (r1 != 0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03c6, code lost:
        if (r0 == 1) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03c8, code lost:
        if (r3 != 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03ca, code lost:
        if (r0 != 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03cc, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03ce, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03cf, code lost:
        if (r7 != false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03d1, code lost:
        if (r0 != 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03d3, code lost:
        r1 = (int) java.lang.Math.ceil(r15 / r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03dd, code lost:
        r3 = (int) java.lang.Math.ceil(r15 / r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03e6, code lost:
        r2 = r39.o0000OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03e8, code lost:
        if (r2 == null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03eb, code lost:
        if (r2.length >= r3) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03ed, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03ef, code lost:
        r4 = null;
        java.util.Arrays.fill(r2, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03f4, code lost:
        r39.o0000OO = new com.ninja.engine.C0316o0O0o0o[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03f8, code lost:
        r2 = r39.o0000OO0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03fa, code lost:
        if (r2 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03fd, code lost:
        if (r2.length >= r1) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0400, code lost:
        java.util.Arrays.fill(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0404, code lost:
        r39.o0000OO0 = new com.ninja.engine.C0316o0O0o0o[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0408, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0409, code lost:
        if (r2 >= r3) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x040b, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x040c, code lost:
        if (r4 >= r1) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x040e, code lost:
        r5 = (r4 * r3) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0412, code lost:
        if (r0 != 1) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0414, code lost:
        r5 = (r2 * r1) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0417, code lost:
        r9 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x041a, code lost:
        if (r5 < r9.length) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x041d, code lost:
        r5 = r9[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x041f, code lost:
        if (r5 != null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0422, code lost:
        r6 = OoooOO0(r5, r20);
        r10 = r39.o0000OO[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x042a, code lost:
        if (r10 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0430, code lost:
        if (r10.OooOOo0() >= r6) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0432, code lost:
        r39.o0000OO[r2] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0436, code lost:
        r6 = OoooO(r5, r20);
        r10 = r39.o0000OO0[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x043e, code lost:
        if (r10 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0444, code lost:
        if (r10.OooOO0O() >= r6) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0446, code lost:
        r39.o0000OO0[r4] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x044a, code lost:
        r4 = r4 + 1;
        r37 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x044f, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0454, code lost:
        r9 = r37;
        r2 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0458, code lost:
        if (r2 >= r3) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x045a, code lost:
        r5 = r39.o0000OO[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x045e, code lost:
        if (r5 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0460, code lost:
        if (r2 <= 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0462, code lost:
        r4 = r4 + r39.o0000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0465, code lost:
        r4 = OoooOO0(r5, r20) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x046b, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x046e, code lost:
        r2 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0470, code lost:
        if (r2 >= r1) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0472, code lost:
        r6 = r39.o0000OO0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0476, code lost:
        if (r6 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0478, code lost:
        if (r2 <= 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x047a, code lost:
        r5 = r5 + r39.o0000O00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x047d, code lost:
        r5 = OoooO(r6, r20) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0483, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0486, code lost:
        r31[0] = r4;
        r31[1] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x048c, code lost:
        if (r0 != 0) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x048e, code lost:
        if (r4 <= r20) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0490, code lost:
        if (r3 <= 1) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0492, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0495, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0497, code lost:
        if (r5 <= r20) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0499, code lost:
        if (r1 <= 1) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x049b, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x049d, code lost:
        r37 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04a1, code lost:
        r0 = r39.o0000OOO;
        r0[0] = r3;
        r0[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04ab, code lost:
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r13 = r14;
        r10 = r39.o000OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04bf, code lost:
        if (r15 != 0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x04c3, code lost:
        r13.clear();
        r14 = new com.ninja.engine.C0548o0o0OOoo(r39, r10, r39.Oooo0, r39.Oooo0O0, r39.Oooo0OO, r39.Oooo0o0, r20);
        r13.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04db, code lost:
        if (r10 != 0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04dd, code lost:
        r0 = 0;
        r1 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x04e0, code lost:
        if (r7 >= r15) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x04e2, code lost:
        r6 = r13[r7];
        r16 = OoooOO0(r6, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x04ee, code lost:
        if (r6.o00o0O[0] != 3) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04f0, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04f2, code lost:
        r21 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x04f4, code lost:
        if (r1 == r20) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x04fb, code lost:
        if (((r39.o0000 + r1) + r16) <= r20) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04ff, code lost:
        if (r14.OooO0O0 == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0501, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0503, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0504, code lost:
        if (r0 != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0506, code lost:
        if (r7 <= 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0508, code lost:
        r2 = r39.o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x050a, code lost:
        if (r2 <= 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x050e, code lost:
        if ((r7 % r2) != 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0510, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0511, code lost:
        if (r0 == false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0513, code lost:
        r2 = r10;
        r23 = r12;
        r12 = r6;
        r36 = r10;
        r10 = r7;
        r14 = new com.ninja.engine.C0548o0o0OOoo(r39, r2, r39.Oooo0, r39.Oooo0O0, r39.Oooo0OO, r39.Oooo0o0, r20);
        r14.OooOOO = r10;
        r13.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0534, code lost:
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0537, code lost:
        r36 = r10;
        r23 = r12;
        r12 = r6;
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x053d, code lost:
        if (r10 <= 0) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x053f, code lost:
        r1 = (r39.o0000 + r16) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0545, code lost:
        r14.OooO00o(r12);
        r7 = r10 + 1;
        r0 = r21;
        r12 = r23;
        r10 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0551, code lost:
        r36 = r10;
        r23 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0557, code lost:
        r36 = r10;
        r23 = r12;
        r0 = 0;
        r1 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x055e, code lost:
        if (r10 >= r15) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0560, code lost:
        r12 = r13[r10];
        r16 = OoooO(r12, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x056c, code lost:
        if (r12.o00o0O[1] != 3) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x056e, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0570, code lost:
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0572, code lost:
        if (r1 == r20) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0579, code lost:
        if (((r39.o0000O00 + r1) + r16) <= r20) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x057d, code lost:
        if (r14.OooO0O0 == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x057f, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0581, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0582, code lost:
        if (r0 != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0584, code lost:
        if (r10 <= 0) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0586, code lost:
        r2 = r39.o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0588, code lost:
        if (r2 <= 0) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x058c, code lost:
        if ((r10 % r2) != 0) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x058e, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x058f, code lost:
        if (r0 == false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0591, code lost:
        r14 = new com.ninja.engine.C0548o0o0OOoo(r39, r36, r39.Oooo0, r39.Oooo0O0, r39.Oooo0OO, r39.Oooo0o0, r20);
        r14.OooOOO = r10;
        r13.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x05ab, code lost:
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x05b0, code lost:
        if (r10 <= 0) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x05b2, code lost:
        r1 = (r39.o0000O00 + r16) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x05b8, code lost:
        r14.OooO00o(r12);
        r10 = r10 + 1;
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x05c0, code lost:
        r1 = r13.size();
        r2 = r39.o0ooOoO;
        r3 = r39.o00oO0o;
        r4 = r39.o0OOO0o;
        r5 = r39.o00oO0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x05d0, code lost:
        if (r23[0] == 2) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x05d5, code lost:
        if (r23[1] != 2) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x05d8, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x05da, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05db, code lost:
        if (r0 <= 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05dd, code lost:
        if (r7 == false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x05df, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x05e0, code lost:
        if (r0 >= r1) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x05e2, code lost:
        r6 = (com.ninja.engine.C0548o0o0OOoo) r13.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x05e8, code lost:
        if (r36 != 0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x05ea, code lost:
        r7 = r6.OooO0Oo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x05ee, code lost:
        r6.OooO0o0(r20 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x05f4, code lost:
        r7 = r6.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x05f9, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x05fc, code lost:
        r6 = r3;
        r0 = r1;
        r14 = r12;
        r12 = r12;
        r7 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0609, code lost:
        if (r7 >= r1) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x060b, code lost:
        r15 = (com.ninja.engine.C0548o0o0OOoo) r13.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0611, code lost:
        if (r36 != 0) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0615, code lost:
        if (r7 >= (r1 - 1)) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0617, code lost:
        r12 = ((com.ninja.engine.C0548o0o0OOoo) r13.get(r7 + 1)).OooO0O0.Oooo0O0;
        r38 = r13;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0628, code lost:
        r5 = r39.o00oO0O;
        r38 = r13;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x062e, code lost:
        r13 = r15.OooO0O0.Oooo0o0;
        r15.OooO0o(r36, r0, r2, r14, r12, r3, r6, r4, r5, r20);
        r2 = java.lang.Math.max(r9, r15.OooO0Oo());
        r6 = r15.OooO0OO() + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0658, code lost:
        if (r7 <= 0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x065a, code lost:
        r6 = r6 + r39.o0000O00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x065d, code lost:
        r16 = r1;
        r9 = r2;
        r10 = r6;
        r2 = r13;
        r13 = r38;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0666, code lost:
        r38 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x066a, code lost:
        if (r7 >= (r1 - 1)) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x066c, code lost:
        r13 = r38;
        r16 = r1;
        r14 = ((com.ninja.engine.C0548o0o0OOoo) r13.get(r7 + 1)).OooO0O0.Oooo0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x067f, code lost:
        r13 = r38;
        r4 = r39.o0OOO0o;
        r16 = r1;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0687, code lost:
        r1 = r15.OooO0O0.Oooo0OO;
        r15.OooO0o(r36, r0, r2, r14, r12, r3, r6, r4, r5, r20);
        r0 = r15.OooO0Oo() + r9;
        r3 = java.lang.Math.max(r10, r15.OooO0OO());
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x06b1, code lost:
        if (r7 <= 0) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06b3, code lost:
        r0 = r0 + r39.o0000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06b6, code lost:
        r9 = r0;
        r0 = r1;
        r10 = r3;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06ba, code lost:
        r7 = r7 + 1;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x06c0, code lost:
        r31[0] = r9;
        r31[1] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x06c8, code lost:
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r2 = r39.o000OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x06d8, code lost:
        if (r15 != 0) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x06e0, code lost:
        if (r14.size() != 0) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x06e2, code lost:
        r10 = new com.ninja.engine.C0548o0o0OOoo(r39, r2, r39.Oooo0, r39.Oooo0O0, r39.Oooo0OO, r39.Oooo0o0, r20);
        r14.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x06f7, code lost:
        r10 = (com.ninja.engine.C0548o0o0OOoo) r14.get(0);
        r10.OooO0OO = 0;
        r10.OooO0O0 = null;
        r10.OooOO0o = 0;
        r10.OooOOO0 = 0;
        r10.OooOOO = 0;
        r10.OooOOOO = 0;
        r10.OooOOOo = 0;
        r10.OooO0o(r2, r39.Oooo0, r39.Oooo0O0, r39.Oooo0OO, r39.Oooo0o0, r39.o0ooOoO, r39.o00oO0o, r39.o0OOO0o, r39.o00oO0O, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0737, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0738, code lost:
        if (r0 >= r15) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x073a, code lost:
        r10.OooO00o(r13[r0]);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0742, code lost:
        r1 = 0;
        r31[0] = r10.OooO0Oo();
        r2 = 1;
        r31[1] = r10.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0750, code lost:
        r0 = (r31[r1] + r35) + r34;
        r3 = (r31[r2] + r33) + r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0762, code lost:
        if (r40 != 1073741824) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0764, code lost:
        r0 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0766, code lost:
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x076a, code lost:
        if (r40 != Integer.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x076c, code lost:
        r0 = java.lang.Math.min(r0, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0773, code lost:
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0775, code lost:
        if (r40 != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0778, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x077a, code lost:
        if (r2 != 1073741824) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x077c, code lost:
        r2 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x077f, code lost:
        if (r2 != Integer.MIN_VALUE) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0781, code lost:
        r2 = java.lang.Math.min(r3, r43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0788, code lost:
        if (r2 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x078a, code lost:
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x078c, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x078d, code lost:
        r39.o0OO00O = r0;
        r39.oo0o0Oo = r2;
        Oooo0oo(r0);
        Oooo0o0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0799, code lost:
        if (r39.oo000o <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x079b, code lost:
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x079d, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x079e, code lost:
        r39.o0Oo0oo = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x07a0, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        if (r39.o000000O == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        r39.o000000O = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
        if (r39.o000000O == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
        r1 = r39.o00ooo;
        r14 = 0;
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ac, code lost:
        r15 = r39.oo000o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
        if (r14 >= r15) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
        if (r39.o00ooo[r14].Oooooo0 != 8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
        r18 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
        if (r18 <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c2, code lost:
        r1 = new com.ninja.engine.C0316o0O0o0o[r15 - r18];
        r14 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
        if (r14 >= r39.oo000o) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
        r7 = r39.o00ooo[r14];
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d4, code lost:
        if (r7.Oooooo0 == 8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d6, code lost:
        r1[r15] = r7;
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
        r14 = r14 + 1;
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00df, code lost:
        r20 = r0;
        r13 = r1;
        r39.o0000OOo = r13;
        r39.o0000Oo0 = r15;
        r0 = r39.o0000O0;
        r14 = r39.o0000O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ea, code lost:
        if (r0 == 0) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ec, code lost:
        r7 = r39.Oooo0O0;
        r1 = r39.Oooo0;
        r12 = r39.Oooo0OO;
        r12 = r39.Oooo0o0;
        r12 = r39.o00o0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fd, code lost:
        if (r0 == 1) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0100, code lost:
        if (r0 == 2) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0103, code lost:
        if (r0 == 3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0105, code lost:
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010f, code lost:
        r1 = 0;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0113, code lost:
        r7 = r39.o000OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0115, code lost:
        if (r15 != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0118, code lost:
        r14.clear();
        r30 = r20;
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r11 = 1;
        r0 = new com.ninja.engine.C0548o0o0OOoo(r39, r7, r39.Oooo0, r39.Oooo0O0, r39.Oooo0OO, r39.Oooo0o0, r30);
        r14.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014d, code lost:
        if (r7 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014f, code lost:
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0153, code lost:
        if (r7 >= r15) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0155, code lost:
        r1 = r1 + r11;
        r6 = r13[r7];
        r5 = r30;
        r16 = OoooOO0(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0165, code lost:
        if (r6.o00o0O[0] != 3) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0167, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0169, code lost:
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016a, code lost:
        if (r3 == r5) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0171, code lost:
        if (((r39.o0000 + r3) + r16) <= r5) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0175, code lost:
        if (r0.OooO0O0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0177, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0179, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017a, code lost:
        if (r2 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
        if (r7 <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017e, code lost:
        r4 = r39.o0000O0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0180, code lost:
        if (r4 <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0182, code lost:
        if (r1 <= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0184, code lost:
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o000oOoO(int r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0550o0o0Oo0.o000oOoO(int, int, int, int):void");
    }
}


