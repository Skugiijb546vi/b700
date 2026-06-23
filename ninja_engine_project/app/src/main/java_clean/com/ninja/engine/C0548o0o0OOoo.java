package com.ninja.engine;
/* renamed from: com.ninja.engine.o0o0OOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548o0o0OOoo {
    public int OooO;
    public int OooO00o;
    public C0304o0O0OoO OooO0Oo;
    public C0304o0O0OoO OooO0o;
    public C0304o0O0OoO OooO0o0;
    public C0304o0O0OoO OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public final /* synthetic */ C0550o0o0Oo0 OooOOo;
    public int OooOOo0;
    public C0316o0O0o0o OooO0O0 = null;
    public int OooO0OO = 0;
    public int OooOO0o = 0;
    public int OooOOO0 = 0;
    public int OooOOO = 0;
    public int OooOOOO = 0;
    public int OooOOOo = 0;

    public C0548o0o0OOoo(C0550o0o0Oo0 c0550o0o0Oo0, int i, C0304o0O0OoO c0304o0O0OoO, C0304o0O0OoO c0304o0O0OoO2, C0304o0O0OoO c0304o0O0OoO3, C0304o0O0OoO c0304o0O0OoO4, int i2) {
        this.OooOOo = c0550o0o0Oo0;
        this.OooO0oo = 0;
        this.OooO = 0;
        this.OooOO0 = 0;
        this.OooOO0O = 0;
        this.OooOOo0 = 0;
        this.OooO00o = i;
        this.OooO0Oo = c0304o0O0OoO;
        this.OooO0o0 = c0304o0O0OoO2;
        this.OooO0o = c0304o0O0OoO3;
        this.OooO0oO = c0304o0O0OoO4;
        this.OooO0oo = c0550o0o0Oo0.o0ooOoO;
        this.OooO = c0550o0o0Oo0.o00oO0o;
        this.OooOO0 = c0550o0o0Oo0.o0OOO0o;
        this.OooOO0O = c0550o0o0Oo0.o00oO0O;
        this.OooOOo0 = i2;
    }

    public final void OooO00o(C0316o0O0o0o c0316o0O0o0o) {
        int i = this.OooO00o;
        int i2 = 0;
        C0550o0o0Oo0 c0550o0o0Oo0 = this.OooOOo;
        if (i == 0) {
            int OoooOO0 = c0550o0o0Oo0.OoooOO0(c0316o0O0o0o, this.OooOOo0);
            if (c0316o0O0o0o.o00o0O[0] == 3) {
                this.OooOOOo++;
                OoooOO0 = 0;
            }
            int i3 = c0550o0o0Oo0.o0000;
            if (c0316o0O0o0o.Oooooo0 != 8) {
                i2 = i3;
            }
            this.OooOO0o = OoooOO0 + i2 + this.OooOO0o;
            int OoooO = c0550o0o0Oo0.OoooO(c0316o0O0o0o, this.OooOOo0);
            if (this.OooO0O0 == null || this.OooO0OO < OoooO) {
                this.OooO0O0 = c0316o0O0o0o;
                this.OooO0OO = OoooO;
                this.OooOOO0 = OoooO;
            }
        } else {
            int OoooOO02 = c0550o0o0Oo0.OoooOO0(c0316o0O0o0o, this.OooOOo0);
            int OoooO2 = c0550o0o0Oo0.OoooO(c0316o0O0o0o, this.OooOOo0);
            if (c0316o0O0o0o.o00o0O[1] == 3) {
                this.OooOOOo++;
                OoooO2 = 0;
            }
            int i4 = c0550o0o0Oo0.o0000O00;
            if (c0316o0O0o0o.Oooooo0 != 8) {
                i2 = i4;
            }
            this.OooOOO0 = OoooO2 + i2 + this.OooOOO0;
            if (this.OooO0O0 == null || this.OooO0OO < OoooOO02) {
                this.OooO0O0 = c0316o0O0o0o;
                this.OooO0OO = OoooOO02;
                this.OooOO0o = OoooOO02;
            }
        }
        this.OooOOOO++;
    }

    public final void OooO0O0(int i, boolean z, boolean z2) {
        C0550o0o0Oo0 c0550o0o0Oo0;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C0316o0O0o0o c0316o0O0o0o;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        float f2;
        int i11;
        float f3;
        float f4;
        int i12;
        int i13;
        int i14;
        int i15 = this.OooOOOO;
        int i16 = 0;
        while (true) {
            c0550o0o0Oo0 = this.OooOOo;
            if (i16 >= i15 || (i14 = this.OooOOO + i16) >= c0550o0o0Oo0.o0000Oo0) {
                break;
            }
            C0316o0O0o0o c0316o0O0o0o2 = c0550o0o0Oo0.o0000OOo[i14];
            if (c0316o0O0o0o2 != null) {
                c0316o0O0o0o2.OooOooO();
            }
            i16++;
        }
        if (i15 != 0 && this.OooO0O0 != null) {
            if (z2 && i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i17 = -1;
            int i18 = -1;
            for (int i19 = 0; i19 < i15; i19++) {
                if (z) {
                    i13 = (i15 - 1) - i19;
                } else {
                    i13 = i19;
                }
                int i20 = this.OooOOO + i13;
                if (i20 >= c0550o0o0Oo0.o0000Oo0) {
                    break;
                }
                C0316o0O0o0o c0316o0O0o0o3 = c0550o0o0Oo0.o0000OOo[i20];
                if (c0316o0O0o0o3 != null && c0316o0O0o0o3.Oooooo0 == 0) {
                    if (i17 == -1) {
                        i17 = i19;
                    }
                    i18 = i19;
                }
            }
            if (this.OooO00o == 0) {
                C0316o0O0o0o c0316o0O0o0o4 = this.OooO0O0;
                c0316o0O0o0o4.Ooooooo = c0550o0o0Oo0.o000000O;
                int i21 = this.OooO;
                if (i > 0) {
                    i21 += c0550o0o0Oo0.o0000O00;
                }
                C0304o0O0OoO c0304o0O0OoO = this.OooO0o0;
                C0304o0O0OoO c0304o0O0OoO2 = c0316o0O0o0o4.Oooo0O0;
                c0304o0O0OoO2.OooO00o(c0304o0O0OoO, i21);
                C0304o0O0OoO c0304o0O0OoO3 = c0316o0O0o0o4.Oooo0o0;
                if (z2) {
                    c0304o0O0OoO3.OooO00o(this.OooO0oO, this.OooOO0O);
                }
                if (i > 0) {
                    this.OooO0o0.OooO0Oo.Oooo0o0.OooO00o(c0304o0O0OoO2, 0);
                }
                if (c0550o0o0Oo0.o0000oO == 3 && !c0316o0O0o0o4.OooOooo) {
                    for (int i22 = 0; i22 < i15; i22++) {
                        if (z) {
                            i12 = (i15 - 1) - i22;
                        } else {
                            i12 = i22;
                        }
                        int i23 = this.OooOOO + i12;
                        if (i23 >= c0550o0o0Oo0.o0000Oo0) {
                            break;
                        }
                        c0316o0O0o0o = c0550o0o0Oo0.o0000OOo[i23];
                        if (c0316o0O0o0o.OooOooo) {
                            break;
                        }
                    }
                }
                c0316o0O0o0o = c0316o0O0o0o4;
                C0316o0O0o0o c0316o0O0o0o5 = null;
                int i24 = 0;
                while (i24 < i15) {
                    if (z) {
                        i7 = (i15 - 1) - i24;
                    } else {
                        i7 = i24;
                    }
                    int i25 = this.OooOOO + i7;
                    if (i25 < c0550o0o0Oo0.o0000Oo0) {
                        C0316o0O0o0o c0316o0O0o0o6 = c0550o0o0Oo0.o0000OOo[i25];
                        if (c0316o0O0o0o6 == null) {
                            i8 = i15;
                        } else {
                            C0304o0O0OoO c0304o0O0OoO4 = c0316o0O0o0o6.Oooo0;
                            if (i24 == 0) {
                                c0316o0O0o0o6.OooO0o(c0304o0O0OoO4, this.OooO0Oo, this.OooO0oo);
                            }
                            if (i7 == 0) {
                                int i26 = c0550o0o0Oo0.o000000;
                                if (z) {
                                    i10 = i26;
                                    f = 1.0f - c0550o0o0Oo0.o00000OO;
                                } else {
                                    i10 = i26;
                                    f = c0550o0o0Oo0.o00000OO;
                                }
                                if (this.OooOOO == 0) {
                                    int i27 = c0550o0o0Oo0.o000000o;
                                    f2 = f;
                                    if (i27 != -1) {
                                        if (z) {
                                            f4 = 1.0f - c0550o0o0Oo0.o00000o0;
                                        } else {
                                            f4 = c0550o0o0Oo0.o00000o0;
                                        }
                                        f3 = f4;
                                        i11 = i27;
                                        c0316o0O0o0o6.OoooooO = i11;
                                        c0316o0O0o0o6.OooooO0 = f3;
                                    }
                                } else {
                                    f2 = f;
                                }
                                if (z2 && (i11 = c0550o0o0Oo0.o00000O0) != -1) {
                                    if (z) {
                                        f3 = 1.0f - c0550o0o0Oo0.o00000oO;
                                    } else {
                                        f3 = c0550o0o0Oo0.o00000oO;
                                    }
                                } else {
                                    i11 = i10;
                                    f3 = f2;
                                }
                                c0316o0O0o0o6.OoooooO = i11;
                                c0316o0O0o0o6.OooooO0 = f3;
                            }
                            if (i24 == i15 - 1) {
                                i8 = i15;
                                c0316o0O0o0o6.OooO0o(c0316o0O0o0o6.Oooo0OO, this.OooO0o, this.OooOO0);
                            } else {
                                i8 = i15;
                            }
                            if (c0316o0O0o0o5 != null) {
                                int i28 = c0550o0o0Oo0.o0000;
                                C0304o0O0OoO c0304o0O0OoO5 = c0316o0O0o0o5.Oooo0OO;
                                c0304o0O0OoO4.OooO00o(c0304o0O0OoO5, i28);
                                if (i24 == i17) {
                                    int i29 = this.OooO0oo;
                                    if (c0304o0O0OoO4.OooO0oo()) {
                                        c0304o0O0OoO4.OooO0oo = i29;
                                    }
                                }
                                c0304o0O0OoO5.OooO00o(c0304o0O0OoO4, 0);
                                if (i24 == i18 + 1) {
                                    int i30 = this.OooOO0;
                                    if (c0304o0O0OoO5.OooO0oo()) {
                                        c0304o0O0OoO5.OooO0oo = i30;
                                    }
                                }
                            }
                            if (c0316o0O0o0o6 != c0316o0O0o0o4) {
                                int i31 = c0550o0o0Oo0.o0000oO;
                                if (i31 == 3 && c0316o0O0o0o.OooOooo && c0316o0O0o0o6 != c0316o0O0o0o && c0316o0O0o0o6.OooOooo) {
                                    c0316o0O0o0o6.Oooo0o.OooO00o(c0316o0O0o0o.Oooo0o, 0);
                                } else {
                                    C0304o0O0OoO c0304o0O0OoO6 = c0316o0O0o0o6.Oooo0O0;
                                    if (i31 != 0) {
                                        C0304o0O0OoO c0304o0O0OoO7 = c0316o0O0o0o6.Oooo0o0;
                                        if (i31 != 1) {
                                            if (z3) {
                                                c0304o0O0OoO6.OooO00o(this.OooO0o0, this.OooO);
                                                c0304o0O0OoO7.OooO00o(this.OooO0oO, this.OooOO0O);
                                            } else {
                                                i9 = 0;
                                                c0304o0O0OoO6.OooO00o(c0304o0O0OoO2, 0);
                                            }
                                        } else {
                                            i9 = 0;
                                        }
                                        c0304o0O0OoO7.OooO00o(c0304o0O0OoO3, i9);
                                    } else {
                                        c0304o0O0OoO6.OooO00o(c0304o0O0OoO2, 0);
                                    }
                                }
                            }
                            c0316o0O0o0o5 = c0316o0O0o0o6;
                        }
                        i24++;
                        i15 = i8;
                    } else {
                        return;
                    }
                }
                return;
            }
            C0316o0O0o0o c0316o0O0o0o7 = this.OooO0O0;
            c0316o0O0o0o7.OoooooO = c0550o0o0Oo0.o000000;
            int i32 = this.OooO0oo;
            if (i > 0) {
                i32 += c0550o0o0Oo0.o0000;
            }
            C0304o0O0OoO c0304o0O0OoO8 = c0316o0O0o0o7.Oooo0;
            C0304o0O0OoO c0304o0O0OoO9 = c0316o0O0o0o7.Oooo0OO;
            if (z) {
                c0304o0O0OoO9.OooO00o(this.OooO0o, i32);
                if (z2) {
                    c0304o0O0OoO8.OooO00o(this.OooO0Oo, this.OooOO0);
                }
                if (i > 0) {
                    this.OooO0o.OooO0Oo.Oooo0.OooO00o(c0304o0O0OoO9, 0);
                }
            } else {
                c0304o0O0OoO8.OooO00o(this.OooO0Oo, i32);
                if (z2) {
                    c0304o0O0OoO9.OooO00o(this.OooO0o, this.OooOO0);
                }
                if (i > 0) {
                    this.OooO0Oo.OooO0Oo.Oooo0OO.OooO00o(c0304o0O0OoO8, 0);
                }
            }
            C0316o0O0o0o c0316o0O0o0o8 = null;
            for (int i33 = 0; i33 < i15; i33++) {
                int i34 = this.OooOOO + i33;
                if (i34 < c0550o0o0Oo0.o0000Oo0) {
                    C0316o0O0o0o c0316o0O0o0o9 = c0550o0o0Oo0.o0000OOo[i34];
                    if (c0316o0O0o0o9 != null) {
                        C0304o0O0OoO c0304o0O0OoO10 = c0316o0O0o0o9.Oooo0O0;
                        if (i33 == 0) {
                            c0316o0O0o0o9.OooO0o(c0304o0O0OoO10, this.OooO0o0, this.OooO);
                            int i35 = c0550o0o0Oo0.o000000O;
                            float f5 = c0550o0o0Oo0.o00000Oo;
                            if (this.OooOOO == 0) {
                                i6 = c0550o0o0Oo0.o00000;
                                i4 = i35;
                                i5 = -1;
                                if (i6 != -1) {
                                    f5 = c0550o0o0Oo0.o0000Ooo;
                                    c0316o0O0o0o9.Ooooooo = i6;
                                    c0316o0O0o0o9.OooooOO = f5;
                                }
                            } else {
                                i4 = i35;
                                i5 = -1;
                            }
                            if (z2 && (i6 = c0550o0o0Oo0.o00000O) != i5) {
                                f5 = c0550o0o0Oo0.o00000oo;
                            } else {
                                i6 = i4;
                            }
                            c0316o0O0o0o9.Ooooooo = i6;
                            c0316o0O0o0o9.OooooOO = f5;
                        }
                        if (i33 == i15 - 1) {
                            c0316o0O0o0o9.OooO0o(c0316o0O0o0o9.Oooo0o0, this.OooO0oO, this.OooOO0O);
                        }
                        if (c0316o0O0o0o8 != null) {
                            int i36 = c0550o0o0Oo0.o0000O00;
                            C0304o0O0OoO c0304o0O0OoO11 = c0316o0O0o0o8.Oooo0o0;
                            c0304o0O0OoO10.OooO00o(c0304o0O0OoO11, i36);
                            if (i33 == i17) {
                                int i37 = this.OooO;
                                if (c0304o0O0OoO10.OooO0oo()) {
                                    c0304o0O0OoO10.OooO0oo = i37;
                                }
                            }
                            c0304o0O0OoO11.OooO00o(c0304o0O0OoO10, 0);
                            if (i33 == i18 + 1) {
                                int i38 = this.OooOO0O;
                                if (c0304o0O0OoO11.OooO0oo()) {
                                    c0304o0O0OoO11.OooO0oo = i38;
                                }
                            }
                        }
                        if (c0316o0O0o0o9 != c0316o0O0o0o7) {
                            C0304o0O0OoO c0304o0O0OoO12 = c0316o0O0o0o9.Oooo0OO;
                            C0304o0O0OoO c0304o0O0OoO13 = c0316o0O0o0o9.Oooo0;
                            if (z) {
                                int i39 = c0550o0o0Oo0.o0000oo;
                                if (i39 != 0) {
                                    if (i39 != 1) {
                                        if (i39 == 2) {
                                            i3 = 0;
                                            c0304o0O0OoO13.OooO00o(c0304o0O0OoO8, 0);
                                        }
                                    } else {
                                        c0304o0O0OoO13.OooO00o(c0304o0O0OoO8, 0);
                                    }
                                } else {
                                    i3 = 0;
                                }
                                c0304o0O0OoO12.OooO00o(c0304o0O0OoO9, i3);
                            } else {
                                int i40 = c0550o0o0Oo0.o0000oo;
                                if (i40 != 0) {
                                    if (i40 != 1) {
                                        if (i40 == 2) {
                                            if (z3) {
                                                c0304o0O0OoO13.OooO00o(this.OooO0Oo, this.OooO0oo);
                                                c0304o0O0OoO12.OooO00o(this.OooO0o, this.OooOO0);
                                            } else {
                                                i2 = 0;
                                                c0304o0O0OoO13.OooO00o(c0304o0O0OoO8, 0);
                                            }
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    c0304o0O0OoO12.OooO00o(c0304o0O0OoO9, i2);
                                } else {
                                    c0304o0O0OoO13.OooO00o(c0304o0O0OoO8, 0);
                                }
                                c0316o0O0o0o8 = c0316o0O0o0o9;
                            }
                        }
                        c0316o0O0o0o8 = c0316o0O0o0o9;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final int OooO0OO() {
        if (this.OooO00o == 1) {
            return this.OooOOO0 - this.OooOOo.o0000O00;
        }
        return this.OooOOO0;
    }

    public final int OooO0Oo() {
        if (this.OooO00o == 0) {
            return this.OooOO0o - this.OooOOo.o0000;
        }
        return this.OooOO0o;
    }

    public final void OooO0o(int i, C0304o0O0OoO c0304o0O0OoO, C0304o0O0OoO c0304o0O0OoO2, C0304o0O0OoO c0304o0O0OoO3, C0304o0O0OoO c0304o0O0OoO4, int i2, int i3, int i4, int i5, int i6) {
        this.OooO00o = i;
        this.OooO0Oo = c0304o0O0OoO;
        this.OooO0o0 = c0304o0O0OoO2;
        this.OooO0o = c0304o0O0OoO3;
        this.OooO0oO = c0304o0O0OoO4;
        this.OooO0oo = i2;
        this.OooO = i3;
        this.OooOO0 = i4;
        this.OooOO0O = i5;
        this.OooOOo0 = i6;
    }

    public final void OooO0o0(int i) {
        C0550o0o0Oo0 c0550o0o0Oo0;
        int i2;
        int i3;
        int OooOOo0;
        int i4;
        int i5 = this.OooOOOo;
        if (i5 == 0) {
            return;
        }
        int i6 = this.OooOOOO;
        int i7 = i / i5;
        int i8 = 0;
        while (true) {
            c0550o0o0Oo0 = this.OooOOo;
            if (i8 >= i6 || (i2 = this.OooOOO + i8) >= c0550o0o0Oo0.o0000Oo0) {
                break;
            }
            C0316o0O0o0o c0316o0O0o0o = c0550o0o0Oo0.o0000OOo[i2];
            int i9 = 1;
            if (this.OooO00o == 0) {
                if (c0316o0O0o0o != null) {
                    int[] iArr = c0316o0O0o0o.o00o0O;
                    if (iArr[0] == 3 && c0316o0O0o0o.OooOOo == 0) {
                        int i10 = iArr[1];
                        i3 = 1;
                        OooOOo0 = i7;
                        i9 = i10;
                        i4 = c0316o0O0o0o.OooOO0O();
                        c0550o0o0Oo0.OoooOOO(i3, OooOOo0, i9, i4, c0316o0O0o0o);
                    }
                }
                i8++;
            } else {
                if (c0316o0O0o0o != null) {
                    int[] iArr2 = c0316o0O0o0o.o00o0O;
                    if (iArr2[1] == 3 && c0316o0O0o0o.OooOOoo == 0) {
                        i3 = iArr2[0];
                        OooOOo0 = c0316o0O0o0o.OooOOo0();
                        i4 = i7;
                        c0550o0o0Oo0.OoooOOO(i3, OooOOo0, i9, i4, c0316o0O0o0o);
                    }
                }
                i8++;
            }
        }
        this.OooOO0o = 0;
        this.OooOOO0 = 0;
        this.OooO0O0 = null;
        this.OooO0OO = 0;
        int i11 = this.OooOOOO;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.OooOOO + i12;
            if (i13 < c0550o0o0Oo0.o0000Oo0) {
                C0316o0O0o0o c0316o0O0o0o2 = c0550o0o0Oo0.o0000OOo[i13];
                if (this.OooO00o == 0) {
                    int OooOOo02 = c0316o0O0o0o2.OooOOo0();
                    int i14 = c0550o0o0Oo0.o0000;
                    if (c0316o0O0o0o2.Oooooo0 == 8) {
                        i14 = 0;
                    }
                    this.OooOO0o = OooOOo02 + i14 + this.OooOO0o;
                    int OoooO = c0550o0o0Oo0.OoooO(c0316o0O0o0o2, this.OooOOo0);
                    if (this.OooO0O0 == null || this.OooO0OO < OoooO) {
                        this.OooO0O0 = c0316o0O0o0o2;
                        this.OooO0OO = OoooO;
                        this.OooOOO0 = OoooO;
                    }
                } else {
                    int OoooOO0 = c0550o0o0Oo0.OoooOO0(c0316o0O0o0o2, this.OooOOo0);
                    int OoooO2 = c0550o0o0Oo0.OoooO(c0316o0O0o0o2, this.OooOOo0);
                    int i15 = c0550o0o0Oo0.o0000O00;
                    if (c0316o0O0o0o2.Oooooo0 == 8) {
                        i15 = 0;
                    }
                    this.OooOOO0 = OoooO2 + i15 + this.OooOOO0;
                    if (this.OooO0O0 == null || this.OooO0OO < OoooOO0) {
                        this.OooO0O0 = c0316o0O0o0o2;
                        this.OooO0OO = OoooOO0;
                        this.OooOO0o = OoooOO0;
                    }
                }
            } else {
                return;
            }
        }
    }
}


