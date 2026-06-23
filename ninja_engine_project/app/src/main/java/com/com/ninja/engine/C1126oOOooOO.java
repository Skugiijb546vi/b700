package com.ninja.engine;

import android.graphics.Bitmap;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.ninja.engine.oOOooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126oOOooOO implements o0OO0o00, InterfaceC0659o0ooOOOO, InterfaceC0954oOO0oOo {
    public final /* synthetic */ int OooO00o;
    public Object OooO0O0;
    public Object OooO0OO;

    public C1126oOOooOO(int i) {
        this.OooO00o = i;
        switch (i) {
            case 1:
                this.OooO0O0 = new C0838oO0o0oo(1000L);
                this.OooO0OO = AbstractC0694o0ooooo0.OoooO(10, new C0919oOO00oOo(9));
                return;
            case 3:
                return;
            case 6:
                this.OooO0O0 = new C1218oOoOOoo();
                this.OooO0OO = new C0832oO0o0o00();
                return;
            default:
                this.OooO0O0 = new ArrayList();
                this.OooO0OO = new HashMap();
                return;
        }
    }

    public synchronized List OooO(String str) {
        List list;
        if (!((ArrayList) this.OooO0O0).contains(str)) {
            ((ArrayList) this.OooO0O0).add(str);
        }
        list = (List) ((HashMap) this.OooO0OO).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.OooO0OO).put(str, list);
        }
        return list;
    }

    @Override // com.ninja.engine.InterfaceC0659o0ooOOOO
    public void OooO00o(Bitmap bitmap, InterfaceC0206o00o0OOO interfaceC0206o00o0OOO) {
        IOException iOException = ((C0501o0o00O) this.OooO0OO).OooO0O0;
        if (iOException != null) {
            if (bitmap != null) {
                interfaceC0206o00o0OOO.OooO(bitmap);
            }
            throw iOException;
        }
    }

    @Override // com.ninja.engine.o0OO0o00
    public void OooO0O0(Exception exc) {
        C0903oOO000Oo c0903oOO000Oo = (C0903oOO000Oo) this.OooO0O0;
        C0903oOO000Oo c0903oOO000Oo2 = ((C1233oOoOo0oo) this.OooO0OO).OooO0o;
        if (c0903oOO000Oo2 != null && c0903oOO000Oo2 == c0903oOO000Oo) {
            C1233oOoOo0oo c1233oOoOo0oo = (C1233oOoOo0oo) this.OooO0OO;
            InterfaceC0347o0OO0o0O interfaceC0347o0OO0o0O = c1233oOoOo0oo.OooO0O0;
            C0345o0OO0Ooo c0345o0OO0Ooo = c1233oOoOo0oo.OooO0oO;
            InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0 = ((C0903oOO000Oo) this.OooO0O0).OooO0OO;
            interfaceC0347o0OO0o0O.OooO0Oo(c0345o0OO0Ooo, exc, interfaceC0346o0OO0o0, interfaceC0346o0OO0o0.OooO0o());
        }
    }

    @Override // com.ninja.engine.InterfaceC0659o0ooOOOO
    public void OooO0OO() {
        C1057oOOo00oO c1057oOOo00oO = (C1057oOOo00oO) this.OooO0O0;
        synchronized (c1057oOOo00oO) {
            c1057oOOo00oO.OooO0OO = c1057oOOo00oO.OooO00o.length;
        }
    }

    @Override // com.ninja.engine.o0OO0o00
    public void OooO0Oo(Object obj) {
        C0903oOO000Oo c0903oOO000Oo = (C0903oOO000Oo) this.OooO0O0;
        C0903oOO000Oo c0903oOO000Oo2 = ((C1233oOoOo0oo) this.OooO0OO).OooO0o;
        if (c0903oOO000Oo2 != null && c0903oOO000Oo2 == c0903oOO000Oo) {
            C1233oOoOo0oo c1233oOoOo0oo = (C1233oOoOo0oo) this.OooO0OO;
            C0903oOO000Oo c0903oOO000Oo3 = (C0903oOO000Oo) this.OooO0O0;
            C0395o0OOoo c0395o0OOoo = c1233oOoOo0oo.OooO00o.OooOOOo;
            if (obj != null && c0395o0OOoo.OooO0OO(c0903oOO000Oo3.OooO0OO.OooO0o())) {
                c1233oOoOo0oo.OooO0o0 = obj;
                c1233oOoOo0oo.OooO0O0.OooO00o();
                return;
            }
            InterfaceC0347o0OO0o0O interfaceC0347o0OO0o0O = c1233oOoOo0oo.OooO0O0;
            InterfaceC0745oO00oOo interfaceC0745oO00oOo = c0903oOO000Oo3.OooO00o;
            InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0 = c0903oOO000Oo3.OooO0OO;
            interfaceC0347o0OO0o0O.OooO0O0(interfaceC0745oO00oOo, obj, interfaceC0346o0OO0o0, interfaceC0346o0OO0o0.OooO0o(), c1233oOoOo0oo.OooO0oO);
        }
    }

    public String OooO0o(InterfaceC0745oO00oOo interfaceC0745oO00oOo) {
        String str;
        C1188oOoOO000 c1188oOoOO000 = (C1188oOoOO000) ((C0131o00O0o) this.OooO0OO).OooO();
        try {
            interfaceC0745oO00oOo.OooO0O0(c1188oOoOO000.OooO00o);
            byte[] digest = c1188oOoOO000.OooO00o.digest();
            char[] cArr = AbstractC1401oo00OOO0.OooO0O0;
            synchronized (cArr) {
                for (int i = 0; i < digest.length; i++) {
                    byte b = digest[i];
                    int i2 = i * 2;
                    char[] cArr2 = AbstractC1401oo00OOO0.OooO00o;
                    cArr[i2] = cArr2[(b & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((C0131o00O0o) this.OooO0OO).OooO0OO(c1188oOoOO000);
        }
    }

    public void OooO0o0(AbstractC1083oOOoO0o abstractC1083oOOoO0o, oOO0OOO ooo0ooo) {
        C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) this.OooO0O0;
        C1461oo0O0O c1461oo0O0O = (C1461oo0O0O) c1218oOoOOoo.get(abstractC1083oOOoO0o);
        if (c1461oo0O0O == null) {
            c1461oo0O0O = C1461oo0O0O.OooO00o();
            c1218oOoOOoo.put(abstractC1083oOOoO0o, c1461oo0O0O);
        }
        c1461oo0O0O.OooO0OO = ooo0ooo;
        c1461oo0O0O.OooO00o |= 8;
    }

    public void OooO0oO(int i) {
        int[] iArr = (int[]) this.OooO0O0;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.OooO0O0 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.OooO0O0 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.OooO0O0;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View OooO0oo(int i, int i2, int i3, int i4) {
        int i5;
        InterfaceC1444oo00oooO interfaceC1444oo00oooO = (InterfaceC1444oo00oooO) this.OooO0O0;
        int OooOo00 = interfaceC1444oo00oooO.OooOo00();
        int OooOO0 = interfaceC1444oo00oooO.OooOO0();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View OooOOoo = interfaceC1444oo00oooO.OooOOoo(i);
            int OooOOO0 = interfaceC1444oo00oooO.OooOOO0(OooOOoo);
            int OooOo = interfaceC1444oo00oooO.OooOo(OooOOoo);
            C1443oo00ooo c1443oo00ooo = (C1443oo00ooo) this.OooO0OO;
            c1443oo00ooo.OooO0O0 = OooOo00;
            c1443oo00ooo.OooO0OO = OooOO0;
            c1443oo00ooo.OooO0Oo = OooOOO0;
            c1443oo00ooo.OooO0o0 = OooOo;
            if (i3 != 0) {
                c1443oo00ooo.OooO00o = i3;
                if (c1443oo00ooo.OooO00o()) {
                    return OooOOoo;
                }
            }
            if (i4 != 0) {
                c1443oo00ooo.OooO00o = i4;
                if (c1443oo00ooo.OooO00o()) {
                    view = OooOOoo;
                }
            }
            i += i5;
        }
        return view;
    }

    public synchronized ArrayList OooOO0(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.OooO0O0).iterator();
        while (it.hasNext()) {
            List<C1121oOOooO> list = (List) ((HashMap) this.OooO0OO).get((String) it.next());
            if (list != null) {
                for (C1121oOOooO c1121oOOooO : list) {
                    if (c1121oOOooO.OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(c1121oOOooO.OooO0O0) && !arrayList.contains(c1121oOOooO.OooO0O0)) {
                        arrayList.add(c1121oOOooO.OooO0O0);
                    }
                }
            }
        }
        return arrayList;
    }

    public String OooOO0O(InterfaceC0745oO00oOo interfaceC0745oO00oOo) {
        String str;
        synchronized (((C0838oO0o0oo) this.OooO0O0)) {
            str = (String) ((C0838oO0o0oo) this.OooO0O0).OooO00o(interfaceC0745oO00oOo);
        }
        if (str == null) {
            str = OooO0o(interfaceC0745oO00oOo);
        }
        synchronized (((C0838oO0o0oo) this.OooO0O0)) {
            ((C0838oO0o0oo) this.OooO0O0).OooO0Oo(interfaceC0745oO00oOo, str);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oo0oOOoO, java.lang.Object] */
    @Override // com.ninja.engine.InterfaceC0954oOO0oOo
    public C1536oo0OoOoO OooOO0o(View view, C1536oo0OoOoO c1536oo0OoOoO) {
        ?? obj = new Object();
        C1598oo0oOOoO c1598oo0oOOoO = (C1598oo0oOOoO) this.OooO0OO;
        obj.OooO00o = c1598oo0oOOoO.OooO00o;
        obj.OooO0O0 = c1598oo0oOOoO.OooO0O0;
        obj.OooO0OO = c1598oo0oOOoO.OooO0OO;
        obj.OooO0Oo = c1598oo0oOOoO.OooO0Oo;
        return ((InterfaceC1933ooo0OoO) this.OooO0O0).OooOOOO(view, c1536oo0OoOoO, obj);
    }

    public boolean OooOOO(View view) {
        InterfaceC1444oo00oooO interfaceC1444oo00oooO = (InterfaceC1444oo00oooO) this.OooO0O0;
        int OooOo00 = interfaceC1444oo00oooO.OooOo00();
        int OooOO0 = interfaceC1444oo00oooO.OooOO0();
        int OooOOO0 = interfaceC1444oo00oooO.OooOOO0(view);
        int OooOo = interfaceC1444oo00oooO.OooOo(view);
        C1443oo00ooo c1443oo00ooo = (C1443oo00ooo) this.OooO0OO;
        c1443oo00ooo.OooO0O0 = OooOo00;
        c1443oo00ooo.OooO0OO = OooOO0;
        c1443oo00ooo.OooO0Oo = OooOOO0;
        c1443oo00ooo.OooO0o0 = OooOo;
        c1443oo00ooo.OooO00o = 24579;
        return c1443oo00ooo.OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int OooOOO0(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.OooO0O0
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.OooO0OO
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L14
        L12:
            r0 = -1
            goto L6f
        L14:
            r2 = 0
            if (r0 != 0) goto L18
            goto L33
        L18:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1e:
            if (r0 < 0) goto L33
            java.lang.Object r3 = r5.OooO0OO
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            com.ninja.engine.ooOOO0O0 r3 = (com.ninja.engine.C1779ooOOO0O0) r3
            int r4 = r3.OooO00o
            if (r4 != r6) goto L30
            r2 = r3
            goto L33
        L30:
            int r0 = r0 + (-1)
            goto L1e
        L33:
            if (r2 == 0) goto L3c
            java.lang.Object r0 = r5.OooO0OO
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3c:
            java.lang.Object r0 = r5.OooO0OO
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L45:
            if (r2 >= r0) goto L59
            java.lang.Object r3 = r5.OooO0OO
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            com.ninja.engine.ooOOO0O0 r3 = (com.ninja.engine.C1779ooOOO0O0) r3
            int r3 = r3.OooO00o
            if (r3 < r6) goto L56
            goto L5a
        L56:
            int r2 = r2 + 1
            goto L45
        L59:
            r2 = -1
        L5a:
            if (r2 == r1) goto L12
            java.lang.Object r0 = r5.OooO0OO
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            com.ninja.engine.ooOOO0O0 r0 = (com.ninja.engine.C1779ooOOO0O0) r0
            java.lang.Object r3 = r5.OooO0OO
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.OooO00o
        L6f:
            if (r0 != r1) goto L7f
            java.lang.Object r0 = r5.OooO0O0
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.OooO0O0
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L7f:
            java.lang.Object r2 = r5.OooO0O0
            int[] r2 = (int[]) r2
            int r0 = r0 + 1
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1126oOOooOO.OooOOO0(int):int");
    }

    public void OooOOOO(int i, int i2) {
        int[] iArr = (int[]) this.OooO0O0;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            OooO0oO(i3);
            int[] iArr2 = (int[]) this.OooO0O0;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.OooO0O0, i, i3, -1);
            List list = (List) this.OooO0OO;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1779ooOOO0O0 c1779ooOOO0O0 = (C1779ooOOO0O0) ((List) this.OooO0OO).get(size);
                    int i4 = c1779ooOOO0O0.OooO00o;
                    if (i4 >= i) {
                        c1779ooOOO0O0.OooO00o = i4 + i2;
                    }
                }
            }
        }
    }

    public void OooOOOo(int i, int i2) {
        int[] iArr = (int[]) this.OooO0O0;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            OooO0oO(i3);
            int[] iArr2 = (int[]) this.OooO0O0;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.OooO0O0;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = (List) this.OooO0OO;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1779ooOOO0O0 c1779ooOOO0O0 = (C1779ooOOO0O0) ((List) this.OooO0OO).get(size);
                    int i4 = c1779ooOOO0O0.OooO00o;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((List) this.OooO0OO).remove(size);
                        } else {
                            c1779ooOOO0O0.OooO00o = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public void OooOOo(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        C1461oo0O0O c1461oo0O0O = (C1461oo0O0O) ((C1218oOoOOoo) this.OooO0O0).get(abstractC1083oOOoO0o);
        if (c1461oo0O0O == null) {
            return;
        }
        c1461oo0O0O.OooO00o &= -2;
    }

    public oOO0OOO OooOOo0(AbstractC1083oOOoO0o abstractC1083oOOoO0o, int i) {
        C1461oo0O0O c1461oo0O0O;
        oOO0OOO ooo0ooo;
        C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) this.OooO0O0;
        int OooO0Oo = c1218oOoOOoo.OooO0Oo(abstractC1083oOOoO0o);
        if (OooO0Oo >= 0 && (c1461oo0O0O = (C1461oo0O0O) c1218oOoOOoo.OooOO0(OooO0Oo)) != null) {
            int i2 = c1461oo0O0O.OooO00o;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c1461oo0O0O.OooO00o = i3;
                if (i == 4) {
                    ooo0ooo = c1461oo0O0O.OooO0O0;
                } else if (i == 8) {
                    ooo0ooo = c1461oo0O0O.OooO0OO;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c1218oOoOOoo.OooO0oo(OooO0Oo);
                    c1461oo0O0O.OooO00o = 0;
                    c1461oo0O0O.OooO0O0 = null;
                    c1461oo0O0O.OooO0OO = null;
                    C1461oo0O0O.OooO0Oo.OooO0OO(c1461oo0O0O);
                }
                return ooo0ooo;
            }
        }
        return null;
    }

    public void OooOOoo(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        C0832oO0o0o00 c0832oO0o0o00 = (C0832oO0o0o00) this.OooO0OO;
        int OooO0oo = c0832oO0o0o00.OooO0oo() - 1;
        while (true) {
            if (OooO0oo < 0) {
                break;
            } else if (abstractC1083oOOoO0o == c0832oO0o0o00.OooO(OooO0oo)) {
                Object[] objArr = c0832oO0o0o00.OooO0OO;
                Object obj = objArr[OooO0oo];
                Object obj2 = AbstractC0809oO0OooOO.OooO0oO;
                if (obj != obj2) {
                    objArr[OooO0oo] = obj2;
                    c0832oO0o0o00.OooO00o = true;
                }
            } else {
                OooO0oo--;
            }
        }
        C1461oo0O0O c1461oo0O0O = (C1461oo0O0O) ((C1218oOoOOoo) this.OooO0O0).remove(abstractC1083oOOoO0o);
        if (c1461oo0O0O != null) {
            c1461oo0O0O.OooO00o = 0;
            c1461oo0O0O.OooO0O0 = null;
            c1461oo0O0O.OooO0OO = null;
            C1461oo0O0O.OooO0Oo.OooO0OO(c1461oo0O0O);
        }
    }

    public String toString() {
        switch (this.OooO00o) {
            case 8:
                return "Bounds{lower=" + ((C0724oO00OooO) this.OooO0O0) + " upper=" + ((C0724oO00OooO) this.OooO0OO) + "}";
            default:
                return super.toString();
        }
    }

    public C1126oOOooOO(C1233oOoOo0oo c1233oOoOo0oo, C0903oOO000Oo c0903oOO000Oo) {
        this.OooO00o = 2;
        this.OooO0OO = c1233oOoOo0oo;
        this.OooO0O0 = c0903oOO000Oo;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ninja.engine.oo00ooo, java.lang.Object] */
    public C1126oOOooOO(InterfaceC1444oo00oooO interfaceC1444oo00oooO) {
        this.OooO00o = 5;
        this.OooO0O0 = interfaceC1444oo00oooO;
        ?? obj = new Object();
        obj.OooO00o = 0;
        this.OooO0OO = obj;
    }

    public /* synthetic */ C1126oOOooOO(Object obj, int i, Object obj2) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }
}
