package com.ninja.engine;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oo00oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617o0oo00oo implements Transition.TransitionListener {
    public final /* synthetic */ View OooO00o;
    public final /* synthetic */ ArrayList OooO0O0;

    public C0617o0oo00oo(View view, ArrayList arrayList) {
        this.OooO00o = view;
        this.OooO0O0 = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.OooO00o.setVisibility(8);
        ArrayList arrayList = this.OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
