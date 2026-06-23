package com.ninja.engine;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0OOOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0359o0OOOOOo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ ArrayList OooO0O0;
    public final /* synthetic */ C0367o0OOOo0o OooO0OO;

    public /* synthetic */ RunnableC0359o0OOOOOo(C0367o0OOOo0o c0367o0OOOo0o, ArrayList arrayList, int i) {
        this.OooO00o = i;
        this.OooO0OO = c0367o0OOOo0o;
        this.OooO0O0 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        Iterator it;
        switch (this.OooO00o) {
            case 0:
                ArrayList arrayList = this.OooO0O0;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0367o0OOOo0o c0367o0OOOo0o = this.OooO0OO;
                    if (hasNext) {
                        C0366o0OOOo0O c0366o0OOOo0O = (C0366o0OOOo0O) it2.next();
                        AbstractC1083oOOoO0o abstractC1083oOOoO0o = c0366o0OOOo0O.OooO00o;
                        c0367o0OOOo0o.getClass();
                        View view3 = abstractC1083oOOoO0o.OooO00o;
                        int i = c0366o0OOOo0O.OooO0Oo - c0366o0OOOo0O.OooO0O0;
                        int i2 = c0366o0OOOo0O.OooO0o0 - c0366o0OOOo0O.OooO0OO;
                        if (i != 0) {
                            view3.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view3.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view3.animate();
                        c0367o0OOOo0o.OooOOOo.add(abstractC1083oOOoO0o);
                        animate.setDuration(c0367o0OOOo0o.OooO0o0).setListener(new C0362o0OOOOoo(c0367o0OOOo0o, abstractC1083oOOoO0o, i, view3, i2, animate)).start();
                    } else {
                        arrayList.clear();
                        c0367o0OOOo0o.OooOOO0.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.OooO0O0;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0367o0OOOo0o c0367o0OOOo0o2 = this.OooO0OO;
                    if (hasNext2) {
                        C0364o0OOOo0 c0364o0OOOo0 = (C0364o0OOOo0) it3.next();
                        c0367o0OOOo0o2.getClass();
                        AbstractC1083oOOoO0o abstractC1083oOOoO0o2 = c0364o0OOOo0.OooO00o;
                        if (abstractC1083oOOoO0o2 == null) {
                            view = null;
                        } else {
                            view = abstractC1083oOOoO0o2.OooO00o;
                        }
                        AbstractC1083oOOoO0o abstractC1083oOOoO0o3 = c0364o0OOOo0.OooO0O0;
                        if (abstractC1083oOOoO0o3 != null) {
                            view2 = abstractC1083oOOoO0o3.OooO00o;
                        } else {
                            view2 = null;
                        }
                        ArrayList arrayList3 = c0367o0OOOo0o2.OooOOo;
                        long j = c0367o0OOOo0o2.OooO0o;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList3.add(c0364o0OOOo0.OooO00o);
                            duration.translationX(c0364o0OOOo0.OooO0o0 - c0364o0OOOo0.OooO0OO);
                            duration.translationY(c0364o0OOOo0.OooO0o - c0364o0OOOo0.OooO0Oo);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0365o0OOOo00(c0367o0OOOo0o2, c0364o0OOOo0, duration, view, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view2 != null) {
                            ViewPropertyAnimator animate2 = view2.animate();
                            arrayList3.add(c0364o0OOOo0.OooO0O0);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0365o0OOOo00(c0367o0OOOo0o2, c0364o0OOOo0, animate2, view2, 1)).start();
                        }
                        it3 = it;
                    } else {
                        arrayList2.clear();
                        c0367o0OOOo0o2.OooOOO.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.OooO0O0;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0367o0OOOo0o c0367o0OOOo0o3 = this.OooO0OO;
                    if (hasNext3) {
                        AbstractC1083oOOoO0o abstractC1083oOOoO0o4 = (AbstractC1083oOOoO0o) it4.next();
                        c0367o0OOOo0o3.getClass();
                        View view4 = abstractC1083oOOoO0o4.OooO00o;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0367o0OOOo0o3.OooOOOO.add(abstractC1083oOOoO0o4);
                        animate3.alpha(1.0f).setDuration(c0367o0OOOo0o3.OooO0OO).setListener(new C0360o0OOOOo(c0367o0OOOo0o3, abstractC1083oOOoO0o4, view4, animate3)).start();
                    } else {
                        arrayList4.clear();
                        c0367o0OOOo0o3.OooOO0o.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
