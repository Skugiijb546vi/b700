package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oo0000oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC1360oo0000oo implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public AbstractC1358oo0000o0 OooO00o;
    public ViewGroup OooO0O0;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e0 A[EDGE_INSN: B:133:0x01e0->B:89:0x01e0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.ViewTreeObserver$OnPreDrawListenerC1360oo0000oo.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.OooO0O0;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC1349oo000.OooO0OO;
        ViewGroup viewGroup2 = this.OooO0O0;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) AbstractC1349oo000.OooO0O0().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC1358oo0000o0) it.next()).OooOoOO(viewGroup2);
            }
        }
        this.OooO00o.OooOO0(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
