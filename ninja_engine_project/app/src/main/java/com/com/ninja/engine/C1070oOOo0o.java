package com.ninja.engine;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.ninja.engine.oOOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070oOOo0o {
    public final ArrayList OooO00o;
    public ArrayList OooO0O0;
    public final ArrayList OooO0OO;
    public final List OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public C1073oOOo0o0o OooO0oO;
    public final /* synthetic */ RecyclerView OooO0oo;

    public C1070oOOo0o(RecyclerView recyclerView) {
        this.OooO0oo = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.OooO00o = arrayList;
        this.OooO0O0 = null;
        this.OooO0OO = new ArrayList();
        this.OooO0Oo = Collections.unmodifiableList(arrayList);
        this.OooO0o0 = 2;
        this.OooO0o = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x042f, code lost:
        if (r11.OooO() == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0457, code lost:
        if ((r14 + r12) >= r29) goto L228;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0535 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Type inference failed for: r2v38, types: [com.ninja.engine.oOO0OOO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ninja.engine.AbstractC1083oOOoO0o OooO(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1070oOOo0o.OooO(int, long):com.ninja.engine.oOOoO0o");
    }

    public final void OooO00o(AbstractC1083oOOoO0o abstractC1083oOOoO0o, boolean z) {
        C0028OooOooO c0028OooOooO;
        RecyclerView.OooOO0(abstractC1083oOOoO0o);
        RecyclerView recyclerView = this.OooO0oo;
        C1085oOOoO0oo c1085oOOoO0oo = recyclerView.OoooooO;
        if (c1085oOOoO0oo != null) {
            C1084oOOoO0oO c1084oOOoO0oO = c1085oOOoO0oo.OooO0o0;
            boolean z2 = c1084oOOoO0oO instanceof C1084oOOoO0oO;
            View view = abstractC1083oOOoO0o.OooO00o;
            if (z2) {
                c0028OooOooO = (C0028OooOooO) c1084oOOoO0oO.OooO0o0.remove(view);
            } else {
                c0028OooOooO = null;
            }
            AbstractC1460oo0O00oo.OooOOOo(view, c0028OooOooO);
        }
        if (z && recyclerView.Ooooo00 != null) {
            recyclerView.OooO0o.OooOOoo(abstractC1083oOOoO0o);
        }
        abstractC1083oOOoO0o.OooOOo = null;
        C1073oOOo0o0o OooO0OO = OooO0OO();
        OooO0OO.getClass();
        int i = abstractC1083oOOoO0o.OooO0o;
        ArrayList arrayList = OooO0OO.OooO00o(i).OooO00o;
        if (((C1072oOOo0o0O) OooO0OO.OooO00o.get(i)).OooO0O0 > arrayList.size()) {
            abstractC1083oOOoO0o.OooOOOo();
            arrayList.add(abstractC1083oOOoO0o);
        }
    }

    public final int OooO0O0(int i) {
        RecyclerView recyclerView = this.OooO0oo;
        if (i >= 0 && i < recyclerView.Ooooo00.OooO0O0()) {
            if (!recyclerView.Ooooo00.OooO0oO) {
                return i;
            }
            return recyclerView.OooO0Oo.OooO0oO(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.Ooooo00.OooO0O0() + recyclerView.OooOoO0());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.oOOo0o0o, java.lang.Object] */
    public final C1073oOOo0o0o OooO0OO() {
        if (this.OooO0oO == null) {
            ?? obj = new Object();
            obj.OooO00o = new SparseArray();
            obj.OooO0O0 = 0;
            this.OooO0oO = obj;
        }
        return this.OooO0oO;
    }

    public final void OooO0Oo() {
        ArrayList arrayList = this.OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OooO0o0(size);
        }
        arrayList.clear();
        if (RecyclerView.o0ooOO0) {
            C0671o0ooo0O c0671o0ooo0O = this.OooO0oo.OoooOoo;
            int[] iArr = (int[]) c0671o0ooo0O.OooO0Oo;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0671o0ooo0O.OooO0OO = 0;
        }
    }

    public final void OooO0o(View view) {
        AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
        boolean OooOOO0 = Oooo0.OooOOO0();
        RecyclerView recyclerView = this.OooO0oo;
        if (OooOOO0) {
            recyclerView.removeDetachedView(view, false);
        }
        if (Oooo0.OooOO0o()) {
            Oooo0.OooOOO.OooOO0(Oooo0);
        } else if (Oooo0.OooOOoo()) {
            Oooo0.OooOO0 &= -33;
        }
        OooO0oO(Oooo0);
        if (recyclerView.Oooo0O0 != null && !Oooo0.OooOO0()) {
            recyclerView.Oooo0O0.OooO0Oo(Oooo0);
        }
    }

    public final void OooO0o0(int i) {
        ArrayList arrayList = this.OooO0OO;
        OooO00o((AbstractC1083oOOoO0o) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oO(com.ninja.engine.AbstractC1083oOOoO0o r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1070oOOo0o.OooO0oO(com.ninja.engine.oOOoO0o):void");
    }

    public final void OooO0oo(View view) {
        ArrayList arrayList;
        AbstractC1064oOOo0OOO abstractC1064oOOo0OOO;
        AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
        boolean OooO0o = Oooo0.OooO0o(12);
        RecyclerView recyclerView = this.OooO0oo;
        if (!OooO0o && Oooo0.OooOOO() && (abstractC1064oOOo0OOO = recyclerView.Oooo0O0) != null) {
            C0367o0OOOo0o c0367o0OOOo0o = (C0367o0OOOo0o) abstractC1064oOOo0OOO;
            if (Oooo0.OooO0o0().isEmpty() && c0367o0OOOo0o.OooO0oO && !Oooo0.OooO()) {
                if (this.OooO0O0 == null) {
                    this.OooO0O0 = new ArrayList();
                }
                Oooo0.OooOOO = this;
                Oooo0.OooOOOO = true;
                arrayList = this.OooO0O0;
                arrayList.add(Oooo0);
            }
        }
        if (Oooo0.OooO() && !Oooo0.OooOO0O() && !recyclerView.OooOO0o.OooO0O0) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.OooOoO0());
        }
        Oooo0.OooOOO = this;
        Oooo0.OooOOOO = false;
        arrayList = this.OooO00o;
        arrayList.add(Oooo0);
    }

    public final void OooOO0(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        ArrayList arrayList;
        if (abstractC1083oOOoO0o.OooOOOO) {
            arrayList = this.OooO0O0;
        } else {
            arrayList = this.OooO00o;
        }
        arrayList.remove(abstractC1083oOOoO0o);
        abstractC1083oOOoO0o.OooOOO = null;
        abstractC1083oOOoO0o.OooOOOO = false;
        abstractC1083oOOoO0o.OooOO0 &= -33;
    }

    public final void OooOO0O() {
        int i;
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooO0oo.OooOOO0;
        if (abstractC1066oOOo0Oo != null) {
            i = abstractC1066oOOo0Oo.OooOO0;
        } else {
            i = 0;
        }
        this.OooO0o = this.OooO0o0 + i;
        ArrayList arrayList = this.OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.OooO0o; size--) {
            OooO0o0(size);
        }
    }
}
