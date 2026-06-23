package com.ninja.engine;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.o0oooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686o0oooo {
    public ByteBuffer OooO0O0;
    public C0690o0oooo0o OooO0OO;
    public final byte[] OooO00o = new byte[256];
    public int OooO0Oo = 0;

    public final boolean OooO00o() {
        if (this.OooO0OO.OooO0O0 != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [com.ninja.engine.o0oooOo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [com.ninja.engine.o0oooOo, java.lang.Object] */
    public final C0690o0oooo0o OooO0O0() {
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr;
        boolean z4;
        if (this.OooO0O0 != null) {
            if (OooO00o()) {
                return this.OooO0OO;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) OooO0OO());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.OooO0OO.OooO0O0 = 1;
            } else {
                this.OooO0OO.OooO0o = this.OooO0O0.getShort();
                this.OooO0OO.OooO0oO = this.OooO0O0.getShort();
                int OooO0OO = OooO0OO();
                C0690o0oooo0o c0690o0oooo0o = this.OooO0OO;
                if ((OooO0OO & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c0690o0oooo0o.OooO0oo = z;
                c0690o0oooo0o.OooO = (int) Math.pow(2.0d, (OooO0OO & 7) + 1);
                this.OooO0OO.OooOO0 = OooO0OO();
                C0690o0oooo0o c0690o0oooo0o2 = this.OooO0OO;
                OooO0OO();
                c0690o0oooo0o2.getClass();
                if (this.OooO0OO.OooO0oo && !OooO00o()) {
                    C0690o0oooo0o c0690o0oooo0o3 = this.OooO0OO;
                    c0690o0oooo0o3.OooO00o = OooO0o0(c0690o0oooo0o3.OooO);
                    C0690o0oooo0o c0690o0oooo0o4 = this.OooO0OO;
                    c0690o0oooo0o4.OooOO0O = c0690o0oooo0o4.OooO00o[c0690o0oooo0o4.OooOO0];
                }
            }
            if (!OooO00o()) {
                boolean z5 = false;
                while (!z5 && !OooO00o() && this.OooO0OO.OooO0OO <= Integer.MAX_VALUE) {
                    int OooO0OO2 = OooO0OO();
                    if (OooO0OO2 != 33) {
                        if (OooO0OO2 != 44) {
                            if (OooO0OO2 != 59) {
                                this.OooO0OO.OooO0O0 = 1;
                            } else {
                                z5 = true;
                            }
                        } else {
                            C0690o0oooo0o c0690o0oooo0o5 = this.OooO0OO;
                            if (c0690o0oooo0o5.OooO0Oo == null) {
                                c0690o0oooo0o5.OooO0Oo = new Object();
                            }
                            c0690o0oooo0o5.OooO0Oo.OooO00o = this.OooO0O0.getShort();
                            this.OooO0OO.OooO0Oo.OooO0O0 = this.OooO0O0.getShort();
                            this.OooO0OO.OooO0Oo.OooO0OO = this.OooO0O0.getShort();
                            this.OooO0OO.OooO0Oo.OooO0Oo = this.OooO0O0.getShort();
                            int OooO0OO3 = OooO0OO();
                            if ((OooO0OO3 & 128) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (OooO0OO3 & 7) + 1);
                            C0683o0oooOo c0683o0oooOo = this.OooO0OO.OooO0Oo;
                            if ((OooO0OO3 & 64) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c0683o0oooOo.OooO0o0 = z3;
                            if (z2) {
                                c0683o0oooOo.OooOO0O = OooO0o0(pow);
                            } else {
                                c0683o0oooOo.OooOO0O = null;
                            }
                            this.OooO0OO.OooO0Oo.OooOO0 = this.OooO0O0.position();
                            OooO0OO();
                            OooO0o();
                            if (!OooO00o()) {
                                C0690o0oooo0o c0690o0oooo0o6 = this.OooO0OO;
                                c0690o0oooo0o6.OooO0OO++;
                                c0690o0oooo0o6.OooO0o0.add(c0690o0oooo0o6.OooO0Oo);
                            }
                        }
                    } else {
                        int OooO0OO4 = OooO0OO();
                        if (OooO0OO4 != 1) {
                            if (OooO0OO4 != 249) {
                                if (OooO0OO4 != 254 && OooO0OO4 == 255) {
                                    OooO0Oo();
                                    StringBuilder sb2 = new StringBuilder();
                                    int i2 = 0;
                                    while (true) {
                                        bArr = this.OooO00o;
                                        if (i2 >= 11) {
                                            break;
                                        }
                                        sb2.append((char) bArr[i2]);
                                        i2++;
                                    }
                                    if (sb2.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            OooO0Oo();
                                            if (bArr[0] == 1) {
                                                byte b = bArr[1];
                                                byte b2 = bArr[2];
                                                this.OooO0OO.getClass();
                                            }
                                            if (this.OooO0Oo > 0) {
                                            }
                                        } while (!OooO00o());
                                    }
                                }
                            } else {
                                this.OooO0OO.OooO0Oo = new Object();
                                OooO0OO();
                                int OooO0OO5 = OooO0OO();
                                C0683o0oooOo c0683o0oooOo2 = this.OooO0OO.OooO0Oo;
                                int i3 = (OooO0OO5 & 28) >> 2;
                                c0683o0oooOo2.OooO0oO = i3;
                                if (i3 == 0) {
                                    c0683o0oooOo2.OooO0oO = 1;
                                }
                                if ((OooO0OO5 & 1) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c0683o0oooOo2.OooO0o = z4;
                                short s = this.OooO0O0.getShort();
                                if (s < 2) {
                                    s = 10;
                                }
                                C0683o0oooOo c0683o0oooOo3 = this.OooO0OO.OooO0Oo;
                                c0683o0oooOo3.OooO = s * 10;
                                c0683o0oooOo3.OooO0oo = OooO0OO();
                                OooO0OO();
                            }
                        }
                        OooO0o();
                    }
                }
                C0690o0oooo0o c0690o0oooo0o7 = this.OooO0OO;
                if (c0690o0oooo0o7.OooO0OO < 0) {
                    c0690o0oooo0o7.OooO0O0 = 1;
                }
            }
            return this.OooO0OO;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int OooO0OO() {
        try {
            return this.OooO0O0.get() & 255;
        } catch (Exception unused) {
            this.OooO0OO.OooO0O0 = 1;
            return 0;
        }
    }

    public final void OooO0Oo() {
        int OooO0OO = OooO0OO();
        this.OooO0Oo = OooO0OO;
        if (OooO0OO > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = this.OooO0Oo;
                    if (i < i2) {
                        int i3 = i2 - i;
                        this.OooO0O0.get(this.OooO00o, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    Log.isLoggable("GifHeaderParser", 3);
                    this.OooO0OO.OooO0O0 = 1;
                    return;
                }
            }
        }
    }

    public final void OooO0o() {
        int OooO0OO;
        do {
            OooO0OO = OooO0OO();
            this.OooO0O0.position(Math.min(this.OooO0O0.position() + OooO0OO, this.OooO0O0.limit()));
        } while (OooO0OO > 0);
    }

    public final int[] OooO0o0(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.OooO0O0.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 2;
                i3 += 3;
                int i5 = i2 + 1;
                iArr[i2] = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (-16777216) | (bArr[i4] & 255);
                i2 = i5;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.OooO0OO.OooO0O0 = 1;
        }
        return iArr;
    }
}
