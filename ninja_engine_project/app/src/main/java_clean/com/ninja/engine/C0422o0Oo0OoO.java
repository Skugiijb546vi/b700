package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0Oo0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422o0Oo0OoO extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ AbstractC0429o0Oo0oOo OooO0O0;

    public /* synthetic */ C0422o0Oo0OoO(AbstractC0429o0Oo0oOo abstractC0429o0Oo0oOo, int i) {
        this.OooO00o = i;
        this.OooO0O0 = abstractC0429o0Oo0oOo;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.OooO00o;
        super.onAnimationEnd(animator);
        switch (i) {
            case 1:
                AbstractC0429o0Oo0oOo abstractC0429o0Oo0oOo = this.OooO0O0;
                abstractC0429o0Oo0oOo.setVisible(false, false);
                ArrayList arrayList = abstractC0429o0Oo0oOo.OooO0o;
                if (arrayList != null && !abstractC0429o0Oo0oOo.OooO0oO) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0291o0O00o0) it.next()).OooO00o(abstractC0429o0Oo0oOo);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.OooO00o;
        super.onAnimationStart(animator);
        switch (i) {
            case 0:
                AbstractC0429o0Oo0oOo abstractC0429o0Oo0oOo = this.OooO0O0;
                ArrayList arrayList = abstractC0429o0Oo0oOo.OooO0o;
                if (arrayList != null && !abstractC0429o0Oo0oOo.OooO0oO) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0291o0O00o0) it.next()).OooO0O0(abstractC0429o0Oo0oOo);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}


