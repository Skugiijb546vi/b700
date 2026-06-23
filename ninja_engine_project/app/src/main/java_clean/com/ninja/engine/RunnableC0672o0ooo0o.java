package com.ninja.engine;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* renamed from: com.ninja.engine.o0ooo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0672o0ooo0o implements Runnable {
    public ArrayList OooO00o;
    public long OooO0O0;
    public long OooO0OO;
    public ArrayList OooO0Oo;
    public static final ThreadLocal OooO0o0 = new ThreadLocal();
    public static final C0332o0O0oo0 OooO0o = new C0332o0O0oo0(1);

    public static AbstractC1083oOOoO0o OooO0OO(RecyclerView recyclerView, int i, long j) {
        int OooOooo = recyclerView.OooO0o0.OooOooo();
        for (int i2 = 0; i2 < OooOooo; i2++) {
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(recyclerView.OooO0o0.OooOooO(i2));
            if (Oooo0.OooO0OO == i && !Oooo0.OooO()) {
                return null;
            }
        }
        C1070oOOo0o c1070oOOo0o = recyclerView.OooO0O0;
        try {
            recyclerView.Oooo();
            AbstractC1083oOOoO0o OooO = c1070oOOo0o.OooO(i, j);
            if (OooO != null) {
                if (OooO.OooO0oo() && !OooO.OooO()) {
                    c1070oOOo0o.OooO0o(OooO.OooO00o);
                } else {
                    c1070oOOo0o.OooO00o(OooO, false);
                }
            }
            recyclerView.OoooO00(false);
            return OooO;
        } catch (Throwable th) {
            recyclerView.OoooO00(false);
            throw th;
        }
    }

    public final void OooO00o(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.OooOOo0 && this.OooO0O0 == 0) {
            this.OooO0O0 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0671o0ooo0O c0671o0ooo0O = recyclerView.OoooOoo;
        c0671o0ooo0O.OooO00o = i;
        c0671o0ooo0O.OooO0O0 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(long j) {
        C0673o0ooo0o0 c0673o0ooo0o0;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        C0673o0ooo0o0 c0673o0ooo0o02;
        boolean z;
        ArrayList arrayList = this.OooO00o;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0671o0ooo0O c0671o0ooo0O = recyclerView3.OoooOoo;
                c0671o0ooo0O.OooO0OO(recyclerView3, false);
                i += c0671o0ooo0O.OooO0OO;
            }
        }
        ArrayList arrayList2 = this.OooO0Oo;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0671o0ooo0O c0671o0ooo0O2 = recyclerView4.OoooOoo;
                int abs = Math.abs(c0671o0ooo0O2.OooO0O0) + Math.abs(c0671o0ooo0O2.OooO00o);
                for (int i5 = 0; i5 < c0671o0ooo0O2.OooO0OO * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c0673o0ooo0o02 = obj;
                    } else {
                        c0673o0ooo0o02 = (C0673o0ooo0o0) arrayList2.get(i3);
                    }
                    int[] iArr = (int[]) c0671o0ooo0O2.OooO0Oo;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0673o0ooo0o02.OooO00o = z;
                    c0673o0ooo0o02.OooO0O0 = abs;
                    c0673o0ooo0o02.OooO0OO = i6;
                    c0673o0ooo0o02.OooO0Oo = recyclerView4;
                    c0673o0ooo0o02.OooO0o0 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, OooO0o);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0673o0ooo0o0 = (C0673o0ooo0o0) arrayList2.get(i7)).OooO0Oo) != null; i7++) {
            if (c0673o0ooo0o0.OooO00o) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            AbstractC1083oOOoO0o OooO0OO = OooO0OO(recyclerView, c0673o0ooo0o0.OooO0o0, j2);
            if (OooO0OO != null && OooO0OO.OooO0O0 != null && OooO0OO.OooO0oo() && !OooO0OO.OooO() && (recyclerView2 = (RecyclerView) OooO0OO.OooO0O0.get()) != null) {
                if (recyclerView2.OooOoOO && recyclerView2.OooO0o0.OooOooo() != 0) {
                    AbstractC1064oOOo0OOO abstractC1064oOOo0OOO = recyclerView2.Oooo0O0;
                    if (abstractC1064oOOo0OOO != null) {
                        abstractC1064oOOo0OOO.OooO0o0();
                    }
                    AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = recyclerView2.OooOOO0;
                    C1070oOOo0o c1070oOOo0o = recyclerView2.OooO0O0;
                    if (abstractC1066oOOo0Oo != null) {
                        abstractC1066oOOo0Oo.Oooooo(c1070oOOo0o);
                        recyclerView2.OooOOO0.OoooooO(c1070oOOo0o);
                    }
                    c1070oOOo0o.OooO00o.clear();
                    c1070oOOo0o.OooO0Oo();
                }
                C0671o0ooo0O c0671o0ooo0O3 = recyclerView2.OoooOoo;
                c0671o0ooo0O3.OooO0OO(recyclerView2, true);
                if (c0671o0ooo0O3.OooO0OO != 0) {
                    try {
                        int i8 = oo000000.OooO00o;
                        Trace.beginSection("RV Nested Prefetch");
                        C1080oOOoO0O c1080oOOoO0O = recyclerView2.Ooooo00;
                        AbstractC1061oOOo0O0O abstractC1061oOOo0O0O = recyclerView2.OooOO0o;
                        c1080oOOoO0O.OooO0Oo = 1;
                        c1080oOOoO0O.OooO0o0 = abstractC1061oOOo0O0O.OooO00o();
                        c1080oOOoO0O.OooO0oO = false;
                        c1080oOOoO0O.OooO0oo = false;
                        c1080oOOoO0O.OooO = false;
                        for (int i9 = 0; i9 < c0671o0ooo0O3.OooO0OO * 2; i9 += 2) {
                            OooO0OO(recyclerView2, ((int[]) c0671o0ooo0O3.OooO0Oo)[i9], j);
                        }
                        Trace.endSection();
                        c0673o0ooo0o0.OooO00o = false;
                        c0673o0ooo0o0.OooO0O0 = 0;
                        c0673o0ooo0o0.OooO0OO = 0;
                        c0673o0ooo0o0.OooO0Oo = null;
                        c0673o0ooo0o0.OooO0o0 = 0;
                    } catch (Throwable th) {
                        int i10 = oo000000.OooO00o;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0673o0ooo0o0.OooO00o = false;
            c0673o0ooo0o0.OooO0O0 = 0;
            c0673o0ooo0o0.OooO0OO = 0;
            c0673o0ooo0o0.OooO0Oo = null;
            c0673o0ooo0o0.OooO0o0 = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = oo000000.OooO00o;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.OooO00o;
            if (arrayList.isEmpty()) {
                this.OooO0O0 = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.OooO0O0 = 0L;
                Trace.endSection();
                return;
            }
            OooO0O0(TimeUnit.MILLISECONDS.toNanos(j) + this.OooO0OO);
            this.OooO0O0 = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.OooO0O0 = 0L;
            int i3 = oo000000.OooO00o;
            Trace.endSection();
            throw th;
        }
    }
}


