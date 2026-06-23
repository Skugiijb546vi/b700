package com.ninja.engine;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oo000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1349oo000 {
    public static final o00OOOO0 OooO00o = new o00OOOO0();
    public static final ThreadLocal OooO0O0 = new ThreadLocal();
    public static final ArrayList OooO0OO = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, com.ninja.engine.oo0000oo, android.view.View$OnAttachStateChangeListener] */
    public static void OooO00o(ViewGroup viewGroup, AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        ArrayList arrayList = OooO0OO;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (abstractC1358oo0000o0 == null) {
                abstractC1358oo0000o0 = OooO00o;
            }
            AbstractC1358oo0000o0 clone = abstractC1358oo0000o0.clone();
            ArrayList arrayList2 = (ArrayList) OooO0O0().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1358oo0000o0) it.next()).OooOo(viewGroup);
                }
            }
            clone.OooO(viewGroup, true);
            AbstractC1230oOoOo0o.OooOO0O(viewGroup.getTag(R.id.transition_current_scene));
            viewGroup.setTag(R.id.transition_current_scene, null);
            Object obj = new Object();
            obj.OooO00o = clone;
            obj.OooO0O0 = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ninja.engine.o00OO0oO, java.lang.Object, com.ninja.engine.oOoOOoo] */
    public static C0145o00OO0oO OooO0O0() {
        C0145o00OO0oO c0145o00OO0oO;
        ThreadLocal threadLocal = OooO0O0;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0145o00OO0oO = (C0145o00OO0oO) weakReference.get()) != null) {
            return c0145o00OO0oO;
        }
        C1218oOoOOoo c1218oOoOOoo = new C1218oOoOOoo();
        threadLocal.set(new WeakReference(c1218oOoOOoo));
        return c1218oOoOOoo;
    }
}

