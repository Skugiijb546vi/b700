package com.ninja.engine;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOOo00oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1058oOOo00oo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ RecyclerView OooO0O0;

    public /* synthetic */ RunnableC1058oOOo00oo(RecyclerView recyclerView, int i) {
        this.OooO00o = i;
        this.OooO0O0 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        long j;
        RecyclerView recyclerView3 = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                if (recyclerView3.OooOOoo && !recyclerView3.isLayoutRequested()) {
                    if (!recyclerView3.OooOOo0) {
                        recyclerView3.requestLayout();
                        return;
                    } else if (recyclerView3.OooOo0O) {
                        recyclerView3.OooOo0 = true;
                        return;
                    } else {
                        recyclerView3.OooOOO0();
                        return;
                    }
                }
                return;
            default:
                AbstractC1064oOOo0OOO abstractC1064oOOo0OOO = recyclerView3.Oooo0O0;
                if (abstractC1064oOOo0OOO != null) {
                    C0367o0OOOo0o c0367o0OOOo0o = (C0367o0OOOo0o) abstractC1064oOOo0OOO;
                    ArrayList arrayList = c0367o0OOOo0o.OooO0oo;
                    boolean z = !arrayList.isEmpty();
                    ArrayList arrayList2 = c0367o0OOOo0o.OooOO0;
                    boolean z2 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = c0367o0OOOo0o.OooOO0O;
                    boolean z3 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = c0367o0OOOo0o.OooO;
                    boolean z4 = !arrayList4.isEmpty();
                    if (!z && !z2 && !z4 && !z3) {
                        recyclerView2 = recyclerView3;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            recyclerView2 = recyclerView3;
                            long j2 = c0367o0OOOo0o.OooO0Oo;
                            if (hasNext) {
                                AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) it.next();
                                View view = abstractC1083oOOoO0o.OooO00o;
                                ViewPropertyAnimator animate = view.animate();
                                c0367o0OOOo0o.OooOOo0.add(abstractC1083oOOoO0o);
                                animate.setDuration(j2).alpha(0.0f).setListener(new C0360o0OOOOo(c0367o0OOOo0o, abstractC1083oOOoO0o, animate, view)).start();
                                recyclerView3 = recyclerView2;
                            } else {
                                arrayList.clear();
                                if (z2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0367o0OOOo0o.OooOOO0.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0359o0OOOOOo runnableC0359o0OOOOOo = new RunnableC0359o0OOOOOo(c0367o0OOOo0o, arrayList5, 0);
                                    if (z) {
                                        View view2 = ((C0366o0OOOo0O) arrayList5.get(0)).OooO00o.OooO00o;
                                        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                                        view2.postOnAnimationDelayed(runnableC0359o0OOOOOo, j2);
                                    } else {
                                        runnableC0359o0OOOOOo.run();
                                    }
                                }
                                if (z3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0367o0OOOo0o.OooOOO.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0359o0OOOOOo runnableC0359o0OOOOOo2 = new RunnableC0359o0OOOOOo(c0367o0OOOo0o, arrayList6, 1);
                                    if (z) {
                                        View view3 = ((C0364o0OOOo0) arrayList6.get(0)).OooO00o.OooO00o;
                                        WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
                                        view3.postOnAnimationDelayed(runnableC0359o0OOOOOo2, j2);
                                    } else {
                                        runnableC0359o0OOOOOo2.run();
                                    }
                                }
                                if (z4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0367o0OOOo0o.OooOO0o.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0359o0OOOOOo runnableC0359o0OOOOOo3 = new RunnableC0359o0OOOOOo(c0367o0OOOo0o, arrayList7, 2);
                                    if (!z && !z2 && !z3) {
                                        runnableC0359o0OOOOOo3.run();
                                    } else {
                                        long j3 = 0;
                                        if (!z) {
                                            j2 = 0;
                                        }
                                        if (z2) {
                                            j = c0367o0OOOo0o.OooO0o0;
                                        } else {
                                            j = 0;
                                        }
                                        if (z3) {
                                            j3 = c0367o0OOOo0o.OooO0o;
                                        }
                                        long max = Math.max(j, j3) + j2;
                                        View view4 = ((AbstractC1083oOOoO0o) arrayList7.get(0)).OooO00o;
                                        WeakHashMap weakHashMap3 = AbstractC1460oo0O00oo.OooO00o;
                                        view4.postOnAnimationDelayed(runnableC0359o0OOOOOo3, max);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.Oooooo = false;
                return;
        }
    }
}


