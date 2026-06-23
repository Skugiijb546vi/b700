package com.ninja.engine;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o0OOo000 {
    public final ViewGroup OooO00o;
    public final ArrayList OooO0O0 = new ArrayList();
    public final ArrayList OooO0OO = new ArrayList();
    public boolean OooO0Oo = false;
    public boolean OooO0o0 = false;

    public o0OOo000(ViewGroup viewGroup) {
        this.OooO00o = viewGroup;
    }

    public static void OooO00o(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    OooO00o(childAt, arrayList);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static o0OOo000 OooO0oO(ViewGroup viewGroup, C0601o0oOooO0 c0601o0oOooO0) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof o0OOo000) {
            return (o0OOo000) tag;
        }
        c0601o0oOooO0.getClass();
        o0OOo000 o0ooo000 = new o0OOo000(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, o0ooo000);
        return o0ooo000;
    }

    public final void OooO() {
        Iterator it = this.OooO0O0.iterator();
        while (it.hasNext()) {
            C1237oOoOoO0O c1237oOoOoO0O = (C1237oOoOoO0O) it.next();
            if (c1237oOoOoO0O.OooO0O0 == 2) {
                c1237oOoOoO0O.OooO0OO(AbstractC1230oOoOo0o.OooO0O0(c1237oOoOoO0O.OooO0OO.Oooo00o().getVisibility()), 1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ninja.engine.o00ooOOo, java.lang.Object] */
    public final void OooO0O0(int i, int i2, androidx.fragment.app.OooO00o oooO00o) {
        synchronized (this.OooO0O0) {
            try {
                ?? obj = new Object();
                C1237oOoOoO0O OooO0o0 = OooO0o0(oooO00o.OooO0OO);
                if (OooO0o0 != null) {
                    OooO0o0.OooO0OO(i, i2);
                    return;
                }
                C1237oOoOoO0O c1237oOoOoO0O = new C1237oOoOoO0O(i, i2, oooO00o, obj);
                this.OooO0O0.add(c1237oOoOoO0O);
                c1237oOoOoO0O.OooO0Oo.add(new RunnableC1235oOoOoO0(this, c1237oOoOoO0O, 0));
                c1237oOoOoO0O.OooO0Oo.add(new RunnableC1235oOoOoO0(this, c1237oOoOoO0O, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ea, code lost:
        if (android.util.Log.isLoggable("FragmentManager", 2) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ec, code lost:
        java.util.Objects.toString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ef, code lost:
        r1.OooO0o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f9, code lost:
        if (android.util.Log.isLoggable("FragmentManager", 2) != false) goto L120;
     */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.ninja.engine.o00ooOOo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, com.ninja.engine.o000o0o, com.ninja.engine.o0OOOooO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(java.util.ArrayList r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0OOo000.OooO0OO(java.util.ArrayList, boolean):void");
    }

    public final void OooO0Oo() {
        if (this.OooO0o0) {
            return;
        }
        ViewGroup viewGroup = this.OooO00o;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (!viewGroup.isAttachedToWindow()) {
            OooO0o();
            this.OooO0Oo = false;
            return;
        }
        synchronized (this.OooO0O0) {
            try {
                if (!this.OooO0O0.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.OooO0OO);
                    this.OooO0OO.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1237oOoOoO0O c1237oOoOoO0O = (C1237oOoOoO0O) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(c1237oOoOoO0O);
                        }
                        c1237oOoOoO0O.OooO00o();
                        if (!c1237oOoOoO0O.OooO0oO) {
                            this.OooO0OO.add(c1237oOoOoO0O);
                        }
                    }
                    OooO();
                    ArrayList arrayList2 = new ArrayList(this.OooO0O0);
                    this.OooO0O0.clear();
                    this.OooO0OO.addAll(arrayList2);
                    Log.isLoggable("FragmentManager", 2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C1237oOoOoO0O) it2.next()).OooO0Oo();
                    }
                    OooO0OO(arrayList2, this.OooO0Oo);
                    this.OooO0Oo = false;
                    Log.isLoggable("FragmentManager", 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o() {
        Log.isLoggable("FragmentManager", 2);
        ViewGroup viewGroup = this.OooO00o;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.OooO0O0) {
            try {
                OooO();
                Iterator it = this.OooO0O0.iterator();
                while (it.hasNext()) {
                    ((C1237oOoOoO0O) it.next()).OooO0Oo();
                }
                Iterator it2 = new ArrayList(this.OooO0OO).iterator();
                while (it2.hasNext()) {
                    C1237oOoOoO0O c1237oOoOoO0O = (C1237oOoOoO0O) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.OooO00o);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(c1237oOoOoO0O);
                    }
                    c1237oOoOoO0O.OooO00o();
                }
                Iterator it3 = new ArrayList(this.OooO0O0).iterator();
                while (it3.hasNext()) {
                    C1237oOoOoO0O c1237oOoOoO0O2 = (C1237oOoOoO0O) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.OooO00o);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(c1237oOoOoO0O2);
                    }
                    c1237oOoOoO0O2.OooO00o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1237oOoOoO0O OooO0o0(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        Iterator it = this.OooO0O0.iterator();
        while (it.hasNext()) {
            C1237oOoOoO0O c1237oOoOoO0O = (C1237oOoOoO0O) it.next();
            if (c1237oOoOoO0O.OooO0OO.equals(abstractComponentCallbacksC0593o0oOoOo0) && !c1237oOoOoO0O.OooO0o) {
                return c1237oOoOoO0O;
            }
        }
        return null;
    }

    public final void OooO0oo() {
        synchronized (this.OooO0O0) {
            try {
                OooO();
                this.OooO0o0 = false;
                int size = this.OooO0O0.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    C1237oOoOoO0O c1237oOoOoO0O = (C1237oOoOoO0O) this.OooO0O0.get(size);
                    int OooO0OO = AbstractC1230oOoOo0o.OooO0OO(c1237oOoOoO0O.OooO0OO.OooOooo);
                    if (c1237oOoOoO0O.OooO00o == 2 && OooO0OO != 2) {
                        C0586o0oOoO0 c0586o0oOoO0 = c1237oOoOoO0O.OooO0OO.Oooo00o;
                        this.OooO0o0 = false;
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
