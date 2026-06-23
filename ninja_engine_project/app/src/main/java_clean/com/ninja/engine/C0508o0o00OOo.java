package com.ninja.engine;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: com.ninja.engine.o0o00OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508o0o00OOo {
    public final int OooO00o;
    public final int OooO0O0;
    public final long OooO0OO;
    public final byte[] OooO0Oo;

    public C0508o0o00OOo(long j, byte[] bArr, int i, int i2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = j;
        this.OooO0Oo = bArr;
    }

    public static C0508o0o00OOo OooO00o(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0512o0o00Ooo.OooOoo[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C0508o0o00OOo(wrap.array(), 4, 1);
    }

    public static C0508o0o00OOo OooO0O0(C0509o0o00Oo c0509o0o00Oo, ByteOrder byteOrder) {
        C0509o0o00Oo[] c0509o0o00OoArr = {c0509o0o00Oo};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0512o0o00Ooo.OooOoo[5]]);
        wrap.order(byteOrder);
        C0509o0o00Oo c0509o0o00Oo2 = c0509o0o00OoArr[0];
        wrap.putInt((int) c0509o0o00Oo2.OooO00o);
        wrap.putInt((int) c0509o0o00Oo2.OooO0O0);
        return new C0508o0o00OOo(wrap.array(), 5, 1);
    }

    public static C0508o0o00OOo OooO0OO(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0512o0o00Ooo.OooOoo[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new C0508o0o00OOo(wrap.array(), 3, 1);
    }

    public final double OooO0Oo(ByteOrder byteOrder) {
        Serializable OooO0oO = OooO0oO(byteOrder);
        if (OooO0oO != null) {
            if (OooO0oO instanceof String) {
                return Double.parseDouble((String) OooO0oO);
            }
            if (OooO0oO instanceof long[]) {
                long[] jArr = (long[]) OooO0oO;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (OooO0oO instanceof int[]) {
                int[] iArr = (int[]) OooO0oO;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (OooO0oO instanceof double[]) {
                double[] dArr = (double[]) OooO0oO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (OooO0oO instanceof C0509o0o00Oo[]) {
                C0509o0o00Oo[] c0509o0o00OoArr = (C0509o0o00Oo[]) OooO0oO;
                if (c0509o0o00OoArr.length == 1) {
                    C0509o0o00Oo c0509o0o00Oo = c0509o0o00OoArr[0];
                    return c0509o0o00Oo.OooO00o / c0509o0o00Oo.OooO0O0;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final String OooO0o(ByteOrder byteOrder) {
        Serializable OooO0oO = OooO0oO(byteOrder);
        if (OooO0oO == null) {
            return null;
        }
        if (OooO0oO instanceof String) {
            return (String) OooO0oO;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (OooO0oO instanceof long[]) {
            long[] jArr = (long[]) OooO0oO;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (OooO0oO instanceof int[]) {
            int[] iArr = (int[]) OooO0oO;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (OooO0oO instanceof double[]) {
            double[] dArr = (double[]) OooO0oO;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(OooO0oO instanceof C0509o0o00Oo[])) {
            return null;
        } else {
            C0509o0o00Oo[] c0509o0o00OoArr = (C0509o0o00Oo[]) OooO0oO;
            while (i < c0509o0o00OoArr.length) {
                sb.append(c0509o0o00OoArr[i].OooO00o);
                sb.append('/');
                sb.append(c0509o0o00OoArr[i].OooO0O0);
                i++;
                if (i != c0509o0o00OoArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    public final int OooO0o0(ByteOrder byteOrder) {
        Serializable OooO0oO = OooO0oO(byteOrder);
        if (OooO0oO != null) {
            if (OooO0oO instanceof String) {
                return Integer.parseInt((String) OooO0oO);
            }
            if (OooO0oO instanceof long[]) {
                long[] jArr = (long[]) OooO0oO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (OooO0oO instanceof int[]) {
                int[] iArr = (int[]) OooO0oO;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:81|(2:83|(2:84|(2:86|(2:89|90)(1:88))(2:91|92)))|93|(2:95|(6:104|105|106|107|108|109)(3:97|(2:99|100)(2:102|103)|101))|112|106|107|108|109) */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v18, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.ninja.engine.o0o00Oo[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [com.ninja.engine.o0o00Oo[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v23, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v24, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable OooO0oO(java.nio.ByteOrder r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0508o0o00OOo.OooO0oO(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + C0512o0o00Ooo.OooOoo0[this.OooO00o] + ", data length:" + this.OooO0Oo.length + ")";
    }

    public C0508o0o00OOo(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}


