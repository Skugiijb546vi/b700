package com.ninja.engine;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o0O00000 extends AbstractC1504oo0OOo00 {
    public final ArrayList OooOO0O;
    public int OooOO0o;

    public o0O00000(C0316o0O0o0o c0316o0O0o0o, int i) {
        super(c0316o0O0o0o);
        C0316o0O0o0o c0316o0O0o0o2;
        Object obj;
        int i2;
        Object obj2;
        this.OooOO0O = new ArrayList();
        this.OooO0o = i;
        C0316o0O0o0o c0316o0O0o0o3 = this.OooO0O0;
        while (true) {
            C0316o0O0o0o OooOOO0 = c0316o0O0o0o3.OooOOO0(i);
            c0316o0O0o0o2 = c0316o0O0o0o3;
            c0316o0O0o0o3 = OooOOO0;
            if (c0316o0O0o0o3 == null) {
                break;
            }
            i = this.OooO0o;
        }
        this.OooO0O0 = c0316o0O0o0o2;
        int i3 = this.OooO0o;
        if (i3 == 0) {
            obj = c0316o0O0o0o2.OooO0Oo;
        } else if (i3 == 1) {
            obj = c0316o0O0o0o2.OooO0o0;
        } else {
            obj = null;
        }
        ArrayList arrayList = this.OooOO0O;
        arrayList.add(obj);
        C0316o0O0o0o OooOO0o = c0316o0O0o0o2.OooOO0o(this.OooO0o);
        while (OooOO0o != null) {
            int i4 = this.OooO0o;
            if (i4 == 0) {
                obj2 = OooOO0o.OooO0Oo;
            } else if (i4 == 1) {
                obj2 = OooOO0o.OooO0o0;
            } else {
                obj2 = null;
            }
            arrayList.add(obj2);
            OooOO0o = OooOO0o.OooOO0o(this.OooO0o);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1504oo0OOo00 abstractC1504oo0OOo00 = (AbstractC1504oo0OOo00) it.next();
            int i5 = this.OooO0o;
            if (i5 == 0) {
                abstractC1504oo0OOo00.OooO0O0.OooO0O0 = this;
            } else if (i5 == 1) {
                abstractC1504oo0OOo00.OooO0O0.OooO0OO = this;
            }
        }
        if (this.OooO0o == 0 && ((C0580o0oOo0O0) this.OooO0O0.OoooO).o0ooOOo && arrayList.size() > 1) {
            this.OooO0O0 = ((AbstractC1504oo0OOo00) arrayList.get(arrayList.size() - 1)).OooO0O0;
        }
        if (this.OooO0o == 0) {
            i2 = this.OooO0O0.OoooooO;
        } else {
            i2 = this.OooO0O0.Ooooooo;
        }
        this.OooOO0o = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:276:0x039a, code lost:
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // com.ninja.engine.InterfaceC0376o0OOo00O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(com.ninja.engine.InterfaceC0376o0OOo00O r27) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0O00000.OooO00o(com.ninja.engine.o0OOo00O):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
        com.ninja.engine.AbstractC1504oo0OOo00.OooO0O0(r5, r1, -r0);
     */
    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0Oo() {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.OooOO0O
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.next()
            com.ninja.engine.oo0OOo00 r2 = (com.ninja.engine.AbstractC1504oo0OOo00) r2
            r2.OooO0Oo()
            goto L6
        L16:
            int r1 = r0.size()
            r2 = 1
            if (r1 >= r2) goto L1e
            return
        L1e:
            r3 = 0
            java.lang.Object r4 = (Object) r0.get(r3)
            com.ninja.engine.oo0OOo00 r4 = (com.ninja.engine.AbstractC1504oo0OOo00) r4
            com.ninja.engine.o0O0o0o r4 = r4.OooO0O0
            int r1 = r1 - r2
            java.lang.Object r0 = (Object) r0.get(r1)
            com.ninja.engine.oo0OOo00 r0 = (com.ninja.engine.AbstractC1504oo0OOo00) r0
            com.ninja.engine.o0O0o0o r0 = r0.OooO0O0
            int r1 = r7.OooO0o
            com.ninja.engine.o0OOo0O0 r5 = r7.OooO
            com.ninja.engine.o0OOo0O0 r6 = r7.OooO0oo
            if (r1 != 0) goto L6c
            com.ninja.engine.o0O0OoO r1 = r4.Oooo0
            com.ninja.engine.o0O0OoO r0 = r0.Oooo0OO
            com.ninja.engine.o0OOo0O0 r2 = com.ninja.engine.AbstractC1504oo0OOo00.OooO(r1, r3)
            int r1 = r1.OooO0o0()
            com.ninja.engine.o0O0o0o r4 = r7.OooOOO0()
            if (r4 == 0) goto L50
            com.ninja.engine.o0O0OoO r1 = r4.Oooo0
            int r1 = r1.OooO0o0()
        L50:
            if (r2 == 0) goto L55
            com.ninja.engine.AbstractC1504oo0OOo00.OooO0O0(r6, r2, r1)
        L55:
            com.ninja.engine.o0OOo0O0 r1 = com.ninja.engine.AbstractC1504oo0OOo00.OooO(r0, r3)
            int r0 = r0.OooO0o0()
            com.ninja.engine.o0O0o0o r2 = r7.OooOOO()
            if (r2 == 0) goto L69
            com.ninja.engine.o0O0OoO r0 = r2.Oooo0OO
            int r0 = r0.OooO0o0()
        L69:
            if (r1 == 0) goto La3
            goto L9f
        L6c:
            com.ninja.engine.o0O0OoO r1 = r4.Oooo0O0
            com.ninja.engine.o0O0OoO r0 = r0.Oooo0o0
            com.ninja.engine.o0OOo0O0 r3 = com.ninja.engine.AbstractC1504oo0OOo00.OooO(r1, r2)
            int r1 = r1.OooO0o0()
            com.ninja.engine.o0O0o0o r4 = r7.OooOOO0()
            if (r4 == 0) goto L84
            com.ninja.engine.o0O0OoO r1 = r4.Oooo0O0
            int r1 = r1.OooO0o0()
        L84:
            if (r3 == 0) goto L89
            com.ninja.engine.AbstractC1504oo0OOo00.OooO0O0(r6, r3, r1)
        L89:
            com.ninja.engine.o0OOo0O0 r1 = com.ninja.engine.AbstractC1504oo0OOo00.OooO(r0, r2)
            int r0 = r0.OooO0o0()
            com.ninja.engine.o0O0o0o r2 = r7.OooOOO()
            if (r2 == 0) goto L9d
            com.ninja.engine.o0O0OoO r0 = r2.Oooo0o0
            int r0 = r0.OooO0o0()
        L9d:
            if (r1 == 0) goto La3
        L9f:
            int r0 = -r0
            com.ninja.engine.AbstractC1504oo0OOo00.OooO0O0(r5, r1, r0)
        La3:
            r6.OooO00o = r7
            r5.OooO00o = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0O00000.OooO0Oo():void");
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o() {
        this.OooO0OO = null;
        Iterator it = this.OooOO0O.iterator();
        while (it.hasNext()) {
            ((AbstractC1504oo0OOo00) it.next()).OooO0o();
        }
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooOO0O;
            if (i < arrayList.size()) {
                ((AbstractC1504oo0OOo00) arrayList.get(i)).OooO0o0();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final long OooOO0() {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1504oo0OOo00 abstractC1504oo0OOo00 = (AbstractC1504oo0OOo00) arrayList.get(i);
            j = abstractC1504oo0OOo00.OooO.OooO0o + abstractC1504oo0OOo00.OooOO0() + j + abstractC1504oo0OOo00.OooO0oo.OooO0o;
        }
        return j;
    }

    @Override // com.ninja.engine.AbstractC1504oo0OOo00
    public final boolean OooOO0O() {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1504oo0OOo00) arrayList.get(i)).OooOO0O()) {
                return false;
            }
        }
        return true;
    }

    public final C0316o0O0o0o OooOOO() {
        ArrayList arrayList = this.OooOO0O;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0316o0O0o0o c0316o0O0o0o = ((AbstractC1504oo0OOo00) arrayList.get(size)).OooO0O0;
            if (c0316o0O0o0o.Oooooo0 != 8) {
                return c0316o0O0o0o;
            }
        }
        return null;
    }

    public final C0316o0O0o0o OooOOO0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooOO0O;
            if (i < arrayList.size()) {
                C0316o0O0o0o c0316o0O0o0o = ((AbstractC1504oo0OOo00) arrayList.get(i)).OooO0O0;
                if (c0316o0O0o0o.Oooooo0 != 8) {
                    return c0316o0O0o0o;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.OooO0o == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.OooOO0O.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((AbstractC1504oo0OOo00) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}


