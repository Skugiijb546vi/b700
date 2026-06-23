package com.ninja.engine;

import com.app.framework.utils.ShellUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0O0o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0316o0O0o0o {
    public o0O00000 OooO0O0;
    public o0O00000 OooO0OO;
    public String OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public int OooOOoo;
    public int OooOo;
    public int OooOo0;
    public final int[] OooOo00;
    public int OooOo0O;
    public float OooOo0o;
    public float OooOoO;
    public int OooOoO0;
    public int OooOoOO;
    public final int[] OooOoo;
    public float OooOoo0;
    public float OooOooO;
    public boolean OooOooo;
    public final C0304o0O0OoO Oooo;
    public final C0304o0O0OoO Oooo0;
    public boolean Oooo000;
    public int Oooo00O;
    public int Oooo00o;
    public final C0304o0O0OoO Oooo0O0;
    public final C0304o0O0OoO Oooo0OO;
    public final C0304o0O0OoO Oooo0o;
    public final C0304o0O0OoO Oooo0o0;
    public final C0304o0O0OoO Oooo0oO;
    public final C0304o0O0OoO Oooo0oo;
    public C0316o0O0o0o OoooO;
    public final ArrayList OoooO0;
    public final C0304o0O0OoO[] OoooO00;
    public final boolean[] OoooO0O;
    public int OoooOO0;
    public float OoooOOO;
    public int OoooOOo;
    public int OoooOo0;
    public int OoooOoO;
    public int OoooOoo;
    public int Ooooo00;
    public int Ooooo0o;
    public float OooooO0;
    public float OooooOO;
    public Object OooooOo;
    public String Oooooo;
    public int Oooooo0;
    public int OoooooO;
    public int Ooooooo;
    public int o000oOoO;
    public final C0316o0O0o0o[] o00O0O;
    public int o00Oo0;
    public int o00Ooo;
    public final int[] o00o0O;
    public final float[] o0OoOo0;
    public final C0316o0O0o0o[] ooOO;
    public boolean OooO00o = false;
    public C0758oO0O0OoO OooO0Oo = null;
    public C1435oo00oo OooO0o0 = null;
    public final boolean[] OooO0o = {true, true};
    public boolean OooO0oO = true;
    public int OooO0oo = -1;
    public int OooO = -1;

    public C0316o0O0o0o() {
        new HashMap();
        this.OooOO0O = false;
        this.OooOO0o = false;
        this.OooOOO0 = false;
        this.OooOOO = false;
        this.OooOOOO = -1;
        this.OooOOOo = -1;
        this.OooOOo0 = 0;
        this.OooOOo = 0;
        this.OooOOoo = 0;
        this.OooOo00 = new int[2];
        this.OooOo0 = 0;
        this.OooOo0O = 0;
        this.OooOo0o = 1.0f;
        this.OooOo = 0;
        this.OooOoO0 = 0;
        this.OooOoO = 1.0f;
        this.OooOoOO = -1;
        this.OooOoo0 = 1.0f;
        this.OooOoo = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.OooOooO = Float.NaN;
        this.OooOooo = false;
        this.Oooo000 = false;
        this.Oooo00O = 0;
        this.Oooo00o = 0;
        C0304o0O0OoO c0304o0O0OoO = new C0304o0O0OoO(this, 2);
        this.Oooo0 = c0304o0O0OoO;
        C0304o0O0OoO c0304o0O0OoO2 = new C0304o0O0OoO(this, 3);
        this.Oooo0O0 = c0304o0O0OoO2;
        C0304o0O0OoO c0304o0O0OoO3 = new C0304o0O0OoO(this, 4);
        this.Oooo0OO = c0304o0O0OoO3;
        C0304o0O0OoO c0304o0O0OoO4 = new C0304o0O0OoO(this, 5);
        this.Oooo0o0 = c0304o0O0OoO4;
        C0304o0O0OoO c0304o0O0OoO5 = new C0304o0O0OoO(this, 6);
        this.Oooo0o = c0304o0O0OoO5;
        C0304o0O0OoO c0304o0O0OoO6 = new C0304o0O0OoO(this, 8);
        this.Oooo0oO = c0304o0O0OoO6;
        C0304o0O0OoO c0304o0O0OoO7 = new C0304o0O0OoO(this, 9);
        this.Oooo0oo = c0304o0O0OoO7;
        C0304o0O0OoO c0304o0O0OoO8 = new C0304o0O0OoO(this, 7);
        this.Oooo = c0304o0O0OoO8;
        this.OoooO00 = new C0304o0O0OoO[]{c0304o0O0OoO, c0304o0O0OoO3, c0304o0O0OoO2, c0304o0O0OoO4, c0304o0O0OoO5, c0304o0O0OoO8};
        ArrayList arrayList = new ArrayList();
        this.OoooO0 = arrayList;
        this.OoooO0O = new boolean[2];
        this.o00o0O = new int[]{1, 1};
        this.OoooO = null;
        this.OoooOO0 = 0;
        this.o000oOoO = 0;
        this.OoooOOO = 0.0f;
        this.OoooOOo = -1;
        this.OoooOo0 = 0;
        this.OoooOoO = 0;
        this.OoooOoo = 0;
        this.OooooO0 = 0.5f;
        this.OooooOO = 0.5f;
        this.Oooooo0 = 0;
        this.Oooooo = null;
        this.OoooooO = 0;
        this.Ooooooo = 0;
        this.o0OoOo0 = new float[]{-1.0f, -1.0f};
        this.ooOO = new C0316o0O0o0o[]{null, null};
        this.o00O0O = new C0316o0O0o0o[]{null, null};
        this.o00Oo0 = -1;
        this.o00Ooo = -1;
        arrayList.add(c0304o0O0OoO);
        arrayList.add(c0304o0O0OoO2);
        arrayList.add(c0304o0O0OoO3);
        arrayList.add(c0304o0O0OoO4);
        arrayList.add(c0304o0O0OoO6);
        arrayList.add(c0304o0O0OoO7);
        arrayList.add(c0304o0O0OoO8);
        arrayList.add(c0304o0O0OoO5);
    }

    public static void OooOOOO(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        sb.append(str);
        sb.append(" :  {\n");
        String OooOOOO = AbstractC1230oOoOo0o.OooOOOO(i6);
        if (!"FIXED".equals(OooOOOO)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(OooOOOO);
            sb.append(",\n");
        }
        Oooo00O(i, 0, "      size", sb);
        Oooo00O(i2, 0, "      min", sb);
        Oooo00O(i3, Integer.MAX_VALUE, "      max", sb);
        Oooo00O(i4, 0, "      matchMin", sb);
        Oooo00O(i5, 0, "      matchDef", sb);
        Oooo00o(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void OooOOOo(StringBuilder sb, String str, C0304o0O0OoO c0304o0O0OoO) {
        if (c0304o0O0OoO.OooO0o == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c0304o0O0OoO.OooO0o);
        sb.append("'");
        if (c0304o0O0OoO.OooO0oo != Integer.MIN_VALUE || c0304o0O0OoO.OooO0oO != 0) {
            sb.append(",");
            sb.append(c0304o0O0OoO.OooO0oO);
            if (c0304o0O0OoO.OooO0oo != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c0304o0O0OoO.OooO0oo);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public static void Oooo00O(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void Oooo00o(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public C0304o0O0OoO OooO(int i) {
        switch (AbstractC1230oOoOo0o.OooOOOo(i)) {
            case 0:
                return null;
            case 1:
                return this.Oooo0;
            case 2:
                return this.Oooo0O0;
            case 3:
                return this.Oooo0OO;
            case 4:
                return this.Oooo0o0;
            case 5:
                return this.Oooo0o;
            case 6:
                return this.Oooo;
            case 7:
                return this.Oooo0oO;
            case 8:
                return this.Oooo0oo;
            default:
                throw new AssertionError(AbstractC1230oOoOo0o.OooOOO(i));
        }
    }

    public final void OooO00o(C0580o0oOo0O0 c0580o0oOo0O0, oO0OO0O oo0oo0o, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            AbstractC0694o0ooooo0.OooO(c0580o0oOo0O0, oo0oo0o, this);
            hashSet.remove(this);
            OooO0O0(oo0oo0o, c0580o0oOo0O0.OoooOOO(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.Oooo0.OooO00o;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C0304o0O0OoO) it.next()).OooO0Oo.OooO00o(c0580o0oOo0O0, oo0oo0o, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.Oooo0OO.OooO00o;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C0304o0O0OoO) it2.next()).OooO0Oo.OooO00o(c0580o0oOo0O0, oo0oo0o, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.Oooo0O0.OooO00o;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C0304o0O0OoO) it3.next()).OooO0Oo.OooO00o(c0580o0oOo0O0, oo0oo0o, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.Oooo0o0.OooO00o;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C0304o0O0OoO) it4.next()).OooO0Oo.OooO00o(c0580o0oOo0O0, oo0oo0o, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.Oooo0o.OooO00o;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C0304o0O0OoO) it5.next()).OooO0Oo.OooO00o(c0580o0oOo0O0, oo0oo0o, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x016a, code lost:
        if (r58.OooOO0o != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO0O0(com.ninja.engine.oO0OO0O r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0316o0O0o0o.OooO0O0(com.ninja.engine.oO0OO0O, boolean):void");
    }

    public boolean OooO0OO() {
        if (this.Oooooo0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x037c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0Oo(com.ninja.engine.oO0OO0O r31, boolean r32, boolean r33, boolean r34, boolean r35, com.ninja.engine.C1232oOoOo0oO r36, com.ninja.engine.C1232oOoOo0oO r37, int r38, boolean r39, com.ninja.engine.C0304o0O0OoO r40, com.ninja.engine.C0304o0O0OoO r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0316o0O0o0o.OooO0Oo(com.ninja.engine.oO0OO0O, boolean, boolean, boolean, boolean, com.ninja.engine.oOoOo0oO, com.ninja.engine.oOoOo0oO, int, boolean, com.ninja.engine.o0O0OoO, com.ninja.engine.o0O0OoO, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void OooO0o(C0304o0O0OoO c0304o0O0OoO, C0304o0O0OoO c0304o0O0OoO2, int i) {
        if (c0304o0O0OoO.OooO0Oo == this) {
            OooO0o0(c0304o0O0OoO.OooO0o0, c0304o0O0OoO2.OooO0Oo, c0304o0O0OoO2.OooO0o0, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x015d, code lost:
        if (r13.OooO0oo() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015f, code lost:
        r11.OooOO0();
        r13.OooOO0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r13.OooO0oo() != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0o0(int r11, com.ninja.engine.C0316o0O0o0o r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0316o0O0o0o.OooO0o0(int, com.ninja.engine.o0O0o0o, int, int):void");
    }

    public final void OooO0oO(oO0OO0O oo0oo0o) {
        oo0oo0o.OooOO0O(this.Oooo0);
        oo0oo0o.OooOO0O(this.Oooo0O0);
        oo0oo0o.OooOO0O(this.Oooo0OO);
        oo0oo0o.OooOO0O(this.Oooo0o0);
        if (this.OoooOoo > 0) {
            oo0oo0o.OooOO0O(this.Oooo0o);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.oo00oo, com.ninja.engine.oo0OOo00] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ninja.engine.oO0O0OoO, com.ninja.engine.oo0OOo00] */
    public final void OooO0oo() {
        if (this.OooO0Oo == null) {
            AbstractC1504oo0OOo00 abstractC1504oo0OOo00 = new AbstractC1504oo0OOo00(this);
            abstractC1504oo0OOo00.OooO0oo.OooO0o0 = 4;
            abstractC1504oo0OOo00.OooO.OooO0o0 = 5;
            abstractC1504oo0OOo00.OooO0o = 0;
            this.OooO0Oo = abstractC1504oo0OOo00;
        }
        if (this.OooO0o0 == null) {
            AbstractC1504oo0OOo00 abstractC1504oo0OOo002 = new AbstractC1504oo0OOo00(this);
            C0379o0OOo0O0 c0379o0OOo0O0 = new C0379o0OOo0O0(abstractC1504oo0OOo002);
            abstractC1504oo0OOo002.OooOO0O = c0379o0OOo0O0;
            abstractC1504oo0OOo002.OooOO0o = null;
            abstractC1504oo0OOo002.OooO0oo.OooO0o0 = 6;
            abstractC1504oo0OOo002.OooO.OooO0o0 = 7;
            c0379o0OOo0O0.OooO0o0 = 8;
            abstractC1504oo0OOo002.OooO0o = 1;
            this.OooO0o0 = abstractC1504oo0OOo002;
        }
    }

    public final int OooOO0(int i) {
        int[] iArr = this.o00o0O;
        if (i == 0) {
            return iArr[0];
        }
        if (i != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int OooOO0O() {
        if (this.Oooooo0 == 8) {
            return 0;
        }
        return this.o000oOoO;
    }

    public final C0316o0O0o0o OooOO0o(int i) {
        C0304o0O0OoO c0304o0O0OoO;
        C0304o0O0OoO c0304o0O0OoO2;
        if (i == 0) {
            C0304o0O0OoO c0304o0O0OoO3 = this.Oooo0OO;
            C0304o0O0OoO c0304o0O0OoO4 = c0304o0O0OoO3.OooO0o;
            if (c0304o0O0OoO4 != null && c0304o0O0OoO4.OooO0o == c0304o0O0OoO3) {
                return c0304o0O0OoO4.OooO0Oo;
            }
            return null;
        } else if (i == 1 && (c0304o0O0OoO2 = (c0304o0O0OoO = this.Oooo0o0).OooO0o) != null && c0304o0O0OoO2.OooO0o == c0304o0O0OoO) {
            return c0304o0O0OoO2.OooO0Oo;
        } else {
            return null;
        }
    }

    public void OooOOO(StringBuilder sb) {
        sb.append("  " + this.OooOO0 + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.OoooOO0);
        sb.append(sb2.toString());
        sb.append(ShellUtils.COMMAND_LINE_END);
        sb.append("    actualHeight:" + this.o000oOoO);
        sb.append(ShellUtils.COMMAND_LINE_END);
        sb.append("    actualLeft:" + this.OoooOo0);
        sb.append(ShellUtils.COMMAND_LINE_END);
        sb.append("    actualTop:" + this.OoooOoO);
        sb.append(ShellUtils.COMMAND_LINE_END);
        OooOOOo(sb, "left", this.Oooo0);
        OooOOOo(sb, "top", this.Oooo0O0);
        OooOOOo(sb, "right", this.Oooo0OO);
        OooOOOo(sb, "bottom", this.Oooo0o0);
        OooOOOo(sb, "baseline", this.Oooo0o);
        OooOOOo(sb, "centerX", this.Oooo0oO);
        OooOOOo(sb, "centerY", this.Oooo0oo);
        int i = this.OoooOO0;
        int i2 = this.Ooooo00;
        int[] iArr = this.OooOoo;
        int i3 = iArr[0];
        int i4 = this.OooOo0;
        int i5 = this.OooOOo;
        float f = this.OooOo0o;
        int[] iArr2 = this.o00o0O;
        int i6 = iArr2[0];
        float[] fArr = this.o0OoOo0;
        float f2 = fArr[0];
        OooOOOO(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.o000oOoO;
        int i8 = this.Ooooo0o;
        int i9 = iArr[1];
        int i10 = this.OooOo;
        int i11 = this.OooOOoo;
        float f3 = this.OooOoO;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        OooOOOO(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.OoooOOO;
        int i13 = this.OoooOOo;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        Oooo00o(sb, "    horizontalBias", this.OooooO0, 0.5f);
        Oooo00o(sb, "    verticalBias", this.OooooOO, 0.5f);
        Oooo00O(this.OoooooO, 0, "    horizontalChainStyle", sb);
        Oooo00O(this.Ooooooo, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final C0316o0O0o0o OooOOO0(int i) {
        C0304o0O0OoO c0304o0O0OoO;
        C0304o0O0OoO c0304o0O0OoO2;
        if (i == 0) {
            C0304o0O0OoO c0304o0O0OoO3 = this.Oooo0;
            C0304o0O0OoO c0304o0O0OoO4 = c0304o0O0OoO3.OooO0o;
            if (c0304o0O0OoO4 != null && c0304o0O0OoO4.OooO0o == c0304o0O0OoO3) {
                return c0304o0O0OoO4.OooO0Oo;
            }
            return null;
        } else if (i == 1 && (c0304o0O0OoO2 = (c0304o0O0OoO = this.Oooo0O0).OooO0o) != null && c0304o0O0OoO2.OooO0o == c0304o0O0OoO) {
            return c0304o0O0OoO2.OooO0Oo;
        } else {
            return null;
        }
    }

    public final int OooOOo() {
        C0316o0O0o0o c0316o0O0o0o = this.OoooO;
        if (c0316o0O0o0o != null && (c0316o0O0o0o instanceof C0580o0oOo0O0)) {
            return ((C0580o0oOo0O0) c0316o0O0o0o).o0OOO0o + this.OoooOo0;
        }
        return this.OoooOo0;
    }

    public final int OooOOo0() {
        if (this.Oooooo0 == 8) {
            return 0;
        }
        return this.OoooOO0;
    }

    public final int OooOOoo() {
        C0316o0O0o0o c0316o0O0o0o = this.OoooO;
        if (c0316o0O0o0o != null && (c0316o0O0o0o instanceof C0580o0oOo0O0)) {
            return ((C0580o0oOo0O0) c0316o0O0o0o).o0Oo0oo + this.OoooOoO;
        }
        return this.OoooOoO;
    }

    public final boolean OooOo() {
        C0304o0O0OoO c0304o0O0OoO = this.Oooo0;
        C0304o0O0OoO c0304o0O0OoO2 = c0304o0O0OoO.OooO0o;
        if (c0304o0O0OoO2 == null || c0304o0O0OoO2.OooO0o != c0304o0O0OoO) {
            C0304o0O0OoO c0304o0O0OoO3 = this.Oooo0OO;
            C0304o0O0OoO c0304o0O0OoO4 = c0304o0O0OoO3.OooO0o;
            if (c0304o0O0OoO4 != null && c0304o0O0OoO4.OooO0o == c0304o0O0OoO3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean OooOo0(int i, int i2) {
        C0304o0O0OoO c0304o0O0OoO;
        C0304o0O0OoO c0304o0O0OoO2;
        C0304o0O0OoO c0304o0O0OoO3;
        C0304o0O0OoO c0304o0O0OoO4;
        if (i == 0) {
            C0304o0O0OoO c0304o0O0OoO5 = this.Oooo0;
            C0304o0O0OoO c0304o0O0OoO6 = c0304o0O0OoO5.OooO0o;
            if (c0304o0O0OoO6 != null && c0304o0O0OoO6.OooO0OO && (c0304o0O0OoO4 = (c0304o0O0OoO3 = this.Oooo0OO).OooO0o) != null && c0304o0O0OoO4.OooO0OO) {
                if ((c0304o0O0OoO4.OooO0Oo() - c0304o0O0OoO3.OooO0o0()) - (c0304o0O0OoO5.OooO0o0() + c0304o0O0OoO5.OooO0o.OooO0Oo()) >= i2) {
                    return true;
                }
                return false;
            }
        } else {
            C0304o0O0OoO c0304o0O0OoO7 = this.Oooo0O0;
            C0304o0O0OoO c0304o0O0OoO8 = c0304o0O0OoO7.OooO0o;
            if (c0304o0O0OoO8 != null && c0304o0O0OoO8.OooO0OO && (c0304o0O0OoO2 = (c0304o0O0OoO = this.Oooo0o0).OooO0o) != null && c0304o0O0OoO2.OooO0OO) {
                if ((c0304o0O0OoO2.OooO0Oo() - c0304o0O0OoO.OooO0o0()) - (c0304o0O0OoO7.OooO0o0() + c0304o0O0OoO7.OooO0o.OooO0Oo()) >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean OooOo00(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.Oooo0.OooO0o != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.Oooo0OO.OooO0o != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 >= 2) {
                return false;
            }
            return true;
        }
        if (this.Oooo0O0.OooO0o != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.Oooo0o0.OooO0o != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.Oooo0o.OooO0o != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 >= 2) {
            return false;
        }
        return true;
    }

    public final void OooOo0O(int i, int i2, int i3, int i4, C0316o0O0o0o c0316o0O0o0o) {
        OooO(i).OooO0O0(c0316o0O0o0o.OooO(i2), i3, i4, true);
    }

    public final boolean OooOo0o(int i) {
        C0304o0O0OoO c0304o0O0OoO;
        C0304o0O0OoO c0304o0O0OoO2;
        int i2 = i * 2;
        C0304o0O0OoO[] c0304o0O0OoOArr = this.OoooO00;
        C0304o0O0OoO c0304o0O0OoO3 = c0304o0O0OoOArr[i2];
        C0304o0O0OoO c0304o0O0OoO4 = c0304o0O0OoO3.OooO0o;
        if (c0304o0O0OoO4 != null && c0304o0O0OoO4.OooO0o != c0304o0O0OoO3 && (c0304o0O0OoO2 = (c0304o0O0OoO = c0304o0O0OoOArr[i2 + 1]).OooO0o) != null && c0304o0O0OoO2.OooO0o == c0304o0O0OoO) {
            return true;
        }
        return false;
    }

    public final boolean OooOoO() {
        if (this.OooO0oO && this.Oooooo0 != 8) {
            return true;
        }
        return false;
    }

    public final boolean OooOoO0() {
        C0304o0O0OoO c0304o0O0OoO = this.Oooo0O0;
        C0304o0O0OoO c0304o0O0OoO2 = c0304o0O0OoO.OooO0o;
        if (c0304o0O0OoO2 == null || c0304o0O0OoO2.OooO0o != c0304o0O0OoO) {
            C0304o0O0OoO c0304o0O0OoO3 = this.Oooo0o0;
            C0304o0O0OoO c0304o0O0OoO4 = c0304o0O0OoO3.OooO0o;
            if (c0304o0O0OoO4 != null && c0304o0O0OoO4.OooO0o == c0304o0O0OoO3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean OooOoOO() {
        if (!this.OooOO0O && (!this.Oooo0.OooO0OO || !this.Oooo0OO.OooO0OO)) {
            return false;
        }
        return true;
    }

    public void OooOoo() {
        this.Oooo0.OooOO0();
        this.Oooo0O0.OooOO0();
        this.Oooo0OO.OooOO0();
        this.Oooo0o0.OooOO0();
        this.Oooo0o.OooOO0();
        this.Oooo0oO.OooOO0();
        this.Oooo0oo.OooOO0();
        this.Oooo.OooOO0();
        this.OoooO = null;
        this.OooOooO = Float.NaN;
        this.OoooOO0 = 0;
        this.o000oOoO = 0;
        this.OoooOOO = 0.0f;
        this.OoooOOo = -1;
        this.OoooOo0 = 0;
        this.OoooOoO = 0;
        this.OoooOoo = 0;
        this.Ooooo00 = 0;
        this.Ooooo0o = 0;
        this.OooooO0 = 0.5f;
        this.OooooOO = 0.5f;
        int[] iArr = this.o00o0O;
        iArr[0] = 1;
        iArr[1] = 1;
        this.OooooOo = null;
        this.Oooooo0 = 0;
        this.OoooooO = 0;
        this.Ooooooo = 0;
        float[] fArr = this.o0OoOo0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.OooOOOO = -1;
        this.OooOOOo = -1;
        int[] iArr2 = this.OooOoo;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.OooOOo = 0;
        this.OooOOoo = 0;
        this.OooOo0o = 1.0f;
        this.OooOoO = 1.0f;
        this.OooOo0O = Integer.MAX_VALUE;
        this.OooOoO0 = Integer.MAX_VALUE;
        this.OooOo0 = 0;
        this.OooOo = 0;
        this.OooOoOO = -1;
        this.OooOoo0 = 1.0f;
        boolean[] zArr = this.OooO0o;
        zArr[0] = true;
        zArr[1] = true;
        this.Oooo000 = false;
        boolean[] zArr2 = this.OoooO0O;
        zArr2[0] = false;
        zArr2[1] = false;
        this.OooO0oO = true;
        int[] iArr3 = this.OooOo00;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.OooO0oo = -1;
        this.OooO = -1;
    }

    public boolean OooOoo0() {
        if (!this.OooOO0o && (!this.Oooo0O0.OooO0OO || !this.Oooo0o0.OooO0OO)) {
            return false;
        }
        return true;
    }

    public final void OooOooO() {
        C0316o0O0o0o c0316o0O0o0o = this.OoooO;
        if (c0316o0O0o0o != null && (c0316o0O0o0o instanceof C0580o0oOo0O0)) {
            ((C0580o0oOo0O0) c0316o0O0o0o).getClass();
        }
        ArrayList arrayList = this.OoooO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0304o0O0OoO) arrayList.get(i)).OooOO0();
        }
    }

    public final void OooOooo() {
        this.OooOO0O = false;
        this.OooOO0o = false;
        this.OooOOO0 = false;
        this.OooOOO = false;
        ArrayList arrayList = this.OoooO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0304o0O0OoO c0304o0O0OoO = (C0304o0O0OoO) arrayList.get(i);
            c0304o0O0OoO.OooO0OO = false;
            c0304o0O0OoO.OooO0O0 = 0;
        }
    }

    public void Oooo(boolean z, boolean z2) {
        int i;
        int i2;
        C0758oO0O0OoO c0758oO0O0OoO = this.OooO0Oo;
        boolean z3 = z & c0758oO0O0OoO.OooO0oO;
        C1435oo00oo c1435oo00oo = this.OooO0o0;
        boolean z4 = z2 & c1435oo00oo.OooO0oO;
        int i3 = c0758oO0O0OoO.OooO0oo.OooO0oO;
        int i4 = c1435oo00oo.OooO0oo.OooO0oO;
        int i5 = c0758oO0O0OoO.OooO.OooO0oO;
        int i6 = c1435oo00oo.OooO.OooO0oO;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.OoooOo0 = i3;
        }
        if (z4) {
            this.OoooOoO = i4;
        }
        if (this.Oooooo0 == 8) {
            this.OoooOO0 = 0;
            this.o000oOoO = 0;
            return;
        }
        int[] iArr = this.o00o0O;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.OoooOO0)) {
                i8 = i2;
            }
            this.OoooOO0 = i8;
            int i10 = this.Ooooo00;
            if (i8 < i10) {
                this.OoooOO0 = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.o000oOoO)) {
                i9 = i;
            }
            this.o000oOoO = i9;
            int i11 = this.Ooooo0o;
            if (i9 < i11) {
                this.o000oOoO = i11;
            }
        }
    }

    public final void Oooo0(int i) {
        boolean z;
        this.OoooOoo = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.OooOooo = z;
    }

    public void Oooo000(C0131o00O0o c0131o00O0o) {
        this.Oooo0.OooOO0O();
        this.Oooo0O0.OooOO0O();
        this.Oooo0OO.OooOO0O();
        this.Oooo0o0.OooOO0O();
        this.Oooo0o.OooOO0O();
        this.Oooo.OooOO0O();
        this.Oooo0oO.OooOO0O();
        this.Oooo0oo.OooOO0O();
    }

    public final void Oooo0O0(int i, int i2) {
        if (this.OooOO0O) {
            return;
        }
        this.Oooo0.OooOO0o(i);
        this.Oooo0OO.OooOO0o(i2);
        this.OoooOo0 = i;
        this.OoooOO0 = i2 - i;
        this.OooOO0O = true;
    }

    public final void Oooo0OO(int i, int i2) {
        if (this.OooOO0o) {
            return;
        }
        this.Oooo0O0.OooOO0o(i);
        this.Oooo0o0.OooOO0o(i2);
        this.OoooOoO = i;
        this.o000oOoO = i2 - i;
        if (this.OooOooo) {
            this.Oooo0o.OooOO0o(i + this.OoooOoo);
        }
        this.OooOO0o = true;
    }

    public final void Oooo0o(int i) {
        this.o00o0O[0] = i;
    }

    public final void Oooo0o0(int i) {
        this.o000oOoO = i;
        int i2 = this.Ooooo0o;
        if (i < i2) {
            this.o000oOoO = i2;
        }
    }

    public final void Oooo0oO(int i) {
        this.o00o0O[1] = i;
    }

    public final void Oooo0oo(int i) {
        this.OoooOO0 = i;
        int i2 = this.Ooooo00;
        if (i < i2) {
            this.OoooOO0 = i2;
        }
    }

    public void OoooO00(oO0OO0O oo0oo0o, boolean z) {
        int i;
        int i2;
        C1435oo00oo c1435oo00oo;
        C0758oO0O0OoO c0758oO0O0OoO;
        C0304o0O0OoO c0304o0O0OoO = this.Oooo0;
        oo0oo0o.getClass();
        int OooOOO = oO0OO0O.OooOOO(c0304o0O0OoO);
        int OooOOO2 = oO0OO0O.OooOOO(this.Oooo0O0);
        int OooOOO3 = oO0OO0O.OooOOO(this.Oooo0OO);
        int OooOOO4 = oO0OO0O.OooOOO(this.Oooo0o0);
        if (z && (c0758oO0O0OoO = this.OooO0Oo) != null) {
            C0379o0OOo0O0 c0379o0OOo0O0 = c0758oO0O0OoO.OooO0oo;
            if (c0379o0OOo0O0.OooOO0) {
                C0379o0OOo0O0 c0379o0OOo0O02 = c0758oO0O0OoO.OooO;
                if (c0379o0OOo0O02.OooOO0) {
                    OooOOO = c0379o0OOo0O0.OooO0oO;
                    OooOOO3 = c0379o0OOo0O02.OooO0oO;
                }
            }
        }
        if (z && (c1435oo00oo = this.OooO0o0) != null) {
            C0379o0OOo0O0 c0379o0OOo0O03 = c1435oo00oo.OooO0oo;
            if (c0379o0OOo0O03.OooOO0) {
                C0379o0OOo0O0 c0379o0OOo0O04 = c1435oo00oo.OooO;
                if (c0379o0OOo0O04.OooOO0) {
                    OooOOO2 = c0379o0OOo0O03.OooO0oO;
                    OooOOO4 = c0379o0OOo0O04.OooO0oO;
                }
            }
        }
        int i3 = OooOOO4 - OooOOO2;
        if (OooOOO3 - OooOOO < 0 || i3 < 0 || OooOOO == Integer.MIN_VALUE || OooOOO == Integer.MAX_VALUE || OooOOO2 == Integer.MIN_VALUE || OooOOO2 == Integer.MAX_VALUE || OooOOO3 == Integer.MIN_VALUE || OooOOO3 == Integer.MAX_VALUE || OooOOO4 == Integer.MIN_VALUE || OooOOO4 == Integer.MAX_VALUE) {
            OooOOO = 0;
            OooOOO2 = 0;
            OooOOO3 = 0;
            OooOOO4 = 0;
        }
        int i4 = OooOOO3 - OooOOO;
        int i5 = OooOOO4 - OooOOO2;
        this.OoooOo0 = OooOOO;
        this.OoooOoO = OooOOO2;
        if (this.Oooooo0 == 8) {
            this.OoooOO0 = 0;
            this.o000oOoO = 0;
            return;
        }
        int[] iArr = this.o00o0O;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.OoooOO0)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.o000oOoO)) {
            i5 = i;
        }
        this.OoooOO0 = i4;
        this.o000oOoO = i5;
        int i7 = this.Ooooo0o;
        if (i5 < i7) {
            this.o000oOoO = i7;
        }
        int i8 = this.Ooooo00;
        if (i4 < i8) {
            this.OoooOO0 = i8;
        }
        int i9 = this.OooOo0O;
        if (i9 > 0 && i6 == 3) {
            this.OoooOO0 = Math.min(this.OoooOO0, i9);
        }
        int i10 = this.OooOoO0;
        if (i10 > 0 && iArr[1] == 3) {
            this.o000oOoO = Math.min(this.o000oOoO, i10);
        }
        int i11 = this.OoooOO0;
        if (i4 != i11) {
            this.OooO0oo = i11;
        }
        int i12 = this.o000oOoO;
        if (i5 != i12) {
            this.OooO = i12;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.Oooooo != null) {
            str = AbstractC1230oOoOo0o.OooO(new StringBuilder("id: "), this.Oooooo, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.OoooOo0);
        sb.append(", ");
        sb.append(this.OoooOoO);
        sb.append(") - (");
        sb.append(this.OoooOO0);
        sb.append(" x ");
        sb.append(this.o000oOoO);
        sb.append(")");
        return sb.toString();
    }
}

