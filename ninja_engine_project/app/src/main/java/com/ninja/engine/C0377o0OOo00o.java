package com.ninja.engine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0OOo00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377o0OOo00o {
    public C0580o0oOo0O0 OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public C0580o0oOo0O0 OooO0Oo;
    public o0O0o000 OooO0o;
    public ArrayList OooO0o0;
    public C0189o00o00 OooO0oO;
    public ArrayList OooO0oo;

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, com.ninja.engine.oOo00O0] */
    public final void OooO00o(C0379o0OOo0O0 c0379o0OOo0O0, int i, ArrayList arrayList, C1155oOo00O0 c1155oOo00O0) {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00 = c0379o0OOo0O0.OooO0Oo;
        if (abstractC1504oo0OOo00.OooO0OO == null) {
            C0580o0oOo0O0 c0580o0oOo0O0 = this.OooO00o;
            if (abstractC1504oo0OOo00 != c0580o0oOo0O0.OooO0Oo) {
                C1155oOo00O0 c1155oOo00O02 = c1155oOo00O0;
                if (abstractC1504oo0OOo00 != c0580o0oOo0O0.OooO0o0) {
                    if (c1155oOo00O0 == null) {
                        Object obj = new Object();
                        obj.OooO00o = null;
                        obj.OooO0O0 = new ArrayList();
                        obj.OooO00o = abstractC1504oo0OOo00;
                        arrayList.add(obj);
                        c1155oOo00O02 = obj;
                    }
                    abstractC1504oo0OOo00.OooO0OO = c1155oOo00O02;
                    c1155oOo00O02.OooO0O0.add(abstractC1504oo0OOo00);
                    C0379o0OOo0O0 c0379o0OOo0O02 = abstractC1504oo0OOo00.OooO0oo;
                    Iterator it = c0379o0OOo0O02.OooOO0O.iterator();
                    while (it.hasNext()) {
                        InterfaceC0376o0OOo00O interfaceC0376o0OOo00O = (InterfaceC0376o0OOo00O) it.next();
                        if (interfaceC0376o0OOo00O instanceof C0379o0OOo0O0) {
                            OooO00o((C0379o0OOo0O0) interfaceC0376o0OOo00O, i, arrayList, c1155oOo00O02);
                        }
                    }
                    C0379o0OOo0O0 c0379o0OOo0O03 = abstractC1504oo0OOo00.OooO;
                    Iterator it2 = c0379o0OOo0O03.OooOO0O.iterator();
                    while (it2.hasNext()) {
                        InterfaceC0376o0OOo00O interfaceC0376o0OOo00O2 = (InterfaceC0376o0OOo00O) it2.next();
                        if (interfaceC0376o0OOo00O2 instanceof C0379o0OOo0O0) {
                            OooO00o((C0379o0OOo0O0) interfaceC0376o0OOo00O2, i, arrayList, c1155oOo00O02);
                        }
                    }
                    if (i == 1 && (abstractC1504oo0OOo00 instanceof C1435oo00oo)) {
                        Iterator it3 = ((C1435oo00oo) abstractC1504oo0OOo00).OooOO0O.OooOO0O.iterator();
                        while (it3.hasNext()) {
                            InterfaceC0376o0OOo00O interfaceC0376o0OOo00O3 = (InterfaceC0376o0OOo00O) it3.next();
                            if (interfaceC0376o0OOo00O3 instanceof C0379o0OOo0O0) {
                                OooO00o((C0379o0OOo0O0) interfaceC0376o0OOo00O3, i, arrayList, c1155oOo00O02);
                            }
                        }
                    }
                    Iterator it4 = c0379o0OOo0O02.OooOO0o.iterator();
                    while (it4.hasNext()) {
                        OooO00o((C0379o0OOo0O0) it4.next(), i, arrayList, c1155oOo00O02);
                    }
                    Iterator it5 = c0379o0OOo0O03.OooOO0o.iterator();
                    while (it5.hasNext()) {
                        OooO00o((C0379o0OOo0O0) it5.next(), i, arrayList, c1155oOo00O02);
                    }
                    if (i == 1 && (abstractC1504oo0OOo00 instanceof C1435oo00oo)) {
                        Iterator it6 = ((C1435oo00oo) abstractC1504oo0OOo00).OooOO0O.OooOO0o.iterator();
                        while (it6.hasNext()) {
                            OooO00o((C0379o0OOo0O0) it6.next(), i, arrayList, c1155oOo00O02);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (r2.OooOOoo == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0O0(com.ninja.engine.C0580o0oOo0O0 r17) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0377o0OOo00o.OooO0O0(com.ninja.engine.o0oOo0O0):void");
    }

    public final void OooO0OO() {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00;
        ArrayList arrayList = this.OooO0o0;
        arrayList.clear();
        C0580o0oOo0O0 c0580o0oOo0O0 = this.OooO0Oo;
        c0580o0oOo0O0.OooO0Oo.OooO0o();
        c0580o0oOo0O0.OooO0o0.OooO0o();
        arrayList.add(c0580o0oOo0O0.OooO0Oo);
        arrayList.add(c0580o0oOo0O0.OooO0o0);
        Iterator it = c0580o0oOo0O0.o00ooo.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0316o0O0o0o c0316o0O0o0o = (C0316o0O0o0o) it.next();
            if (c0316o0O0o0o instanceof C0699oO0000oo) {
                abstractC1504oo0OOo00 = new AbstractC1504oo0OOo00(c0316o0O0o0o);
                c0316o0O0o0o.OooO0Oo.OooO0o();
                c0316o0O0o0o.OooO0o0.OooO0o();
                abstractC1504oo0OOo00.OooO0o = ((C0699oO0000oo) c0316o0O0o0o).o0ooOO0;
            } else {
                if (c0316o0O0o0o.OooOo()) {
                    if (c0316o0O0o0o.OooO0O0 == null) {
                        c0316o0O0o0o.OooO0O0 = new o0O00000(c0316o0O0o0o, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0316o0O0o0o.OooO0O0);
                } else {
                    arrayList.add(c0316o0O0o0o.OooO0Oo);
                }
                if (c0316o0O0o0o.OooOoO0()) {
                    if (c0316o0O0o0o.OooO0OO == null) {
                        c0316o0O0o0o.OooO0OO = new o0O00000(c0316o0O0o0o, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0316o0O0o0o.OooO0OO);
                } else {
                    arrayList.add(c0316o0O0o0o.OooO0o0);
                }
                if (c0316o0O0o0o instanceof AbstractC0705oO000o0o) {
                    abstractC1504oo0OOo00 = new AbstractC1504oo0OOo00(c0316o0O0o0o);
                }
            }
            arrayList.add(abstractC1504oo0OOo00);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC1504oo0OOo00) it2.next()).OooO0o();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1504oo0OOo00 abstractC1504oo0OOo002 = (AbstractC1504oo0OOo00) it3.next();
            if (abstractC1504oo0OOo002.OooO0O0 != c0580o0oOo0O0) {
                abstractC1504oo0OOo002.OooO0Oo();
            }
        }
        ArrayList arrayList2 = this.OooO0oo;
        arrayList2.clear();
        C0580o0oOo0O0 c0580o0oOo0O02 = this.OooO00o;
        OooO0o0(c0580o0oOo0O02.OooO0Oo, 0, arrayList2);
        OooO0o0(c0580o0oOo0O02.OooO0o0, 1, arrayList2);
        this.OooO0O0 = false;
    }

    public final int OooO0Oo(C0580o0oOo0O0 c0580o0oOo0O0, int i) {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00;
        AbstractC1504oo0OOo00 abstractC1504oo0OOo002;
        ArrayList arrayList;
        int i2;
        int i3;
        long OooOO0;
        long j;
        long j2;
        float f;
        long j3;
        C0580o0oOo0O0 c0580o0oOo0O02 = c0580o0oOo0O0;
        ArrayList arrayList2 = this.OooO0oo;
        int size = arrayList2.size();
        int i4 = 0;
        long j4 = 0;
        while (i4 < size) {
            AbstractC1504oo0OOo00 abstractC1504oo0OOo003 = ((C1155oOo00O0) arrayList2.get(i4)).OooO00o;
            if (!(abstractC1504oo0OOo003 instanceof o0O00000) ? !(i != 0 ? (abstractC1504oo0OOo003 instanceof C1435oo00oo) : (abstractC1504oo0OOo003 instanceof C0758oO0O0OoO)) : ((o0O00000) abstractC1504oo0OOo003).OooO0o != i) {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                OooOO0 = 0;
            } else {
                if (i == 0) {
                    abstractC1504oo0OOo00 = c0580o0oOo0O02.OooO0Oo;
                } else {
                    abstractC1504oo0OOo00 = c0580o0oOo0O02.OooO0o0;
                }
                C0379o0OOo0O0 c0379o0OOo0O0 = abstractC1504oo0OOo00.OooO0oo;
                if (i == 0) {
                    abstractC1504oo0OOo002 = c0580o0oOo0O02.OooO0Oo;
                } else {
                    abstractC1504oo0OOo002 = c0580o0oOo0O02.OooO0o0;
                }
                C0379o0OOo0O0 c0379o0OOo0O02 = abstractC1504oo0OOo002.OooO;
                boolean contains = abstractC1504oo0OOo003.OooO0oo.OooOO0o.contains(c0379o0OOo0O0);
                C0379o0OOo0O0 c0379o0OOo0O03 = abstractC1504oo0OOo003.OooO;
                boolean contains2 = c0379o0OOo0O03.OooOO0o.contains(c0379o0OOo0O02);
                long OooOO02 = abstractC1504oo0OOo003.OooOO0();
                C0379o0OOo0O0 c0379o0OOo0O04 = abstractC1504oo0OOo003.OooO0oo;
                if (contains && contains2) {
                    long OooO0O0 = C1155oOo00O0.OooO0O0(c0379o0OOo0O04, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long OooO00o = C1155oOo00O0.OooO00o(c0379o0OOo0O03, 0L);
                    long j5 = OooO0O0 - OooOO02;
                    int i5 = c0379o0OOo0O03.OooO0o;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j5 >= (-i5)) {
                        j5 += i5;
                    }
                    long j6 = c0379o0OOo0O04.OooO0o;
                    long j7 = ((-OooO00o) - OooOO02) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0316o0O0o0o c0316o0O0o0o = abstractC1504oo0OOo003.OooO0O0;
                    if (i == 0) {
                        f = c0316o0O0o0o.OooooO0;
                    } else if (i == 1) {
                        f = c0316o0O0o0o.OooooOO;
                    } else {
                        c0316o0O0o0o.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j3 = (((float) j5) / (1.0f - f)) + (((float) j7) / f);
                    } else {
                        j3 = 0;
                    }
                    float f2 = (float) j3;
                    OooOO0 = (c0379o0OOo0O04.OooO0o + ((((f2 * f) + 0.5f) + OooOO02) + (((1.0f - f) * f2) + 0.5f))) - c0379o0OOo0O03.OooO0o;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    if (contains) {
                        j2 = C1155oOo00O0.OooO0O0(c0379o0OOo0O04, c0379o0OOo0O04.OooO0o);
                        j = c0379o0OOo0O04.OooO0o + OooOO02;
                    } else if (contains2) {
                        j = (-c0379o0OOo0O03.OooO0o) + OooOO02;
                        j2 = -C1155oOo00O0.OooO00o(c0379o0OOo0O03, c0379o0OOo0O03.OooO0o);
                    } else {
                        OooOO0 = (abstractC1504oo0OOo003.OooOO0() + c0379o0OOo0O04.OooO0o) - c0379o0OOo0O03.OooO0o;
                    }
                    OooOO0 = Math.max(j2, j);
                }
            }
            j4 = Math.max(j4, OooOO0);
            i4 = i3 + 1;
            c0580o0oOo0O02 = c0580o0oOo0O0;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j4;
    }

    public final void OooO0o(int i, int i2, int i3, int i4, C0316o0O0o0o c0316o0O0o0o) {
        C0189o00o00 c0189o00o00 = this.OooO0oO;
        c0189o00o00.OooO00o = i;
        c0189o00o00.OooO0O0 = i3;
        c0189o00o00.OooO0OO = i2;
        c0189o00o00.OooO0Oo = i4;
        this.OooO0o.OooO0O0(c0316o0O0o0o, c0189o00o00);
        c0316o0O0o0o.Oooo0oo(c0189o00o00.OooO0o0);
        c0316o0O0o0o.Oooo0o0(c0189o00o00.OooO0o);
        c0316o0O0o0o.OooOooo = c0189o00o00.OooO0oo;
        c0316o0O0o0o.Oooo0(c0189o00o00.OooO0oO);
    }

    public final void OooO0o0(AbstractC1504oo0OOo00 abstractC1504oo0OOo00, int i, ArrayList arrayList) {
        C0379o0OOo0O0 c0379o0OOo0O0;
        C0379o0OOo0O0 c0379o0OOo0O02;
        C0379o0OOo0O0 c0379o0OOo0O03;
        Iterator it = abstractC1504oo0OOo00.OooO0oo.OooOO0O.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0379o0OOo0O0 = abstractC1504oo0OOo00.OooO;
            if (!hasNext) {
                break;
            }
            InterfaceC0376o0OOo00O interfaceC0376o0OOo00O = (InterfaceC0376o0OOo00O) it.next();
            if (interfaceC0376o0OOo00O instanceof C0379o0OOo0O0) {
                c0379o0OOo0O03 = (C0379o0OOo0O0) interfaceC0376o0OOo00O;
            } else if (interfaceC0376o0OOo00O instanceof AbstractC1504oo0OOo00) {
                c0379o0OOo0O03 = ((AbstractC1504oo0OOo00) interfaceC0376o0OOo00O).OooO0oo;
            }
            OooO00o(c0379o0OOo0O03, i, arrayList, null);
        }
        Iterator it2 = c0379o0OOo0O0.OooOO0O.iterator();
        while (it2.hasNext()) {
            InterfaceC0376o0OOo00O interfaceC0376o0OOo00O2 = (InterfaceC0376o0OOo00O) it2.next();
            if (interfaceC0376o0OOo00O2 instanceof C0379o0OOo0O0) {
                c0379o0OOo0O02 = (C0379o0OOo0O0) interfaceC0376o0OOo00O2;
            } else if (interfaceC0376o0OOo00O2 instanceof AbstractC1504oo0OOo00) {
                c0379o0OOo0O02 = ((AbstractC1504oo0OOo00) interfaceC0376o0OOo00O2).OooO;
            }
            OooO00o(c0379o0OOo0O02, i, arrayList, null);
        }
        if (i == 1) {
            Iterator it3 = ((C1435oo00oo) abstractC1504oo0OOo00).OooOO0O.OooOO0O.iterator();
            while (it3.hasNext()) {
                InterfaceC0376o0OOo00O interfaceC0376o0OOo00O3 = (InterfaceC0376o0OOo00O) it3.next();
                if (interfaceC0376o0OOo00O3 instanceof C0379o0OOo0O0) {
                    OooO00o((C0379o0OOo0O0) interfaceC0376o0OOo00O3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r10 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        r2.OooOOO0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        r2.OooO0Oo(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r8 == 3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oO() {
        /*
            r14 = this;
            com.ninja.engine.o0oOo0O0 r0 = r14.OooO00o
            java.util.ArrayList r0 = r0.o00ooo
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            com.ninja.engine.o0O0o0o r1 = (com.ninja.engine.C0316o0O0o0o) r1
            boolean r2 = r1.OooO00o
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.o00o0O
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.OooOOo
            int r4 = r1.OooOOoo
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = 0
            goto L31
        L30:
            r2 = 1
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = 1
        L38:
            com.ninja.engine.oO0O0OoO r4 = r1.OooO0Oo
            com.ninja.engine.o0OOoOOO r4 = r4.OooO0o0
            boolean r6 = r4.OooOO0
            com.ninja.engine.oo00oo r7 = r1.OooO0o0
            com.ninja.engine.o0OOoOOO r7 = r7.OooO0o0
            boolean r12 = r7.OooOO0
            r13 = 1
            if (r6 == 0) goto L57
            if (r12 == 0) goto L57
            int r4 = r4.OooO0oO
            int r6 = r7.OooO0oO
            r2 = r14
            r3 = r13
            r5 = r13
            r7 = r1
            r2.OooO0o(r3, r4, r5, r6, r7)
        L54:
            r1.OooO00o = r9
            goto L90
        L57:
            if (r6 == 0) goto L76
            if (r3 == 0) goto L76
            int r4 = r4.OooO0oO
            int r6 = r7.OooO0oO
            r2 = r14
            r3 = r13
            r7 = r1
            r2.OooO0o(r3, r4, r5, r6, r7)
            com.ninja.engine.oo00oo r2 = r1.OooO0o0
            com.ninja.engine.o0OOoOOO r2 = r2.OooO0o0
            int r3 = r1.OooOO0O()
            if (r10 != r11) goto L72
        L6f:
            r2.OooOOO0 = r3
            goto L90
        L72:
            r2.OooO0Oo(r3)
            goto L54
        L76:
            if (r12 == 0) goto L90
            if (r2 == 0) goto L90
            int r4 = r4.OooO0oO
            int r6 = r7.OooO0oO
            r2 = r14
            r3 = r5
            r5 = r13
            r7 = r1
            r2.OooO0o(r3, r4, r5, r6, r7)
            com.ninja.engine.oO0O0OoO r2 = r1.OooO0Oo
            com.ninja.engine.o0OOoOOO r2 = r2.OooO0o0
            int r3 = r1.OooOOo0()
            if (r8 != r11) goto L72
            goto L6f
        L90:
            boolean r2 = r1.OooO00o
            if (r2 == 0) goto L8
            com.ninja.engine.oo00oo r2 = r1.OooO0o0
            com.ninja.engine.oo00oO r2 = r2.OooOO0o
            if (r2 == 0) goto L8
            int r1 = r1.OoooOoo
            r2.OooO0Oo(r1)
            goto L8
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0377o0OOo00o.OooO0oO():void");
    }
}

