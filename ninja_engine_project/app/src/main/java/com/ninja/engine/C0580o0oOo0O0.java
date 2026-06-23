package com.ninja.engine;

import com.app.framework.utils.ShellUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0oOo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580o0oOo0O0 extends C0316o0O0o0o {
    public WeakReference o00000;
    public int o000000;
    public boolean o000000O;
    public boolean o000000o;
    public WeakReference o00000O;
    public WeakReference o00000O0;
    public WeakReference o00000OO;
    public final HashSet o00000Oo;
    public final C0189o00o00 o00000o0;
    public o0[] o000OOo;
    public int o00oO0O;
    public final C0377o0OOo00o o00oO0o;
    public o0[] o0O0O00;
    public int o0OO00O;
    public int o0OOO0o;
    public int o0Oo0oo;
    public o0O0o000 o0ooOO0;
    public boolean o0ooOOo;
    public final oO0OO0O o0ooOoO;
    public int oo0o0Oo;
    public ArrayList o00ooo = new ArrayList();
    public final C0131o00O0o oo000o = new C0131o00O0o(this);

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ninja.engine.o0OOo00o] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ninja.engine.o00o00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ninja.engine.o00o00, java.lang.Object] */
    public C0580o0oOo0O0() {
        Object obj = new Object();
        obj.OooO0O0 = true;
        obj.OooO0OO = true;
        obj.OooO0o0 = new ArrayList();
        new ArrayList();
        obj.OooO0o = null;
        obj.OooO0oO = new Object();
        obj.OooO0oo = new ArrayList();
        obj.OooO00o = this;
        obj.OooO0Oo = this;
        this.o00oO0o = obj;
        this.o0ooOO0 = null;
        this.o0ooOOo = false;
        this.o0ooOoO = new oO0OO0O();
        this.o0OO00O = 0;
        this.oo0o0Oo = 0;
        this.o0O0O00 = new o0[4];
        this.o000OOo = new o0[4];
        this.o000000 = 257;
        this.o000000O = false;
        this.o000000o = false;
        this.o00000 = null;
        this.o00000O0 = null;
        this.o00000O = null;
        this.o00000OO = null;
        this.o00000Oo = new HashSet();
        this.o00000o0 = new Object();
    }

    public static void o000oOoO(C0316o0O0o0o c0316o0O0o0o, o0O0o000 o0o0o000, C0189o00o00 c0189o00o00) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        if (o0o0o000 == null) {
            return;
        }
        if (c0316o0O0o0o.Oooooo0 != 8 && !(c0316o0O0o0o instanceof C0699oO0000oo) && !(c0316o0O0o0o instanceof C0181o00OooO)) {
            int[] iArr = c0316o0O0o0o.o00o0O;
            c0189o00o00.OooO00o = iArr[0];
            c0189o00o00.OooO0O0 = iArr[1];
            c0189o00o00.OooO0OO = c0316o0O0o0o.OooOOo0();
            c0189o00o00.OooO0Oo = c0316o0O0o0o.OooOO0O();
            c0189o00o00.OooO = false;
            c0189o00o00.OooOO0 = 0;
            if (c0189o00o00.OooO00o == 3) {
                z = true;
            } else {
                z = false;
            }
            if (c0189o00o00.OooO0O0 == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && c0316o0O0o0o.OoooOOO > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && c0316o0O0o0o.OoooOOO > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && c0316o0O0o0o.OooOo00(0) && c0316o0O0o0o.OooOOo == 0 && !z3) {
                c0189o00o00.OooO00o = 2;
                if (z2 && c0316o0O0o0o.OooOOoo == 0) {
                    c0189o00o00.OooO00o = 1;
                }
                z = false;
            }
            if (z2 && c0316o0O0o0o.OooOo00(1) && c0316o0O0o0o.OooOOoo == 0 && !z4) {
                c0189o00o00.OooO0O0 = 2;
                if (z && c0316o0O0o0o.OooOOo == 0) {
                    c0189o00o00.OooO0O0 = 1;
                }
                z2 = false;
            }
            if (c0316o0O0o0o.OooOoOO()) {
                c0189o00o00.OooO00o = 1;
                z = false;
            }
            if (c0316o0O0o0o.OooOoo0()) {
                c0189o00o00.OooO0O0 = 1;
                z2 = false;
            }
            int[] iArr2 = c0316o0O0o0o.OooOo00;
            if (z3) {
                if (iArr2[0] == 4) {
                    c0189o00o00.OooO00o = 1;
                } else if (!z2) {
                    if (c0189o00o00.OooO0O0 == 1) {
                        i3 = c0189o00o00.OooO0Oo;
                    } else {
                        c0189o00o00.OooO00o = 2;
                        o0o0o000.OooO0O0(c0316o0O0o0o, c0189o00o00);
                        i3 = c0189o00o00.OooO0o;
                    }
                    c0189o00o00.OooO00o = 1;
                    c0189o00o00.OooO0OO = (int) (c0316o0O0o0o.OoooOOO * i3);
                }
            }
            if (z4) {
                if (iArr2[1] == 4) {
                    c0189o00o00.OooO0O0 = 1;
                } else if (!z) {
                    if (c0189o00o00.OooO00o == 1) {
                        i = c0189o00o00.OooO0OO;
                    } else {
                        c0189o00o00.OooO0O0 = 2;
                        o0o0o000.OooO0O0(c0316o0O0o0o, c0189o00o00);
                        i = c0189o00o00.OooO0o0;
                    }
                    c0189o00o00.OooO0O0 = 1;
                    if (c0316o0O0o0o.OoooOOo == -1) {
                        i2 = (int) (i / c0316o0O0o0o.OoooOOO);
                    } else {
                        i2 = (int) (c0316o0O0o0o.OoooOOO * i);
                    }
                    c0189o00o00.OooO0Oo = i2;
                }
            }
            o0o0o000.OooO0O0(c0316o0O0o0o, c0189o00o00);
            c0316o0O0o0o.Oooo0oo(c0189o00o00.OooO0o0);
            c0316o0O0o0o.Oooo0o0(c0189o00o00.OooO0o);
            c0316o0O0o0o.OooOooo = c0189o00o00.OooO0oo;
            c0316o0O0o0o.Oooo0(c0189o00o00.OooO0oO);
            c0189o00o00.OooOO0 = 0;
            return;
        }
        c0189o00o00.OooO0o0 = 0;
        c0189o00o00.OooO0o = 0;
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final void OooOOO(StringBuilder sb) {
        sb.append(this.OooOO0 + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.OoooOO0);
        sb.append(sb2.toString());
        sb.append(ShellUtils.COMMAND_LINE_END);
        sb.append("  actualHeight:" + this.o000oOoO);
        sb.append(ShellUtils.COMMAND_LINE_END);
        Iterator it = this.o00ooo.iterator();
        while (it.hasNext()) {
            ((C0316o0O0o0o) it.next()).OooOOO(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final void OooOoo() {
        this.o0ooOoO.OooOo00();
        this.o0OOO0o = 0;
        this.o0Oo0oo = 0;
        OoooOOo();
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final void Oooo(boolean z, boolean z2) {
        super.Oooo(z, z2);
        int size = this.o00ooo.size();
        for (int i = 0; i < size; i++) {
            ((C0316o0O0o0o) this.o00ooo.get(i)).Oooo(z, z2);
        }
    }

    @Override // com.ninja.engine.C0316o0O0o0o
    public final void Oooo000(C0131o00O0o c0131o00O0o) {
        super.Oooo000(c0131o00O0o);
        int size = this.o00ooo.size();
        for (int i = 0; i < size; i++) {
            ((C0316o0O0o0o) this.o00ooo.get(i)).Oooo000(c0131o00O0o);
        }
    }

    public final boolean OoooO(int i, boolean z) {
        boolean z2;
        C0392o0OOoOOO c0392o0OOoOOO;
        int OooOO0O;
        boolean z3 = true;
        boolean z4 = z & true;
        C0377o0OOo00o c0377o0OOo00o = this.o00oO0o;
        C0580o0oOo0O0 c0580o0oOo0O0 = c0377o0OOo00o.OooO00o;
        int OooOO0 = c0580o0oOo0O0.OooOO0(0);
        int OooOO02 = c0580o0oOo0O0.OooOO0(1);
        int OooOOo = c0580o0oOo0O0.OooOOo();
        int OooOOoo = c0580o0oOo0O0.OooOOoo();
        ArrayList arrayList = c0377o0OOo00o.OooO0o0;
        if (z4 && (OooOO0 == 2 || OooOO02 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1504oo0OOo00 abstractC1504oo0OOo00 = (AbstractC1504oo0OOo00) it.next();
                if (abstractC1504oo0OOo00.OooO0o == i && !abstractC1504oo0OOo00.OooOO0O()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && OooOO0 == 2) {
                    c0580o0oOo0O0.Oooo0o(1);
                    c0580o0oOo0O0.Oooo0oo(c0377o0OOo00o.OooO0Oo(c0580o0oOo0O0, 0));
                    c0392o0OOoOOO = c0580o0oOo0O0.OooO0Oo.OooO0o0;
                    OooOO0O = c0580o0oOo0O0.OooOOo0();
                    c0392o0OOoOOO.OooO0Oo(OooOO0O);
                }
            } else if (z4 && OooOO02 == 2) {
                c0580o0oOo0O0.Oooo0oO(1);
                c0580o0oOo0O0.Oooo0o0(c0377o0OOo00o.OooO0Oo(c0580o0oOo0O0, 1));
                c0392o0OOoOOO = c0580o0oOo0O0.OooO0o0.OooO0o0;
                OooOO0O = c0580o0oOo0O0.OooOO0O();
                c0392o0OOoOOO.OooO0Oo(OooOO0O);
            }
        }
        int[] iArr = c0580o0oOo0O0.o00o0O;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int OooOOo0 = c0580o0oOo0O0.OooOOo0() + OooOOo;
                c0580o0oOo0O0.OooO0Oo.OooO.OooO0Oo(OooOOo0);
                c0580o0oOo0O0.OooO0Oo.OooO0o0.OooO0Oo(OooOOo0 - OooOOo);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int OooOO0O2 = c0580o0oOo0O0.OooOO0O() + OooOOoo;
                c0580o0oOo0O0.OooO0o0.OooO.OooO0Oo(OooOO0O2);
                c0580o0oOo0O0.OooO0o0.OooO0o0.OooO0Oo(OooOO0O2 - OooOOoo);
                z2 = true;
            }
            z2 = false;
        }
        c0377o0OOo00o.OooO0oO();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1504oo0OOo00 abstractC1504oo0OOo002 = (AbstractC1504oo0OOo00) it2.next();
            if (abstractC1504oo0OOo002.OooO0o == i && (abstractC1504oo0OOo002.OooO0O0 != c0580o0oOo0O0 || abstractC1504oo0OOo002.OooO0oO)) {
                abstractC1504oo0OOo002.OooO0o0();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1504oo0OOo00 abstractC1504oo0OOo003 = (AbstractC1504oo0OOo00) it3.next();
            if (abstractC1504oo0OOo003.OooO0o == i && (z2 || abstractC1504oo0OOo003.OooO0O0 != c0580o0oOo0O0)) {
                if (!abstractC1504oo0OOo003.OooO0oo.OooOO0 || !abstractC1504oo0OOo003.OooO.OooOO0 || (!(abstractC1504oo0OOo003 instanceof o0O00000) && !abstractC1504oo0OOo003.OooO0o0.OooOO0)) {
                    z3 = false;
                    break;
                }
            }
        }
        c0580o0oOo0O0.Oooo0o(OooOO0);
        c0580o0oOo0O0.Oooo0oO(OooOO02);
        return z3;
    }

    public final void OoooO0(C0316o0O0o0o c0316o0O0o0o, int i) {
        if (i == 0) {
            int i2 = this.o0OO00O + 1;
            o0[] o0VarArr = this.o000OOo;
            if (i2 >= o0VarArr.length) {
                this.o000OOo = (o0[]) Arrays.copyOf(o0VarArr, o0VarArr.length * 2);
            }
            o0[] o0VarArr2 = this.o000OOo;
            int i3 = this.o0OO00O;
            o0VarArr2[i3] = new o0(c0316o0O0o0o, 0, this.o0ooOOo);
            this.o0OO00O = i3 + 1;
        } else if (i == 1) {
            int i4 = this.oo0o0Oo + 1;
            o0[] o0VarArr3 = this.o0O0O00;
            if (i4 >= o0VarArr3.length) {
                this.o0O0O00 = (o0[]) Arrays.copyOf(o0VarArr3, o0VarArr3.length * 2);
            }
            o0[] o0VarArr4 = this.o0O0O00;
            int i5 = this.oo0o0Oo;
            o0VarArr4[i5] = new o0(c0316o0O0o0o, 1, this.o0ooOOo);
            this.oo0o0Oo = i5 + 1;
        }
    }

    public final void OoooO0O(oO0OO0O oo0oo0o) {
        int i;
        boolean OoooOOO = OoooOOO(64);
        OooO0O0(oo0oo0o, OoooOOO);
        int size = this.o00ooo.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0316o0O0o0o c0316o0O0o0o = (C0316o0O0o0o) this.o00ooo.get(i2);
            boolean[] zArr = c0316o0O0o0o.OoooO0O;
            zArr[0] = false;
            zArr[1] = false;
            if (c0316o0O0o0o instanceof C0181o00OooO) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C0316o0O0o0o c0316o0O0o0o2 = (C0316o0O0o0o) this.o00ooo.get(i3);
                if (c0316o0O0o0o2 instanceof C0181o00OooO) {
                    C0181o00OooO c0181o00OooO = (C0181o00OooO) c0316o0O0o0o2;
                    for (int i4 = 0; i4 < c0181o00OooO.oo000o; i4++) {
                        C0316o0O0o0o c0316o0O0o0o3 = c0181o00OooO.o00ooo[i4];
                        if (c0181o00OooO.o00oO0O || c0316o0O0o0o3.OooO0OO()) {
                            int i5 = c0181o00OooO.o00oO0o;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    c0316o0O0o0o3.OoooO0O[1] = true;
                                }
                            } else {
                                c0316o0O0o0o3.OoooO0O[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.o00000Oo;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            C0316o0O0o0o c0316o0O0o0o4 = (C0316o0O0o0o) this.o00ooo.get(i6);
            c0316o0O0o0o4.getClass();
            boolean z2 = c0316o0O0o0o4 instanceof C0550o0o0Oo0;
            if (z2 || (c0316o0O0o0o4 instanceof C0699oO0000oo)) {
                if (z2) {
                    hashSet.add(c0316o0O0o0o4);
                } else {
                    c0316o0O0o0o4.OooO0O0(oo0oo0o, OoooOOO);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0550o0o0Oo0 c0550o0o0Oo0 = (C0550o0o0Oo0) ((C0316o0O0o0o) it.next());
                for (int i7 = 0; i7 < c0550o0o0Oo0.oo000o; i7++) {
                    if (hashSet.contains(c0550o0o0Oo0.o00ooo[i7])) {
                        c0550o0o0Oo0.OooO0O0(oo0oo0o, OoooOOO);
                        hashSet.remove(c0550o0o0Oo0);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0316o0O0o0o) it2.next()).OooO0O0(oo0oo0o, OoooOOO);
                }
                hashSet.clear();
            }
        }
        if (oO0OO0O.OooOOo0) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                C0316o0O0o0o c0316o0O0o0o5 = (C0316o0O0o0o) this.o00ooo.get(i8);
                c0316o0O0o0o5.getClass();
                if (!(c0316o0O0o0o5 instanceof C0550o0o0Oo0) && !(c0316o0O0o0o5 instanceof C0699oO0000oo)) {
                    hashSet2.add(c0316o0O0o0o5);
                }
            }
            if (this.o00o0O[0] == 2) {
                i = 0;
            } else {
                i = 1;
            }
            OooO00o(this, oo0oo0o, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0316o0O0o0o c0316o0O0o0o6 = (C0316o0O0o0o) it3.next();
                AbstractC0694o0ooooo0.OooO(this, oo0oo0o, c0316o0O0o0o6);
                c0316o0O0o0o6.OooO0O0(oo0oo0o, OoooOOO);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                C0316o0O0o0o c0316o0O0o0o7 = (C0316o0O0o0o) this.o00ooo.get(i9);
                if (c0316o0O0o0o7 instanceof C0580o0oOo0O0) {
                    int[] iArr = c0316o0O0o0o7.o00o0O;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        c0316o0O0o0o7.Oooo0o(1);
                    }
                    if (i11 == 2) {
                        c0316o0O0o0o7.Oooo0oO(1);
                    }
                    c0316o0O0o0o7.OooO0O0(oo0oo0o, OoooOOO);
                    if (i10 == 2) {
                        c0316o0O0o0o7.Oooo0o(i10);
                    }
                    if (i11 == 2) {
                        c0316o0O0o0o7.Oooo0oO(i11);
                    }
                } else {
                    AbstractC0694o0ooooo0.OooO(this, oo0oo0o, c0316o0O0o0o7);
                    if (!(c0316o0O0o0o7 instanceof C0550o0o0Oo0) && !(c0316o0O0o0o7 instanceof C0699oO0000oo)) {
                        c0316o0O0o0o7.OooO0O0(oo0oo0o, OoooOOO);
                    }
                }
            }
        }
        if (this.o0OO00O > 0) {
            AbstractC0809oO0OooOO.OooO0OO(this, oo0oo0o, null, 0);
        }
        if (this.oo0o0Oo > 0) {
            AbstractC0809oO0OooOO.OooO0OO(this, oo0oo0o, null, 1);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:227|(7:228|229|(1:231)|232|233|234|235)|(3:353|354|(28:356|357|358|359|360|361|362|238|239|(1:243)|244|(6:248|249|250|251|252|253)|325|(1:350)(9:329|330|331|332|333|334|335|336|337)|338|339|260|(4:262|(3:264|(2:270|271)(1:268)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)(1:319)|295|(1:297)(1:318)|(1:317)(4:299|(1:304)|305|(3:310|(2:312|313)(1:315)|314))|316|(0)(0)|314))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|325|(1:327)|350|338|339|260|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)(0)|295|(0)(0)|(0)(0)|316|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x078a, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0817 A[LOOP:14: B:499:0x0815->B:500:0x0817, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x08e5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v53, types: [com.ninja.engine.o00o00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OoooOO0() {
        /*
            Method dump skipped, instructions count: 2301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0580o0oOo0O0.OoooOO0():void");
    }

    public final boolean OoooOOO(int i) {
        if ((this.o000000 & i) == i) {
            return true;
        }
        return false;
    }

    public final void OoooOOo() {
        this.o00ooo.clear();
        super.OooOoo();
    }
}

