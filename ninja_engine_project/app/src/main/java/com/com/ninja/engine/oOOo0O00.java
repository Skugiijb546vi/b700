package com.ninja.engine;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class oOOo0O00 {
    public final /* synthetic */ RecyclerView OooO00o;

    public /* synthetic */ oOOo0O00(RecyclerView recyclerView) {
        this.OooO00o = recyclerView;
    }

    public void OooO00o(o0000O o0000o) {
        int i = o0000o.OooO00o;
        RecyclerView recyclerView = this.OooO00o;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        recyclerView.OooOOO0.OoooOo0(o0000o.OooO0O0, o0000o.OooO0Oo);
                        return;
                    }
                    return;
                }
                recyclerView.OooOOO0.OoooOoo(o0000o.OooO0O0, o0000o.OooO0Oo);
                return;
            }
            recyclerView.OooOOO0.OoooOoO(o0000o.OooO0O0, o0000o.OooO0Oo);
            return;
        }
        recyclerView.OooOOO0.OoooOOO(o0000o.OooO0O0, o0000o.OooO0Oo);
    }

    public AbstractC1083oOOoO0o OooO0O0(int i) {
        RecyclerView recyclerView = this.OooO00o;
        int OooOooo = recyclerView.OooO0o0.OooOooo();
        int i2 = 0;
        AbstractC1083oOOoO0o abstractC1083oOOoO0o = null;
        while (true) {
            if (i2 >= OooOooo) {
                break;
            }
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(recyclerView.OooO0o0.OooOooO(i2));
            if (Oooo0 != null && !Oooo0.OooOO0O() && Oooo0.OooO0OO == i) {
                if (recyclerView.OooO0o0.Oooo00o(Oooo0.OooO00o)) {
                    abstractC1083oOOoO0o = Oooo0;
                } else {
                    abstractC1083oOOoO0o = Oooo0;
                    break;
                }
            }
            i2++;
        }
        if (abstractC1083oOOoO0o == null || recyclerView.OooO0o0.Oooo00o(abstractC1083oOOoO0o.OooO00o)) {
            return null;
        }
        return abstractC1083oOOoO0o;
    }

    public void OooO0OO(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.OooO00o;
        int OooOooo = recyclerView.OooO0o0.OooOooo();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < OooOooo; i6++) {
            View OooOooO = recyclerView.OooO0o0.OooOooO(i6);
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(OooOooO);
            if (Oooo0 != null && !Oooo0.OooOOo() && (i4 = Oooo0.OooO0OO) >= i && i4 < i5) {
                Oooo0.OooO0O0(2);
                Oooo0.OooO00o(obj);
                ((C1068oOOo0OoO) OooOooO.getLayoutParams()).OooO0OO = true;
            }
        }
        C1070oOOo0o c1070oOOo0o = recyclerView.OooO0O0;
        ArrayList arrayList = c1070oOOo0o.OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) arrayList.get(size);
            if (abstractC1083oOOoO0o != null && (i3 = abstractC1083oOOoO0o.OooO0OO) >= i && i3 < i5) {
                abstractC1083oOOoO0o.OooO0O0(2);
                c1070oOOo0o.OooO0o0(size);
            }
        }
        recyclerView.OooooOo = true;
    }

    public void OooO0Oo(int i, int i2) {
        RecyclerView recyclerView = this.OooO00o;
        int OooOooo = recyclerView.OooO0o0.OooOooo();
        for (int i3 = 0; i3 < OooOooo; i3++) {
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(recyclerView.OooO0o0.OooOooO(i3));
            if (Oooo0 != null && !Oooo0.OooOOo() && Oooo0.OooO0OO >= i) {
                Oooo0.OooOOOO(i2, false);
                recyclerView.Ooooo00.OooO0o = true;
            }
        }
        ArrayList arrayList = recyclerView.OooO0O0.OooO0OO;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) arrayList.get(i4);
            if (abstractC1083oOOoO0o != null && abstractC1083oOOoO0o.OooO0OO >= i) {
                abstractC1083oOOoO0o.OooOOOO(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.OooooOO = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO0o(com.ninja.engine.AbstractC1083oOOoO0o r9, com.ninja.engine.oOO0OOO r10, com.ninja.engine.oOO0OOO r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.OooO00o
            r0.getClass()
            r1 = 0
            r9.OooOOo0(r1)
            com.ninja.engine.oOOo0OOO r1 = r0.Oooo0O0
            r2 = r1
            com.ninja.engine.o0OOOo0o r2 = (com.ninja.engine.C0367o0OOOo0o) r2
            if (r10 == 0) goto L29
            r2.getClass()
            int r4 = r10.OooO00o
            int r6 = r11.OooO00o
            if (r4 != r6) goto L1f
            int r1 = r10.OooO0O0
            int r3 = r11.OooO0O0
            if (r1 == r3) goto L29
        L1f:
            int r5 = r10.OooO0O0
            int r7 = r11.OooO0O0
            r3 = r9
            boolean r9 = r2.OooO0oO(r3, r4, r5, r6, r7)
            goto L38
        L29:
            r2.OooOO0o(r9)
            android.view.View r10 = r9.OooO00o
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.OooO
            r10.add(r9)
            r9 = 1
        L38:
            if (r9 == 0) goto L3d
            r0.OoooO0O()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.oOOo0O00.OooO0o(com.ninja.engine.oOOoO0o, com.ninja.engine.oOO0OOO, com.ninja.engine.oOO0OOO):void");
    }

    public void OooO0o0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.OooO00o;
        int OooOooo = recyclerView.OooO0o0.OooOooo();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < OooOooo; i11++) {
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(recyclerView.OooO0o0.OooOooO(i11));
            if (Oooo0 != null && (i9 = Oooo0.OooO0OO) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    Oooo0.OooOOOO(i2 - i, false);
                } else {
                    Oooo0.OooOOOO(i5, false);
                }
                recyclerView.Ooooo00.OooO0o = true;
            }
        }
        C1070oOOo0o c1070oOOo0o = recyclerView.OooO0O0;
        c1070oOOo0o.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = c1070oOOo0o.OooO0OO;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) arrayList.get(i12);
            if (abstractC1083oOOoO0o != null && (i8 = abstractC1083oOOoO0o.OooO0OO) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC1083oOOoO0o.OooOOOO(i2 - i, false);
                } else {
                    abstractC1083oOOoO0o.OooOOOO(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.OooooOO = true;
    }

    public void OooO0oO(AbstractC1083oOOoO0o abstractC1083oOOoO0o, oOO0OOO ooo0ooo, oOO0OOO ooo0ooo2) {
        int i;
        int i2;
        boolean z;
        RecyclerView recyclerView = this.OooO00o;
        recyclerView.OooO0O0.OooOO0(abstractC1083oOOoO0o);
        recyclerView.OooO0o(abstractC1083oOOoO0o);
        abstractC1083oOOoO0o.OooOOo0(false);
        C0367o0OOOo0o c0367o0OOOo0o = (C0367o0OOOo0o) recyclerView.Oooo0O0;
        c0367o0OOOo0o.getClass();
        int i3 = ooo0ooo.OooO00o;
        int i4 = ooo0ooo.OooO0O0;
        View view = abstractC1083oOOoO0o.OooO00o;
        if (ooo0ooo2 == null) {
            i = view.getLeft();
        } else {
            i = ooo0ooo2.OooO00o;
        }
        int i5 = i;
        if (ooo0ooo2 == null) {
            i2 = view.getTop();
        } else {
            i2 = ooo0ooo2.OooO0O0;
        }
        int i6 = i2;
        if (!abstractC1083oOOoO0o.OooOO0O() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            z = c0367o0OOOo0o.OooO0oO(abstractC1083oOOoO0o, i3, i4, i5, i6);
        } else {
            c0367o0OOOo0o.OooOO0o(abstractC1083oOOoO0o);
            c0367o0OOOo0o.OooO0oo.add(abstractC1083oOOoO0o);
            z = true;
        }
        if (z) {
            recyclerView.OoooO0O();
        }
    }
}
